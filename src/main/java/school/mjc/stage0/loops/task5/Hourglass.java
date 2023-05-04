package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height > 0) {
            for (int x = 1; x <= height; x++) {
                for (int y = 1; y <= height; y++) {
                    if (x == 1 || x == height || y == x ||
                            y == (height - x + 1) ||
                            (y < (height - x + 1) && y > x) ||
                            (y > (height - x + 1) && y < x)) {
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
