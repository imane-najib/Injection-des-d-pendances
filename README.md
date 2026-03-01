# Compte Rendu – Injection des Dépendances 

#  Objectif du TP

L’objectif de cette activité pratique est de comprendre :

- Le principe du couplage faible
- L’injection des dépendances
- Les différentes méthodes d’injection :
  - Instanciation statique
  - Instanciation dynamique
  - Utilisation du Framework Spring (XML et Annotations)
    
# Partie 1 : Création des Interfaces et Implémentations

## Création de l’interface IDao
Interface contenant une méthode getData().
<img width="781" height="247" alt="image" src="https://github.com/user-attachments/assets/5806f690-4473-4a73-b84d-8bec83ddb0f5" />

## Implémentation de IDao
Création de la classe DaoImpl.
<img width="704" height="376" alt="image" src="https://github.com/user-attachments/assets/0b20d4c2-f394-42c7-9808-0ae9c3b88acc" />

## Création de l’interface IMetier
Interface contenant une méthode calcul().
<img width="695" height="201" alt="image" src="https://github.com/user-attachments/assets/83f7118b-24a8-40f8-a25e-47e58b66463d" />

## Implémentation avec Couplage Faible
La classe MetierImpl dépend de l’interface IDao et non d’une classe concrète.
<img width="960" height="782" alt="image" src="https://github.com/user-attachments/assets/127c33c9-ff5f-48f1-ae96-3aeac756da74" />

## Injection des Dépendances
   ### a) Injection par Instanciation Statique










