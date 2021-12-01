/*
 * Sample Skeleton for 'FDProject.fxml' Controller Class
 */

package FacilitatingDemocracy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import java.net.URL;
import java.util.Arrays;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.stream.IntStream;

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
    @FXML // fx:id="can2Description_T"
    private TextArea can2Description_T; // Value injected by FXMLLoader
    @FXML // fx:id="can3Description_T"
    private TextArea can3Description_T; // Value injected by FXMLLoader
    @FXML // fx:id="can4Description_T"
    private TextArea can4Description_T; // Value injected by FXMLLoader
    @FXML // fx:id="can5Description_T"
    private TextArea can5Description_T; // Value injected by FXMLLoader
    @FXML // fx:id="can6Description_T"
    private TextArea can6Description_T; // Value injected by FXMLLoader

    @FXML // fx:id="can1Policies_T"
    private TextArea can1Policies_T; // Value injected by FXMLLoader
    @FXML // fx:id="can2Policies_T"
    private TextArea can2Policies_T; // Value injected by FXMLLoader
    @FXML // fx:id="can3Policies_T"
    private TextArea can3Policies_T; // Value injected by FXMLLoader
    @FXML // fx:id="can4Policies_T"
    private TextArea can4Policies_T; // Value injected by FXMLLoader
    @FXML // fx:id="can5Policies_T"
    private TextArea can5Policies_T; // Value injected by FXMLLoader
    @FXML // fx:id="can6Policies_T"
    private TextArea can6Policies_T; // Value injected by FXMLLoader

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
    private ChoiceBox<String> fourOfFour_D; // Value injected by FXMLLoader

    @FXML // fx:id="fptpBallot_B"
    private Button fptpBallot_B; // Value injected by FXMLLoader

    @FXML // fx:id="fptpBallot_G"
    private GridPane fptpBallot_G; // Value injected by FXMLLoader

    @FXML // fx:id="fptp_B"
    private RadioButton fptp_B; // Value injected by FXMLLoader


    @FXML
    private BarChart<String, Number> fptp_G; // Value injected by FXMLLoader

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
    private ChoiceBox<String> oneOfFour_D; // Value injected by FXMLLoader

    @FXML // fx:id="oneOfOne_D"
    private ChoiceBox<String> oneOfOne_D; // Value injected by FXMLLoader

    ObservableList<String> oneOfOne_DList = FXCollections.observableArrayList("Isabelle", "Captain America", "Vision", "Crewmate", "Spider-Man", "Write-in");
    ObservableList<String> oneOfTwo_DList = FXCollections.observableArrayList("Isabelle", "Captain America", "Vision", "Crewmate", "Spider-Man", "Write-in");
    ObservableList<String> oneOfFour_DList = FXCollections.observableArrayList("Isabelle", "Captain America", "Vision", "Crewmate", "Spider-Man", "Write-in");

    @FXML // fx:id="oneOfTwo_D"
    private ChoiceBox<String> oneOfTwo_D; // Value injected by FXMLLoader

    @FXML // fx:id="personalPassword_T"
    private TextField personalPassword_T; // Value injected by FXMLLoader

    @FXML // fx:id="rcBallot_B"
    private Button rcBallot_B; // Value injected by FXMLLoader

    @FXML // fx:id="rcBallot_G"
    private GridPane rcBallot_G; // Value injected by FXMLLoader

    @FXML // fx:id="rcv_B"
    private RadioButton rcv_B; // Value injected by FXMLLoader

    @FXML
    private BarChart<String, Number> rcv_G; // Value injected by FXMLLoader

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

    @FXML // fx:id="stv_B"
    private RadioButton stv_B; // Value injected by FXMLLoader

    @FXML
    private BarChart<String, Number> stv_G; // Value injected by FXMLLoader

    @FXML // fx:id="threeOfFour_D"
    private ChoiceBox<String> threeOfFour_D; // Value injected by FXMLLoader

    @FXML // fx:id="threeResultsPanes"
    private TextArea threeResultsPanes; // Value injected by FXMLLoader

    @FXML // fx:id="twoOfFour_D"
    private ChoiceBox<String> twoOfFour_D; // Value injected by FXMLLoader

    @FXML // fx:id="twoOfTwo_D"
    private ChoiceBox<String> twoOfTwo_D; // Value injected by FXMLLoader

    @FXML // fx:id="username_T"
    private TextField username_T; // Value injected by FXMLLoader

    @FXML // fx:id="username_T1"
    private TextField username_T1; // Value injected by FXMLLoader

    @FXML // fx:id="loginID_T"
    private TextField loginID_T; // Value injected by FXMLLoader

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

    @FXML // fx:id="fptp_C1"
    private ImageView fptp_C1; // Value injected by FXMLLoader
    @FXML // fx:id="fptp_C2"
    private ImageView fptp_C2; // Value injected by FXMLLoader
    @FXML // fx:id="stv_C1"
    private ImageView stv_C1; // Value injected by FXMLLoader
    @FXML // fx:id="rc_C1"
    private ImageView rc_C1; // Value injected by FXMLLoader
    @FXML // fx:id="rc_C1"
    private ImageView rc_C2; // Value injected by FXMLLoader

    @FXML
    private Label testLabel;
    @FXML
    private Label fptp_P;
    @FXML
    private Label stv_P;
    @FXML
    private Label rcv_P;

