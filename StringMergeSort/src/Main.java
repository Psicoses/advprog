public class Main {

    public static void main(String[] args) {
       // System.out.println(mergeStrings("ze", "bra"));
      //  System.out.println(mergeSort("zebra"));
    }

    public static String mergeSort(String str){
        if(str.length() <= 1){
            return str;
        }

        int halfway = str.length()/2;
        String a = str.substring(0, halfway);
        String b = str.substring(halfway);

        return mergeStrings(mergeSort(a),mergeSort(b));
    }

    public static String mergeStrings(String a, String b){
        String c = "";

        int ai = 0, bi = 0;

        while(ai < a.length() || bi < b.length()){
            if(ai == a.length()){
                c += b.charAt(bi);
                bi++;
            } else if (bi == b.length()) {
                c += a.charAt(ai);
                ai++;
            }else if (a.charAt(ai) <= b.charAt(bi)){
                c += a.charAt(ai);
                ai++;
            }else{
                c += b.charAt(bi);
                bi++;
            }

        }

        return c;
    }

}
