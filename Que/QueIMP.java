package Que;

public class QueIMP {
    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class  Que {
    
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null&&tail == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(tail == null){
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
        }

        public static int Remove(){
            if(isEmpty()){
                System.out.println("Emoty Queue");
                return -1;
            }
            if(head == tail){
                tail = null;
            }
            int front = head.data;
            head = head.next;
            return front;
        }
        public static int Peek(){
            if(head == tail){
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
        
    }
    public static void main(String[] args) {
        Que a = new Que();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        System.out.println(a.Remove());
        System.out.println(a.Peek());
    }
}

