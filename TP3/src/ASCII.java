import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        ASCII();
        }

    public static void ASCII(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veulliez saisir la hauteur de votre Chat :");
        int a = scanner.nextInt();

        System.out.println("Veulliez saisir la largeur de votre Chat :");
        int b = scanner.nextInt();

        if((a<4)||(b<4)){
            throw new RuntimeException("Votre chat est trop petit, veuillez mettre une hauteur et une largeur supérieur à 3.");
        }

        System.out.print("|\\");
        for (int i = 1 ; i<=b; i++){
            System.out.print("-");
        }
        System.out.println("/|");


        for (int i = 1 ; i<=a-1; i++){
            System.out.print("|");
            if (i == a/2){
                System.out.print(" ");
                System.out.print("0");

                for (int j = 1 ; j<=b-2; j++){
                    System.out.print("_");
                }

                System.out.print("0");
                System.out.print(" ");

            }
            else {
                for (int k = 1 ; k<=b+2; k++) {

                    System.out.print(" ");
                }
                }
            System.out.println("|");
        }

        System.out.print(" \\_");

        for (int h = 1 ; h<=b-2; h++) {

            System.out.print("^");
        }

        System.out.println("_/ ");

    }

}
