<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Служебный сайт комплекса гостиниц</title>

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="resources/js/jquery-2.2.2.min.js"></script>
        <!-- Bootstrap -->
        <link href="resources/css/bootstrap.min.css" rel="stylesheet">
        <!-- css code for slider  -->
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="resources/js/bootstrap.min.js"></script>

        <link  href="http://cdnjs.cloudflare.com/ajax/libs/fotorama/4.6.4/fotorama.css" rel="stylesheet"> <!-- 3 KB -->
        <script src="http://cdnjs.cloudflare.com/ajax/libs/fotorama/4.6.4/fotorama.js"></script> <!-- 16 KB --> 

    </head>
    <body>
        <div class="navbar navbar-default navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <a href="/vc/home" class="navbar-brand">Админка (Главная)</a>
                    <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-main">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>
                <div class="navbar-collapse collapse" id="navbar-main">
                    <ul class="nav navbar-nav">
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="" id="themes">Cписок дейсвий<span class="caret"></span></a>
                            <ul class="dropdown-menu" aria-labelledby="themes">
                               <li> <a href="orders" >Подача и редактирование списка заявок</a></li>
                        <li><a href="hotels" >Редактирование списка отелей</a></li>
                        <li><a href="hotel" >Редактирование списка типа номеров</a></li>
                        <li><a href="hotel" >Редактирование списка сотрудников</a></li>
                        <li><a href="hotel" >Редактирование списка типов заявок</a></li>
                        <li><a href="hotel" >Редактирование списка типов питания</a></li>
                        <li><a href="hotel" >Редактирование списка должностей</a></li>
                        <li><a href="hotel" >Редактирование списка работ</a></li>
                        <li><a href="hotel" >Редактирование списка организаций</a></li>
                        <li><a href="hotel" >Редактирование списка программ</a></li>
                        <li><a href="hotel" >Реестр ремонтныъ работ</a></li>
                        <li><a href="hotel" >Редактирование стоимости услуг</a></li>
                        <li><a href="hotel" >Реестр стоимость номеров</a></li>
                                <li class="divider"></li>
                            </ul>
                        </li>

                        <li>

                        </li>

                    </ul>
                    <ul class="nav navbar-nav navbar-right">

                        <li><a href="/vc" target="_blank">Главная (общедоступная)</a></li>
                    </ul>
                </div>
            </div>
        </div>

        <br>
        <br>

        <div class="container">
            <div class="row">
                <div class="col-md-1"></div>
                <div class="col-md-10">
                    <h3>Cписок доступных опций </h3>
                    <ul>
                        <li> <a href="orders" >Подача и редактирование списка заявок</a></li>
                        <li><a href="hotels" >Редактирование списка отелей</a></li>
                        <li><a href="hotel" >Редактирование списка типа номеров</a></li>
                        <li><a href="hotel" >Редактирование списка сотрудников</a></li>
                        <li><a href="hotel" >Редактирование списка типов заявок</a></li>
                        <li><a href="hotel" >Редактирование списка типов питания</a></li>
                        <li><a href="hotel" >Редактирование списка должностей</a></li>
                        <li><a href="hotel" >Редактирование списка работ</a></li>
                        <li><a href="hotel" >Редактирование списка организаций</a></li>
                        <li><a href="hotel" >Редактирование списка программ</a></li>
                        <li><a href="hotel" >Реестр ремонтныъ работ</a></li>
                        <li><a href="hotel" >Редактирование стоимости услуг</a></li>
                        <li><a href="hotel" >Реестр стоимость номеров</a></li>
                    </ul>
                   
                    <h3>Cписок реестров</h3>
                    <ul>
                        <li> <a href="orders" >Оказанные услуги клиентам</a></li>
                        <li> <a href="orders" >Реестр питания</a></li>
                        <li> <a href="orders" >Оказанные услуги клиентам</a></li>


                    </ul>

                </div>
                <div class="col-md-1"></div>
            </div>    
        </div>


    </body>
</html>