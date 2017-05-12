<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="static/header.jsp"/>
<jsp:include page="static/sidebar.jsp"/>
<section id="content">
    <jsp:include page="static/top-menu.jsp"/>
    <div class="content">
        <div class="content-header">
            <h1>Crawler</h1>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
        </div>
        <form method="POST", action="/crawler/crawl">
            <input type="text" name="url" placeholder="URL"/>
            <input type="submit" value="go"/>
        </form>
    </div>
</section>
</body>
</html>