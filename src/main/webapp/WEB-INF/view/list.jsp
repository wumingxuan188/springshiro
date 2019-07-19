
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
用户列表
<span id="list_id"></span>
</body>



<script src="/js/jquery-1.11.3.min.js"></script>
<script>
    $(function(){
        $.ajax({
            url: "/user/findAll.do",
            type:"post",
            //data:$("#listForm").serialize(),//表单序列化提交
            dataType:"json",//规定返回值格式
            async : false,//同步上传
            success:function (data){//成功回调函数 alert(data);
                console.log(data)
                #("list_id").html(data)
            },
            error :function(){//错误回调函数
                alert("系统异常！")
            }
        });
    })

</script>
</html>
