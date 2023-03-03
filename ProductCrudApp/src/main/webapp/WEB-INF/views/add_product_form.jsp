<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp"%>
</head>
<body>
	<!-- Background image -->
	<div class="bg-image"
		style="background-image: url('https://mdbootstrap.com/img/new/fluid/city/018.jpg'); height: 100vh;">
		<div class="container">

			<div class="row">
				<div class="col-md-6 offset-md-3">
					<h1 style="color: #0dcaf0; font-family: poppins;"
						class="text-center mb-3">Fill The Product Details</h1>
					<form action="handle-product" method="post">
					
						
						<div class="form-group">
							<label style="color: white;for="name">Product Name</label> <input
								type="text" class="form-control" id="name"
								aria-describedby="emailHelp" name="name"
								placeholder="Enter The Product Name Here">
						</div>
						
						

						<div class="form-group">
							<label style="color: white;"description">Product
								Description</label>
							<textarea class="form-control" id="description"
								name="description" rows=""
								placeholder="Enter The Product Description"></textarea>
						</div>

						<div class="form-group">
							<label style="color: white;"price">Product Price</label> <input
								type="number" class="form-control" id="price" name="price"
								placeholder="Enter Product Price">
						</div>
						<br>
						

						<div class="container text-center">
							<a href="${pageContext.request.contextPath }/"
								class="btn btn-danger">Back</a>
							<button type="submit" class="btn btn-success">Add</button>
						</div>

					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>