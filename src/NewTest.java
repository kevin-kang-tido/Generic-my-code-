import org.w3c.dom.ls.LSOutput;

class PersonPoly{
    void showList(){
        System.out.println("hehe ");
    }
}
class StudendPoly extends PersonPoly{
    @Override
    void showList() {
        super.showList();
        System.out.println("Hello 1 2 3 !!!");
    }
}

// encapulation
class BookStore{
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}







public class NewTest {
    public static void main(String[] args) {
        StudendPoly studendPoly = new StudendPoly();
        studendPoly.showList();

        BookStore bookStore = new BookStore();
        bookStore.setId(12);
        bookStore.setName("kevin");

        System.out.println(bookStore.getId());
        System.out.println(bookStore.getName());



    }
}
