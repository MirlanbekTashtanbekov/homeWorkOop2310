import java.time.LocalDate;

public class Instagram extends Chat {
    private String account;
    private char gender;

    public Instagram() {
    }

    public Instagram(String name, boolean isNew, LocalDate dateOfIssue, String designColor, String account, char gender) {
        super(name, isNew, dateOfIssue, designColor);
        this.account = account;
        this.gender = gender;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void getInstagramInfo() {
        System.out.println("Account :" + this.account + "Gender of user: " + this.gender);
    }

    @Override
    public String getChatName() {
        return super.getChatName();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nInstagram account: " + account +
                "\nGender: " + gender;
    }
}
