package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Max");
        User user2 = new User("Alex");
        User user3 = new User("Oleg");

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Как дела?");

        user2.sendMessage(user1, "Привет!");
        user2.sendMessage(user1, "Хорошо");
        user2.sendMessage(user1, "А твои как?");

        user3.sendMessage(user1, "Добрый вечер!");
        user3.sendMessage(user1, "Как на счёт прогуляться?");
        user3.sendMessage(user1, "Например в 7 вечера");

        user1.sendMessage(user3, "Добрый");
        user1.sendMessage(user3, "Да, можно");
        user1.sendMessage(user3, "Только давай попозже");

        user3.sendMessage(user1, "Договорились");

        MessageDatabase.showDialog(user1, user3);

        user1.subscribe(user3);
        user3.subscribe(user1);
        System.out.println(user1.getSubscriptions());
        System.out.println(user1.isFriend(user3));

        System.out.println(MessageDatabase.getMessages());


    }
}
