// package Week3;

public class Program5 {

    static int[] checkIntersect(int rec1[], int rec2[]) {

        // rec = {x, y, width, height}
        int x1 = rec1[0];
        int y1 = rec1[1];
        int w1 = rec1[2];
        int h1 = rec1[3];

        int x2 = rec2[0];
        int y2 = rec2[1];
        int w2 = rec2[2];
        int h2 = rec2[3];

        // Calculate intersection edges
        int left   = Math.max(x1, x2);
        int bottom = Math.max(y1, y2);
        int right  = Math.min(x1 + w1, x2 + w2);
        int top    = Math.min(y1 + h1, y2 + h2);

        // No intersection
        if (right <= left || top <= bottom) {
            return null;
        }

        // Intersection rectangle
        int width  = right - left;
        int height = top - bottom;

        return new int[]{ left, bottom, width, height };
    }

    public static void main(String[] args) {

        int rec1[] = {1, 1, 4, 4};
        int rec2[] = {2, 2, 3, 3};

        int[] result = checkIntersect(rec1, rec2);

        if (result != null) {
            System.out.println("Intersection: (" +
                    result[0] + ", " +
                    result[1] + ", " +
                    result[2] + ", " +
                    result[3] + ")");
        } else {
            System.out.println("No intersection");
        }
    }
}
