package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        if (cathetusLength > 0) {
            for (int x = 1; x <= cathetusLength; x++) {
                for (int y = 1; y <= cathetusLength; y++) {
                    if (x == cathetusLength || y == 1 || y == x || y < x) {
                        System.out.print("8");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
