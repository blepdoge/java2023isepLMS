package org.hpathome.isep;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public final class Wand {
    @Getter
    @Setter
    private static String wood;
    @Getter
    @Setter
    private static String core;
    private List<String> woodList = List.of("Oak", "Holly", "Birch", "Elm");


    public Wand() {
        this.wood = wood;
        this.core = core;
    }
    public void chooseWand() {

        System.out.println("Now, let's choose your wand.");
        System.out.println("What type of Core would you like your wand to have?");
        System.out.println("1. Phoenix Feather");
        System.out.println("2. Dragon Heartstring");
        System.out.println("3. Unicorn Hair");
        System.out.println("4. Veela Hair");
        System.out.println("5. Thestral Tail Hair");

        Scanner scanner = new Scanner(System.in);
        int chosenCore = scanner.nextInt();
        Core core = Core.values()[chosenCore - 1];  //get the enum variable associated to the number
        String myCore = core.getCore();             //get the string associated to the enum variable
        setCore(myCore);                    //set the core of the wand

        Random r = new Random();
        int randomItem = r.nextInt(woodList.size());    //get random index
        String randomWood = woodList.get(randomItem);   //get random item from the wood list
        setWood(randomWood);                            //set the wood of the wand

        System.out.println("Your wand is made of " + Wand.wood + " and has a " + Wand.core + " core.");


    }


}


