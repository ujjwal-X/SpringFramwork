package spring.courses;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("python")
@Scope("Prototype")
public class CourseDetails {
    private String course;
    private int noDays;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getNoDays() {
        return noDays;
    }

    public void setNoDays(int noDays) {
        this.noDays = noDays;
    }

    public CourseDetails(String course, int noDays) {
        this.course = course;
        this.noDays = noDays;
    }
    CourseDetails(){
        System.out.println("Course Details instance created");
    }
}
