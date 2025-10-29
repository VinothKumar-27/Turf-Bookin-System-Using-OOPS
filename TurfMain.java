package TurfBookings;

import java.util.ArrayList;
import java.util.Scanner;

public class TurfMain {
    static Scanner sc = new Scanner(System.in);

    public static boolean isTimeAvailable(ArrayList<Turf> bookings , int start ,int end){
        for(Turf t:bookings){
            if(start<t.getEndTime() && end > t.getStartTme());
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Turf> tbook = new ArrayList<>();
        int user = 1;
        while(user==1) {

            System.out.println("Enter 1 to book 0 to exit : ");
            user= sc.nextInt();
            if(user==1){
                Turf turf=new Turf();
                if(!isTimeAvailable(tbook,turf.getStartTme(),turf.getEndTime())){
                    System.out.println("TIme slot overlaps");
                }else {
                    tbook.add(turf);
                }
            }
            else
                System.out.println("Thank You");
        }
        for(Turf t:tbook){
            t.display();
        }
    }
}
