import java.util.Scanner;
  public class Consonant{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);


    System.out.print("Enter a letter: ");
    String letter = input.nextLine();

 
    if(letter.length() != 5 ){
    System.out.println(letter + " is an invalid letter! ");
}
    else{
    

     if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")){
     System.out.println(letter + " is a vowel");
}

     else{
     System.out.println(letter + " is a consonant");
}
 }
 }
}