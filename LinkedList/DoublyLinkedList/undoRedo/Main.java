package undoRedo;

public class Main {
	    public static void main(String[] args) {
	        TextEditor editor = new TextEditor();

	        editor.addState("Hello");
	        editor.addState("Hello, World");
	        editor.addState("Hello, World!");
	        editor.displayCurrentState(); // Hello, World!

	        System.out.println("\nUndoing...");
	        editor.undo();
	        editor.displayCurrentState(); // Hello, World

	        System.out.println("\nUndoing...");
	        editor.undo();
	        editor.displayCurrentState(); // Hello

	        System.out.println("\nRedoing...");
	        editor.redo();
	        editor.displayCurrentState(); // Hello, World

	        System.out.println("\nAdding new text state...");
	        editor.addState("Hi there!");
	        editor.displayCurrentState(); // Hi there!

	        System.out.println("\nTrying to redo (should not work):");
	        editor.redo(); // Should say no redo
	    }
	

}
