package codingInclass;
import oop.Person;

//class Util<T>{
//   private  T data;
//
//   public void getDate(T data){
//       System.out.println(data);
//   }
//
//}



//class Test{
//    public static <T extends Person> void printData(T person){
//        System.out.println(person);
//    }
//
//}

class PersonTwo<T,P>{
    private  T id;
    private P name;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public P getName() {
        return name;
    }

    public void setName(P name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonTwo{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
class Product{

}


//bounded types
public class GeneticFollow {
//    public static <T extends Comparable<T>> int compare(T a, T b){
//
//        return a.compareTo(b);
//    }
    static  void tableForm(){

    }


    public static <T> void check(T data){
        if(data instanceof PersonTwo<?,?>){
            System.out.println("the table for person ");
        }else if (data instanceof Product){
            System.out.println("this instand of prodcuts");
        }
    }
    public static void main(String[] args) {
//        System.out.println(compare(5,8));
          PersonTwo<Integer , String> data = new PersonTwo<>();
          data.setId(12);
          data.setName("Mr Supper Jonh");
        System.out.println(data.getName());
          data.setName("Hello World!!");
        System.out.println(data);
    }
}
