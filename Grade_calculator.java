import java.util.Scanner;

public class Grade_calculator {
    public static void main(String[] args) {
         int total=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the subject no: ");
        int subno=sc.nextInt();
        int[] subarr=new int[subno];
        System.out.println("Enter subject marks: ");
        for(int i=0;i<subno;i++){
            System.out.println("Enter num of Subject "+(i+1)+" ");
             subarr[i]=sc.nextInt();
             total=total+subarr[i];
        }
        float avg=total/subno;
        System.out.println("Total Marks = "+total);
        System.out.println("Average Percentage is = "+avg);
        System.out.print("The student Grade is: ");
            if(avg>=80)
            {
                System.out.print("A");
            }
            else if(avg>=60 && avg<80)
            {
               System.out.print("B");
            } 
            else if(avg>=40 && avg<60)
            {
                System.out.print("C");
            }
            else
            {
                System.out.print("D");
            }
    
    }
    
}

    
    

