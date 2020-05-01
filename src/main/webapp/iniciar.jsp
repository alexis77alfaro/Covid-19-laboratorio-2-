<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="estilosCSS/style.css">
    <link rel="stylesheet" type="text/css" href="estilosCSS/estilos.css">
</head>
<body>
	<header>
		<div class="adminBtn">
			<a href="#">Entrar al Administrador</a>
		</div>
		<img src="imgs/lgES.png">
	</header>
    <form class="caja" action="servelAdmin" method="post">
        <h1>login</h1>
        <input type="text" name="usuario" placeholder="username">
        <input type="password" name="contra" placeholder="password">

        <input type="submit" value="Login">



    </form>


</body>
</html>