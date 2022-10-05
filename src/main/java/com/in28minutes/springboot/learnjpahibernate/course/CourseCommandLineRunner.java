package com.in28minutes.springboot.learnjpahibernate.course;

import com.in28minutes.springboot.learnjpahibernate.course.Course;
import com.in28minutes.springboot.learnjpahibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpahibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpahibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository courseRepository;

    /*@Autowired
    private CourseJpaRepository courseRepository;*/

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        /*courseRepository.insert(new Course(1, "American Secret", "Sanjiv Katiyar"));
        courseRepository.insert(new Course(2, "Learning AWS", "Sanjiv Katiyar"));
        courseRepository.insert(new Course(3, "Learning GCP", "Sanjiv Katiyar"));
        courseRepository.insert(new Course(4, "Learning Azure", "Sanjiv Katiyar"));

        courseRepository.deleteById(1);

        System.out.println(courseRepository.findById(3));
        System.out.println(courseRepository.findById(4));*/


        repository.save(new Course(1, "American Secret", "Sanjiv Katiyar"));
        repository.save(new Course(2, "Learning AWS", "Sanjiv Katiyar"));
        repository.save(new Course(3, "Learning GCP", "Sanjiv Katiyar"));
        repository.save(new Course(4, "Learning Azure", "Sanjiv Katiyar"));

        repository.save(new Course(4, "Learning Azure", "Sanjiv Katiyar"));

        repository.save(new Course(4, "Learning Azure", "Shreyas Katiyar"));

        repository.deleteById(1l);

        System.out.println(repository.findById(3l));
        System.out.println(repository.findById(4l));
    }
}
