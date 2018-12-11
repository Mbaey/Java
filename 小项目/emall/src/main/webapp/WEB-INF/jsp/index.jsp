<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>天猫tmall.com--上天猫，就够了</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
    <meta name="keywords" content="线上购物，综合性购物平台，正品保障，服饰鞋包，美妆护肤，家电数码，时尚大牌，母婴玩具，家具建材">
    <meta name="description" content="天猫 -  中国线上购物的网站，亚洲超大的综合性购物平台，2000品类，70000个品牌，正品保障，全新一站式购物体验。涵盖服饰鞋包，美妆护肤，家电数码，时尚大牌，母婴玩具，家具建材等品类，提供优质的品牌商品和服务,为消费者带来全方位的生活时尚！ ">
    <link rel="shortcut icon" type="image/x-icon" href="img/favicon.ico">
    <link rel="stylesheet" type="text/css" href="css/main.css">

    <!--<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">-->
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <!--<script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>-->
</head>
<body>
<!-- site-nav -->
<div id="site-nav">
    <div class="container sn-container">
        <p class="login-info default">
            <em>喵，欢迎来到天猫</em>
            <a href="login.html" target="_top">请登录</a>
            <a href="register.html" target="_top">免费注册</a>
        </p>
        <p class="login-info logged">
            <em>Hi,<a class="vip-name" href="#"><i class="iconfont sn-icon">&#xe60f;</i></a></em>
            <a href="login.html" target="_top">积分<span class="score count"></span></a>
            <a href="register.html" target="_top">消息<span id="message" class="count"></span></a>
            <a href="php/logout.php">退出</a>
        </p>
        <ul class="sn-quick-menu">
            <li class="sn-mytaobao menu-item">
                <a href="#">我的淘宝 <b class="triangle "></b> </a>
                <ul class="sub-menu">
                    <li>
                        <a href="#" target="_top">已买到的宝贝</a>
                    </li>
                    <li>
                        <a href="#" target="_top">已卖出的宝贝</a>
                    </li>
                </ul>
            </li>
            <li class="sn-mybrand">
                <i class="iconfont sn-icon">&#xe60f;</i>
                <a href="#" target="_top">我关注的品牌</a>
            </li>
            <li class="sn-cart default">
                <i class="iconfont sn-icon">&#xe628;</i>
                <a href="#" target="_top">购物车</a>
            </li>
            <li class="sn-cart logged">
                <i class="iconfont sn-icon">&#xe628;</i>
                <a href="#" target="_top">购物车
                    <span  class="cart-count count"></span> 件
                </a>
            </li>
            <li class="sn-favorite menu-item">
                <a href="#">收藏夹 <b class="triangle"></b> </a>
                <ul class="sub-menu">
                    <li>
                        <a href="#" target="_top">收藏的宝贝</a>
                    </li>
                    <li>
                        <a href="#" target="_top">收藏的店铺</a>
                    </li>
                </ul>
            </li>
            <li class="sn-separator">|</li>
            <li class="sn-mobile">
                <i class="iconfont sn-icon">&#xe61d;</i>
                <a href="#" target="_top" title="天猫无线">手机版</a>
                <div class="sn-qrcode">
                    <div class="sn-qrcode-content"></div>
                    <p>扫一扫，定制我的天猫！</p>
                    <b class="triangle"></b>
                </div>
            </li>
            <li>
                <a href="#">淘宝网</a>
            </li>
            <li>
                <a href="#">企业采购</a>
            </li>
            <li class="sn-seller menu-item">
                <a href="#" target="_top">商家支持 <b class="triangle"></b></a>
                <ul class="sub-menu">
                    <li>
                        <h3>商家：</h3>
                        <a href="#" target="_top">商家中心</a>
                        <a href="#" target="_top">商家入驻</a>
                        <a href="#" target="_top">运营服务</a>
                        <a href="#" target="_top">商家品控</a>
                        <a href="#" target="_top">商家工具</a>
                        <a href="#" target="_top">商家规则</a>
                        <a href="#" target="_top">商家智库</a>
                        <a href="#" target="_top">喵言喵语</a>
                    </li>
                    <li>
                        <h3>帮助</h3>
                        <a href="#" target="_top">帮助中心</a>
                    </li>
                </ul>
            </li>
            <li class="sn-sitemap menu-item">
                <i class="iconfont sn-icon">&#xe613;</i>
                <a href="#" target="_top">网站导航 <b class="triangle"></b></a>
                <div class="sub-menu">
                    <div class="site-hot">
                        <h2>热点推荐 <span>Hot</span></h2>
                        <ul class="site-list">
                            <li><a href="#">天猫超市</a></li>
                            <li><a href="#">喵鲜生</a></li>
                            <li><a href="#">科技新品<i class="sn-sitemap-icon sn-sitemap-icon-new"></i></a></li>
                            <li><a href="#">女装新品<i class="sn-sitemap-icon sn-sitemap-icon-hot"></i></a></li>
                            <li><a href="#">玩街</a></li>
                            <li><a href="#">内衣新品<i class="sn-sitemap-icon sn-sitemap-icon-hot"></i></a></li>
                            <li><a href="#">试美妆</a></li>
                            <li><a href="#">运动新品</a></li>
                            <li><a href="#">时尚先生<i class="sn-sitemap-icon sn-sitemap-icon-hot"></i></a></li>
                            <li><a href="#">精明妈咪</a></li>
                            <li><a href="#">吃乐会<i class="sn-sitemap-icon sn-sitemap-icon-new"></i></a></li>
                            <li><a href="#">企业采购</a></li>
                            <li><a href="#">会员积分</a></li>
                            <li><a href="#">天猫国际</a></li>
                        </ul>
                    </div>
                    <div class="site-market">
                        <h2>行业市场 <span>Market</span></h2>
                        <ul class="site-list">
                            <li><a href="#">美妆</a></li>
                            <li><a href="#">电器</a></li>
                            <li><a href="#">女装<i class="sn-sitemap-icon sn-sitemap-icon-hot"></i></a></li>
                            <li><a href="#">男装<i class="sn-sitemap-icon sn-sitemap-icon-hot"></i></a></li>
                            <li><a href="#">女鞋</a></li>
                            <li><a href="#">男鞋</a></li>
                            <li><a href="#">内衣<i class="sn-sitemap-icon sn-sitemap-icon-hot"></i></a></li>
                            <li><a href="#">箱包</a></li>
                            <li><a href="#">运动</a></li>
                            <li><a href="#">母婴</a></li>
                            <li><a href="#">家装</a></li>
                            <li><a href="#">医药</a></li>
                            <li><a href="#">食品</a></li>
                            <li><a href="#">配饰<i class="sn-sitemap-icon sn-sitemap-icon-new"></i></a></li>
                            <li><a href="#">汽车</a></li>
                        </ul>
                    </div>
                    <div class="site-brand">
                        <h2>品牌风尚 <span>Brand</span></h2>
                        <ul class="site-list">
                            <li><a href="#">尚天猫</a></li>
                            <li><a href="#">大牌街</a></li>
                            <li><a href="#">潮牌街</a></li>
                            <li><a href="#">天猫原创</a></li>
                            <li><a href="#">什么牌子好</a></li>
                        </ul>
                    </div>
                    <div class="site-help">
                        <h2>服务指南 <span>Help</span></h2>
                        <ul class="site-list">
                            <li><a href="#">帮助中心</a></li>
                            <li><a href="#">品质保障</a></li>
                            <li><a href="#">特色服务</a></li>
                            <li><a href="#">七天退换货</a></li>
                        </ul>
                    </div>
                </div>
            </li>
        </ul>
    </div>
</div><!-- end site-nav -->
<!-- <header -->
<div id="header">
    <div class="container hd-container clear">
        <h1 class="hd-logo">
            <a href="index.html"><img width="240px" height="130px" src="img/logo.gif" title="天猫tmall.com" alt="tmall"></a>
        </h1>
        <div class="hd-extra form">
            <div class="hd-search">
                <form method="post" action="#" id="search">
                    <fieldset>
                        <legend>天猫搜索</legend>
                        <input type="text" name="search-box" value="精选单品 惊艳一夏" title="请输入搜索内容">
                        <input type="submit" name="search-btn" value="搜索">
                    </fieldset>
                </form>
                <ul class="hd-hot-key">
                    <li><a href="#">沙滩裙</a></li>
                    <li class="key-highlight"><a href="#">电风扇</a></li>
                    <li><a href="#">短裤男</a></li>
                    <li class="key-highlight"><a href="#">凉鞋</a></li>
                    <li><a href="#">泳衣</a></li>
                    <li class="key-highlight"><a href="#">伞</a></li>
                    <li><a href="#">蚊帐</a></li>
                    <li class="key-highlight"><a href="#">空调</a></li>
                    <li><a href="#">防晒衣</a></li>
                    <li class="key-highlight last"><a href="#">双肩包</a></li>
                </ul>
            </div>
            <ul class="search-tip">
            </ul>
        </div>
    </div>
