public class PrintWithIndex{
public static void main(String[]args){

int[] numbers = {10, 20, 30, 40, 50};
getPrintWithIndex(numbers);

}

public static void getPrintWithIndex(int[]numbers){

for(int index = 0; index<numbers.length; index++){

    System.out.println(numbers[index]+ " " + index);
}
}


}
