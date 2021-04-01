public class Driver {
    public static void main(String[] args) {
        Date[] dates = new Date[10];
        for(int i = 0; i < 10; i++){
            dates[i] = new Date();
        }
        for(Date d : dates){
            System.out.println(d);
        }


    }


}
