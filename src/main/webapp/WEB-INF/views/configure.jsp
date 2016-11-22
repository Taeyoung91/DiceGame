<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Configure</title>
</head>
<body>

	<h2>Add cell for trap or bonus</h2>
	<br>
	<form id="configure" action="/dicegame/setconfig" method="post">
		<input type="text" name="beforeCell" /> -> <input type="text"
			name="settedCell" />
		<button type="submit">Add</button>
	</form>
	<form action="/dicegame/initconfig" method="post">
		<button type="submit">Init</button>
	</form>

	<form action="/dicegame">
		<button type="submit">Done</button>
	</form>



	<h3>[[Map Information]]</h3>
	<c:forEach var="i" begin="1" end="29" step="1">
     
      ${i} -> ${settedCells[i]} <br>

	</c:forEach>






</body>
</html>