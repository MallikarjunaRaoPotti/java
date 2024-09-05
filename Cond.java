/*import java.util.Scanner;
class COnd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
  
        int radi=sc.nextInt();
        Double area=3.14*radi*radi;
        System.out.println("area of the circle"+area);
            
        }

    }*/
/*import java.util.Scanner;
class Cond{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);

            }
            
        }
    }
}
*/
/*import java.util.Scanner;
class Cond{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        while(true){
            System.out.println("enter the number");
            int number=in.nextInt();
            if (number>0){
                System.out.println(number);
            }else if(number==0){
                break;
            }
        }
    }
}*/
/*import java.util.Scanner;
class Cond{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int largest=Integer.MIN_VALUE;
        while(true){
            System.out.println("enter the number");
            int number=in.nextInt();
            if(number==0){
                break;
            
            }else if(number>largest){
                largest=number;

            }

        }
        System.out.println("largest value"+largest);
    }
}*/
/*import java.util.Scanner;
class Cond{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       System.out.println("enter the number");
       int n=in.nextInt();
       int fact=n;
       for(int i=1;i<=n;i++){
        if n>0{
            fact=fact*n-1;
            System.out.println(fact)
        
        }
       }
    }
}*/
//calculate the averege of n numbers
import java.util.Scanner;
public class Cond {
 public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int sum=0;
    System.out.println("enter how many nubers we need");
    int j = in.nextInt();
    System.out.println("enter the numbers:");
    for(int i=0;i<j;i++){
       
        int num=in.nextInt();
        sum=sum+num;
    }
    float avg=sum/j;
    System.out.println("avg of n numbers "+avg);
 }
}

