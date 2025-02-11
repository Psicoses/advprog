public class SQIntLinkedList implements IntStack, IntQueue{

    private Node first;
    private Node last;

    public SQIntLinkedList(){
        this.first = null;
        this.last = null;
    }

    @Override
    public void enqueue(int x) {
        Node n = new Node(x);
        if(first == null){
            //nothing on list
            first = n;
            last = n;
        }else{
            last.setNext(n);
            n.setPrev(last);
            last = n;
        }
    }

    @Override
    public int dequeue() {
        return 0;
    }

    @Override
    public void push(int x) {

    }

    @Override
    public int pop() {
        return 0;
    }
}
