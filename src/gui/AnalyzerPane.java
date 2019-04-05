package gui;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

public class AnalyzerPane extends GridPane {

	private Stage stage;

	private TextField intputPath;
	private File transcriptDirectory;
	
	private TextField outputPath;
	private File outputDirectory;
	
	private TextField transcriptId;

	public AnalyzerPane(Stage stage) {

		this.stage = stage;

		Font font = new Font(14);

		Label intputPathLabel = new Label("Input Directory: ");
		intputPathLabel.setFont(font);
		GridPane.setHalignment(intputPathLabel, HPos.LEFT);

		intputPath = new TextField();
		intputPath.setFont(font);
		intputPath.setPrefWidth(150);
		intputPath.setAlignment(Pos.BASELINE_LEFT);
		intputPath.setText("path/to/transcripts");

		Button browseInput = new Button("Browse");
		browseInput.setFont(font);
		browseInput.setAlignment(Pos.BASELINE_LEFT);
		browseInput.setOnAction(this::setInputPath);

		Label outputPathLabel = new Label("Output Directory: ");
		intputPathLabel.setFont(font);
		GridPane.setHalignment(outputPathLabel, HPos.LEFT);

		outputPath = new TextField();
		outputPath.setFont(font);
		outputPath.setPrefWidth(150);
		outputPath.setAlignment(Pos.BASELINE_LEFT);
		outputPath.setText("path/to/output");

		Button browseOutput = new Button("Browse");
		browseOutput.setFont(font);
		browseOutput.setAlignment(Pos.BASELINE_LEFT);
		browseOutput.setOnAction(this::setOutputPath);

		Button btnReadTranscripts = new Button("Read Transcripts");
		btnReadTranscripts.setFont(font);
		btnReadTranscripts.setAlignment(Pos.BASELINE_CENTER);
		btnReadTranscripts.setOnAction(this::readTranscripts);
		
		Label viewLabel = new Label("Retrieve:");
		viewLabel.setFont(font);
		
		Label spacer1 = new Label(" ");
		spacer1.setFont(font);
		
		Label spacer2 = new Label(" ");
		spacer2.setFont(font);
		
		Button btnViewMasterList = new Button("Master List");
		btnViewMasterList.setFont(font);
		btnViewMasterList.setAlignment(Pos.BASELINE_LEFT);
		btnViewMasterList.setOnAction(this::viewMasterList);
		
		transcriptId = new TextField();
		transcriptId.setFont(font);
		transcriptId.setPrefWidth(20);
		transcriptId.setAlignment(Pos.BASELINE_LEFT);
		transcriptId.setText("Transcript ID");
		
		Button btnViewGPA = new Button("ind. GPA");
		btnViewGPA.setFont(font);
		btnViewGPA.setAlignment(Pos.BASELINE_LEFT);
		btnViewGPA.setOnAction(this::viewGPA);
		
		Button btnViewDistPerArea = new Button("Dist/Area");
		btnViewDistPerArea.setFont(font);
		btnViewDistPerArea.setAlignment(Pos.BASELINE_LEFT);
		btnViewDistPerArea.setOnAction(this::viewDistPerArea);
		
		Button btnViewDistPerCourse = new Button("Dist/Course");
		btnViewDistPerCourse.setFont(font);
		btnViewDistPerCourse.setAlignment(Pos.BASELINE_LEFT);
		btnViewDistPerCourse.setOnAction(this::vewDistPerCourse);

		setAlignment(Pos.CENTER);
		setHgap(5);
		setVgap(5);

		add(intputPathLabel, 0, 0);
		add(intputPath, 0, 1);
		add(browseInput, 1, 1);
		add(outputPathLabel, 2, 0);
		add(outputPath, 2, 1);
		add(browseOutput, 3, 1);
		add(spacer1, 0, 2);
		add(btnReadTranscripts, 1, 3);
		add(spacer2, 0, 4);
		add(viewLabel, 0, 5);
		add(btnViewMasterList, 0, 6);
		add(transcriptId, 2, 6);
		add(btnViewGPA, 1, 6);
		add(btnViewDistPerArea, 0, 7);
		add(btnViewDistPerCourse, 1, 7);
		
	}

	public void setInputPath(ActionEvent event) {
		DirectoryChooser dc = new DirectoryChooser();
		transcriptDirectory = dc.showDialog(stage);

		if (transcriptDirectory != null) {
			intputPath.setText(transcriptDirectory.getAbsolutePath());
		}
	}

	public void setOutputPath(ActionEvent event) {
		DirectoryChooser dc = new DirectoryChooser();
		outputDirectory = dc.showDialog(stage);
		
		if (outputDirectory != null) {
			outputPath.setText(outputDirectory.getAbsolutePath());
		}
	}
	
	public void readTranscripts(ActionEvent event) {
	
	}

	public void viewMasterList(ActionEvent event) {
		
	}
	
	public void viewGPA(ActionEvent event) {
		
	}
	
	public void viewDistPerArea(ActionEvent event) {
		
	}
	
	public void vewDistPerCourse(ActionEvent event) {
		
	}
	
}