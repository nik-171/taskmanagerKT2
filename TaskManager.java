import java.util.*;

public class TaskManager {
    private static List<Task> tasks;
    private static int tasksCount;

    public int getTasksCount() { return tasksCount; }
    public List<Task> getTasks() {
        if (!tasks.isEmpty()) {
            return tasks;
        } else {
            System.out.println("список пуст");
            return null;
        }
    }
    public Task getTask(int id) {
        try {
            return tasks.get(id);
        } catch (Throwable e) {
            System.out.println("ошибка индекса");
            return null;
        }
    }

    public void printTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.printf("id: %d  %s%n", i, tasks.get(i));
        }
    }

    public void printTask(int id) {
        try {
            System.out.printf("id: %d  %s%n", id, tasks.get(id));
        } catch (Throwable e) {
            System.out.println("ошибка индекса");
        }
    }

    public void setTask(Task task) { tasks.add(task); }

    TaskManager() {
        tasks = new ArrayList<>();
    }

    public void newTask() {
        Scanner scanner = new Scanner(System.in);
        String[] split;
        System.out.println("1 - обычная задача; 2 - задача с дедлайном; 3 - повторяющаяся задача");
        switch (scanner.nextLine()) {
            case "1":
                System.out.println("введите имя, описание и дату через символ ','");
                split = scanner.nextLine().split(",");
                try {
                    Task task = new Task(split[0], split[1], split[2]);
                    tasks.add(task);
                    tasksCount++;
                } catch (Throwable e) {
                    System.out.println("инвалид инпут");
                }
                break;
            case "2":
                System.out.println("введите имя, описание, дату начала и дату дедлайна через символ ','");
                split = scanner.nextLine().split(",");
                try {
                    DeadlineTask deadlineTask = new DeadlineTask(split[0], split[1], split[2], split[3]);
                    tasksCount++;
                    tasks.add(deadlineTask);
                } catch (Throwable e) {
                    System.out.println("инвалид инпут");
                }
                break;
            case "3":
                System.out.println("введите имя, описание, дату, дату начала и интервал повторения в днях через символ ','");
                split = scanner.nextLine().split(",");
                try {
                    RecurringTask recurringTask = new RecurringTask(split[0], split[1], split[2], split[3], split[4]);
                    tasksCount++;
                    tasks.add(recurringTask);
                } catch (Throwable e) {
                    System.out.println("инвалид инпут");
                }
                break;
        }
    }

    public void deleteTask(int id) {
        try {
            tasks.remove(id);
            tasksCount--;
        } catch (Throwable e) {
            System.out.println("ошибка индекса");
        }
    }
}
