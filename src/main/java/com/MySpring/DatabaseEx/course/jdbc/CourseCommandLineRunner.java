package com.MySpring.DatabaseEx.course.jdbc;

import com.MySpring.DatabaseEx.course.Course;
import com.MySpring.DatabaseEx.course.jpa.CourseJPARepo;
import com.MySpring.DatabaseEx.course.springdata.CourseSpringDataJPA;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJDBCRepo courseJDBCRepo;
//    @Autowired
//    private CourseJPARepo courseJDBCRepo;
    @Autowired
    private CourseSpringDataJPA courseSpringDataJPA;
    @Override
    public void run(String... args) throws Exception {
        long id=1;
        Course course = new Course(id, "SS", "Pote");
        courseSpringDataJPA.save(course);
        id=2;
        course = new Course(id, "SS1", "Pote1");
        courseSpringDataJPA.save(course);
        id=3;
        course = new Course(id, "SS2", "Pote");
        courseSpringDataJPA.save(course);
//        System.out.println("Delete karu chu");
//        courseSpringDataJPA.deleteById(id);
//        Course course1 = ;
//        System.out.println(courseSpringDataJPA.findById(2l));
//        System.out.println(course1);
//        System.out.println(courseSpringDataJPA.count());
//        System.out.println(courseSpringDataJPA.findByAuthor("Pote"));
        System.out.println(courseSpringDataJPA.findByName("SS"));
    }
}
