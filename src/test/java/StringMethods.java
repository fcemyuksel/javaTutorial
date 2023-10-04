public class StringMethods {
    public static void main(String[] args) {
        String str1="merhaba merhaba merhaba";
        System.out.println(str1.length());
        System.out.println(str1.lastIndexOf(3));
        System.out.println(str1.charAt(3));
        System.out.println(str1.concat("cemcem cem cem"));
        System.out.println(str1.contains("er"));
        System.out.println(str1.startsWith("ha"));
        System.out.println(str1.indexOf("h"));
        System.out.println(str1.indexOf("q"));
        System.out.println(str1.getBytes());
        System.out.println(str1.replace('a','o'));


        char[] charArray=str1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println( "index " + i+" is " + charArray[i]);
        }
    }
}
