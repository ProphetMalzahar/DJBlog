# 这是一个简单的博客系统。  


学习期间做的一个demo。  


这部分是后端。  


这是[前端链接](https://github.com/ProphetMalzahar/DJBlog-vue)  


后续会部署到阿里云，最近求职比较忙~~懒~~。  




## 截图

### 登录界面

![](https://img-blog.csdnimg.cn/20200829151548297.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0hlcmFsZHZpa3Rvcg==,size_16,color_FFFFFF,t_70#pic_center)

### 博客界面

![](https://img-blog.csdnimg.cn/20200829151549548.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0hlcmFsZHZpa3Rvcg==,size_16,color_FFFFFF,t_70#pic_center)

### 编辑界面

![](https://img-blog.csdnimg.cn/2020082915154919.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0hlcmFsZHZpa3Rvcg==,size_16,color_FFFFFF,t_70#pic_center)

## 技术

### 前端:
+ vue
+ element-ui
+ axios

### 后端:
+ mybatis plus
+ springboot
+ mysql
+ shiro
+ redis
+ jwt

## 注意事项

B站评论区一位老哥在博客中提到的。页面Could not get a resource from the pool后端控制台redis connection fail远程连接不上。
这个问题是因为没有访问服务器到127.0.0.1:6379。

可以这样解决：**先开启一个cmd到Redis所在的文件夹，运行 redis-server.exe redis.windows.conf。**
再开启一个cmd,**运行 redis-cli.exe -h 127.0.0.1 -p 6379** 要注意这两个窗口不能关闭，否则又会出现问题。

其他常见的问题大都不难解决。以前做web项目时遇到过的包括MySQL版本问题，时区问题，com.mysql.jdbc.Driver 和 com.mysql.cj.jdbc.Driver的区别
等等，去网上找原因的同时也要追本溯源，知道错误的原因。才能不断进步。

## 致谢
[MarkerHub](https://space.bilibili.com/13491144)
[vsblog](https://github.com/YUbuntu0109/vsblog)
