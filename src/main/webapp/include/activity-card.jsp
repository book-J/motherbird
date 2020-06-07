<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%--
<%@ page import="dto.Activity"%>
<%@ page import="dao.ActivityRepository"%>
 --%>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<title>activity-card</title>
</head>
<body>
	<%--
	<%
		ActivityRepository dao = ActivityRepository.getInstance();
		ArrayList<Activity> listOfActivities = dao.getAllActivites();
	%>
	--%>
	<div class="container">
		<div class="row">
			<%--
			<%
			for (int i = 0; i < listOfActivities.size(); i++) {
				Activity activity = listOfActivities.get(i);
			%>
			--%>
			<div class="col-md-4">
				<%--
				<img src ="./resources/images/<%=activity.getFilename()%>" style="width: 100%">
				 --%>
			</div>
			<div class="col-md-8">
				<%--
				<p align="right"><%=activity.choiceStatus()%>
				<p>제 목 : <%=activity.getName()%>
				<p>기 간 : <%=activity.getStime()%> ~ <%=activity.getEtime()%>
				<p>주 관 : <%=activity.getHostname()%>
				<p><p><p>
				<p align="right">지원 팀 : <%=activity.getTeam().size()%>  전체 찜 횟수 : <%=activity.getChoiced()%>	
				--%>			
			</div>
			<%--
			<%
				}
			%>
			--%>
		</div>
	</div>
</body>
</html>
