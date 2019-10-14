package com.test.jdbc;

import com.test.jdbc.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        JdbcTemplate bean =(JdbcTemplate) context.getBean("jdbcTemplate");
        //增加方法
       // String sql = "insert into student values(?,?,?)";
        //int update = bean.update(sql, new Object[]{2, "欧阳", 18});
        //删除方法
        //String sql = "delete from student where id=?";
        //int update = bean.update(sql, 1);
        //修改方法
        //String sql = "update student set name='阳祥伟' where id =2";
        //int update = bean.update(sql);
        //查的方法
        String sql = "select * from student";
        BeanPropertyRowMapper<Student> studentBeanPropertyRowMapper = new BeanPropertyRowMapper<>(Student.class);
        //查询单个
        //Student student = bean.queryForObject(sql,studentBeanPropertyRowMapper);
        //查询多个
        List<Student> students = bean.query(sql,studentBeanPropertyRowMapper);
        for (Student student:students
             ) {
            System.out.println(student);
        }
    }
}
