# arris
# arris

# arris
# Application Web ArrisParis

Attention afin de lancer le projet correctement il est nécessaire d'effectuer certaines modifications.

Dans src/main/java/com.projet.arrisparis/ressources/application.properties

Dans un premier temps : 

Modifier : 

spring.datasource.username=root
spring.datasource.password=rootroot

Avec ses propres identifiants et mdp mysql


lancer l'application une première fois avec : 
spring.datasource.url=jdbc:mysql://Localhost:3306/ArrisData?createDatabaseIfNotExist=true

Cela permettra de créer la base de donée. 

Ensuite relancer l'application cette fois ci comme cela : 
spring.datasource.url=jdbc:mysql://Localhost:3306/ArrisData?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UCT


