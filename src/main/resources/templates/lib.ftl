<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>Bootstrap 101 Template</title>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="static/jquery/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="static/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
    $.ajaxSetup({data: {"${_csrf.parameterName}": "${_csrf.token}"}});
</script>