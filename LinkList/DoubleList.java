package LinkList;

public class DoubleList {

    public static class Node{

        Node prev;
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static void addToList(Node e, String data){
        Node newNode = new Node(data);
        e.next = newNode;
        newNode.data = data;
        newNode.prev = e;
        newNode.next = null;
    }
    static void printList(Node head){
        Node curNode = head;
        while(curNode!=null){
            System.out.print(curNode.data+" ");
            curNode = curNode.next;
        }
    }
    public static void main(String[] args) {

        Node first = new Node("OKay");
        addToList(first, "Then");
        printList(first);
    }
}
