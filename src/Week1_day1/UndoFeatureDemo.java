package Week1_day1;

import java.util.Stack;

class TextEditor {
    private String text = "";
    private Stack<String> history = new Stack<>();
    public void write(String newText) {
        history.push(text); 
        text += newText;
    }
    public void undo() {
        if (!history.isEmpty()) {
            text = history.pop();
        } else {
            System.out.println("Nothing to undo!");
        }
    }

    public String getText() {
        return text;
    }
}

public class UndoFeatureDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.write("Hello ");
        editor.write("World!");
        System.out.println("Current Text: " + editor.getText());

        editor.undo();
        System.out.println("After Undo: " + editor.getText());

        editor.undo();
        System.out.println("After Undo: " + editor.getText());
    }
}
