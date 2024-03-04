public class NamingGeneric {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Character[] characters = {'H','E','L' ,'L','O'};
        // single capital letter
        printArray(intArray);
        printArray(characters);
        // multiple letter
        test(intArray);
        test(characters);

    }
    public static <T> void printArray(T[] array) {
        for (T x : array) {
            System.out.println("Print X: " + x);
        }
        System.out.println();
    }
    public static <ShowValues> void test(ShowValues[] array) {
        for (ShowValues x : array) {
            System.out.println("Print X: " + x);
        }
        System.out.println();
    }
}
