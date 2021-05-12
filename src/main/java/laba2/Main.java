package laba2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        User user = context.getBean("userBean", User.class);

//        User user = new User();

        String text = "";
        int choice = 0;
        int index = 0;
        Scanner sc= new Scanner(System.in);

        while (choice != 7)
        {
            user.printMenu();
            choice = sc.nextInt();
            switch (choice)
            {
                case 1: System.out.println("Введите текст");
                    sc.nextLine();
                    text = sc.nextLine();
                    user.setText(text);
                    break;
                case 2: user.printText();
                    break;
                case 3: user.Save();
                    break;
                case 4: user.getLastSave();
                    break;
                case 5: user.printHistory();
                    break;
                case 6: System.out.println("Введите номер сохранения");
                    index = sc.nextInt();
                    user.getSaveByIndex(index);
                    break;
            }
        }
        sc.close();
        context.close();

    }
}
