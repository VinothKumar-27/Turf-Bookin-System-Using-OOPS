package TurfBookings;

import java.util.ArrayList;
import java.util.Scanner;

public class Turf {
    static Scanner scanner = new Scanner(System.in);
    private String name;
    private int startTme;
    private int endTime;
    private int price =0;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartTme() {
        return startTme;
    }

    public void setStartTme(int startTme) {
        this.startTme = startTme;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Turf(){
        System.out.print("Enter the name : ");
        name=scanner.next();
        this.name =name;
        System.out.print("Enter the starting Time : ");
        startTme=scanner.nextInt();
        this.startTme =startTme;
        System.out.print("Enter the end time : ");
        endTime=scanner.nextInt();
        if(startTme<endTime)
            this.endTime=endTime;
        else {
            System.out.print("Invalid Time Enter Properly : ");
            endTime=scanner.nextInt();
            this.endTime=endTime;
        }

        for (int i = startTme; i <endTime ; i++) {
            price+=1000;
        }
        this.price=price;
    }


    public void display() {
        System.out.println("Name='" + name + '\'' +", startTme=" + startTme +", endTime=" + endTime +", price=" + price);
    }


}
