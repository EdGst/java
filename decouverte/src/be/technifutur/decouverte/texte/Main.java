package be.technifutur.decouverte.texte;

public class Main {
    public static void main(String[] args) {
        String texte1 = "Bonjour";
        char lettre = ' ';

        System.out.println(texte1.length());
        System.out.println(texte1.charAt(2));
        System.out.println(texte1.substring(3));
        System.out.println(texte1.substring(3, 6));

        String testEgal1 = "toto";
        String testEgal2 = "to";

        System.out.println(testEgal1);
        System.out.println(testEgal2);
        System.out.println(testEgal1 == testEgal2);
        System.out.println(testEgal1.equals(testEgal2));

        int index = 1;
        char car = 'a';
        System.out.println("le caractère se trouve à la position " + (index + 1));
        System.out.println(index + 1 + "est la position ");
        String result = index * index + "";
        result = String.valueOf(index * index);

        String multiline = """
                Ligne1
                    Ligne 2
                """;

        String testFormat = String.format("le caractère %s se trouve à la position %s %n", car, index+1);
        // dans testFormat on utilise %n pour le retour à la ligne
        System.out.println(testFormat);

        /*char  charAt(int index);

        char  charAt(int index);
        int compareTo(String anotherString) +/0/-;
        int compareToIgnoreCase(String str);
        boolean contains(String s)
        static String copyValueOf(char[] data)
        char[] toCharArray()
        boolean endsWith(String suffix)
        boolean equals(Object anObject)
        boolean equalsIgnoreCase(String anotherString)
        static String format(String format, Object... args)
        int indexOf(int ch)
        int indexOf(String str, int fromIndex)
        int lastIndexOf(int ch)
        int lastIndexOf(String str, int fromIndex)
        int length()
        String replace(char oldChar, char newChar)
        String replaceAll(String regex, String replacement)
        String[] split(String regex)
        String substring(int beginIndex, int endIndex)
        String toLowerCase()
        String toUpperCase()
        String trim()*/
    
    }
}