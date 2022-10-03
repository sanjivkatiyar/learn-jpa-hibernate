package com.in28minutes.springboot.learnjpahibernate.course.jdbc;

import com.in28minutes.springboot.learnjpahibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static String INSERT_QUERY =
            /*"""
                    insert into course (id, name, author)
                    values (1, 'Secrets of USA', 'Sanjiv Katiyar')
                    """;*/
            """
                    insert into course (id, name, author)
                    values (?, ?, ?)
                    """;
    private static String DELETE_QUERY = """
            delete from course where id = ?
            """;
    public void insert(Course course)
    {
        jdbcTemplate.update(INSERT_QUERY,course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id)
    {
        jdbcTemplate.update(DELETE_QUERY,id);
    }
}
