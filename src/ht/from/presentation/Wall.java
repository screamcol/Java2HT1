package ht.from.presentation;

public class Wall implements Course {
    private int height;

    Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean passCourse(Being being) {
        return being.jump(height);
    }
}
