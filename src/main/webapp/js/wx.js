/**
 * Created by yanglin on 2017/1/7.
 */

// 1 监听“分享给朋友”，按钮点击、自定义分享内容及分享结果接口
wechatonMenuShareAppMessage = function (title,link,imgUrl,desc){
    wx.onMenuShareAppMessage({
        title: title,
        desc: desc,
        link: link,
        imgUrl: imgUrl,
        trigger: function (res) {
            console.log('用户点击发送给朋友');
        },
        success: function (res) {
            alert("分享成功");
            sharePageAdapter("appMessage");
        },
        cancel: function (res) {
            console.log('已取消');
        },
        fail: function (res) {
            alert("操作失败");
        }
    });
}
// 2 监听“分享到朋友圈”按钮点击、自定义分享内容及分享结果接口
wechatonMenuShareTimeline = function (title,link,imgUrl,desc) {
    wx.onMenuShareTimeline({
        title: title,
        desc: desc,
        link: link,
        imgUrl: imgUrl,
        trigger: function (res) {
            console.log('分享到朋友圈');
        },
        success: function (res) {
            alert("分享成功");
            sharePageAdapter("timeLine");
        },
        cancel: function (res) {
            console.log('已取消');
        },
        fail: function (res) {
            alert("操作失败");
        }
    });
}

// 3 监听“分享到QQ”按钮点击、自定义分享内容及分享结果接口
wechatonMenuShareQQ = function (title,link,imgUrl,desc) {
    wx.onMenuShareQQ({
        title: title,
        desc: desc,
        link: link,
        imgUrl: imgUrl,
        trigger: function (res) {
            console.log('用户点击分享到QQ');
        },
        success: function (res) {
            alert("分享成功");
            sharePageAdapter("QQ");
        },
        cancel: function (res) {
            console.log('已取消');
        },
        fail: function (res) {
            alert("操作失败");
        }
    });
}
// 4 监听“分享到微博”按钮点击、自定义分享内容及分享结果接口
wechatonMenuShareWeibo = function (title,link,imgUrl,desc) {
    wx.onMenuShareWeibo({
        title: title,
        desc: desc,
        link: link,
        imgUrl: imgUrl,
        trigger: function (res) {
            console.log('用户点击分享到微博');
        },
        success: function (res) {
            alert("分享成功");
            sharePageAdapter("weibo");
        },
        cancel: function (res) {
            console.log('已取消');
        },
        fail: function (res) {
            alert("操作失败");
        }
    });
}
// 5 监听“分享到qq空间”按钮点击、自定义分享内容及分享结果接口
wechatonMenuShareQZone = function (title,link,imgUrl,desc) {
    wx.onMenuShareQZone({
        title: title,
        desc: desc,
        link: link,
        imgUrl: imgUrl,
        trigger: function (res) {
            console.log('用户点击分享到qq空间');
        },
        success: function (res) {
            alert("分享成功");
            sharePageAdapter("QZone");
        },
        cancel: function (res) {
            console.log('已取消');
        },
        fail: function (res) {
            alert("操作失败");
        }
    });
}

