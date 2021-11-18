/**
 * Sample Skeleton for 'FDProject.fxml' Controller Class
 */

package FacilitatingDemocracy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class Controller {

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

    @FXML // fx:id="candidatesPane"
    private StackPane candidatesPane; // Value injected by FXMLLoader

    @FXML // fx:id="castBallot_B"
    private Button castBallot_B; // Value injected by FXMLLoader

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

    @FXML // fx:id="stv_A"
    private TitledPane stv_A; // Value injected by FXMLLoader

    @FXML // fx:id="stv_B"
    private RadioButton stv_B; // Value injected by FXMLLoader

    @FXML // fx:id="stv_G"
    private BarChart<?, ?> stv_G; // Value injected by FXMLLoader

    @FXML // fx:id="threeResultsPanes"
    private TextArea threeResultsPanes; // Value injected by FXMLLoader

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

}
