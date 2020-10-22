## docker 安装 redis

#####1.获取最新 redis 镜像  
```
docker pull redis
```

#####2.从官网获取 redis.conf 配置文件并修改默认配置文件  
- bind 127.0.0.1 注释掉这部分，这是限制 redis 只能本地访问    
- protected-mode no 默认 yes，开启保护模式，限制为本地访问    
- daemonize no 默认 no，改为 yes 意为以守护进程方式启动，可后台运行，除非kill进程（可选），改为yes会使配置文件方式启动 redis 失败  
- dir  ./ 输入本地redis数据库存放文件夹（可选）    
- appendonly yes #redis持久化（可选）

#####3.启动 redis 镜像  
```
docker run -p 6379:6379 --name redis -v /usr/local/docker/redis/redis.conf:/etc/redis/redis.conf -v /usr/local/docker/redis/data:/data -d redis redis-server /etc/redis/redis.conf --appendonly yes
```

其中:   
- -p 6379:6379 端口映射：前者表示主机部分，后表示容器部分
- --name redis 指定该容器名称
- -v 挂载目录，前者为主机目录，后者为 docker 目录
- -d redis 表示后台启动redis
- redis-server /etc/redis/redis.conf  以配置文件启动redis，加载容器内的 conf 文件，最终找到的是挂载的目录 /usr/local/docker/redis.conf
- appendonly yes 开启 redis 持久化

#####4.进入 redis 命令行  
```
docker exec -it dbde4ea9eacc(docker container id)  redis-cli
```