$(document).ready(function () {
    var baseUrl = $("#baseUrl").attr("href");
    //文档加载成功后使用ajax来获取配置参数
    $.ajax({
        url: '/wechatService/getTicket/signature1',
        async: false,
        type: 'POST',
        data : {
            "url" : window.location.href
        },
        cache : false,
        dataType : 'json',
        success: function (data) {
            wx.config({
                debug: false,
                appId: data.appId,
                timestamp: data.timestamp,
                nonceStr: data.nonceStr,
                signature: data.signature,
                jsApiList: [
                    'checkJsApi',
                    'onMenuShareTimeline',
                    'onMenuShareAppMessage',
                    'onMenuShareQQ',
                    'onMenuShareWeibo',
                    'onMenuShareQZone',
                    'chooseImage',
                    'previewImage',
                    'uploadImage',
                    'downloadImage',
                ]
            });
            wx.error(function (res) {
                console.log(res.errMsg);
            });

            wx.ready(function () {
                wx.checkJsApi({
                    jsApiList: [
                        'checkJsApi',
                        'previewImage',
                        'onMenuShareTimeline',
                        'onMenuShareAppMessage',
                        'onMenuShareQQ',
                        'onMenuShareWeibo',
                        'onMenuShareQZone'
                    ],
                    success: function (res) {
                        var title = "gakki";
                        var link = "http://wxzty.tunnel.2bdata.com/wechatService/testShare";
                        var imgUrl = baseUrl+"img/1.jpg";
                        var desc = "gakki是最美的女星";
                        // 分享接口
                        wechatonMenuShareAppMessage(title,link,imgUrl,desc);
                        wechatonMenuShareTimeline(title,link,imgUrl,desc);
                        wechatonMenuShareQQ(title,link,imgUrl,desc);
                        wechatonMenuShareWeibo(title,link,imgUrl,desc);
                        wechatonMenuShareQZone(title,link,imgUrl,desc);
                    }
                });
                // 5 图片接口
                // 5.1 拍照、本地选图
                var images = {
                    localId: [],//本地，可以用于在页面上显示
                    serverId: []//服务器上的，上传之后才有
                };
                document.querySelector('#chooseImage').onclick = function () {
                    wx.chooseImage({
                        count:3,//上传3张
                        success: function (res) {
                            images.localId = res.localIds;
                            alert('已选择 ' + res.localIds.length + ' 张图片');
                            $("#img1").attr("src",images.localId[0]);
                            $("#img2").attr("src",images.localId[1]);
                            $("#img3").attr("src",images.localId[2]);

                        }
                    });
                };

                // 5.3 上传图片
                document.querySelector('#uploadImage').onclick = function () {
                    if (images.localId.length == 0) {
                        alert('请先使用选择图片');
                        return;
                    }
                    var i = 0, length = images.localId.length;
                    images.serverId = [];
                    var openId = $("#openId").val();
                    console.info(openId);
                    function upload() {
                        wx.uploadImage({
                            localId: images.localId[i],
                            success: function (res) {
                                i++;
                                images.serverId.push(res.serverId);
                                if (i < length) {
                                    upload();
                                }else {
                                    var data =JSON.stringify({
                                        imgs:images.serverId,
                                        mediaType:'image',
                                        openid:openId
                                    });
                                    console.log(data);
                                    $.ajax({
                                        url:'/wechatService/wxUpload/saveImg',
                                        type: 'POST',
                                        contentType:'application/json;charset=utf-8',
                                        data : data,
                                        dataType : 'json',
                                        success:function (data) {
                                            console.log(data)
                                        },
                                        error:function (res) {
                                            console.log(res)
                                        }
                                    })
                                }
                            },
                            fail: function (res) {
                                alert(JSON.stringify(res));
                            }
                        });
                    }
                    upload();
                };
                // 5.4 下载图片
                document.querySelector('#downloadImage').onclick = function () {
                    if (images.serverId.length === 0) {
                        alert('请先上传图片');
                        return;
                    }
                    var i = 0, length = images.serverId.length;
                    images.localId = [];
                    function download() {
                        wx.downloadImage({
                            serverId: images.serverId[i],
                            success: function (res) {
                                i++;
                                alert('已下载：' + i + '/' + length);
                                images.localId.push(res.localId);
                                if (i < length) {
                                    download();
                                }
                            }
                        });
                    }
                    download();
                };
            });
        },
        error: function (e) {
            alert("错误");
            console.log(e);
        }
    });

});

//统计分享
sharePage = function (contentId,openId,shareType) {
    var s = JSON.stringify({
        shareType:shareType,
        contentId:contentId,
        openId:openId
    });
    console.log(s);
    $.ajax({
        url: '/wechatService/shareCount/count',
        type: 'POST',
        contentType:'application/json;charset=utf-8',
        data : s,
        dataType : 'json',
        success:function (data) {
            console.log(data)
        },
        error:function (res) {
            console.log(res)
        }
    })
}

sharePageAdapter = function (shareType) {
    var commentId = parseInt($("#commentId").val());
    var openId = $("#openId").val();
    sharePage(commentId,openId,shareType);
}