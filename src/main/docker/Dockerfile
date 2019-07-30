FROM gcr.io/google-appengine/openjdk:8
ADD springboot-webapp-*.jar app.jar

RUN /bin/cp -f /usr/share/zoneinfo/Asia/Tokyo /etc/localtime

RUN groupadd ore_group && useradd -g ore_group wai_user
USER wai_user

EXPOSE 8080
#ENV JAVA_OPTS="-Dspring.profiles.active=prod"
ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
