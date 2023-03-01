    import java.util.Scanner;

    public class atv1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Digite uma string: ");
            String s = input.nextLine();
            input.close();
            System.out.println("String invertida: " + inverteString(s));
        }

        public static String inverteString(String s) {
            if (s.isEmpty()) {
                return "";
            } else {
                return inverteString(s.substring(1)) + s.charAt(0);
            }
        }
    }

