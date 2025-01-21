public class Main {

    public static int mysteryFunc(int n){
        int result = 1;
        for(int i = 2; i <= n; i++){
            result = result * i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello 3150 Students!");

        for(int i = 0; i <= 6; i++){
            int a = mysteryFunc(i);
            System.out.println(i + " gives result " + a);
        }


    }
}