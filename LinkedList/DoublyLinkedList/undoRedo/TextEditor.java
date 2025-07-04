package undoRedo;

import java.util.LinkedList;

public class TextEditor {
    private TextState current;
    private int maxHistory = 10;
    private int totalStates = 0;

    // Add new state (like typing or action)
    public void addState(String newContent) {
        TextState newState = new TextState(newContent);

        // Cut off any redo history
        if (current != null) current.next = null;

        newState.prev = current;
        if (current != null) current.next = newState;
        current = newState;
        totalStates++;

        // Limit to last 10 states
        TextState temp = current;
        int count = 1;
        while (temp.prev != null && count < maxHistory) {
            temp = temp.prev;
            count++;
        }
        if (temp.prev != null) {
            temp.prev.next = null;
            temp.prev = null;
        }
    }

    // Undo to previous state
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No more undo available.");
        }
    }

    // Redo to next state
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("No more redo available.");
        }
    }

    // Display current state
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: \"" + current.content + "\"");
        } else {
            System.out.println("Editor is empty.");
        }
    }
}
