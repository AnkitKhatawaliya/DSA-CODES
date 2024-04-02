import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }
}

class AVLTree {
    private TreeNode root;

    public AVLTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null)
            return new TreeNode(data);

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }
}


class SingleLinkedList {
    static class SingleNode {
        int data;
        SingleNode next;

        SingleNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    SingleNode head;

    void insertData(int data) {
        SingleNode newNode = new SingleNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        SingleNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void displayList() {
        SingleNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
        void bubbleSort() {
            if (head == null || head.next == null) {
                return;
            }

            boolean swapped;
            SingleNode current;
            SingleNode last = null;

            do {
                swapped = false;
                current = head;

                while (current.next != last) {
                    if (current.data > current.next.data) {
                        int temp = current.data;
                        current.data = current.next.data;
                        current.next.data = temp;

                        swapped = true;
                    }
                    current = current.next;
                }
                last = current;
            } while (swapped);
        }
    int[] array() {
        if (head == null) {
            return new int[0];
        }

        int size = 0;
        SingleNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int[] arr = new int[size];

        temp = head;
        int index = 0;
        while (temp != null) {
            arr[index++] = temp.data;
            temp = temp.next;
        }
        return arr;
    }
}


class DoublyLinkedList {
    class DoubleNode {
        int data;
        DoubleNode prev;
        DoubleNode next;

        DoubleNode(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    DoubleNode head;

    void insertData(int data) {
        DoubleNode newNode = new DoubleNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DoubleNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    void displayList() {
        DoubleNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void bubbleSort() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        DoubleNode current;
        DoubleNode last = null;

        do {
            swapped = false;
            current = head;

            while (current.next != last) {
                if (current.data > current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;

                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
    }

    int[] array() {
        if (head == null) {
            return new int[0];
        }

        int size = 0;
        DoubleNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int[] arr = new int[size];

        temp = head;
        int index = 0;
        while (temp != null) {
            arr[index++] = temp.data;
            temp = temp.next;
        }

        return arr;
    }
}

class CircularSingle {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    void insertData(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    void bubbleSort() {
        if (head == null || head.next == head) {
            return;
        }

        boolean swapped;
        Node last;

        do {
            swapped = false;
            last = head;

            Node current = head;
            while (current.next != last) {
                if (current.data > current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;

                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
    }

    int[] array() {
        if (head == null) {
            return new int[0];
        }

        int size = 0;
        Node temp = head;
        do {
            size++;
            temp = temp.next;
        } while (temp != head);

        int[] arr = new int[size];

        temp = head;
        int index = 0;
        do {
            arr[index++] = temp.data;
            temp = temp.next;
        } while (temp != head);

        return arr;
    }
}

class CircularDouble{
    static class Node{
        int data;
        Node prev, next;
        Node(int data){
            this.data = data;
            prev = next = null;
        }
    }

    Node head;
    Node tail;

    CircularDouble() {
        head = tail = null;
    }

    void insertData(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        tail.next = head;
        head.prev = tail;
    }


    void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
    boolean isSorted() {
        if (head == null || head == tail) {
            return true;
        }

        Node current = head;
        while (current.next != head) {
            if (current.data > current.next.data) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    void sort() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (!isSorted()) {
            temp = head;

            while (temp.next != head) {
                if (temp.data > temp.next.data) {
                    int tempd = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = tempd;
                }
                temp = temp.next;
            }
        }
    }

    int[] array() {
        if (head == null) {
            return new int[0];
        }

        int size = 0;
        Node temp = head;
        do {
            size++;
            temp = temp.next;
        } while (temp != head);

        int[] arr = new int[size];

        temp = head;
        int index = 0;
        do {
            arr[index++] = temp.data;
            temp = temp.next;
        } while (temp != head);

        return arr;
    }
}

public class Linked_List {
    public static void main(String[] args) {
        int[] arr = new int[0]; // Initialize with an empty array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your Choice: ");
        System.out.println("1. Create a Singly Linked list.");
        System.out.println("2. Create a Doubly Linked list.");
        System.out.println("3. Create a Singly Circular Linked list.");
        System.out.println("4. Create a Doubly Circular Linked list.");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the number of digits you want to enter: ");
                int count = scanner.nextInt();
                SingleLinkedList singlyLinkedList = new SingleLinkedList();
                for (int i = 0; i < count; i++) {
                    System.out.print("Enter digit " + (i + 1) + ": ");
                    int data = scanner.nextInt();
                    singlyLinkedList.insertData(data);
                }
                System.out.print("Singly Linked List (before sorting): ");
                singlyLinkedList.displayList();

                singlyLinkedList.bubbleSort();

                System.out.print("Singly Linked List (after sorting): ");
                singlyLinkedList.displayList();
                arr =singlyLinkedList.array();
                break;
            case 2:

                System.out.print("Enter the number of digits you want to enter: ");
                int countDoubly = scanner.nextInt();
                DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
                for (int i = 0; i < countDoubly; i++) {
                    System.out.print("Enter digit " + (i + 1) + ": ");
                    int data = scanner.nextInt();
                    doublyLinkedList.insertData(data);
                }
                System.out.print("Doubly Linked List (before sorting): ");
                doublyLinkedList.displayList();

                doublyLinkedList.bubbleSort();

                System.out.print("Doubly Linked List (after sorting): ");
                doublyLinkedList.displayList();
                arr =doublyLinkedList.array();

                break;
            case 3:
                System.out.print("Enter the number of digits you want to enter: ");
                int circularsingular = scanner.nextInt();
                CircularSingle circularSingle = new CircularSingle();

                for (int i = 0; i < circularsingular; i++) {
                    System.out.print("Enter digit " + (i + 1) + ": ");
                    int data = scanner.nextInt();
                    circularSingle.insertData(data);
                }

                System.out.print("Circular Linked List (before sorting): ");
                circularSingle.displayList();

                circularSingle.bubbleSort();

                System.out.print("Circular Linked List (after sorting): ");
                circularSingle.displayList();
                arr =circularSingle.array();

                break;
            case 4:

                System.out.print("Enter the number of digits you want to enter: ");
                int countd = scanner.nextInt();
                CircularDouble doubleCircular = new CircularDouble();

                for (int i = 0; i < countd; i++) {
                    System.out.print("Enter digit " + (i + 1) + ": ");
                    int data = scanner.nextInt();
                    doubleCircular.insertData(data);
                }

                System.out.print("Circular Doubly Linked List (before sorting): ");
                doubleCircular.displayList();

                doubleCircular.sort();

                System.out.print("Circular Doubly  Linked List (after sorting): ");
                doubleCircular.displayList();
                arr =doubleCircular.array();
                break;
                default:
                System.out.println("Invalid choice.");
                break;
        }
        System.out.println("\n\n\n\nSelect your Choice: ");
        System.out.println("1. Create Binary Search Tree.");
        System.out.println("2. Create AVL Tree.");
        choice = scanner.nextInt();

        int[] arr2 = {5,3,4,7,3,2,2};
        switch (choice){

            case 1:
                BinarySearchTree bst = new BinarySearchTree();
                for (int num : arr2) {
                    bst.insert(num);
                }
                System.out.println("Binary Search Tree created successfully.");
                break;

            case 2:
                AVLTree avl = new AVLTree();
                for (int num : arr2) {
                    avl.insert(num);
                }
                System.out.println("AVL Tree created successfully.");
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
