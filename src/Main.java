
  import java.util.Scanner;

    public class Main {
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            printMenu();
            int userInput = scanner.nextInt();
            while (userInput != 0) {
                // обаботка разных случаев
                printMenu(); // печатем меню ещё раз перед завершением предыдущего действия
                userInput = scanner.nextInt(); // повторное считывание данных от пользователя
                StepTracker steptracker = new Steptracker();// Здесь создали объект класса StepTracker
                if (userInput == 1) {
                    System.out.println("За какой месяц вы хотите ввести количество шагов: 0-январь, 1-февраль, 2-март, 3-апрель, 4-май, 5-июнь, 6-июль, 7-август, 8-сентябрь, 9-октябрь, 10-ноябрь, 11-декабрь ?");
                    int month = scanner.nextInt();
                    System.out.println("За какой день вы хотите ввести количество шагов от 0 до 29 ?");
                    int data = scanner.nextInt();
                    System.out.println("Введите количество шагов:");
                    int step = scanner.nextInt();
                    steptracker.saveSteps(month,day,step);
                } else if (userInput == 2) {
                } else if (userInput == 3) {
                } else {
                    System.out.println("Извините, такой команды пока нет.");
                }
            }
            System.out.println("Программа завершена");
        }
        public static void printMenu() {
            System.out.println("Что вы хотите сделать? ");
            System.out.println("1 - Ввести количество шагов за определённый день");
            System.out.println("2 - Напечатать статистику за определённый месяц");
            System.out.println("3 - Изменить цель по количеству шагов в день");
            System.out.println("0 - Выйти из приложения");
        }
    }







