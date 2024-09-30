#############################################################
# BONJOUR, VOICI MES REPONSES AU TEST D'ALGO FOR EN PYTHON. #
# BIEN A VOUS,                                              #
# ANNE GICQUEL                                              #
#############################################################


'''1- Ecrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix
nombres suivants. Par exemple, si l'utilisateur entre le nombre 17, le programme affichera
les nombres de 18 à 27.'''
print("🟡 exo 1 :")


starting_number = int(input("Veuillez renseigner un nombre de départ, s'il vous plaît : "))
print("Voici les 10 nombres suivants :")
for i in range (10):
    starting_number += 1
    print(starting_number) 


'''2- Ecrire un algorithme qui demande un nombre de départ, et qui ensuite écrit la table de
multiplication de ce nombre, présentée comme suit (cas où l'utilisateur entre le nombre 7) :
Table de 7 :
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
…
7 x 10 = 70'''
print("🟡 exo 2 :")


starting_number = int(input("Veuillez renseigner un nombre de départ, s'il vous plaît :"))
print(f"Table de {starting_number} :")
for i in range (1, 11):
    print (f" {starting_number} x {i} = {starting_number * i}") 


'''3- Écrire un algorithme qui demande à l'utilisateur un nombre et qui affiche les nombres de 1
jusqu’à ce nombre.'''
print("🟡 exo 3 :")


number = int(input("Veuillez saisir le nombre de votre choix : "))
print(f"Voici le compte jusqu'à {number} :")
for i in range (1, number+1):
    print(i)


'''4- Écrire un algorithme qui demande à l'utilisateur un nombre et qui affiche les nombres pairs
de 1 jusqu’à ce nombre.
Ex : les nombres pairs de 1 à 11 sont : 2 4 6 8 10'''
print("🟡 exo 4 :")


number = int(input("Veuillez saisir le nombre de votre choix : "))
print(f"Voici le compte, à pas de deux, jusqu'à {number} :")
for i in range (2, number+1, 2):
    print(i)


'''5- Écrire un algorithme qui demande à l'utilisateur un nombre et qui affiche les nombres impairs
de 1 jusqu’à ce nombre.
Ex : les nombres impairs de 1 à 11 sont : 1 3 5 7 9 11'''
print("🟡 exo 5 :")


number = int(input("Veuillez saisir le nombre de votre choix : "))
print(f"Voici le compte, à pas de deux, depuis 1 jusqu'à {number} :")
for i in range (1, number+1, 2):
    print(i)


'''6- Écrire un algorithme qui demande à l'utilisateur deux nombres et qui affiche les nombres du
plus petit au plus grand.
Ex : Donnez le nbr 1 : 9
Donnez le nbr 2 : 4
Le programme : 4 5 6 7 8 9'''
print("🟡 exo 6 :")


first_number = int(input("Veillez saisir un premier nombre : "))
second_number = int(input("Veillez saisir un deuxième nombre : "))

if first_number < second_number:
    print("Voici le chemin croissant de l'un à l'autre : ")
    for i in range (first_number, second_number + 1):
        print(i)
elif first_number > second_number:
    print("Voici le chemin croissant de l'un à l'autre : ")
    for i in range (second_number, first_number + 1):
        print(i)
else:
    print("Vous avez renseigné deux fois le même nombre.")


'''7- Ecrire un algorithme qui demande un nombre de départ, et qui calcule la somme des
entiers jusqu’à ce nombre. Par exemple, si l’on entre 5, le programme doit calculer :
1 + 2 + 3 + 4 + 5 = 15'''
print("🟡 exo 7 :")


starting_number = int(input("Veuillez saisir un nombre de départ : "))
addition_result = 0
for i in range (starting_number + 1):
    addition_result += i
print(f"La somme des nombres jusqu'à {starting_number} additionnés est : {addition_result}")


'''8- Ecrire un algorithme qui demande un nombre de départ, et qui calcule sa factorielle.
NB : la factorielle de 8, notée 8 ! vaut
1 x 2 x 3 x 4 x 5 x 6 x 7 x 8'''
print("🟡 exo 8 :")


