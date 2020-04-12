package Lesson_1.from.site;

class Team {
    private String teamName;
    private Person[] personArr;

    Team(Person person1, Person person2, Person person3, Person person4, String teamName) {
        personArr = new Person[]{person1, person2, person3, person4};
        this.teamName = teamName;
    }

    Person[] getPersonArr() {
        return personArr;
    }

    String getTeamName() {
        return teamName;
    }

    private void getInfoAboutTeam(Person[] personArr, Team team) {
        StringBuilder sb = new StringBuilder();
        sb.append(team.getTeamName()).append(" : ");
        for (Person person : personArr) {
            sb.append(person.getName()).append(" ");
        }
        System.out.println(sb);
    }

    void showResult() {
        getInfoAboutTeam(personArr, this);
        StringBuilder sb = new StringBuilder();
        sb.append(this.getTeamName()).append(" : ");
        for (Person person : personArr) {
            if (person.isPassCourse()) {
                sb.append(person.getName()).append(" ");
            }
        }
        System.out.println("Persons who pass course int team " + sb);
    }
}
