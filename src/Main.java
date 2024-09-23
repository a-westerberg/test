import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean menuRunning = true;

        Rektangel rektangel = new Rektangel(0,0);
        Cirkel cirkel = new Cirkel(0);
        Triangel triangel = new Triangel(0,0);

    while(menuRunning) {
        System.out.println("Meny för att räkna ut area på olika figurer!");
        System.out.println("1. Beräkna arean på rektangel");
        System.out.println("2. Beräkna arean på cirkel");
        System.out.println("3. Beräkna arean på triangel");
        System.out.println("4. Avsluta programmet...");

        System.out.print("Välj ett val: ");
        String menuSelection = scanner.nextLine();



        switch (menuSelection) {
            case "1":
                System.out.print("Skriv in bredden på rektangeln: ");
                double rektangelWidth = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Skriv in höjden på rektangeln: ");
                double rektangelHeight = scanner.nextDouble();
                scanner.nextLine();
                rektangel.setRektangelArea(rektangelWidth, rektangelHeight);
                printLine();
                rektangel.areaResult();
                printLine();
                break;
            case "2":
                System.out.print("Skriv in radien på cirkeln: ");
                double cirkelRadie = scanner.nextDouble();
                scanner.nextLine();
                cirkel.setRadie(cirkelRadie);
                printLine();
                cirkel.areaResult();
                printLine();
                break;
            case "3":
                System.out.print("Skriv in basen på triangeln: ");
                double triangelBase = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Skriv in höjden på triangeln: ");
                double triangelHeight = scanner.nextDouble();
                triangel.setBas(triangelBase);
                triangel.setHöjd(triangelHeight);
                printLine();
                triangel.areaResult();
                printLine();

                break;
            case "4":
                System.out.println("Programmet avslutas...");
                menuRunning = false;
                break;
            default:
                System.out.println("default <-------------------- något feltryck");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("-----------------------------------------");
                System.out.println("Ogiltigt Svar");
                break;
        }

    }



        rektangel.areaResult();
        cirkel.areaResult();
        triangel.areaResult();





        scanner.close();
    }

    public static void printLine(){
        System.out.println("----------------------------");
    }

}