public class DeadlineTask extends Task {
    private String deadlineDate;

    private String getDeadlineDate() { return deadlineDate; }

    private void setDeadlineDate() { this.deadlineDate = deadlineDate; }

    DeadlineTask(String name, String description, String date, String deadlineDate) {
        super(name, description, date);
        this.deadlineDate = deadlineDate;
    }

    @Override
    public String toString() {
        return String.format("name: %s, description: %s, start: %s, deadline: %s",
                getName(), getDescription(), getDate(), deadlineDate);
    }
}
