public class Main{
    static int[] reverse(int[] list){
   int[] result = new int[list.length];//new array created.

   for (int i = 0, j = list.length - 1; i < list.length; i++, j--) 
   {
      result[i] = list[j];
   }
   
   return result;
}
    static void printArray(int[] list){
        for(int i=0; i<list.length;i++){
            System.out.println(list[i]);
        }
    }
    public static void main(String[] args) {
        int[] list={10,20,30,40,50,60,70,80,90,100};
        int[] newList=reverse(list);
        printArray(newList);
    }
}