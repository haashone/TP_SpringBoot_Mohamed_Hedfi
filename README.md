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
         
         • **required=false:** l'utilisateur n'est pas obligé d'indiquer la variable `nameGET` dans l'url. Elle est facultative. exemple : `http://localhost:8080/greeting`.
         
         • **defaultValue="world":** la valeur par défaut de la vairable `nameGET` est `world`.
         
      On peut passer le nom variable au modèle avec : `model.addAttribute("nomTemplate", nameGET)`.
      
   ## Étape 17
   La table `ADRESS` est créée automatiquement.
   
   ## Étape 18
   Explication l’apparition de la table `ADRESS`: utilisation de l'annotation `@Entity` dans la classe `Adress`.
   Indication de clef primaire de table : `@Id`.
   
   ## Étape 20
   La requête `SELECT *` en SQL, permet de lister les tuples que nous avons inséré dans le fichier `data.sql` 
   
   ## Étape 23 @Autowired
   L'annotation `@Autowired` permet l’injection de dépendances.
   Le conteneur Spring peut gérer automatiquement les relations entre les beans. C'est le **Spring bean autowiring**.
   
   ## Étape 26
   **Exemple**:
   ![alt text](https://github.com/haashone/TP_SpringBoot_Mohamed_Hedfi/blob/main/captures/table_adresse.PNG)

   ## Étape 28
   Création de fichier `navbar.html` et le placer dans `templates/fragments`.
   Utilisation de `<div th:insert="fragments/navbar :: navbar"></div>` dans les autres fichiers html pour insérer le navbar sans reécrire le code.
   
   Exemple:
   
   ```
   <body>
	<div th:insert="fragments/navbar :: navbar"></div>

	<div class="container" style="margin-top: 50px">
		<h2 th:text=" ' Adresse : ' + ${content} " />
		<div class="row">
			
			<div class="col-6">
				<h4 th:text=" '• Température : ' + ${temp} " />
			</div>
			
			<div class="col-6">
				<h4 th:text=" '• Humidité : ' + ${humidity} " />
				<h4 th:text=" '• Pression : ' + ${pressure} " />
				<h4 th:text=" '• TimeZone : ' + ${timeZone} " />

			</div>
		</div>
	</div>



</body>
   ```
   
 ## Étape 30 Bootstrap
 On peut insérer Bootstrap dans le projet à l'aide de **Content Delivery Network CDN**.
 
 • insertion des fichiers de style:
 ```
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
 ```
 • insertion de JavaScript:
  ```
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 ```
 • Exemple:
 ```
 <head>
      	  <title>Adresses</title>
		  <meta charset="utf-8"/>
		  <meta name="viewport" content="width=device-width, initial-scale=1"/>
		  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
		  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
		  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
      </head>
   <body>
   <div th:insert="fragments/navbar :: navbar"></div>
   
           <div class="container" style="margin-top:70px"> 
            <h2> Les differentes adresses </h2>
            <div class="row">
              
			
        <table class="table">
               <thead class="thead-light">
                <tr>
                    <th>Id</th>
                    <th>Content</th>
                    <th>Creation</th>
                    <th>Auteur</th>
                </tr>
               </thead>
                <tr th:each ="adresse : ${allAdresses}">
                    <td th:text="${adresse.id}">A Smoke Test'</td>
                	<td th:text="${adresse.content}">A Smoke Test'</td>
                	<td th:text="${adresse.creation}">A Smoke Test'</td>
                	<td th:text="${adresse.auteur}">A Smoke Test'</td>
                </tr>
            </table>
            
            </div>
           </div>
            
   </body>
 ```
