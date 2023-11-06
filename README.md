# springTest1
One spring test project

## 使用的技术
1. Spring Boot
2. mybatis

## 数据库
MySQL数据库

### MySQL数据库8.0安装过程：
**解压目录**

**配置环境变量**

**执行命令**
1. mysqld install（安装服务）
2. mysqld --initialize --console（有密码，注意）
3. mysql -u root -p  输入密码
4. alter user 'root'@'localhost' identified by 'root'（更新root密码）
5. flush privileges （刷新权限）
6. create database dataBaseName（创建数据库）
7. use dataBaseName（切换数据库）

### 数据库脚本
<code>
create table test1
(
    id   int         not null primary key,
    name varchar(56) null
);

insert into test1 (id, name)
values (1, '张三');
</code>

## 测试
启动项目后访问 http://localhost:8080/test1/findAll
若出现如下结果，说明测试通过

<code>
[
    {
        "id": 1,
        "name": "张三"
    }
]
</code>
