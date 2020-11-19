# 打包
FROM gradle:jdk8
WORKDIR /workspace

COPY build.gradle ./
COPY gradle ./gradle
COPY settings.gradle ./
COPY gradlew ./
COPY src ./src

RUN ls -al && ./gradlew bootJar



# 做镜像
