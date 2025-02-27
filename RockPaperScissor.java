import java.util.Scanner;
public class RockPaperScissor{
  public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);
    for (int i=1; i>=1; i++){
      System.out.print("Player 1: ");
      String p1=sc.next();
      System.out.print("Player 2: ");
      String p2=sc.next();
      System.out.print("Player 3: ");
      String p3=sc.next();
      if (p2.equals("Scissor") && p3.equals("Scissor")){
        if (p1.equals("Rock")){
          System.out.println("Player 1 wins");
          break;
        }
        else{
          continue;
        }
      }
      else if ((p1.equals("Scissor")) && (p3.equals("Scissor"))){
        if (p2.equals("Rock")){
          System.out.println("Player 2 wins");
          break;
        }
        else{
          continue;
        }
      }
      else if ((p1.equals("Scissor") && p2.equals("Scissor"))){
        if (p3.equals("Rock")){
          System.out.println("Player 3 wins");
          break;
        }
        else{
          continue;
        }
      }
      else if ((p2.equals("Paper") && p3.equals("Paper"))){
        if (p1.equals("Scissor")){
          System.out.println("Player 1 wins");
          break;
        }
        else{
          continue;
        }
      }
      else if ((p1.equals("Paper") && p3.equals("Paper"))){
        if (p2.equals("Scissor")){
          System.out.println("Player 2 wins");
          break;
        }
        else{
          continue;
        }
      }
      else if ((p1.equals("Paper") && p2.equals("Paper"))){
        if (p3.equals("Scissor")){
          System.out.println("Player 3 wins");
          break;
        }
        else{
          continue;
        }
      }
      else if ((p2.equals("Rock") && p3.equals("Rock"))){
        if (p1.equals("Paper")){
          System.out.println("Player 1 wins");
          break;
        }
        else{
          continue;
        }
      }
      else if ((p1.equals("Rock") && p3.equals("Rock"))){
        if (p2.equals("Paper")){
          System.out.println("Player 2 wins");
          break;
        }
        else{
          continue;
        }
      }
      else if ((p1.equals("Rock") && p2.equals("Rock"))){
        if (p3.equals("Paper")){
          System.out.println("Player 3 wins");
          break;
        }
        else{
          continue;
        }
      }
      else{
        continue;
      }
    }
  }
}

