class Node{
    int data;
    Node next;
}
public class MergeAndSortLinkedList {
    Node head;
    Node current;
    int size;
    public MergeAndSortLinkedList(){
        this.head=null;

    } 
    public void createLinkedList(int data){
        Node newNode=new Node();
        newNode.next=null;
        newNode.data=data;
        if(head==null){
            head=newNode;
        }
        else{
            current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;

        }
    }
    public void display(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        else{
            current=head;
            System.out.print("Linked list elements are ");
            while(current!=null){ 
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
        System.out.println();

    }
    public static Node mergeLinkedList(Node head1,Node head2){
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        Node current = head1;
        while(current.next!=null){
            current=current.next;
        }
        current.next=head2;
        return head1;
    }
    public static Node sortLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;
        while (current != null) {
            Node minNode = current;
            Node temp = current.next;

            while (temp != null) {
                if (temp.data < minNode.data) {
                    minNode = temp;
                }
                temp = temp.next;
            }

            int tempData = current.data;
            current.data = minNode.data;
            minNode.data = tempData;

            current = current.next;
        }

        return head;
    }
    
    public static void main(String[] args){
        MergeAndSortLinkedList l1=new MergeAndSortLinkedList();
        l1.createLinkedList(25);
        l1.createLinkedList(35);
        l1.createLinkedList(12);
        l1.createLinkedList(4);
        l1.createLinkedList(36);
        l1.createLinkedList(48);
        l1.display();
        MergeAndSortLinkedList l2=new MergeAndSortLinkedList();
        l2.createLinkedList(8);
        l2.createLinkedList(32);
        l2.createLinkedList(22);
        l2.createLinkedList(45);
        l2.createLinkedList(63);
        l2.createLinkedList(49);
        l2.display();
        Node merged=mergeLinkedList(l1.head,l2.head);
        Node sortedMergeList=sortLinkedList(merged);
        System.out.println("After merge and sorting elements are ");
        while(sortedMergeList != null){
            System.out.print(sortedMergeList.data+"->");
            sortedMergeList=sortedMergeList.next;
        }
        System.out.print("null");

        
   }

    
}
