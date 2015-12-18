<!DOCTYPE html>

<html lang="zh-CN">
<head>
    <#include "lib.ftl"/>
    <script src="static/welcome.js"></script>

</head>
<body>
	<h1>你好，世界！</h1>
	Date: ${time?date}
	<br>
	Time: ${time?time}
	<br>
	Message: ${message}
    <form action="logout" method="post">
        <input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
        <button type="submit">注销</button>
    </form>
</body>
</html>
