import java.util.Scanner;

public class MineSweeperMap {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        System.out.println("enter width: ");
        int width = sc.nextInt();

        System.out.println("enter height: ");
        int height = sc.nextInt();

        String[][] map = new String[height][width];

        fillArray(map);

        System.out.println("enter numbers of bomb: ");
        int bombs = sc.nextInt();
        fillBomb(bombs, map);

        //String[][] map = new String[][]

        final int MAP_WIDTH = map[0].length;
        final int MAP_HEIGHT = map.length;
        String[][] mapReport = new String[MAP_HEIGHT][MAP_WIDTH];
        for (int y = 0; y < MAP_HEIGHT; y++) {
            for (int x = 0; x < MAP_WIDTH; x++) {
                String currentCell = map[y][x];
                if (currentCell.equals("*")) {
                    mapReport[y][x] = "*";
                } else {
                    int minesAround = 0;

                    final int[][] NEIGHBOURS_ORDINATE = {
                            {y, x - 1}, {y - 1, x - 1}, {y + 1, x - 1},
                            {y, x + 1}, {y - 1, x + 1}, {y + 1, x + 1},
                            {y - 1, x}, {y + 1, x}

                    };

                    for (int[] cellAround : NEIGHBOURS_ORDINATE) {
                        int xCellAround = cellAround[1];
                        int yCellAround = cellAround[0];

                        boolean isOutOfMap = xCellAround < 0
                                || xCellAround >= MAP_WIDTH
                                || yCellAround < 0
                                || yCellAround >= MAP_HEIGHT;
                        if (isOutOfMap) continue;

                        boolean isMine = map[yCellAround][xCellAround].equals("*");
                        if (isMine) minesAround++;
                    }

                    mapReport[y][x] = String.valueOf(minesAround);
                }
            }
        }

        for (int y = 0; y < map.length; y++) {
            System.out.println("");
            for (int x = 0; x < MAP_WIDTH; x++) {
                String currentCellReport = mapReport[y][x];
                System.out.printf("%4s", currentCellReport);
            }
        }
    }

    public static void fillArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = ".";
            }
        }
    }


    public static void fillBomb(int number, String[][] arr) {
        int y = 0;
        int x = 0;

        for (int i = 0; i < number; i++) {
            y = (int) (Math.random() * arr.length);
            x = (int) (Math.random() * arr[0].length);

            if (arr[y][x].equals("*")) {
                i--;
            } else {
                arr[y][x] = "*";
            }

        }
    }

}
