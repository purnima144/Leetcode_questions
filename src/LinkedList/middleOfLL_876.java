package LinkedList;
//---------https://leetcode.com/problems/middle-of-the-linked-list/submissions/-----------
public class middleOfLL_876 {

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

    public Node middleNode(Node head){
        Node curr;
        curr = head;
        int size = 0;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        curr = head;
        for(int i = 0; i < size/2 ; i++){
            curr = curr.next;
        }
       return curr;

    }


    public static void main(String[] args){
        middleOfLL_876 list = new middleOfLL_876();
        list.addNode(5);
        list.addNode(15);
        list.addNode(35);
        list.addNode(25);
        list.addNode(45);
        list.addNode(65);

       list.display();

        list.middleNode(head);

    }
}
