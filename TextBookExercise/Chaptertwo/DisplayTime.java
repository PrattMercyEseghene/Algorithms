import java.util.*;
//Write a Java program that prompts the user to enter a total number of seconds as an integer. The program should convert this value and display the equivalent time in minutes and remaining secon
public class DisplayTime{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter an integer for seconds: ");
int Seconds = inputCollector.nextInt();


int minutes = Seconds/60;
int remainingSeconds = Seconds % 60;
System.out.println(Seconds+ "seconds is " + minutes + "minutes and" + remainingSeconds + " " +  "seconds");

}


}
