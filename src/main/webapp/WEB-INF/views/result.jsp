<%@ page import="com.weather.test.WeatherResult" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<%
    WeatherResult result = (WeatherResult) request.getAttribute("result");
%>

<%
    if(result != null){
%>
<table cellspacing="2" cellpadding="2">
    <tr>
        <td><strong>Date</strong></td>
        <td><%=new SimpleDateFormat("dd, MMM yyyy").format(new Date())%></td>
    </tr>
    <tr>
        <td><strong>City</strong></td>
        <td><%=result.getName()%></td>
    </tr>
    <tr>
        <td><strong>Weather</strong></td>
        <td><%=result.getWeather().get(0).getDescription()%></td>
    </tr>
    <tr>
        <td><strong>Temperature Max</strong></td>
        <td>Max : <%=String.format("%.2f",result.getMain().maxInCel())%> 'C / <%=String.format("%.2f",result.getMain().maxInF())%> F</td>
    </tr>
    <tr>
        <td><strong>Temperature Min</strong></td>
        <td>Max : <%=String.format("%.2f",result.getMain().minInCel())%> 'C / <%=String.format("%.2f",result.getMain().minInF())%> F</td>
    </tr>
    <tr>
        <td><strong>Sun rise</strong></td>
        <td><%=new SimpleDateFormat("HH:mm:ss a").format(new Date(result.getSys().getSunrise()))%></td>
    </tr>
    <tr>
        <td><strong>Sun set</strong></td>
        <td><%=new SimpleDateFormat("HH:mm:ss a").format(new Date(result.getSys().getSunset()))%></td>
    </tr>

</table>
<%
    }
%>
<br/>
<a href="/">Again</a>
</body>
</html>
