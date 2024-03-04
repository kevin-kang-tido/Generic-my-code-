public class WithGeneric {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubles = {4.0,4.1,4.2,4.3,4.4};
        Character[] characters = {'M','E','S' ,'S','I'};
        String[]  storeaAsString = {"G","O","A","T"};

        // create method can use all objects

        System.out.println(getObject(intArray));
        System.out.println(getObject(doubles));
        System.out.println(getObject(characters));
        System.out.println(getObject(storeaAsString));

        printArray(intArray);
        printArray(doubles);
        printArray(characters);
        printArray(storeaAsString);


    }


    public static <ShowMe> void printArray(ShowMe[] array) {

//        T[] array = new T[5];


        for (ShowMe x : array) {
            System.out.println("Print X: " + x);
        }
        System.out.println();
    }

    public static  <ShowMe> ShowMe getObject(ShowMe[] array){
        return array[0];
    }
    public static  <showMe> showMe set(showMe[] array){

        return array[0];
    }


}
