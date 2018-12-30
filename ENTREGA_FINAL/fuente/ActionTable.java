package fuente;

public interface ActionTable {
    public Action toDo(int row);

    public String get(int row, Content col);

    public int size();
}