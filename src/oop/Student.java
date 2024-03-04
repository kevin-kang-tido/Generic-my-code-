package oop;

public class Student extends Person{

    String id;
    Student(String name, Integer age, String id){
        super(name,age);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("ID : " + id);
    }
}
