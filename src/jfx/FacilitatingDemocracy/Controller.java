/*
 * Sample Skeleton for 'FDProject.fxml' Controller Class
 */

package FacilitatingDemocracy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="address_T"
    private TextField address_T; // Value injected by FXMLLoader

    @FXML // fx:id="bDayRecovery_L"
    private Label bDayRecovery_L; // Value injected by FXMLLoader

    @FXML // fx:id="bDayRecovery_T"
    private TextField bDayRecovery_T; // Value injected by FXMLLoader

    @FXML // fx:id="bDay_T"
    private TextField bDay_T; // Value injected by FXMLLoader

    @FXML // fx:id="can1Description_T"
    private TextArea can1Description_T; // Value injected by FXMLLoader

    @FXML // fx:id="can1policies_T"
    private TextArea can1policies_T; // Value injected by FXMLLoader

    @FXML // fx:id="candidate1_A"
    private TitledPane candidate1_A; // Value injected by FXMLLoader

    @FXML // fx:id="candidate2_A"
    private TitledPane candidate2_A; // Value injected by FXMLLoader

    @FXML // fx:id="candidate3_A"
    private TitledPane candidate3_A; // Value injected by FXMLLoader

    @FXML // fx:id="candidate4_A"
    private TitledPane candidate4_A; // Value injected by FXMLLoader

    @FXML // fx:id="candidate5_A"
    private TitledPane candidate5_A; // Value injected by FXMLLoader

    @FXML // fx:id="candidate6_A"
    private TitledPane candidate6_A; // Value injected by FXMLLoader

    @FXML // fx:id="candidatesPane"
    private StackPane candidatesPane; // Value injected by FXMLLoader

    @FXML // fx:id="candidatesPane_B"
    private Button candidatesPane_B; // Value injected by FXMLLoader

    @FXML // fx:id="descriptionPane"
    private StackPane descriptionPane; // Value injected by FXMLLoader

    @FXML // fx:id="electionDescription_T"
    private TextField electionDescription_T; // Value injected by FXMLLoader

    @FXML // fx:id="electionDescription_T1"
    private TextField electionDescription_T1; // Value injected by FXMLLoader

    @FXML // fx:id="endBallot_G"
    private GridPane endBallot_G; // Value injected by FXMLLoader

    @FXML // fx:id="exit_B"
    private Button exit_B; // Value injected by FXMLLoader

    @FXML // fx:id="expandMenu_B"
    private Button expandMenu_B; // Value injected by FXMLLoader

    @FXML // fx:id="forgotPassword_B"
    private Button forgotPassword_B; // Value injected by FXMLLoader

    @FXML // fx:id="fourOfFour_D"
    private ChoiceBox<?> fourOfFour_D; // Value injected by FXMLLoader

    @FXML // fx:id="fptpBallot_B"
    private Button fptpBallot_B; // Value injected by FXMLLoader

    @FXML // fx:id="fptpBallot_G"
    private GridPane fptpBallot_G; // Value injected by FXMLLoader

    @FXML // fx:id="fptp_A"
    private TitledPane fptp_A; // Value injected by FXMLLoader

    @FXML // fx:id="fptp_B"
    private RadioButton fptp_B; // Value injected by FXMLLoader

    @FXML // fx:id="fptp_G"
    private BarChart<?, ?> fptp_G; // Value injected by FXMLLoader

    @FXML // fx:id="homePane"
    private StackPane homePane; // Value injected by FXMLLoader

    @FXML // fx:id="idRecovery_L"
    private Label idRecovery_L; // Value injected by FXMLLoader

    @FXML // fx:id="idRecovery_T"
    private TextField idRecovery_T; // Value injected by FXMLLoader

    @FXML // fx:id="id_T"
    private TextField id_T; // Value injected by FXMLLoader

    @FXML // fx:id="loginGrid1"
    private GridPane loginGrid1; // Value injected by FXMLLoader

    @FXML // fx:id="loginGrid2"
    private GridPane loginGrid2; // Value injected by FXMLLoader

    @FXML // fx:id="loginPane"
    private StackPane loginPane; // Value injected by FXMLLoader

    @FXML // fx:id="loginPane_B"
    private Button loginPane_B; // Value injected by FXMLLoader

    @FXML // fx:id="loginPassword_T"
    private TextField loginPassword_T; // Value injected by FXMLLoader

    @FXML // fx:id="loginPassword_T1"
    private TextField loginPassword_T1; // Value injected by FXMLLoader

    @FXML // fx:id="login_B"
    private Button login_B; // Value injected by FXMLLoader

    @FXML // fx:id="login_B2"
    private Button login_B2; // Value injected by FXMLLoader

    @FXML // fx:id="login_T"
    private TextField login_T; // Value injected by FXMLLoader

    @FXML // fx:id="login_T1"
    private TextField login_T1; // Value injected by FXMLLoader

    @FXML // fx:id="menuPane"
    private AnchorPane menuPane; // Value injected by FXMLLoader

    @FXML // fx:id="name_T"
    private TextField name_T; // Value injected by FXMLLoader

    @FXML // fx:id="newUsername_T"
    private TextField newUsername_T; // Value injected by FXMLLoader

    @FXML // fx:id="oneOfFour_D"
    private ChoiceBox<?> oneOfFour_D; // Value injected by FXMLLoader

    @FXML // fx:id="oneOfOne_D"
    private ChoiceBox<?> oneOfOne_D; // Value injected by FXMLLoader

    @FXML // fx:id="oneOfTwo_D"
    private ChoiceBox<?> oneOfTwo_D; // Value injected by FXMLLoader

    @FXML // fx:id="personalPassword_T"
    private TextField personalPassword_T; // Value injected by FXMLLoader

    @FXML // fx:id="rcBallot_B"
    private Button rcBallot_B; // Value injected by FXMLLoader

    @FXML // fx:id="rcBallot_G"
    private GridPane rcBallot_G; // Value injected by FXMLLoader

    @FXML // fx:id="rcv_A"
    private TitledPane rcv_A; // Value injected by FXMLLoader

    @FXML // fx:id="rcv_B"
    private RadioButton rcv_B; // Value injected by FXMLLoader

    @FXML // fx:id="rcv_G"
    private BarChart<?, ?> rcv_G; // Value injected by FXMLLoader

    @FXML // fx:id="recoverPassword_B"
    private Button recoverPassword_B; // Value injected by FXMLLoader

    @FXML // fx:id="register_B"
    private Button register_B; // Value injected by FXMLLoader

    @FXML // fx:id="registrationPane"
    private StackPane registrationPane; // Value injected by FXMLLoader

    @FXML // fx:id="registrationPane_B"
    private Button registrationPane_B; // Value injected by FXMLLoader

    @FXML // fx:id="resultsPane"
    private StackPane resultsPane; // Value injected by FXMLLoader

    @FXML // fx:id="resultsPane_B"
    private Button resultsPane_B; // Value injected by FXMLLoader

    @FXML // fx:id="resultsPane_B1"
    private Button resultsPane_B1; // Value injected by FXMLLoader

    @FXML // fx:id="stvBallot_B"
    private Button stvBallot_B; // Value injected by FXMLLoader

    @FXML // fx:id="stvBallot_G"
    private GridPane stvBallot_G; // Value injected by FXMLLoader

    @FXML // fx:id="stv_A"
    private TitledPane stv_A; // Value injected by FXMLLoader

    @FXML // fx:id="stv_B"
    private RadioButton stv_B; // Value injected by FXMLLoader

    @FXML // fx:id="stv_G"
    private BarChart<?, ?> stv_G; // Value injected by FXMLLoader

    @FXML // fx:id="threeOfFour_D"
    private ChoiceBox<?> threeOfFour_D; // Value injected by FXMLLoader

    @FXML // fx:id="threeResultsPanes"
    private TextArea threeResultsPanes; // Value injected by FXMLLoader

    @FXML // fx:id="twoOfFour_D"
    private ChoiceBox<?> twoOfFour_D; // Value injected by FXMLLoader

    @FXML // fx:id="twoOfTwo_D"
    private ChoiceBox<?> twoOfTwo_D; // Value injected by FXMLLoader

    @FXML // fx:id="username_T"
    private TextField username_T; // Value injected by FXMLLoader

    @FXML // fx:id="username_T1"
    private TextField username_T1; // Value injected by FXMLLoader

    @FXML // fx:id="validateLogin_T"
    private TextField validateLogin_T; // Value injected by FXMLLoader

    @FXML // fx:id="validateLogin_T1"
    private TextField validateLogin_T1; // Value injected by FXMLLoader

    @FXML // fx:id="validate_T"
    private TextField validate_T; // Value injected by FXMLLoader

    @FXML // fx:id="votePane"
    private StackPane votePane; // Value injected by FXMLLoader

    @FXML // fx:id="voterID_P"
    private ImageView voterID_P; // Value injected by FXMLLoader

    @FXML // fx:id="votingPage_B"
    private Button votingPage_B; // Value injected by FXMLLoader

