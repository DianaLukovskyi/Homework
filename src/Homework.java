public class Homework {
    public static void main(String[] args) {

        String stringHello = "Hello";

        int result = doubleLength(stringHello);
        System.out.println( result );


    }

    public static int doubleLength (String in){
        return in.length() * 2;


    }

}
