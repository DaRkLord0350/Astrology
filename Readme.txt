Techlogies - html,css,js,java,mysql
build-maven

install jdk-21
install apache-tomcat-9.0.93

FrontEnd:
html,javascript,css files stored in 'src/main/webapps' 

files can be oppened directly in browsers independently.

BackENd:

Servlets:
html pages are loaded using JAVAservlets.

Data base setup:
install mysql,mariadb(tested) or any sql connector that works with java jdbc driver.

create a user mainak passwd-********(contact @mainak for passwd)

create a dabase named contact_db;

create a table named contacts ;

create coulmns as according to src/main/java/com/example/formservlet.java 

download the databaseconnector.jar(database you are using) online.

put in the apache-tomacat-9.0.93/lib

Database set for usage; 

Server setup:
run apache-tomact on your local machine or configure it with any IDE.

copy and paste the Astrology.war file from the target and put in the 
/path/to/your/apache/apache-tomcat-9.0.93/webapps folder 

run apache-tomcat on your machine : apache-tomcat-9.0.93/bin startup.bat or startup.sh

acess via 'http://localhost:8080/Astrology/' in browser.


 