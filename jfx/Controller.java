/**
 * Sample Skeleton for 'FDProject.fxml' Controller Class
 */

package FacilitatingDemocracy;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="RegistrationPage"
    private AnchorPane RegistrationPage; // Value injected by FXMLLoader

    @FXML // fx:id="RegistrationPage_B"
    private Button RegistrationPage_B; // Value injected by FXMLLoader

    @FXML // fx:id="ResultsPane"
    private StackPane ResultsPane; // Value injected by FXMLLoader

    @FXML // fx:id="VotePane"
    private StackPane VotePane; // Value injected by FXMLLoader

    @FXML // fx:id="address_T"
    private TextField address_T; // Value injected by FXMLLoader

    @FXML // fx:id="bDayRecovery_L"
    private Label bDayRecovery_L; // Value injected by FXMLLoader

    @FXML // fx:id="bDayRecovery_T"
    private TextField bDayRecovery_T; // Value injected by FXMLLoader

    @FXML // fx:id="bDay_T"
    private TextField bDay_T; // Value injected by FXMLLoader

    @FXML // fx:id="ballot1_G"
    private GridPane ballot1_G; // Value injected by FXMLLoader

    @FXML // fx:id="ballot2_G"
    private GridPane ballot2_G; // Value injected by FXMLLoader

    @FXML // fx:id="ballot3_G"
    private GridPane ballot3_G; // Value injected by FXMLLoader

    @FXML // fx:id="candidatesPane"
    private StackPane candidatesPane; // Value injected by FXMLLoader

    @FXML // fx:id="descriptionPane"
    private StackPane descriptionPane; // Value injected by FXMLLoader

    @FXML // fx:id="electionDescription_T"
    private TextField electionDescription_T; // Value injected by FXMLLoader

    @FXML // fx:id="electionDescription_T1"
    private TextField electionDescription_T1; // Value injected by FXMLLoader

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

    @FXML // fx:id="loginPage_B"
    private Button loginPage_B; // Value injected by FXMLLoader

    @FXML // fx:id="loginPane"
    private StackPane loginPane; // Value injected by FXMLLoader

    @FXML // fx:id="loginPassword_T"
    private TextField loginPassword_T; // Value injected by FXMLLoader

    @FXML // fx:id="loginPassword_T1"
    private TextField loginPassword_T1; // Value injected by FXMLLoader

    @FXML // fx:id="login_B"
    private Button login_B; // Value injected by FXMLLoader

    @FXML // fx:id="login_B1"
    private Button login_B1; // Value injected by FXMLLoader

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

    @FXML // fx:id="position1_A"
    private TitledPane position1_A; // Value injected by FXMLLoader

    @FXML // fx:id="position2_A"
    private TitledPane position2_A; // Value injected by FXMLLoader

    @FXML // fx:id="position3_A"
    private TitledPane position3_A; // Value injected by FXMLLoader

    @FXML // fx:id="position4_A"
    private TitledPane position4_A; // Value injected by FXMLLoader

    @FXML // fx:id="position4_A1"
    private TitledPane position4_A1; // Value injected by FXMLLoader

    @FXML // fx:id="position4_A2"
    private TitledPane position4_A2; // Value injected by FXMLLoader

    @FXML // fx:id="rcBallot_B"
    private Button rcBallot_B; // Value injected by FXMLLoader

    @FXML // fx:id="rcv_A"
    private TitledPane rcv_A; // Value injected by FXMLLoader

    @FXML // fx:id="rcv_B"
    private RadioButton rcv_B; // Value injected by FXMLLoader

    @FXML // fx:id="rcv_G"
    private BarChart<?, ?> rcv_G; // Value injected by FXMLLoader

    @FXML // fx:id="recoverPassword_B1"
    private Button recoverPassword_B1; // Value injected by FXMLLoader

    @FXML // fx:id="registerPane"
    private StackPane registerPane; // Value injected by FXMLLoader

    @FXML // fx:id="register_B"
    private Button register_B; // Value injected by FXMLLoader

    @FXML // fx:id="stvBallot_B"
    private Button stvBallot_B; // Value injected by FXMLLoader

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

    @FXML // fx:id="viewCandidates_B"
    private Button viewCandidates_B; // Value injected by FXMLLoader

    @FXML // fx:id="viewResults_B"
    private Button viewResults_B; // Value injected by FXMLLoader

    @FXML // fx:id="voterID_P"
    private ImageView voterID_P; // Value injected by FXMLLoader

    @FXML // fx:id="votingPage_B"
    private Button votingPage_B; // Value injected by FXMLLoader

    @FXML
    void FirstPastPost(ActionEvent event) {

    }

    @FXML
    void RankedChoice(ActionEvent event) {

    }

    @FXML
    void RecoverPassword(ActionEvent event) {

    }

    @FXML
    void Register(ActionEvent event) {

    }

    @FXML
    void SingleTransferrable(ActionEvent event) {

    }

    @FXML
    void Vote(ActionEvent event) {

    }

    @FXML
    void exitProgram(ActionEvent event) {

    }

    @FXML
    void gotoCandidatesPage(ActionEvent event) {

    }

    @FXML
    void gotoExpand(ActionEvent event) {

    }

    @FXML
    void gotoLoginPage(ActionEvent event) {

    }

    @FXML
    void gotoRegistrationPage(ActionEvent event) {

    }

    @FXML
    void gotoResultsPage(ActionEvent event) {

    }

    @FXML
    void gotoVotingPage(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert RegistrationPage != null : "fx:id=\"RegistrationPage\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert RegistrationPage_B != null : "fx:id=\"RegistrationPage_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert ResultsPane != null : "fx:id=\"ResultsPane\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert VotePane != null : "fx:id=\"VotePane\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert address_T != null : "fx:id=\"address_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert bDayRecovery_L != null : "fx:id=\"bDayRecovery_L\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert bDayRecovery_T != null : "fx:id=\"bDayRecovery_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert bDay_T != null : "fx:id=\"bDay_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert ballot1_G != null : "fx:id=\"ballot1_G\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert ballot2_G != null : "fx:id=\"ballot2_G\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert ballot3_G != null : "fx:id=\"ballot3_G\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert candidatesPane != null : "fx:id=\"candidatesPane\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert descriptionPane != null : "fx:id=\"descriptionPane\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert electionDescription_T != null : "fx:id=\"electionDescription_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert electionDescription_T1 != null : "fx:id=\"electionDescription_T1\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert exit_B != null : "fx:id=\"exit_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert expandMenu_B != null : "fx:id=\"expandMenu_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert forgotPassword_B != null : "fx:id=\"forgotPassword_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert fourOfFour_D != null : "fx:id=\"fourOfFour_D\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert fptpBallot_B != null : "fx:id=\"fptpBallot_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert fptp_A != null : "fx:id=\"fptp_A\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert fptp_B != null : "fx:id=\"fptp_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert fptp_G != null : "fx:id=\"fptp_G\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert homePane != null : "fx:id=\"homePane\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert idRecovery_L != null : "fx:id=\"idRecovery_L\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert idRecovery_T != null : "fx:id=\"idRecovery_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert id_T != null : "fx:id=\"id_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert loginPage_B != null : "fx:id=\"loginPage_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert loginPane != null : "fx:id=\"loginPane\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert loginPassword_T != null : "fx:id=\"loginPassword_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert loginPassword_T1 != null : "fx:id=\"loginPassword_T1\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert login_B != null : "fx:id=\"login_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert login_B1 != null : "fx:id=\"login_B1\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert login_T != null : "fx:id=\"login_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert login_T1 != null : "fx:id=\"login_T1\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert menuPane != null : "fx:id=\"menuPane\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert name_T != null : "fx:id=\"name_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert newUsername_T != null : "fx:id=\"newUsername_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert oneOfFour_D != null : "fx:id=\"oneOfFour_D\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert oneOfOne_D != null : "fx:id=\"oneOfOne_D\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert oneOfTwo_D != null : "fx:id=\"oneOfTwo_D\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert personalPassword_T != null : "fx:id=\"personalPassword_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert position1_A != null : "fx:id=\"position1_A\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert position2_A != null : "fx:id=\"position2_A\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert position3_A != null : "fx:id=\"position3_A\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert position4_A != null : "fx:id=\"position4_A\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert position4_A1 != null : "fx:id=\"position4_A1\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert position4_A2 != null : "fx:id=\"position4_A2\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert rcBallot_B != null : "fx:id=\"rcBallot_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert rcv_A != null : "fx:id=\"rcv_A\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert rcv_B != null : "fx:id=\"rcv_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert rcv_G != null : "fx:id=\"rcv_G\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert recoverPassword_B1 != null : "fx:id=\"recoverPassword_B1\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert registerPane != null : "fx:id=\"registerPane\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert register_B != null : "fx:id=\"register_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert stvBallot_B != null : "fx:id=\"stvBallot_B\" was not injected: check your FXML file 'FDProject.fxml'.";
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
        assert viewCandidates_B != null : "fx:id=\"viewCandidates_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert viewResults_B != null : "fx:id=\"viewResults_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert voterID_P != null : "fx:id=\"voterID_P\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert votingPage_B != null : "fx:id=\"votingPage_B\" was not injected: check your FXML file 'FDProject.fxml'.";

    }

}
