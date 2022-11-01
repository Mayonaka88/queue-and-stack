public class App {
    public static void main(String[] args) throws Exception {
        stacker stack = new stacker(20);
        stack.push(1);
        stack.push(3);
        stack.pop();
        queue queuer = new queue(5);
        queuer.enqueue(5);
        queuer.enqueue(6);
        queuer.enqueue(3);
        queuer.enqueue(7);
        queuer.dequeue();
        queuer.printQueue();
    }
}
