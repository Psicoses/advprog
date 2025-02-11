public class Main {
    static float steps = 0;
    public static void main(String[] args) {
  //      Register register = new Register();

    //    register.start();

       System.out.println(fibRecur(100) + "steps: "+ steps);

    }

    public static float fibRecur(float x){
        if(x <= 1){
            return x;
        }
        steps++;
        return fibRecur(x-2) + fibRecur(x-1);
    }

}
