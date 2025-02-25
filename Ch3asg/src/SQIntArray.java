import java.util.Arrays;

public class SQIntArray implements IntQueue, IntStack {
    private int[] array = new int[0];

    public static void main(String[] args) {
        System.out.println("Stack Pushes");
        IntStack stack = new SQIntArray();
        for(int i = 1; i <= 9; i++) {
            int x = i * 10;
            stack.push(x);
            System.out.println("Push: " + x + " Stack: " + stack);
        }
        System.out.println("Stack Pops");
        for(int i = 1; i <= 9; i++) {
            int x = stack.pop();
            System.out.println("Pop: " + x + " Stack: " + stack);
        }

        System.out.println("\nQueue enqueues");
        IntQueue queue = new SQIntArray();
        for(int i = 1; i <= 9; i++) {
            int x = i*10;
            queue.enqueue(x);
            System.out.println("Enqueue: " + x + " Queue: " + queue);
        }
        System.out.println("Queue dequeues");
        for(int i = 1; i <= 9; i++) {
            int x = queue.dequeue();
            System.out.println("Dequeue: " + x + " Queue: " + queue);
        }
    }

    @Override
    public void enqueue(int x) {
        int[] tempArray = new int[array.length+1];

        for (int i = 0; i < array.length;i++) {
            tempArray[i] = array[i];
        }

        tempArray[array.length] = x;
        array = tempArray;
    }


    @Override
    public int dequeue() {
        int first = array[0];
        int[] tempArray = new int[array.length-1];

        for (int i = 1; i < array.length; i++) {
            tempArray[i-1] = array[i];
        }

        array = tempArray;
        return first;
    }



    @Override
    public void push(int x) {
        int[] tempArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }

        tempArray[array.length] = x;
        array = tempArray;
    }

    @Override
    public int pop() {
        int last = array[array.length-1];
        int[] tempArray = new int[array.length-1];

        for (int i = 0; i < array.length-1; i++) {
            tempArray[i] =  array[i];
        }

        array = tempArray;
        return last;
    }

 
    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}