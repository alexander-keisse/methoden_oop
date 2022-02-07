package be.intecbrussel.opdracht1;

import java.util.*;

public class RandomApp {

    public static void main(String[] args) {

        long seed = 9;
        Random random1 = new Random(seed);
        Random random2 = new Random(seed);

        System.out.println("Object1 reference: " + random1);
        System.out.println("Object2 reference: " + random2);

        System.out.println(random1 + ": " + random1.nextInt(100) + ", " +
                random2 + ": " + random2.nextInt(100));

        long randomLong = random1.nextLong();
        double randomDouble = random1.nextDouble();
        boolean randomBoolean = random1.nextBoolean();

    }

}
