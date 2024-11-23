package componentannotation.beanclass;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {
    private String name;
    private int getId;
    private double percentage;

    Student(){
        System.out.println("Student object is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGetId() {
        return getId;
    }

    public void setGetId(int getId) {
        this.getId = getId;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
