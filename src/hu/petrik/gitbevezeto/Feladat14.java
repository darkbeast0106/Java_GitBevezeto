package hu.petrik.gitbevezeto;

import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy szöveget: ");
        String szoveg = sc.nextLine();
        String menuPont = "";
        while (!menuPont.equals("f")) {
            System.out.println("Adja meg, hogy mit szeretne csinálni a szöveggel:");
            System.out.println("\ta - Nagybetűssé alakítani");
            System.out.println("\tb - Kisbetűssé alakítani");
            System.out.println("\tc - Lekérdezni a hosszát");
            System.out.println("\td - Összehasonlítani egy másik szöveggel");
            System.out.println("\te - A szöveg egy részét kiiratni");
            System.out.println("\tf - Kilépni");
            System.out.print("Adja meg a menüpontot: ");
            menuPont = sc.nextLine().toLowerCase();
            switch (menuPont) {
                case "a":
                    System.out.println(szoveg.toUpperCase());
                    break;
                case "b":
                    System.out.println(szoveg.toLowerCase());
                    break;
                case "c":
                    System.out.printf("A szöveg hossza %d karakter\n", szoveg.length());
                    break;
                case "d":
                    System.out.print("Kérem adja meg a másik szöveget: ");
                    String szoveg2 = sc.nextLine();
                    int osszehasonlitas = szoveg.compareTo(szoveg2);
                    if (osszehasonlitas < 0) {
                        System.out.println("Az első szöveg van előrébb az ABC-ben");
                    } else if (osszehasonlitas > 0) {
                        System.out.println("A második szöveg van előrébb az ABC-ben");
                    } else {
                        System.out.println("A két szöveg megegyezik");
                    }
                    break;
                case "e":
                    System.out.print("Kérem adja meg a kezdő karakter sorszámát amit ki szeretne írni: ");
                    int a = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Kérem adja meg az utolsó karakter sorszámát amit ki szeretne írni: ");
                    int b = sc.nextInt();
                    sc.nextLine();
                    System.out.println(szoveg.substring(a - 1, b));
                    break;
                case "f":
                    System.out.println("Viszlát!");
                    break;
                default:
                    System.out.println("Rossz lehetőséget adott meg, kérem a menüpontok közül válasszon!");
                    break;
            }
        }
    }
}