</div><!-- end header -->
<!-- content -->
<div id="content">
    <!-- main-nav -->
    <div id="main-nav"><!-- 控制导航背景宽度100% -->
        <ul class="clear">
            <li>
                <a href="#">
                    <img src="img/tmchaoshi.png" alt="天猫超市">
                    <span class="hover-pic"></span>
                </a>
            </li>
            <li>
                <a href="#">
                    <img src="img/tmguoji.png" alt="天猫国际">
                    <span class="hover-pic"></span>
                </a>
            </li>
            <li>
                <a href="#">
                    天猫会员
                    <span class="hover-pic"></span>
                </a>
            </li>
            <li>
                <a href="#">
                    品牌街
                    <span class="hover-pic"></span>
                </a>
            </li>
            <li>
                <a href="#">
                    电器城
                    <span class="hover-pic"></span>
                </a>
            </li>
            <li>
                <a href="#">
                    喵鲜生
                    <span class="hover-pic"></span>
                </a>
            </li>
            <li>
                <a href="#">
                    医药馆
                    <span class="hover-pic"></span>
                </a>
            </li>
            <li>
                <a href="#">
                    营业厅
                    <span class="hover-pic"></span>
                </a>
            </li>
            <li>
                <a href="#">
                    魅力惠
                    <span class="hover-pic"></span>
                </a>
            </li>
            <li>
                <a href="#">
                    阿里旅行
                    <span class="hover-pic"></span>
                </a>
            </li>
        </ul>
    </div><!-- end main-nav -->
    <!-- catagory -->
    <div id="category">
        <div class="cg-content">
            <div class="cg-title">
                <i class="iconfont">&#xe636;</i>
                <h2>商品分类</h2>
            </div>
            <ul class="cg-tab" id="cg-tab">
                <li class="nav-item nav-item0" data-color="#e54077">
                    <i class="iconfont nav-item-icon">&#xe607;</i>
                    <a href="#">女装/</a><a href="#">内衣</a>
                </li>
                <li class="nav-item nav-item1" data-color="#427def">
                    <i class="iconfont nav-item-icon">&#xe60e;</i>
                    <a href="#">男装/</a><a href="#">运动户外</a>
                </li>
                <li class="nav-item nav-item2" data-color="#6347ed">
                    <i class="iconfont nav-item-icon">&#xe600;</i>
                    <a href="#">女鞋/</a><a href="#">男鞋/</a><a href="#">箱包</a>
                </li>
                <li class="nav-item nav-item3" data-color="#e54077">
                    <i class="iconfont nav-item-icon">&#xe608;</i>
                    <a href="#">化妆品/</a><a href="#">个人护理</a>
                </li>
                <li class="nav-item nav-item4" data-color="#6347ed">
                    <i class="iconfont nav-item-icon">&#xe601;</i>
                    <a href="#">腕表/</a><a href="#">珠宝饰品/</a><a href="#">眼镜</a>
                </li>
                <li class="nav-item nav-item5" data-color="#427def">
                    <i class="iconfont nav-item-icon">&#xe606;</i>
                    <a href="#">手机/</a><a href="#">数码/</a><a href="#">电脑办公</a>
                </li>
                <li class="nav-item nav-item6" data-color="#fa5c5c">
                    <i class="iconfont nav-item-icon">&#xe605;</i>
                    <a href="#">母婴玩具</a>
                </li>
                <li class="nav-item nav-item7" data-color="#f7a831">
                    <i class="iconfont nav-item-icon">&#xe604;</i>
                    <a href="#">零食/</a><a href="#">进口食品/</a><a href="#">茶酒</a>
                </li>
                <li class="nav-item nav-item8" data-color="#f7a831">
                    <i class="iconfont nav-item-icon">&#xe623;</i>
                    <a href="#">生鲜水果</a>
                </li>
                <li class="nav-item nav-item9" data-color="#427def">
                    <i class="iconfont nav-item-icon">&#xe603;</i>
                    <a href="#">大家电/</a><a href="#">生活电器</a>
                </li>
                <li class="nav-item nav-item10" data-color="#dd2727">
                    <i class="iconfont nav-item-icon">&#xe602;</i>
                    <a href="#">家具器材</a>
                </li>
                <li class="nav-item nav-item11" data-color="#427def">
                    <i class="iconfont nav-item-icon">&#xe609;</i>
                    <a href="#">汽车/</a><a href="#">配件/</a><a href="#">用品</a>
                </li>
                <li class="nav-item nav-item12" data-color="#f7a831">
                    <i class="iconfont nav-item-icon">&#xe60a;</i>
                    <a href="#">家纺/</a><a href="#">家饰/</a><a href="#">鲜花</a>
                </li>
                <li class="nav-item nav-item13" data-color="#3bc7b0">
                    <i class="iconfont nav-item-icon">&#xe60c;</i>
                    <a href="#">医药保健</a>
                </li>
                <li class="nav-item nav-item14" data-color="#dd2727">
                    <i class="iconfont nav-item-icon">&#xe60b;</i>
                    <a href="#">厨具/</a><a href="#">收纳/</a><a href="#">宠物</a>
                </li>
                <li class="nav-item nav-item15" data-color="#3bc7b0">
                    <i class="iconfont nav-item-icon">&#xe60d;</i>
                    <a href="#">图书音像</a>
                </li>
            </ul>
        </div><!-- end cg-content -->

        <div class="cg-detail" id="cg-detail">
            <div class="detail detail0 clear">
                <div class="detail-word">
                    <div class="hot-word-line clear">
                        <h3>
                            <span>当季流行</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">女士新品</a>
                            <a href="#">短袖T恤</a>
                            <a class="highlight" href="#">时尚套装</a>
                            <a href="#">女装商场同款</a>
                            <a href="#">内衣夏季新品</a>
                            <a class="highlight" href="#">内衣商场同款</a>
                            <a href="#">睡衣套装</a>
                            <a class="highlight" href="#">情侣家居服</a>
                            <a href="#">丝袜</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>精选上衣</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">T恤</a>
                            <a href="#">衬衫</a>
                            <a class="highlight" href="#">雪纺衫</a>
                            <a href="#">针织衫</a>
                            <a href="#">短外套</a>
                            <a class="highlight" href="#">吊带背心</a>
                            <a href="#">卫衣</a>
                            <a class="highlight" href="#">小西装</a>
                            <a href="#">风衣</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>浪漫裙装</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">连衣裙</a>
                            <a href="#">蕾丝连衣裙</a>
                            <a class="highlight" href="#">印花连衣裙</a>
                            <a href="#">真丝连衣裙</a>
                            <a href="#">半身裙</a>
                            <a class="highlight" href="#">百褶裙</a>
                            <a href="#">牛仔裙</a>
                            <a class="highlight" href="#">背心裙</a>
                            <a href="#">A字裙</a>
                            <a href="#">棉麻连衣裙</a>
                            <a class="highlight" href="#">蕾丝半身裙</a>
                            <a href="#">包臀裙</a>
                            <a href="#">长袖连衣裙</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>女士夏装</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">休闲裤</a>
                            <a class="highlight" href="#">牛仔裤</a>
                            <a href="#">打底裤</a>
                            <a href="#">短裤</a>
                            <a href="#">哈伦裤</a>
                            <a href="#">背带裤</a>
                            <a class="highlight" href="#">小脚裤</a>
                            <a href="#">西装裤</a>
                            <a href="#">阔腿裤</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>特色女装</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">时尚气质套装</a>
                            <a href="#">休闲运动套装</a>
                            <a class="highlight" href="#">妈妈装夏款</a>
                            <a href="#">大码女装</a>
                            <a class="highlight" href="#">职业套装</a>
                            <a class="highlight" href="#">旗袍</a>
                            <a href="#">礼服</a>
                            <a href="#">婚纱</a>
                            <a href="#">唐装</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>文胸塑身</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">聚拢文胸</a>
                            <a class="highlight" href="#">运动文胸</a>
                            <a href="#">性感蕾丝</a>
                            <a href="#">无钢圈</a>
                            <a class="highlight" href="#">塑身上衣</a>
                            <a href="#">塑身连体衣</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>家居服</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">睡衣</a>
                            <a href="#">少女家居服</a>
                            <a href="#">睡袍</a>
                            <a class="highlight" href="#">居家套装</a>
                            <a href="#">全棉睡衣</a>
                            <a class="highlight" href="#">情侣家居服</a>
                            <a href="#">真丝家居服</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>内裤背心</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">男士内裤</a>
                            <a href="#">女式内裤</a>
                            <a class="highlight" href="#">莫代尔内裤</a>
                            <a class="highlight" href="#">无痕内裤</a>
                            <a href="#">蕾丝内裤</a>
                            <a class="highlight" href="#">吊带背心</a>
                            <a href="#">男士背心</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>袜类</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">棉袜</a>
                            <a href="#">丝袜</a>
                            <a class="highlight" href="#">男士短袜</a>
                            <a href="#">日式袜子</a>
                            <a class="highlight" href="#">隐形船袜</a>
                            <a href="#">连裤袜</a>
                            <a href="#">瘦身袜</a>
                        </div>
                    </div>
                </div>
                <div class="detail-logo">
                    <a href="#"><img src="" data-src="img/detail/barnd1.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd2.png"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd3.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd4.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd5.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd6.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd7.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd8.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd9.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd10.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd11.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd12.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd13.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd14.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd15.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd16.jpg"></a>
                </div>
            </div><!-- end detail0 -->
            <div class="detail detail1 clear">
                <div class="detail-word">
                    <div class="hot-word-line clear">
                        <h3>
                            <span>当季流行</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">T恤</a>
                            <a href="#">休闲裤</a>
                            <a class="highlight" href="#">条纹T</a>
                            <a href="#">牛仔裤</a>
                            <a href="#">内衣夏季新品</a>
                            <a class="highlight" href="#">针织运动裤</a>
                            <a href="#">潮T</a>
                            <a class="highlight" href="#">格子衬衫</a>
                            <a href="#">纯棉印花T恤</a>
                            <a class="highlight" href="#">纯色衬衫</a>
                            <a href="#">牛仔夹克</a>
                            <a href="#">迷彩风</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>男士外套</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">夹克</a>
                            <a href="#">风衣</a>
                            <a class="highlight" href="#">单西</a>
                            <a href="#">西服套装</a>
                            <a href="#">皮衣</a>
                            <a class="highlight" href="#">运动服</a>
                            <a href="#">棒球衫</a>
                            <a class="highlight" href="#">大衣</a>
                            <a href="#">工装外套</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>男士内搭</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">衬衫</a>
                            <a href="#">T恤</a>
                            <a class="highlight" href="#">卫衣</a>
                            <a href="#">棒球衫</a>
                            <a href="#">针织衫/毛衣</a>
                            <a class="highlight" href="#">背心</a>
                            <a href="#">POLO衫</a>
                            <a class="highlight" href="#">背心裙</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>男士裤装</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">休闲裤</a>
                            <a class="highlight" href="#">牛仔裤</a>
                            <a href="#">西裤</a>
                            <a href="#">小脚裤</a>
                            <a href="#">运动裤</a>
                            <a href="#">针织裤</a>
                            <a class="highlight" href="#">短裤</a>
                            <a href="#">工装裤</a>
                            <a href="#">9分裤</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>特色男装</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">潮牌</a>
                            <a href="#">中老年</a>
                            <a href="#">大码</a>
                            <a class="highlight" href="#">职业装</a>
                            <a href="#">民族服装</a>
                            <a class="highlight" href="#">中山装</a>
                            <a class="highlight" href="#">商务装</a>
                            <a href="#">套装</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>运动鞋</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">运动鞋</a>
                            <a href="#">板鞋</a>
                            <a href="#">潮鞋</a>
                            <a class="highlight" href="#">篮球鞋</a>
                            <a class="highlight" href="#">休闲鞋</a>
                            <a href="#">健步鞋</a>
                            <a href="#">羽毛球鞋</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>运动服</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">运动短袖</a>
                            <a class="highlight" href="#">运动卫衣</a>
                            <a class="highlight" href="#">运动短裤</a>
                            <a href="#">运动套装</a>
                            <a href="#">紧身衣</a>
                            <a class="highlight" href="#">运动T恤</a>
                            <a href="#">训练裤</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>户外鞋服</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">皮肤衣</a>
                            <a href="#">冲锋衣</a>
                            <a class="highlight" href="#">抓绒衣</a>
                            <a href="#">软壳衣</a>
                            <a href="#">软壳裤</a>
                            <a class="highlight" href="#">速干T恤</a>
                            <a href="#">军迷</a>
                            <a href="#">钓鱼服</a>
                            <a href="#">潜水服</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>户外用品</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">运动包</a>
                            <a class="highlight" href="#">户外包</a>
                            <a class="highlight" href="#">垂钓</a>
                            <a class="highlight" href="#">防潮垫</a>
                            <a class="highlight" href="#">帐篷</a>
                            <a href="#">刀具</a>
                            <a href="#">登山杖</a>
                            <a href="#">睡袋</a>
                            <a class="highlight" href="#">烧烤炉具</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>运动用品</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">瑜伽垫</a>
                            <a href="#">瑜伽服</a>
                            <a class="highlight" href="#">泳衣</a>
                            <a href="#">自行车</a>
                            <a class="highlight" href="#">跑步机</a>
                            <a href="#">踏步机</a>
                            <a href="#">健身器械</a>
                            <a href="#">羽毛球拍</a>
                        </div>
                    </div>
                </div>
                <div class="detail-logo">
                    <a href="#"><img src="" data-src="img/detail/barnd1.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd2.png"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd3.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd4.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd5.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd6.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd7.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd8.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd9.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd10.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd11.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd12.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd13.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd14.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd15.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd16.jpg"></a>
                </div>
            </div><!-- end detail1 -->
            <div class="detail detail2 clear">
                <div class="detail-word">
                    <div class="hot-word-line clear">
                        <h3>
                            <span>凉鞋凉拖</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">女凉鞋</a>
                            <a class="highlight" href="#">坡跟凉鞋</a>
                            <a href="#">鱼嘴凉鞋</a>
                            <a class="highlight" href="#">女拖鞋</a>
                            <a href="#">女人字拖</a>
                            <a class="highlight" href="#">镂空皮鞋</a>
                            <a href="#">男凉鞋</a>
                            <a href="#">男拖鞋</a>
                            <a class="highlight" href="#">男人字拖</a>
                            <a href="#">男洞洞鞋</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>女单鞋</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">春季新品</a>
                            <a  class="highlight" href="#">商场同款</a>
                            <a  class="highlight" href="#">小白鞋</a>
                            <a href="#">帆布鞋</a>
                            <a href="#">单鞋</a>
                            <a href="#">深口单鞋</a>
                            <a  class="highlight" href="#">浅口单鞋</a>
                            <a  class="highlight" href="#">鱼嘴单鞋</a>
                            <a  class="highlight" href="#">平底单鞋</a>
                            <a href="#">高跟单鞋</a>
                            <a  class="highlight" href="#">坡跟单鞋</a>
                            <a href="#">尖头单鞋</a>
                            <a href="#">防水台单鞋</a>
                            <a href="#">豆豆鞋</a>
                            <a href="#">牛津鞋</a>
                            <a  class="highlight" href="#">乐福鞋</a>

                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>男单鞋</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">新品男鞋</a>
                            <a href="#">商场同款</a>
                            <a href="#">休闲鞋</a>
                            <a href="#">正装皮鞋</a>
                            <a class="highlight" href="#">休闲皮鞋</a>
                            <a class="highlight" href="#">户外休闲</a>
                            <a class="highlight" href="#">板鞋</a>
                            <a href="#">帆布鞋</a>
                            <a href="#">运动休闲</a>
                            <a class="highlight" href="#">网面鞋</a>
                            <a href="#">乐福鞋</a>
                            <a href="#">豆豆鞋</a>
                            <a href="#">布洛克</a>
                            <a href="#">伐木鞋</a>
                            <a class="highlight" href="#">帆船鞋</a>
                            <a class="highlight" href="#">布鞋</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>潮流女包</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">新品推荐</a>
                            <a class="highlight" href="#">商场同款</a>
                            <a href="#">女士钱包</a>
                            <a href="#">单肩包</a>
                            <a class="highlight" href="#">斜跨包</a>
                            <a href="#">手提包</a>
                            <a href="#">手拿包</a>
                            <a class="highlight" href="#">腰包</a>
                            <a class="highlight" href="#">胸包</a>
                            <a class="highlight" href="#">化妆包</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>精品男包</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a  class="highlight" href="#">男士钱包</a>
                            <a href="#">收纳包</a>
                            <a href="#">胸包</a>
                            <a href="#">腰包</a>
                            <a href="#">手拿包</a>
                            <a  class="highlight" href="#">手提包</a>
                            <a  class="highlight" href="#">斜跨包</a>
                            <a href="#">单肩包</a>
                            <a href="#">商场同款</a>
                            <a href="#">新品推荐</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>运动鞋</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">运动鞋</a>
                            <a href="#">板鞋</a>
                            <a href="#">潮鞋</a>
                            <a class="highlight" href="#">篮球鞋</a>
                            <a class="highlight" href="#">休闲鞋</a>
                            <a href="#">健步鞋</a>
                            <a href="#">羽毛球鞋</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>功能箱包</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">旅行箱</a>
                            <a href="#">万向轮箱</a>
                            <a href="#">旅行袋</a>
                            <a class="highlight" href="#">女士双肩包</a>
                            <a href="#">男士双肩包</a>
                            <a class="highlight" href="#">韩版双肩包</a>
                            <a href="#">铆钉双肩包</a>
                            <a class="highlight" href="#">女士钱包</a>
                            <a href="#">男士钱包</a>
                            <a href="#">大容量</a>
                            <a href="#">印花</a>
                        </div>
                    </div>
                </div>
                <div class="detail-logo">
                    <a href="#"><img src="" data-src="img/detail/barnd1.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd2.png"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd3.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd4.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd5.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd6.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd7.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd8.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd9.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd10.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd11.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd12.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd13.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd14.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd15.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd16.jpg"></a>
                </div>
            </div><!-- end detail2 -->
            <div class="detail detail3 clear">
                <div class="detail-word">
                    <div class="hot-word-line clear">
                        <h3>
                            <span>护肤品</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">官方直售</a>
                            <a class="highlight" href="#">面膜</a>
                            <a href="#">护肤套装</a>
                            <a href="#">乳液面霜</a>
                            <a href="#">精华液</a>
                            <a href="#">护手霜</a>
                            <a href="#">爽肤水</a>
                            <a href="#">洁面</a>
                            <a href="#">眼霜</a>
                            <a href="#">身体乳</a>
                            <a href="#">卸妆</a>
                            <a href="#">身体护理</a>
                            <a href="#">男士护理</a>
                            <a href="#">精油芳疗</a>
                            <a href="#">丰胸</a>
                            <a class="highlight" href="#">面部喷雾</a>
                            <a href="#">T区护理</a>
                            <a href="#">去角质</a>
                            <a href="#">补水</a>
                            <a href="#">祛痘</a>
                            <a href="#">敏感修护</a>
                            <a class="highlight" href="#">线上专柜</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>彩妆</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">时尚彩妆</a>
                            <a class="highlight" href="#">香水</a>
                            <a href="#">BB霜</a>
                            <a class="highlight" href="#">美容工具</a>
                            <a class="highlight" href="#">口红</a>
                            <a href="#">隔离</a>
                            <a href="#">粉底</a>
                            <a href="#">粉饼</a>
                            <a class="highlight" href="#">气垫bb</a>
                            <a class="highlight" href="#">指甲油</a>
                            <a class="highlight" href="#">美甲工具</a>
                            <a href="#">眉笔</a>
                            <a class="highlight" href="#">睫毛膏</a>
                            <a href="#">眼线</a>
                            <a href="#">唇彩</a>
                            <a href="#">眼影</a>
                            <a href="#">蜜粉</a>
                            <a href="#">彩妆套装</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>男士护肤</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">洁面</a>
                            <a href="#">爽肤水</a>
                            <a href="#">乳液/面霜</a>
                            <a href="#">护理套装</a>
                            <a href="#">面膜</a>
                            <a href="#">面部精华</a>
                            <a href="#">眼部护理</a>
                            <a class="highlight" href="#">防晒</a>
                            <a href="#">唇部护理</a>
                            <a href="#">T区护理</a>
                            <a href="#">控油</a>
                            <a href="#">磨砂/去角质</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>肤质推荐</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">混合偏油型</a>
                            <a class="highlight" href="#">中性偏干型</a>
                            <a class="highlight" href="#">敏感性</a>
                            <a href="#">干性</a>
                            <a href="#">油性</a>
                            <a href="#">混合型</a>
                            <a href="#">中性</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>美发护发</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">洗发水</a>
                            <a class="highlight" href="#">进口洗发水</a>
                            <a class="highlight" href="#">护发素</a>
                            <a href="#">发膜</a>
                            <a href="#">洗护套装</a>
                            <a href="#">护发精油</a>
                            <a class="highlight" href="#">头发造型</a>
                            <a href="#">弹力素</a>
                            <a href="#">染发霜</a>
                            <a href="#">整顶假发</a>
                            <a href="#">假发配件</a>
                            <a href="#">男性假发</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>口腔护理</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">牙膏</a>
                            <a class="highlight" href="#">进口牙膏</a>
                            <a href="#">牙刷</a>
                            <a href="#">进口牙刷</a>
                            <a href="#">漱口水</a>
                            <a href="#">牙线</a>
                            <a href="#">牙粉</a>
                            <a class="highlight" href="#">口气清新剂</a>
                            <a href="#">牙贴</a>
                            <a class="highlight" href="#">口腔美白</a>
                            <a href="#">假牙清洁</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>身体女性</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">沐浴露</a>
                            <a href="#">香皂</a>
                            <a class="highlight" href="#">泡澡浴盐</a>
                            <a class="highlight" href="#">护足</a>
                            <a href="#">洗手液</a>
                            <a href="#">手动剃须刀</a>
                            <a class="highlight" href="#">卫生巾</a>
                            <a href="#">成人护垫</a>
                            <a href="#">私处洗液</a>
                            <a href="#">卫生棉条</a>
                        </div>
                    </div>
                </div>
                <div class="detail-logo">
                    <a href="#"><img src="" data-src="img/detail/barnd1.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd2.png"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd3.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd4.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd5.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd6.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd7.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd8.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd9.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd10.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd11.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd12.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd13.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd14.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd15.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd16.jpg"></a>
                </div>
            </div><!-- end detail3 -->
            <div class="detail detail4 clear">
                <div class="detail-word">
                    <div class="hot-word-line clear">
                        <h3>
                            <span>黄金首饰</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">耳钉</a>
                            <a href="#">黄金项链</a>
                            <a class="highlight" href="#">投资黄金</a>
                            <a class="highlight" href="#">婚嫁套饰</a>
                            <a href="#">转运珠</a>
                            <a href="#">黄金对戒</a>
                            <a href="#">足金饰品</a>
                            <a href="#">K金饰品</a>
                            <a href="#">商场同款</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>钻石彩宝</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">结婚钻戒</a>
                            <a class="highlight" href="#">钻石耳饰</a>
                            <a class="highlight" href="#">钻石吊坠</a>
                            <a href="#">钻石手链</a>
                            <a href="#">裸钻定制</a>
                            <a class="highlight" href="#">红蓝宝石</a>
                            <a href="#">绿宝石</a>
                            <a href="#">坦桑石</a>
                            <a class="highlight" href="#">其他天然宝石</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>珍珠翡翠</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">珍珠项链送妈妈</a>
                            <a class="highlight" href="#">海水珍珠</a>
                            <a href="#">和田玉</a>
                            <a href="#">翡翠摆件</a>
                            <a class="highlight" href="#">翡翠手镯</a>
                            <a class="highlight" href="#">翡翠项链</a>
                            <a href="#">琥珀手链</a>
                            <a class="highlight" href="#">天然琥珀</a>
                            <a href="#">原矿琥珀</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>潮流饰品</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">太阳的后裔</a>
                            <a class="highlight" href="#">明星同款</a>
                            <a href="#">传统银饰</a>
                            <a href="#">木手串</a>
                            <a href="#">银手镯</a>
                            <a href="#">石榴石手链</a>
                            <a class="highlight" href="#">开口戒指</a>
                            <a href="#">胸针</a>
                            <a class="highlight" href="#">宝宝银饰</a>
                            <a href="#">手链</a>
                            <a class="highlight" href="#">项链</a>
                            <a href="#">发饰</a>
                            <a class="highlight" href="#">手镯</a>
                            <a href="#">耳饰</a>
                            <a class="highlight" href="#">戒指</a>
                            <a href="#">项坠</a>
                            <a class="highlight" href="#">施华洛世奇</a>
                            <a class="highlight" href="#">shes</a>
                            <a href="#">银时代</a>
                            <a href="#">伊泰莲娜</a>
                            <a href="#">PH7</a>
                            <a class="highlight" href="#">Monchhichi</a>
                            <a class="highlight" href="#">ALEXANDRE</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>腕表</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">瑞士名表</a>
                            <a class="highlight" href="#">日韩港表</a>
                            <a class="highlight" href="#">欧美手表</a>
                            <a href="#">经典国表</a>
                            <a href="#">国货精表</a>
                            <a href="#">男表</a>
                            <a href="#">女表</a>
                            <a class="highlight" href="#">情侣表</a>
                            <a href="#">儿童手表</a>
                            <a href="#">机械表</a>
                            <a href="#">石英表</a>
                            <a href="#">光能表</a>
                            <a class="highlight" href="#">防水表</a>
                            <a href="#">运动表</a>
                            <a href="#">学生表</a>
                            <a href="#">军表</a>
                            <a class="highlight" href="#">陶瓷表</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>眼镜</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">太阳镜</a>
                            <a class="highlight" href="#">墨镜</a>
                            <a href="#">眼镜框</a>
                            <a href="#">近视眼镜</a>
                            <a href="#">防辐射眼镜</a>
                            <a href="#">老花镜</a>
                            <a href="#">司机镜</a>
                            <a class="highlight" href="#">偏光镜</a>
                            <a href="#">驾驶镜</a>
                            <a href="#">3D眼镜</a>
                            <a href="#">雷朋</a>
                            <a class="highlight" href="#">暴龙</a>
                            <a href="#">宝岛眼镜</a>
                            <a href="#">oakley</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>烟具</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">电子烟</a>
                            <a href="#">烟盒</a>
                            <a href="#">烟斗</a>
                            <a href="#">烟嘴</a>
                            <a href="#">烟油</a>
                            <a class="highlight" href="#">蒸汽烟</a>
                            <a href="#">水烟</a>
                            <a href="#">戒烟</a>
                            <a href="#">女士烟</a>
                            <a href="#">鼻烟</a>
                            <a href="#">雪茄</a>
                        </div>
                    </div>
                </div>
                <div class="detail-logo">
                    <a href="#"><img src="" data-src="img/detail/barnd1.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd2.png"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd3.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd4.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd5.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd6.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd7.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd8.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd9.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd10.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd11.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd12.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd13.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd14.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd15.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd16.jpg"></a>
                </div>
            </div><!-- end detail4 -->
            <div class="detail detail5 clear">
                <div class="detail-word">
                    <div class="hot-word-line clear">
                        <h3>
                            <span>热门手机</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">小米</a>
                            <a class="highlight" href="#">iPhone</a>
                            <a href="#">魅族</a>
                            <a href="#">荣耀</a>
                            <a href="#">乐视</a>
                            <a href="#">OPPO</a>
                            <a href="#">vivo</a>
                            <a href="#">三星</a>
                            <a href="#">华为</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>特色手机</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">YunOS</a>
                            <a class="highlight" href="#">千元指纹</a>
                            <a href="#">双卡双待</a>
                            <a href="#">大屏</a>
                            <a class="highlight" href="#">自拍</a>
                            <a href="#">移动</a>
                            <a href="#">联通</a>
                            <a href="#">电信</a>
                            <a href="#">合约机</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>手机特惠</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">打折秒杀</a>
                            <a href="#">新品特卖</a>
                            <a class="highlight" href="#">实惠精选</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>电脑整机</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">笔记本</a>
                            <a class="highlight" href="#">平板电脑</a>
                            <a href="#">台式机</a>
                            <a href="#">一体机</a>
                            <a class="highlight" href="#">DIY</a>
                            <a href="#">游戏本</a>
                            <a href="#">iPad</a>
                            <a href="#">Surface</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>智能数码</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">智能设备</a>
                            <a href="#">智能手表</a>
                            <a href="#">智能手环</a>
                            <a href="#">手机配件</a>
                            <a class="highlight" href="#">智能飞行</a>
                            <a href="#">智能摄像</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>游戏组装</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">DIY电脑</a>
                            <a class="highlight" href="#">竞技DIY</a>
                            <a href="#">显示器</a>
                            <a href="#">游戏本</a>
                            <a href="#">机械键盘</a>
                            <a href="#">XBOX</a>
                            <a href="#">游戏手柄</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>硬件存储</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">显示器</a>
                            <a class="highlight" href="#">机械键盘</a>
                            <a class="highlight" href="#">固体硬盘</a>
                            <a href="#">CPU</a>
                            <a href="#">显卡</a>
                            <a href="#">主板</a>
                            <a href="#">高速U盘</a>
                            <a href="#">路由器</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>摄影摄像</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">相机</a>
                            <a class="highlight" href="#">单反</a>
                            <a class="highlight" href="#">单电微单</a>
                            <a href="#">摄像机</a>
                            <a href="#">自拍神器</a>
                            <a href="#">拍立得</a>
                            <a class="highlight" href="#">镜头</a>
                            <a class="highlight" href="#">自拍杆</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>影音娱乐</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">耳机</a>
                            <a class="highlight" href="#">天猫魔盒</a>
                            <a href="#">数码影音</a>
                            <a class="highlight" href="#">家庭影院</a>
                            <a href="#">蓝牙耳机</a>
                            <a href="#">网络播放器</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>办公文教</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">文具</a>
                            <a href="#">电子书</a>
                            <a class="highlight" href="#">电子词典／学习机</a>
                            <a href="#">笔类／书写工具</a>
                            <a href="#">书画工具</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>数码配件</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">手机配件</a>
                            <a class="highlight" href="#">苹果配件</a>
                            <a class="highlight" href="#">笔记本配件</a>
                            <a href="#">平板配件</a>
                            <a href="#">相机配件</a>
                            <a href="#">手机车载配件</a>
                            <a href="#">kindle配件</a>
                            <a href="#">充电宝</a>
                            <a class="highlight" href="#">自拍杆</a>
                            <a class="highlight" href="#">数据线</a>
                            <a href="#">电池</a>
                        </div>
                    </div>
                </div>
                <div class="detail-logo">
                    <a href="#"><img src="" data-src="img/detail/barnd1.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd2.png"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd3.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd4.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd5.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd6.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd7.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd8.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd9.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd10.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd11.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd12.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd13.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd14.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd15.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd16.jpg"></a>
                </div>
            </div><!-- end detail5 -->
            <div class="detail detail6 clear">
                <div class="detail-word">
                    <div class="hot-word-line clear">
                        <h3>
                            <span>童装</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">套装</a>
                            <a class="highlight" href="#">裤子</a>
                            <a class="highlight" href="#">连衣裙</a>
                            <a class="highlight" href="#">T恤</a>
                            <a href="#">外套</a>
                            <a href="#">亲子装</a>
                            <a href="#">内衣裤</a>
                            <a href="#">家居服</a>
                            <a href="#">儿童袜子</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>婴儿服</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">连体衣</a>
                            <a class="highlight" href="#">内衣套装</a>
                            <a class="highlight" href="#">裤子</a>
                            <a class="highlight" href="#">婴儿礼盒</a>
                            <a href="#">外套</a>
                            <a href="#">家居服</a>
                            <a href="#">T恤</a>
                            <a href="#">反穿衣</a>
                            <a href="#">肚兜</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>童鞋</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">运动鞋</a>
                            <a class="highlight" href="#">学步鞋</a>
                            <a href="#">凉鞋</a>
                            <a href="#">帆布鞋</a>
                            <a class="highlight" href="#">皮鞋</a>
                            <a href="#">拖鞋</a>
                            <a href="#">雨靴</a>
                            <a class="highlight" href="#">靴子</a>
                            <a href="#">亲子鞋</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>车床用品</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">婴儿推车</a>
                            <a href="#">学步车</a>
                            <a href="#">安全座椅</a>
                            <a class="highlight" href="#">婴儿背带</a>
                            <a href="#">腰凳</a>
                            <a href="#">婴儿床</a>
                            <a class="highlight" href="#">餐椅</a>
                            <a href="#">睡袋</a>
                            <a href="#">抱被</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>喂养</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">奶瓶</a>
                            <a href="#">奶嘴</a>
                            <a class="highlight" href="#">水杯</a>
                            <a href="#">餐具</a>
                            <a class="highlight" href="#">消毒锅</a>
                            <a href="#">辅食机</a>
                            <a href="#">调奶器</a>
                            <a href="#">暖奶器</a>
                            <a href="#">围嘴</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>洗护</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">洗发水</a>
                            <a href="#">沐浴露</a>
                            <a class="highlight" href="#">润肤</a>
                            <a href="#">浴盆</a>
                            <a class="highlight" href="#">湿巾</a>
                            <a href="#">洗衣液</a>
                            <a class="highlight" href="#">洗衣皂</a>
                            <a href="#">理发器</a>
                            <a href="#">驱虫止痒</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>玩具</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">婴儿玩具</a>
                            <a class="highlight" href="#">儿童自行车</a>
                            <a href="#">儿童电动车</a>
                            <a class="highlight" href="#">毛绒玩具</a>
                            <a href="#">积木</a>
                            <a href="#">电动遥控</a>
                            <a href="#">儿童箱包</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>天猫动漫</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">动漫周边</a>
                            <a href="#">影视周边</a>
                            <a href="#">手办</a>
                            <a href="#">高达</a>
                            <a class="highlight" href="#">魔术道具</a>
                            <a class="highlight" href="#">COSPLAY</a>
                            <a href="#">桌游</a>
                            <a href="#">变形金刚</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>奶粉</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">牛奶粉</a>
                            <a class="highlight" href="#">羊奶粉</a>
                            <a href="#">特殊配方奶粉</a>
                            <a href="#">宝宝辅食</a>
                            <a class="highlight" href="#">宝宝零食</a>
                            <a class="highlight" href="#">宝宝营养</a>
                            <a href="#">DHA</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>纸尿裤</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">纸尿裤</a>
                            <a class="highlight" href="#">拉拉裤</a>
                            <a href="#">纸尿片</a>
                            <a class="highlight" href="#">L</a>
                            <a href="#">XL</a>
                            <a href="#">M</a>
                            <a href="#">S</a>
                            <a href="#">NB</a>
                            <a class="highlight" href="#">新生儿组合</a>

                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>孕产</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">孕产用品</a>
                            <a class="highlight" href="#">孕妈洗护</a>
                            <a href="#">孕妈装</a>
                            <a class="highlight" href="#">月子服</a>
                            <a class="highlight" href="#">哺乳文胸</a>
                            <a class="highlight" href="#">防辐射</a>
                            <a href="#">吸奶器</a>
                            <a href="#">待产包</a>
                        </div>
                    </div>
                </div>
                <div class="detail-logo">
                    <a href="#"><img src="" data-src="img/detail/barnd1.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd2.png"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd3.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd4.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd5.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd6.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd7.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd8.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd9.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd10.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd11.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd12.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd13.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd14.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd15.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd16.jpg"></a>
                </div>
            </div><!-- end detail6 -->
            <div class="detail detail7 clear">
                <div class="detail-word">
                    <div class="hot-word-line clear">
                        <h3>
                            <span>进口食品</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">进口零食</a>
                            <a class="highlight" href="#">进口巧克力</a>
                            <a class="highlight" href="#">进口饼干</a>
                            <a href="#">进口糖果</a>
                            <a href="#">进口坚果</a>
                            <a href="#">进口果干</a>
                            <a href="#">进口橄榄油</a>
                            <a href="#">进口牛奶</a>
                            <a href="#">进口咖啡</a>
                            <a href="#">进口饮料</a>
                            <a href="#">进口葡萄酒</a>
                            <a class="highlight" href="#">进口洋酒</a>
                            <a href="#">进口啤酒</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>休闲零食</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">零食</a>
                            <a class="highlight" href="#">坚果</a>
                            <a class="highlight" href="#">饼干</a>
                            <a href="#">蛋糕</a>
                            <a href="#">红枣</a>
                            <a href="#">巧克力</a>
                            <a href="#">猪肉脯</a>
                            <a class="highlight" href="#">膨化食品</a>
                            <a href="#">蜜饯</a>
                            <a href="#">鸭脖</a>
                            <a href="#">糖果</a>
                            <a class="highlight" href="#">豆干</a>
                            <a href="#">曲奇</a>
                            <a href="#">海苔</a>
                            <a class="highlight" href="#">肉松饼</a>
                            <a class="highlight" href="#">牛肉干</a>
                            <a href="#">鱿鱼丝</a>
                            <a href="#">糕点</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>酒类</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">白酒</a>
                            <a class="highlight" href="#">红酒</a>
                            <a class="highlight" href="#">洋酒</a>
                            <a href="#">啤酒</a>
                            <a href="#">黄酒</a>
                            <a class="highlight" href="#">保健酒</a>
                            <a href="#">预调酒</a>
                            <a href="#">配制酒</a>
                            <a href="#">葡萄酒</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>茶叶</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">西湖龙井</a>
                            <a href="#">安吉白茶</a>
                            <a href="#">绿茶</a>
                            <a href="#">大红袍</a>
                            <a class="highlight" href="#">铁观音</a>
                            <a class="highlight" href="#">普洱茶</a>
                            <a class="highlight" href="#">玫瑰花茶</a>
                            <a href="#">柠檬片</a>
                            <a class="highlight" href="#">菊花茶</a>
                            <a href="#">花茶</a>
                            <a href="#">天然粉粉</a>
                            <a href="#">金骏眉</a>
                            <a href="#">红茶</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>乳品冲饮</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">牛奶</a>
                            <a class="highlight" href="#">酸奶</a>
                            <a href="#">成人奶粉</a>
                            <a href="#">儿童奶</a>
                            <a class="highlight" href="#">速溶咖啡</a>
                            <a href="#">滤挂咖啡</a>
                            <a href="#">咖啡豆</a>
                            <a class="highlight" href="#">麦片</a>
                            <a class="highlight" href="#">奶茶</a>
                            <a href="#">柚子茶</a>
                            <a href="#">果汁</a>
                            <a href="#">汽水</a>
                            <a href="#">功能饮料</a>
                            <a href="#">饮用水</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>粮油速食</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">橄榄油</a>
                            <a href="#">食用油</a>
                            <a class="highlight" href="#">大米</a>
                            <a class="highlight" href="#">薏米</a>
                            <a href="#">玉米</a>
                            <a href="#">面粉</a>
                            <a href="#">银耳</a>
                            <a href="#">桂圆干</a>
                            <a href="#">香肠</a>
                            <a href="#">木耳</a>
                            <a href="#">香菇</a>
                            <a class="highlight" href="#">方便面</a>
                            <a href="#">手抓饼</a>
                            <a href="#">黄油</a>
                            <a href="#">意大利面</a>
                            <a href="#">蛋挞皮</a>
                            <a href="#">调味品</a>
                            <a href="#">红糖</a>
                            <a href="#">进口泡面</a>
                            <a class="highlight" href="#">粽子</a>
                            <a href="#">寿司</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>生鲜水果</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a  class="highlight" href="#">牛排</a>
                            <a  class="highlight" href="#">芒果</a>
                            <a href="#">奇异果</a>
                            <a href="#">蟹</a>
                            <a href="#">三文鱼</a>
                            <a href="#">虾</a>
                            <a href="#">车厘子</a>
                            <a href="#">进口鳕鱼</a>
                            <a  class="highlight" href="#">海参</a>
                            <a href="#">苹果</a>
                            <a href="#">榴莲</a>
                            <a href="#">牛肉</a>
                            <a  class="highlight" href="#">牛油果</a>
                            <a href="#">土鸡</a>
                            <a href="#">冰淇淋</a>
                            <a href="#">鸡蛋</a>
                        </div>
                    </div>
                </div>
                <div class="detail-logo">
                    <a href="#"><img src="" data-src="img/detail/barnd1.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd2.png"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd3.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd4.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd5.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd6.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd7.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd8.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd9.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd10.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd11.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd12.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd13.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd14.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd15.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd16.jpg"></a>
                </div>
            </div><!-- end detail7 -->
            <div class="detail detail8 clear">
                <div class="detail-word">
                    <div class="hot-word-line clear">
                        <h3>
                            <span>新鲜蔬菜</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">土豆</a>
                            <a class="highlight" href="#">番薯</a>
                            <a class="highlight" href="#">山药</a>
                            <a href="#">莲藕</a>
                            <a href="#">净菜</a>
                            <a class="highlight" href="#">玉米</a>
                            <a href="#">秋葵</a>
                            <a href="#">大蒜</a>
                            <a href="#">生姜</a>
                            <a href="#">南瓜</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>冰淇淋</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">冰淇淋</a>
                            <a class="highlight" href="#">哈根达斯</a>
                            <a class="highlight" href="#">movenpick莫凡彼</a>
                            <a href="#">本杰瑞</a>
                            <a href="#">tip-top冰淇淋</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>蛋类</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">鸡蛋</a>
                            <a class="highlight" href="#">鸭蛋</a>
                            <a class="highlight" href="#">鹅蛋</a>
                            <a href="#">鸽子蛋</a>
                            <a class="highlight" href="#">鹌鹑蛋</a>
                            <a href="#">松花皮蛋</a>
                            <a href="#">咸鸭蛋</a>
                            <a href="#">喜蛋</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>肉类</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">牛排</a>
                            <a href="#">牛腩</a>
                            <a href="#">牛腱子</a>
                            <a class="highlight" href="#">牛肉</a>
                            <a href="#">牛尾</a>
                            <a class="highlight" href="#">牛肉串</a>
                            <a class="highlight" href="#">牛杂</a>
                            <a href="#">羊腿</a>
                            <a class="highlight" href="#">羊排</a>
                            <a href="#">羊肉串</a>
                            <a href="#">羊蝎子</a>
                            <a href="#">鸡肉</a>
                            <a href="#">鸡翅</a>
                            <a class="highlight" href="#">鸡胸</a>
                            <a href="#">鸡腿</a>
                            <a href="#">鸭肉</a>
                            <a href="#">乳鸽</a>
                            <a href="#">鹅肉</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>海鲜水产</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">鳕鱼</a>
                            <a class="highlight" href="#">三文鱼</a>
                            <a href="#">金枪鱼</a>
                            <a href="#">鲽鱼</a>
                            <a href="#">斑鱼</a>
                            <a href="#">比目鱼</a>
                            <a class="highlight" href="#">多春鱼</a>
                            <a href="#">马鲛鱼</a>
                            <a href="#">龙利鱼</a>
                            <a class="highlight" href="#">秋刀鱼</a>
                            <a href="#">带鱼</a>
                            <a href="#">海带</a>
                            <a class="highlight" href="#">墨鱼</a>
                            <a class="highlight" href="#">海参</a>
                            <a href="#">海蜇</a>
                            <a href="#">鱿鱼</a>
                            <a href="#">甲鱼</a>
                            <a href="#">大闸蟹</a>
                            <a href="#">帝王蟹</a>
                            <a href="#">雪蟹</a>
                            <a href="#">黄金蟹</a>
                            <a href="#">鱼丸</a>
                            <a href="#">鱼糕/鱼饼</a>
                            <a href="#">干贝/瑶柱</a>
                            <a href="#">虾仁</a>
                            <a href="#">活虾</a>
                            <a href="#">冻虾</a>
                            <a href="#">生蚝</a>
                            <a href="#">北极贝</a>
                            <a href="#">扇贝</a>
                            <a href="#">贝类</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>新鲜水果</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">奇异果</a>
                            <a href="#">车厘子/樱桃</a>
                            <a class="highlight" href="#">芒果</a>
                            <a href="#">牛油果</a>
                            <a href="#">火龙果</a>
                            <a href="#">苹果</a>
                            <a href="#">橙子</a>
                            <a href="#">凤梨</a>
                            <a href="#">榴莲</a>
                            <a href="#">山竹</a>
                            <a class="highlight" href="#">木瓜</a>
                            <a href="#">柠檬</a>
                            <a href="#">百香果</a>
                            <a href="#">椰青</a>
                            <a class="highlight" href="#">番荔枝/释迦</a>
                            <a class="highlight" href="#">龙眼</a>
                            <a href="#">蓝莓</a>
                            <a href="#">梨</a>
                            <a href="#">提子</a>
                            <a href="#">柚子</a>
                            <a href="#">芭乐</a>
                            <a href="#">莲雾</a>
                            <a href="#">桃</a>
                            <a href="#">草莓</a>
                            <a href="#">西柚</a>
                            <a class="highlight" href="#">荔枝</a>
                            <a class="highlight" href="#">石榴</a>
                            <a href="#">葡萄/提子</a>
                            <a href="#">哈密瓜</a>
                            <a href="#">枇杷</a>
                            <a href="#">李子</a>
                            <a href="#">西瓜</a>
                            <a href="#">菠萝</a>
                            <a href="#">桔子</a>
                            <a href="#">香蕉</a>
                            <a href="#">杨桃</a>
                            <a href="#">红毛丹/毛荔枝</a>

                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>精选干货</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">干贝/瑶柱</a>
                            <a class="highlight" href="#">虾皮/虾米/海米</a>
                            <a class="highlight" href="#">大虾干</a>
                            <a href="#">花胶/鱼胶</a>
                            <a href="#">海带</a>
                            <a href="#">紫菜</a>
                            <a href="#">鱼干</a>
                            <a href="#">墨鱼干</a>
                        </div>
                    </div>
                </div>
                <div class="detail-logo">
                    <a href="#"><img src="" data-src="img/detail/barnd1.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd2.png"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd3.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd4.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd5.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd6.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd7.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd8.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd9.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd10.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd11.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd12.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd13.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd14.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd15.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd16.jpg"></a>
                </div>
            </div><!-- end detail8 -->
            <div class="detail detail9 clear">
                <div class="detail-word">
                    <div class="hot-word-line clear">
                        <h3>
                            <span>平板电视</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">4K超高清</a>
                            <a href="#">国产</a>
                            <a class="highlight" href="#">外资品牌</a>
                            <a class="highlight" href="#">曲面</a>
                            <a href="#">智能电视</a>
                            <a href="#">超级大屏</a>
                            <a href="#">云电视</a>
                            <a href="#">客厅首选</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>空调</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">热门之选</a>
                            <a class="highlight" href="#">节能</a>
                            <a class="highlight" href="#">智能</a>
                            <a href="#">变频</a>
                            <a href="#">艺术柜机</a>
                            <a href="#">挂机</a>
                            <a class="highlight" href="#">1.5匹</a>
                            <a href="#">中央空调</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>冰箱</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">热门之选</a>
                            <a class="highlight" href="#">无霜</a>
                            <a class="highlight" href="#">三门</a>
                            <a href="#">对开门</a>
                            <a class="highlight" href="#">电脑温控</a>
                            <a href="#">智能</a>
                            <a href="#">冷柜</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>洗衣机</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">热门</a>
                            <a href="#">滚筒洗</a>
                            <a href="#">波轮洗</a>
                            <a href="#">大容量</a>
                            <a class="highlight" href="#">智能洗</a>
                            <a class="highlight" href="#">洗烘一体</a>
                            <a href="#">迷你</a>
                            <a href="#">烘干机</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>厨房大电</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">烟灶套装</a>
                            <a href="#">侧吸油烟机</a>
                            <a href="#">欧式油烟机</a>
                            <a class="highlight" href="#">燃气灶</a>
                            <a class="highlight" href="#">消毒柜</a>
                            <a href="#">洗碗机</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>热水器</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">电热水器</a>
                            <a href="#">燃气热水器</a>
                            <a href="#">遥控</a>
                            <a class="highlight" href="#">恒温</a>
                            <a href="#">小厨宝</a>
                            <a class="highlight" href="#">太阳能</a>
                            <a href="#">即热式</a>
                            <a href="#">空气能</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>中式厨房</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">净水器</a>
                            <a href="#">电饭煲</a>
                            <a href="#">豆浆机</a>
                            <a href="#">电热水壶</a>
                            <a href="#">电压力锅</a>
                            <a class="highlight" href="#">电磁炉</a>
                            <a href="#">养生壶</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>西式厨房</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">烤箱</a>
                            <a href="#">料理机</a>
                            <a href="#">微波炉</a>
                            <a class="highlight" href="#">榨汁机</a>
                            <a class="highlight" href="#">原汁机</a>
                            <a href="#">面包机</a>
                            <a href="#">咖啡机</a>
                            <a href="#">电炸锅</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>生活电器</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">扫地机器人</a>
                            <a class="highlight" href="#">空气净化器</a>
                            <a href="#">吸尘器</a>
                            <a href="#">除湿机</a>
                            <a href="#">电风扇</a>
                            <a href="#">挂烫机</a>
                            <a href="#">干衣机</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>个护健康</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">剃须刀</a>
                            <a class="highlight" href="#">吹风机</a>
                            <a class="highlight" href="#">电动牙刷</a>
                            <a class="highlight" href="#">体重秤</a>
                            <a href="#">理发器</a>
                            <a href="#">足浴器</a>
                            <a href="#">按摩椅</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>精品推荐</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">脱毛器</a>
                            <a href="#">吊扇</a>
                            <a href="#">冰淇淋机</a>
                            <a href="#">碎冰机</a>
                            <a class="highlight" href="#">空调扇</a>
                            <a class="highlight" href="#">瘦身带</a>
                            <a class="highlight" href="#">冷饮机</a>
                            <a href="#">炒冰机</a>
                            <a href="#">电子灭蚊器</a>
                            <a href="#">冰淇淋机</a>
                            <a href="#">除湿机</a>
                            <a href="#">干衣机</a>
                        </div>
                    </div>
                </div>
                <div class="detail-logo">
                    <a href="#"><img src="" data-src="img/detail/barnd1.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd2.png"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd3.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd4.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd5.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd6.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd7.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd8.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd9.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd10.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd11.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd12.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd13.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd14.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd15.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd16.jpg"></a>
                </div>
            </div><!-- end detail9 -->
            <div class="detail detail10 clear">
                <div class="detail-word">
                    <div class="hot-word-line clear">
                        <h3>
                            <span>黄金首饰</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">耳钉</a>
                            <a href="#">黄金项链</a>
                            <a class="highlight" href="#">投资黄金</a>
                            <a class="highlight" href="#">婚嫁套饰</a>
                            <a href="#">转运珠</a>
                            <a href="#">黄金对戒</a>
                            <a href="#">足金饰品</a>
                            <a href="#">K金饰品</a>
                            <a href="#">商场同款</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>钻石彩宝</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">结婚钻戒</a>
                            <a class="highlight" href="#">钻石耳饰</a>
                            <a class="highlight" href="#">钻石吊坠</a>
                            <a href="#">钻石手链</a>
                            <a href="#">裸钻定制</a>
                            <a class="highlight" href="#">红蓝宝石</a>
                            <a href="#">绿宝石</a>
                            <a href="#">坦桑石</a>
                            <a class="highlight" href="#">其他天然宝石</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>珍珠翡翠</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">珍珠项链送妈妈</a>
                            <a class="highlight" href="#">海水珍珠</a>
                            <a href="#">和田玉</a>
                            <a href="#">翡翠摆件</a>
                            <a class="highlight" href="#">翡翠手镯</a>
                            <a class="highlight" href="#">翡翠项链</a>
                            <a href="#">琥珀手链</a>
                            <a class="highlight" href="#">天然琥珀</a>
                            <a href="#">原矿琥珀</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>潮流饰品</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">太阳的后裔</a>
                            <a class="highlight" href="#">明星同款</a>
                            <a href="#">传统银饰</a>
                            <a href="#">木手串</a>
                            <a href="#">银手镯</a>
                            <a href="#">石榴石手链</a>
                            <a class="highlight" href="#">开口戒指</a>
                            <a href="#">胸针</a>
                            <a class="highlight" href="#">宝宝银饰</a>
                            <a href="#">手链</a>
                            <a class="highlight" href="#">项链</a>
                            <a href="#">发饰</a>
                            <a class="highlight" href="#">手镯</a>
                            <a href="#">耳饰</a>
                            <a class="highlight" href="#">戒指</a>
                            <a href="#">项坠</a>
                            <a class="highlight" href="#">施华洛世奇</a>
                            <a class="highlight" href="#">shes</a>
                            <a href="#">银时代</a>
                            <a href="#">伊泰莲娜</a>
                            <a href="#">PH7</a>
                            <a class="highlight" href="#">Monchhichi</a>
                            <a class="highlight" href="#">ALEXANDRE</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>腕表</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">瑞士名表</a>
                            <a class="highlight" href="#">日韩港表</a>
                            <a class="highlight" href="#">欧美手表</a>
                            <a href="#">经典国表</a>
                            <a href="#">国货精表</a>
                            <a href="#">男表</a>
                            <a href="#">女表</a>
                            <a class="highlight" href="#">情侣表</a>
                            <a href="#">儿童手表</a>
                            <a href="#">机械表</a>
                            <a href="#">石英表</a>
                            <a href="#">光能表</a>
                            <a class="highlight" href="#">防水表</a>
                            <a href="#">运动表</a>
                            <a href="#">学生表</a>
                            <a href="#">军表</a>
                            <a class="highlight" href="#">陶瓷表</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>眼镜</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">太阳镜</a>
                            <a class="highlight" href="#">墨镜</a>
                            <a href="#">眼镜框</a>
                            <a href="#">近视眼镜</a>
                            <a href="#">防辐射眼镜</a>
                            <a href="#">老花镜</a>
                            <a href="#">司机镜</a>
                            <a class="highlight" href="#">偏光镜</a>
                            <a href="#">驾驶镜</a>
                            <a href="#">3D眼镜</a>
                            <a href="#">雷朋</a>
                            <a class="highlight" href="#">暴龙</a>
                            <a href="#">宝岛眼镜</a>
                            <a href="#">oakley</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>烟具</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">电子烟</a>
                            <a href="#">烟盒</a>
                            <a href="#">烟斗</a>
                            <a href="#">烟嘴</a>
                            <a href="#">烟油</a>
                            <a class="highlight" href="#">蒸汽烟</a>
                            <a href="#">水烟</a>
                            <a href="#">戒烟</a>
                            <a href="#">女士烟</a>
                            <a href="#">鼻烟</a>
                            <a href="#">雪茄</a>
                        </div>
                    </div>
                </div>
                <div class="detail-logo">
                    <a href="#"><img src="" data-src="img/detail/barnd1.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd2.png"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd3.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd4.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd5.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd6.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd7.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd8.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd9.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd10.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd11.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd12.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd13.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd14.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd15.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd16.jpg"></a>
                </div>
            </div><!-- end detail10 -->
            <div class="detail detail11 clear">
                <div class="detail-word">
                    <div class="hot-word-line clear">
                        <h3>
                            <span>热门手机</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">小米</a>
                            <a class="highlight" href="#">iPhone</a>
                            <a href="#">魅族</a>
                            <a href="#">荣耀</a>
                            <a href="#">乐视</a>
                            <a href="#">OPPO</a>
                            <a href="#">vivo</a>
                            <a href="#">三星</a>
                            <a href="#">华为</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>特色手机</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">YunOS</a>
                            <a class="highlight" href="#">千元指纹</a>
                            <a href="#">双卡双待</a>
                            <a href="#">大屏</a>
                            <a class="highlight" href="#">自拍</a>
                            <a href="#">移动</a>
                            <a href="#">联通</a>
                            <a href="#">电信</a>
                            <a href="#">合约机</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>手机特惠</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">打折秒杀</a>
                            <a href="#">新品特卖</a>
                            <a class="highlight" href="#">实惠精选</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>电脑整机</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">笔记本</a>
                            <a class="highlight" href="#">平板电脑</a>
                            <a href="#">台式机</a>
                            <a href="#">一体机</a>
                            <a class="highlight" href="#">DIY</a>
                            <a href="#">游戏本</a>
                            <a href="#">iPad</a>
                            <a href="#">Surface</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>智能数码</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">智能设备</a>
                            <a href="#">智能手表</a>
                            <a href="#">智能手环</a>
                            <a href="#">手机配件</a>
                            <a class="highlight" href="#">智能飞行</a>
                            <a href="#">智能摄像</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>游戏组装</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">DIY电脑</a>
                            <a class="highlight" href="#">竞技DIY</a>
                            <a href="#">显示器</a>
                            <a href="#">游戏本</a>
                            <a href="#">机械键盘</a>
                            <a href="#">XBOX</a>
                            <a href="#">游戏手柄</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>硬件存储</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">显示器</a>
                            <a class="highlight" href="#">机械键盘</a>
                            <a class="highlight" href="#">固体硬盘</a>
                            <a href="#">CPU</a>
                            <a href="#">显卡</a>
                            <a href="#">主板</a>
                            <a href="#">高速U盘</a>
                            <a href="#">路由器</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>摄影摄像</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">相机</a>
                            <a class="highlight" href="#">单反</a>
                            <a class="highlight" href="#">单电微单</a>
                            <a href="#">摄像机</a>
                            <a href="#">自拍神器</a>
                            <a href="#">拍立得</a>
                            <a class="highlight" href="#">镜头</a>
                            <a class="highlight" href="#">自拍杆</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>影音娱乐</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">耳机</a>
                            <a class="highlight" href="#">天猫魔盒</a>
                            <a href="#">数码影音</a>
                            <a class="highlight" href="#">家庭影院</a>
                            <a href="#">蓝牙耳机</a>
                            <a href="#">网络播放器</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>办公文教</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">文具</a>
                            <a href="#">电子书</a>
                            <a class="highlight" href="#">电子词典／学习机</a>
                            <a href="#">笔类／书写工具</a>
                            <a href="#">书画工具</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>数码配件</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">手机配件</a>
                            <a class="highlight" href="#">苹果配件</a>
                            <a class="highlight" href="#">笔记本配件</a>
                            <a href="#">平板配件</a>
                            <a href="#">相机配件</a>
                            <a href="#">手机车载配件</a>
                            <a href="#">kindle配件</a>
                            <a href="#">充电宝</a>
                            <a class="highlight" href="#">自拍杆</a>
                            <a class="highlight" href="#">数据线</a>
                            <a href="#">电池</a>
                        </div>
                    </div>
                </div>
                <div class="detail-logo">
                    <a href="#"><img src="" data-src="img/detail/barnd1.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd2.png"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd3.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd4.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd5.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd6.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd7.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd8.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd9.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd10.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd11.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd12.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd13.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd14.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd15.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd16.jpg"></a>
                </div>
            </div><!-- end detail11 -->
            <div class="detail detail12 clear">
                <div class="detail-word">
                    <div class="hot-word-line clear">
                        <h3>
                            <span>童装</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">套装</a>
                            <a class="highlight" href="#">裤子</a>
                            <a class="highlight" href="#">连衣裙</a>
                            <a class="highlight" href="#">T恤</a>
                            <a href="#">外套</a>
                            <a href="#">亲子装</a>
                            <a href="#">内衣裤</a>
                            <a href="#">家居服</a>
                            <a href="#">儿童袜子</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>婴儿服</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">连体衣</a>
                            <a class="highlight" href="#">内衣套装</a>
                            <a class="highlight" href="#">裤子</a>
                            <a class="highlight" href="#">婴儿礼盒</a>
                            <a href="#">外套</a>
                            <a href="#">家居服</a>
                            <a href="#">T恤</a>
                            <a href="#">反穿衣</a>
                            <a href="#">肚兜</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>童鞋</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">运动鞋</a>
                            <a class="highlight" href="#">学步鞋</a>
                            <a href="#">凉鞋</a>
                            <a href="#">帆布鞋</a>
                            <a class="highlight" href="#">皮鞋</a>
                            <a href="#">拖鞋</a>
                            <a href="#">雨靴</a>
                            <a class="highlight" href="#">靴子</a>
                            <a href="#">亲子鞋</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>车床用品</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">婴儿推车</a>
                            <a href="#">学步车</a>
                            <a href="#">安全座椅</a>
                            <a class="highlight" href="#">婴儿背带</a>
                            <a href="#">腰凳</a>
                            <a href="#">婴儿床</a>
                            <a class="highlight" href="#">餐椅</a>
                            <a href="#">睡袋</a>
                            <a href="#">抱被</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>喂养</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">奶瓶</a>
                            <a href="#">奶嘴</a>
                            <a class="highlight" href="#">水杯</a>
                            <a href="#">餐具</a>
                            <a class="highlight" href="#">消毒锅</a>
                            <a href="#">辅食机</a>
                            <a href="#">调奶器</a>
                            <a href="#">暖奶器</a>
                            <a href="#">围嘴</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>洗护</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">洗发水</a>
                            <a href="#">沐浴露</a>
                            <a class="highlight" href="#">润肤</a>
                            <a href="#">浴盆</a>
                            <a class="highlight" href="#">湿巾</a>
                            <a href="#">洗衣液</a>
                            <a class="highlight" href="#">洗衣皂</a>
                            <a href="#">理发器</a>
                            <a href="#">驱虫止痒</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>玩具</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">婴儿玩具</a>
                            <a class="highlight" href="#">儿童自行车</a>
                            <a href="#">儿童电动车</a>
                            <a class="highlight" href="#">毛绒玩具</a>
                            <a href="#">积木</a>
                            <a href="#">电动遥控</a>
                            <a href="#">儿童箱包</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>天猫动漫</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">动漫周边</a>
                            <a href="#">影视周边</a>
                            <a href="#">手办</a>
                            <a href="#">高达</a>
                            <a class="highlight" href="#">魔术道具</a>
                            <a class="highlight" href="#">COSPLAY</a>
                            <a href="#">桌游</a>
                            <a href="#">变形金刚</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>奶粉</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">牛奶粉</a>
                            <a class="highlight" href="#">羊奶粉</a>
                            <a href="#">特殊配方奶粉</a>
                            <a href="#">宝宝辅食</a>
                            <a class="highlight" href="#">宝宝零食</a>
                            <a class="highlight" href="#">宝宝营养</a>
                            <a href="#">DHA</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>纸尿裤</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">纸尿裤</a>
                            <a class="highlight" href="#">拉拉裤</a>
                            <a href="#">纸尿片</a>
                            <a class="highlight" href="#">L</a>
                            <a href="#">XL</a>
                            <a href="#">M</a>
                            <a href="#">S</a>
                            <a href="#">NB</a>
                            <a class="highlight" href="#">新生儿组合</a>

                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>孕产</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">孕产用品</a>
                            <a class="highlight" href="#">孕妈洗护</a>
                            <a href="#">孕妈装</a>
                            <a class="highlight" href="#">月子服</a>
                            <a class="highlight" href="#">哺乳文胸</a>
                            <a class="highlight" href="#">防辐射</a>
                            <a href="#">吸奶器</a>
                            <a href="#">待产包</a>
                        </div>
                    </div>
                </div>
                <div class="detail-logo">
                    <a href="#"><img src="" data-src="img/detail/barnd1.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd2.png"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd3.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd4.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd5.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd6.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd7.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd8.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd9.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd10.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd11.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd12.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd13.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd14.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd15.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd16.jpg"></a>
                </div>
            </div><!-- end detail12 -->
            <div class="detail detail13 clear">
                <div class="detail-word">
                    <div class="hot-word-line clear">
                        <h3>
                            <span>进口食品</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">进口零食</a>
                            <a class="highlight" href="#">进口巧克力</a>
                            <a class="highlight" href="#">进口饼干</a>
                            <a href="#">进口糖果</a>
                            <a href="#">进口坚果</a>
                            <a href="#">进口果干</a>
                            <a href="#">进口橄榄油</a>
                            <a href="#">进口牛奶</a>
                            <a href="#">进口咖啡</a>
                            <a href="#">进口饮料</a>
                            <a href="#">进口葡萄酒</a>
                            <a class="highlight" href="#">进口洋酒</a>
                            <a href="#">进口啤酒</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>休闲零食</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">零食</a>
                            <a class="highlight" href="#">坚果</a>
                            <a class="highlight" href="#">饼干</a>
                            <a href="#">蛋糕</a>
                            <a href="#">红枣</a>
                            <a href="#">巧克力</a>
                            <a href="#">猪肉脯</a>
                            <a class="highlight" href="#">膨化食品</a>
                            <a href="#">蜜饯</a>
                            <a href="#">鸭脖</a>
                            <a href="#">糖果</a>
                            <a class="highlight" href="#">豆干</a>
                            <a href="#">曲奇</a>
                            <a href="#">海苔</a>
                            <a class="highlight" href="#">肉松饼</a>
                            <a class="highlight" href="#">牛肉干</a>
                            <a href="#">鱿鱼丝</a>
                            <a href="#">糕点</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>酒类</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">白酒</a>
                            <a class="highlight" href="#">红酒</a>
                            <a class="highlight" href="#">洋酒</a>
                            <a href="#">啤酒</a>
                            <a href="#">黄酒</a>
                            <a class="highlight" href="#">保健酒</a>
                            <a href="#">预调酒</a>
                            <a href="#">配制酒</a>
                            <a href="#">葡萄酒</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>茶叶</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">西湖龙井</a>
                            <a href="#">安吉白茶</a>
                            <a href="#">绿茶</a>
                            <a href="#">大红袍</a>
                            <a class="highlight" href="#">铁观音</a>
                            <a class="highlight" href="#">普洱茶</a>
                            <a class="highlight" href="#">玫瑰花茶</a>
                            <a href="#">柠檬片</a>
                            <a class="highlight" href="#">菊花茶</a>
                            <a href="#">花茶</a>
                            <a href="#">天然粉粉</a>
                            <a href="#">金骏眉</a>
                            <a href="#">红茶</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>乳品冲饮</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">牛奶</a>
                            <a class="highlight" href="#">酸奶</a>
                            <a href="#">成人奶粉</a>
                            <a href="#">儿童奶</a>
                            <a class="highlight" href="#">速溶咖啡</a>
                            <a href="#">滤挂咖啡</a>
                            <a href="#">咖啡豆</a>
                            <a class="highlight" href="#">麦片</a>
                            <a class="highlight" href="#">奶茶</a>
                            <a href="#">柚子茶</a>
                            <a href="#">果汁</a>
                            <a href="#">汽水</a>
                            <a href="#">功能饮料</a>
                            <a href="#">饮用水</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>粮油速食</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">橄榄油</a>
                            <a href="#">食用油</a>
                            <a class="highlight" href="#">大米</a>
                            <a class="highlight" href="#">薏米</a>
                            <a href="#">玉米</a>
                            <a href="#">面粉</a>
                            <a href="#">银耳</a>
                            <a href="#">桂圆干</a>
                            <a href="#">香肠</a>
                            <a href="#">木耳</a>
                            <a href="#">香菇</a>
                            <a class="highlight" href="#">方便面</a>
                            <a href="#">手抓饼</a>
                            <a href="#">黄油</a>
                            <a href="#">意大利面</a>
                            <a href="#">蛋挞皮</a>
                            <a href="#">调味品</a>
                            <a href="#">红糖</a>
                            <a href="#">进口泡面</a>
                            <a class="highlight" href="#">粽子</a>
                            <a href="#">寿司</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>生鲜水果</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a  class="highlight" href="#">牛排</a>
                            <a  class="highlight" href="#">芒果</a>
                            <a href="#">奇异果</a>
                            <a href="#">蟹</a>
                            <a href="#">三文鱼</a>
                            <a href="#">虾</a>
                            <a href="#">车厘子</a>
                            <a href="#">进口鳕鱼</a>
                            <a  class="highlight" href="#">海参</a>
                            <a href="#">苹果</a>
                            <a href="#">榴莲</a>
                            <a href="#">牛肉</a>
                            <a  class="highlight" href="#">牛油果</a>
                            <a href="#">土鸡</a>
                            <a href="#">冰淇淋</a>
                            <a href="#">鸡蛋</a>
                        </div>
                    </div>
                </div>
                <div class="detail-logo">
                    <a href="#"><img src="" data-src="img/detail/barnd1.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd2.png"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd3.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd4.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd5.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd6.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd7.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd8.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd9.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd10.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd11.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd12.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd13.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd14.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd15.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd16.jpg"></a>
                </div>
            </div><!-- end detail13 -->
            <div class="detail detail14 clear">
                <div class="detail-word">
                    <div class="hot-word-line clear">
                        <h3>
                            <span>新鲜蔬菜</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">土豆</a>
                            <a class="highlight" href="#">番薯</a>
                            <a class="highlight" href="#">山药</a>
                            <a href="#">莲藕</a>
                            <a href="#">净菜</a>
                            <a class="highlight" href="#">玉米</a>
                            <a href="#">秋葵</a>
                            <a href="#">大蒜</a>
                            <a href="#">生姜</a>
                            <a href="#">南瓜</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>冰淇淋</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">冰淇淋</a>
                            <a class="highlight" href="#">哈根达斯</a>
                            <a class="highlight" href="#">movenpick莫凡彼</a>
                            <a href="#">本杰瑞</a>
                            <a href="#">tip-top冰淇淋</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>蛋类</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">鸡蛋</a>
                            <a class="highlight" href="#">鸭蛋</a>
                            <a class="highlight" href="#">鹅蛋</a>
                            <a href="#">鸽子蛋</a>
                            <a class="highlight" href="#">鹌鹑蛋</a>
                            <a href="#">松花皮蛋</a>
                            <a href="#">咸鸭蛋</a>
                            <a href="#">喜蛋</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>肉类</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">牛排</a>
                            <a href="#">牛腩</a>
                            <a href="#">牛腱子</a>
                            <a class="highlight" href="#">牛肉</a>
                            <a href="#">牛尾</a>
                            <a class="highlight" href="#">牛肉串</a>
                            <a class="highlight" href="#">牛杂</a>
                            <a href="#">羊腿</a>
                            <a class="highlight" href="#">羊排</a>
                            <a href="#">羊肉串</a>
                            <a href="#">羊蝎子</a>
                            <a href="#">鸡肉</a>
                            <a href="#">鸡翅</a>
                            <a class="highlight" href="#">鸡胸</a>
                            <a href="#">鸡腿</a>
                            <a href="#">鸭肉</a>
                            <a href="#">乳鸽</a>
                            <a href="#">鹅肉</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>海鲜水产</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">鳕鱼</a>
                            <a class="highlight" href="#">三文鱼</a>
                            <a href="#">金枪鱼</a>
                            <a href="#">鲽鱼</a>
                            <a href="#">斑鱼</a>
                            <a href="#">比目鱼</a>
                            <a class="highlight" href="#">多春鱼</a>
                            <a href="#">马鲛鱼</a>
                            <a href="#">龙利鱼</a>
                            <a class="highlight" href="#">秋刀鱼</a>
                            <a href="#">带鱼</a>
                            <a href="#">海带</a>
                            <a class="highlight" href="#">墨鱼</a>
                            <a class="highlight" href="#">海参</a>
                            <a href="#">海蜇</a>
                            <a href="#">鱿鱼</a>
                            <a href="#">甲鱼</a>
                            <a href="#">大闸蟹</a>
                            <a href="#">帝王蟹</a>
                            <a href="#">雪蟹</a>
                            <a href="#">黄金蟹</a>
                            <a href="#">鱼丸</a>
                            <a href="#">鱼糕/鱼饼</a>
                            <a href="#">干贝/瑶柱</a>
                            <a href="#">虾仁</a>
                            <a href="#">活虾</a>
                            <a href="#">冻虾</a>
                            <a href="#">生蚝</a>
                            <a href="#">北极贝</a>
                            <a href="#">扇贝</a>
                            <a href="#">贝类</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>新鲜水果</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">奇异果</a>
                            <a href="#">车厘子/樱桃</a>
                            <a class="highlight" href="#">芒果</a>
                            <a href="#">牛油果</a>
                            <a href="#">火龙果</a>
                            <a href="#">苹果</a>
                            <a href="#">橙子</a>
                            <a href="#">凤梨</a>
                            <a href="#">榴莲</a>
                            <a href="#">山竹</a>
                            <a class="highlight" href="#">木瓜</a>
                            <a href="#">柠檬</a>
                            <a href="#">百香果</a>
                            <a href="#">椰青</a>
                            <a class="highlight" href="#">番荔枝/释迦</a>
                            <a class="highlight" href="#">龙眼</a>
                            <a href="#">蓝莓</a>
                            <a href="#">梨</a>
                            <a href="#">提子</a>
                            <a href="#">柚子</a>
                            <a href="#">芭乐</a>
                            <a href="#">莲雾</a>
                            <a href="#">桃</a>
                            <a href="#">草莓</a>
                            <a href="#">西柚</a>
                            <a class="highlight" href="#">荔枝</a>
                            <a class="highlight" href="#">石榴</a>
                            <a href="#">葡萄/提子</a>
                            <a href="#">哈密瓜</a>
                            <a href="#">枇杷</a>
                            <a href="#">李子</a>
                            <a href="#">西瓜</a>
                            <a href="#">菠萝</a>
                            <a href="#">桔子</a>
                            <a href="#">香蕉</a>
                            <a href="#">杨桃</a>
                            <a href="#">红毛丹/毛荔枝</a>

                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>精选干货</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">干贝/瑶柱</a>
                            <a class="highlight" href="#">虾皮/虾米/海米</a>
                            <a class="highlight" href="#">大虾干</a>
                            <a href="#">花胶/鱼胶</a>
                            <a href="#">海带</a>
                            <a href="#">紫菜</a>
                            <a href="#">鱼干</a>
                            <a href="#">墨鱼干</a>
                        </div>
                    </div>
                </div>
                <div class="detail-logo">
                    <a href="#"><img src="" data-src="img/detail/barnd1.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd2.png"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd3.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd4.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd5.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd6.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd7.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd8.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd9.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd10.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd11.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd12.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd13.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd14.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd15.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd16.jpg"></a>
                </div>
            </div><!-- end detail14 -->
            <div class="detail detail15 clear">
                <div class="detail-word">
                    <div class="hot-word-line clear">
                        <h3>
                            <span>平板电视</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">4K超高清</a>
                            <a href="#">国产</a>
                            <a class="highlight" href="#">外资品牌</a>
                            <a class="highlight" href="#">曲面</a>
                            <a href="#">智能电视</a>
                            <a href="#">超级大屏</a>
                            <a href="#">云电视</a>
                            <a href="#">客厅首选</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>空调</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">热门之选</a>
                            <a class="highlight" href="#">节能</a>
                            <a class="highlight" href="#">智能</a>
                            <a href="#">变频</a>
                            <a href="#">艺术柜机</a>
                            <a href="#">挂机</a>
                            <a class="highlight" href="#">1.5匹</a>
                            <a href="#">中央空调</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>冰箱</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">热门之选</a>
                            <a class="highlight" href="#">无霜</a>
                            <a class="highlight" href="#">三门</a>
                            <a href="#">对开门</a>
                            <a class="highlight" href="#">电脑温控</a>
                            <a href="#">智能</a>
                            <a href="#">冷柜</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>洗衣机</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">热门</a>
                            <a href="#">滚筒洗</a>
                            <a href="#">波轮洗</a>
                            <a href="#">大容量</a>
                            <a class="highlight" href="#">智能洗</a>
                            <a class="highlight" href="#">洗烘一体</a>
                            <a href="#">迷你</a>
                            <a href="#">烘干机</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>厨房大电</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">烟灶套装</a>
                            <a href="#">侧吸油烟机</a>
                            <a href="#">欧式油烟机</a>
                            <a class="highlight" href="#">燃气灶</a>
                            <a class="highlight" href="#">消毒柜</a>
                            <a href="#">洗碗机</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>热水器</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">电热水器</a>
                            <a href="#">燃气热水器</a>
                            <a href="#">遥控</a>
                            <a class="highlight" href="#">恒温</a>
                            <a href="#">小厨宝</a>
                            <a class="highlight" href="#">太阳能</a>
                            <a href="#">即热式</a>
                            <a href="#">空气能</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>中式厨房</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">净水器</a>
                            <a href="#">电饭煲</a>
                            <a href="#">豆浆机</a>
                            <a href="#">电热水壶</a>
                            <a href="#">电压力锅</a>
                            <a class="highlight" href="#">电磁炉</a>
                            <a href="#">养生壶</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>西式厨房</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">烤箱</a>
                            <a href="#">料理机</a>
                            <a href="#">微波炉</a>
                            <a class="highlight" href="#">榨汁机</a>
                            <a class="highlight" href="#">原汁机</a>
                            <a href="#">面包机</a>
                            <a href="#">咖啡机</a>
                            <a href="#">电炸锅</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>生活电器</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">扫地机器人</a>
                            <a class="highlight" href="#">空气净化器</a>
                            <a href="#">吸尘器</a>
                            <a href="#">除湿机</a>
                            <a href="#">电风扇</a>
                            <a href="#">挂烫机</a>
                            <a href="#">干衣机</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>个护健康</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a href="#">剃须刀</a>
                            <a class="highlight" href="#">吹风机</a>
                            <a class="highlight" href="#">电动牙刷</a>
                            <a class="highlight" href="#">体重秤</a>
                            <a href="#">理发器</a>
                            <a href="#">足浴器</a>
                            <a href="#">按摩椅</a>
                        </div>
                    </div>
                    <div class="hot-word-line clear">
                        <h3>
                            <span>精品推荐</span>
                            <i class="iconfont title-icon">&#xe620;</i>
                        </h3>
                        <div class="line-con">
                            <a class="highlight" href="#">脱毛器</a>
                            <a href="#">吊扇</a>
                            <a href="#">冰淇淋机</a>
                            <a href="#">碎冰机</a>
                            <a class="highlight" href="#">空调扇</a>
                            <a class="highlight" href="#">瘦身带</a>
                            <a class="highlight" href="#">冷饮机</a>
                            <a href="#">炒冰机</a>
                            <a href="#">电子灭蚊器</a>
                            <a href="#">冰淇淋机</a>
                            <a href="#">除湿机</a>
                            <a href="#">干衣机</a>
                        </div>
                    </div>
                </div>
                <div class="detail-logo">
                    <a href="#"><img src="" data-src="img/detail/barnd1.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd2.png"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd3.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd4.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd5.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd6.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd7.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd8.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd9.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd10.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd11.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd12.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd13.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd14.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd15.jpg"></a>
                    <a href="#"><img src="" data-src="img/detail/barnd16.jpg"></a>
                </div>
            </div><!-- end detail15 -->
        </div><!-- end cg-detail -->
        <script>
            $(function () {
                $('div.line-con a').mouseover(function(){
                    var name = $(this).text();
                    // alert(name);
                    $(this).attr("href",  "<%=request.getContextPath()%>/searchProduct?keyword="+name);
                });
            });
        </script>
    </div><!-- end catagory -->
    <!-- banner -->
    <div id="banner">
        <div class="banner-bg bg0"><!-- 宽度100%纯色背景层 -->
            <div class="bn-container bn-container0"><!-- 控制banner内容整体居中 -->
                <div class="banner-con"><!-- 控制banner图片的宽度 -->
                    <a class="big-banner" href="#"><img src="img/banner1.jpg"></a>
                </div>
            </div>
        </div>
        <div class="banner-bg bg1">
            <div class="bn-container bn-container1">
                <div class="banner-con">
                    <a class="big-banner" href="#"><img src="img/banner2.jpg"></a>
                    <a class="small-banner0" href="#"><img src="img/banner-ad1.png"></a>
                    <a class="small-banner1" href="#"><img src="img/banner-ad2.png"></a>
                </div>
            </div>
        </div>
        <div class="banner-bg bg2">
            <div class="bn-container bn-container2">
                <div class="banner-con">
                    <a class="big-banner" href="#"><img src="img/banner3.jpg"></a>
                </div>
            </div>
        </div>
        <div class="banner-bg bg3">
            <div class="bn-container bn-container3">
                <div class="banner-con">
                    <a class="big-banner" href="#"><img src="img/banner4.jpg"></a>
                </div>
            </div>
        </div>
        <div class="banner-bg bg4">
            <div class="bn-container bn-container4">
                <div class="banner-con">
                    <a class="big-banner" href="#"><img src="img/banner5.jpg"></a>
                    <a class="small-banner0" href="#"><img src="img/banner-ad3.png"></a>
                    <a class="small-banner1" href="#"><img src="img/banner-ad4.png"></a>
                </div>
            </div>
        </div>
        <div class="banner-bg bg5">
            <div class="bn-container bn-container5">
                <div class="banner-con">
                    <a class="big-banner" href="#"><img src="img/banner6.jpg"></a>
                    <a class="small-banner0" href="#"><img src="img/banner-ad2.png"></a>
                    <a class="small-banner1" href="#"><img src="img/banner-ad6.png"></a>
                </div>
            </div>
        </div>
        <ul class="slider-nav">
            <li class="active"></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
        </ul><!-- end slider-nav -->
        <div id="vip">
            <div class="vip-con">
                <div class="avatar">
                    <div class="default"></div>
                    <img class="logged" src="img/vip-avatar.jpg">
                </div>
                <div class="login default">
                    <p>Hi~你好！</p>
                    <a class="login-btn" href="login.html">
                        <i class="iconfont">&#xe63a;</i>
                        请登录
                    </a>
                    <a class="register" href="register.html">免费注册 &gt;</a>
                    <span class="seprate"></span>
                </div>
                <div class="login logged">
                    <p>亲爱的<br><span class="vip-name"></span><br>欢迎回来！</p>
                    <span class="seprate"></span>
                </div>
                <div class="more-info default">
                    <ul>
                        <li><i class="iconfont vip-icon">&#xe61c;</i><span>退货保障</span></li>
                        <li><i class="iconfont vip-icon">&#xe61a;</i><span>花呗分期</span></li>
                        <li><i class="iconfont vip-icon">&#xe61b;</i><span>极速退款</span></li>
                    </ul>
                    <a href="#">更多特权&gt;</a>
                </div>
                <div class="more-info logged">
                    <a href="#">
                        <p><i class="iconfont vip-icon"></i>我的积分</p>
                        <span class="score number"></span>
                    </a>
                    <span class="seprate"></span>
                    <a href="#">
                        <p><i class="iconfont vip-icon"></i>我的优惠券</p>
                        <span id="coupon" class="number"></span> 张
                    </a>
                </div>
                <div class="recommend">
                    <p>推荐活动</p>
                    <a href="#">
                        <img src="img/recommend.jpg" alt="推荐活动">
                        <span>氨基酸洗面奶</span>
                        <span>999积分</span>
                    </a>
                </div>
            </div>
        </div>
    </div><!-- end banner -->
    <!-- hot-brand -->
    <div class="hot-brand module">
        <h3 class="module-title">热门品牌 <span>HOT BRANDS</span></h3>
        <div class="module-body clear">
            <div class="poster">
                <img src="" data-src="img/content/brand.jpg">
            </div>
            <ul class="brand-list">
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand1.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>优惠券 ￥30</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand2.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>关注人数 108.1万</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand3.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>优惠券 ￥30</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand4.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>关注人数 108.1万</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand5.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>优惠券 ￥30</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand6.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>关注人数 108.1万</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand7.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>优惠券 ￥30</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand8.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>关注人数 108.1万</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand9.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>优惠券 ￥30</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand10.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>关注人数 108.1万</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand11.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>优惠券 ￥30</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand12.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>关注人数 108.1万</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand1.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>优惠券 ￥30</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand2.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>关注人数 108.1万</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand3.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>优惠券 ￥30</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand4.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>关注人数 108.1万</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand5.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>优惠券 ￥30</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand6.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>关注人数 108.1万</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand7.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>优惠券 ￥30</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand8.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>关注人数 108.1万</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand9.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>优惠券 ￥30</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand10.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>关注人数 108.1万</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-item">
                    <h4><img src="" data-src="img/content/brand11.jpg"></h4>
                    <div class="mask">
                        <i class="iconfont">&#xe635;</i>
                        <p>优惠券 ￥30</p>
                        <a href="#">点击进入</a>
                    </div>
                </li>
                <li class="brand-fresh">
                    <a href="#">
                        <i class="iconfont rotate-icon">&#xe62e;</i>
                        <span>换一批</span>
                    </a>
                </li>
            </ul><!-- end brand-list -->
            <ul class="recommend-brand">
                <li>
                    <a href="#">
                        <div class="brand-logo">
                            <img src="" data-src="img/content/rec1.jpg">
                        </div>
                        <div class="meta">
                            <h4>正夏清爽换新</h4>
                            <p>都是你想要的新品</p>
                        </div>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <div class="brand-logo">
                            <img src="" data-src="img/content/rec2.jpg">
                        </div>
                        <div class="meta">
                            <h4>青春就要多彩</h4>
                            <p>岂止是5折</p>
                        </div>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <div class="brand-logo">
                            <img src="" data-src="img/content/rec3.jpg">
                        </div>
                        <div class="meta">
                            <h4>荣耀热销手机特惠</h4>
                            <p>购机送百元豪礼</p>
                        </div>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <div class="brand-logo">
                            <img src="" data-src="img/content/rec4.jpg">
                        </div>
                        <div class="meta">
                            <h4>夏季新品</h4>
                            <p>新品航海熊</p>
                        </div>
                    </a>
                </li>
            </ul>
        </div>
    </div><!-- end hot-brand -->
    <!-- cahnnel -->
    <ul class="channel module">
        <li class="channel-item">
            <h3>
                <i class="iconfont channel-icon">&#xe629;</i>
                <span>潮流前沿</span>
            </h3>
            <div>
                <a class="recommend-item" href="#">
                    <h4>焕新</h4>
                    <p>品牌精选新品</p>
                    <img src="" data-src="img/content/channel3.jpg">
                </a>
                <span class="seprate"></span>
                <a class="recommend-item" href="#">
                    <h4>全球时尚</h4>
                    <p>大牌精致时尚</p>
                    <img src="" data-src="img/content/channel1.jpg">
                </a>
            </div>
        </li>
        <li class="channel-item">
            <h3>
                <i class="iconfont channel-icon">&#xe618;</i>
                <span>手机酷玩</span>
            </h3>
            <div>
                <a class="recommend-item" href="#">
                    <h4>天天搞机</h4>
                    <p>品选择下一部手机</p>
                    <img src="" data-src="img/content/channel2.jpg">
                </a>
                <span class="seprate"></span>
                <a class="recommend-item" href="#">
                    <h4>酷玩街</h4>
                    <p>潮炫创意智能</p>
                    <img src="" data-src="img/content/channel7.jpg">
                </a>
            </div>
        </li>
        <li class="channel-item">
            <h3>
                <i class="iconfont channel-icon">&#xe624;</i>
                <span>品质生活</span>
            </h3>
            <div>
                <a class="recommend-item" href="#">
                    <h4>必抢</h4>
                    <p>购物券翻倍减</p>
                    <img src="" data-src="img/content/channel9.jpg">
                </a>
                <span class="seprate"></span>
                <a class="recommend-item" href="#">
                    <h4>喵鲜生</h4>
                    <p>全进口好生鲜</p>
                    <img src="" data-src="img/content/channel4.jpg">
                </a>
            </div>
        </li>
        <li class="channel-item">
            <h3>
                <i class="iconfont channel-icon">&#xe611;</i>
                <span>国际海购</span>
            </h3>
            <div>
                <a class="recommend-item" href="#">
                    <h4>识货</h4>
                    <p>全球最新最热好货</p>
                    <img src="" data-src="img/content/channel6.jpg">
                </a>
                <span class="seprate"></span>
                <a class="recommend-item" href="#">
                    <h4>海外直营</h4>
                    <p>海外直采特卖</p>
                    <img src="" data-src="img/content/channel5.jpg">
                </a>
            </div>
        </li>
        <li class="channel-item last">
            <h3>
                <i class="iconfont channel-icon">&#xe61f;</i>
                <span>个性推荐</span>
            </h3>
            <div>
                <a class="recommend-item" href="#">
                    <h4>布置小家</h4>
                    <p>格调摆件低价</p>
                    <img src="" data-src="img/content/channel10.jpg">
                </a>
                <span class="seprate"></span>
                <a class="recommend-item" href="#">
                    <h4>疯狂吃货</h4>
                    <p>零食9元起！</p>
                    <img src="" data-src="img/content/channel8.jpg">
                </a>
            </div>
        </li>
    </ul><!-- end channel -->
    <!-- floor -->
    <div class="floor container">
        <div class="ad">
            <a href="#"><img src="" data-src="img/content/ad1.jpg"></a>
        </div>
        <div class="floor-QZSG module" id="floor-QZSG">
            <h3 class="module-title">亲子时光
                <i class="data-color-mark"> </i>
                <span>KID & BABY</span>
            </h3>
            <ul class="hot-nav">
                <li><a href="#">童装</a></li>
                <li><a href="#">玩具</a></li>
                <li><a href="#">待产用品</a></li>
                <li><a href="#">文教用品</a></li>
                <li><a href="#">宝宝用品</a></li>
                <li><a href="#">儿童床品</a></li>
                <li><a href="#">奶粉</a></li>
                <li><a href="#">童书</a></li>
                <li><a href="#">纸尿裤</a></li>
            </ul>
            <div class="module-body clear">
                <div class="module-banner">
                    <a href="#">
                        <img src="" data-src="img/content/QZSG.jpg">
                        <div class="hot-con">
                            <div class="hot-slider">
                                <ul class="slider-list">
                                    <li>乳房护理我最强 &gt;</li>
                                    <li>吸奶家族大集合 &gt;</li>
                                    <li>进口大牌疯狂购 &gt;</li>
                                    <li>乳房护理我最强 &gt;</li>
                                </ul>
                            </div>
                            <div class="hot-recommend">
                                <h4>哺乳妈妈清单</h4>
                                <p>大肚皮日记第6篇</p>
                                <span class="decoration"></span>
                            </div>
                        </div>
                    </a>
                </div>
                <ul class="module-list hot-list">
                    <li>
                        <a href="#">
                            <h4>暑假狂欢季</h4>
                            <p>品牌书包专场</p>
                            <img src="" data-src="img/content/QZSG4.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>夏季童鞋大爆炸</h4>
                            <p>时尚潮流男童女童凉鞋</p>
                            <img src="" data-src="img/content/QZSG3.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>卡通纯棉儿童内裤</h4>
                            <p>精美礼盒四条装</p>
                            <img src="" data-src="img/content/QZSG8.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>夏季尚新</h4>
                            <p>时尚孕妇连衣裙</p>
                            <img src="" data-src="img/content/QZSG7.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>迪士尼出游季</h4>
                            <p>加厚2CM 健康安全</p>
                            <img src="" data-src="img/content/QZSG6.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>步步高暑期钜惠</h4>
                            <p>语数外同步点卖</p>
                            <img src="" data-src="img/content/QZSG5.jpg">
                        </a>
                    </li>
                </ul>
                <ul class="module-list recommend-list">
                    <li>
                        <a href="#">
                            <h4>学习手机</h4>
                            <p>教你做学霸</p>
                            <img src="" data-src="img/content/QZSG2.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>儿童图书</h4>
                            <p>宝宝都爱读的童话书</p>
                            <img src="" data-src="img/content/QZSG9.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>暑假狂欢</h4>
                            <p>泳池派对</p>
                            <img src="" data-src="img/content/QZSG1.jpg">
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="floor-HWCX module" id="floor-HWCX">
            <h3 class="module-title">户外出行
                <i class="data-color-mark"> </i>
                <span>OUTDOORS & AUTOMOTIVE</span>
            </h3>
            <ul class="hot-nav">
                <li><a href="#">车秒货</a></li>
                <li><a href="#">皮肤衣</a></li>
                <li><a href="#">运动鞋</a></li>
                <li><a href="#">4s保养</a></li>
                <li><a href="#">宝行车记录仪</a></li>
                <li><a href="#">轮胎</a></li>
            </ul>
            <div class="module-body clear">
                <div class="module-banner">
                    <a href="#">
                        <img src="" data-src="img/content/HWCX.jpg">
                        <div class="hot-con">
                            <div class="hot-slider">
                                <ul class="slider-list">
                                    <li>夏季套装3折起 &gt;</li>
                                    <li>夏季遮肚保守泳衣 &gt;</li>
                                    <li>抢先购 &gt;</li>
                                    <li>夏季套装3折起 &gt;</li>
                                </ul>
                            </div>
                            <div class="hot-recommend">
                                <h4>三伏天你下水了么</h4>
                                <p>裸价疯抢</p>
                                <span class="decoration"></span>
                            </div>
                        </div>
                    </a>
                </div>
                <ul class="module-list hot-list">
                    <li>
                        <a href="#">
                            <h4>标致2008首发</h4>
                            <p>更有好礼相送</p>
                            <img src="" data-src="img/content/HWCX9.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>李宁正品女士泳衣</h4>
                            <p>时尚多款速干保守性感</p>
                            <img src="" data-src="img/content/HWCX2.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>出行必备</h4>
                            <p>涉水穿戴款</p>
                            <img src="" data-src="img/content/HWCX6.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>互联网汽车节</h4>
                            <p>购物券狂欢送</p>
                            <img src="" data-src="img/content/HWCX3.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>特步时尚跑鞋</h4>
                            <p>休闲运动男鞋</p>
                            <img src="" data-src="img/content/HWCX4.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>2016热销爆款</h4>
                            <p>色彩绚丽连体泳衣</p>
                            <img src="" data-src="img/content/HWCX5.jpg">
                        </a>
                    </li>
                </ul>
                <ul class="module-list recommend-list">
                    <li>
                        <a href="#">
                            <h4>加油卡在线充</h4>
                            <p>中石化9.7折起</p>
                            <img src="" data-src="img/content/HWCX10.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>大牌内饰新品首发</h4>
                            <p>送抱枕靠腰赢大礼</p>
                            <img src="" data-src="img/content/HWCX8.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>秋季新品上市</h4>
                            <p>运动或休闲由你定义</p>
                            <img src="" data-src="img/content/HWCX7.jpg">
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="ad">
            <a href="#"><img src="" data-src="img/content/ad2.jpg"></a>
        </div>
        <div class="floor-DZAC module" id="floor-DZAC">
            <h3 class="module-title">打造爱巢
                <i class="data-color-mark"> </i>
                <span>HOME</span>
            </h3>
            <ul class="hot-nav">
                <li><a href="#">家具</a></li>
                <li><a href="#">大家电</a></li>
                <li><a href="#">四件套</a></li>
                <li><a href="#">健康电器</a></li>
                <li><a href="#">厨房电器</a></li>
                <li><a href="#">吸顶灯</a></li>
                <li><a href="#">平板电视</a></li>
                <li><a href="#">装修设计</a></li>
                <li><a href="#">跑步机</a></li>
            </ul>
            <div class="module-body clear">
                <div class="module-banner">
                    <a href="#">
                        <img src="" data-src="img/content/DZAC.jpg">
                        <div class="hot-con">
                            <div class="hot-slider">
                                <ul class="slider-list">
                                    <li>免息6期分期 &gt;</li>
                                    <li>韩电102升租房神奇￥568 &gt;</li>
                                    <li>西门子610升冰箱￥5999 &gt;</li>
                                    <li>免息6期分期 &gt;</li>
                                </ul>
                            </div>
                            <div class="hot-recommend">
                                <h4>三精明煮夫保鲜利器</h4>
                                <p>全国免费预约配送入户</p>
                                <span class="decoration"></span>
                            </div>
                        </div>
                    </a>
                </div>
                <ul class="module-list hot-list">
                    <li>
                        <a href="#">
                            <h4>天猫沙发坐具节</h4>
                            <p>买一送一</p>
                            <img src="" data-src="img/content/DZAC5.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>精明煮夫保险利器</h4>
                            <p>全国免费预约配送入户</p>
                            <img src="" data-src="img/content/DZAC4.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>家有现代</h4>
                            <p>时尚在手</p>
                            <img src="" data-src="img/content/DZAC10.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>平米计价更省钱</h4>
                            <p>轻松焕新家</p>
                            <img src="" data-src="img/content/DZAC1.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>松下品牌特价回馈</h4>
                            <p>一站购齐省心更省薪</p>
                            <img src="" data-src="img/content/DZAC6.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>夏时遇见</h4>
                            <p>感谢有你</p>
                            <img src="" data-src="img/content/DZAC7.jpg">
                        </a>
                    </li>
                </ul>
                <ul class="module-list recommend-list">
                    <li>
                        <a href="#">
                            <h4>给父母一个安心</h4>
                            <p>关爱中老年健康</p>
                            <img src="" data-src="img/content/DZAC9.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>慕思超级品牌日</h4>
                            <p>赢免费欧洲游</p>
                            <img src="" data-src="img/content/DZAC2.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>暑假有特权</h4>
                            <p>为家服务</p>
                            <img src="" data-src="img/content/DZAC3.jpg">
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="floor-JJSH module" id="floor-JJSH">
            <h3 class="module-title">居家生活
                <i class="data-color-mark"> </i>
                <span>GROCERY & HEALTH</span>
            </h3>
            <ul class="hot-nav">
                <li><a href="#">零食</a></li>
                <li><a href="#">牛奶</a></li>
                <li><a href="#">居家饰品</a></li>
                <li><a href="#">保温瓶</a></li>
                <li><a href="#">保健品</a></li>
                <li><a href="#">常用药</a></li>
                <li><a href="#">热门图书</a></li>
                <li><a href="#">洗发水</a></li>
                <li><a href="#">卫生巾</a></li>
                <li><a href="#">家庭清洁</a></li>
                <li><a href="#">狗粮</a></li>
            </ul>
            <div class="module-body clear">
                <div class="module-banner">
                    <a href="#">
                        <img src="" data-src="img/content/JJSH.jpg">
                        <div class="hot-con">
                            <div class="hot-slider">
                                <ul class="slider-list">
                                    <li>上上家纺乳胶枕99元 &gt;</li>
                                    <li>百丽丝专柜凉席超值疯抢 &gt;</li>
                                    <li>法国波尔多红酒 &gt;</li>
                                    <li>上上家纺乳胶枕99元 &gt;</li>
                                </ul>
                            </div>
                            <div class="hot-recommend">
                                <h4>家纺品牌特卖</h4>
                                <p>超值疯抢手慢无</p>
                                <span class="decoration"></span>
                            </div>
                        </div>
                    </a>
                </div>
                <ul class="module-list hot-list">
                    <li>
                        <a href="#">
                            <h4>自制酸奶新主义</h4>
                            <p>豪享DIY酸奶美味</p>
                            <img src="" data-src="img/content/JJSH8.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>乐扣乐扣塑料水杯</h4>
                            <p>韩国欧巴李钟硕代言</p>
                            <img src="" data-src="img/content/JJSH2.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>健康管家关爱血压</h4>
                            <p>电子智能血压计</p>
                            <img src="" data-src="img/content/JJSH1.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>法国波尔多红酒</h4>
                            <p>愿品进口 品质保证</p>
                            <img src="" data-src="img/content/JJSH7.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>特效杀蟑胶饵</h4>
                            <p>夏季除蟑必备</p>
                            <img src="" data-src="img/content/JJSH3.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>天猫图书</h4>
                            <p>畅销图书让你好看</p>
                            <img src="" data-src="img/content/JJSH6.jpg">
                        </a>
                    </li>
                </ul>
                <ul class="module-list recommend-list">
                    <li>
                        <a href="#">
                            <h4>汤臣倍健</h4>
                            <p>终于降价了</p>
                            <img src="" data-src="img/content/JJSH9.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>中华名小吃</h4>
                            <p>唯美食与爱不可辜负</p>
                            <img src="" data-src="img/content/JJSH5.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>吃货萌宠来袭</h4>
                            <p>爱从喂养开始</p>
                            <img src="" data-src="img/content/JJSH4.jpg">
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="ad">
            <a href="#"><img src="" data-src="img/content/ad3.jpg"></a>
        </div>
        <div class="floor-CDKW module" id="floor-CDKW">
            <h3 class="module-title">潮店酷玩
                <i class="data-color-mark"> </i>
                <span>ELECTRONICS</span>
            </h3>
            <ul class="hot-nav">
                <li><a href="#">手机</a></li>
                <li><a href="#">iPhone</a></li>
                <li><a href="#">相机</a></li>
                <li><a href="#">数码配件</a></li>
                <li><a href="#">影音电玩</a></li>
                <li><a href="#">生活电器</a></li>
                <li><a href="#">个人护理</a></li>
                <li><a href="#">电脑硬件</a></li>
                <li><a href="#">笔记本</a></li>
            </ul>
            <div class="module-body clear">
                <div class="module-banner">
                    <a href="#">
                        <img src="" data-src="img/content/CDKW.jpg">
                        <div class="hot-con">
                            <div class="hot-slider">
                                <ul class="slider-list">
                                    <li>12期免息0手续费 &gt;</li>
                                    <li>轻奢5系低至799元 &gt;</li>
                                    <li>新价赢战 不德不爱 &gt;</li>
                                    <li>12期免息0手续费 &gt;</li>
                                </ul>
                            </div>
                            <div class="hot-recommend">
                                <h4>德系血统拜仁精神</h4>
                                <p>限量送43寸智能电视</p>
                                <span class="decoration"></span>
                            </div>
                        </div>
                    </a>
                </div>
                <ul class="module-list hot-list">
                    <li class="hot-item">
                        <a href="#">
                            <h4>夏日鲜机抢先购</h4>
                            <h5>原封国行 顺丰包邮 全网通</h5>
                            <p>iPhoneSE￥2988限时抢</p>
                            <img src="" data-src="img/content/CDKW6.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>优惠券减200元</h4>
                            <p>高清防水40米</p>
                            <img src="" data-src="img/content/CDKW5.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>有品3周年庆·</h4>
                            <p>0元抽大奖</p>
                            <img src="" data-src="img/content/CDKW4.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>电竞影音大联盟</h4>
                            <p>分期免息大额优惠</p>
                            <img src="" data-src="img/content/CDKW7.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>家务不要你管</h4>
                            <p>疯抢扫地机器人</p>
                            <img src="" data-src="img/content/CDKW1.jpg">
                        </a>
                    </li>
                </ul>
                <ul class="module-list recommend-list">
                    <li>
                        <a href="#">
                            <h4>妈妈的新潮器时代</h4>
                            <p>关爱永不退场</p>
                            <img src="" data-src="img/content/CDKW8.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>英特尔超级品牌日</h4>
                            <p>领券最高减1000元</p>
                            <img src="" data-src="img/content/CDKW3.jpg">
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="floor-MLRS module" id="floor-MLRS">
            <h3 class="module-title">美丽人生
                <i class="data-color-mark"> </i>
                <span>FASHION & BEAUTY</span>
            </h3>
            <ul class="hot-nav">
                <li><a href="#">连衣裙</a></li>
                <li><a href="#">T恤男</a></li>
                <li><a href="#">每日护肤</a></li>
                <li><a href="#">休闲男鞋</a></li>
                <li><a href="#">黄金项链</a></li>
                <li><a href="#">单鞋</a></li>
                <li><a href="#">女包</a></li>
                <li><a href="#">文胸</a></li>
                <li><a href="#">大牌腕表</a></li>
            </ul>
            <div class="module-body clear">
                <div class="module-banner">
                    <a href="#">
                        <img src="" data-src="img/content/MLRS.jpg">
                        <div class="hot-con">
                            <div class="hot-slider">
                                <ul class="slider-list">
                                    <li>吻柔妈妈夏日套装 &gt;</li>
                                    <li>窈窕淑女必备美裙 &gt;</li>
                                    <li>美少女萌萌哒美衣 &gt;</li>
                                    <li>吻柔妈妈夏日套装 &gt;</li>
                                </ul>
                            </div>
                            <div class="hot-recommend">
                                <h4>夏日衣橱大焕新</h4>
                                <p>限量美衣手慢无</p>
                                <span class="decoration"></span>
                            </div>
                        </div>
                    </a>
                </div>
                <ul class="module-list hot-list">
                    <li>
                        <a href="#">
                            <h4>清凉一夏</h4>
                            <p>清爽短袖热卖</p>
                            <img src="" data-src="img/content/MLRS3.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>酷夏补水有一套</h4>
                            <p>符合东方肤质补水套装</p>
                            <img src="" data-src="img/content/MLRS9.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>大牌折扣季</h4>
                            <p>全场3折起</p>
                            <img src="" data-src="img/content/MLRS7.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>丝袜诱惑性感来袭</h4>
                            <p>夏季尚新</p>
                            <img src="" data-src="img/content/MLRS4.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>木林森男鞋</h4>
                            <p>夏日特惠</p>
                            <img src="" data-src="img/content/MLRS2.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>暑假大作战</h4>
                            <p>夏季海量新品尚新</p>
                            <img src="" data-src="img/content/MLRS1.jpg">
                        </a>
                    </li>
                </ul>
                <ul class="module-list recommend-list">
                    <li>
                        <a href="#">
                            <h4>探索夏日新潮流</h4>
                            <p>经典舒适</p>
                            <img src="" data-src="img/content/MLRS8.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>年轻肌肤的小水库</h4>
                            <p>夏季控油补水保湿套装</p>
                            <img src="" data-src="img/content/MLRS6.jpg">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <h4>夏装新品抢先购</h4>
                            <p>会员专享新品券</p>
                            <img src="" data-src="img/content/MLRS5.jpg">
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="floor-QJD module" id="floor-QJD">
            <h3 class="module-title">品牌旗舰店 <span>FLAGSHIP STORES</span></h3>
            <ul class="shop-list">
                <li class="shop-item">
                    <div class="shop-header">
                        <img class="shop-logo" src="" data-src="img/content/QJ1.jpg">
                        <div class="meta shop-meta">
                            <a href="#">
                                <h4>ABAHOUSE官方旗舰店</h4>
                                <p>1.2万粉丝</p>
                            </a>
                        </div>
                        <a class="enter-btn" href="#">进店看看</a>
                    </div>
                    <ul class="goods-list">
                        <li>
                            <img class="goods-poster" src="" data-src="img/content/QJ1-1.jpg">
                            <div class="goods-desc">
                                <h5>ABAHOUSE 2016春夏新款男士牛皮系带休闲皮鞋多色可选7201301023</h5>
                                <span class="price">￥888</span>
                            </div>
                        </li>
                        <li>
                            <img class="goods-poster" src="" data-src="img/content/QJ1-2.jpg">
                            <div class="goods-desc">
                                <h5>ABAHOUSE 春夏款定番系列意大利产高级牛皮撞色凉拖5251209046</h5>
                                <span class="price">￥564</span>
                            </div>
                        </li>
                        <li>
                            <img class="goods-poster" src="" data-src="img/content/QJ1-3.jpg">
                            <div class="goods-desc">
                                <h5>ABAHOUSE 2016春夏新款意大利产设计款软底牛皮拖鞋7271009041</h5>
                                <span class="price">￥594</span>
                            </div>
                        </li>
                    </ul>
                </li>
                <li class="shop-item">
                    <div class="shop-header">
                        <img class="shop-logo" src="" data-src="img/content/QJ2.png">
                        <div class="meta shop-meta">
                            <a href="#">
                                <h4>红桃K官方旗舰店</h4>
                                <p>5.8万粉丝</p>
                            </a>
                        </div>
                        <a class="enter-btn" href="#">进店看看</a>
                    </div>
                    <ul class="goods-list">
                        <li>
                            <img class="goods-poster" src="" data-src="img/content/QJ2-1.jpg">
                            <div class="goods-desc">
                                <h5>红桃K 生血剂二合一(片剂+口服液) 10ml/支*10+0.45g*10*套餐9盒</h5>
                                <span class="price">￥256</span>
                            </div>
                        </li>
                        <li>
                            <img class="goods-poster" src="" data-src="img/content/QJ2-2.jpg">
                            <div class="goods-desc">
                                <h5>红桃K 佳怡宝牌维生素C咀嚼片 1.2g/片*102片*2瓶套餐</h5>
                                <span class="price">￥39</span>
                            </div>
                        </li>
                        <li>
                            <img class="goods-poster" src="" data-src="img/content/QJ2-3.jpg">
                            <div class="goods-desc">
                                <h5>红桃K 维生素C加E咀嚼片 800mg/片*120片*2瓶套餐</h5>
                                <span class="price">￥58</span>
                            </div>
                        </li>
                    </ul>
                </li>
                <li class="shop-item">
                    <div class="shop-header">
                        <img class="shop-logo" src="" data-src="img/content/QJ3.jpg">
                        <div class="meta shop-meta">
                            <a href="#">
                                <h4>伊丝艾拉官方旗舰店</h4>
                                <p>18.8万粉丝</p>
                            </a>
                        </div>
                        <a class="enter-btn" href="#">进店看看</a>
                    </div>
                    <ul class="goods-list">
                        <li>
                            <img class="goods-poster" src="" data-src="img/content/QJ3-1.jpg">
                            <div class="goods-desc">
                                <h5>伊丝艾拉夏天轻薄透气性感调整型聚拢超薄款单层围蕾丝多色文胸</h5>
                                <span class="price">￥69</span>
                            </div>
                        </li>
                        <li>
                            <img class="goods-poster" src="" data-src="img/content/QJ3-2.jpg">
                            <div class="goods-desc">
                                <h5>清仓 伊丝艾拉深V光面性感女文胸绚丽野性印花女士内衣8177</h5>
                                <span class="price">￥59</span>
                            </div>
                        </li>
                        <li>
                            <img class="goods-poster" src="" data-src="img/content/QJ3-3.jpg">
                            <div class="goods-desc">
                                <h5>有/无钢圈伊丝艾拉文胸性感纯色内衣一片式文胸聚拢调整胸罩包邮</h5>
                                <span class="price">￥89</span>
                            </div>
                        </li>
                    </ul>
                </li>
                <li class="shop-item">
                    <div class="shop-header">
                        <img class="shop-logo" src="" data-src="img/content/QJ4.jpg">
                        <div class="meta shop-meta">
                            <a href="#">
                                <h4>凯胜官方旗舰店</h4>
                                <p>9499粉丝</p>
                            </a>
                        </div>
                        <a class="enter-btn" href="#">进店看看</a>
                    </div>
                    <ul class="goods-list">
                        <li>
                            <img class="goods-poster" src="" data-src="img/content/QJ4-1.jpg">
                            <div class="goods-desc">
                                <h5>凯胜2016新款男鞋羽毛球训练鞋运动鞋FYTL009</h5>
                                <span class="price">￥159</span>
                            </div>
                        </li>
                        <li>
                            <img class="goods-poster" src="" data-src="img/content/QJ4-2.jpg">
                            <div class="goods-desc">
                                <h5>凯胜羽毛球系列速干男装常规收口比赛服上衣FAYK005</h5>
                                <span class="price">￥79</span>
                            </div>
                        </li>
                        <li>
                            <img class="goods-poster" src="" data-src="img/content/QJ4-3.jpg">
                            <div class="goods-desc">
                                <h5>凯胜网面耐磨男鞋低帮羽毛球训练鞋FYTK001</h5>
                                <span class="price">￥149</span>
                            </div>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
        <div class="ad">
            <a href="#"><img src="" data-src="img/content/ad2.jpg"></a>
        </div>
        <div class="floor-CNXH" id="floor-CNXH">
            <h3>
                <span class="text-line">——</span>
                <i class="iconfont">&#xe63d;</i>
                猜你喜欢
                <span class="text-line">——</span>
            </h3>
            <ul class="favorite-list clear">
            </ul>
            <div class="end-favorite"></div>
        </div>
    </div><!-- end floor -->
