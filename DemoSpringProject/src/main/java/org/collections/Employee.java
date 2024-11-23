package org.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private String name;
    private List<String> numbers;
    private Set<String> adresses;
    private Map<String,Integer> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public Set<String> getAdresses() {
        return adresses;
    }

    public void setAdresses(Set<String> adresses) {
        this.adresses = adresses;
    }

    public Map<String, Integer> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, Integer> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", numbers=" + numbers +
                ", adresses=" + adresses +
                ", courses=" + courses +
                '}';
    }
}
