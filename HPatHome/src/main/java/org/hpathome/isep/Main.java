package org.hpathome.isep;

public class Main {
    public static void main(String[] args) {

        Wizard newPlayer = new Wizard();
        newPlayer.initWizard();
        Wand newWand = new Wand();
        newWand.chooseWand();


        //System.out.println(newWand.getCore() + "and" + newWand.getWood());



    }


}