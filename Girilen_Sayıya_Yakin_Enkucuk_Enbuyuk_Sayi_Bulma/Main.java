import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15,12,788,1,-1,-778,2,0};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int index = 0;
        int[] newArr = new int[n+1];
        int j = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Girilen Sayı: ");
        int number = input.nextInt();

        for(int i = 0; i<newArr.length; i++) {
            if(i==index) {
                newArr[i] = number;
            }else {
                newArr[i] = arr[j];
                j++;
            }
        }
        Arrays.sort(newArr);
        
        for (int a = 0 ; a < newArr.length ; a++){
            if (newArr[a] == number) {
                System.out.println("Sayınızdan küçük en büçük değer :" + newArr[a-1]);
                System.out.println("Sayınızdan büyük en küçük değer : " + newArr[a+1]);
            }

        }

    }

}