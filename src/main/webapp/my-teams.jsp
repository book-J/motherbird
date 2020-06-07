<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>

<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
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
