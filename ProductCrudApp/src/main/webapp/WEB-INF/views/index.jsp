<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>


	<!-- Background image -->
	<div class="bg-image"
		style="background-image: url('https://mdbootstrap.com/img/new/fluid/city/018.jpg'); height: 100vh;width: 100vw">


		<div class="container mt-3">
			<div class="col-md-12"></div>
			<h1 style="color: #0dcaf0; font-family: poppins"
				; class="text-center "; >Welcome To Product App</h1>

			<table class="table table-striped table-primary ">
				<thead class="table table-striped table-dark">
					<tr class="texy-center">

						<th scope="col">SrNo</th>
						<th scope="col">Product Name</th>
						<th scope="col">Description</th>
						<th scope="col">price</th>
						<th scope="col">Action</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${Product}" var="p">
						<tr>

							<td>Product No <b>${p.srno }</b></td>
							<td>${p.name }</td>
							<td>${p.description }</td>
							<td class="font-weight-bold">&#x20B9;${p.price }</td>
							
							
							<td><a href="delete/${p.id }"><i
									class="fa-solid fa-trash text-danger" style="font-size: 24px;"></i></a>

								<a href="update/${p.id }"><i
									class="fa-solid fa-pen-to-square text-primary"
									style="font-size: 24px; margin-left: 20px;"></i></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="container text-center">
				<a href="add-product" class="btn btn-success">Add Product</a>


			</div>
		</div>
	</div>
</body>
</html>