import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        test(); // appel de la fonction avec nom de la fonction main
    }

    public static void test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Combien de valeur voulez-vous dans votre tableau ?");
        int NB = scanner.nextInt(); // Intégration nombre d'élément dans la tableau
        int[] a = new int[NB];
        for (int i = 0; i < a.length; i++) {           // Itération pour chaque nouveau nombre
            System.out.println("Saisir un entier :");
            int entier = scanner.nextInt();
            a[i] = entier;
        }
        System.out.println("Quelle est la valeur de k ?");
        int k = scanner.nextInt();
        int somme = 0;

        for (int i = 0; i<a.length;i++) {      // Vérification de la somme de 2 nombres dans le tableau par rapport à la valeur k
            for (int j = 0; j<a.length;j++) {
                if(a[i]+a[j]==k){
                    somme=1;
                }
            }
        }

        if (somme==1){  // Si k est égale à la somme de 2 nombres dans le taleau
            System.out.println("K est bien la somme de 2 éléments");
        }

        else {  // Si k n'est égale à la somme de 2 nombres dans le taleau
            System.out.println("Faux K n'est pas la somme de 2 éléments");
        }

    }



    


}