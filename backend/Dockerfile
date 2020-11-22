# 打包
FROM openjdk:8-alpine
WORKDIR /workspace

COPY build.gradle ./
COPY gradle ./gradle
COPY settings.gradle ./
COPY gradlew ./

RUN ./gradlew --refresh-dependencies
COPY src ./src
RUN ./gradlew bootJar
RUN ls -al

# 镜像
FROM openjdk:8-alpine
WORKDIR /workspace
COPY --from=0 /workspace/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]