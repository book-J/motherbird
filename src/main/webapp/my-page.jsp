<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%--
<%@ page import="dto.User"%>
<%@ page import="dao.UserRepository"%>
--%>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<title>my-page</title>
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
				<%--
				유저 정보 받아오기
				마이 페이지 내용
				<div class="container">
					<div class="row">
						<div class="col-md-4>	
							<img src ="./resources/images/<%=user.getImage()%>" style="width: 100%">
						</div>
						<div class="col-md-8>
							<p>이 름  : <%=uesr.getName()%>
							<p>나 이 : <%=user.getAge()%>
							<p>성 별 : <%=user.getIsmale()%>
							<p>연락처 : <%=user.getPhone()%>
							<p>메일 주소 : <%user.getMail()%>
							<p>관심 분야 :
							<jsp:include page="./include/interestings.jsp/>
							<p>수정하기
						</div>
					</div>
				</div>
				 --%>
			</div>
		</div>
	</div>
	<%--
	<jsp:include page="./include/footer.jsp"/>
	--%>
</body>
</html>
