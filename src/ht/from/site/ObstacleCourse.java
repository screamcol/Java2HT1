package ht.from.site;

class ObstacleCourse {
    private double []obstacles;
    private final static int NUMBER_OF_OBSTACLES = 4;

    private void initializeObstacle() {
        obstacles = new double[NUMBER_OF_OBSTACLES];
        for (int i = 0; i < NUMBER_OF_OBSTACLES; i++) {
            obstacles[i] = Math.random() * 6;
        }
    }

    void passCourse(Team team) {
        initializeObstacle();
        for (int i = 0; i < team.getPersonArr().length; i++) {
            if (team.getPersonArr()[i].getStrength() > obstacles[i]) {
                team.getPersonArr()[i].setPassCourse(true);
            }
        }
    }
}
