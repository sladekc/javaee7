FROM jboss/wildfly
RUN /opt/jboss/wildfly/bin/add-user.sh admin 1234 --silent
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0", "-c", "standalone.xml", "--debug", "*:8787"]