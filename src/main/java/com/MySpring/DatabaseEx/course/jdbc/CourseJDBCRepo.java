package com.MySpring.DatabaseEx.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;
    private static String InsertQuery =
            """
                INSERT INTO COURSE (ID, NAME, AUTHOR) 
                VALUES(3, 'SPE', 'B. Thangaraju');
            """;
    public void insert() {
        jdbcTemplate.update(InsertQuery);
    }
}
