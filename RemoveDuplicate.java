import java.util.Scanner;
class Node{
    int data;
    Node next;
}
public class RemoveDuplicate {
    Node head;
    public RemoveDuplicate(){
        this.head=null;
    }
    public void createLinkedList(int data){
         Node current;
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
         Node current;
        if(head==null){
            System.out.println("Linked list is empty");
        }
        else{
            System.out.print("Elements are ");
            current=head;
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
        }

    }
    public void Remove(){
         Node current=head,index=null,temp=null;
         if(head==null){
            System.out.println("Empty linked list");
         }
         else{
            while(current!=null){
                temp=current;
                index=current.next;
                while(index!=null){
                    if(current.data==index.data){
                        temp.next=index.next;
                    }
                    else{
                        temp=index;
                    }
                    index=index.next;
                }
                current=current.next;
            }
         }

    }

    public static void main(String[] args){
        int choice;
        RemoveDuplicate l=new RemoveDuplicate();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Do you want to insert a node 1.yes 2.no");
            choice=sc.nextInt();
            if(choice==1){
                System.out.print("Enter data ");
                l.createLinkedList(sc.nextInt());
            }
            else{
                break;
            }
        }
        l.display();
        l.Remove();
        System.out.println();
        System.out.println("After removing duplicates elements are");
        l.display();
       
        
        
    }
    
}
