class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;      // rows
        int m = arr[0].length;   // cols

        int fr = 0, lr = n - 1;  // first row, last row
        int fc = 0, lc = m - 1;  // first col, last col

        while (fr <= lr && fc <= lc) {
            // left -> right on first row
            for (int j = fc; j <= lc; j++) {
                ans.add(arr[fr][j]);
            }
            fr++;

            // top -> bottom on last col
            for (int i = fr; i <= lr; i++) {
                ans.add(arr[i][lc]);
            }
            lc--;

            // right -> left on last row (agar row bachi ho)
            if (fr <= lr) {
                for (int j = lc; j >= fc; j--) {
                    ans.add(arr[lr][j]);
                }
                lr--;
            }

            // bottom -> top on first col (agar col bachi ho)
            if (fc <= lc) {
                for (int i = lr; i >= fr; i--) {
                    ans.add(arr[i][fc]);
                }
                fc++;
            }
        }

        return ans;
    }
}