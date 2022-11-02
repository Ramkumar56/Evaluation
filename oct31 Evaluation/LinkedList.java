import org.w3c.dom.Node;

public class LinkedList {
    Node head;
    Node pos;
    class Node{
      int data;
      Node next;
      Node(int number){
          data=number;
          next=null;
      }
    }

    public void push(int number){
        Node node=new Node(number);
        if(pos!=null){
            pos.next=node;
        }
        if(head==null){
            head=node;
        }
        pos=node;
    }
    private void rightMax(){
        Node node1=head;
        Node node2;
        int count;
        while (node1!=null){
            count=0;
            node2=node1.next;
            while (node2!=null){
                if(node1.data<node2.data){
                  count++;
                  System.out.println(node2.data);
                  break;
                }
               node2=node2.next;
            }
            if(count==0){
                System.out.println(count);
            }
            node1=node1.next;
        }
    }


    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.push(2);
        linkedList.push(7);
        linkedList.push(4);
        linkedList.push(3);
        linkedList.push(5);
        linkedList.rightMax();
    }
}