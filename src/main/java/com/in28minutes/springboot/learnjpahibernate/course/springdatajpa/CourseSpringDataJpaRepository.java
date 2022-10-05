package com.in28minutes.springboot.learnjpahibernate.course.springdatajpa;

import com.in28minutes.springboot.learnjpahibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
}
