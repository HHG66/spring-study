package org.study;

public class User {
    private String name;


//    public User(String name) {
//        this.name = name;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("执行了setname");
        this.name = name;
    }


    @Override
    public String toString() {
        return  "User{" +
                "name='" + name + '\'' +
                '}';
    }
}

