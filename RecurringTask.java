public class RecurringTask extends Task {
    public String repeatInterval;
    public String startDate;

    public String getRepeatInterval() { return repeatInterval; }
    public String getStartDate() { return startDate; }

    public void setRepeatInterval(String repeatInterval) { this.repeatInterval = repeatInterval; }
    public void setStartDate(String startDate) { this.startDate = startDate; }

    RecurringTask(String name, String description, String date, String repeatInterval, String startDate) {
        super(name, description, date);
        this.repeatInterval = repeatInterval;
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return String.format("name: %s, description: %s, start: %s, repeatInterval: %s, startDate: %s",
                getName(), getDescription(), getDate(), repeatInterval, startDate);
    }
}
