
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">


//        var data={"name":"周金龙","age":17,"adds":"上海"};
//        alert(data.name+"\r\n"+data.age+"\r\n"+data.adds)

//        var data=[{"name":"周金龙","age":17,"adds":"上海"},
//            {"name":"周金龙","age":18,"adds":"上海"}];
//        $.each(data,function (i,dom) {
//            alert(dom.name+"\r\n"+dom.age+"\r\n"+dom.adds)
//        })


var data=[{"name":"周金龙","age":17,"adds":"上海"},
    {"name":"周金龙","age":18,"adds":"上海"},
    {"name":"周金龙","age":19,"adds":"上海"}];

        var $table=$("<table border='1'></table>")
            .append("<tr><td>姓名</td><td>年龄</td><td>住址</td></tr>");

    $(function () {
            $("#zjl").html($table);
            $.each(data,function (i,dom) {
                $table.append("<tr><td>"+dom.name+"</td><td>"+dom.age+"</td><td>"+dom.adds+"</td></tr>")
            });



        $("[name=uname]").blur(function () {
           // newajax();
//            get请求
//            $.get('/servlet/ajaxServlet',{"uname":$("[name=uname]").val()},function (data) {
//                alert(typeof data);
//                $("#msg").html(data);
//            })
//            post请求
//            $.post('/servlet/ajaxServlet',{"uname":$("[name=uname]").val()},function (data) {
//                alert(typeof data);
//                $("#msg").html(data);
//            })
//            getJOSN请求
//            $.getJSON('/servlet/ajaxServlet',{"uname":$("[name=uname]").val()},function (data) {
//               alert(typeof data);
//               $("#msg").html(data);
//            })

//            load方法
//            $("#msg").load('/servlet/ajaxServlet',{"uname":$("[name=uname]").val()})

//            //serialize方法
          /*  var data=$.param($("#form1").serializeArray())
            alert(data)*/


        })

    })
    function newajax() {
        $.ajax({
            url:"/servlet/ajaxServlet",
            type:"POST",
            data:{"uname":$("[name=uname]").val()},
            async:true,
            success:function (data) {
                alert(data);
                $("#msg").html(data);
            }

        });
        
    }
    
</script>

<html>
<body>
<h2>Hello World!</h2>
<form id="form1" name="form1">
    <input name="uname"/><span id="msg"></span>
    <input name="upwd" value="0000">
    <div id="zjl"></div>

</form>

</body>
</html>
