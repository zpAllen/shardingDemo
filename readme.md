1.拉取镜像
docker pull apache/sharding-proxy

2.启动容器
---
   设置宿主机文件目录映射到容器目录，--privileged 赋权 解决容器目录访问无权限的问题，
设置proxy的访问端口为3308
docker run -d -v /app/sharding-proxy/config:/opt/sharding-proxy/conf --privileged -e PORT=3308 -p13308:3308 apache/sharding-proxy:latest