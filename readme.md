# On joue à cache cache avec Spring Boot

En tant que développeur, nous sommes très souvent confrontés à des problèmes de performance dans nos applications.

Bon, comme tout développeur, ces mauvaises performances sont toujours liés à l'infrastructure qui n'est pas assez performante et pas à notre code qui est le meilleur code du monde :)

Comment fonctionne la majorité des applications ? On a du code source qui va récupérer des données dans une base de données, effectuer un ou plusieurs traitement ou calcul et renvoyer le résultat à un utilisateur.

C'est un peu brut, prennons un exemple : Un site de vente en ligne et l'affichage d'une page d'un produit. Comment cela fonctionne dans la majorité des cas : 

- Un visiteur du site veut afficher le produit
- On va lancer une requête pour récupérer les données du produits
- On va lancer une seconde requête pour voir si le produit est en stock
- Ensuite on va récupérer les images du produit
- Notre produit est surement le meilleurs du monde et nous allons donc le mettre en avant avec des commentaires positifs donc on va lancer des requpetes pour récupérer ces commentaires et les noms des personnes qui ont déposés les commentaires
- Nous allons peut être aussi devoir faire appel à un service externe pour récupérer par exemple le délai de livraison du produit
- Une fois que nous avons toutes ces données, nous allons générer la page HTML / CSS et l'afficher à notre visiteur

Arrive maintenant un 2e visiteur sur notre site, qui va afficher le même produit. Nous allons donc relancer tout le traitemant précédant. Et pareil pour les milliers de visiteurs suivants et au bout d'un moment la base de données ne suivra plus.

(Bon ok mon exemple n'est pas pertinent car en toute logique dans ce cas la base de données ne lancera pas milles fois la requête, elle conservera les données en mémoire ...)

Au final entre chaque visiteur quelles sont les données qui sont susceptibles d'être modifiée entre chaque affichage ? Peut être le stock du produit ? 

Dans toute application il faut se poser la question de savoir à quelle fréquence les données vont être mise à jour et à quelle fréquence notre application va devoir interoger la base de données.

Spring Boot propose un mécanisme de cache permettant au développer de paramétrer comment les données sont récupéréers : 

- Est ce qu'on recupère les données précédantes ?
- Est ce qu'on recalcule les données ?

## Création du projet



