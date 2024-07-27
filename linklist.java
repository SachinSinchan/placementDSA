import java.util.*;
public class kk{
    node head;
    class node{
        String data;
        node next;
        node(String data){
            this.data=data;
            this.next=null;
        }
    }
    //add fisrt
    public void addFirst(String data){
        node newNode=new node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //add last 
    public void addLast(String data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }

        node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next= newnode;
    }
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"--> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        kk list=new kk();
        list.addFirst("a");
        list.addFirst("the");
        list.printList();
    }
}

// import java.util.*;
// public class kk{
//     public static void main(String args[]){
//         LinkedList<String>list=new LinkedList<String>();
//         list.addFirst("list");
//         list.addFirst("a");
//         list.addFirst("is");
//         list.addFirst("this");
//         System.out.println(list);
//         list.addLast("aman");
//         System.out.println(list);
//         System.out.println(list.size());
//             list.removeFirst();
//             System.out.println(list);
//             list.removeLast();
//             System.out.println(list);
//             list.remove(2);
//             System.out.println(list);
//         }
//     }
