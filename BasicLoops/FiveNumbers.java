import java.util.Scanner;
public class FiveNumbers{
public static void main(String[]args){
Scanner inputCollector=new Scanner(System.in);
int number=0;
int count=1;
int sum = 0;
while(number<=5){

System.out.println("Enter number");
number=inputCollector.nextInt();
sum= sum + number;
count++;

}
 System.out.println(sum);
}   
} 
