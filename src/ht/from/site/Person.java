package ht.from.site;

class Person {

    private String name;
    private double strength;
    private boolean isPassCourse = false;

    Person(String name) {
        this.name = name;
        strength = Math.random() * 10;
    }

    String getName() {
        return name;
    }

    boolean isPassCourse() {
        return isPassCourse;
    }

    void setPassCourse(boolean passCourse) {
        isPassCourse = passCourse;
    }

    double getStrength() {
        return strength;
    }
}
