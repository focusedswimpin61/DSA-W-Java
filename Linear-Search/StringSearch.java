public class StringSearch {
    public static void main(String[] args) {

        String name = "tejas";
        char char_to_search = 'u';
        System.out.println(Search(name, char_to_search));

    }

    static boolean Search(String name, char char_to_search) {
        // Use the correct variable "name" instead of "str"
        if (name.length() == 0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (char_to_search == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
