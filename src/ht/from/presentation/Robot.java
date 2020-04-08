package ht.from.presentation;

public class Robot implements Being {
    private int jumpConstraints;
    private int runConstraints;

    Robot(int jumpConstraints, int runConstraints) {
        this.jumpConstraints = jumpConstraints;
        this.runConstraints = runConstraints;
    }

    @Override
    public boolean jump(int height) {
        if (height < jumpConstraints) {
            System.out.println("Robot successfully jumped over");
            return true;
        }
        else {
            System.out.println("Robot couldn't jump");
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (length < runConstraints) {
            System.out.println("Robot successfully run over");
            return true;
        }
        else {
            System.out.println("Robot couldn't run");
            return false;
        }
    }
}
