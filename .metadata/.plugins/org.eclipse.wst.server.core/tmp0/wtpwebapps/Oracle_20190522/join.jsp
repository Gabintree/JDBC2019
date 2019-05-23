<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>
<a href = "index.jsp">첫 화면</a>
<a href = "login.jsp">로그인</a>
<a href = "join.jsp">회원가입</a>
<hr>

<form action =joined.jsp method="post">
<table>
        <tr>
        <td>이름</td> <td><input type="text" name="name"></td>
        </tr>
        <tr>
        <td>성별</td>
        <td>
        <select name="namyeo" id="namyeo">
            <option value="남자">남자</option>
            <option value="여자">여자</option>
        </select>
        </td>
        <tr>
        <td>아이디</td> <td><input type="text" name="id"></td>
        </tr>
        <tr>
        <td>비밀번호</td> <td><input type="text" name="pw"></td>
        </tr>
        <tr>
        <td>비밀번호 확인</td> <td><input type="text" name="pw_re"></td>
        </tr>
        <tr>
        <td>이메일주소</td> <td><input type="email" name="email"></td>
        </tr>
     </table>
    <hr>
    <input type="submit" value="회원가입">
</form>
</body>
</html>