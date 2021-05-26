package laba2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
//    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//            "applicationContext.xml"
//    );

//    private Extension originator = context.getBean("formatDocBean", Extension.class);
//    private final CareTaker careTaker = context.getBean("careTakerBean", CareTaker.class);
//    private Memento memento = context.getBean("mementoBean", Memento.class);

    private  FormatDoc originator;
    private  CareTaker careTaker;
    private  Memento memento;

    public User(FormatDoc originator, CareTaker careTaker, Memento memento) {
        this.originator = originator;
        this.careTaker = careTaker;
        this.memento = memento;
    }

    // Метод ввода текста в файл
    public void setText(String text)
    {
        originator.setText(text);

    }

    // Метод вывода текста из файла
    public void printText()
    {
        System.out.println(originator.getText());
    }

    // Метод сохранения текущего текста
    public void Save()
    {
        String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        careTaker.setMemento(originator.createMomento(timeStamp));
    }

    // Метод вывода истории сохранений
    public void printHistory()
    {
        for (int i = 0; i < careTaker.getHistory().size(); i++) {
            memento = careTaker.getMemento(i);
            System.out.println("№" + i + " " + memento.getTime() + ": " +  memento.getText());
        }
    }

    // Метод восстановления текста из последнего сохрнанения
    public void getLastSave()
    {
        originator.getDataFromMomento(careTaker.getMemento());
    }

    // Метод восстановления текста из сохранения по индексу
    public void getSaveByIndex(int index)
    {
        originator.getDataFromMomento(careTaker.getMemento(index));
    }

    // Метод вывода меню пользователя
    public void printMenu()
    {
        System.out.println("Выберите пункт меню");
        System.out.println("1 Ввести текст в документ");
        System.out.println("2 Вывести текст из документа");
        System.out.println("3 Сохранить");
        System.out.println("4 Откатить к прошлому сохранению");
        System.out.println("5 Вывести историю сохранений");
        System.out.println("6 Откатить к сохраенению, по номеру сохранения");
        System.out.println("7 Выход");
    }
}
