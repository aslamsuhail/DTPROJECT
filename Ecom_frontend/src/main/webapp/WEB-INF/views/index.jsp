<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="row">
  <div class="col-md-4">
    <div class="thumbnail">
      <img src="./resources/images/img1.jpg"" alt="...">
      <div class="caption">
        <h3>Yamaha</h3>
        <p>...</p>
        <p><a href="noAccessPage" class="btn btn-primary" role="button">AddCart</a> <a href="reg" class="btn btn-default" role="button">Buy</a></p>
      </div>
    </div>
    
  </div>
  <div class="col-md-4">
    <div class="thumbnail">
      <img src="./resources/images/Bike-Stunt-Man-on-Road-HD-Images.jpg" alt="...">
      <div class="caption">
        <h3>Pulser</h3>
        <p>...</p>
        <p><a href="noAccessPage" class="btn btn-primary" role="button">AddCart</a> <a href="reg" class="btn btn-default" role="button">Buy</a></p>
      </div>
    </div>
</div>
<div class="col-md-4">
    <div class="thumbnail">
      <img src="./resources/images/Honda.jpg"" alt="...">
      <div class="caption">
        <h3>Honda</h3>
        <p>...</p>
        <p><a href="noAccessPage" class="btn btn-primary" role="button">AddCart</a> <a href="reg" class="btn btn-default" role="button">Buy</a></p>
      </div>
    </div>
    </div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>