//////////////////////////////////////////////////////////////////////////////////////

    private String username;
    private String password;
    private int currentLoginID;

    @FXML
    void Register(ActionEvent event) { // sends user info to BackEnd
        register_B.setText("Registered!");
        validate_T.setText("Ready to Vote!");
        name_T.setMouseTransparent(true);
        bDay_T.setMouseTransparent(true);
        id_T.setMouseTransparent(true);
        address_T.setMouseTransparent(true);
        newUsername_T.setMouseTransparent(true);
        personalPassword_T.setMouseTransparent(true);

        dbAccess reg = new dbAccess();
        reg.insertUser(name_T.getText(),Integer.parseInt(id_T.getText()));
        currentLoginID = Integer.parseInt(id_T.getText());
    }

    @FXML
    void Login(ActionEvent event) { // allows access to vote pane
        if (!Objects.equals(username_T.getText(), "TalkingDog") || !Objects.equals(loginPassword_T.getText(), "TwinSisters")){
            validateLogin_T.setVisible(true);
            login_B.setText("Login to Vote");
            login_T.setText("Login Incomplete");
        } else {
            login_B.setText("Login Complete!");
            login_T.setText("Now able to vote!");
            loginPane_B.setText("Log Out");
            validateLogin_T.setVisible(false);
            loginID_T.setMouseTransparent(true);
            username_T.setMouseTransparent(true);
            loginPassword_T.setMouseTransparent(true);
        }
    }

    @FXML
    void ForgotPassword(ActionEvent event) { // hide loginGrid1, show loginGrid2
        loginGrid1.setVisible(false);
        voterID_P.setVisible(false);
        loginGrid2.setVisible(true);
        bDayRecovery_T.clear();
        validateLogin_T1.setText("Recover login");
    }

    @FXML
    void RecoverPassword(ActionEvent event) { // presents voter their login info
        if (Objects.equals(bDayRecovery_T.getText(), "09/17/2005") && Objects.equals(idRecovery_T.getText(), "2005")){
            username_T1.setText("TalkingDog");
            loginPassword_T1.setText("TwinSisters");
            validateLogin_T1.setText("Recovered!");
            bDayRecovery_T.setMouseTransparent(true);
            idRecovery_T.setMouseTransparent(true);
        } else if (true){   // if valid id in database
            validateLogin_T1.setText("Recovered!");
            username_T1.setText("You Are");
            loginPassword_T1.setText("Unique!");
            bDayRecovery_T.setMouseTransparent(true);
            idRecovery_T.setMouseTransparent(true);
        } else {
            username_T1.setText("Go To");
            loginPassword_T1.setText("Registration!");
        }
    }

    @FXML
    void Vote(ActionEvent event) { // Sends Voting ballots to BackEnd
        int vote1=0;
        int vote2=0;
        int vote3=0;
        int vote4=0;
        int vote5=0;
        int votefptp =0;

        if (fptpBallot_G.isVisible()) {
            String fptpChoice = (String) oneOfOne_D.getValue();
            // send fptpChoice to backend
            votefptp = nameToId(fptpChoice);

            clearInputs();
            fptpBallot_G.setVisible(false);
            stvBallot_G.setVisible(true);
        }
        else if (stvBallot_G.isVisible()) {
            String stvChoice1 = (String) oneOfTwo_D.getValue();
            String stvChoice2 = (String) twoOfTwo_D.getValue();

            // send stvChoices to backend
            vote1=nameToId(stvChoice1);
            vote5=nameToId(stvChoice2);


            clearInputs();
            stvBallot_G.setVisible(false);
            rcBallot_G.setVisible(true);
        }
        else if (rcBallot_G.isVisible()) {
            String rcChoice1 = (String) oneOfFour_D.getValue();
            String rcChoice2 = (String) twoOfFour_D.getValue();
            String rcChoice3 = (String) threeOfFour_D.getValue();
            String rcChoice4 = (String) fourOfFour_D.getValue();

            // send rcChoices to backend
            vote1=nameToId(rcChoice1);
            vote2=nameToId(rcChoice2);
            vote3=nameToId(rcChoice3);
            vote4=nameToId(rcChoice4);

            clearInputs();
            rcBallot_G.setVisible(false);
            endBallot_G.setVisible(true);

            dbAccess vote = new dbAccess();
            vote.insertVote(vote1,vote2,vote3,vote4,vote5,votefptp,currentLoginID);

        }
    }

    @FXML
    void FirstPastPost(ActionEvent event) { // View Results using Accordian
        fptp_B.setSelected(true);
        stv_B.setSelected(false);
        rcv_B.setSelected(false);
        fptp_G.setVisible(true); stv_G.setVisible(false); rcv_G.setVisible(false);
        // Comment out line above if using hardcoded image results below, and vice versa
        //fptp_C1.setVisible(true); fptp_C2.setVisible(false); stv_C1.setVisible(false); rc_C1.setVisible(false); rc_C2.setVisible(false);

        if (fptp_P.getText() != "F Once Selected") {
            int[] cantotals = {0, 0, 0, 0, 0};

            dbAccess fptp = new dbAccess();

            for (int i = 0; i < 5; i++) { // pulls totals for fptp from db to array
                cantotals[i] = fptp.getFirstPastThePost(i + 1);
            }
            // set up bar chart

            CategoryAxis xAxis = new CategoryAxis();
            xAxis.setLabel("Candidates");
            xAxis.setCategories(FXCollections.<String>observableArrayList(Arrays.asList(
                    "Can1", "Can2", "Can3", "Can4", "Can5")));

            NumberAxis yAxis = new NumberAxis();
            yAxis.setLabel("Votes");

            //fptp_G = new BarChart<String,Number>(xAxis,yAxis);
            fptp_G.setTitle("First Past The Post");

            XYChart.Series<String, Number> series1 = new XYChart.Series<>();
            series1.setName("First Past The Post");

            series1.getData().add(new XYChart.Data<>("Can1", cantotals[0]));
            series1.getData().add(new XYChart.Data<>("Can2", cantotals[1]));
            series1.getData().add(new XYChart.Data<>("Can3", cantotals[2]));
            series1.getData().add(new XYChart.Data<>("Can4", cantotals[3]));
            series1.getData().add(new XYChart.Data<>("Can5", cantotals[4]));

            fptp_G.getData().addAll(series1);

            fptp_G.setVisible(true);
        }
        fptp_P.setText("F Once Selected");
        //threeResultsPanes.setText("Candidate Blank Has Won!");
        fptp_G.setVisible(true);
    }

    @FXML
    void SingleTransferrable(ActionEvent event) { // View Results using Accordian
        fptp_B.setSelected(false);
        stv_B.setSelected(true);
        rcv_B.setSelected(false);
        fptp_G.setVisible(false); stv_G.setVisible(true); rcv_G.setVisible(false);
        // Comment out line above if using hardcoded image results below, and vice versa
        //fptp_C1.setVisible(false); fptp_C2.setVisible(false);stv_C1.setVisible(true); rc_C1.setVisible(false); rc_C2.setVisible(false);

        if (stv_P.getText() != "S Once Selected") {
            int[] cantotals = {0,0,0,0,0};
            int[] firstelim = {0,0,0,0,0};
            int[] secondelim = {0,0,0,0,0};
            int[] thirdelim = {0,0,0,0,0};
            int[] eliminate = {0,0,0,0}; // with 5 candidates, only 3 passes needed + min counter for one seat

            dbAccess stv = new dbAccess();

            for (int i=0; i<5; i++){ // pulls first round from db to array
                cantotals[i] = stv.getFirstVote(i+1);
            }
            eliminate[0] = minIgnoreZero(cantotals); // current minimum
            eliminate[1] = findIndex(cantotals,eliminate[0]) + 1; // candidate of current minimum

            for (int i=0; i<5; i++){ // pulls second round from db to array
                firstelim[i] = stv.getFirstElimination(eliminate[1],i+1);
            }

            for (int i=0; i<5; i++) {
                cantotals[i] += firstelim[i];   // adds transferred votes
            }
            cantotals[eliminate[1] - 1] = 0;  // sets eliminated candidates to 0

            eliminate[0] = minIgnoreZero(cantotals); // recalculate minimum
            eliminate[2] = findIndex(cantotals,eliminate[0]) + 1; // candidate for elimination round 2

            for (int i=0; i<5; i++){ // pulls second round from db to array
                secondelim[i] = stv.getSecondElimination(eliminate[1],eliminate[2],i+1);
            }

            for (int i=0; i<5; i++) {
                cantotals[i] += secondelim[i];   // adds transferred votes
            }
            cantotals[eliminate[1] - 1] = 0;  // sets eliminated candidates to 0
            cantotals[eliminate[2] - 1] = 0;

            eliminate[0] = minIgnoreZero(cantotals); // recalculate minimum
            eliminate[3] = findIndex(cantotals,eliminate[0]) + 1; // candidate for elimination round 3

            for (int i=0; i<5; i++){ // pulls third round from db to array
                thirdelim[i] = stv.getSecondElimination(eliminate[1],eliminate[2],i+1);
            }

            for (int i=0; i<5; i++) {
                cantotals[i] += thirdelim[i];   // adds transferred votes
            }
            cantotals[eliminate[1] - 1] = 0;  // sets eliminated candidates to 0
            cantotals[eliminate[2] - 1] = 0;
            cantotals[eliminate[3] - 1] = 0;

            for (int i=0; i<5; i++) {
                System.out.println(cantotals[i]);   //debug
            }

            // set up bar chart

            CategoryAxis xAxis = new CategoryAxis();
            xAxis.setLabel("Candidates");
            xAxis.setCategories(FXCollections.<String>observableArrayList(Arrays.asList(
                    "Can1", "Can2", "Can3", "Can4", "Can5")));

            NumberAxis yAxis = new NumberAxis();
            yAxis.setLabel("Votes");

            //stv_G = new BarChart<String,Number>(xAxis,yAxis);
            stv_G.setTitle("Single Transferable Vote");

            XYChart.Series<String, Number> series1 = new XYChart.Series<>();
            series1.setName("Single Transferable Vote");

            series1.getData().add(new XYChart.Data<>("Can1", cantotals[0]));
            series1.getData().add(new XYChart.Data<>("Can2", cantotals[1]));
            series1.getData().add(new XYChart.Data<>("Can3", cantotals[2]));
            series1.getData().add(new XYChart.Data<>("Can4", cantotals[3]));
            series1.getData().add(new XYChart.Data<>("Can5", cantotals[4]));

            stv_G.getData().addAll(series1);

            //add graph to ui
            stv_G.setVisible(true);
        }
        stv_P.setText("S Once Selected");
        stv_G.setVisible(true);
    }

    @FXML
    void RankedChoice(ActionEvent event) { // View Results using Accordian
        fptp_B.setSelected(false); stv_B.setSelected(false); rcv_B.setSelected(true);
        fptp_G.setVisible(false); stv_G.setVisible(false); rcv_G.setVisible(true);
        // Comment out line above if using hardcoded image results below, and vice versa
        //fptp_C1.setVisible(false); fptp_C2.setVisible(false); stv_C1.setVisible(false);rc_C1.setVisible(true); rc_C2.setVisible(false);

        if (rcv_P.getText() != "R Once Selected") {
            int[] cantotals = {0,0,0,0,0};
            int[] firstelim = {0,0,0,0,0};
            int[] secondelim = {0,0,0,0,0};
            int[] eliminate = {0,0,0,0,0}; // with 5 candidates, only 2 passes needed + min for 3 seats

            dbAccess rc = new dbAccess();

            for (int i=0; i<5; i++){ // pulls first round from db to array
                cantotals[i] = rc.getFirstVote(i);
            }

            eliminate[0] = minIgnoreZero(cantotals); // current minimum
            eliminate[1] = findIndex(cantotals,eliminate[0]) + 1; // candidate for elimination round 1

            for (int i=0; i<5; i++){ // pulls first elim from db to array
                firstelim[i] = rc.getFirstElimination(eliminate[1],i+1);
            }

            for (int i=0; i<5; i++) {
                cantotals[i] += firstelim[i];   // adds transferred votes
            }
            cantotals[eliminate[1] - 1] = 0;  // sets eliminated candidate to 0


            eliminate[0] = minIgnoreZero(cantotals); // recalculate minimum
            eliminate[2] = findIndex(cantotals,eliminate[0]) + 1; // candidate for elimination round 2

            for (int i=0; i<5; i++){ // pulls second round from db to array
                secondelim[i] = rc.getSecondElimination(eliminate[1],eliminate[2],i+1);
            }

            for (int i=0; i<5; i++) {
                cantotals[i] += secondelim[i];   // adds transferred votes
            }
            cantotals[eliminate[1] - 1] = 0;  // sets eliminated candidates to 0
            cantotals[eliminate[2] - 1] = 0;

            //set up bar chart

            CategoryAxis xAxis = new CategoryAxis();
            xAxis.setLabel("Candidates");
            xAxis.setCategories(FXCollections.<String>observableArrayList(Arrays.asList(
                    "Can1", "Can2", "Can3", "Can4", "Can5")));

            NumberAxis yAxis = new NumberAxis();
            yAxis.setLabel("Votes");

            //rcv_G = new BarChart<String,Number>(xAxis,yAxis);
            rcv_G.setTitle("Results by a Ranked Choice System");

            XYChart.Series<String, Number> series1 = new XYChart.Series<>();
            series1.setName("Rank Choice");

            series1.getData().add(new XYChart.Data<>("Can1", cantotals[0]));
            series1.getData().add(new XYChart.Data<>("Can2", cantotals[1]));
            series1.getData().add(new XYChart.Data<>("Can3", cantotals[2]));
            series1.getData().add(new XYChart.Data<>("Can4", cantotals[3]));
            series1.getData().add(new XYChart.Data<>("Can5", cantotals[4]));

            rcv_G.getData().addAll(series1);
            rcv_G.setVisible(true);
        }
        rcv_P.setText("R Once Selected");
        rcv_G.setVisible(true);
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
            validate_T.clear();
        }
    }

    // Menu Option 3
    @FXML
    void gotoLogin(ActionEvent event) {
        if (loginPane.isVisible()) {
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
        if (loginPane_B.getText() == "Log Out"){
            login_B.setText("Login to Vote");
            login_T.setText("Login Here");
            loginPane_B.setText("Voter Login");
            loginID_T.setMouseTransparent(false);
            username_T.setMouseTransparent(false);
            loginPassword_T.setMouseTransparent(false);
        }
        loginGrid1.setVisible(true);
        voterID_P.setVisible(true);
        loginGrid2.setVisible(false);
        validateLogin_T.setVisible(false);
        login_B.setText("Login to Vote");
        login_T.setText("Login Here");
        fptp_P.setText("F Never Selected");
        stv_P.setText("S Never Selected");
        rcv_P.setText("R Never Selected");
    }
    
    // Menu Option 4
    @FXML
    void gotoCandidates(ActionEvent event) {
        if (candidatesPane.isVisible()) {
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
        candidate1_A.setExpanded(true);
    }

    // Menu Option 5
    @FXML
    void gotoVoting(ActionEvent event) { // Only allow access if voter has logged in
        if (login_B.getText() != "Login Complete!" && login_T.getText() != "Now able to vote!" ) {
            //gotoLogin();
            return;
        }
        if (votePane.isVisible()) {
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
        fptpBallot_G.setVisible(true);
        stvBallot_G.setVisible(false);
        rcBallot_G.setVisible(false);
        endBallot_G.setVisible(false);
    }

    // Menu Option 6
    @FXML
    void gotoResults(ActionEvent event) {
        if (resultsPane.isVisible()) {
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
        fptp_C1.setVisible(false); fptp_C2.setVisible(false); stv_C1.setVisible(false);rc_C1.setVisible(false); rc_C2.setVisible(false);
        rcv_G.setTitle("Select One Above System to View Results");
        if (endBallot_G.isVisible()){
            login_B.setText("Login to Vote");
            login_T.setText("Login Here");
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
        username_T.clear();
        username_T.setMouseTransparent(false);
        loginPassword_T.clear();
        loginPassword_T.setMouseTransparent(false);
        bDayRecovery_T.clear();
        bDayRecovery_T.setMouseTransparent(false);
        idRecovery_T.clear();
        idRecovery_T.setMouseTransparent(false);
        loginID_T.clear();
        username_T1.clear();
        loginPassword_T1.clear();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert address_T != null : "fx:id=\"address_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert bDayRecovery_L != null : "fx:id=\"bDayRecovery_L\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert bDayRecovery_T != null : "fx:id=\"bDayRecovery_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert bDay_T != null : "fx:id=\"bDay_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert can1Description_T != null : "fx:id=\"can1Description_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert can2Description_T != null : "fx:id=\"can2Description_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert can3Description_T != null : "fx:id=\"can3Description_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert can4Description_T != null : "fx:id=\"can4Description_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert can5Description_T != null : "fx:id=\"can5Description_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert can6Description_T != null : "fx:id=\"can6Description_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert can1Policies_T != null : "fx:id=\"can1policies_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert can2Policies_T != null : "fx:id=\"can2policies_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert can3Policies_T != null : "fx:id=\"can3policies_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert can4Policies_T != null : "fx:id=\"can4policies_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert can5Policies_T != null : "fx:id=\"can5policies_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert can6Policies_T != null : "fx:id=\"can6policies_T\" was not injected: check your FXML file 'FDProject.fxml'.";
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
        oneOfOne_D.setValue("Choose One Below");
        oneOfOne_D.setItems(oneOfOne_DList);
        oneOfTwo_D.setValue("Choose One Below");
        oneOfTwo_D.setItems(oneOfTwo_DList);
        twoOfTwo_D.setValue("Choose One Below");
        twoOfTwo_D.setItems(oneOfTwo_DList);
        oneOfFour_D.setValue("Choose One Below");
        oneOfFour_D.setItems(oneOfFour_DList);
        twoOfFour_D.setValue("Choose One Below");
        twoOfFour_D.setItems(oneOfFour_DList);
        threeOfFour_D.setValue("Choose One Below");
        threeOfFour_D.setItems(oneOfFour_DList);
        fourOfFour_D.setValue("Choose One Below");
        fourOfFour_D.setItems(oneOfFour_DList);
        assert oneOfTwo_D != null : "fx:id=\"oneOfTwo_D\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert personalPassword_T != null : "fx:id=\"personalPassword_T\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert rcBallot_B != null : "fx:id=\"rcBallot_B\" was not injected: check your FXML file 'FDProject.fxml'.";
        assert rcBallot_G != null : "fx:id=\"rcBallot_G\" was not injected: check your FXML file 'FDProject.fxml'.";
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

    // utility functions
    public static int findIndex(int arr[], int t)
    {
        int len = arr.length;
        return IntStream.range(0, len)
                .filter(i -> t == arr[i])
                .findFirst() // first occurrence
                .orElse(-1); // No element found
    }

    public int minIgnoreZero(int [] array) { // IGNORES ZERO,
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min && array[i] > 0) { // standard min ignoring zero
                min = array[i];
            }
        }
        return min;
    }

    public int nameToId(String str){
        int cannum = 0;
        switch (str){
            case "Can1":
                cannum = 1;
            case "Can2":
                cannum = 2;
            case "Can3":
                cannum = 3;
            case "Can4":
                cannum = 4;
            case "Can5":
                cannum = 5;
        }
        return cannum;
    }

    // test driver
    public static void main(String[] args)
    {
       

    }

}
