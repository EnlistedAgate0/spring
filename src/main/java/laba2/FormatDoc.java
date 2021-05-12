package laba2;

public class FormatDoc implements Extension{
    String text;

    @Override
    public void writeCode() {
        System.out.println("Document in .doc format.");
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public Memento createMomento(String time) {
        return new Memento(time, text);
    }

    @Override
    public void getDataFromMomento(Memento memento) {
        this.text = memento.getText();
    }

}
