import java.util.Scanner;

public class Consoleapp{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
 
    System.out.print("Name: ");
    String name = input.nextLine();

    System.out.print("Age: ");
    int age = input.nextInt();

    System.out.print("Mood: ");
    String mood = input.next();


    System.out.print("Guess: ");
    int guess = input.nextInt();

    System.out.print("Want suggestion: ");
    String suggestion = input.next();


     System.out.println("Hello " +  name + " Welcome to your  personal assistant.");

    if(age < 13) {
      System.out.println("You're a young explorer!");
    }
    else if(age < 19){
      System.out.println("Teen life is fun enjoy it!");
    } 
     else if(age > 19 - 59){
      System.out.println("Adulting can be challenging, stay strong!");
    } 
     else {
      System.out.println("Wisdom looks good on you!");
    }

  if(mood.equalsIgnoreCase("happy")){
    System.out.println("keep smiling!");
  }

    else if(mood.equalsIgnoreCase("sad")){
   System.out.println("Don't wory everything is gonna be alright");
  }

   else if(mood.equalsIgnoreCase("excited")) {
  System.out.println("Awesome! Enjoy your energy");
  }

  else{
 System.out.println("Rest well and recharge!");
  }


  if(guess == 1){
   System.out.println("Wow! You guess it!");
  }

  else{
   System.out.println("Try again next time!");
  }

  if(suggestion.equalsIgnoreCase("yes")){
  System.out.println("Share your excitement by helping someone!");
  }

  else{
  System.out.println("");
  }

  }

}