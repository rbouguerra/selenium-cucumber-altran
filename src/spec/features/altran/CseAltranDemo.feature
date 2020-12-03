@cseAltran
Feature: Cse Altran
  En tant que personnel Altran je souhaite voir les offres de la CSE

  @cnxCse
  Scenario: Authentification - Cse Altran
    Given J ouvre l application CSE Altran
    When Je saisie mon adresse email "ridha.bouguerra@altran.com"
    And Je saisie mon mot de passe "test1234A+"
    And Je clique sur le bouton Je m identifie
    Then Redirection vers la page Home
    #@chequeCadeaux
    #Scenario: Mes cadeaux - Cse Altran
    When Je clique sur Ticket Billetterie apres je clique sur J EN PROFITE de Parc Loisirs
    And Je clique sur Avantages apres je clique sur Enveloppe2020
    And Je clique sur parc et loisirs
    And Je tape dans la barre de recherche "zoo de vincennes" et je clique sur le bouton rechercher
    And Je clique une seule fois sur + pour ajouter un billet a mon choix Entrée Enfant3 à12 ans inclus
    And Je clique deux fois sur + pour ajouter deux billets a mon choix Entrée Adulte13 ans et plus
    And Je clique sur ajouter a mon panier
    And Je clique sur voir mon panier
    And Je clique sur l icone x a droite pour annuler mon premier choix et je confirme la suppression
    And Je clique sur l icone x a droite pour annuler mon deuxieme choix et je confirme la suppression
    And Je clique sur retournez au site CSE ALTRAN IDF
    Then Redirection vers la page Myclub
    #@DecnxCse
    #Scenario: Deconnexion - Cse Altran
    And Je mets le curseur sur M. Ridha BOUGUERRA et je clique sur Se deconnecter
    Then Redirection vers la page d authentification
