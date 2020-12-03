package com.e2eTest.altran.cseAltran.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CseAltranDemoPage {

	WebDriver driver;

	public CseAltranDemoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	final static String USER_NAME_ID = "authentication_login";
	final static String PWD_NAME_ID = "authentication_password";
	final static String BOUTON_CNX_XPATH = "//button[contains(text(),\"Je m'identifie\")]"; // Français

	// TODO - REFACTOR SELECTOR
	final static String TICKET_XPATH = "//*[@id=\"bloc3\"]/div/div/a/span/img";
	final static String TAKE_ADVANTAGE_XPATH = "//*[@id=\"premierBloc\"]/div/div[1]/div[1]/div/div[2]/div/div/a/span[2]";
	final static String BENEFITS_XPATH = "//i[@class='mk-icon mk-icon-star mk-pad-b-xs']";
	final static String ENVELOPE_2020_XPATH = "//a[@class='mk-btn mk-btn--highlight mk-btn--small mk-btn--icon mk-btn--card-text']";
	final static String PARK_AND_LEISURE_XPATH = "//*[@id=\"ajax_check_user\"]/main/div[2]/div/div[1]/div[1]/div/div[2]/a";
	final static String SEARCH_ID = "header_search_form_search_capture";
	final static String BUTTON_SEARCH_XPATH = "//i[@class='mk-icon mk-icon-search']";

	final static String BUTTON_ADD_FIRST_CHOICE_XPATH = "//button[@class='qty-inc']";
	final static String BUTTON_ADD_SECOND_CHOICE_XPATH = "//*[@id=\"ligne-tarif-1684785\"]/div[3]/button[2]";
	final static String BUTTON_ADD_BASKET_ID = "btn_ajout_";

	final static String SEE_MY_BASKET_XPATH = "//a[@class='btn-achat mc-ficheProduit-popin-panier-body-btnPanier']";
	final static String DELETE_FIRST_CHOICE_XPATH = "//a[@data-toggle='modal']";
	final static String DELETE_SECOND_CHOICE_XPATH = "//a[@data-toggle='modal']";
	final static String CONFIRM_DELETE_BUTTON_ID = "cleProduitASupprimer";

	final static String CLICK_CSE_ALTRAN_IDF_XPATH = "//a[@title='Retournez au site CSE ALTRAN IDF']"; //"//a[@href='https://www.csealtranidf.com/']";
	final static String NAME_USER_ALTRAN_XPATH = "//a[@class='dropdown-toggle has-submenu']";
	final static String SIGN_OUT_LINK_TEXT = "Se déconnecter"; // "//a[@href='https://www.csealtranidf.com/disconnect.php']"
	
	/* @FindBy */
	@FindBy(how = How.ID, using = USER_NAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = PWD_NAME_ID)
	public static WebElement password;
	@FindBy(how = How.XPATH, using = BOUTON_CNX_XPATH)
	public static WebElement btnCnx;

	@FindBy(how = How.XPATH, using = TICKET_XPATH)
	public static WebElement ticket;
	@FindBy(how = How.XPATH, using = TAKE_ADVANTAGE_XPATH)
	public static WebElement takeAdvantage;
	@FindBy(how = How.XPATH, using = BENEFITS_XPATH)
	public static WebElement benefits;
	@FindBy(how = How.XPATH, using = ENVELOPE_2020_XPATH)
	public static WebElement envelope2020;
	@FindBy(how = How.XPATH, using = PARK_AND_LEISURE_XPATH)
	public static WebElement parkAndLeisure;
	@FindBy(how = How.ID, using = SEARCH_ID)
	public static WebElement search;
	@FindBy(how = How.XPATH, using = BUTTON_SEARCH_XPATH)
	public static WebElement buttonSearch;

	@FindBy(how = How.XPATH, using = BUTTON_ADD_FIRST_CHOICE_XPATH)
	public static WebElement buttonAddFirstChoise;
	@FindBy(how = How.XPATH, using = BUTTON_ADD_SECOND_CHOICE_XPATH)
	public static WebElement buttonAddSecondChoise;
	@FindBy(how = How.ID, using = BUTTON_ADD_BASKET_ID)
	public static WebElement buttonAddBasket;

	@FindBy(how = How.XPATH, using = SEE_MY_BASKET_XPATH)
	public static WebElement seeMyBasket;
	@FindBy(how = How.XPATH, using = DELETE_FIRST_CHOICE_XPATH)
	public static WebElement deleteFirstChoise;
	@FindBy(how = How.XPATH, using = DELETE_SECOND_CHOICE_XPATH)
	public static WebElement deleteSecondChoise;
	@FindBy(how = How.ID, using = CONFIRM_DELETE_BUTTON_ID)
	public static WebElement confirmDeleteButton;

	@FindBy(how = How.XPATH, using = CLICK_CSE_ALTRAN_IDF_XPATH)
	public static WebElement clickCseAltranIdf;
	@FindBy(how = How.XPATH, using = NAME_USER_ALTRAN_XPATH)
	public static WebElement nameUserAltran;
	@FindBy(how = How.LINK_TEXT, using = SIGN_OUT_LINK_TEXT)
	public static WebElement signOut;
}
