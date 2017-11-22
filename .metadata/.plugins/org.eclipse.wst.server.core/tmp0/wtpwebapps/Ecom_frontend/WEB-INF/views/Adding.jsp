<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- To Access the Bootstrap link -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
 <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.ui/1.8.9/jquery-ui.js" type="text/javascript"></script>
<link href="http://ajax.aspnetcdn.com/ajax/jquery.ui/1.8.9/themes/blitzer/jquery-ui.css"
    rel="stylesheet" type="text/css" />
    

<style type="text/css">
  .backgroundclr
  { 
    background-color: #1a0000;
  }
  body {
  background-color:#fff;
  -webkit-font-smoothing: antialiased;
  font: normal 14px Roboto,arial,sans-serif;
}
.container {
    padding: 25px;
    position: relative;
}
.form-login {
    background-color: #EDEDED;
    padding-top: 10px;
    padding-bottom: 20px;
    padding-left: 20px;
    padding-right: 20px;
    border-radius: 15px;
    border-color:#d2d2d2;
    border-width: 5px;
    box-shadow:0 1px 0 #cfcfcf;
}
h4 { 
 border:0 solid #fff; 
 border-bottom-width:1px;
 padding-bottom:10px;
 text-align: center;
}
.form-control {
    border-radius: 10px;
}
.wrapper {
    text-align: center;
}
  
</style>



</head>
<body>

<!-- AddProduct coding  started -->
<jsp:include page="header.jsp"></jsp:include><br><br>
<a href="categorylist" style="font-family: fantasy;">CATEGORYLIST</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="supplierlist" style="font-family: fantasy;">SUPPLIERLIST</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="productlistview" style="font-family: fantasy;">PRODUCTLIST</a>&nbsp;&nbsp;&nbsp;&nbsp;
<div class="container">
    <div class="row">
        <div class="col-md-offset-5 col-md-3">
            <div class="form-login">
            <form action="addProduct" method="post" enctype="multipart/form-data">
            <h4 style="font-family: monospace;font-style: italic;"><b>ADD PRODUCT DETAILS</h4></b>
            <input type="text" id="userName" class="form-control input-sm chat-input"  name="id" placeholder="EnterProductId"  required/>
            </br>
            <input type="text" id="productname" class="form-control input-sm chat-input"  name="pname"  placeholder="EnterProductName"  required/>
            </br><br>
            Product Category
           <select name="cid">
             <c:forEach var="cList" items="${clist}">

                <option value="${cList.categoryid}">${cList.categoryname}</option>
                </c:forEach>
           
           </select><br><br><br>
           
          
           <input type="text" id="productprice" class="form-control input-sm chat-input" placeholder="Enter the product Price" name="price"/><br><br>
         
          <input type="file" name="file" value="fileupload" id="fileupload"><label for="fileupload"> Select a file to upload</label> 
          <button type="submit"><label for="fileupload"></label>
         
            <div class="wrapper">
            <span class="group-btn">  <br><br>   
                <input type="submit" value="ADD" class="btn btn-primary btn-md" "><i class="fa fa-sign-in"></i></a>
                 <input type="submit" value="BACK" class="btn btn-primary btn-md"><i class="fa fa-sign-in"></i>
            </span>
            </div>
            </div>
        </form>
        </div>
    </div>
    </div>
    <!-- Addprodcut end here -->

          
       
    <jsp:include page="footer.jsp"></jsp:include>
</div>

</body>
</html>