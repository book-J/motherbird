<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>

<html>
<head>
<link rel="stylesheet" href="./assets/css/bootstrap.min.css" />
<title>my-teams</title>
</head>
<body>
	<%--
	<jsp:include page="./include/header.jsp"/>
	--%>
	
	<div class="container">
		<div class "row">
		<div class="col-md-3">
			<jsp:include page="./include/my-nav.jsp"/>
		</div>
		<div class="col-md-9">
			<jsp:include page="./include/team-card.jsp"/>
		</div>
		</div>
	</div>
	<%--
	<jsp:include page="./include/footer.jsp"/>
	--%>
</body>
</html>