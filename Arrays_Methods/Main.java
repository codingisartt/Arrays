import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] list={3, 5, 79, 12, 25, -3, 66, 82, -49, 152};
        System.out.println(Arrays.toString(list));
        
        Arrays.fill(list, 5);
        System.out.println(Arrays.toString(list));

        int[] list2 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(list2, 3, 5, 7);//3 <= a <5 fills number 7
        System.out.println(Arrays.toString(list2));

        Arrays.sort(list2);
        System.out.println(Arrays.toString(list2));

        int index=Arrays.binarySearch(list2, 11);
        System.out.println("11'in indexi: "+index);

        int[] copyArray=Arrays.copyOf(list,4);
        System.out.println(Arrays.toString(copyArray));

        int[] copyOfRangeArray=Arrays.copyOfRange(list2,2,5);
        System.out.println(Arrays.toString(copyOfRangeArray));

        int[] list01 = {1, 2, 3};
        int[] list02 = {1, 2, 3};
        int[] list03 = {1, 2, 10};

        System.out.println(Arrays.equals(list01, list02)); // true
        System.out.println(Arrays.equals(list02, list03)); // false
        

    }
}