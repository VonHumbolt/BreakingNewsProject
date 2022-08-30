# Breaking News MVC Project
### <li> Simple Spring Mvc Project written by Java

## Brief
<p style="text-indent: 20px">
Breaking News App is simple Java Spring Mvc project. In this project, 
all news are listed in the home page. User can go to the details of the news
by clicking on the read more text. Also, The person can search within the news 
according to the news titles and content. In the detail page, user can display
all content of the news. The user can view all the news of the author
or news source by clicking on their names.

</p>

## Technologies

<p style="text-indent: 20px">
    In this project, MVC design pattern was used with Spring. 
    For database and its connection, Spring JDBC and Mysql was used.
    Mysql database created via Docker. All necessary configurations to create 
    the database were written in the docker-compose file. 
</p>
<p>
    At the view side, bootstrap and css was used to design. There are
2 jsp view file in this project. These jsp files are in /src/webapp/WEB-INF/view locations.
</p>

## Layers And Files
<ol>
    <b><li> Config Layer </li></b>
        <p>
    Dispatcher Servlet initialization and Servlet Config class are in this layer.
    Jsp files locations and database connections codes are in servlet config class.
        </p>

<b><li> Controller Layer </li></b>
<p> 
    Controller classes which are annotated with @Controller annotations are here.
    Controller classes receive the requests from the client. Then, After the process, 
    it can return view which is a jsp file. 
</p>

<b><li> Model Layer </li></b>
<p>
    Project model classes which are represented in the database as a table are in this class.
    Dto classes which are used getting request and sending response is here.
</p>

<b><li> Repository Layer </li></b>
<p>
    For database access, all necessary interfaces and classes are here.
    Sql queries which are necessary for data processing are written in this layer.
</p>

<b><li> Service Layer </li></b>
<p>
    Business codes are written in this layer. From this layer, 
    project repositories are communicated with dependency injection.
</p>

<b><li> Util Layer </li></b>
<p>
    Helper classes such as RowMappers are here. NewDtoRowMapper class 
allows the dto object to match the database table.  
</p>

<b><li> Docker Compose File </li></b>
<p>
    Docker compose file for running the mysql database.
</p>

<b><li> database.properties File </li></b>
<p>
    Properties file for database configurations. Database username,
password, database url and driver class name are in this file.
</p>

</ol>

## Project Images
<li>Home Page</li>
<p>
    <img src="home_page.jpg" />
</p>

<li>News Detail Page</li>
<p>
    <img src="detail_page.jpg" />
</p>

<li>Search Results</li>
<p>
    <img src="search_page.jpg" />
</p>


