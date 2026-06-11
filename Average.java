public class Average{
public static void main(String[]args){

int sum = 0;
double average = 0;
int[] scores = {10, 20, 30, 40, 50};

for(int index = 0; index< scores.length; index++){
    sum= sum + scores[index];
    
   
}

average = sum / scores.length;

 System.out.print(average);





}


}
