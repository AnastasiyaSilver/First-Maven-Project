package pl.asilver.controller;

import java.util.Scanner;

public class Controller {
    public String getFromConsole(String text){
        System.out.println(text);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public String getDayOfWeek(){
        try {
            DayOfWeek dayOfWeek = DayOfWeek.printDayInRussian(getFromConsole("Type day of week:"));
            return dayOfWeek.getName();
        } catch (IllegalArgumentException e){
            return "Invalid day of week";
        }
    }
}
