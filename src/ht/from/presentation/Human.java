package ht.from.presentation;

public class Human implements Being {
    private int jumpConstraints;
    private int runConstraints;

    Human(int jumpConstraints, int runConstraints) {
        this.jumpConstraints = jumpConstraints;
        this.runConstraints = runConstraints;
    }

    @Override
    public boolean jump(int height) {
        if (height < jumpConstraints) {
            System.out.println("Human successfully jumped over");
            return true;
        }
        else {
            System.out.println("Human couldn't jump");
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (length < runConstraints) {
            System.out.println("Human successfully run over");
            return true;
        }
        else {
            System.out.println("Human couldn't run");
            return false;
        }
    }
}
