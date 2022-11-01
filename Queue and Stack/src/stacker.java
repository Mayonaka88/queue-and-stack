public class stacker {

    int pointer;
    int[] stack;
    int stackSize;

    public stacker(int size){
        stack = new int[size];
        stackSize = size;
        pointer = 0;
    }

    public void push(int newElement){
        if(stackSize > pointer){
            stack[pointer] = newElement;
            pointer = pointer+1;
        }
    }

    public void pop(){
        if(pointer > 0){
            pointer = pointer-1;
            stack[pointer] = 0;
        }
    }

    public void printStack(){
        for (int i = 0; i < stack.length; i++) {     
            System.out.print(stack[i] + " ");    
         }     
    }
}
