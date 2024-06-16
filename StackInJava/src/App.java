import Stack.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[20];
        for(int i = 0; i < 20; i++){
            numbers[i] = i+1;
            }
        Stack stack = new Stack(numbers[0]);
        for(int i = 1; i < numbers.length; i++){
            stack.push(numbers[i]);
        }
        stack.println();
    }
}
