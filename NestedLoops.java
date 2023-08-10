public class NestedLoops {
    public static void main(String[] args) {


        for (int i = 0; i <= 3; i++){
            for (int j = 0; j <= 3; j++){
                System.out.print( "");
            }
            for (int n = 0; n <= i; n++){
                System.out.print( "  * ");
            }
            System.out.println();
        }
    }
}