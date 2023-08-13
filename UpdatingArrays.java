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
        for (int i = 0; i <menu.length; i++){
//            System.out.println(i + ". " + menu[i]);
            newMenu[i] = menu[i]; //the loop runs three times and  copies every element from menu to newMenu
        }
        System.out.println(Arrays.toString(newMenu)); //this prints the contents of the array to a string

    }
}
