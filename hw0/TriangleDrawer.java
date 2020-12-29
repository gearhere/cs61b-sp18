public class TriangleDrawer {
    // Creative Exercise 1a: Drawing a Triangle
    public static void DrawTriangle(int N) {
        String star = "*";
        int col = 1;
        while (col <= N) {
            int num = 1;
            while (num < col){
                System.out.print(star);
                num += 1;
            }
            System.out.println(star);
            col += 1;
        }
    }
    public static void main(String[] args) {
        int N = 10;
        DrawTriangle(N);
    }
    
}