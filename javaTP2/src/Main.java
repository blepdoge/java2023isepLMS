import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //factorielle();
        //countdown();
        //carres();
        //tableMultiplication();
        //egaliteStr();
        //min();
        //max();
        //parite();
        //discriminant();
        //regle();
        //premier();
        initialisationTableau();


    }

    public static void discriminant() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        double delta = (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle");
        } else if (delta == 0) {
            System.out.println("Ce polynome a une racine reelle");
            float x1 = -b / (2 * a);
            System.out.println("x1 = " + x1);
        } else {
            System.out.println("Ce polynome a deux racines reelles");
            double x1 = ((-b - Math.sqrt(delta)) / (2 * a));
            double x2 = ((-b + Math.sqrt(delta)) / (2 * a));
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

    }

    public static void parite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Le nombre " + a + " est pair");
        } else {
            System.out.println("Le nombre " + a + " est impair");
        }
    }

    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Le nombre " + a + " est le maximum");
        } else if (b > a) {
            System.out.println("Le nombre " + b + " est le maximum");
        } else {
            System.out.println("Les nombres sont egaux");
        }

    }

    public static void min() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println("Le nombre " + a + " est le minimum");
        } else if (b < a) {
            System.out.println("Le nombre " + b + " est le minimum");
        } else {
            System.out.println("Les nombres sont egaux");
        }

    }
//les cpu veulent que les int soient alignés sur des modulo 4 et
// le long sur des multiples de 8 donc ils rajputeront des bits if needed
// operateur "elvis" : a?.y remplace une comparaison a null genre a!=null et existe pas en java haha le nul
// donc en java le seul truc possible c'est les op ternaires donc a!=null ? a.y : null

    public static void egaliteStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        String a = scanner.nextLine();
        System.out.println("Quelle est la valeur de b ?");
        String b = scanner.nextLine();
        if (a.equals(b)) {
            System.out.println("Les chaines sont identiques");
        } else {
            System.out.println("Les chaines sont differentes");
        }
    }

    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }

    public static void countdown() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(500);
            if (i == 0) {
                System.out.println("BOOOOOOM!");
            }
        }
    }

    public static void carres() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier");
        int n = scanner.nextInt();
        System.out.println(n * n);
    }

    public static void tableMultiplication() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i * j);
                System.out.println("\t");
            }
        }
    }

    public static void regle() {
        for (int i = 0; i <= 30; i++) {
            char a = i % 10 == 0 ? 'x' : '-';
            System.out.print(a);
        }
        System.out.println();
        for (int i = 0; i <= 30; i++) {
            if (i % 10 == 0) {
                System.out.print(i);
                i += (""+i).length()-1;
            }else{
                System.out.print(" ");
            }
        }

    }

    public static void premier(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif");
        int n = scanner.nextInt();
        boolean premier = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                premier = false;
            }
        }
        if (premier) {
            System.out.println("Le nombre " + n + " est premier");
        } else {
            System.out.println("Le nombre " + n + " n'est pas premier");
        }
    }

    public static void initialisationTableau() {
        int[] tableau = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }
        System.out.println(Arrays.toString(tableau));
        int maximumTab = Arrays.stream(tableau).max().getAsInt();
        System.out.println("Le maximum du tableau est " + maximumTab);
        int minimumTab = Arrays.stream(tableau).min().getAsInt();
        System.out.println("Le minimum du tableau est " + minimumTab);
        int sommeTab = Arrays.stream(tableau).sum();
        System.out.println("La somme du tableau est " + sommeTab);
        int[] nombrePairs = Arrays.stream(tableau).filter(x -> x % 2 == 0).toArray();
        System.out.println("Les nombres pairs du tableau sont " + Arrays.toString(nombrePairs));
        int[] indexPairs = IntStream.range(0, tableau.length).filter(i -> tableau[i] % 2 == 0).toArray();
        System.out.println("Les index des nombres pairs du tableau sont " + Arrays.toString(indexPairs));
        inverseTableau(tableau);
    }
    public static void inverseTableau(int[] tableau){
        int[] tableauInverse = new int[tableau.length];
        for (int i = 0; i < tableau.length; i++) {
            tableauInverse[i] = tableau[tableau.length-1-i];
        }
        System.out.println(Arrays.toString(tableauInverse));
    }



}