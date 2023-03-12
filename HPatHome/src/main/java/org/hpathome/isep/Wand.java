package org.hpathome.isep;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public final class Wand {
    @Getter
    @Setter
    private String wood;
    @Getter
    @Setter
    private String core;
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
        Core core = Core.values()[chosenCore - 1];
        String myCore = core.getCore();
        setCore(core.getCore());

        Random r = new Random();
        int randomitem = r.nextInt(woodList.size());
        String randomWood = woodList.get(randomitem);
        setWood(randomWood);
        System.out.println("Your wand is made of " + randomWood + " and has a " + myCore + " core.");


    }


}


