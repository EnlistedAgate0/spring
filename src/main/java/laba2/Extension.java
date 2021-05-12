package laba2;

public interface Extension {
    void writeCode();
    public String getText();
    public void setText(String text);
    public Memento createMomento(String time);
    public void getDataFromMomento(Memento memento);
}
