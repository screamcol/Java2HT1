package ht.from.presentation;

public class Cat implements Being {
    private int jumpConstraints;
    private int runConstraints;

    Cat(int jumpConstraints, int runConstraints) {
        this.jumpConstraints = jumpConstraints;
        this.runConstraints = runConstraints;
    }

    @Override
    public boolean jump(int height) {
        if (height < jumpConstraints) {
            System.out.println("Cat successfully jumped over");
            return true;
        }
        else {
            System.out.println("Cat couldn't jump");
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (length < runConstraints) {
            System.out.println("Cat successfully run over");
            return true;
        }
        else {
            System.out.println("Cat couldn't run");
            return false;
        }
    }
}
