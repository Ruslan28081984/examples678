public class Main {
    public static void main(String[] args) {
        example6();
        example7();
        example8();
    }

    private static void example6(){
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = ((a * (b + (c - d * e))) * -1);
        System.out.println(result);
    }

    private static void example7(){
        int a = 5;
        int b = 7;
        a = a + b - (b = a);
        System.out.println(" a = " + a + "  b = " + b);
    }

    private static void example8(){
        int A = 973;
        int B = (A / 10) % 10;
        System.out.println( B );
        System.out.println( A );
    }

}