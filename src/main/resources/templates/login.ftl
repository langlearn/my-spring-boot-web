<!DOCTYPE html>

<html lang="zh-CN">
<head>
    <#include "lib.ftl"/>
    <script src="static/welcome.js"></script>

</head>
<body>
<form action="login" method="post">
    <p>
        <label for="username">Username</label>
        <input type="text" id="username" name="username"/>
    </p>
    <p>
        <label for="password">Password</label>
        <input type="password" id="password" name="password"/>
    </p>
    <button type="submit" class="btn">Log in</button>
</form>
</body>
</html>
