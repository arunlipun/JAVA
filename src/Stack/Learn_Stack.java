package Stack;

import java.util.Stack;

public class Learn_Stack {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();
        animal.push("Lion");
        animal.push("Cat");
        animal.push("Rabbit");
        System.out.println(animal);
        System.out.println(animal.peek());
        animal.pop();
        System.out.println(animal.peek());

    }
}
