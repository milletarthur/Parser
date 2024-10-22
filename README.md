Projet réalisé par 
 - Antonia Ivanova
 - Grégory Toureillle
 - Rémi Gaulmin
 - Arthur Millet
 - Pierre Bernard
 - [Samuel Lepin](https://github.com/samuellepin)

# État du projet au 6 décembre

Le `JavaProjet` qui vous est fourni, compile et est capable de parser le fichier `test/pass/a00.c`. 

## Organisation des fichiers

### 1. Le sujet est [ici](JavaProject/src/info3/parser/javacc/projet/langageC/sujet/README.md)

À lire avant de commencer...

### 2. Le répertoire `_code/` contient

#### Un parser en JavaCC à compléter

- `parser.jj`

#### Plusieurs fichiers Java à compléter `_code/`

Commencez par regarder
- `Algorithm.java` 
- `Tree.java` 
- `ITree.java`
- les autres classes seront à compléter au fur et à mesure de l'avancé de votre parser.

### 3. Les tests qui doivent passer sont dans `test/pass/`

avec un `Makefile` pour les activer avec la commande `make test`

### 4. Les répertoires

* `_code/` contiendra le code
* `test/pass/` contiendra les tests qui passent
* `test/fail/` contiendra les tests qui ne passent pas (parse error)
* `dot/` est le répertoire où le parser exporte le control flow graph au format `.DOT` pour les groupes qui visent ce niveau. Le répertoire `dot/` contient un `Makefile`  pour traduire les fichiers `.dot` en image `.jpg`


# À RENDRE pour le 25 janvier

## 1. Les sources dans le dépot git de votre groupe

Les sources que je récupèrerai via git doivent être compilables et exécutables.

## 2. La description de votre grammaire dans le fichier `sujet/ALGO_SYNTAX.md`

## 3. Des tests qui passent dans le répertoire `test/pass/`

À vous d'ajouter des tests qui démontrent les capacités de reconnaissance de votre parser.

## 4. Des tests qui échouent dans le répertoire `test/fail/`
