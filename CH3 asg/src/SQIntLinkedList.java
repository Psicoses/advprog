public class SQIntLinkedList implements IntStack, IntQueue{
    Node left;
    Node right;

    public SQIntLinkedList(){
        left = null;
        right = null;
    }

    @Override
    public void enqueue(int x) {
        Node newNode = new Node(x);

        if(right == null){
            right = newNode;
            left = newNode;
        }else {
            right.next = newNode;
            newNode.prev = right;
            right = newNode;
        }
    }

    @Override
    public int dequeue() {
        int tempVal = left.value;
        left = left.next;

        return tempVal;
    }

    @Override
    public void push(int x) {
        Node newNode = new Node(x);

        if(right == null){
            right = newNode;
            left = newNode;
        }else {
            right.next = newNode;
            newNode.prev = right;
            right = newNode;
        }
    }

    @Override
    public int pop() {
        int tempVal = right.value;
        right = right.prev;

        if(right == null){
            left = null;
        }else{
            right.next = null;
        }


        return tempVal;
    }

    @Override
    public String toString() {
        String result = "[";
        Node current = left;

        while (current != null) {
            result += current.value;
            if (current.next != null) {
                result += ", ";
            }
            current = current.next;
        }

        result += "]";
        return result;
    }
}
