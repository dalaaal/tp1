import java.util.Scanner;

public class comparaison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int secret = 5;
        
        System.out.print("Veuillez saisir un chiffre : ");
        int chiffre = scanner.nextInt();
        
        while (chiffre != secret) {
            if (chiffre > secret) {
                System.out.println("Le numéro que vous avez saisi est supérieur au numéro secret.");
            } else if (chiffre < secret) {
                System.out.println("Le numéro que vous avez saisi est inférieur au numéro secret.");
            }
            System.out.print("Veuillez saisir un chiffre : ");
            chiffre = scanner.nextInt(); 
        }
        
        System.out.println("Bravo, vous avez gagné le jeu !");
        
        scanner.close();
    }
}