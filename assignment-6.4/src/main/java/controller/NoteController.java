package controller;

import model.*;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class NoteController {

    @FXML
    private TextField titleField;

    @FXML
    private TextArea contentArea;

    @FXML
    private TextArea displayArea;

    private Notebook notebook;

    public NoteController() {
        notebook = new Notebook();
    }

    @FXML
    private void addNote() {
        String title = titleField.getText();
        String content = contentArea.getText();

        if (!title.isEmpty() && !content.isEmpty()) {
            Note note = new Note(title, content);
            notebook.addNote(note);
            displayNotes();

            titleField.clear();
            contentArea.clear();
        }
    }

    private void displayNotes() {
        StringBuilder notesText = new StringBuilder();
        for (Note note : notebook.getNotes()) {
            notesText.append(note).append("\n\n");
        }
        displayArea.setText(notesText.toString());
    }
}

