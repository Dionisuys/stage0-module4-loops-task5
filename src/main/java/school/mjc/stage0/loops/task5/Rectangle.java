package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        if (length > 0 && height > 0) {
            for (int x = 1; x <= height; x++) {
                for (int y = 1; y <= length; y++) {
                    if (x == 1 || x == height || y == 1 || y == length) {
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
