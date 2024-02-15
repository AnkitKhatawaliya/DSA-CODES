package LinkList;

class SingleList{

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data =data;
            this.next = null;
        }
    }
    Node head;

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }else{
            newNode.next = head;
            head = newNode;
            return;
        }
    }
    public void addLast(String last){
        Node newnNode = new Node(last);
        if(head == null){
            head = newnNode;
            return;
        }else{
            Node curNode = head;
            while(curNode.next!=null){
                curNode = curNode.next;
            }
            curNode.next = newnNode;

        }
    }
    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
        }
        Node curNode = head;
        while (curNode!=null) {
            System.out.print(curNode.data+"_");
            curNode = curNode.next;
        }
    }
    public static void main(String[] args) {
        
        SingleList list = new SingleList();
        list.addFirst("OK");
        list.addLast("null");
        list.addFirst("OKau");
        list.printList();


    }
}