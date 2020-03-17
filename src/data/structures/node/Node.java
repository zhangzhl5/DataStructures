package data.structures.node;


public class Node<E> {

	 public E  e;
     public Node next;

     public Node(E e, Node next){
         this.e = e;
         this.next = next;
     }

     public Node(E e){
         this(e, null);
     }

     public Node(){
         this(null, null);
     }
     
     @Override
     public String toString(){
         return e.toString();
     }

}
