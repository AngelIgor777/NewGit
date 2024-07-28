package org.example;

public class Main {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();

        StringBuilder string = new StringBuilder();
        for (int i = 0; i < 100_000_000; i++) {
            string.append(i);
        }
        long endtime = System.currentTimeMillis();

        System.out.println("time"+(endtime - starttime));

        System.out.println(string);
    }

    public static String changeSmiles(String string) {
        return string.replace(":(", ":)");
    }

    private boolean cekWord(String string, String word) {
        return string.startsWith(word) && string.endsWith(word);
    }

    private static String fullName(String name) {
        String[] parts = name.split(" ");
        String first_name = parts[0];
        String last_name = parts[1];
        String surname = parts[2];

        return String.format("%s.%s.%s",
                first_name.toUpperCase().charAt(0),
                last_name.toUpperCase().charAt(0),
                surname.toUpperCase().charAt(0));

    }


}