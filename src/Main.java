import java.util.Scanner;

import static java.util.Calendar.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Task of teacher
         * Deadline : 04.03.2024 / 11:00
         * Күндөргө enum түзүңүз (Monday, Tuesday ...)
         * Консолдон бир күндү белгилеңиз. Эгер Monday болсо -
         * анда "Дуйшөмбү куну жава окуйм" же Tuesday болсо - анда
         * "Шейшемби күнү англис тили сабагын окуйм" деп күнгө жараша кайсы
         * сабакты окуганыңызды консолго чыгарыңыз.
         * Жуманын күндөрүн кыргыз тилинде көрсөтүңүз.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day MONDAY, TUESDAY and so forth,....");
        String userInput = scanner.nextLine().toUpperCase();

        Days day = null;
        for (Days days : Days.values()) {
            if (days.name().equals(userInput)) {
                day = days;
                break;
            }
        }
        if (day != null) {
            System.out.println(day.getWeek());
            }else{
                System.out.println("You wrote not properly.");
            }
        }
    }
