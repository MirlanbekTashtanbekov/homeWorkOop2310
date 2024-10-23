import java.time.LocalDate;

public class Telegram extends Chat {
    private int number;
    private String chanel;

    public Telegram() {
    }

    public Telegram(String name, boolean isNew, LocalDate dateOfIssue, String designColor, int number, String chanel) {
        super(name, isNew, dateOfIssue, designColor);
        this.number = number;
        this.chanel = chanel;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getChanel() {
        return chanel;
    }

    public void setChanel(String chanel) {
        this.chanel = chanel;
    }

    public void getTelegramNumber() {
        WhatsApp whatsApp = new WhatsApp();
        if (this.number == whatsApp.getNumber()) {
            System.out.println("1 phone number for 2 Chats(Whats App & Telegram");
        }
    }

    public void getTelegramChanel() {
        System.out.println("The most frequently visited Telegram channel is - " + this.chanel);
    }

    @Override
    public String getChatName() {
        return super.getChatName();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTelegram number: " + number +
                "\nChanel: " + chanel;
    }
}
