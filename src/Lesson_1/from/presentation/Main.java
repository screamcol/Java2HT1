package Lesson_1.from.presentation;

public class Main {
    public static void main(String[] args) {
        Being[] beings = {new Human(2, 5), new Cat(4, 10), new Robot(1, 20)};
        Course[] courses = {new RunningTrack(9), new Wall(2)};
        for (Being being : beings) {
            for (Course course : courses) {
                if (!course.passCourse(being)) break;
            }
        }
    }
}