//////////////////////////////////////////////////////////////////////////////////////

    @FXML
    void Login(ActionEvent event) { // allows access to voting pane

    }

    @FXML
    void ForgotPassword(ActionEvent event) { // hide loginGrid1, show loginGrid2

    }

    @FXML
    void RecoverPassword(ActionEvent event) { // presents voter their login info

    }

    @FXML
    void Register(ActionEvent event) { // sends user info to BackEnd
        register_B.setText("Registered!");
        validate_T.setText("Ready to Vote!");
        name_T.setMouseTransparent(true);
    }

    @FXML
    void Vote(ActionEvent event) { // Sends Voting ballots to BackEnd
        if (fptpBallot_G.isVisible()) {
            clearInputs();
            fptpBallot_G.setVisible(false);
            stvBallot_G.setVisible(true);
        }
        else if (stvBallot_G.isVisible()) {
            clearInputs();
            stvBallot_G.setVisible(false);
            rcBallot_G.setVisible(true);
        }
        else if (rcBallot_G.isVisible()) {
            clearInputs();
            rcBallot_G.setVisible(false);
            endBallot_G.setVisible(true);
        }
    }

    @FXML
    void FirstPastPost(ActionEvent event) { // View Results using Accordian

    }

    @FXML
    void SingleTransferrable(ActionEvent event) { // View Results using Accordian

    }

    @FXML
    void RankedChoice(ActionEvent event) { // View Results using Accordian

    }

    @FXML
    void ViewResults(ActionEvent event) { // View Results using 3 StackPanes

    }

