<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html> 
<html>
<head>
	<c:url value="/content/css/bootstrap.css" var="bootstrap"></c:url>
	<link href="${bootstrap}" rel="stylesheet">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Cliente Soap</title>
</head>
<body class="bg-light">
	<div class='container'>
		<div class="row">
			<div class="col-12 bg-white">
				<form  method="post">
					<div class="form-row">
						<label>Cantidad:</label>
						<div>
							<input class="form-control" name="cantidad">
						</div>						
					</div>
					<div class="form-row">
						<label>Moneda:</label>
						<div>
							<select class="form-contro" name="moneda">
								<option value="dolar">Peso a dolar</option>
								<option value="peso">Dolar a peso</option>
							</select>
						</div>						
					</div>
					<button class="btn btn-primary" type="submit">Convertir</button>					
				</form>
				<div class="alert alert-info">
					La conversion de ${cantidad} ${origen} el resultado es ${resultado} ${destino}
					<br>
					Tipo de cambio aplicado
					<ol>
						<li>Moneda: ${moneda.nombreMoneda}</li>
						<li>Tipo de cambio ${moneda.tipoCambio}</li>
					</ol> 
				</div>
			</div>
		</div>
	</div>		
	<script type="text/javascript" src=""></script>
	<script type="text/javascript" src=""></script>
</body>
</html>