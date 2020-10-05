import java.util.Scanner;

class Tafel {
    public static void main(String[] args) {

        class cijfer {
        }
        int cijfer;
        int einde;
    Scanner sc = new Scanner(System.in);
    System.out.println("Voer een getal in om de tafel te berekenen, ben je klaar met de calculator typ dan 'Einde':");
    cijfer = sc.nextInt();
    for (int x = 1; x <= 10; x++) {
        System.out.println(cijfer + "*" + x + "=" + (cijfer * x));
    }
   // if (cijfer.equals(einde)) {
        System.out.println("U bent gekomen aan het einde van de Calculator");

        }
    }






