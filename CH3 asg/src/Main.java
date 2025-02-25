public class Main {
    public static void main(String[] args) {


        System.out.println("Stack Pushes");
        IntStack stack = new SQIntLinkedList();
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
        IntQueue queue = new SQIntLinkedList();
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
}