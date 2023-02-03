package com.MySpring.DatabaseEx.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJDBCRepo courseJDBCRepo;
    @Override
    public void run(String... args) throws Exception {
        courseJDBCRepo.insert();
    }
}
