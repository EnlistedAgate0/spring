package laba2;


import java.util.ArrayList;
import java.util.List;

public class UserThread implements Runnable{
    private String userName;
    private List<String> phrases = new ArrayList<String>();


    public UserThread(String userName) {
        this.userName = userName;
        this.phrases.add("My");this.phrases.add("name");this.phrases.add("is");this.phrases.add(userName);
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    @Override
    public void run() {
        FormatDoc formatDoc = new FormatDoc();
        CareTaker careTaker = new CareTaker();
        Memento memento = new Memento();
        User user = new User(formatDoc, careTaker, memento);


        for(String phrase:phrases){
            System.out.println(userName + " writes down in the document the phrase: " + phrase);user.setText(phrase);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(userName + " saves the document");user.Save();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(userName+ " has this text in his document right now: " + user.getText());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n" + userName + " has this history: \n" + user.getHistory());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int rnd = rnd(0, 3);
        System.out.println(userName + " return Save number: " + Integer.toString(rnd));
        user.getSaveByIndex(rnd);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(userName+ " has this text in his document right now: " + user.getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
