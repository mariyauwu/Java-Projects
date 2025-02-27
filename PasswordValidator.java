import java.util.Scanner;
public class PasswordValidator {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter password: ");
    String password=sc.nextLine();
    int length=password.length();
    boolean digits=false;
    boolean upperCase=false;
    int lowerCaseCount=0;
    for (int i=0; i<length; i++){
      char c=password.charAt(i);
      if ('0' <= c && c <= '9'){
        digits= true;
      } 
      else if ('A' <= c && c <= 'Z'){
        upperCase=true;
      } 
      else if ('a' <= c && c <= 'z'){
        lowerCaseCount++;
      }
    }
    if (length<8 || (digits== false) || (upperCase==false) || lowerCaseCount<2){
      System.out.println("False");
//      if (length<8){
//        System.out.println("Insufficient length.");
//      }
//      if (digits==false){
//        System.out.println("Digits missing.");
//      }
//      if (upperCase==false){
//        System.out.println("Upper-case missing.");
//      }
//      if (lowerCaseCount<2){
//        System.out.println("Insufficient lower-case.");
//      }
//    } 
    else{
      System.out.println("True");
    }
  }
}

