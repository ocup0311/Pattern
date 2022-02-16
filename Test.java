public class Test {
    static int myIntMethod(int x) {
        return 5 + x;
    }


    static void myMethod(String fname, int age) {
        int trueAge = myIntMethod(age);
        System.out.println(fname + " is " + trueAge);
    }

    public static void main(String[] args) {
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
    }
}