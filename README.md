# springJdbc
Spring_JDBC操作
1、准备数据库并创建学生表 student 并插入一条数据
2、新建项目添加依赖
3、创建 Spring Bean 配置文件（bean id="dataSource"和bean id="jdbcTemplate"）
4、创建 App.java，使用update实现增删改  int count=jdbcTemplate.update(sql,new Object[]{"shiyanlou1",20,1});
  查需要建一个实体类Student,使用RowMappe包装成对象、使用query方法查询
