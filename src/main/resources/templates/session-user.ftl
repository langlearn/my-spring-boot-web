<!DOCTYPE html>

<html lang="zh-CN">
<head>
    <#include "lib.ftl"/>

</head>
<body>
	email:${SPRING_SECURITY_CONTEXT.authentication.principal.email}
    <br/>
    age:${SPRING_SECURITY_CONTEXT.authentication.principal.age}
</body>
</html>
