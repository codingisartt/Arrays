public class Main{
    public static void main(String[] args) {//matris[row][column]
        int[][] matris= new int[3][4];//indexing starts from 0
        System.out.println(matris.length);// row length
        System.out.println(matris[0].length);//column lengh
    
        System.out.println("#######");
        int number=1;
        for(int i=0;i<matris.length;i++){
            for(int j=0;j<matris[i].length;j++){
                matris[i][j]=number++;
                System.out.print(matris[i][j]+" "); 
            }
            System.out.println();
        }
        //matris[1][2]; // it finds element in row 2 and column 3
        System.out.println("---------");
        int[][] uzaklik ={
            {0, 453, 939, 243, 783, 891},
            {453, 0, 490, 384, 620, 439},
            {939, 490, 0, 839, 863, 423},
            {243, 384, 839, 0, 544, 823},
            {783, 620, 863, 544, 0, 1045},
            {891, 439, 423, 823, 1045, 0}
    };        
        
        for(int i=0;i<uzaklik.length;i++){
            for(int j=0;j<uzaklik[i].length;j++){
                System.out.print(uzaklik[i][j]+ " "); 
            }
            System.out.println();
        }

        
    }
}