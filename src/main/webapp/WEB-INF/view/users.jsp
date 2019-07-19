<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"  %>

<html>

<body>
<h2>主页面</h2>
<button onclick="toPage()">列表</button>
</body>
<script src="/js/jquery-1.11.3.min.js"></script>
<script>
    function toPage() {
        window.open("/user/toList.do")
    }
</script>
</html>
