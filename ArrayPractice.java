public class ArrayPractice {
    public static void main(String[] args) {
        One-dimensional array
        int[] nums = {2, 4, 6, 8, 10};
        for (int n : nums) {
            System.out.println(n);
        }

        Two-dimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("\n2D Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
