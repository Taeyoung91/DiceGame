<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dice Game</title>
</head>
<body>

	<form name="playGame" action="/dicegame/rolling" method="post">
		<h3>Face Value</h3>
		${username} 's Face Value : ${userValue}<br> AlphaDice 's Face
		Value : ${alphaValue} <br> <br>
		<h3>Accumulated Value</h3>
		${username} : ${curCellForUser}<br> AlphaDice :
		${curCellForAlphaDice} <br> <br>

		<button type="submit">roll</button>

	</form>

</body>
</html>