</div><!-- end content -->
<!-- footer -->
<div id="footer">
    <div class="tmall-ensure ft-container">
        <a href="#"></a>
        <a href="#"></a>
        <a href="#"></a>
        <a href="#"></a>
    </div>
    <div class="tmall-desc ft-container">
        <dl class="guide">
            <dt>购物指南</dt>
            <dd>
                <a href="#">免费注册</a>
                <a href="#">开通支付宝</a>
                <a href="#">支付宝充值</a>
            </dd>
        </dl>
        <dl class="safeguard">
            <dt>天猫保障</dt>
            <dd>
                <a href="#">发票保障</a>
                <a href="#">售后规则</a>
                <a href="#">缺货赔付</a>
            </dd>
        </dl>
        <dl class="pay">
            <dt>支付方式</dt>
            <dd>
                <a href="#">快捷支付</a>
                <a href="#">信用卡</a>
                <a href="#">余额宝</a>
                <a href="#">蚂蚁花呗</a>
                <a href="#">货到付款</a>
            </dd>
        </dl>
        <dl class="seller">
            <dt>商家服务</dt>
            <dd>
                <a href="#">商家入驻</a>
                <a href="#">商家中心</a>
                <a href="#">天猫智库</a>
                <a href="#">天猫规则</a>
                <a href="#">物流服务</a>
                <a href="#">喵言喵语</a>
                <a href="#">运营服务</a>
            </dd>
        </dl>
        <dl>
            <dt>手机天猫</dt>
            <dd>
                <a href="#"><img src="img/moblie-ewm.png" alt="手机天猫APP"></a>
            </dd>
        </dl>
    </div>
    <div class="tmall-copyright">
        <div class="cr-container">
            <p class="footer-tmallinfo">
                <a href="#">关于天猫</a>
                <a href="#">帮助中心</a>
                <a href="#">开放平台</a>
                <a href="#">诚聘英才</a>
                <a href="#">联系我们</a>
                <a href="#">网站合作</a>
                <a href="#">法律声明</a>
                <a href="#">知识产权</a>
                <a href="#">廉正举报</a>
                <a href="#">规则意见征集</a>
            </p>
            <p class="footer-otherlinks">
                <a href="#">阿里巴巴集团</a> |
                <a href="#">淘宝网</a> |
                <a href="#">天猫</a> |
                <a href="#">聚划算</a> |
                <a href="#">全球速卖通</a> |
                <a href="#">阿里巴巴国际交易市场</a> |
                <a href="#">1688</a> |
                <a href="#">阿里妈妈</a> |
                <a href="#">阿里旅行.去啊</a> |
                <a href="#">阿里云计算</a> |
                <a href="#">YunOS</a> |
                <a href="#">阿里通信</a> |
                <a href="#">万网</a> |
                <a href="#">高德</a> |
                <a href="#">优视</a> |
                <a href="#">友盟</a> |
                <a href="#">虾米</a> |
                <a href="#">天天动听</a> |
                <a href="#">来往</a> |
                <a href="#">钉钉</a> |
                <a href="#">支付宝</a>
            </p>
            <div class="footer-copyright">
                <span>增值电信业务经营许可证：<a href="#">浙B2-20110446</a></span>
                <span>网络文化经营许可证：<a href="#">浙网文[2015]0295-065号</a></span>
                <span>互联网医疗保健信息服务 审核同意书 浙卫网审【2014】6号</span><br>
                <span>互联网药品信息服务资质证书编号：浙-（经营性）-2012-0005</span>
                <b>@2003-2016TMALL.COM版权所有</b>
            </div>
            <p>
                <a href="#"><img src="img/copyright1.jpg"></a>
                <a href="#"><img src="img/copyright2.jpg"></a>
            </p>
        </div>
    </div>
    <div class="server-number">wormholesource010178013222.n.et2.production</div>
