package com.e2eTest.altran.webSiteAltran.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WebSiteAltranPage {
	
	WebDriver driver;
	
	public WebSiteAltranPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	final static String FIRST_APPLY_NOW_XPATH = "/html[1]/body[1]/div[2]/div[2]/div[1]/section[1]/ul[1]/li[3]/div[1]/a[1]"; // *[@id="main-content"]/div[2]/div[1]/section/ul/li[3]/div/a
	final static String NAME_OF_POST_XPATH = "//*[@id=\\\"UL_JOB_LIST\\\"]/li[1]/div/a";
	final static String SECOND_APPLY_NOW_ID = "btnApply_top";
	
	final static String MANUALLY_FILL_XPATH = "//*[@id=\"TM_LOGINFRAME_HAVE_CV_V1\"]/a";  //"//a[@title='Option 3 – Remplissez manuellement votre profil pour rejoindre nos Talents']"; 
	
	final static String ROBOT_XPATH = "//body";
	final static String TITLE_XPATH = "//*[@id=\"df_fldFieldEMPGENDER\"]";
	final static String LAST_NAME_ID = "df_fldFieldEMPLASTNAME";
	final static String FIRST_NAME_ID = "df_fldFieldEMPFIRSTNAME";
	
	final static String EMAIL_ID = "df_fldFieldEMPEMAIL";
	final static String ADRESS_ID = "df_fldFieldEMPADDRESS";
	final static String ADDITIONAL_ADRESS_ID = "df_fldFieldEMPADDITIONINFO";
	final static String POSTAL_CODE_ID = "df_fldFieldEMPPOSTALCODE";
	final static String CITY_ID = "df_fldFieldEMPCITY";
	final static String COUNTRY_ID = "df_fldFieldEMPCOUNTRY";
	final static String REGION_ID = "df_fldFieldEMPPROVINCE";
	final static String PHONE_ID = "df_fldFieldEMPPHONE";
	final static String CELL_PHONE_ID = "df_fldFieldEMPCELLULAR";
	
	final static String BROWSE_BUTTON_CV_ID = "df_fldFieldINFOCVF";
	
	final static String DATE_OF_BIRTH_ID = "df_fldFieldINFOBIRTHDATE";
	final static String NUMBER_OF_YEARS_OF_EXPR_ID = "df_fldFieldDYNFIELDCOMBOBOX3";
	final static String NATIONALITY_XPATH = "//*[@id=\"df_fldFieldEMPCITIZEN_choices\"]";
	
	final static String BUTTON_ADD_SECTOR_ID = "DYN_ADD_EMPLOYEES_DYN_CAT_2";
	final static String SECTOR_ID = "df_fldFieldDYNFIELDCOMBOBOX1_1";
	
	final static String BUTTON_ADD_EXPR_ID = "DYN_ADD_WORKHIST_E";
	final static String NAME_COMPANY_XPATH = "//*[@id=\"df_fldFieldWORKEGROUP_1\"]";
	final static String POST_ID = "df_fldFieldWORKELASTPOS_1";
	final static String START_DATE_ID = "df_fldFieldWORKESTARTDATE_1";
	final static String COUNTRY_EXPERIENCE_ID = "df_fldFieldWORKECOUNTRYID_1";
	final static String END_DATE_EXPERIENCE_ID = "df_fldFieldWORKEENDDATE_1";
	final static String STILL_IN_POSITION_ID = "lbl_df_fldFieldWORKEMANAGEMENTLVL_1_1";
	final static String JOB_SPECIFICATION_ID = "df_fldFieldWORKEOTHERFUNC_1";
	
	final static String DESIRED_POSITION_ID = "df_fldFieldDYNFIELDTEXTAREA4";
	final static String TYPE_OF_CONTRACT_ID = "df_fldFieldDYNFIELDCOMBOBOX_SYSTEM6";
	final static String AVAILABILITY_DATE_ID = "df_fldFieldDYNFIELDDATE1";
	final static String PRIOR_NOTICE_ID = "df_fldFieldDYNFIELDCOMBOBOX2";
	
	final static String SKILLS_ID = "df_fldFieldDYNFIELDTEXTAREA1";
	final static String TOOLS_ID = "df_fldFieldDYNFIELDTEXTAREA2";
	
	final static String ADD_BUTTON_TRAINING_ID = "DYN_ADD_FORMAL";
	final static String STUDY_COUNTRIES_ID = "df_fldFieldGRADUATEDISCIPLINE_1";
	final static String EDUCATION_INSTITUTION_ID = "df_fldFieldGRADUATEDIPLOMA_1searchfield";
	final static String DIPLOMA_LEVEL_ID = "df_fldFieldGRADUATEDIPLOMALEVEL_1";
	final static String DIPLOMA_XPATH = "//*[@id=\"trGRADUATEGRADUATE_1\"]/div/div[2]/label[2]/span";
	final static String DIPLOMA_YEAR_ID = "df_fldFieldGRADUATECERTIFICATE_1";
	
	final static String MOTHER_TONGUE_ID = "fldNativeLanguage";
	final static String OTHER_LANGUAGE_ID = "fldLanguagesAdd";
	final static String SELECT_BUTTON_XPATH = "//*[@id=\"tdLanguages\"]/div[1]/div[2]/div[2]/div[2]/button";
	final static String LANGUAGE_LEVELS_ID = "fldGlobal_43";
	
	final static String ADD_REMUNERATION_ID = "DYN_ADD_REMUNERATIONS";
	final static String FIXED_SALARY_ID = "df_fldFieldMNREMREFCOUNTRYSALARY_1";
	final static String DESIRED_FIXED_SALARY_ID = "df_fldFieldMNREMMOBILITYPREMIUM_1";
	
	final static String ATTACH_A_LETTER_OF_MOTIVATION_ID = "df_fldFieldINFOCOMPLETTERFILE";
	
	//final static String BUTTON_SAVE_ID = "btnsave";
	final static String SELECT_LEVEL_ID = "fldGlobal_43";

	final static String SKYPE_XPATH = "//*[@id=\"df_fldFieldSOCIALMEDIASKYPE\"]"; //"df_fldFieldSOCIALMEDIASKYPE"; 
	final static String CHECK_CONFIDENTIALITE_ID = "chkReadAndAcceptCodeOfConducts";

	/* @FindBy */
	@FindBy(how = How.XPATH, using = FIRST_APPLY_NOW_XPATH)
	public static WebElement firstApplyNow;
	@FindBy(how = How.XPATH, using = NAME_OF_POST_XPATH)
	public static WebElement nameOfPost;
	@FindBy(how = How.ID, using = SECOND_APPLY_NOW_ID)
	public static WebElement secondApplyNow;
	
	@FindBy(how = How.XPATH, using = MANUALLY_FILL_XPATH)
	public static WebElement manuallyFill;
	
	@FindBy(how = How.XPATH, using = ROBOT_XPATH)
	public static WebElement robot;
	
	@FindBy(how = How.XPATH, using = TITLE_XPATH)
	public static WebElement title;
	@FindBy(how = How.ID, using = LAST_NAME_ID)
	public static WebElement lastName;
	@FindBy(how = How.ID, using = FIRST_NAME_ID)
	public static WebElement firstName;
	@FindBy(how = How.ID, using = EMAIL_ID)
	public static WebElement email;
	
	@FindBy(how = How.ID, using = ADRESS_ID)
	public static WebElement adress;
	@FindBy(how = How.ID, using = ADDITIONAL_ADRESS_ID)
	public static WebElement additionalAdress;
	@FindBy(how = How.ID, using = POSTAL_CODE_ID)
	public static WebElement postalCode;
	@FindBy(how = How.ID, using = CITY_ID)
	public static WebElement city;
	@FindBy(how = How.ID, using = COUNTRY_ID)
	public static WebElement country;
	@FindBy(how = How.ID, using = REGION_ID)
	public static WebElement region;
	@FindBy(how = How.ID, using = PHONE_ID)
	public static WebElement phone;
	@FindBy(how = How.ID, using = CELL_PHONE_ID)
	public static WebElement cellPhone;
	@FindBy(how = How.ID, using = BROWSE_BUTTON_CV_ID)
	public static WebElement browseButtonCv;
	@FindBy(how = How.ID, using = DATE_OF_BIRTH_ID)
	public static WebElement dateOfBirth;
	@FindBy(how = How.ID, using = NUMBER_OF_YEARS_OF_EXPR_ID)
	public static WebElement numberOfYearsOfExpr;
	@FindBy(how = How.XPATH, using = NATIONALITY_XPATH)
	public static WebElement nationality;
	
	@FindBy(how = How.ID, using = BUTTON_ADD_SECTOR_ID)
	public static WebElement buttonAddSector;
	@FindBy(how = How.ID, using = SECTOR_ID)
	public static WebElement sector;
	
	@FindBy(how = How.ID, using = BUTTON_ADD_EXPR_ID)
	public static WebElement buttonAddExpr;
	@FindBy(how = How.XPATH, using = NAME_COMPANY_XPATH)
	public static WebElement nameCompany;
	@FindBy(how = How.ID, using = POST_ID)
	public static WebElement post;
	@FindBy(how = How.ID, using = START_DATE_ID)
	public static WebElement startDate;
	@FindBy(how = How.ID, using = COUNTRY_EXPERIENCE_ID)
	public static WebElement countryExpr;
	@FindBy(how = How.ID, using = END_DATE_EXPERIENCE_ID)
	public static WebElement endDateExpr;
	@FindBy(how = How.ID, using = STILL_IN_POSITION_ID)
	public static WebElement stillInPosition;
	@FindBy(how = How.ID, using = JOB_SPECIFICATION_ID)
	public static WebElement jobSpec;
	
	@FindBy(how = How.ID, using = DESIRED_POSITION_ID)
	public static WebElement desiredPosition;
	@FindBy(how = How.ID, using = TYPE_OF_CONTRACT_ID)
	public static WebElement typeOfContrat;
	@FindBy(how = How.ID, using = AVAILABILITY_DATE_ID)
	public static WebElement availabilityDt;
	@FindBy(how = How.ID, using = PRIOR_NOTICE_ID)
	public static WebElement priorNotice;
	
	@FindBy(how = How.ID, using = SKILLS_ID)
	public static WebElement skills;
	@FindBy(how = How.ID, using = TOOLS_ID)
	public static WebElement tools;
	
	@FindBy(how = How.ID, using = ADD_BUTTON_TRAINING_ID)
	public static WebElement addButtonTraining;
	@FindBy(how = How.ID, using = STUDY_COUNTRIES_ID)
	public static WebElement studyCountries;
	@FindBy(how = How.ID, using = EDUCATION_INSTITUTION_ID)
	public static WebElement educationalInstitution;
	@FindBy(how = How.XPATH, using = DIPLOMA_XPATH)
	public static WebElement diploma;
	@FindBy(how = How.ID, using = DIPLOMA_LEVEL_ID)
	public static WebElement diplomaLevel;
	@FindBy(how = How.ID, using = DIPLOMA_YEAR_ID)
	public static WebElement diplomaYear;
	
	@FindBy(how = How.ID, using = MOTHER_TONGUE_ID)
	public static WebElement motherTongue;
	@FindBy(how = How.ID, using = OTHER_LANGUAGE_ID)
	public static WebElement otherLanguage;
	@FindBy(how = How.XPATH, using = SELECT_BUTTON_XPATH)
	public static WebElement selectButton;
	@FindBy(how = How.ID, using = LANGUAGE_LEVELS_ID)
	public static WebElement languageLevels;
	
	@FindBy(how = How.ID, using = ADD_REMUNERATION_ID)
	public static WebElement addRemuneration;
	@FindBy(how = How.ID, using = FIXED_SALARY_ID)
	public static WebElement fixedSalary;
	@FindBy(how = How.ID, using = DESIRED_FIXED_SALARY_ID)
	public static WebElement desiredFixedSalary;
	
	@FindBy(how = How.ID, using = ATTACH_A_LETTER_OF_MOTIVATION_ID)
	public static WebElement attachAletterOfMotivation;
//	@FindBy(how = How.ID, using = BUTTON_SAVE_ID)
//	public static WebElement buttonSave;
	@FindBy(how = How.ID, using = SELECT_LEVEL_ID)
	public static WebElement selectLevel;

	@FindBy(how = How.XPATH, using = SKYPE_XPATH)
	public static WebElement skype;
	@FindBy(how = How.ID, using = CHECK_CONFIDENTIALITE_ID)
	public static WebElement checkConfidentialite;
	
	/*Methods*/
	
	public void selectValueSector() {

		Select selectBox = new Select(sector);
		selectBox.selectByVisibleText("FINANCE, PUBLIC SECTOR & SERVICES");
	}
	
	public void selectSector() {
		Select selectBoxSector = new Select(sector);
		selectBoxSector.selectByValue("5");
	}
}
