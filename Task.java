public class Task {
    private String name;
    private String description;
    private String date;

    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getDate() { return date; }

    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setDate(String date) { this.date = date; }

    Task(String name, String description, String date) {
        this.name = name;
        this.description = description;
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("name: %s, description: %s, date: %s",
                name, description, date);
    }
}
