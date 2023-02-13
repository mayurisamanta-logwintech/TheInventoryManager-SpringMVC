<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored = "false"%>
<head>
    <meta charset = "ISO-8859-1">
    <%@include file = "base.jsp" %>
</head>
<body>
    <div class = "container mt-3">
        <div class = "row">
            <div class = "col-md-12">
                <h1 class = "text-center mb-3"> The Inventory Manager </h1>
                    <table class="table">
                      <thead class="thead-dark">
                        <tr>
                          <th scope="col">Id</th>
                          <th scope="col">Name</th>
                          <th scope="col">Description</th>
                          <th scope="col">Price per Item</th>
                          <th scope="col">Quantity</th>
                          <th scope="col">Total Price</th>
                          <th scope="col">Action</th>
                        </tr>
                      </thead>
                      <tbody>

                        <c:forEach items = "${inv}" var = "inv">
                            <tr>
                              <th scope="row">${inv.id}</th>
                              <td>${inv.name}</td>
                              <td>${inv.description}</td>
                              <td>	&#8377;${inv.pricePerItem}</td>
                              <td>${inv.quantity}</td>
                              <td>	&#8377;${inv.totalPrice}</td>
                            </tr>
                        </c:forEach>

                      </tbody>
                    </table>

                    <div class = "container text-center">
                        <a href = "inventory" class = "btn btn-outline-success"> Add Inventory </a>
                    </div>


            </div>
        </div>
    </div>
</body>
</html>
