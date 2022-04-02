package recursion2;

public class RemoveX {
   
   public static String removeX(String s) {
    if (s.length() == 0) {
        return s;
    }

    String smallOutput = removeX(s.substring(1));

    if (s.charAt(0) == 'x') {
        return smallOutput;
    } else {
        return s.charAt(0) + smallOutput;
    }
   }
   
    public static void main(String[] args) {
        System.out.println(removeX("abcxcdsxdx"));
   }  
}
