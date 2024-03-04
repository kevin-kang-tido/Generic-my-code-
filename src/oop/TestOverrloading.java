package oop;
import static java.lang.System.out;

class PersonTow{
    void show(){
        out.println("hello world! ");
    }
}

class StudentTow extends PersonTow{

    @Override
    void show() {
        out.println("Helo helo ");
    }
}






public class TestOverrloading {
    public static void main(String[] args) {

    }
}
