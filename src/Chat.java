import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Chat {

    private static String name;
    private boolean isNew;
    private LocalDate dateOfIssue;
    private static String designColor;

    public Chat() {
    }

    public Chat(String name, boolean isNew, LocalDate dateOfIssue, String designColor) {
        this.name = name;
        this.isNew = isNew;
        this.dateOfIssue = dateOfIssue;
        this.designColor = designColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getDesignColor() {
        return designColor;
    }

    public void setDesignColor(String designColor) {
        this.designColor = designColor;
    }

    public String getChatName() {
        return "Chat Name: " + name + ", Color: " + designColor;
    }

    public boolean getIsNewChat() {
        LocalDate now = LocalDate.now();
        long yearsBetween = ChronoUnit.YEARS.between(dateOfIssue, now);
        return yearsBetween <= 5;
    }

    @Override
    public String toString() {
        return "\nName: " + name +
                "\nChat is New: " + isNew +
                "\nDate of issue: " + dateOfIssue +
                "\nDesign Color: " + designColor;
    }


}










