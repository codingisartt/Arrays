public class Main{
    public static void main(String[] args) {
        double[] list1; //double[] list=new double[5]; 2nd way
        list1=new double[5];
        list1[0]=4.1; //list1={10,20,30,40,50}; XXX There is no such usage.
        System.out.println(list1[0]);
        System.out.println("#######");
        String[] days={"Pazartesi","Salı","Çarşamba"};
        String[] weekendDays=new String[]{"Cumartesi","Paxar"};
        weekendDays[0]="Pazar";
        System.out.println(weekendDays[0]);
        System.out.println(days.length);
        System.out.println("#######");
        for(int i=0; i<=(days.length-1); i++){
            System.out.println(days[i]);
        }


    }
}