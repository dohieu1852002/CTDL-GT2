package linkList;


public class myLinklist2 {
   public static class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public static void printLinkedList(Node head) {
        if(head == null){
            System.out.println("List is empty!");
        }else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.value);
                temp = temp.next;
                if(temp != null){
                    System.out.print("->");
                }else{
                    System.out.println();
                }
            }
        }
    }
    public static Node addtoHead(Node headNode, int value ){
        Node newNode = new Node(value);
        if( headNode != null){
            newNode.next=headNode;}
       return newNode;
    }
    public static Node addtoTail(Node headNode, int value){
       Node newNode = new Node(value);
       if(headNode==null){
           return newNode;
       }else{
           Node lastNode=headNode;
           while(lastNode.next !=null){
                 lastNode = lastNode.next;
           }
           lastNode.next=newNode;
       }
       return headNode;
    }
    public static Node addtoIndex(Node headNode, int value, int inDex){
       if(inDex==0){
          return addtoHead(headNode,value);
       }else{
           Node newNode = new Node(value);
           Node curNode = headNode;
           int count = 0;
           while(curNode !=null){
               count ++;
               if(count==inDex){
                   newNode.next=curNode.next;
                   curNode.next=newNode;
                   break;
               }
               curNode = curNode.next;
           }
       }
    return headNode;
    }
    public static Node removeatHead(Node headNode){
       if(headNode !=null){
           return headNode.next;
       }
       return headNode;
    }

    public static void main(String[] args) {
        Node n1= new Node(1);
        Node n2= new Node(2);
        Node n3= new Node(3);

        n1.next=n2;
        n2.next=n3;
       printLinkedList(n1);
       n1= addtoIndex(n1,4,3);
       printLinkedList(n1);


    }
}


