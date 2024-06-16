import Exemples.*;

public class App {
    public static void main(String[] args) throws Exception {
        linkedList list = new linkedList("First object");
        list.apprend("Second Object");
        list.apprend("Trhird Object");        
        System.out.println(" ");
        list.print();
        System.out.println(" ");
        list.insert(2, "Impostor 1");
        System.out.println(" ");
        list.print();
        System.out.println(" ");
        list.set(2, "Impostor 2");
        list.print();
        list.remove(2);
        list.print();
    }
}