starting_number = int(input("Veuillez saisir un nombre de départ : "))
factorial_number = starting_number
for i in range (1, starting_number):
    factorial_number *= i
print(f"Le produit des nombres jusqu'à {starting_number} est de : {factorial_number} ") 


'''9- Ecrire un algorithme qui demande successivement 20 nombres à l’utilisateur, et qui lui dise
ensuite quel était le plus grand parmi ces 20 nombres :
Entrez le nombre numéro 1 : 12
Entrez le nombre numéro 2 : 14
etc.
Entrez le nombre numéro 20 : 6
Le plus grand de ces nombres est : 14
Modifiez ensuite l’algorithme pour que le programme affiche de surcroît en quelle position
avait été saisie ce nombre :
C’était le nombre numéro 2'''
print("🟡 exo 9 :")


max = 0
for i in range (1, 21):
    number = int(input(f"Donnez un nombre n° {i} : "))
    if number > max:
        max = number
print(f"Le plus grand nombre saisi est : {max}") 


'''10- Pour avoir une idée sur le niveau des élèves d’une classe, on a décidé de calculer la moyenne
de la classe à partir des moyennes générales de tous les élèves qui sont au nombre de 10.
Ecrire un algorithme de résolution.'''
print("🟡 exo 10 :")


total_average = 0
for i in range (1, 11):
    average = int(input(f"Veuillez saisir la moyenne de l'élève n° {i} : "))
    total_average += average
class_average = total_average / 10
print(f"La moyenne de la classe est de : {class_average}") 


'''11- Ecrire un algorithme qui demande de saisir au clavier la taille de 10 personnes et qui
calcule le nombre de personnes dont la taille est plus petite que 1,70m.'''
print("🟡 exo 11 :")


count = 0
for i in range (1, 11):
    height = int(input(f"Veuillez saisir la taille en cm de la personne n° {i} : "))
    if height < 170:
        count += 1
print(f"Sur 10 personnes : {count} fait/font moins d'1,70m.") 


'''12- Écrire un algorithme qui demande à l'utilisateur un nombre et qui affiche :
Donner un nbr :
5
*****
*****
*****
*****
*****'''
print("🟡 exo 12 :")


print("Donner un nbr :")
number = int(input())
for i in range (number):
    print("*" * number) 


'''13- Écrire un algorithme qui demande à l'utilisateur un nombre et qui affiche :
Donner un nbr :
5
*
**
***
****
*****'''
print("🟡 exo 13 :")


print("Donner un nbr :")
number = int(input())
for i in range (1, number + 1):
    print("*" * i) 


'''14- Écrire un algorithme qui demande à l'utilisateur un nombre et qui affiche :
Donner un nbr :
5
*****
****
***
**
*'''
print("🟡 exo 14 :")


print("Donner un nbr :")
number = int(input())
for i in range (number,0, -1):
    print("*" * i) 


'''15- Écrire un algorithme qui demande à l'utilisateur un nombre et qui affiche :
Donner un nbr :
5
*****
 ****
  ***
   **
    *'''
print("🟡 exo 15 :")


print("Donner un nbr :")
white_space = " "
number = int(input())
stars = "*" * number
for i in range (number,0, -1):
    if i == number: 
        print(stars)
        number -= 1
        stars = "*" * (i - 1)
        stars = white_space + stars
        white_space += " "  
  

'''16- Écrire un algorithme qui demande à l'utilisateur un nombre et qui affiche :
Donner un nbr :
5
    *
   ***
  *****
 *******
*********'''
print("🟡 exo 16 :")


print("Donner un nbr :")
number = int(input())
white_space = " "
stars = "*" 
for i in range (number):
    number -= 1
    print( white_space * number + stars)
    stars += "**" 


'''17- Écrire un algorithme qui demande à l'utilisateur un nombre et qui affiche :
Donner un nbr :
5
*********
 *******
  *****
   ***
    *'''
print("🟡 exo 17 :")


print("Donner un nbr :")
number = int(input())
stars = "*"
stars_number = (number * 2) -1
white_space = "" 
for i in range (number):
    if white_space == "":
        print(white_space + stars * stars_number)
        white_space += " "  
    else:
        stars_number -= 2
        print(white_space + stars * stars_number)
        white_space += " "
 