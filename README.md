# Reading Group javaee7

## Installation
1. Java JDK 8 installieren
2. Maven installieren
3. Docker installieren
4. Wildfly Basis Image laden (ggf. muss man sich einloggen: docker login)  
`docker pull jboss/wildfly`
5. Image um Admin erweitern, damit Remote Verwaltung für JBoss möglich ist.  
Befehl muss aus dem Verzeichnis ausgeführt werden in dem die Datei Dockerfile liegt.  
`docker build -t jboss/wildfly-admin.`
6. Container erzeugen (startet auch gleich)  
`docker run -p 8080:8080 -p 9990:9990 --name jboss jboss/wildfly-admin`

## Build & Deployment
Mit `mvn install` werden automatisch alle .war-Dateien gebaut.  
Läuft der JBoss werden sie ebenfalls auch gleich deployed

## JBoss
### Starten & Stoppen
Starten und stoppen kann man den Container mit  
`docker start jboss`  
`docker stop jboss`
### JBoss Web Management
### Adresse
<http://localhost:9990>
### Login
Benutzer | Passwort
---------| -------------
 admin   | 1234

## Informationen
### Project Structure
(Ctrl+Alt+Shift+S)  
Project SDK: 1.8  
Project language level: 8

## Demo
<http://localhost:8080/demo/foobar/bar/hans>

## Soap
### WSDL
<http://localhost:8080/soap-service/Hello?WSDL>

### Web Client
<http://localhost:8080/soap-client-web/HelloServlet>

## Rest
<http://localhost:8080/rest-hello/helloworld>