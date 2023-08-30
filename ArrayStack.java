package javaapplication1;

/**
 *
 * @author Walaa Alfahmi
 */
public class ArrayStack<E>{
    private E[] array;
    private int top = -1;
    
    public ArrayStack(int capacity){
        array = (E[]) new Object[capacity];
    }
    
    public int size(){
        return top + 1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    
    public E top(){
        if (isEmpty()){
            return null;
        }
        else {
            return array[top];
        }
    }
    
    public E pop(){
        if (isEmpty()){
            return null;
        }
        else {
            E e = array[top];
            array[top] = null;
            top--;
            return e;
        }
    }
    
    public void push(E e){
        if(top == array.length - 1){
            return;
        }
        else {
            top++;
            array[top] = e;
        }
    }
    
    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("");
        
    }
    
    public static void main(String[] args) {
        ArrayStack arStack = new ArrayStack(10);
        arStack.push("Walaa");
        arStack.push("Amal");
        arStack.push("Waad");
        arStack.print();
        arStack.push("Lama");
        arStack.print();
        System.out.println(arStack.size());
        System.out.println(arStack.pop());
        arStack.print();
        
    }
    
}