//////////////////////////////////////////////////////////////////////////////////////

    // Menu Option 1
    @FXML
    void gotoExpand(ActionEvent event) {
        if (descriptionPane.isVisible()) {
            clearInputs();
            descriptionPane.setVisible(false);
            registrationPane.setVisible(false);
            loginPane.setVisible(false);
            candidatesPane.setVisible(false);
            votePane.setVisible(false);
            resultsPane.setVisible(false);
            homePane.setVisible(true);
        } else {
            clearInputs();
            homePane.setVisible(false);
            registrationPane.setVisible(false);
            loginPane.setVisible(false);
            candidatesPane.setVisible(false);
            votePane.setVisible(false);
            resultsPane.setVisible(false);
            descriptionPane.setVisible(true);
        }
    }

    // Menu Option 2
    @FXML
    void gotoRegistration(ActionEvent event) {
        if (registrationPane.isVisible()) {
            clearInputs();
            descriptionPane.setVisible(false);
            homePane.setVisible(false);
            loginPane.setVisible(false);
            candidatesPane.setVisible(false);
            votePane.setVisible(false);
            resultsPane.setVisible(false);
            registrationPane.setVisible(true);
            register_B.setText("Register");
            validate_T.clear();
        } else {
            clearInputs();
            descriptionPane.setVisible(false);
            homePane.setVisible(false);
            loginPane.setVisible(false);
            candidatesPane.setVisible(false);
            votePane.setVisible(false);
            resultsPane.setVisible(false);
            registrationPane.setVisible(true);
            register_B.setText("Register");
        }
    }

    // Menu Option 3
    @FXML
    void gotoLogin(ActionEvent event) {
        if (registrationPane.isVisible()) {
            clearInputs();
            descriptionPane.setVisible(false);
            homePane.setVisible(false);
            registrationPane.setVisible(false);
            candidatesPane.setVisible(false);
            votePane.setVisible(false);
            resultsPane.setVisible(false);
            loginPane.setVisible(true);
        } else {
            clearInputs();
            descriptionPane.setVisible(false);
            homePane.setVisible(false);
            registrationPane.setVisible(false);
            candidatesPane.setVisible(false);
            votePane.setVisible(false);
            resultsPane.setVisible(false);
            loginPane.setVisible(true);
        }
    }
    
    // Menu Option 4
    @FXML
    void gotoCandidates(ActionEvent event) {
        if (registrationPane.isVisible()) {
            clearInputs();
            descriptionPane.setVisible(false);
            homePane.setVisible(false);
            registrationPane.setVisible(false);
            loginPane.setVisible(false);
            votePane.setVisible(false);
            resultsPane.setVisible(false);
            candidatesPane.setVisible(true);
        } else {
            clearInputs();
            descriptionPane.setVisible(false);
            homePane.setVisible(false);
            registrationPane.setVisible(false);
            loginPane.setVisible(false);
            votePane.setVisible(false);
            resultsPane.setVisible(false);
            candidatesPane.setVisible(true);
        }
    }

    // Menu Option 5
    @FXML
    void gotoVoting(ActionEvent event) { // Only allow access if voter has logged in
        if (registrationPane.isVisible()) {
            clearInputs();
            descriptionPane.setVisible(false);
            homePane.setVisible(false);
            registrationPane.setVisible(false);
            loginPane.setVisible(false);
            candidatesPane.setVisible(false);
            resultsPane.setVisible(false);
            votePane.setVisible(true);
        } else {
            clearInputs();
            descriptionPane.setVisible(false);
            homePane.setVisible(false);
            registrationPane.setVisible(false);
            loginPane.setVisible(false);
            candidatesPane.setVisible(false);
            resultsPane.setVisible(false);
            votePane.setVisible(true);
        }
    }

    // Menu Option 6
    @FXML
    void gotoResults(ActionEvent event) {
        if (registrationPane.isVisible()) {
            clearInputs();
            descriptionPane.setVisible(false);
            homePane.setVisible(false);
            registrationPane.setVisible(false);
            loginPane.setVisible(false);
            candidatesPane.setVisible(false);
            votePane.setVisible(false);
            resultsPane.setVisible(true);
        } else {
            clearInputs();
            descriptionPane.setVisible(false);
            homePane.setVisible(false);
            registrationPane.setVisible(false);
            loginPane.setVisible(false);
            candidatesPane.setVisible(false);
            votePane.setVisible(false);
            resultsPane.setVisible(true);
        }
    }
    
    // Menu Option 7
    @FXML
    void exitProgram(ActionEvent event) {
        // Exits the program
        System.exit(0);
    }

    void clearInputs() {
        // Clears all inputs
        name_T.clear();
        name_T.setMouseTransparent(false);
        bDay_T.clear();
        bDay_T.setMouseTransparent(false);
        id_T.clear();
        id_T.setMouseTransparent(false);
        address_T.clear();
        address_T.setMouseTransparent(false);
        newUsername_T.clear();
        newUsername_T.setMouseTransparent(false);
        personalPassword_T.clear();
        personalPassword_T.setMouseTransparent(false);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert address_T != null : "fx:id=\"address_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert bDayRecovery_L != null : "fx:id=\"bDayRecovery_L\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert bDayRecovery_T != null : "fx:id=\"bDayRecovery_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert bDay_T != null : "fx:id=\"bDay_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert can1Description_T != null : "fx:id=\"can1Description_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert can1policies_T != null : "fx:id=\"can1policies_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert candidate1_A != null : "fx:id=\"candidate1_A\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert candidate2_A != null : "fx:id=\"candidate2_A\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert candidate3_A != null : "fx:id=\"candidate3_A\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert candidate4_A != null : "fx:id=\"candidate4_A\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert candidate5_A != null : "fx:id=\"candidate5_A\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert candidate6_A != null : "fx:id=\"candidate6_A\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert candidatesPane != null : "fx:id=\"candidatesPane\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert candidatesPane_B != null : "fx:id=\"candidatesPane_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert descriptionPane != null : "fx:id=\"descriptionPane\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert electionDescription_T != null : "fx:id=\"electionDescription_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert electionDescription_T1 != null : "fx:id=\"electionDescription_T1\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert endBallot_G != null : "fx:id=\"endBallot_G\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert exit_B != null : "fx:id=\"exit_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert expandMenu_B != null : "fx:id=\"expandMenu_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert forgotPassword_B != null : "fx:id=\"forgotPassword_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert fourOfFour_D != null : "fx:id=\"fourOfFour_D\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert fptpBallot_B != null : "fx:id=\"fptpBallot_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert fptpBallot_G != null : "fx:id=\"fptpBallot_G\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert fptp_A != null : "fx:id=\"fptp_A\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert fptp_B != null : "fx:id=\"fptp_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert fptp_G != null : "fx:id=\"fptp_G\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert homePane != null : "fx:id=\"homePane\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert idRecovery_L != null : "fx:id=\"idRecovery_L\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert idRecovery_T != null : "fx:id=\"idRecovery_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert id_T != null : "fx:id=\"id_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert loginGrid1 != null : "fx:id=\"loginGrid1\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert loginGrid2 != null : "fx:id=\"loginGrid2\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert loginPane != null : "fx:id=\"loginPane\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert loginPane_B != null : "fx:id=\"loginPane_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert loginPassword_T != null : "fx:id=\"loginPassword_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert loginPassword_T1 != null : "fx:id=\"loginPassword_T1\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert login_B != null : "fx:id=\"login_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert login_B2 != null : "fx:id=\"login_B2\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert login_T != null : "fx:id=\"login_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert login_T1 != null : "fx:id=\"login_T1\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert menuPane != null : "fx:id=\"menuPane\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert name_T != null : "fx:id=\"name_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert newUsername_T != null : "fx:id=\"newUsername_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert oneOfFour_D != null : "fx:id=\"oneOfFour_D\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert oneOfOne_D != null : "fx:id=\"oneOfOne_D\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert oneOfTwo_D != null : "fx:id=\"oneOfTwo_D\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert personalPassword_T != null : "fx:id=\"personalPassword_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert rcBallot_B != null : "fx:id=\"rcBallot_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert rcBallot_G != null : "fx:id=\"rcBallot_G\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert rcv_A != null : "fx:id=\"rcv_A\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert rcv_B != null : "fx:id=\"rcv_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert rcv_G != null : "fx:id=\"rcv_G\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert recoverPassword_B != null : "fx:id=\"recoverPassword_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert register_B != null : "fx:id=\"register_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert registrationPane != null : "fx:id=\"registrationPane\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert registrationPane_B != null : "fx:id=\"registrationPane_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert resultsPane != null : "fx:id=\"resultsPane\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert resultsPane_B != null : "fx:id=\"resultsPane_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert resultsPane_B1 != null : "fx:id=\"resultsPane_B1\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert stvBallot_B != null : "fx:id=\"stvBallot_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert stvBallot_G != null : "fx:id=\"stvBallot_G\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert stv_A != null : "fx:id=\"stv_A\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert stv_B != null : "fx:id=\"stv_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert stv_G != null : "fx:id=\"stv_G\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert threeOfFour_D != null : "fx:id=\"threeOfFour_D\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert threeResultsPanes != null : "fx:id=\"threeResultsPanes\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert twoOfFour_D != null : "fx:id=\"twoOfFour_D\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert twoOfTwo_D != null : "fx:id=\"twoOfTwo_D\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert username_T != null : "fx:id=\"username_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert username_T1 != null : "fx:id=\"username_T1\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert validateLogin_T != null : "fx:id=\"validateLogin_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert validateLogin_T1 != null : "fx:id=\"validateLogin_T1\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert validate_T != null : "fx:id=\"validate_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert votePane != null : "fx:id=\"votePane\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert voterID_P != null : "fx:id=\"voterID_P\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert votingPage_B != null : "fx:id=\"votingPage_B\" was not injected: check your FXML file 'FDProject.fxml'.";

    }

}
