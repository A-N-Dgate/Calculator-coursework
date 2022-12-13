
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * This class is used to hold the programming for the GUI.
 * 
 * @author Anusha Din
 *
 */
public class GuiView {

  @FXML
  private Button changeStack;

  @FXML
  private Label currentSystem;

  @FXML
  private Label displayAnswer;

  @FXML
  private Button enterButton;

  @FXML
  private TextField enterExpression;

  @FXML
  void isPressed(ActionEvent event) {
    RevPolishCalc calc = new RevPolishCalc();
    float answer = calc.evaluate(getExpression());
    String displayString = Float.toString(answer);
    displayAnswer.setText(displayString);
  }

  String getExpression() {
    return enterExpression.getText();
  }

}

