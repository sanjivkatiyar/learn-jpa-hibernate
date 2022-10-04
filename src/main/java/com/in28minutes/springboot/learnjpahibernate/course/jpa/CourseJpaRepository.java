package com.in28minutes.springboot.learnjpahibernate.course.jpa;

import com.in28minutes.springboot.learnjpahibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    public void insert(Course course)
    {
        entityManager.merge(course);
    }

    public void deleteById(long id)
    {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

    public Course findById(long id){
        return entityManager.find(Course.class,id);
    }
}

