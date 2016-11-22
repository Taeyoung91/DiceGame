<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Dice Game</title>
</head>
<body>
	<h1>Please insert your name and start the game.</h1>

	<form name="startGame" action="/dicegame/start" method="post">
		<input type="text" name="username" id="username" required />
		<button type="submit">play</button>
	</form>
	<form action="/dicegame/confighome">
		<button type=submit>configure</button>
	</form>
	<form action="/dicegame/scoreview">
		<button type="submit">Score</button>
	</form>


</body>
</html>
