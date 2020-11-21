# 打包
FROM gradle:jdk8
USER gradle
WORKDIR /workspace

COPY build.gradle ./
COPY gradle ./gradle
COPY settings.gradle ./
COPY gradlew ./
COPY src ./src

USER root
RUN chown -R gradle:gradle .
USER gradle
RUN ls -al && ./gradlew bootJar



# 做镜像
