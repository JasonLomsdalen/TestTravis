import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class MyCalculator extends Application
{
	Label result;
	Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonDot, buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEqual, buttonClear;
	int i=1;
	//StringBuilder firstNum = new StringBuilder("");
	//StringBuilder secondNum = new StringBuilder("");
	int firstNum = 0;
	int secondNum = 0;
	boolean firstDone = false;
	String operation = null;
	OperationDecider operationDecider = new OperationDecider();
	
	
	public static void main(String args[]) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception{
		stage.setTitle("Single Digit Sum Calculator");
		result = new Label("0");
		
		Pane root = new Pane();
		
		Scene scene = new Scene(root, 350, 500);
		stage.setScene(scene);
		
		button0 = new Button("0");
		button1 = new Button("1");
		button2 = new Button("2");
		button3 = new Button("3");
		button4 = new Button("4");
		button5 = new Button("5");
		button6 = new Button("6");
		button7 = new Button("7");
		button8 = new Button("8");
		button9 = new Button("9");
		buttonDot = new Button(".");
		buttonAdd = new Button("+");
		buttonSubtract = new Button("-");
		buttonMultiply = new Button("*");
		buttonDivide = new Button("/");
		buttonEqual = new Button("=");
		buttonClear = new Button("Clear");
		
		button0.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (firstDone == false)
				{
					//firstNum.append("0");
					firstNum = 0;
					result.setText(Integer.toString(firstNum));
				}
				else
				{
					//secondNum.append("0");
					secondNum = 0;
					result.setText(Integer.toString(secondNum));
				}
			}
		});
		button1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (firstDone == false)
				{
					//firstNum.append("1");
					firstNum = 1;
					result.setText(Integer.toString(firstNum));
				}
				else
				{
					//secondNum.append("1");
					secondNum = 1;
					result.setText(Integer.toString(secondNum));
				}	
			}
		});
		button2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (firstDone == false)
				{
					//firstNum.append("2");
					firstNum = 2;
					result.setText(Integer.toString(firstNum));
				}
				else
				{
					//secondNum.append("2");
					secondNum = 2;
					result.setText(Integer.toString(secondNum));
				}
			}
		});
		button3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (firstDone == false)
				{
					//firstNum.append("3");
					firstNum = 3;
					result.setText(Integer.toString(firstNum));
				}
				else
				{
					//secondNum.append("3");
					secondNum = 3;
					result.setText(Integer.toString(secondNum));
				}
			}
		});
		button4.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (firstDone == false)
				{
					//firstNum.append("4");
					firstNum = 4;
					result.setText(Integer.toString(firstNum));
				}
				else
				{
					//secondNum.append("4");
					secondNum = 4;
					result.setText(Integer.toString(secondNum));
				}
			}
		});
		button5.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (firstDone == false)
				{
					//firstNum.append("5");
					firstNum = 5;
					result.setText(Integer.toString(firstNum));
				}
				else
				{
					//secondNum.append("5");
					secondNum = 5;
					result.setText(Integer.toString(secondNum));
				}
			}
		});
		button6.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (firstDone == false)
				{
					//firstNum.append("6");
					firstNum = 6;
					result.setText(Integer.toString(firstNum));
				}
				else
				{
					//secondNum.append("6");
					secondNum = 6;
					result.setText(Integer.toString(secondNum));
				}	
			}
		});
		button7.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (firstDone == false)
				{
					//firstNum.append("7");
					firstNum = 7;
					result.setText(Integer.toString(firstNum));
				}
				else
				{
					//secondNum.append("7");
					secondNum = 7;
					result.setText(Integer.toString(secondNum));
				}
			}
		});
		button8.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (firstDone == false)
				{
					//firstNum.append("8");
					firstNum = 8;
					result.setText(Integer.toString(firstNum));
				}
				else
				{
					//secondNum.append("8");
					secondNum = 8;
					result.setText(Integer.toString(secondNum));
				}
			}
		});
		button9.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (firstDone == false)
				{
					//firstNum.append("9");
					firstNum = 9;
					result.setText(Integer.toString(firstNum));
				}
				else
				{
					//secondNum.append("9");
					secondNum = 9;
					result.setText(Integer.toString(secondNum));
				}
			}
		});
		buttonAdd.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				firstDone = true;
				operation = "+";
			}
		});
		buttonMultiply.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				firstDone = true;
				operation = "*";
			}
		});
		buttonDivide.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				firstDone = true;
				operation = "/";
			}
		});
		buttonSubtract.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				firstDone = true;
				operation = "-";
			}
		});
		buttonEqual.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Operation operation1 = operationDecider.getOperation(operation);
				int sum = operation1.calculate(firstNum, secondNum);
				//int sum = firstNum + secondNum;
				result.setText(Integer.toString(sum));
				firstDone=false;
			}
		});
		
		buttonClear.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				result.setText("0");
				firstNum=0;
				secondNum=0;
				firstDone=false;
			}
		});
		
		buttonMultiply.setLayoutX(100);
		buttonMultiply.setLayoutY(300);
		buttonDivide.setLayoutX(150);
		buttonDivide.setLayoutY(300);
		buttonSubtract.setLayoutX(200);
		buttonSubtract.setLayoutY(300);
		button0.setLayoutX(100);
		button0.setLayoutY(250);
		buttonDot.setLayoutX(150);
		buttonDot.setLayoutY(250);
		buttonAdd.setLayoutX(200);
		buttonAdd.setLayoutY(250);
		buttonEqual.setLayoutX(250);
		buttonEqual.setLayoutY(250);
		buttonClear.setLayoutX(250);
		buttonClear.setLayoutY(100);
		button1.setLayoutX(100);
		button1.setLayoutY(200);
		button2.setLayoutX(150);
		button2.setLayoutY(200);
		button3.setLayoutX(200);
		button3.setLayoutY(200);
		button4.setLayoutX(100);
		button4.setLayoutY(150);
		button5.setLayoutX(150);
		button5.setLayoutY(150);
		button6.setLayoutX(200);
		button6.setLayoutY(150);
		button7.setLayoutX(100);
		button7.setLayoutY(100);
		button8.setLayoutX(150);
		button8.setLayoutY(100);
		button9.setLayoutX(200);
		button9.setLayoutY(100);
		
		root.getChildren().addAll(result, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonDot, buttonAdd, buttonMultiply, buttonSubtract, buttonDivide, buttonEqual, buttonClear);
		stage.show();
	}
}
