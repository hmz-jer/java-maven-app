# Projet Java pour Test de Pipeline Jenkins
## À propos du Projet

Ce projet Java est conçu pour tester et démontrer les capacités des pipelines CI/CD avec Jenkins. Il vise à illustrer comment automatiser le processus de build, de test et de déploiement d'une application Java simple.
Prérequis

Pour utiliser ce projet, vous aurez besoin des éléments suivants installés localement :

    Java JDK (version 8 ou supérieure)
    Maven (pour la gestion des dépendances et le build)
    Jenkins (avec les plugins nécessaires pour les builds Java)

## Configuration du Projet

    Cloner le Repositoire :

    bash

git clone  https://github.com/hmz-jer/java-maven-app.git

## Naviguer dans le Répertoire du Projet :

bash

cd java-maven-app.git

## Compiler le Projet avec Maven :

bash

    mvn clean install

## Intégration avec Jenkins

Pour configurer ce projet avec Jenkins :

    Créez un nouveau job 'Pipeline' dans Jenkins.
    Configurez le chemin du SCM pour pointer vers ce répertoire.
    Ajoutez le script de pipeline (Jenkinsfile) pour définir les étapes de build, de test et de déploiement.

## Structure du Projet

    src: Contient les fichiers sources du projet.
    test: Contient les tests unitaires.
    Jenkinsfile: Définit le pipeline Jenkins pour automatiser les étapes de build, de test et de déploiement.

## Contribution

Les contributions à ce projet sont les bienvenues. Veuillez suivre les bonnes pratiques de développement et de gestion de code source pour les contributions.