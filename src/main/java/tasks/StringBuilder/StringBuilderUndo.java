package tasks.StringBuilder;

import java.util.Stack;

public class StringBuilderUndo {
    private StringBuilder stringBuilder;
    private final Stack<String> history;

    public StringBuilderUndo() {
        stringBuilder = new StringBuilder();
        history = new Stack<>();
        saveState();
    }

    private void saveState() {
        history.push(stringBuilder.toString());
    }

    public void append(String text) {
        saveState();
        stringBuilder.append(text);
    }

    public String toString() {
        return stringBuilder.toString();
    }

    public void insert(int position, String text) {
        saveState();
        stringBuilder.insert(position, text);
    }

    public void delete(int start, int end) {
        saveState();
        stringBuilder.delete(start, end);
    }

    public void undo() {
        if (history.size() > 1) {
            history.pop();
            String previousState = history.peek();
            stringBuilder = new StringBuilder(previousState);
        }
    }

}

