package com.MySpring.DatabaseEx.course.jdbc;

import com.MySpring.DatabaseEx.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;
    private static String InsertQuery =
            """
                INSERT INTO Course (ID, NAME, AUTHOR) 
                VALUES(?, ?, ?);
            """;
    private static String DeleteQuery =
            """
                Delete from Course where id=?;
            """;

    private static String SelectQuery =
            """
                Select * from Course where id=?;
            """;
    public void insert(Course course) {
        jdbcTemplate.update(InsertQuery, course.getId(), course.getName(), course.getAuthor());
    }
    public void delete(long id) {
        jdbcTemplate.update(DeleteQuery, id);
    }
    public Course select(long id) {
        return jdbcTemplate.queryForObject(SelectQuery, new BeanPropertyRowMapper<>(Course.class), id);
    }
}
