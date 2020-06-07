<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%--
<%@ page import="dto.Team"%>
<%@ page import="dao.TeamRepository"%>
<%@ page import="dto.Member"%>
<%@ page import="dao.MemberRepository"%>
 --%>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<title>team-card</title>
</head>
<body>
	<%--
	<%
		TeamRepository dao = TeamRepository.getInstance();
		ArrayList<Team> listOfTeams = dao.getAllTeams();
		
		MemberRepositiory dao = MemberRepository.getInstance();
		ArrayList<Member> listOfMembers = dao.getAllMembers();
	%>
	--%>
	<div class="container">
		<div class="row">
			<%--
			<%
			for (int i = 0; i < listOfTeams.size(); i++) {
				Team team = listOfTeams.get(i);
			%>
			--%>
			<div class="col-md-5">
				<%--
				<img src ="./resources/images/<%=team.getFilename()%>" style="width: 100%">
				 --%>
			</div>
			<div class="col-md-7">
				<%--
				<p>참가 활동 : <%=team.getActivityName()%>
				<p>팀 명 : <%=team.getName()%>
				<p>기 간 : <%=team.getStime()%> ~ <%=team.getEtime()%>
				<p>주 관 : <%=team.getHostname()%>
				<p>팀 원 : <%=team.getMember().size()%>
				<%
				for (int i = 0; i < getMember().size(); i++) {
					Member member = listOfMembers.get(i);
					<p><%=memeber.getName()%> : <%=member.getPhone()%>, <%=member.getMail()%>
				}
				%>
				<p><p>
				<p align="right">D-<%=team.getDeadline()%>
				<div class="team_exit_btn" onclick="exitTeam()" align="right">팀 탈퇴 </div>
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
