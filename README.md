# LAB-5-Convertisseur-Temp-rature-Distance-Fragments-Onglets-

ConverterTabsJava est une application Android moderne développée en Java. Elle permet de réaliser des conversions d'unités (Température et Distance) de manière fluide grâce à une interface organisée par onglets (Tabs) et un système de balayage horizontal (ViewPager2).

## Aperçu de l'application

1.Température : Conversion bidirectionnelle entre Celsius (°C) et Fahrenheit (°F).

2.Distance : Conversion bidirectionnelle entre Kilomètres (Km) et Miles (Mi).

## Fonctionnalités

•Navigation par onglets : Utilisation de TabLayout et TabLayoutMediator.

•Navigation par balayage : Intégration de ViewPager2 pour glisser entre les écrans.

•Architecture Fragments : Chaque convertisseur est un fragment indépendant (TempFragment, DistanceFragment).

•Gestion de la fermeture : Une boîte de dialogue de confirmation (AlertDialog) s'affiche lors de l'appui sur le bouton retour pour éviter de quitter l'application par erreur.

•Interface responsive : Utilisation de LinearLayout et de composants Material Design.

## Structure du Projet

app/src/main/java/com/example/convertertabsjava/
├── MainActivity.java        # Gestion des onglets et du ViewPager2
├── ViewPagerAdapter.java    # Adaptateur gérant le chargement des fragments
├── TempFragment.java        # Logique de conversion de température
└── DistanceFragment.java    # Logique de conversion de distance

app/src/main/res/layout/
├── activity_main.xml        # Layout principal (TabLayout + ViewPager2)
├── fragment_temp.xml        # Design du convertisseur de température
└── fragment_distance.xml    # Design du convertisseur de distance

## Démonstration Vidéo


https://github.com/user-attachments/assets/5a23f433-f23e-4614-9b34-e46e86f0e2dd


