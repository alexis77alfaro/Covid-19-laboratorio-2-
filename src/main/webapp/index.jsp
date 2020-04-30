<!DOCTYPE html>
<html>
<head>
	<title>Gobierno de El Salvador</title>
	<link rel="stylesheet" type="text/css" href="estilosCSS/estilos.css">
</head>
<body>
	<header>
		<div class="adminBtn">
			<a href="#">Entrar al Administrador</a>
		</div>
		<img src="imgs/lgES.png">
	</header>
	<div class="content">
		<div class="principal">
			<h1>Consulta quién de tu familia es el beneficiario del apoyo económico para alimentación en la emergencia</h1>
			<span>COVID-19</span>
		</div>
		<div class="formStyle">
			<input class="txt" type="text" id="txt" placeholder="Ingresar tu número de DUI">
			<input class="btn" type="submit" id="btn" value="CONSULTAR">
		</div>
		<script src="http://code.jquery.com/jquery-latest.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				$('#benef1').hide();
				$('#benef0').hide();
				$( "#btn" ).click(function(){
					var data = $("#txt").val();
				
					$.post('servlectControl', {
						data
					}, function(respose){
						let datos = JSON.parse(respose);
						
						var paper = document.getElementById('paper');
						$('#benef1').hide();
						$('#benef0').show();
						for(let item of datos){
							paper.innerHTML = item.cmpNombre + ", usted sí es beneficiario del apoyo economico de $300 para alimentación de tu hogar"
							$('#benef1').show();
							$('#benef0').hide();
						}
					});
				});
			});
		</script>
		<div class="beneficiado" id="benef1">
			<img src="imgs/emoji.png">
			<h2 id="paper"></h2>
			<h3>Su pago podrá ser retirado en ventanilla en cualquiera de las siguientes sucursales</h3>
			<a href="">ver sucursales</a>
			<span>A partir del día 28 de Marzo del 2020</span>
			<div class="lastText">
				<img src="imgs/family.png">
				<p>
					RECUERDA<br>
					Este beneficio está destinado para la alimentación de tu familia ya que en este momento
					de emergencia es vital contar con los recursos necesarios.
					<br><br>
					Te invitamos a estar pendiente de las redes oficiales para conocer las actualizaciones 
					sobre nuevas medidas, y acatarlas durante esta Emergencia Nacional.
				</p>
			</div>
		</div>
		<div class="beneficiado" id="benef0">
			<img src="imgs/alert.png">
			<h2>Este DUI no se encuentra en nuestros registros. Intenta ingresando el DUI de otra persona de tu vivienda.</h2>
			<div class="anuncio">
				<p>
					Si ningún DUI aparece en el registro, lamentamos informarte que el periodo para reclamos del apoyo económico ha finalizado. Sin embargo seguimos comprometidos con ayudarte en esta crisis. Por eso mantente pendiente de nuestros canales oficiales.
				</p>
			</div>
			<p>
				Este apoyo ha sido brindado a las viviendas afectadas por <span class="otroColor">la pandemia y con mayor vulnerabilidad social</span>.
			</p>
			<p>
				Te invitamos a estar pendiente de las redes oficiales para conocer las actualizaciones, nuevas medidas y acatarlas durante esta <b>Emergencia Nacional</b>.
			</p>
		</div>
		<div class="inf">
			<h3>El apoyo económico brindado por el Gobierno de El Salvador está dirigido a personas afectadas por la pandemia del COVID-19. Dicho beneficio corresponde a $300 por vivienda.</h3>
		</div>
	</div>
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