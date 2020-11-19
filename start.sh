#!/bin/sh

# 启动数据库
docker-compose --project-directory ./deploy -f deploy/docker-compose.yml up -d

# 启动后端服务

# 启动前端服务