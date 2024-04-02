import java.util.Random;

class Node {
    final int data;
    final int index;
    Node next;

    Node(int data, int index) {
        this.data = data;
        this.index = index;
    }
}

public class OddEvenLinkList {

    public static void main(String[] args) {
        Node first = null;
        Node last = null;

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            if (first == null) {
                first = new Node(random.nextInt(10) + 10, i);
                last = first;
            } else {
                last.next = new Node(random.nextInt(10) + 10, i);
                last = last.next;
            }
        }

        Node current = first;
        System.out.println("\nThe numbers in the linked list are:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        current = first;
        System.out.println();
        while (current != null) {
            if(current.index<10) {
                System.out.print(" "+current.index + " ");
            }else {
                System.out.print(current.index + " ");
            }
            current = current.next;
        }

        rearrangeOddEven(first);

        current = first;
        System.out.println("\nThe numbers after rearranging:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        current = first;
        System.out.println();
        while (current != null) {
            if(current.index<10) {
                System.out.print(" "+current.index + " ");
            }else {
                System.out.print(current.index + " ");
            }
            current = current.next;
        }
    }

    public static void rearrangeOddEven(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        Node even = head;
        Node odd = head.next;
        Node oddStart = odd;

        while (even.next != null && odd.next != null) {
            even.next = odd.next;
            even = even.next;

            if (even.next != null) {
                odd.next = even.next;
                odd = odd.next;
            }
        }

        even.next = oddStart;
        odd.next = null;
    }
}
