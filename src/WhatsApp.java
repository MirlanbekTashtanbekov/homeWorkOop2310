import java.time.LocalDate;

public class WhatsApp extends Chat {
    private int number;
    private String information;

    public WhatsApp() {
    }

    public WhatsApp(String name, boolean isNew, LocalDate dateOfIssue, String designColor, int number, String information) {
        super(name, isNew, dateOfIssue, designColor);
        this.number = number;
        this.information = information;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public void getInfoNumberWhats() {
        System.out.println("Whats App number: " + this.number + "\nInformation: " + this.information);
    }

    @Override
    public String getChatName() {
        return super.getChatName();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nWhats app number: " + number +
                "\nInformation: " + information;
    }
}
