package org.hpathome.isep;

import java.util.Scanner;

public final class Wizard {
    private static String name = null;

    public static void initWizard() {
        System.out.println("Welcome to the Hogwarts School of Witchcraft and Wizardry!");
        System.out.println("Before we begin, I need to ask you a few questions.");
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Welcome to Hogwarts, " + name + "!");

    }

    public int hp = 100;




}
