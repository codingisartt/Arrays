import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        int n=input.nextInt();
        int[] array=new int[n]; 
        
        System.out.println("Dizinin elemanlarını giriniz: ");

        for(int i=0;i<array.length;i++){
            System.out.print((i+1)+". Elemanı : ");
            array[i]=input.nextInt();
            
        }
        Arrays.sort(array);
        System.out.println("Sıralama : "+Arrays.toString(array));
    }
}