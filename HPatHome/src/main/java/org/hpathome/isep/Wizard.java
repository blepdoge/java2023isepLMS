package org.hpathome.isep;

import java.util.List;
import java.util.Scanner;

public final class Wizard {
    private static String name = null;
    private static int petChoice;
    public static int playerHp = 100;
    public static int playerAcc = 1;
    public static int dmgRes = 10;
    public static List<Spell> spells;
    public static int playerDmg = 10;
    public static List<Potion> potions;
    public static String playerPet;
    public static String playerHouse;
    public Wizard() {
        this.name = name;
        this.playerHp = playerHp;
        this.playerAcc = playerAcc;
        this.dmgRes = dmgRes;
        this.spells = spells;
        this.playerDmg = playerDmg;
        this.potions = potions;
        this.playerPet = playerPet;
    }

    public static void initWizard() {
        System.out.println("Welcome to the Hogwarts School of Witchcraft and Wizardry!");
        System.out.println("Before we begin, I need to ask you a few questions.");
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Welcome to Hogwarts, " + name + "!");

        Wand newWand = new Wand();
        newWand.chooseWand();

        System.out.println("Now, let's choose your pet.");
        System.out.println("What type of pet would you like to have?");
        System.out.println("1. Owl");
        System.out.println("2. Cat");
        System.out.println("3. Toad");
        System.out.println("4. Rat");
        petChoice = scanner.nextInt();
        Pet pet = Pet.values()[petChoice - 1];  //get the enum variable associated to the number
        playerPet = pet.getPetName();             //get the string associated to the enum variable
        System.out.println("You have been gifted a " + playerPet + "!");

    }






}
