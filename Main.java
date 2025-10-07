import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        while (true) {
            System.out.println("1 - добавить задачу; 2 - удалить задачу; 3 - получить список задач; 4 - получить задачу по id; 5 - получить кол-во задач; 0 - выход");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    taskManager.newTask();
                    break;
                case "2":
                    System.out.println("введите индекс");
                    input = scanner.nextLine();
                    taskManager.deleteTask(Integer.parseInt(input));
                    break;
                case "3":
                    taskManager.printTasks();
                    break;
                case "4":
                    System.out.println("введите индекс");
                    input = scanner.nextLine();
                    taskManager.printTask(Integer.parseInt(input));
                    break;
                case "5":
                    System.out.println(taskManager.getTasksCount());
                    break;
                case "0":
                    System.exit(0);
            }
        }
    }
}