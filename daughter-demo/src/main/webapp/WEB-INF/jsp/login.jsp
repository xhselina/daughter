<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- 为了确保适当的绘制和触屏缩放，需要在 <head> 之中添加 viewport 元数据标签。
    	在移动设备浏览器上，通过为视口（viewport）设置 meta 属性为 user-scalable=no 可以禁用其缩放（zooming）功能
    	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
     -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>用户登录</title>
<jsp:include page="common/head.jsp" />
</head>
<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<form class="form-horizontal" role="form">
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">邮箱：</label>
						<div class="col-sm-4 col-ms-6">
							<input type="email" class="form-control" id="inputEmail3" />
						</div>
					</div>
					<div class="form-group">
						 <label for="inputPassword3" class="col-sm-2 control-label">密码：</label>
						<div class="col-sm-4  col-ms-6">
							<input type="password" class="form-control" id="inputPassword3" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<div class="checkbox">
								 <label><input type="checkbox" /> 记住我</label>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							 <button type="submit" class="btn btn-default">登录</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>