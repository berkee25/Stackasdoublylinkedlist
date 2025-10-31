class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class myStack {
    Node head;
    Node middle;
    int size;

    public myStack() {
        size = 0;
        head = null;
        middle = null;
    }

    public int push(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        if (head != null)
            head.prev = newNode;

        head = newNode;
        size++;

        if (size == 1) {
            middle = head;
        } else if (size % 2 == 1) {
            middle = middle.prev;
        }

        return size;
    }
    public int pop() {
        if (size == 0) {
            return -1;
        }
        int val = head.data;//data which will be deleted after run
        head = head.next;
        if (head != null) {
            head.prev = null; //delete connection to delete the node!
        }
        return val;
    }
    public int deleteMidle() {
        if (size == 0)
            return -1;
        int val = middle.data;
        if (middle.prev != null) middle.prev.next = middle.next; //there is very complicated to understand
        if (middle.next != null) middle.next.prev = middle.prev;//imagine as a graph
        size--;
        //to found new middle element
        if (size %2 == 1) {middle = middle.next;}
        else {middle = middle.prev;}
        return val;
    }
    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("Empty Stack");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            if (temp == middle){
                System.out.println("Middle");
            }
            if(temp.next != null){
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
