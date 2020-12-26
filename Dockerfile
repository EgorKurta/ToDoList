FROM openjdk:8-jdk-alpine

ARG JAR_FILE

RUN mkdir -p /todoapplctn
COPY ./target/${JAR_FILE} /todoapplctn/app.jar
COPY ./entrypoint.bat /todoapplctn/entrypoint.bat
RUN chmod +x /todoapplctn/entrypoint.bat

CMD ["/todoapplctn/entrypoint.bat"]