package laba2;

public class Memento {
    String time;
    String text;

    public Memento(String time, String text) {
        this.time = time;
        this.text = text;
    }
    public Memento() {
        this.time = "";
        this.text = "";
    }
    public String getText() {
        return text;
    }

    public String getTime() {
        return time;
    }
}
