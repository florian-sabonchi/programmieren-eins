import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        liesZahl();
    }

    public static Integer liesZahl(){
        System.out.println("Bitte Zahl eingeben:");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int index = 0; index < input.length(); index++){
            char c_char = input.toCharArray()[index];

            if(!(c_char >= '1' && c_char <= '9')){
                if (c_char == '+' || c_char == '-' && index == 0){
                    continue;
                }
                return liesZahl();
            }
        }

        return Integer.valueOf(input);
    }
}