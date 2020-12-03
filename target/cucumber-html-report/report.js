$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("altran/CseAltranDemo.feature");
formatter.feature({
  "line": 2,
  "name": "Cse Altran",
  "description": "En tant que personnel Altran je souhaite voir les offres de la CSE",
  "id": "cse-altran",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@cseAltran"
    }
  ]
});
formatter.before({
  "duration": 10087578200,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Authentification - Cse Altran",
  "description": "",
  "id": "cse-altran;authentification---cse-altran",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@cnxCse"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "J ouvre l application CSE Altran",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Je saisie mon adresse email \"ridha.bouguerra@altran.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Je saisie mon mot de passe \"test1234A+\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Je clique sur le bouton Je m identifie",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Redirection vers la page Home",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#@chequeCadeaux"
    },
    {
      "line": 13,
      "value": "#Scenario: Mes cadeaux - Cse Altran"
    }
  ],
  "line": 14,
  "name": "Je clique sur Ticket Billetterie apres je clique sur J EN PROFITE de Parc Loisirs",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Je clique sur Avantages apres je clique sur Enveloppe2020",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Je clique sur parc et loisirs",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Je tape dans la barre de recherche \"zoo de vincennes\" et je clique sur le bouton rechercher",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Je clique une seule fois sur + pour ajouter un billet a mon choix Entrée Enfant3 à12 ans inclus",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Je clique deux fois sur + pour ajouter deux billets a mon choix Entrée Adulte13 ans et plus",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Je clique sur ajouter a mon panier",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Je clique sur voir mon panier",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Je clique sur l icone x a droite pour annuler mon premier choix et je confirme la suppression",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Je clique sur l icone x a droite pour annuler mon deuxieme choix et je confirme la suppression",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Je clique sur retournez au site CSE ALTRAN IDF",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Redirection vers la page Myclub",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 26,
      "value": "#@DecnxCse"
    },
    {
      "line": 27,
      "value": "#Scenario: Deconnexion - Cse Altran"
    }
  ],
  "line": 28,
  "name": "Je mets le curseur sur M. Ridha BOUGUERRA et je clique sur Se deconnecter",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Redirection vers la page d authentification",
  "keyword": "Then "
});
formatter.match({
  "location": "CseAltranDemoStepDefinition.jOuvreLApplicationCSEAltran()"
});
formatter.result({
  "duration": 1014034099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ridha.bouguerra@altran.com",
      "offset": 29
    }
  ],
  "location": "CseAltranDemoStepDefinition.jeSaisieMonAdresseEmail(String)"
});
formatter.result({
  "duration": 311598900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test1234A+",
      "offset": 28
    }
  ],
  "location": "CseAltranDemoStepDefinition.jeSaisieMonMotDePasse(String)"
});
formatter.result({
  "duration": 154580699,
  "status": "passed"
});
formatter.match({
  "location": "CseAltranDemoStepDefinition.jeCliqueSurLeButtonJeMIdentifie()"
});
formatter.result({
  "duration": 1888991100,
  "status": "passed"
});
formatter.match({
  "location": "CseAltranDemoStepDefinition.redirectionVersLaPageHome()"
});
formatter.result({
  "duration": 18530800,
  "status": "passed"
});
formatter.match({
  "location": "CseAltranDemoStepDefinition.jeCliqueSurTicketBilletterieapresjecliquesurJENPROFITEdeParcLoisirs()"
});
formatter.result({
  "duration": 7773515301,
  "status": "passed"
});
formatter.match({
  "location": "CseAltranDemoStepDefinition.JecliquesurAvantagesapresjeCliqueSurEnveloppe()"
});
formatter.result({
  "duration": 5840340500,
  "status": "passed"
});
formatter.match({
  "location": "CseAltranDemoStepDefinition.jeCliqueSurParcEtLoisirs()"
});
formatter.result({
  "duration": 2712034500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "zoo de vincennes",
      "offset": 36
    }
  ],
  "location": "CseAltranDemoStepDefinition.jeTapeDansLaBarreDeRechercheEtJeCliqueSurLeBouttonRechercher(String)"
});
formatter.result({
  "duration": 4925433500,
  "status": "passed"
});
formatter.match({
  "location": "CseAltranDemoStepDefinition.jeCliqueUneSeuleFoisSurPourAjouterUnBilletAMonChoixEntréeEnfantÀAnsInclus()"
});
formatter.result({
  "duration": 2512888599,
  "status": "passed"
});
formatter.match({
  "location": "CseAltranDemoStepDefinition.jeCliqueDeuxFoisSurPourAjouterDeuxBilletsAMonChoixEntréeAdulteAnsEtPlus()"
});
formatter.result({
  "duration": 4461707200,
  "status": "passed"
});
formatter.match({
  "location": "CseAltranDemoStepDefinition.jeCliqueSurAjouterAMonPanier()"
});
formatter.result({
  "duration": 185731699,
  "status": "passed"
});
formatter.match({
  "location": "CseAltranDemoStepDefinition.jeCliqueSurVoirMonPanier()"
});
formatter.result({
  "duration": 3963948300,
  "status": "passed"
});
formatter.match({
  "location": "CseAltranDemoStepDefinition.jeCliqueSurLIconeXADroitePourAnnulerMonPremierChoixEtJeConfirmeLaSuppression()"
});
formatter.result({
  "duration": 2697221299,
  "status": "passed"
});
formatter.match({
  "location": "CseAltranDemoStepDefinition.jeCliqueSurLIconeXADroitePourAnnulerMonDeuxiemeChoixEtJeConfirmeLaSuppression()"
});
formatter.result({
  "duration": 4415524400,
  "status": "passed"
});
formatter.match({
  "location": "CseAltranDemoStepDefinition.jeCliqueSurRetournezAuSiteCSEALTRANIDF()"
});
formatter.result({
  "duration": 3134215100,
  "status": "passed"
});
formatter.match({
  "location": "CseAltranDemoStepDefinition.redirectionVersLaPageMyclub()"
});
formatter.result({
  "duration": 31982600,
  "status": "passed"
});
formatter.match({
  "location": "CseAltranDemoStepDefinition.jeMetsLeCurseurSurMRidhaBOUGUERRAEtJeCliqueSurSeDeconnecter()"
});
formatter.result({
  "duration": 2915512900,
  "status": "passed"
});
formatter.match({
  "location": "CseAltranDemoStepDefinition.redirectionVersLaPageDAuthentification()"
});
formatter.result({
  "duration": 22834901,
  "status": "passed"
});
formatter.after({
  "duration": 181099,
  "status": "passed"
});
});