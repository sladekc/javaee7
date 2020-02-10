FROM mcr.microsoft.com/mssql/server:2019-latest

# Vim Installieren
USER root
RUN apt-get update \
    && apt-get install -y \
        nmap \
        vim
USER mssql

# config Verzeichnis erstellen
RUN mkdir -p /usr/config
WORKDIR /usr/config

# Daten kopieren
COPY . /usr/config

# Rechte zum ausfuehren
USER root
RUN chmod +x /usr/config/entrypoint.sh
RUN chmod +x /usr/config/configure-db.sh
USER mssql

ENTRYPOINT ["./entrypoint.sh"]

CMD ["tail -f /dev/null"]

HEALTHCHECK --interval=15s CMD /opt/mssql-tools/bin/sqlcmd -U sa -P $SA_PASSWORD -Q "select 1" && grep -q "MSSQL CONFIG COMPLETE" ./config.log
