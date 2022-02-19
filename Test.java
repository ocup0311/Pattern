public class Main {
    public static void main(String[] args) {

        int sum ( int k){
            if (k > 0) {
                return k + sum(k - 1);
            } else {
                return 0;
            }
        }


        int result = sum(10);
        System.out.println(result);


    }


}