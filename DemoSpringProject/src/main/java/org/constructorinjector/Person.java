package org.constructorinjector;

public class Person {
    private String name;
    private int peronId;

    Person(String name ,int peronId){
        this.name=name;
        this.peronId=peronId;
    }

    @Override
    public String  toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", peronId=" + peronId +
                '}';
    }
}
