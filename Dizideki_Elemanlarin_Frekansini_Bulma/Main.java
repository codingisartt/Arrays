import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int A[] = {10, 20, 20, 10, 10, 20, 5, 20};

        int count=0;

        Arrays.sort(A); // ********* CAUTION****** Sorting did algorithm differrent.

        System.out.println("Dizi: "+Arrays.toString(A)+"\nTekrar Sayıları");
        for(int i=0; i<A.length; i++){
            count=0;
            for (int j=0; j<A.length; j++){
                if(A[i]==A[j]){
                    count++;
                }
            }
            
            if(i==0 && A[i+1]==A[i]){
                System.out.printf("%d sayısı %d kere tekrar edildi.\n", A[i], count);
            }

            if(i==0 && A[i+1]!=A[i]){
                System.out.printf("%d sayısı %d kere tekrar edildi.\n", A[i], count);
            }

            if(i!=0 && A[i-1]!=A[i]) 
            {
                System.out.printf("%d sayısı %d kere tekrar edildi.\n", A[i], count);
            }

        }
    }
    
}