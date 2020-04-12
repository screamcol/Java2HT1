package Lesson_1.from.site;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivanov Ivan");
        Person person2 = new Person("Petrov Petrovich");
        Person person3 = new Person("Sidorov Sidorovich");
        Person person4 = new Person("John Doe");

        Person person5 = new Person("Valeriy Snowmen");
        Person person6 = new Person("Alexander Aquamen");
        Person person7 = new Person("Dmitriy Unstoppable");
        Person person8 = new Person("Alexey Supermen");

        Team team1 = new Team(person1, person2, person3, person4, "Beavers");
        Team team2 = new Team(person5, person6, person7, person8, "Cheetahs");

        ObstacleCourse course = new ObstacleCourse();
        course.passCourse(team1);
        course.passCourse(team2);

        team1.showResult();
        team2.showResult();

    }
}
