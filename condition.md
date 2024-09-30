# Test d'algo : Conditions


*Bonjour,
Vous trouverez-ci ici mes réponses du test d'algo en pseudo-code.  
Bien à vous,  
Anne Gicquel.*
<br /> 



**1- Ecrire un programme qui demande son prénom à l'utilisateur, et qui lui réponde par un
charmant « Bonjour » suivi du prénom. On aura ainsi le dialogue suivant :
Navigateur : Quel est votre prénom ?
Utilisateur : Zack
Navigateur : Bonjour, Zack !**

```
Variable Prenom en Caracteres  
Debut  
Ecrire "Quel est votre prénom s'il vous plaît ?"  
Lire Prenom  
Ecrire "Bonjour, ", Prenom , " !"  
Fin
```

**2- Ecrire un programme qui demande un nombre à l’utilisateur, puis qui calcule et affiche le
carré de ce nombre.**

```
Variable Nombre en Numerique  
Debut  
Ecrire "Quel nombre souhaitez-vous élever au carré ?"  
Lire Nombre  
Ecrire "Voici le résultat de ", Nombre, "au carré : ", Nombre ** 2, " ."
Fin  
```

**3- Ecrire un algorithme qui demande un nombre à l’utilisateur, et l’informe ensuite si ce nombre
est positif ou négatif (on laisse de côté le cas où le nombre vaut zéro).**

```
Variable Nombre en Numerique  
Debut  
Ecrire "Donnez-moi le nombre de votre choix, s'il vous plaît :"  
Lire Nombre  
Si Nombre > 0 Alors  
    Ecrire Nombre, " est un nombre est positif !"  
SinonSi Nombre < 0 Alors  
    Ecrire Nombre, " est un  nombre est négatif !"  
FinSi  
Fin  
``` 

**4- Ecrire un programme qui lit le prix HT d’un article, le nombre d’articles et le taux de TVA
(ex :20), et qui fournit le prix total TTC correspondant**

```
Variable HT en Numerique  
Variable Nbr en Numerique  
Variable Taux en Numerique  
Variable TVA en Numerique  
Variable TTC en Numerique  
Debut  
Ecrire "Veuillez renseigner le prix HT de votre article à l'unité :" 
Lire HT
Ecrire "Veuillez renseigner le nombre d'article :"   
Lire Nbr
Ecrire "Veuillez renseigner le taux de TVA :"   
Lire Taux  
TVA <- HT * Taux / 100  
TTC <- (HT + TVA) * Nbr  
Ecrire "Le prix TTC s'élève à : ", TTC  , " ."
Fin  
```

**5- Ecrire un algorithme qui demande deux nombres à l’utilisateur et l’informe ensuite si leur
produit est négatif ou positif (on laisse de côté le cas où le produit est nul). Attention
toutefois : on ne doit pas calculer le produit des deux nombres.**

```
Variable NbrA en Numerique
Variable NbrB en Numerique
Debut 
Ecrire "Choisissez un premier nombre, s'il vous plaît :"
Lire NbrA
Ecrire "Choisissez un deuxième nombre, s'il vous plaît :"
Lire NbrB
Si (NbrA > 0 et NbrB > 0) ou (NbrA < 0 et NbrB < 0) Alors
    Ecrire " Le produit de ces deux nombres est positif !"
SinonSi NbrA < 0 ou NbrB < 0 Alors
    Ecrire " Le produit de ces deux nombres est négatif !"
FinSi
Fin
```

**6- Ecrire un algorithme qui demande trois nombres à l’utilisateur et l’informe ensuite s’ils sont
rangés ou non dans l’ordre croissant.**

```
Variable Nbr1 en Numerique  
Variable Nbr2 en Numerique  
Variable Nbr3 en Numerique  
Variable Comparaison1 en Caracteres  
Variable Comparaison2 en Caracteres  
Debut 
Ecrire "Choisissez un premier nombre, s'il vous plaît :"
Lire Nbr1 
Ecrire "Choisissez un deuxième nombre, s'il vous plaît : "
Lire Nbr2 
Ecrire "Choisissez un troisième nombre, s'il vous plaît : "
Lire Nbr3  
Si Nbr1 < Nbr2 Alors  
    Comparaison1 <- "Les nombres sont rangés dans un ordre croissant."  
    Si Nbr2 < Nbr3 Alors  
    Ecrire Comparaison1  
    SinonSi Nbr2 > Nbr3 Alors  
    Ecrire "Les deux premiers nombres sont rangés dans un ordre croissant."  
    FinSi  
SinonSi Nbr1 > Nbr2 Alors  
    Comparaison2 <- "Les nombres sont rangés dans un ordre décroissant."  
    Si Nbr2 > Nbr3 Alors  
    Ecrire Comparaison2  
    SinonSi Nbr2 < Nbr3 Alors  
    Ecrire "Les deux premiers nombres sont rangés dans un ordre décroissant."  
    FinSi  
FinSi  
Fin  
```

**7- Ecrire un algorithme qui permet d’afficher la valeur absolue d'un réel saisie au clavier .
|x|= x si x>0
|x|= -x si x<0**

