<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="static/header.jsp"/>
<jsp:include page="static/sidebar.jsp"/>
<section id="content">
<jsp:include page="static/top-menu.jsp"/>
    <div class="content">
        <form method="POST", action="/main/crawl">
            <input type="submit" value="go"/>
        </form>
        <div class="content-header">
            <h1>Dashboard</h1>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
        </div>
        <div class="widget-box sample-widget">
            <div class="widget-header">
                <h2>Widget Header</h2>
                <i class="fa fa-cog"></i>
            </div>
            <div class="widget-content">
                <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/87118/sample-data-1.png">
            </div>
        </div>
        <div class="widget-box sample-widget">
            <div class="widget-header">
                <h2>Widget Header</h2>
                <i class="fa fa-cog"></i>
            </div>
            <div class="widget-content">
                <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/87118/sample-data-1.png">
            </div>
        </div>
        <div class="widget-box sample-widget">
            <div class="widget-header">
                <h2>Widget Header</h2>
                <i class="fa fa-cog"></i>
            </div>
            <div class="widget-content">
                <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/87118/sample-data-1.png">
            </div>
        </div>
        <div class="widget-box sample-widget">
            <div class="widget-header">
                <h2>Widget Header</h2>
                <i class="fa fa-cog"></i>
            </div>
            <div class="widget-content">
                <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/87118/sample-data-1.png">
            </div>
        </div>
    </div>
</section>
</body>
</html>
