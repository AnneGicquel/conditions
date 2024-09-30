package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "\nBonjour, voici mes réponses au test d'algo WHILE en Java. "
                + "\nBien à vous, "
                + "\nAnne Gicquel\n\n "
        );
        exo1();
        exo2();
        exo3();
        exo4();
        exo5();
        exo6();
        exo7();
        exo8();
        exo9();
        exo10();
    }

    /* 1- Ecrire un algorithme qui demande à l’utilisateur un nombre compris entre 1 et 3 jusqu’à ce
    que la réponse convienne.*/
    public static void exo1() {
        System.out.println("🟡 exo1()");
        Scanner userInput = new Scanner(System.in);
        int number;
        do {
            System.out.println("Veuillez saisir un nombre entre 1 et 3 : ");
            number = userInput.nextInt();
        } while (number < 1 || number > 3);
        System.out.println("Vous avez choisi le nombre : " + number);
    }

    /* 2- Ecrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce que la
     réponse convienne. En cas de réponse supérieure à 20, on fera apparaître un message :
     « Plus petit ! », et inversement, « Plus grand ! » si le nombre est inférieur à 10.*/
    public static void exo2() {
        System.out.println("🟡 exo2()");
        Scanner userInput = new Scanner(System.in);
        int number;
        do {
            System.out.println("Veuillez saisir un nombre entre 10 et 20 : ");
            number = userInput.nextInt();
            if (number < 10) {
                System.out.println("Plus grand !");
            } else if (number > 20) {
                System.out.println("Plus petit !");
            }
        }while (number < 10 || number > 20) ;
            {
                System.out.println("Votre numéro est le : " + number + " .");
            }
        }

/* 3- Ecrire un algorithme qui demande successivement plusieurs nombres à l’utilisateur, et qui lui
 dise ensuite quel était le plus grand parmi ces nombres et sa position :
 La saisie des nombres s’arrête lorsque l’utilisateur entre un zéro.*/
public static void exo3() {
        System.out.println("🟡 exo3()");
        Scanner userInput = new Scanner(System.in);
        int number;
        int max = Integer.MIN_VALUE;
        System.out.println("Veuillez saisir un nombre : ");
        do {
            number = userInput.nextInt();
            if (number != 0) {
                System.out.println("Ce n'est pas le résultat attendu ! \nVeuillez saisir un nouveau nombre :");
                if (number > max) {
                    max = number;
                }
            }
        } while (number != 0) ;
            {
                System.out.println("BRAVO ! Le résultat attendu était " + number + " !!");
                System.out.println("Aussi, sachez que le plus grand nombre saisi était le : " + max + ".");
            }
        }

/* 4- Lire la suite des prix (en euros entiers et terminée par zéro) des achats d’un client. Calculer
 la somme qu’il doit, lire la somme qu’il paye, et simuler la remise de la monnaie en
 affichant les textes "10 Euros", "5 Euros" et "1 Euro" autant de fois qu’il y a de coupures de
 chaque sorte à rendre.*/
public static void exo4() {
    System.out.println("🟡 exo4()");
    Scanner userInput = new Scanner(System.in);
    int price;
    int pricesList = 0;

    System.out.println("Veuillez saisir vos achats : ");
    do {
        System.out.println("Quel est le prix de votre article ?");
        price = userInput.nextInt();
        pricesList += price;
    }while (price != 0);{
        // somme des prix
        System.out.println("Voici le total de vos achats : " + pricesList + " .\n");
    }
    System.out.println("Quelle somme donnez-vous pour payer : ");
    int money = userInput.nextInt();

    int diff =  money - pricesList;
    System.out.println("Je dois vous rendre : " + diff);

    while (diff != 0) {
        if (diff >= 10) {
            System.out.println("Voici 10 euros");
            diff -= 10;
        } else if (diff >= 5) {
            System.out.println("Voici 5 euros");
            diff -= 5;
        } else {
            System.out.println("Voici 1 euro");
            diff -= 1;
        }
    }
    System.out.println("La somme a bien été rendue car je vous dois : " + diff + " .");
}

/* 5- Ecrire un algorithme qui permet de retrouver le maximum, le minimum ainsi que la somme
 d’une liste de nombres positifs saisis par l’utilisateur. La fin de la liste est indiquée par un
 nombre négatif. La longueur de la liste n’est pas limitée.*/