</div><!-- end footer -->
<div id="top-search">
    <div class="container ts-container">
        <div class="iconfont top-icon">
            &#xe632;
        </div>
        <div class="form">
            <form method="post" action="#" id="top-form" data-active="false">
                <fieldset>
                    <legend>天猫搜索</legend>
                    <input type="text" name="search-box" value="精选单品 惊艳一夏" title="请输入搜索内容">
                    <input type="submit" name="search-btn" value="搜索">
                </fieldset>
            </form>
            <ul class="search-tip">
            </ul>
        </div>
    </div>
</div>
<ul id="floor-nav">
    <li class="nav-header">导航</li>
    <li><a href="#floor-QZSG" data-color="#f7a945">亲子时光</a></li>
    <li><a href="#floor-HWCX" data-color="#19c8a9">户外出行</a></li>
    <li><a href="#floor-DZAC" data-color="#f15453">打造爱巢</a></li>
    <li><a href="#floor-JJSH" data-color="#64c333">居家生活</a></li>
    <li><a href="#floor-CDKW" data-color="#0aa6e8">潮店酷玩</a></li>
    <li><a href="#floor-MLRS" data-color="#ea5f8d">美丽人生</a></li>
    <li><a href="#floor-QJD" data-color="#dd2727">品牌旗舰</a></li>
    <li><a href="#floor-CNXH" data-color="#dd2727">猜你喜欢</a></li>
    <li class="nav-back"><a href="#site-nav"><i class="iconfont">&#xe62d;</i>顶部</a></li>
