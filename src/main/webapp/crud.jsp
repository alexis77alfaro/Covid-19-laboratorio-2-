<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="estilosCSS/estilos.css">

    <title>Document</title>
</head>

<script>
    $(document).ready(function() {
        $('#cargar').click(function(event) {

            var btn = $('#carga').val();


            $.post('serveleteCrud', {

                },
                function(respose) {

                    let datos = JSON.parse(respose);


                    var tabladatos = document.getElementById('table1')
                    for (let item of datos) {

                        tabladatos.innerHtml += `
                       <tr>
                       <td>${item.cmpId}</td>
                       <td>${item.cmpNombre}</td>
                       <td>${item.cmpApellido}</td>
                       <td>${item.cmpDui}</td>
                       
                       
                       </tr>
                      
                      
                      `

                    }
                });


        });



    });
</script>

<body>
    <header>
        <div class="adminBtn">
            <a href="iniciar.jsp">Entrar al Administrador</a>
        </div>
        <img src="imgs/lgES.png">
    </header>

    <table class="table1" align="center">
        <thead class="dark">
            <th>Id</th>
            <th>Nombres</th>
            <th>Apellidos</th>
            <th>Dui</th>
        </thead>
        <tbody>

        </tbody>

    </table>

    <form action="serveleteCrud" method="GET">


        <input type="submit" name="carga" value="mostrar" id="cargar">
        <table align="center">
            <thead></thead>
            <tr>
                <p>Id</p> <input type="text" name="id" value=""></tr>
            <tr>
                <p>nombre</p> <input type="text" name="nombre" value=""></tr>
            <tr>
                <p>Apellido</p> <input type="text" name="apellido" value=""></tr>
            <tr>
                <p>Dui</p> <input type="text" name="dui" value=""></tr><br>

            <input type="submit" name="btn" value="Insertar" name="save" class="btn btn-succes"> <br>
            <input type="submit" name="btn" value="actualizar" name="update" class="btn btn-succes"><br>
            <input type="submit" name="btn" value="eliminar" name="delete" class="btn btn-succes">
        </table>

    </form>
    
    <footer>
		<span>© Copyright 2020. Presidencia de la República de El Salvador.</span>
		<div class="">
			<a href="https://www.presidencia.gob.sv/contactenos/">Contáctanos</a>
			<a href="https://www.facebook.com/PresidenciaSV">Facebook</a>
			<a href="https://twitter.com/presidenciasv">Twitter</a>
			<a href="https://www.instagram.com/presidenciasv/">Instagram</a>
		</div>
	</footer>
</body>

</html>