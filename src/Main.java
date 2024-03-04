public class Main {
    public static void main(String[] args) {

        Integer[] intArray = {1,2,3,4,5};
        Double[] doubles = {4.0,4.1,4.2,4.3,4.4};
        Character[] characters = {'M','E','S' ,'S','I'};
        String[]  storeaAsString = {"G","O","A","T"};

        // create method for each obj

        displayArray(intArray);
        displayArray(doubles);
        displayArray(characters);
        displayArray(storeaAsString);

    }
    public static   void  displayArray(Integer[] array){
        for(Integer x: array){
            System.out.println("Print X : "+x);
        }
        System.out.println();
    }
    public static   void  displayArray(Double[] array){
        for(Double x: array){
            System.out.println("Print X : "+x);
        }
        System.out.println();
    }
    public static   void  displayArray(Character[] array){
        for(Character x: array){
            System.out.println("Print X : "+x);
        }
        System.out.println();
    }
    public static   void  displayArray(String[] array){
        for(String x: array){
            System.out.println("Print X : "+x);
        }
        System.out.println();
    }

}