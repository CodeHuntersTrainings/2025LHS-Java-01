package hu.codehunters;

import com.github.javafaker.Faker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Exit....not enough parameters.");
            return;
        }

        String location = System.getProperty("x.location");
        //String location = "Pecs";
        if (location == null) {
            System.out.println("Location is missing.");
            return;
        }

        String company = System.getenv("COMPANY");
        if (company == null) {
            System.out.println("Company is missing.");
            return;
        }

        String date;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter your date:");
            date = scanner.nextLine().trim();
        }

        Faker faker = new Faker();

        System.out.println();
        System.out.println();

        System.out.println(faker.name().firstName() + " " + args[0]
                + " and " + company + " are going to " + location + " on " + date);

        System.out.println("Number of dogs: " + Integer.parseInt(args[1].trim()));
    }
}