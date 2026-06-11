public class SwapFirstandLast{
public static void main(String[]args){
//Write a function called swapFirstLast that takes an integer array, swaps the first and last elements, and returns the updated array.
//int[] numbers = {1, 2, 3, 4, 5};
// Expected output: {5, 2, 3, 4, 1} 
//Looping and Calculations


int[]numbers = {1,2,3,4,5};

numbers[0] = 5;
numbers[4] = 1;

for(int index = 0; index< numbers.length; index ++){

    System.out.print(numbers[index]+ " ");
}


}



}
