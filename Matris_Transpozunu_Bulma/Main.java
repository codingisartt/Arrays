public class Main {
    public static void main(String[] args) {
        int[][] matris =  {{2,3,4},{5,6,4}};
        int[][] transpose = new int[matris[0].length][matris.length]; // int[3][2]

        for (int i = 0; i <matris.length ; i++) {
            for (int j = 0; j < matris[i].length; j++) {
               transpose[j][i] =matris[i][j];
            }
        }
        System.out.println("Matris : ");
        for (int[] ints : matris) {
            for (int item : ints) {
                System.out.print(item + "    ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transpoze : ");

        for (int[] ints : transpose) {
            for (int item : ints) {
                System.out.print(item + "    ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
