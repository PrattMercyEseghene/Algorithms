//isting 2.6 gives a program that converts a Fahrenheit degree to Celsius using the formula
//celsius = ( 5/9 ) (fahrenheit - 32).

import java.util.Scanner;
public class FahrenheitToCelsius{
public static void main(String[]args){

Scanner inputCollector = new Scanner(System.in);
double celsuis=0;
System.out.println("Enter a degree of fahrenheit : ");
double fahrenheit = inputCollector.nextDouble();

double celsius = (5.0/9)* (fahrenheit-32);

System.out.println(fahrenheit + "fahrenheit is " + celsius);
}


}
