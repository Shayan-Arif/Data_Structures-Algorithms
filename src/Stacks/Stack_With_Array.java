package Stacks;

 interface Stack{
     Object peek();
     Object pop();
       void push (Object object);
      int size();
}


class ArrayStack implements Stack{

     private Object[] a ;
     private int size;

     public ArrayStack(int capacity){
         a = new Object[capacity];
     }

     public boolean isEmpty(){
         return (size == 0);
     }

    @Override
    public Object peek() {

         if(size == 0 ){
             System.out.println("The stack is empty");
         }
         return a[size-1];
    }

    @Override
    public Object pop() {
        if(size == 0 ){
            System.out.println("The stack is empty");
        }

        Object object = a [--size];
        a[size] = null;
         return object;
    }

    @Override
    public void push(Object object) {

         if(size == a.length) resize();
         a[size++] = object;
    }

    @Override
    public int size() {
        return size;
    }

    public void resize(){
         Object []aa = a;
         a = new Object[2* aa.length];
         System.arraycopy(aa,0,a,0,size);
    }

 }


public class Stack_With_Array {

    public static void main(String[] args) {

        Stack crates = new ArrayStack(4);
        crates.push("Carrots");
        crates.push("oranges");
        crates.push("rasins");
        crates.push("pickle");
        crates.push("banana");
        System.out.println("Crates.size() == " + crates.size() + "\t Crates.peek() == " + crates.peek());




    }
}
