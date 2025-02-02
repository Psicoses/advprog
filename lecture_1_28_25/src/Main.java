//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(sr("abcdefghi"));
    }

    public static String sr(String str){
        if(str.length() == 1){
            return str;
        }
        int n = str.length()-1;

        return (str.charAt(n) + sr(str.substring(0,n)));
    }

}