<!DOCTYPE html>
<html lang="zn">
<head>
    <meta charset="UTF-8">
    <title>log-in</title>
    <link rel="stylesheet" href="index.css">
</head>
<body>
    <header>
        <div class="header-line"></div>
    </header>
    <div class="content">
        <img class="content-logo" src="index.png" alt="logo">
        <h1 class="content-title">登录</h1>
        <div class="content-form">
            <form method="post" action="" onsubmit="return submitTest()">
                <div id="change_margin_1">
                    <input class="user" type="text" name="user" placeholder="请输入用户名" onblur="oBlur_1()" onfocus="oFocus_1()">
                </div>
                <!-- input的value为空时弹出提醒 -->
                <p id="remind_1"></p>
                <div id="change_margin_2">
                    <input class="password" type="password" name="password" placeholder="请输入密码" onblur="oBlur_2()" onfocus="oFocus_2()">
                </div>
                <!-- input的value为空时弹出提醒 -->
                <p id="remind_2"></p>
                <div id="change_margin_3">
                    <input class="content-form-signup" type="submit" value="登录">
                </div>
            </form>
        </div>
        <div class="content-login-description">没有账户？</div>
        <div><a class="content-login-link" href="register.html">注册</a></div>
    </div>
<script src="index.js"></script>
</body>
</html>