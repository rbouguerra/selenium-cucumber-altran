package com.e2eTest.altran.webSiteAltran.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.altran.util.CommonMethods;
import com.e2eTest.altran.util.Setup;
import com.e2eTest.altran.webSiteAltran.pageObjects.WebSiteAltranPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebSiteAltranStepDefinition extends CommonMethods {

	WebDriver driver;

	private CommonMethods commonMethods = new CommonMethods();
	private WebSiteAltranPage webSiteAltranPage = new WebSiteAltranPage(driver);

	public WebSiteAltranStepDefinition() {
		driver = Setup.driver;
	}

	@Given("^J ouvre le site web Altran$")
	public void jOuvreLeSiteWebAltran() throws Throwable {

		commonMethods.readUrlFromConfigFile();
		logger.info("J ouvre le site web Altran");
	}

	@When("^Je clique sur postulez maintenant$")
	public void jeCliqueSurPostulezMaintenant() throws Throwable {

		PageFactory.initElements(driver, WebSiteAltranPage.class);
		commonMethods.windowScroll("window.scrollBy(0,900)");
		commonMethods.click(WebSiteAltranPage.firstApplyNow);
		logger.info("Je clique sur postulez maintenant");
	}

	@Then("^Redirection vers la page postuler maintenant$")
	public void redirectionVersLaPagePostulerMaintenant() throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.asserTrueGetTitle("Altran Carrière : Postulez dès maintenant ! - Altran");
		driver.switchTo().parentFrame();
		logger.info("Redirection vers la page postuler maintenant");
	}

	@When("^Je clique sur une offre après je clique sur postuler maintenant$")
	public void jeCliqueSurUneOffreAprèsJeCliqueSurPostulerMaintenant() throws Throwable {

		Thread.sleep(2000);
		commonMethods.windowScroll("window.scrollBy(0,700)");
		driver.switchTo().frame("apply_now_iframe");

		// commonMethods.click(WebSiteAltranPage.nameOfPost);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"UL_JOB_LIST\"]/li[1]/div/a"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

		Thread.sleep(2000);
		commonMethods.click(WebSiteAltranPage.secondApplyNow);
		driver.switchTo().parentFrame();
		logger.info("Je clique sur une offre après je clique sur postuler maintenant");
	}
	
	@When("^Je clique sur le lien remplissez manuellement votre profil pour rejoindre nos Talents$")
	public void jeCliqueSurLeLienRemplissezManuellementVotreProfilPourRejoindreNosTalents() throws Throwable {

		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,600)", "");
		driver.switchTo().frame("apply_now_iframe");

		WebElement element = driver.findElement(By.xpath("//*[@id=\"TM_LOGINFRAME_HAVE_CV_V1\"]/a"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

		driver.switchTo().parentFrame();
		logger.info("Je clique sur le lien Option 3 – Remplissez manuellement votre profil pour rejoindre nos Talents");
	}

	@Then("^Redirection vers la page de profil pour la remplir$")
	public void redirectionVersLaPageDeProfilPourLaRemplir() throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.asserTrueGetTitle("Altran Carrière : Postulez dès maintenant ! - Altran");
		driver.switchTo().parentFrame();
		logger.info("Redirection vers la page de profil pour la remplir");
	}

	@When("^Je clique sur la case a cocher je ne suis pas un robot$")
	public void jeCliqueSurLaCaseACocherJeNeSuisPasUnRobot() throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.click(WebSiteAltranPage.robot);
		driver.switchTo().parentFrame();
		logger.info("Je clique sur la case a cocher je ne suis pas un robot");
	}

	@When("^Je selectionne le titre \"([^\"]*)\"$")
	public void jeSelectionneLeTitre(String title) throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.selectText(WebSiteAltranPage.title, title);
		driver.switchTo().parentFrame();
		logger.info("Je selectionne le titre");
	}

	@When("^Je saisis le nom \"([^\"]*)\" le prenom \"([^\"]*)\" et l email \"([^\"]*)\"$")
	public void jeSaisisLeNomLePrenomEtLEmail(String lastName, String firstName, String email) throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.sendKeysText(WebSiteAltranPage.lastName, lastName);
		commonMethods.sendKeysText(WebSiteAltranPage.firstName, firstName);
		commonMethods.sendKeysText(WebSiteAltranPage.email, email);
		driver.switchTo().parentFrame();
		logger.info("Je saisis le nom, le prenom et l email");
	}

	@When("^Je saisis l adresse \"([^\"]*)\" le complement d adresse \"([^\"]*)\" le code postal \"([^\"]*)\" et la ville \"([^\"]*)\"$")
	public void jeSaisisLAdresseLeComplementDAdresseLeCodePostalEtLaVille(String adress, String additionalAdress,
			String postalCode, String city) throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.sendKeysText(WebSiteAltranPage.adress, adress);
		commonMethods.sendKeysText(WebSiteAltranPage.additionalAdress, additionalAdress);
		commonMethods.sendKeysText(WebSiteAltranPage.postalCode, postalCode);
		commonMethods.sendKeysText(WebSiteAltranPage.city, city);
		driver.switchTo().parentFrame();
		logger.info("Je saisis l adresse, le complement, d adresse, le code postal et la ville");
	}

	@When("^Je selectionne le pays \"([^\"]*)\" et la region \"([^\"]*)\"$")
	public void jeSelectionneLePaysEtLaRegion(String country, String region) throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.selectText(WebSiteAltranPage.country, country);
		Thread.sleep(1000);
		commonMethods.selectText(WebSiteAltranPage.region, region);
		driver.switchTo().parentFrame();
		logger.info("Je selectionne le pays et la region");
	}

	@When("^Je saisis le numero de telephone fixe \"([^\"]*)\" et le numero de telephone portable \"([^\"]*)\"$")
	public void jeSaisisLeNumeroDeTelephoneFixeEtLeNumeroDeTelephonePortable(String phone, String cellPhone)
			throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.sendKeysText(WebSiteAltranPage.phone, phone);
		commonMethods.sendKeysText(WebSiteAltranPage.cellPhone, cellPhone);
		driver.switchTo().parentFrame();
		logger.info("Je saisis le numero de telephone fixe et le numero de telephone portable");
	}

	@When("^Je clique sur parcourir pour joindre mon CV$")
	public void jeCliqueSurParcourirPourJoindreMonCV() throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		String path = "E:\\ALTRAN\\DOSSIER DE COMPETENCES BOUGUERRA Ridha_.pdf";
		commonMethods.sendKeysText(WebSiteAltranPage.browseButtonCv, path);
		driver.switchTo().parentFrame();
		logger.info("Je clique sur parcourir pour joindre mon CV");
	}

	@When("^Je saisis la date de naissance \"([^\"]*)\"$")
	public void jeSaisisLaDateDeNaissance(String dateOfBirth) throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.sendKeysText(WebSiteAltranPage.dateOfBirth, dateOfBirth);
		driver.switchTo().parentFrame();
		logger.info("Je saisis la date de naissance");
	}

	@When("^Je selectionne le nombre d annee d experience \"([^\"]*)\" et la nationalite \"([^\"]*)\"$")
	public void jeSelectionneLeNombreDAnneeDExperienceEtLaNationalite(String numberOfYearsOfExpr, String nationality)
			throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.selectText(WebSiteAltranPage.numberOfYearsOfExpr, numberOfYearsOfExpr);
		commonMethods.selectText(WebSiteAltranPage.nationality, nationality);
		driver.switchTo().parentFrame();
		logger.info("Je selectionne le nombre d annee d experience et la nationalite");
	}

	@When("^Je clique sur le bouton ajouter un secteur$")
	public void jeCliqueSurLeBoutonAjouterUnSecteur() throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.click(WebSiteAltranPage.buttonAddSector);
		driver.switchTo().parentFrame();
		logger.info("Je clique sur le bouton ajouter un secteur");
	}

	@When("^Je selectionne un secteur$")
	public void jeSelectionneUnSecteur() throws Throwable {

		//commonMethods.selectText(WebSiteAltranPage.sector, sector);
		Thread.sleep(2000);
		driver.switchTo().frame("apply_now_iframe");
		webSiteAltranPage.selectSector();
		driver.switchTo().parentFrame();
		logger.info("Je selectionne un secteur");
	}

	@When("^Je clique sur le bouton ajouter experience$")
	public void jeCliqueSurLeBoutonAjouterExperience() throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.click(WebSiteAltranPage.buttonAddExpr);
		driver.switchTo().parentFrame();
		logger.info("Je clique sur le bouton ajouter experience");
	}

	@When("^Je saisis le nom d entreprise \"([^\"]*)\" , le poste \"([^\"]*)\" et la date de debut d experience \"([^\"]*)\"$")
	public void jeSaisisLeNomDEntrepriseLePosteLaDateDeDebutDExperience(String nameCompany, String post,
			String startDate) throws Throwable {

		Thread.sleep(2000);
		driver.switchTo().frame("apply_now_iframe");
		commonMethods.sendKeysText(WebSiteAltranPage.nameCompany, nameCompany);
		commonMethods.sendKeysText(WebSiteAltranPage.post, post);
		commonMethods.sendKeysText(WebSiteAltranPage.startDate, startDate);
		driver.switchTo().parentFrame();
		logger.info("Je saisis le nom d entreprise, le poste et la date de debut d experience");
	}

	@When("^Je selectionne le pays \"([^\"]*)\" et je saisis la date de fin d experience \"([^\"]*)\"$")
	public void jeSelectionneLePaysEtJeSaisisLaDateDeFinDExperience(String countryExpr, String endDateExpr)
			throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.selectText(WebSiteAltranPage.countryExpr, countryExpr);
		commonMethods.sendKeysText(WebSiteAltranPage.endDateExpr, endDateExpr);
		driver.switchTo().parentFrame();
		logger.info("Je selectionne le pays et je saisis la date de fin d experience");
	}

	@When("^Je clique sur encore en poste$")
	public void jeCliqueSurEncoreEnPoste() throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.click(WebSiteAltranPage.stillInPosition);
		driver.switchTo().parentFrame();
		logger.info("Je clique sur encore en poste");
	}

	@When("^je saisis la description de poste \"([^\"]*)\"$")
	public void jeSaisisLaDescriptionDePoste(String jobSpec) throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.sendKeysText(WebSiteAltranPage.jobSpec, jobSpec);
		driver.switchTo().parentFrame();
		logger.info("je saisis la description de poste");
	}

	@When("^Je saisis le type de poste souhaite \"([^\"]*)\" et je selectionne le type de contrat souhaite \"([^\"]*)\"$")
	public void jeSaisisLeTypeDePosteSouhaiteEtJeSelectionneLeTypeDeContratSouhaite(String desiredPosition,
			String typeOfContrat) throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.sendKeysText(WebSiteAltranPage.desiredPosition, desiredPosition);
		commonMethods.selectText(WebSiteAltranPage.typeOfContrat, typeOfContrat);
		driver.switchTo().parentFrame();
		logger.info("Je saisis le type de poste souhaite et je selectionne le type de contrat souhaite");
	}

	@When("^Je saisis la date de disponibilite \"([^\"]*)\" et je selectionne le preavis \"([^\"]*)\"$")
	public void jeSaisisLaDateDeDisponibiliteEtJeSelectionneLePreavis(String availabilityDt, String priorNotice)
			throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.sendKeysText(WebSiteAltranPage.availabilityDt, availabilityDt);
		commonMethods.selectText(WebSiteAltranPage.priorNotice, priorNotice);
		driver.switchTo().parentFrame();
		logger.info("Je saisis la date de disponibilite et je selectionne le preavis");
	}
	
	@When("^Je saisis les compétences \"([^\"]*)\" et les outils \"([^\"]*)\"$")
	public void jeSaisisLesCompétencesEtLesOutils(String skills, String tools)
			throws Throwable {
		
		driver.switchTo().frame("apply_now_iframe");
		commonMethods.sendKeysText(WebSiteAltranPage.skills, skills);
		commonMethods.sendKeysText(WebSiteAltranPage.tools, tools);
		driver.switchTo().parentFrame();
		logger.info("Je saisis les compétences et les outils");
	}

	@When("^Je clique sur ajouter formation$")
	public void jeCliqueSurAjouterFormation() throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.click(WebSiteAltranPage.addButtonTraining);
		driver.switchTo().parentFrame();
		logger.info("Je clique sur ajouter formation");
	}

	@When("^Je selectionne le pays d etude \"([^\"]*)\" je saisis l etablissement d enseignement \"([^\"]*)\" et je selectionne le niveau de diplome \"([^\"]*)\"$")
	public void jeSelectionneLePaysDEtudeJeSaisisLEtablissementDEnseignementEtJeSelectionneLeNiveauDeDiplome(
			String studyCountries, String educationalInstitution, String diplomaLevel) throws Throwable {

		Thread.sleep(1000);
		driver.switchTo().frame("apply_now_iframe");
		commonMethods.selectText(WebSiteAltranPage.studyCountries, studyCountries);
		Thread.sleep(2000);
		commonMethods.sendKeysText(WebSiteAltranPage.educationalInstitution, educationalInstitution);
		Thread.sleep(1000);
		commonMethods.selectText(WebSiteAltranPage.diplomaLevel, diplomaLevel);
		driver.switchTo().parentFrame();
		logger.info(
				"Je selectionne le pays d etude je saisis l etablissement d enseignement et je selectionne le niveau de diplome");
	}

	@When("^Je clique sur oui de Diplome et je saisis l annee de diplome \"([^\"]*)\"$")
	public void jeCliqueSurOuiDeDiplomeEtJeSaisisLAnneeDeDiplome(String diplomaYear) throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.click(WebSiteAltranPage.diploma);
		commonMethods.sendKeysText(WebSiteAltranPage.diplomaYear, diplomaYear);
		driver.switchTo().parentFrame();
		logger.info("Je clique sur oui de Diplome et je saisis l annee de diplome");
	}

	@When("^Je selectionne la langue maternelle \"([^\"]*)\" et autres langues \"([^\"]*)\"$")
	public void jeSelectionneLaLangueMaternelleEtAutresLangues(String motherTongue, String otherLanguage)
			throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.selectText(WebSiteAltranPage.motherTongue, motherTongue);
		commonMethods.selectText(WebSiteAltranPage.otherLanguage, otherLanguage);
		driver.switchTo().parentFrame();
		logger.info("Je selectionne la langue maternelle et autres langues");
	}

	@When("^Je clique sur selectionner et je choisie les niveaux des langues \"([^\"]*)\"$")
	public void jeCliqueSurSelectionnerEtJeChoisieLesNiveauxDesLangues(String languageLevels) throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.click(WebSiteAltranPage.selectButton);
		Thread.sleep(2000);
		commonMethods.selectText(WebSiteAltranPage.languageLevels, languageLevels);
		driver.switchTo().parentFrame();
		logger.info("Je clique sur selectionner et je choisie les niveaux des langues");
	}

	@When("^Je clique sur ajouter remuneration$")
	public void jeCliqueSurAjouterRemuneration() throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.click(WebSiteAltranPage.addRemuneration);
		driver.switchTo().parentFrame();
		logger.info("Je clique sur ajouter remuneration");
	}

	@When("^Je saisis le salaire fixe actuel \"([^\"]*)\" et le salaire fixe souhaite \"([^\"]*)\"$")
	public void jeSaisisLeSalaireFixeActuelEtLeSalaireFixeSouhaite(String fixedSalary, String desiredFixedSalary)
			throws Throwable {

		Thread.sleep(2000);
		driver.switchTo().frame("apply_now_iframe");
		commonMethods.sendKeysText(WebSiteAltranPage.fixedSalary, fixedSalary);
		commonMethods.sendKeysText(WebSiteAltranPage.desiredFixedSalary, desiredFixedSalary);
		driver.switchTo().parentFrame();
		logger.info("Je saisis le salaire fixe actuel et le salaire fixe souhaite");
	}

	@When("^Je clique sur parcourir pour joindre ma lettre de motivation$")
	public void jeCliqueSurParcourirPourJoindreMaLettreDeMotivation() throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		String path = "E:\\ALTRAN\\LettreDeMotivation.docx";
		commonMethods.sendKeysText(WebSiteAltranPage.attachAletterOfMotivation, path);
		driver.switchTo().parentFrame();
		logger.info("Je clique sur parcourir pour joindre ma lettre de motivation");
	}

	@When("^Je saisis le nom de mon compte skype \"([^\"]*)\"$")
	public void jeSaisisLeNomDeMonCompteSkype(String skype) throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.sendKeysText(WebSiteAltranPage.skype, skype);
		driver.switchTo().parentFrame();
		logger.info("Je saisis le nom de mon compte skype");
	}

	@Then("^Je clique sur la case à cocher de la politique de confidentialite$")
	public void jeCliqueSurLaCaseÀCocherDeLaPolitiqueDeConfidentialite() throws Throwable {

		driver.switchTo().frame("apply_now_iframe");
		commonMethods.click(WebSiteAltranPage.checkConfidentialite);
		driver.switchTo().parentFrame();
		logger.info("Je clique sur la case à cocher de la politique de confidentialite");
	}
}
