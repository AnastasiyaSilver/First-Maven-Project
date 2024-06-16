package pl.asilver;

import pl.asilver.controller.Controller;

public class App {
    public static void main(String[] args) {
        Controller controller = new Controller();
        System.out.println(controller.getDayOfWeek());
    }
}
