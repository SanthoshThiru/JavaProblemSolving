public class ExtraCharBitManipulation {
        public static void main(String[] args) {
            String baseString = "world";
            String toCompareString = "worlsd";
            String concat=baseString+toCompareString;
    
            System.out.println("The Extra Character Found Using Bit Manipulation is:");
            char extraChar = findExtraCharacterUsingXOR(concat);
            System.out.println(extraChar);
    
            String anotherBase = "abcd";
            String anotherCompare = "abcde";
            String concat2=anotherBase+anotherCompare;
            System.out.println("\nThe Extra Character Found Using Bit Manipulation for another set is:");
            char anotherExtra = findExtraCharacterUsingXOR(concat2);
            System.out.println(anotherExtra);
    
            String yetAnotherBase = "a";
            String yetAnotherCompare = "ba";
            String concat3=yetAnotherBase+yetAnotherCompare;
            System.out.println("\nThe Extra Character Found Using Bit Manipulation for yet another set is:");
            char yetAnotherExtra = findExtraCharacterUsingXOR(concat3);
            System.out.println(yetAnotherExtra);
        }
    
        public static char findExtraCharacterUsingXOR(String s1) {
            int xorSum = 0;
            for (char c : s1.toCharArray()) {
                xorSum ^= c;
            }
            return (char) xorSum;
        }
    }
