class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        int[] firstRow = new int[twoDimArray[0].length];
        int[] lastRow = new int[twoDimArray[twoDimArray.length - 1].length];
 
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (i == 0) {
                    firstRow[j] = twoDimArray[i][j];
                }
                if (i == twoDimArray.length - 1) {
                    lastRow[j] = twoDimArray[i][j];
                }
            }
        }
 
        System.out.println(firstRow[0] + " " + firstRow[firstRow.length - 1]);
        System.out.println(lastRow[0] + " " + lastRow[lastRow.length - 1]);
    }
}
