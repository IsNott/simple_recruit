# 简单的招聘网站[Simple_recruit]

## 描述[project description]

基于Springboot3的开发练手项目，仿造国网upwork招聘网站开发的后端项目，在个人搭建的springboot3+spring security+jjwt鉴权脚手架进行开发。

脚手架后续上传仓库。

## 依赖[Denpendencyies]

| name                 | version       |
| -------------------- | ------------- |
| Java                 | 17            |
| Spring-Boot          | 3.0.7         |
| Spring-Security-Web  | 6.0.3         |
| jjwt                 | 0.9.1         |
| Guava                | 32.1.2-jre    |
| Hutool               | 5.8.25        |
| Mybatis-plus         | 3.5.0         |
| Log4j                | 2.20.0        |
| Mybatis-Plus-Boot3   | 3.5.5         |
| Spring-Cloud-Alibaba | 2022.0.0.0    |
| Mysql-connector-j    | 8.0.33        |
| OkHttp               | 4.11.0        |
| Redisson             | 3.19.3        |
| Lettuce              | 6.3.0.RELEASE |
| Validation           | 3.0.2         |
| FastJson             | 2.0.46        |

## 模块[Module]

| name                    | description                    |
| ----------------------- | ------------------------------ |
| simple_recruit_api      | 接口模块（Controller）         |
| simple_recruit_bean     | 实体模块                       |
| simple_recruit_common   | 全局通用（配置、枚举、工具类） |
| simple_recruit_security | 安全模块（jjwt+Security）      |
| simple_recruit_service  | 服务层模块（业务）             |

## 参照项目[Reference project]

[spring-boot-redis-jwt]: https://github.com/privatejava/spring-boot-redis-jwt/tree/d0ef93d304d463419a81c7e5b852967595c2aecd