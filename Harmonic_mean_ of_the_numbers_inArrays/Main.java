import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz: ");
        int n=input.nextInt();
        int[] array=new int[n];
        double s=0.0;
        for(double i=1; i<=array.length;i++)
            s=s+1/i;
        System.out.printf("Sum is: "  + s);
    }

    

}