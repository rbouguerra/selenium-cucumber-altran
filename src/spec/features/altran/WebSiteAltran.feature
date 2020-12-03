@siteWebAltran
Feature: Site Web - Altran
  En tant que utilisateur je veux postuler ma candidature à un poste

  @postulerMaintenant
  Scenario Outline: Site Web - Altran
    Given J ouvre le site web Altran
    When Je clique sur postulez maintenant
    Then Redirection vers la page postuler maintenant
    #OFFRE
    When Je clique sur une offre après je clique sur postuler maintenant
    When Je clique sur le lien remplissez manuellement votre profil pour rejoindre nos Talents
    Then Redirection vers la page de profil pour la remplir
    #INFORMATIONS DE BASE
    When Je clique sur la case a cocher je ne suis pas un robot
    And Je selectionne le titre "<titre>"
    And Je saisis le nom "<nom>" le prenom "<prenom>" et l email "<email>"
    #ADRESSE
    When Je saisis l adresse "<adresse>" le complement d adresse "<compladresse>" le code postal "<cdpostal>" et la ville "<ville>"
    And Je selectionne le pays "<pays>" et la region "<region>"
    And Je saisis le numero de telephone fixe "<telfixe>" et le numero de telephone portable "<telmobile>"
    #Joindre un CV en français
    When Je clique sur parcourir pour joindre mon CV
    #INFORMATIONS PERSONNELLES
    When Je saisis la date de naissance "<dtnaissance>"
    And Je selectionne le nombre d annee d experience "<nbranexpr>" et la nationalite "<nationalite>"
    #SECTEUR
    When Je clique sur le bouton ajouter un secteur
    And Je selectionne un secteur
    #EXPÉRIENCES PROFESSIONNELLES
    When Je clique sur le bouton ajouter experience
    And Je saisis le nom d entreprise "<nomentreprise>" , le poste "<poste>" et la date de debut d experience "<dtdebexp>"
    And Je selectionne le pays "<paysexpr>" et je saisis la date de fin d experience "<dtfinexp>"
    And Je clique sur encore en poste
    And je saisis la description de poste "<descposte>"
    #SOUHAITS D'ÉVOLUTION & PRÉAVIS
    When Je saisis le type de poste souhaite "<typeposte>" et je selectionne le type de contrat souhaite "<typecontrat>"
    And Je saisis la date de disponibilite "<dtdispo>" et je selectionne le preavis "<preavis>"
    #COMPÉTENCES CLÉS ET MAITRISE D'OUTILS
    When Je saisis les compétences "<competences>" et les outils "<outils>"
    #FORMATION
    When Je clique sur ajouter formation
    And Je selectionne le pays d etude "<paysetude>" je saisis l etablissement d enseignement "<etabenseign>" et je selectionne le niveau de diplome "<niveaudiplome>"
    And Je clique sur oui de Diplome et je saisis l annee de diplome "<anneediplome>"
    #LANGUES MAÎTRISÉES
    When Je selectionne la langue maternelle "<langmater>" et autres langues "<autrelang>"
    And Je clique sur selectionner et je choisie les niveaux des langues "<niveaulang>"
    #RÉMUNÉRATION
    When Je clique sur ajouter remuneration
    And Je saisis le salaire fixe actuel "<salfixeactuel>" et le salaire fixe souhaite "<salfixesouhaite>"
    #INFORMATIONS COMPLÉMENTAIRES
    When Je clique sur parcourir pour joindre ma lettre de motivation
    #MÉDIAS SOCIAUX
    When Je saisis le nom de mon compte skype "<cpteskype>"
    Then Je clique sur la case à cocher de la politique de confidentialite

    Examples: 
      | titre | nom       | prenom | email                    | adresse                   | compladresse       | cdpostal | ville                 | pays   | region        | telfixe    | telmobile    | dtnaissance | nbranexpr | nationalite | secteur         | nomentreprise       | poste                           | dtdebexp   | paysexpr | dtfinexp   | descposte                                                | typeposte    | typecontrat       | dtdispo    | preavis | competences                                                                                            | outils                                       | paysetude | etabenseign                                      | niveaudiplome     | anneediplome | langmater | autrelang | niveaulang    | salfixeactuel | salfixesouhaite | cpteskype       |
      | M.    | BOUGUERRA | Ridha  | bouguerraridha@gmail.com | 1 rue de la vieille butte | Residence Eldorado |    78100 | Saint-Germain-En-Laye | France | Ile de France | 0151525354 | +33665458439 | 07/04/1983  | 5 à 10    | Tunisienne  | TELECOM & MEDIA | Altran Technologies | Ingenieur de test et validation | 27/01/2020 | France   | 22/10/2020 | Verification et validation des flux entrants et sortants | Automaticien | CDI [Temps plein] | 01/12/2020 | 1 mois  | Elaboration des stratégies,  rédaction de plan de test, exécution des tests et Détection des anomalies | Selenium, Jenkins, HP ALM, Squash TM, Mantis | France    | ESIEA - Grande école d'ingénieurs Ivry-sur-Seine | Ecole d'Ingénieur |         2009 | Français  | Anglais   | Intermédiaire |         36000 |           43000 | Ridha Bouguerra |
