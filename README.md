# javaee7
# Anleitung
# =========
# 1. Java jdk insatllieren
# 2. Maven installieren
# 3. Docker installieren (ich habe Win 10 Pro, da geht es Problemlos, habe eigenen Account erstellt)
# 4. Wildfly Basis Image laden (ggf. muss man sich einloggen: docker login)
docker pull jboss/wildfly
# 5. Image um Admin erweitern, damit Remote Verwaltung für JBoss möglich ist; Befehl muss aus dem Verzeichnis ausgeführt werden in dem die Datei Dockerfile liegt
docker build -t jboss/wildfly-admin .
# 6. Container erzeugen (startet auch gleich)
docker run -p 8080:8080 -p 9990:9990 --name jboss jboss/wildfly-admin
# 7. Starten und stoppen kann man den Container dann mit
docker start jboss
docker stop jboss
# 8. Wie gehabt sollte maven install automatisch demo.war deployen, wenn der jboss läuft
# 9. Logindaten für den jboss sind admin 1234


