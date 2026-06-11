import java.util.Scanner;
public class ArrayKa{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        
        int[] scores = {1,2,3,4,5};
        //int[][] attendanceSheet = new int[46][3] // 2 rows and 4 columns
        String[][] attendanceSheet = {
            {"Mercy", "Female", "c-30"}, // student at index 0 takes this space
            {"Collete", "Female", "c-30"}, // student at index 1 takes this space
            {"CEO", "male", "c-30"}, // student at index 2 takes this space
            {"Kayode", "male", "c-30"}  // student at index 3 takes this space
        };
        
        
        System.out.println(attendanceSheet[0][0]);
        
        /*for(int score = 0; score < scores.length; score++){
            System.out.println("enter a number!");
            scores[score] = inputCollector.nextInt();
            //System.out.print(scores[score]);
        }
        
        for(int score:scores){
            System.out.print(score + " ");
        }
        */
    }
}
