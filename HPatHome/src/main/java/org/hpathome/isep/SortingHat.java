package org.hpathome.isep;

import java.util.List;
import java.util.Scanner;

public class SortingHat {
    public static List<String> houses = List.of("Gryffindor", "Slytherin", "Ravenclaw", "Hufflepuff");

    public static void ChooseHouse() {
        System.out.println("It's time to take the sorting hat test! Each house will grant you different perks which will be useful in your journey.");
        System.out.println("Which house do you want to be in?");
        System.out.println("1. "+ houses.get(0));
        System.out.println("2. "+ houses.get(1));
        System.out.println("3. "+ houses.get(2));
        System.out.println("4. "+ houses.get(3));
        Scanner scanner = new Scanner(System.in);
        int chosenHouse = scanner.nextInt();
        Wizard.playerHouse = houses.get(chosenHouse - 1);

    }
}
