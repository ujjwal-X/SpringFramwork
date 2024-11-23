package com.springcore.standalonecollection;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Person {

    @Autowired
    private List<String> friends;

    public void setFriends(List<String> friends){
        this.friends=friends;
    }
    public List<String> getFriends(){
        return friends;
    }
    Person(){


    }
    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                '}';
    }

    Person(List<String> friends){
        this.friends=friends;
    }

}
