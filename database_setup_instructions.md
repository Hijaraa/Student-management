# Instructions pour créer la base de données dans IntelliJ

## Analyse du fichier application.properties

D'après le fichier `application.properties`, voici les informations de configuration de la base de données :

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb?serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=1234
spring.jpa.hibernate.ddl-auto=update
```

Ces paramètres indiquent que :
- Le SGBD utilisé est MySQL
- Le nom de la base de données est `studentdb`
- L'hôte est `localhost` sur le port `3306`
- L'utilisateur est `root` avec le mot de passe `1234`
- Hibernate est configuré pour mettre à jour automatiquement le schéma de la base de données

## Structure de la base de données

D'après l'entité `Student`, la table principale aura la structure suivante :

| Colonne        | Type      | Contraintes       |
|----------------|-----------|-------------------|
| id             | INT       | PK, AUTO_INCREMENT|
| nom            | VARCHAR   |                   |
| prenom         | VARCHAR   |                   |
| date_naissance | DATE      |                   |

## Étapes pour créer la base de données dans IntelliJ

### 1. Installer MySQL (si ce n'est pas déjà fait)

1. Téléchargez et installez MySQL depuis [le site officiel](https://dev.mysql.com/downloads/installer/)
2. Lors de l'installation, définissez le mot de passe pour l'utilisateur `root` à `1234` (comme spécifié dans application.properties)
3. Assurez-vous que le service MySQL est en cours d'exécution

### 2. Configurer la connexion à la base de données dans IntelliJ

1. Ouvrez votre projet dans IntelliJ IDEA
2. Cliquez sur l'onglet "Database" situé sur le bord droit de l'IDE (ou allez dans View > Tool Windows > Database)
3. Cliquez sur le symbole "+" puis sélectionnez "Data Source" > "MySQL"
4. Dans la fenêtre de configuration qui s'ouvre, renseignez les informations suivantes :
   - Name: studentdb
   - Host: localhost
   - Port: 3306
   - User: root
   - Password: 1234
5. Cliquez sur "Test Connection" pour vérifier que la connexion fonctionne
6. Si un message indique qu'il manque des drivers, cliquez sur "Download" pour les installer
7. Cliquez sur "OK" pour sauvegarder la configuration

### 3. Créer la base de données

1. Dans l'onglet "Database", faites un clic droit sur la connexion MySQL que vous venez de créer
2. Sélectionnez "New" > "Database"
3. Entrez `studentdb` comme nom de la base de données
4. Cliquez sur "OK"

### 4. Créer la table manuellement (optionnel)

Normalement, avec `spring.jpa.hibernate.ddl-auto=update`, Hibernate créera automatiquement les tables nécessaires au démarrage de l'application. Cependant, si vous souhaitez créer la table manuellement :

1. Dans l'onglet "Database", faites un clic droit sur la base de données `studentdb`
2. Sélectionnez "New" > "Query Console"
3. Entrez le script SQL suivant :

```sql
CREATE TABLE IF NOT EXISTS student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255),
    prenom VARCHAR(255),
    date_naissance DATE
);
```

4. Exécutez le script en cliquant sur le bouton "Run" (icône de lecture verte)

### 5. Vérifier la configuration

1. Lancez votre application Spring Boot
2. Vérifiez dans les logs que la connexion à la base de données s'établit correctement
3. Dans l'onglet "Database" d'IntelliJ, vous pouvez rafraîchir la vue de la base de données pour voir la table `student` créée par Hibernate

## Remarques importantes

- Si vous avez des problèmes de connexion, vérifiez que le service MySQL est bien démarré
- Assurez-vous que le port 3306 n'est pas bloqué par un pare-feu
- Si vous utilisez un autre utilisateur que `root`, assurez-vous qu'il a les droits nécessaires sur la base de données `studentdb`
- La configuration `spring.jpa.hibernate.ddl-auto=update` permet à Hibernate de mettre à jour automatiquement le schéma de la base de données en fonction des entités définies dans votre application