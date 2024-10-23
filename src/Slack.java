import java.time.LocalDate;

public class Slack extends Chat {
    private String group;
    private String student;

    public Slack() {
    }

    public Slack(String name, boolean isNew, LocalDate dateOfIssue, String designColor, String group, String student) {
        super(name, isNew, dateOfIssue, designColor);
        this.group = group;
        this.student = student;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public void getSlackInfo() {
        System.out.println("Student: " + this.student + " studies in the group " + this.group);
    }

    @Override
    public String getChatName() {
        return super.getChatName();
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nSlack group: " + group + '\'' +
                "\nStudent: " + student;
    }
}
