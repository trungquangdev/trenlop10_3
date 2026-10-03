<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<select>
    <c:forEach items="${listCS}" var="cs">
        <option ${cs.tenCaSi}>

        </option>
    </c:forEach>
</select>

<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>ten bai hat</th>
        <th>tac gia</th>
        <th>thoi luong</th>
        <th>gia</th>
        <th>phat hanh dia</th>
        <th>ngay ra mat</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${listBh}" var="bh">
        <tr>
            <td>${bh.id}</td>
            <td>${bh.tenBaiHat}</td>
            <td>${bh.tenTacGia}</td>
            <td>${bh.thoiLuong}</td>
            <td>${bh.gia}</td>
            <td>${bh.phatHanhDia}</td>
            <td>${bh.ngayRaMat}</td>
            <td>${baihat.caSiId.tenCaSi}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
