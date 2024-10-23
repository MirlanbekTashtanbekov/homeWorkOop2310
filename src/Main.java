import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        WhatsApp whatsApp1 = new WhatsApp("Whats App1", true, LocalDate.of(2020, 9, 20), "White", 705600700, "On the work");
        System.out.println(whatsApp1);
//        whatsApp1.getInfoNumberWhats();
//        whatsApp1.getChatName();

        WhatsApp whatsApp2 = new WhatsApp("Whats App2", true, LocalDate.of(2022, 2, 15), "Black", 705607080, "Busy");
        System.out.println(whatsApp2);
        whatsApp2.getInfoNumberWhats();
//        whatsApp2.getChatName();

        Telegram telegram1 = new Telegram("Telegram1", true, LocalDate.of(2023, 3, 11), "Brown", 705600700, "Java Programmer");
        System.out.println(telegram1);
        telegram1.getTelegramNumber();
        telegram1.getTelegramChanel();
//        telegram1.getChatName();

        Telegram telegram2 = new Telegram("Telegram2", false, LocalDate.of(2016, 2, 2), "Yellow", 555708090, "Kyrgyzstan");
        System.out.println(telegram2);
        telegram2.getTelegramNumber();
        telegram2.getTelegramChanel();
//        telegram2.getChatName();

        Instagram instagram1 = new Instagram("Instagram1", true, LocalDate.of(2021, 9, 5), "Grey", "Fokus@2022", 'F');
        System.out.println(instagram1);
        instagram1.getInstagramInfo();
//        instagram1.getChatName();

        Instagram instagram2 = new Instagram("Instagram2", true, LocalDate.of(2023, 8, 6), "Silver", "Acqua@2023", 'M');
        System.out.println(instagram2);
        instagram2.getInstagramInfo();
//        instagram2.getChatName();

        Slack slack1 = new Slack("Slack1", true, LocalDate.of(2023, 9, 9), "Purple", "JavaScript", "Eminem");
        System.out.println(slack1);
        slack1.getSlackInfo();
//        slack1.getChatName();

        Slack slack2 = new Slack("Slack2", true, LocalDate.of(2024, 9, 9), "White", "Java-16", "Mirlan");
        System.out.println(slack2);
        slack2.getSlackInfo();
//        slack2.getChatName();

        Chat[] chats = {whatsApp1, whatsApp2, telegram1, telegram2, instagram1, instagram2, slack1, slack2};
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~new chat~~~~~~~~~~~");

        findNewChat(chats);








    }

    public static void findNewChat(Chat[] chats) {
        Chat newChat = null;
        for (Chat chat : chats) {
            if (chat.getIsNewChat()) {
                if (newChat == null || chat.getDateOfIssue().isAfter(newChat.getDateOfIssue())) {
                    newChat = chat;
                }
            }
        }

        if (newChat != null) {
            System.out.println(newChat.getChatName() + " - This is new chat.");
        }
    }
}
