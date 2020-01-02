<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="margin: 20px auto;text-align: center" >
		<h3>部门管理</h3>
	</div>
	<div  style="margin: 20px auto;width:800px;text-align: right" >
		<form action="dept" method="get">
			部门名称：<input name="dname" />
			所在地：<input name="loc" />
			<button>查询</button>
			<button type="button" onclick="location.href='deptSave.jsp'">增加</button>
		</form>
		
	</div>
	<table border="1" width="800px" style="margin: 20px auto">
		<tr>
			<th>序号</th>
			<th>部门名称</th>
			<th>部门地点</th>
			<th>删除</th>
			<th>修改</th>
		</tr>
		<c:forEach items="${pb.data}" var="dept" varStatus="i">
			<tr>
				<th>${(pb.currentPage-1)*pb.pageCount+i.count }</th>
				<th>${dept.dname }</th>
				<th>${dept.loc }</th>
				<th>
					<form action="dept" method="post">
						<input type="hidden" name="_method" value="delete" />
						<input type="hidden" name="deptno" value="${dept.deptno }"/>
						<button>删除</button>
					</form>
				</th>
				<th>
					<button onclick="location.href='dept/${dept.deptno }'">修改</button>
				</th>
			</tr>
		</c:forEach>
		<tr>
			<th colspan="5">
			   	<a href="dept?currentPage=1">首页</a>
				<a href="dept?currentPage=${pb.currentPage==1?1:pb.currentPage-1 }">上一页</a>  
				${pb.currentPage }/${pb.pages } 
				<a href="dept?currentPage=${pb.currentPage==pb.pages?pb.pages:pb.currentPage+1 }">下一页</a> 
				<a href="dept?currentPage=${pb.pages }">尾页</a>  
				  共${pb.pages }页
			</th>
		</tr>
	</table>
	
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
</script>
</body>
</html>