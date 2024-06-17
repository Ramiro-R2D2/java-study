import java.util.Random;

import Exemple.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        var random = new Random();
        int winner = random.nextInt(101);
        Queue q = new Queue(winner);
        System.out.println("This client " + winner + " is a winner.");
        for(int i = 1; i < 10;i++){
            winner = random.nextInt(101);
            q.enqueue(winner);
            System.out.println("This client " + winner + " is a winner.");
        }
        var node = q.dequeue();
        while (node != null) {
            System.out.println("The gift has collected for the client " + node.getNode());
            node = q.dequeue();
        }
    }
}