```
Variable X en Numerique
Debut 
Ecrire "Veuillez renseigner un nombre réel :"
Lire X
Si X < 0 Alors
    Ecrire "La valeur absolue de ", X, " est |-", X, "| ."
Sinon
    Ecrire "La valeur absolue de ", X, " est |", X, "| ."
FinSi
Fin
```

**8- Écrire un algorithme qui : demande à l’utilisateur deux nombres, et l'informe s'il y a au moins
un positif.**

```
Variable Nbr1 en Numerique
Variable Nbr2 en Numerique
Debut 
Ecrire "Choisissez un premier nombre, s'il vous plaît :"
Lire Nbr1
Ecrire "Choisissez un deuxième nombre, s'il vous plaît :"
Lire Nbr2
Si Nb1 > 0 ou Nbr2 > 0 Alors
    Ecrire "Il y a un nombre positif sur deux !"
Sinon
    Ecrire "Ces nombres sont tous les deux positifs ou négatifs."
FinSi
Fin
```

**9- Ecrire un algorithme qui demande un nombre à l’utilisateur, et l’informe ensuite si ce nombre
est positif ou négatif (on inclut cette fois le traitement du cas où le nombre vaut zéro).**

```
Variable Nombre en Numerique
Debut 
Ecrire "Veuillez renseigner le nombre de votre choix :"
Lire Nombre
Si Nombre = 0 Alors
    Ecrire "Veuillez renseigner un nombre différent de zéro !"
    Lire Nombre
    SinonSi Nombre > 0 Alors
        Ecrire "Ce nombre est positif !"
    Sinon 
        Ecrire "Ce nombre est négatif !" 
    FinSi  
SinonSi Nombre > 0 Alors
    Ecrire "Ce nombre est positif !"
Sinon 
    Ecrire "Ce nombre est négatif !" 
FinSi  
Fin
```

**10- Ecrire un algorithme qui demande deux nombres à l’utilisateur et l’informe ensuite si le
produit est négatif ou positif (on inclut cette fois le traitement du cas où le produit peut être
nul). Attention toutefois, on ne doit pas calculer le produit !**

```
Variable NbrA en Numerique
Variable NbrB en Numerique
Debut 
Ecrire "Choisissez un premier nombre, s'il vous plaît :"
Lire NbrA
Ecrire "Choisissez un deuxième nombre, s'il vous plaît :"
Lire NbrB
Si NbrA = 0 ou NbrB = 0 Alors
    Ecrire "Un de vos nombre est égal à 0, veuillez le changer."
SinonSi NbrA > 0 et NbrB > 0 Alors
    Ecrire " Le produit de ces deux nombres est positif."
SinonSi NbrA < 0 ou NbrB < 0 Alors
    Ecrire " Le produit de ces deux nombres est négatif."
FinSi
Fin
```

**11- Ecrire un algorithme qui demande l’âge d’un enfant à l’utilisateur. Ensuite, il l’informe de sa
catégorie :**
**- "Poussin" de 6 à 7 ans**
**- "Pupille" de 8 à 9 ans**
**- "Minime" de 10 à 11 ans**
**- "Cadet" après 12 ans**

```
Variable Age en Entier
Debut 
Ecrire "Quel est l'âge de l'enfant concerné ?"
Lire Age
Si 6 >= Age <= 7 Alors
    Ecrire "Félicitations ! Il appartient à la catégorie Poussin !"
SinonSi 8 >= Age <= 9 Alors
    Ecrire "Félicitations ! Il appartient à la catégorie Pupille !"
SinonSi 10 >= Age <= 11 Alors
    Ecrire "Félicitations ! Il appartient à la catégorie Minime !"
SinonSi  Age >= 12 Alors
    Ecrire "Félicitations ! Il appartient à la catégorie Cadet !"
FinSi
Fin
```

**12- Cet algorithme est destiné à prédire l'avenir, et il doit être infaillible !
Il lira au clavier l’heure et les minutes, et il affichera l’heure qu’il sera une minute plus tard.
Par exemple, si l'utilisateur tape 21 puis 32, l'algorithme doit répondre :
"Dans une minute, il sera 21 heure(s) 33".
NB : on suppose que l'utilisateur entre une heure valide. Pas besoin donc de la vérifier.**

```
Variable Heure en Entier
Variable Minutes en Entier
Debut 
Ecrire "Veuillez saisir l'heure actuelle :"
Lire Heure
Ecrire "Ainsi que les minutes en cours :"
Lire Minutes
Si Minutes = 59 Alors
    Heure <- Heure + 1
    Minutes <- -1
    Si Heure = 24 Alors
        Heure <- 0
    FinSi
FinSi
Ecrire "Dans une minute, il sera ", Heure, "heure(s) ", Minute + 1, " ."
Fin
```

