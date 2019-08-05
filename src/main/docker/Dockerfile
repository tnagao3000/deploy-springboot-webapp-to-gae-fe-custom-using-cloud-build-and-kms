FROM gcr.io/google-appengine/openjdk:8
EXPOSE 8080

RUN /bin/cp -f /usr/share/zoneinfo/Asia/Tokyo /etc/localtime
RUN groupadd ore_group && useradd -g ore_group wai_user
USER wai_user

ENV JAVA_OPTS=""
ADD springboot-webapp-*.jar app.jar

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
