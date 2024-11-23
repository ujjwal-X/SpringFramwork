package spring.courses;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
public class ConfigureCourse {

    @Bean("course1")
    public CourseDetails getCourseDetails(){
        CourseDetails course=new CourseDetails();
        course.setCourse("Java");
        course.setNoDays(6);
        return course;
    }
}
