package ds.circularlinkedlist;

public class CircularLinkedList {

    private Node first;
    private Node last;

    public CircularLinkedList(){
        first = null;
        last  = null;
    }

    private boolean isEMpty() {
        return first==null;
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEMpty()){
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

      public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEMpty()){
            first = new Node();
        }else{
            last.next = newNode; // the next value of the last node will point to the new node
            last = newNode;// we make the new node we created be the last one in the list
        }
      }

  public int deleteFirst(){
        int temp = first.data;

        if(first.next == null){
            last = null;
        }
        first = first.next;// first will point to old next value
        return  temp;
    }
    public void displayList(){
        System.out.println("List (first --> last)");
        Node current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }


}
