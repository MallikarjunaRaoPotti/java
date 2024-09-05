import java.util.Scanner;
public class Avg {
 public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int sum=0;
    System.out.println("enter how many nubers we need");
    int j = in.nextInt();
    for(int i=0;i<j;i++){
        System.out.println("enter the numbers");
        int num=in.nextInt();
        sum=sum+num;
    }
    float avg=sum/j;
    System.out.println("avg of n numbers "+avg);
 }
}