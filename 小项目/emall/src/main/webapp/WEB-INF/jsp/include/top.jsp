<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>


<div id="site-nav">
    <div class="container sn-container">
        <p class="login-info default">
            <em>喵，欢迎来到天猫</em>
            <a href="login.html" target="_top">请登录</a>
            <a href="register.html" target="_top">免费注册</a>
        </p>
        <p class="login-info logged">
            <em>Hi,<a class="vip-name" href="#"><i class="iconfont sn-icon"></i></a></em>
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
                <i class="iconfont sn-icon"></i>
                <a href="#" target="_top">我关注的品牌</a>
            </li>
            <li class="sn-cart default">
                <i class="iconfont sn-icon"></i>
                <a href="#" target="_top">购物车</a>
            </li>
            <li class="sn-cart logged">
                <i class="iconfont sn-icon"></i>
                <a href="#" target="_top">购物车
                    <span class="cart-count count"></span> 件
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
                <i class="iconfont sn-icon"></i>
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
                <i class="iconfont sn-icon"></i>
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
</div>