<%@page import="com.yorick.utils.Constant" %>
<%
    String context = (String)application.getAttribute(Constant.CONTEXT_PATH_IN_SERVLET_CONTEXT);
%>

<script>
    var context = <%= context%>;
    console.log("context=========",context);
</script>
