package be.intecbrussel.strings;

import java.util.Locale;

public class App {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println("s1 and s2 are referencing the same object: " + (s1 == s2));
        System.out.println("s1 and s3 are referencing the same object: " + (s1 == s3));

        System.out.println("s1 and s3 have the same internal value: " + s1.equals(s2));

        char l = s1.charAt(1);
        System.out.println("Char at index 0: " + l);

        String concatenatedString = s1.concat(s2);
        System.out.println("String1 + String2: " + concatenatedString);

        char c = 'l';
        int pos = s1.indexOf(c);
        System.out.println("First occurrence of char 'l': " + pos);

        int offset = pos + 1;
        System.out.println("Second occurrence of the char 'l': " + s1.indexOf(c, offset));

        String userName = "RastaLion";

        String lowerCaseUserName = userName.toLowerCase();
        System.out.println("Lowercase username: " + lowerCaseUserName);

        String fullAddress = "Rouppeplein 16, Brussel 1000 Belgium";
        String streetSubstring = fullAddress.substring(0, fullAddress.indexOf(','));

        System.out.println("Intec Brussel can be found at: " + streetSubstring);

        String name = "Alexander Keisse";

        if (name.startsWith("Alexander")) {
            name = name.replace("Alexander", "Elliot");
        }

        if (name.endsWith("Keisse")) {
            name.replace("Keisse", "Alderson");
        }

        System.out.println("My name is: " + name);
    }

}
