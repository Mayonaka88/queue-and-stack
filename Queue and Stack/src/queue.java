public class queue {
    int pointer;
    int[] mainQueue;
    int queueSize;

    public queue(int size){
        mainQueue = new int[size];
        pointer = 0;
        queueSize = size;
    }

    public void enqueue(int newElement){
        if(queueSize > pointer){
            for (int i = mainQueue.length-1; i > 0; i--) {     
                mainQueue[i] = mainQueue[i-1];
             }   
            mainQueue[0] = newElement;
            pointer = pointer+1;
        }
    }

    public void dequeue(){
        if(pointer > 0){
            pointer = pointer-1;
            mainQueue[pointer] = 0;
            for (int i = mainQueue.length-1; i > 0; i--) {     
                mainQueue[i-1] = mainQueue[i];
             } 
        }
    }

    public void printQueue(){
        for (int i = 0; i < mainQueue.length; i++) {     
            System.out.print(mainQueue[i] + " ");    
         }     
    }
}
