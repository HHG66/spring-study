package org.injectMap;

public class Teacher {
    private String tName;
    private int tAge;

    public void  run(){
        System.out.println("Teacher run");
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public int gettAge() {
        return tAge;
    }

    public void settAge(int tAge) {
        this.tAge = tAge;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tName='" + tName + '\'' +
                ", tAge=" + tAge +
                '}';
    }

}
