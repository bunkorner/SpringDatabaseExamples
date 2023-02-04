package com.MySpring.DatabaseEx.course.jpa;

import com.MySpring.DatabaseEx.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJPARepo {
    @PersistenceContext
    EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }
    public void delete(long id) {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }
    public Course select(long id) {
        return entityManager.find(Course.class, id);
    }
}
