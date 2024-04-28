package refactoring_guru.memento.example.editor;

public interface Command {
    String getName();
    void execute();
}
