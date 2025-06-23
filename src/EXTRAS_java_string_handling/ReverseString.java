package EXTRAS_java_string_handling;

 public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";
        String reversed = "";

        for (int i = input.length() -  1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
      System.out.println("Reversed String :" + reversed);
    }
}

