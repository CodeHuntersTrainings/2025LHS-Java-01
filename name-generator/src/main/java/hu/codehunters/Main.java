package hu.codehunters;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        int defaultCount = 5;

        // Parse system property
        Integer paramCount = parsePositiveInt(System.getProperty("parameters.count"));

        // Parse first command-line argument
        Integer argCount = (args.length > 0) ? parsePositiveInt(args[0]) : null;

        // Decide which count to use:
        // Both present -> smallest positive
        // Only one present -> that one
        // None -> default
        int count = defaultCount;
        if (paramCount != null && argCount != null) {
            count = Math.min(paramCount, argCount);
        } else if (paramCount != null) {
            count = paramCount;
        } else if (argCount != null) {
            count = argCount;
        }

        Faker faker = new Faker();

        for (int i = 0; i < count; i++) {
            System.out.println(faker.name().fullName());
        }
    }

    private static Integer parsePositiveInt(String str) {
        if (str == null) return null;
        try {
            int val = Integer.parseInt(str);
            if (val > 0) {
                return val;
            }
        } catch (NumberFormatException ignored) {}
        return null;
    }
}