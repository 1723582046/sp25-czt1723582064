import org.junit.internal.runners.statements.FailOnTimeout;

/**
 * Skeleton file for HW0A.
 * Exercises sourced from Practice-It by the University of Washington.
 * Original problems available at: https://practiceit.cs.washington.edu/
 *
 * @author Erik Kizior
 */
public class JavaExercises {

    /**
     * Prints a right-aligned triangle of stars ('*') with 5 lines.
     * 打印一个右对齐的三角形星星（'*'），共 5 行。
     * The first row contains 1 star, the second 2 stars, and so on.
     * 第一行有 1 颗星，第二行有 2 颗星，以此类推。
     */
    public static void starTriangle() {
        // TODO: Fill in this function
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("\t");
        }
    }

    /**
     * Prints each character of a given string followed by its reverse index.
     * 打印给定字符串的每个字符及其反向索引。
     * Example: printIndexed("hello") -> h4e3l2l1o0
     * 示例： printIndexed("hello") -> h4e3l2l1o0
     */
    public static void printIndexed(String s) {
        // TODO: Fill in this function
        for (int i = 0; i < s.length(); i++) {
            int Index = s.length() - 1 - i;
            System.out.print(s.charAt(i) + "" + Index);
        }
        System.out.println("\t");
    }

    /**
     * Returns a new string where each character of the given string is repeated twice.
     * * 返回一个新字符串，其中给定字符串的每个字符都重复两次。
     * Example: stutter("hello") -> "hheelllloo"
     * 示例： stutter("hello") -> "hheelllloo"
     */
    public static String stutter(String s) {
        // TODO: Fill in this function
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append(s.charAt(i)).append(s.charAt(i));
        }
        return result.toString();
    }

    /**
     * Determines the quadrant of a Cartesian coordinate (x, y).
     * Returns:
     *   1 for the first quadrant (x > 0, y > 0),
     *   2 for the second quadrant (x < 0, y > 0),
     *   3 for the third quadrant (x < 0, y < 0),
     *   4 for the fourth quadrant (x > 0, y < 0),
     *   0 if the point lies on an axis.
     *
     *   确定直角坐标 (x, y) 的象限。
     *   返回值:
     *   1 表示第一象限（x >0，y >0）、
     *   2 表示第二象限（x <0，y >0）、
     *   3 代表第三象限（x <0，y <0）、
     *   4 表示第四象限（x >0，y <0）、
     *   如果点位于坐标轴上，则为 0。
     */
    public static int quadrant(int x, int y) {
        // TODO: Fill in this function
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else
            return 0;
    }

    public static void main(String[] args) {
        starTriangle();
        printIndexed("hello");
        System.out.println(stutter("hello"));
        System.out.println(quadrant(3, 4));  // Output: 1
        System.out.println(quadrant(-3, 4)); // Output: 2
        System.out.println(quadrant(-3, -4));// Output: 3
        System.out.println(quadrant(3, -4)); // Output: 4
        System.out.println(quadrant(0, 5));  // Output: 0
    }
}
