# LAB-5-Convertisseur-Temp-rature-Distance-Fragments-Onglets-

ConverterTabsJava est une application Android moderne développée en Java. Elle permet de réaliser des conversions d'unités (Température et Distance) de manière fluide grâce à une interface organisée par onglets (Tabs) et un système de balayage horizontal (ViewPager2).

## Aperçu de l'application

1.Température : Conversion bidirectionnelle entre Celsius (°C) et Fahrenheit (°F).

2.Distance : Conversion bidirectionnelle entre Kilomètres (Km) et Miles (Mi).

## Fonctionnalités

• Navigation par onglets : Utilisation de TabLayout et TabLayoutMediator.

• Navigation par balayage : Intégration de ViewPager2 pour glisser entre les écrans.

• Architecture Fragments : Chaque convertisseur est un fragment indépendant (TempFragment, DistanceFragment).

• Gestion de la fermeture : Une boîte de dialogue de confirmation (AlertDialog) s'affiche lors de l'appui sur le bouton retour pour éviter de quitter l'application par erreur.

• Interface responsive : Utilisation de LinearLayout et de composants Material Design.

## Structure du Projet

<img width="307" height="314" alt="image" src="https://github.com/user-attachments/assets/995e72d6-6a3b-43fe-99dd-327b19bd3a94" />

Classes Java :

•MainActivity : Initialise le ViewPager2 et lie le TabLayout.

•ViewPagerAdapter : Gère le flux des fragments selon l'onglet sélectionné.

•TempFragment / DistanceFragment : Contiennent la logique de calcul et les formules de conversion.

## Démonstration Vidéo

Découvrez l'application en action (Navigation, calculs et gestion des dialogues) :

https://github.com/user-attachments/assets/5a23f433-f23e-4614-9b34-e46e86f0e2dd


