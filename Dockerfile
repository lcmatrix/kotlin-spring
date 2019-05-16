FROM azul/zulu-openjdk:8
COPY kotlin-spring*.jar app.jar
ENV JAVA_OPTS="-Djava.security.egd=file/dev/./urandom -Xmx=256m"
ENTRYPOINT [ "java", "-jar", "app.jar" ]