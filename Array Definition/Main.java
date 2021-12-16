public class Main{
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static void printArray(double[] arr){///overriding is possible.
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        //int[] list=new int[10]; //definition types.
        //int list2[]=new int[20];
        int[] list={10,20,30,40,50,60,70,80,90,100};
        double[] list2={1.1, 2.2, 3.3};
        /*for(int i=0;i<list.length;i++){
            list[i]=(i*10)+10;
            System.err.println(list[i]);
        }*/
        printArray(list2);
    }
}