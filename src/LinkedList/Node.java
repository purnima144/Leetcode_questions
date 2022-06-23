package LinkedList;

    public class Node {
        int data;
        Node next;
        Node(){} //non parameterized constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
        public static Node head = null, tail = null;
        public static void addNode(int data){
            Node newNode = new Node(data); //a node is created
            //if list is empty, head and tail will point to same node
            if(head == null){
                head = newNode;
            }
            else{
                tail.next = newNode;//tail will be newly added node
            }
            tail = newNode;
        }
        //--------------to display-----------
        public static void display(){
            Node temp;
            temp = head;
            if(head == null){
                System.out.println("List is empty");
                return;
            }
            else{
                while(temp != null){
                    System.out.print(temp.data + "->");
                    temp = temp.next;
                }
                System.out.print("END");
            }
        }
    }




