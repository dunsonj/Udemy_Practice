import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String [] menu = {"Expresso", "Ice Coffee", "Macchiato"};
        System.out.println(Arrays.toString(menu));
//        String menuString = Arrays.toString(menu);
//        System.out.println(menuString);
        menu[2] = "Latte";
        System.out.println(Arrays.toString(menu));

        //to expand an array a new array has to be done
        String [] newMenu = new String[5];


    }
}
