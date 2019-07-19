<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"  %>
<html>
<body>
<h2>登陆页面!</h2>
<script src="/js/jquery-1.11.3.min.js"></script>
<form action="/user/login.do">

    <table>
        <tr>
            <td>用户名:</td>
            <td>
                <input name="names" type="text">
            </td>
        </tr>
        <tr>
            <td>密码:</td>
            <td>
                <input name="pass" type="password">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
