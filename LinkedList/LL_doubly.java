package LinkedList;

public class LL_doubly {
    public class Node {
        int data;
        Node next;
        Node prev;

        Node() {
        }

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head = null;

    //creating a node
    public void createNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("List is empty");
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    //display program
    public void display(Node Head) {
        Node curr;
        curr = head;
        if (head == null) {
            System.out.println("The list is empty");
        } else {
            while (curr != null) {
                System.out.print(curr.data + "->");
                curr = curr.next;
            }
            System.out.print("END");
        }
    }
}