public static void exo5() {
    System.out.println("🟡 exo5()");
    Scanner userInput = new Scanner(System.in);
    int number = 0;
    int totalNumber = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    System.out.println("Vous allez constituer un suite de nombre. ");

    do {
        System.out.println("Veuillez saisir un nombre :");
        number = userInput.nextInt();
        if (number > 0 ){
        totalNumber += number;
            if (number > max) {
                max = number;
                System.out.println("max :" + max);
            }
            else if (number < min) {
                min = number;
                System.out.println("min :" + min );
            }
        }
    } while (number > 0);
    {
        System.out.println("La saisie des nombre s'arrête car vous avez saisi un nombre négatif : " + number + " .");
        System.out.println("Voici le total des nombres saisies : " + totalNumber + " .");
        System.out.println("Voici le nombre le plus grand saisi : " + max + " .");
        System.out.println("Et enfin, voici le plus petit nombre saisi : " + min + " .");
    }
}

/* 6- Ecrire un algorithme qui permet d’essayer de deviner la valeur d’un nombre entier caché. Si la
 valeur saisie est supérieure ou inférieure, la machine affiche respectivement "c’est moins" ou
 "c’est plus" jusqu’à soi que le nombre soit trouvé ou que l’utilisateur abandonne la recherche.
 On suppose que celui qui saisit le nombre caché (qui ne sera pas affiché) n’est pas celui qui le
 cherche.*/
public static void exo6() {
    System.out.println("🟡 exo6()");
    Scanner userInput = new Scanner(System.in);
    int secretNumber = 888;
    int guess;

    System.out.println("Prêt·e à renseigner des supposition pour le nombre mystère ? ");
    do{
        System.out.println("Saisissez votre proposition de nombre entier : ");
        guess = userInput.nextInt();
        if (guess < secretNumber){
            System.out.println("C’est PLUS !");
        }
        else if (guess > secretNumber){
            System.out.println("C’est MOINS !");
        }
    }while (guess != secretNumber); {
        System.out.println("BRAVO !!! Vous avez trouvé le nombre mystère qui est : " + secretNumber + " .");
    }
}

/* 7- Écrire un algorithme qui demande à l'utilisateur un nombre et qui affiche les nombres
de 1 jusqu’à ce nombre.*/
    public static void exo7() {
        System.out.println("🟡 exo7()");
        Scanner userInput = new Scanner(System.in);
        int number;
        int one = 1;

        System.out.println("Donner un nombre :");
        number = userInput.nextInt();

        do{
            System.out.println(one);
            one += 1;
        } while (one <= number );{
            System.out.println("Vous trouverez ci-dessus le chemin allant de 1 jusqu'au nombre que vous avez donné. ");
        }
    }

/* 8- Écrivez un programme pour entrer un nombre de l'utilisateur et comptez le nombre de
  chiffres dans l'entier donné en utilisant une boucle WHILE.
  Ex :
  Saisir un nombre : 2020
  Nombre de chiffres : 4 */

public static void exo8() {
    System.out.println("🟡 exo8()");
    Scanner userInput = new Scanner(System.in);
    int number;
    int digit = 0;
    System.out.println("Veuillez saisir un nombre :");
    number = userInput.nextInt(); // 100

    while (number != 0 ){
        number = number/10;
        digit += 1;
    }
    System.out.println("Il y a " + digit + " chiffres dans le nombre que vous venez de saisir. ");
}

/* 9- Un programme pose une question à laquelle l’utilisateur doit répondre par O (Oui) ou N
  (Non). Il se peut que l’utilisateur tape autre chose que la réponse attendue. Dès lors, le
  programme peut planter. Écrire un algorithme qui repose la même question jusqu’à l’une des
  deux réponses attendues soit saisie au clavier par l’utilisateur.
  Cela s’appelle un contrôle de saisie.*/

    public static void exo9() {
        System.out.println("🟡 exo9()");
        Scanner userInput = new Scanner(System.in);
        int answer;

        System.out.println("S'il vous plaît, veuillez répondre par OUI avec : 0 ou NON avec : 1 .");
        do{
            System.out.println("Ai-je rendu des exercices avec, dans l'ensemble, des réponses convenables ?");
            answer = userInput.nextInt();
        } while (answer != 0 && answer != 1) ;
        {
            System.out.println("Merci d'avoir répondu par OUI (n'est-ce pas ? :-)) ! ");
        }
    }

/* 10- Écrivez un programme pour saisir un nombre de l'utilisateur et recherchez le premier et le
 dernier chiffre d'un nombre en utilisant une boucle WHILE.
 EX :
 Données d'entrée
 Saisir un nombre : 1987
 Données de sortie
  Premier chiffre = 1 Dernier chiffre = 7 */

    public static void exo10() {
        System.out.println("🟡 exo10()");
        Scanner userInput = new Scanner(System.in);
        int number;
        int lastDigit;
        int firstDigit = 0;
        System.out.println("Veuillez saisir un nombre :");
        number = userInput.nextInt();
        lastDigit = number % 10;

        while (number != 0) {
            firstDigit = number % 10;
            number /= 10;
        }
        System.out.println("Le premier chiffre est : " + firstDigit + " et le dernier : " + lastDigit + " .");
    }

}