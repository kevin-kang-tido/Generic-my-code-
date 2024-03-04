package oop;

public class Person {
//    Encapulation
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public  void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age );
    }
}
