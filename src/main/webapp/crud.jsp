 <!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="estilosCSS/estilos.css">

    <title>Document</title>

    <script src="http://code.jquery.com/jquery-latest.js">
    </script>
</head>

<script>
    $(document).ready(function() {
        $('#cargar').click(function(event) {

            var btn = $('#cargar').val();


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
         <input type="submit" name="a" id="cargar" value="cargar" id="table1">
    <table class="table table-dark" >
      <thead>
          <th>id</th>
          <th>Nombre</th>
          <th>Apellido</th>
          <th>Dui</th>

      </thead>

      <tbody>

      </tbody>
    </table>

    <table align="center">

        <thead></thead>
        <tbody>
            <tr>
                <td>
                    <form action="serveleteCrud" method="post">
                    <p>ID</p> <input type="text" name="id">
                    <p>Nombres</p> <input type="text" name="nombre">
                    <p>Apellidos</p> <input type="text" name="apellido">
                    <p>Dui</p> <input type="text" name="dui">

                    <input type="submit" name="btn" value="agregar"  class="btn btn-info">
                    <input type="submit" name="btn" value="actualizar" class="btn btn-info">
                    <input type="submit" name="btn" value="eliminar"  class="btn btn-info">
                </form>
                </td>
            </tr>
        </tbody>
 

    </table>
    
    
    <footer>
		<span>� Copyright 2020. Presidencia de la Rep�blica de El Salvador.</span>
		<div class="">
			<a href="https://www.presidencia.gob.sv/contactenos/">Cont�ctanos</a>
			<a href="https://www.facebook.com/PresidenciaSV">Facebook</a>
			<a href="https://twitter.com/presidenciasv">Twitter</a>
			<a href="https://www.instagram.com/presidenciasv/">Instagram</a>
		</div>
	</footer>
</body>

</html>