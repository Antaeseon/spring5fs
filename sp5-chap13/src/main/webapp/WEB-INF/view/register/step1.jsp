<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <ttle><spring:message code="member.register"/></ttle>
</head>
<body>
<h2><spring:message code="term"/></h2>
<p><spring:message code="term.agree"/></p>
<form action="step2" method="post">
    <label>
        <input type="checkbox" name="agree" value="true"><spring:message code="term.agree"/>
    </label>
    <input type="submit" value="<spring:message code="next.btn"/>"/>
</form>
</body>
</html>