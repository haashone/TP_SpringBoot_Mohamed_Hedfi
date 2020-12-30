# TP_SpringBoot_Mohamed_Hedfi
 ![alt text](https://github.com/haashone/TP_SpringBoot_Mohamed_Hedfi/blob/main/src/main/resources/static/img/api.png?raw=true)
 
 # Partie 1
 ## Étape 5 les dépendances
 ### • Web:
 Créez des applications Web, y compris RESTful, à l'aide de Spring MVC.
 Utilise Apache Tomcat comme conteneur intégré par défaut.
 ### • JPA:
 Persister les données en SQL avec l'API Java Persistence à l'aide de Spring Data et Hibernate.
 ### • Hibernate:
 Permet aux développeurs d'écrire plus facilement des applications dont les données survivent au processus d'application.
 Hibernate se préoccupe de la persistance des données car elle s'applique aux bases de données relationnelles.
 ### • H2:
 Système de gestion de base de données relationnelle écrit en Java.
 Il peut être intégré dans des applications Java ou s'exécuter en mode client-serveur.
 ### • DevTools:
 Pour améliorer davantage l'expérience de développement.
 Fournit le redémarrage rapide des applications, LiveReload et des configurations0
 ### • Thymeleaf:
 Un moteur moderne de modèle en Java côté serveur pour les environnements Web et autonomes.
 Permet au HTML d'être correctement affiché dans les navigateurs.
 
 
  ## Étape 13
   1. paramétrage de l'url d'appel "/greeting" : utilisation de l'annotation `@GetMapping("/greeting")` dans le contrôleur.
   2. choix de fichier `html` à afficher : le nom de fichier est indiqué dans le return de la fonction et le fichier html existe dans le dossier `templates`.
   
      exemple : return "greeting".
   
   3. envoi de paramètre : utilisation de l'annotation `@RequestParam(name="nameGET", required=false, defaultValue="World")`.
                           
         • **name="nameGET":** le nom de variable à utiliser dans l'url. exemple : `http://localhost:8080/greeting?nameGET=Mohamed`.
         
         • **required=false:** l'utilisateur n'est pas obligé d'indiquer la variable `nameGET` dans l'url. Elle est facultative. 
                               
         exemple : `http://localhost:8080/greeting`.
         
         • **defaultValue="world":**
