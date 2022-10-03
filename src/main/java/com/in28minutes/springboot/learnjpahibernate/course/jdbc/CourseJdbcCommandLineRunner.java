package com.in28minutes.springboot.learnjpahibernate.course.jdbc;

import com.in28minutes.springboot.learnjpahibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {

        courseJdbcRepository.insert(new Course(1, "American Secret", "Sanjiv Katiyar"));
        courseJdbcRepository.insert(new Course(2, "Learning AWS", "Sanjiv Katiyar"));
        courseJdbcRepository.insert(new Course(3, "Learning GCP", "Sanjiv Katiyar"));
        courseJdbcRepository.insert(new Course(4, "Learning Azure", "Sanjiv Katiyar"));

        courseJdbcRepository.deleteById(1);
    }
}
