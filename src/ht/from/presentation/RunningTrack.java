package ht.from.presentation;

public class RunningTrack implements Course {
    private int length;

    RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean passCourse(Being being) {
        return being.run(length);
    }
}
