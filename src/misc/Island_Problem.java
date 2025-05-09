public class Island_Problem {

    public static void main(String[] args) {
        int[][] iparr = {
                { 1, 1, 1, 1, 0 },
                { 1, 0, 1, 1, 0 },
                { 1, 0, 0, 1, 0 },
                { 0, 1, 1, 0, 0 } };
        int count = 0;
        for (int r = 0; r < iparr.length; r++) {
            for (int c = 0; c < iparr[r].length; c++) {
                if (iparr[r][c] == 1) {
                    count++;
                    dulr(iparr, r, c);
                }
            }
        }

        System.out.println("No. of Islands present are " + count);
    }

    public static void dulr(int[][] iparr, int r, int c) {

        if (r < 0 || r == iparr.length || c < 0 || c == iparr[r].length) {
            return;
        }

        if (iparr[r][c] == 0) {
            return;
        }

        iparr[r][c] = 0;
        dulr(iparr, r + 1, c);
        dulr(iparr, r - 1, c);
        dulr(iparr, r, c - 1);
        dulr(iparr, r, c + 1);
    }
}