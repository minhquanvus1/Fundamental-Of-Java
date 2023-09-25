public class StringManipulationExample {
    public static void main(String[] args) {
        String str1 = "Hello ";
        System.out.println(str1);

        String str2 = new String("World");
        System.out.println(str2);

        String str3 = str1 + str2;
        System.out.println(str3);

        // find length of a string (also count whitespace)
        System.out.println(str3.length());
        // get a character at a particular index of a string
        System.out.println(str3.charAt(0));
        // concat the str2 into the str1
        System.out.println(str1.concat(str2));
        // get the substring from a in a string [start_index, end_index) (exclude end_index)
        System.out.println(str3.substring(0,5));
        // compare the value of 2 strings if they are equal or not
        System.out.println(str1.equals(str2));
        // check if a string contains a particular substring or not
        System.out.println(str3.contains("Hello"));
        // convert a string to lowercase/uppercase
        System.out.println(str3.toUpperCase());
        // remove the trailing space in a string
        System.out.println(str3.trim());







    }
}
