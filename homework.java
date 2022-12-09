import java.util.Scanner;

public class Homework{
    public static void main(String[] args) {
        
        int k;
        int sum = 0;
        int total = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Give a number: ");
        k = input.nextInt();
        
        for(int i=0; i<=k; i++){
            if((i % 3 == 0 || i % 4 == 0) && i != 0){
                sum += i;
                total++;
            }
        }
        double avg = (double)sum/(double)total;
        System.out.println("The average of number which can divisible by 3 or 4 equals " +avg);
    }
}
