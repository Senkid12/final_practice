package org.example;

public class Account {
    public final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        int spaceCount = name.replaceAll("[^ ]", "").length();
        if ((name.length() >= 3 & name.length() <= 19) & spaceCount == 1 & name.trim().equals(name)) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
}
