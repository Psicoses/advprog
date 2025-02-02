import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1, 44,3,5,7,9,11};
        int[] b = new int[]{2,4,6,8,10,12};
        System.out.println(Arrays.toString(merge(a, b)));
    }

    public static  int[] mergeSort(int[] nums){
        if(nums.length < 2){
            return nums;
        }

        int halfway = nums.length/2;
        int[] a = new int[halfway];
        int[] b = new int[nums.length-halfway];

        System.arraycopy(nums, 0, a, 0, a.length);
        System.arraycopy(nums, halfway, b, 0, b.length);

        return merge(mergeSort(a), mergeSort(b));

    }

    public static int[] merge(int[] a, int[] b){
        int[] c= new int[a.length + b.length];

        int ai =0, bi =0;

        for(int ci = 0; ci < c.length; ci++){
            if(ai == a.length){
                c[ci] = b[bi];
                bi++;
            }else if(bi == b.length){
                c[ci] = a[bi];
                ai++;
            }else if(a[ai] < b[bi]){
                c[ci] = a[ai];
                ai++;
            }else if(b[bi] < a[ai]){
                c[ci] = b[bi];
                bi++;
            }
        }
        return c;
    }
}