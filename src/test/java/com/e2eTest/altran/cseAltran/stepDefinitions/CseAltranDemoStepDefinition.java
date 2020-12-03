package com.e2eTest.altran.cseAltran.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.altran.cseAltran.pageObjects.CseAltranDemoPage;
import com.e2eTest.altran.util.CommonMethods;
import com.e2eTest.altran.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CseAltranDemoStepDefinition extends CommonMethods {

	public WebDriver driver;
	private CommonMethods commonMethods = new CommonMethods();

	public CseAltranDemoStepDefinition() {
		driver = Setup.driver;
	}

	@Given("^J ouvre l application CSE Altran$")
	public void jOuvreLApplicationCSEAltran() throws Throwable {

		commonMethods.readURLFromConfigFile("url");
		logger.info("J ouvre l application CSE Altran");
	}

	@When("^Je saisie mon adresse email \"([^\"]*)\"$")
	public void jeSaisieMonAdresseEmail(String email) throws Throwable {

		PageFactory.initElements(driver, CseAltranDemoPage.class);
		commonMethods.sendKeysText(CseAltranDemoPage.userName, email);
		logger.info("Je saisie mon adresse email");
	}

	@When("^Je saisie mon mot de passe \"([^\"]*)\"$")
	public void jeSaisieMonMotDePasse(String pwd) throws Throwable {

		commonMethods.sendKeysText(CseAltranDemoPage.password, pwd);
		logger.info("Je saisie mon mot de passe");
	}

	@When("^Je clique sur le bouton Je m identifie$")
	public void jeCliqueSurLeButtonJeMIdentifie() throws Throwable {

		commonMethods.click(CseAltranDemoPage.btnCnx);
		logger.info("Je clique sur le bouton Je m identifie");
	}

	@Then("^Redirection vers la page Home$")
	public void redirectionVersLaPageHome() throws Throwable {

		commonMethods.asserTrueGetTitle("Le CSE ALTRAN IDF");
		logger.info("Redirection vers la page Home");
	}

	@When("^Je clique sur Ticket Billetterie apres je clique sur J EN PROFITE de Parc Loisirs$")
	public void jeCliqueSurTicketBilletterieapresjecliquesurJENPROFITEdeParcLoisirs() throws Throwable {

		commonMethods.windowScroll("window.scrollBy(0,200)");
		commonMethods.click(CseAltranDemoPage.ticket);
		commonMethods.click(CseAltranDemoPage.takeAdvantage);
		logger.info("Je clique sur Ticket Billetterie apres je clique sur J EN PROFITE de Parc Loisirs");
	}

	@When("^Je clique sur Avantages apres je clique sur Enveloppe2020$")
	public void JecliquesurAvantagesapresjeCliqueSurEnveloppe() throws Throwable {

		commonMethods.click(CseAltranDemoPage.benefits);
		Thread.sleep(1000);
		commonMethods.windowScroll("window.scrollBy(0,330)");
		commonMethods.click(CseAltranDemoPage.envelope2020);
		logger.info("Je clique sur Avantages apres je clique sur Enveloppe 2020");
	}

	@When("^Je clique sur parc et loisirs$")
	public void jeCliqueSurParcEtLoisirs() throws Throwable {

		commonMethods.click(CseAltranDemoPage.parkAndLeisure);
		logger.info("Je clique sur parc et loisirs");
	}

	@When("^Je tape dans la barre de recherche \"([^\"]*)\" et je clique sur le bouton rechercher$")
	public void jeTapeDansLaBarreDeRechercheEtJeCliqueSurLeBouttonRechercher(String searchPark) throws Throwable {

		commonMethods.sendKeysText(CseAltranDemoPage.search, searchPark);
		Thread.sleep(2000);
		commonMethods.click(CseAltranDemoPage.buttonSearch);
		logger.info("Je tape dans la barre de recherche 'zoo de vincennes' et je clique sur le bouton rechercher");
	}

	@When("^Je clique une seule fois sur \\+ pour ajouter un billet a mon choix Entrée Enfant3 à12 ans inclus$")
	public void jeCliqueUneSeuleFoisSurPourAjouterUnBilletAMonChoixEntréeEnfantÀAnsInclus() throws Throwable {

		commonMethods.windowScroll("window.scrollBy(0,220)");
		commonMethods.click(CseAltranDemoPage.buttonAddFirstChoise);
		Thread.sleep(2000);
		logger.info("Je clique une seule fois sur + pour ajouter un billet a mon choix Entrée Enfant 3 à 12 ans inclus");
	}

	@When("^Je clique deux fois sur \\+ pour ajouter deux billets a mon choix Entrée Adulte13 ans et plus$")
	public void jeCliqueDeuxFoisSurPourAjouterDeuxBilletsAMonChoixEntréeAdulteAnsEtPlus() throws Throwable {

		commonMethods.click(CseAltranDemoPage.buttonAddSecondChoise);
		Thread.sleep(2000);
		commonMethods.click(CseAltranDemoPage.buttonAddSecondChoise);
		Thread.sleep(2000);
		logger.info("Je clique deux fois sur + pour ajouter deux billets a mon choix Entrée Adulte 13 ans et plus");
	}

	@When("^Je clique sur ajouter a mon panier$")
	public void jeCliqueSurAjouterAMonPanier() throws Throwable {

		commonMethods.click(CseAltranDemoPage.buttonAddBasket);
		logger.info("Je clique sur ajouter a mon panier");
	}

	@When("^Je clique sur voir mon panier$")
	public void jeCliqueSurVoirMonPanier() throws Throwable {

		Thread.sleep(2000);
		commonMethods.click(CseAltranDemoPage.seeMyBasket);
		logger.info("Je clique sur voir mon panier");
	}

	@When("^Je clique sur l icone x a droite pour annuler mon premier choix et je confirme la suppression$")
	public void jeCliqueSurLIconeXADroitePourAnnulerMonPremierChoixEtJeConfirmeLaSuppression() throws Throwable {

		commonMethods.windowScroll("window.scrollBy(0,200)");
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");
		commonMethods.click(CseAltranDemoPage.deleteFirstChoise);
		Thread.sleep(2000);
		commonMethods.click(CseAltranDemoPage.confirmDeleteButton);
		logger.info("Je clique sur l icone x a droite pour annuler mon premier choix et je confirme la suppression");
	}

	@When("^Je clique sur l icone x a droite pour annuler mon deuxieme choix et je confirme la suppression$")
	public void jeCliqueSurLIconeXADroitePourAnnulerMonDeuxiemeChoixEtJeConfirmeLaSuppression() throws Throwable {

		Thread.sleep(2000);
		commonMethods.windowScroll("window.scrollBy(0,180)");
		commonMethods.click(CseAltranDemoPage.deleteSecondChoise);
		Thread.sleep(2000);
		commonMethods.click(CseAltranDemoPage.confirmDeleteButton);
		logger.info("Je clique sur l icone x a droite pour annuler mon deuxieme choix et je confirme la suppression");
	}

	@When("^Je clique sur retournez au site CSE ALTRAN IDF$")
	public void jeCliqueSurRetournezAuSiteCSEALTRANIDF() throws Throwable {

		Thread.sleep(2000);
		commonMethods.click(CseAltranDemoPage.clickCseAltranIdf);
		// driver.close();
		logger.info("Je clique sur retournez au site CSE ALTRAN IDF");
	}

	@Then("^Redirection vers la page Myclub$")
	public void redirectionVersLaPageMyclub() throws Throwable {

		commonMethods.asserTrueGetTitle("Meyclub - Créateur de loisirs");
		logger.info("Redirection vers la page Myclub");
	}

	@When("^Je mets le curseur sur M\\. Ridha BOUGUERRA et je clique sur Se deconnecter$")
	public void jeMetsLeCurseurSurMRidhaBOUGUERRAEtJeCliqueSurSeDeconnecter() throws Throwable {

		commonMethods.windowHandle();
		commonMethods.mouse(CseAltranDemoPage.nameUserAltran);
		commonMethods.click(CseAltranDemoPage.signOut);
		// commonMethods.readTextFromConfigFile();
		logger.info("Je mets le curseur sur M. Ridha BOUGUERRA et je clique sur Se deconnecter");
	}

	@Then("^Redirection vers la page d authentification$")
	public void redirectionVersLaPageDAuthentification() throws Throwable {

		commonMethods.asserTrueGetTitle("Le CSE ALTRAN IDF - Identification");
		logger.info("Redirection vers la page d authentification");
	}
}
