public class Main {
    public static void main(String[] args) {
        int a = 19090;
        int b = 15;

//        int temp = a;
//        a = b;
//        b = temp;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a +  " " + b);
    }
}