**13- De même que le précédent, cet algorithme doit demander une heure et en afficher une
autre. Mais cette fois, il doit gérer également les secondes, et afficher l'heure qu'il sera une
seconde plus tard.
Par exemple, si l'utilisateur tape 21, puis 32, puis 8, l'algorithme doit répondre : "Dans une
seconde, il sera 21 heure(s), 32 minute(s) et 9 seconde(s)".
NB : là encore, on suppose que l'utilisateur entre une heure valide.**

```
Variable Heure en Entier
Variable Minutes en Entier
Variable Secondes en Entier
Debut 
Ecrire "Veuillez saisir l'heure actuelle :"
Lire Heure
Ecrire "Ainsi que les minutes en cours :"
Lire Minutes
Ecrire "Et pour finir les secondes en cours :"
Lire Secondes
Si Secondes = 59 Alors
    Minutes <- Minutes + 1
    Secondes <- -1
FinSi
Si Minutes = 59 Alors
    Heure <- Heure + 1
    Minutes <- 0
    Si Heure = 24 Alors
        Heure <- 0
    FinSi
FinSi
Ecrire "Dans une seconde, il sera ", Heure, "heure(s) ", Minute + 1, " minute(s) ", "et ", Secondes + 1, " seconde(s)."
Fin
```

**14- Un magasin de reprographie facture 0,10 E les dix premières photocopies, 0,09 E les vingt
suivantes et 0,08 E au-delà. Ecrivez un algorithme qui demande à l’utilisateur le nombre de
photocopies effectuées et qui affiche la facture correspondante.**

```
Variable Nombre en Entier
Variable Forfait1 en Numerique
Variable Forfait2 en Numerique
Variable Forfait3 en Numerique
Debut 
Forfait1 <- 0,10
Forfait2 <- 0,09
Forfait3 <- 0,08
Ecrire "Combien de photocopies desirez-vous ?"
Lire Nombre
Si Nombre <= 10 Alors
    Ecrire "Pour ", Nombre, " photocopies la facture s'élévera à ", Nombre * Forfait1, " ."
SinonSi 10 < Nombre <= 20 Alors
    Ecrire "Pour ", Nombre, " photocopies la facture s'élévera à ", Nombre * Forfait2, " ."
SinonSi Nombre > 20 Alors
    Ecrire "Pour ", Nombre, " photocopies la facture s'élévera à ", Nombre * Forfait3, " ."
FinSi
Fin
```

<span style="color:red">🛑 Il n'y a que l'exercice 14 qui pose problème. Si le client fait 11 photocopies, le prix total devrait être de 1,09 €. 🛑</span>


**15- Les habitants de Zorglub paient l’impôt selon les règles suivantes :**
**- les hommes de plus de 20 ans paient l’impôt**
**- les femmes paient l’impôt si elles ont entre 18 et 35 ans**
**- les autres ne paient pas d’impôt**
**Le programme demandera donc l’âge et le sexe du Zorglubien, et se prononcera donc ensuite
sur le fait que l’habitant est imposable.**

```
Variable Age en Entier
Variable Sexe en Caracteres
Debut 
Ecrire "Pour déterminer si vous êtes imposable ou non, veuillez s'il vous plaît renseigner votre sexe :"
Lire Sexe 
Ecrire "Veuillez également renseigner votre âge, s'il vous plaît :"
Lire Age
Si (Sexe = "homme" et Age > 20) ou (Sexe = "femme" et 18 =< Age => 35) Alors
    Ecrire "Vous êtes imposable."
Sinon
    Ecrire "Vous n'êtes pas imposable."
FinSi
Fin
```

**16- On désire écrire un algorithme qui permet d’afficher le jour correspondant à un chiffre allant
de 1 à 7 , entré au clavier.**

```
Variable Chiffre en Entier
Tableau Jours[6] en Caractère
Debut
Jours[0] ← "Lundi"
Jours[1] ← "Mardi"
Jours[2] ← "Mercredi"
Jours[3] ← "Jeudi"
Jours[4] ← "Vendredi"
Jours[5] ← "Samedi"
Jours[6] ← "Dimanche"
Ecrire "Veuillez renseigner un chiffre qui va de 1 à 7 inclus, s'il vous plaît  :"
Lire Chiffre
Si Chiffre >= 1 et Chiffre <= 7 Alors
    Ecrire "Le jour correspondant à votre chiffre est : ", Jours[Chiffre - 1], " !"
Sinon
    Ecrire "Erreur ! Veuillez entrer un chiffre entre 1 et 7."
FinSi
Fin
```

**17- Ecrire un algorithme qui permet de saisir deux nombres entiers x ,y et les afficher à l’écran
dans l’ordre croissant.**

```
Variable X en Entier
Variable Y en Entier
Variable Temp en Entier
Debut 
Ecrire "Veuillez écrire un premier nombre entier s'il vous plaît  :"
Lire X
Ecrire "Veuillez écrire un deuxième nombre entier s'il vous plaît  :"
Lire Y
Temp <- 0
Si X > Y Alors
    Temp <- X
    X <- Y
    Y <- Temp
FinSi
Ecrire "Voici les nombres saisis dans leur ordre croissant : ", X , "et ", Y " ."
Fin
```
