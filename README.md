# Restaurant Finder Application

## Description

L'objectif de cette application est de permettre aux utilisateurs de trouver facilement des restaurants dans différentes villes. En utilisant un spinner, les utilisateurs sélectionnent leur ville préférée, et l'application affiche ensuite une liste de restaurants spécifiques à cette localité (Le nom de restaurant, Adresse de restaurant, le numéro de téléphone) dans une RecyclerView. En résumé, l'application vise à offrir une expérience conviviale et personnalisée pour la recherche de restaurants locaux.

## Instructions

### 1. Création de Styles et Ressources

1. Créez un fichier de ressources (res/values/strings.xml) pour stocker le texte du TextView.
2. Dans le fichier de styles (res/values/styles.xml), définissez un style pour le TextView en utilisant les attributs appropriés (La taille de texte 16sp, Couleur de Text #BBFFAA, Texte Centré, les Marges 10dp).

### 2. Création de l'Interface Principale

1. Utilisez le fichier XML pour définir l'interface utilisateur, en ajoutant le TextView avec l'attribut android:text faisant référence à une ressource de texte.
2. Appliquez le style au TextView dans le fichier de mise en page XML.
3. Ajoutez le spinner.
4. Configurez le RecyclerView dans le fichier de mise en page XML.

### 3. Ajout du Spinner de Villes

- Créez un fichier de ressources (res/values/cities.xml) pour stocker la liste des villes.
- Utilisez un ArrayAdapter pour lier le Spinner à la liste des villes.
- Ajoutez un écouteur de sélection au Spinner pour déclencher la mise à jour du RecyclerView.

### 4. Ajout du Menu

- Créez un fichier de ressources pour le menu (res/menu/menu.xml) avec les options "Aide" et "Contactez-nous".
- Définissez l'icône et l'action "Contactez-nous" comme toujours visibles dans la barre d'action.
- Ajoutez le code pour gérer les actions du menu dans votre activité. (Action à effectuer lors du clic sur un item : afficher un message Toast)

### 5. Mise en Place du RecyclerView

- Créez un modèle de données pour les restaurants.
- Dans le fichier res/layout/list_restaurant_item.xml, définissez la structure de chaque élément de la liste qui sera inflaté dans le RecyclerView.
- Créez un adaptateur pour lier les données du modèle au RecyclerView.
- Personnalisez la mise en page des éléments du RecyclerView pour inclure le nom du magasin, l'adresse et le numéro de téléphone.
# RestuFinder
