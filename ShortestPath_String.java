public class ShortestPath_String {
    public static int ShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char move = path.charAt(i);
            if (move == 'S') {
                y--;
            } else if (move == 'N') {
                y++;
            } else if (move == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;

        return (int) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        String path = "NENESWSWW";
        System.out.println(ShortestPath(path));
    }
}
