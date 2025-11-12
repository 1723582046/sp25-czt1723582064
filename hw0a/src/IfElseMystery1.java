/**
 * Exercise sourced from Practice-It by the University of Washington.
 * 练习来源于华盛顿大学的 Practice-It。
 * Original problems available at: https://practiceit.cs.washington.edu/
 * 原始问题见： https://practiceit.cs.washington.edu/
 * @author Erik Kizior
 */
public class IfElseMystery1 {
    public static void ifElseMystery1(int x, int y) {
        int z = 4;
        if (z <= x) {
            z = x + 1;
        } else {
            z = z + 9;
        }
        if (z <= y) {
            y++;
        }
        System.out.println(z + " " + y);
    }

    // TODO: For each call below, indicate what output is produced.
    // TODO: 请指出以下每次调用的输出结果。
    public static void main(String[] args) {
        ifElseMystery1(3, 20);
        ifElseMystery1(4, 5);
        ifElseMystery1(5, 5);
        ifElseMystery1(6, 10);
    }
}

/* Before running the code, type your answer below.

TODO: Write output here
13 21
5 6
6 5
7 11


Then, click the green play button to check your work. */