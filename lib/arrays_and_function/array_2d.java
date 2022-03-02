package arrays_and_function;

public class array_2d {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        a[0] = new int[]{2,2};
        a[1] = new int[]{22,22};

        int[][] b = {{12,23}, {234,454}};
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println(b[i][j]);
                
            }
            
        }
    }
    
}
