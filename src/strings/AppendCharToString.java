public class AppendCharToString {
    public static void main(String[] args) {
        String str = "Hello";
        char ch = '!';
        
        // Method 1: Using StringBuilder (Efficient for multiple appends)
        StringBuilder sb = new StringBuilder(str);
        sb.append(ch);
        String result1 = sb.toString();
        System.out.println(result1); // Output: Hello!

        // Method 2: Using String concatenation (+) (Creates a new String object)
        String result2 = str + ch;
        System.out.println(result2); // Output: Hello!

        // Method 3: Using String.concat() (Creates a new String object)
        String result3 = str.concat(String.valueOf(ch));
        System.out.println(result3); // Output: Hello!
    }
}