<html>
<head>
    <meta charset = "ISO-8859-1">
    <%@include file = "base.jsp" %>
</head>
<body>
    <div class = "container mt-3">
        <div class = "row">
            <div class = "col-md-6 offset-md-3">
                <h1 class = "text-center mb-3"> Change Inventory details </h1>
                <form action = "/TheInventoryManager/handle-inventory" method = "post">

                    <div class = "form-group">
                        <input type = "hidden" class = "form-control" id = "id" aria-describedby = "emailHelp"
                        name = "id" placeholder = "Inventory Id" value = "${inv.id}">
                    </div>

                    <div class = "form-group">
                        <label for = "name"> Inventory name </label>
                        <input type = "text" class = "form-control" id = "name" aria-describedby = "emailHelp"
                        name = "name" placeholder = "Enter Inventory name" value = "${inv.name}">
                    </div>


                    <div class = "form-group">
                        <label for = "description"> Inventory description </label>
                        <textarea class = "form-control" id = "description" aria-describedby = "emailHelp" rows = "5"
                        name = "description" placeholder = "Enter Inventory description" value = "${inv.description}"></textarea>
                    </div>

                    <div class = "form-group">
                        <label for = "pricePerItem"> Inventory price per item </label>
                        <input type = "text" class = "form-control" id = "pricePerItem"
                        name = "pricePerItem" placeholder = "Enter Inventory price per Item" value = "${inv.pricePerItem}">
                    </div>

                    <div class = "form-group">
                        <label for = "quantity"> Inventory quantity </label>
                        <input type = "text" class = "form-control" id = "quantity"
                        name = "quantity" placeholder = "Enter Inventory quantity" value = "${inv.quantity}">
                    </div>

                    <div class = "container text-center">
                        <a href = "/TheInventoryManager/home"
                        class = "btn btn-outline-danger"> Back </a>

                        <button type = "submit" class = "btn btn-primary"> Update </button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
