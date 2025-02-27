import java.util.Scanner;
public class Ludo{
  public static void main(String[] args){
    int p1Pos=0;
    int p2Pos=0; 
    int p1Six=0; 
    int p2Six=0; 
    Scanner sc=new Scanner(System.in);
    int currentPlayer=0;
    boolean gameProgress=true;  
    while (gameProgress==true){
      System.out.print("Player "+(currentPlayer+1)+": ");
      int roll = sc.nextInt();
      if (roll == 6){
        if (currentPlayer==0){
          p1Six++;
          if (p1Six==3){
            p1Six=0;
            currentPlayer=1; 
            continue;
          }
        } 
        else{
          p2Six++;
          if (p2Six==3) {
            p2Six=0;
            currentPlayer=0; 
            continue;
          }
        }
      } 
      else{
        if (currentPlayer==0){
          p1Six=0;
        } 
        else{
          p2Six=0;
        }
      }
      int newPos;
      if (currentPlayer==0){
        newPos=p1Pos+ roll;
      } 
      else{
        newPos=p2Pos+ roll;
      }
      if (newPos>= 25){
        newPos= 25;
      }
      int otherPos;
      if (currentPlayer==0){
        otherPos= p2Pos;
      } 
      else {
        otherPos=p1Pos;
      }    
      if (otherPos==newPos){
        if (currentPlayer==0){
          p2Pos=0;
        } 
        else{
          p1Pos=0;
        }
      } 
      if (currentPlayer==0){
        p1Pos=newPos;
      } 
      else{
        p2Pos=newPos;
      }
      if (currentPlayer==0 && p1Pos==25){
        System.out.println("Player 1 wins!");
        gameProgress=false;
      } 
      else if (currentPlayer==1 && p2Pos==25){
        System.out.println("Player 2 wins!");
        gameProgress = false;
      }
      if (roll!= 6){
        currentPlayer=(currentPlayer+1)%2; 
      }
    }
  }
}