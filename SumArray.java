public class SumArray{
public static void main(String[]args){
// Write a function called sumArray that takes an integer array and manually calculates and returns the sum using a for loop.
//int[] scores = {10, 20, 30, 40, 50};
//Expected output: 150 
//
int sum = 0;
int[] scores = {10, 20, 30, 40, 50};

for(int index = 0; index< scores.length; index++){
    sum= sum + scores[index];
    
 
    
}
 System.out.print(sum);




}


}
