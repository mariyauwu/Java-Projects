import java.util.Scanner;
public class Tinder {
  public static void main(String[] args) { 
    int point=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Person 1 Details");
    System.out.print("Age: ");
    int age1=sc.nextInt();
    System.out.print("State ");
    String state1=sc.next();
    System.out.print("Music Genre: ");
    String music1=sc.next();
    System.out.print("Hobby: ");
    String hobby1=sc.next();
    System.out.print("Jobholder: ");
    String job1=sc.next();
    System.out.print("First Language: ");
    String lang1=sc.next();
    System.out.print("Food Habit: ");
    String food1=sc.next();
    
    System.out.println("Person 2 Details");
    System.out.print("Age: ");
    int age2=sc.nextInt();
    System.out.print("State ");
    String state2=sc.next();
    System.out.print("Music Genre: ");
    String music2=sc.next();
    System.out.print("Hobby: ");
    String hobby2=sc.next();
    System.out.print("Jobholder: ");
    String job2=sc.next();
    System.out.print("First Language: ");
    String lang2=sc.next();
    System.out.print("Food Habit: ");
    String food2=sc.next();
//    age
    if (age1<18 || age2<18){
      System.out.println("Do not go for minors!");
    }
    else{
      if (age2-age1<=5 || age1-age2<=5){
        point+=1;
      }
      else{
        System.out.println("Do not go for minors!");
      }
//    state
      if (state1.equals(state2)){
        point+=1;
      }
      else{
        System.out.println("Long distance relationships are always painful, aren’t they? So, try to avoid these");
      }
//    music taste
      if (music1.equals(music2)){
        point+=2;
      }
      else{
        System.out.println("Having a common ground is vital. Therefore, having the same music taste is helpful. ");
      }
//    hobby
      if (hobby1.equals(hobby2)){
        point+=1;
      }
      else{
        System.out.println("Having a common ground is vital. Therefore, having the same hobbies is helpful. ");
      }
//    job
      if (job1.equals("Yes") && job2.equals("Yes")){
        point+=2;
      }
      else if (job1.equals("Yes") && job2.equals("No")){
        point+=1;
      }
      else if (job2.equals("Yes") && job1.equals("No")){
        point+=1;
      }
      else{
        point=-1;
        System.out.println("You need money to go on a date. Do not use your parents’ money. Get a job instead!");
      }
//    language
      if (lang1.equals(lang2)){
        point+=1;
      }
      else{
        System.out.println("Communication is key. So, it is important to communicate in the same language.");
      }
//    food
      if (food1.equals(food2)){
        point+=2;
      }
      else{
        System.out.println("Do not take a vegetarian girl/guy to a steak date!");
      }
//      total point
      System.out.println("Points: "+point);
      if (point>=5){
        System.out.println("Swipe right");
      }
      else{
        System.out.println("Swipe left");
      }
    }
  }
}
