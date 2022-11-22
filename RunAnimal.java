import java.util.Scanner;

public class RunAnimal{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        Bird bird = new Bird();
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
        String choice = s.nextLine();

        if(choice.equalsIgnoreCase("B")){
            bird.eat();
            bird.sleep();
            bird.makeSound();
        }else if(choice.equalsIgnoreCase("C")){
            cat.eat();
            cat.sleep();
            cat.makeSound(); 
        }else if(choice.equalsIgnoreCase("D")){
            dog.eat();
            dog.sleep();
            dog.makeSound();
        }else{
            System.out.println("Invalid Input!");
        }
        s.close();
    }
}