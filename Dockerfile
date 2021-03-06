FROM openjdk:8-jdk-alpine
EXPOSE 8080
VOLUME /tmp
ARG DEPENDENCY=build/libs
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","com.minskrotterdam.randomuser.RandomuserDemoApplicationKt"]