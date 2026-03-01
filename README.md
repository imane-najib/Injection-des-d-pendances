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

## 1 - Création de l’interface IDao
Interface contenant une méthode getData().
<img width="781" height="247" alt="image" src="https://github.com/user-attachments/assets/5806f690-4473-4a73-b84d-8bec83ddb0f5" />

## 2- Implémentation de IDao
Création de la classe DaoImpl.
<img width="704" height="376" alt="image" src="https://github.com/user-attachments/assets/0b20d4c2-f394-42c7-9808-0ae9c3b88acc" />

## 3- Création de l’interface IMetier
Interface contenant une méthode calcul().
<img width="695" height="201" alt="image" src="https://github.com/user-attachments/assets/83f7118b-24a8-40f8-a25e-47e58b66463d" />

## 4 - Implémentation avec Couplage Faible
La classe MetierImpl dépend de l’interface IDao et non d’une classe concrète.
<img width="960" height="782" alt="image" src="https://github.com/user-attachments/assets/127c33c9-ff5f-48f1-ae96-3aeac756da74" />

## 5 - Injection des Dépendances
   ### a) Injection par Instanciation Statique
   <img width="717" height="300" alt="image" src="https://github.com/user-attachments/assets/d324695f-ac54-43fe-bf13-d041551b013b" />
   Les objets sont créés manuellement avec new.
   ### b) Injection par Instanciation Dynamique
   <img width="412" height="126" alt="image" src="https://github.com/user-attachments/assets/5d6eeb74-8244-4500-8f1d-e8ec488d89f1" />
   <img width="960" height="482" alt="image" src="https://github.com/user-attachments/assets/9a37be41-526f-473a-9d31-95552018a637" />

   ### c) Injection avec Spring Framework
   #### Version XML
   <img width="774" height="385" alt="image" src="https://github.com/user-attachments/assets/60b038fd-28cb-4674-98f9-91ce64624dda" />
   <img width="1005" height="495" alt="image" src="https://github.com/user-attachments/assets/5d98498a-ee90-4b88-82a5-2b9e51c88d6a" />
   ### Version Annotations
   <img width="1072" height="418" alt="image" src="https://github.com/user-attachments/assets/e71c8539-2c13-4653-aa70-212659007c85" />















