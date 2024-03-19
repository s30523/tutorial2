//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String day = LocalDate.now().getDayOfWeek().name().toLowerCase();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miejsce zamieszkania:");
        String place = scanner.next();
        System.out.println("Podaj swój wiek:");
        int age = scanner.nextInt();
        System.out.println("Podaj dzień tygodnia:");
        double discount = 0.0;
        double wynik = 40.0;
        double agediscount = 0.0;
        double placediscount = 0.0;
        double daydiscount = 0.0;
        if (age < 10) {
            wynik = 0.0;
            discount = 100.0;
        } else if (age >= 10 && age <= 18) {
            agediscount = 50.0;
        }

        if (place.equals("Warsaw")) {
            placediscount = 10.0;
        }

        if (day.equals("Thursday")) {
            daydiscount = 100.0;
            wynik = 0.0;
        }

        discount = agediscount + placediscount + daydiscount;
        wynik -= wynik * discount * 0.01;
        System.out.println("data: " + place + "," + age + "years old," + day + " price: " + wynik + "PLN");
        System.out.println("Discount " + discount + "%");
    }
}







































































































































































