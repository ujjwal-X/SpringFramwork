package com.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class StudentDbOperations {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int addStudnet(Student student){
        String query= "insert into student values (2,\"Dilip\",\"Kumar\",30)";
        return jdbcTemplate.update(query);
    }
    public void deleteStudent(Student student){
        String query= "delete from student where id=1";
        jdbcTemplate.update(query);
    }
}
