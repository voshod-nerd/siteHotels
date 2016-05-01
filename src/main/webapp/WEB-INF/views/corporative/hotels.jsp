<%-- 
    Document   : hotels
    Created on : 01.05.2016, 16:21:44
    Author     : ����
--%>

<%@page contentType="text/html" pageEncoding="windows-1251"%>
<!DOCTYPE html>
<html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>��������� ���� ��������� ��������</title>


        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="resources/js/jquery-1.12.3.min.js"></script>
        <!-- Bootstrap -->
        <link href="resources/css/bootstrap.min.css" rel="stylesheet">
        <!-- css code for slider  -->
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="resources/js/bootstrap.min.js"></script>

        <link  href="http://cdnjs.cloudflare.com/ajax/libs/fotorama/4.6.4/fotorama.css" rel="stylesheet"> <!-- 3 KB -->
        <script src="http://cdnjs.cloudflare.com/ajax/libs/fotorama/4.6.4/fotorama.js"></script> <!-- 16 KB --> 
        <!-- Angular JS -->
        <script src="resources/js/angular.min.js" ></script>

        <script   src="https://code.jquery.com/ui/1.12.0-rc.2/jquery-ui.js"   integrity="sha256-6HSLgn6Ao3PKc5ci8rwZfb//5QUu3ge2/Sw9KfLuvr8="   crossorigin="anonymous"></script>
    </head>
    <body ng-app="myApp">
       <div class="navbar navbar-default navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <a href="/vc/home" class="navbar-brand">������� (�������)</a>
                    <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-main">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>
                <div class="navbar-collapse collapse" id="navbar-main">
                    <ul class="nav navbar-nav">
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="" id="themes">C����� �������<span class="caret"></span></a>
                            <ul class="dropdown-menu" aria-labelledby="themes">
                               <li> <a href="orders" >������ � �������������� ������ ������</a></li>
                        <li><a href="hotel" >�������������� ������ ������</a></li>
                        <li><a href="hotel" >�������������� ������ ���� �������</a></li>
                        <li><a href="hotel" >�������������� ������ �����������</a></li>
                        <li><a href="hotel" >�������������� ������ ����� ������</a></li>
                        <li><a href="hotel" >�������������� ������ ����� �������</a></li>
                        <li><a href="hotel" >�������������� ������ ����������</a></li>
                        <li><a href="hotel" >�������������� ������ �����</a></li>
                        <li><a href="hotel" >�������������� ������ �����������</a></li>
                        <li><a href="hotel" >�������������� ������ ��������</a></li>
                        <li><a href="hotel" >������ ��������� �����</a></li>
                        <li><a href="hotel" >�������������� ��������� �����</a></li>
                        <li><a href="hotel" >������ ��������� �������</a></li>
                                <li class="divider"></li>
                            </ul>
                        </li>

                        <li>

                        </li>

                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                      
                        <li><a href="/vc" target="_blank">������� (�������������)</a></li>
                    </ul>
                </div>
            </div>
        </div>
        
        <h3>�������������� ������ ������</h3>
        
        <div class="row" ng-controller="Controller as ctrl" >
            <div class="col-md-1">
            </div>
            <div class="col-md-10">
                
            <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>������������ �����</th>
                            <th>��������������</th>
                            <th width="20%">��������</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr ng-repeat="e in ctrl.units">
                            <td><span ng-bind="e.id"></span></td>
                            <td><span ng-bind="e.name"></span></td>
                            <td><span ng-bind="e.location"></span></td>
                            <td>
                                <button type="button" ng-click="ctrl.edit(e)" 
                                        class="btn btn-success custom-width"
                                        style=" width: 90px !important;">��������</button>  
                                <button type="button" 
                                        ng-click="ctrl.deleteU(e)" 
                                        class="btn btn-danger custom-width"
                                        style=" width: 90px !important;">�������</button>
                            </td>
                        </tr>
                    </tbody>
                </table>    
                
                
            <div style="visibility: {{ctrl.vis}}" > 
                <h3>������� ��� ���� �����</h3>    
            <label>�������� �����</label>
            <input class="form-control " ng-model="ctrl.nameh" type="text" ></input>
            <label>��������������</label>
            <input class="form-control " type="text" ng-model="ctrl.loc" ></input>
            <button ng-click="ctrl.addU()" class="btn btn-primary">��������</button>
                </div>
            </div>
             <div class="col-md-1">
            </div>
            </div>
        </div>
        
        
        
         <script src="resources/js/app/hotels-app.js"></script>
        <script src="resources/js/service/hotels-service.js"></script>
        <script src="resources/js/controller/hotels-controller.js"></script> 
    </body>
</html>
