public class TwoDArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int m [][] = new int [3][4];
        for(int i= 0;i<m.length;i++) {
            for(int j = 0; j<m[i].length;j++) {
            m [i][j] =(int )(Math.random()*100)+1;
            }
        }
        for(int i = 0 ;i<m.length;i++) {
            for(int j = 0;j<m[i].length;j++) {
                System.out.println(m[i][j] + " ");
            }
            System.out.println();
          }
        }
    }
