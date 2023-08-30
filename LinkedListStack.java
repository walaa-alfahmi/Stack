package javaapplication1;
import java.util.LinkedList;

/**
 *
 * @author Walaa Alfahmi
 */
public class LinkedListStack<E> {
    LinkedList<E> list = new LinkedList();
    
    void push(E e){
        list.addFirst(e);
    }
    
    int size(){
        return list.size();
    }
    
    E pop(){
        return list.removeFirst();
    }
    
    boolean isEmpty(){
        return list.isEmpty();
    }
    
    E top(){
        return list.getFirst();
    }
    
    void print(){
        for(E e: list)
            System.out.print(e.toString() + "\t");
        System.out.println("");
    }
    
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push("Walaa");
        stack.push("Amal");
        stack.push("Waad");
        stack.print();
        stack.push("Lama");
        stack.print();
        System.out.println(stack.size());
        System.out.println(stack.pop());
        stack.print();
        
    }
    
}
