<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>{ 학생 등록 }</h2>
    <form action="/save" method="post">
                        number: <input type="text" name="studentNumber"> <br>
                        name: <input type="text" name="studentName"> <br>
                        major: <input type="text" name="studentMajor"> <br>
                        mobile: <input type="text" name="studentMobile"> <br>
                        <input type="submit" value="전송">
                    </form>
</body>
</html>
