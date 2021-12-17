public class Main {
    public static void main(String[] args) {
        int[] list={1,2,3,4};
        int sum=0;
        for(int i: list){
            System.out.println(i);
            sum+=i;
        }
        System.out.println("Toplam: "+sum);
        System.out.println("#######");
        String[] cars={"BMW", "Mercedes", "Ford", "Ferrari"};
        for(String i: cars){
            System.out.println(i);
        }
        System.out.println("########");
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int[] row : matris) {
            for (int col : row) {
                System.out.print(col+" ");//print
            }
            System.out.println();//println
        }
    }
}