</ul>
<div id="tip-bar">
    <div class="bar-con">
        <div id="top-blank"></div>
        <a href="#" class="privilege">
            <i class="iconfont tip-icon default">&#xe639;</i>
            <img class="logged" src="img/privilege.jpg"">
            <div class="tip">
                <span>我的特权</span>
                <b class="triangle"></b>
            </div>
        </a>
        <a href="#" class="property">
            <i class="iconfont tip-icon">&#xe642;</i>
            <div class="tip">
                <span>我的资产</span>
                <b class="triangle"></b>
            </div>
        </a>
        <a href="#">
            <i class="iconfont tip-icon">&#xe610;</i>
            <div class="tip">
                <span>我关注的品牌</span>
                <b class="triangle"></b>
            </div>
        </a><a href="#">
        <i class="iconfont tip-icon">&#xe617;</i>
        <div class="tip">
            <span>我的收藏</span>
            <b class="triangle"></b>
        </div>
    </a>
        <a href="#">
            <i class="iconfont tip-icon">&#xe612;</i>
            <div class="tip">
                <span>我看过的</span>
                <b class="triangle"></b>
            </div>
        </a>
        <a href="#">
            <i class="iconfont tip-icon">&#xe63e;</i>
            <div class="tip">
                <span>我要充值</span>
                <b class="triangle"></b>
            </div>
        </a>
        <a href="#" class="feed-back">
            <i class="iconfont tip-icon">&#xe616;</i>
            <div class="tip">
                <span>用户反馈</span>
                <b class="triangle"></b>
            </div>
        </a>
        <a href="#" class="qrcode">
            <i class="iconfont tip-icon">&#xe641;</i>
            <div class="tip">
                <div class="tip-inner">
                    <img class="ewm" src="img/ewm.png" alt="二维码">
                    <img class="award" src="img/award.png" alt="福利">
                </div>
                <b class="triangle"></b>
            </div>
        </a>
    </div>
    <a href="#" class="shopping-cart">
        <div class="wrap">
            <i class="iconfont tip-icon">&#xe615;</i>
            购物车
            <span class="cart-count logged default"></span>
        </div>
    </a>
    <a href="#site-nav" class="back-top">
        <i class="iconfont tip-icon">&#xe633;</i>
        <div class="tip">
            <span>返回顶部</span>
            <b class="triangle"></b>
        </div>
    </a>
</div>
<script type="text/javascript" src="js/index.js" id="cb"></script>
</body>
