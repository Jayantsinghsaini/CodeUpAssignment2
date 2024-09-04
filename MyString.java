import java.util.Scanner;
import java.util.StringTokenizer;
public class MyString {
    public static void reverse(String s1) {
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        System.out.println(s2);
    }
    public static void palindrome(String s1){
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        if (s1.equals(s2)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    public static void append(String s1){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string (to terminate this case, enter 'clr' )");
    while (true) {
        String s2 = sc.nextLine();
        if(s2.equals("clr")){
            break;
        }
        else {
            s1 = s1+" "+s2;
            System.out.println(s1);
        }
    }
}
    public static void sort(String s1){
    char arr[] = s1.toCharArray();
    for (int i = 0; i < arr.length ; i++) {
        for (int j = 0; j <arr.length-1-i; j++) {
            if (arr[j] > arr[j+1]){
                char temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
    }
        System.out.println();
}
    public static void splice(String s1){
        Scanner sc = new Scanner(System.in);
    char arr[] =s1.toCharArray();
    System.out.println("enter the index");
    int index = sc.nextInt();
    System.out.println("enter the length");
    int length = sc.nextInt();
    char arr1[] = new char[arr.length-length];
    for (int i = 0; i < arr.length; i++) {
        if (i < index){
            arr1[i]=arr[i];
        }
        else if(i> (index + length -1)){
            arr1[i-length]=arr[i];
        }
    }
    for (int i = 0; i < arr1.length ; i++) {
        System.out.print(arr1[i]);

    }
        System.out.println();
}
    public static void shift(String s1){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index fro shifting");
        int index = sc.nextInt();
        String part1 ="";
        String part2 ="";
        for (int i = 0; i <=index; i++) {
            part1 = part1 + s1.charAt(i);
        }

        for (int i = (index +1); i <s1.length() ; i++) {
            part2 = part2 + s1.charAt(i);
        }
        System.out.println(part2 + part1);
    }
    public static void maxrepeat(String s1){
            int maxCount = 0;
            char maxChar = s1.charAt(0);

            for (int i = 0; i < s1.length(); i++) {
                char currentChar = s1.charAt(i);
                int count = 0;
                for (int j = 0; j < s1.length(); j++) {
                    if (s1.charAt(j) == currentChar) {
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    maxChar = currentChar;
                }
            }

            System.out.println("char "+maxChar );
            System.out.println("count "+maxCount);
        }
    public static void replace(String s1) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        System.out.println("enter the character");
        char replacechar = sc.next().charAt(0);
        System.out.println("enter the replacement character");
        char replacewith = sc.next().charAt(0);

        for (int i = 0; i < s1.length(); i++) {
            char currentChar = s1.charAt(i);
            if (currentChar == replacechar) {
                result = result + replacewith;
            } else {
                result = result + currentChar;
            }
        }

        System.out.println(result);
    }
    public static void split(String s1){
        StringTokenizer tokens = new StringTokenizer(s1, " ");
        int tokenCount = tokens.countTokens();
        String[] tokensArray = new String[tokenCount];
        tokens = new StringTokenizer(s1, " ");

        int index = 0;
        while (tokens.hasMoreTokens()) {
            tokensArray[index++] = tokens.nextToken();
        }

        for (int i = 0; i < tokensArray.length ; i++) {
            System.out.print(tokensArray[i]+",");
        }
        System.out.println();
    }
    public static void countwords(String s1){
        String arr[] = s1.split(" ");
        System.out.println("total words are " + arr.length);

    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            Constant constant = new Constant();
        System.out.println("enter the String");
        String s1 =sc.nextLine();
            System.out.println(constant.METHOD_COMMENT);
            while (true){
                System.out.println("enter the methodkey");
                int methodkey = sc.nextInt();

                switch (methodkey) {
                case 1:
                    reverse(s1);
                    break;
                case 2:
                    palindrome(s1);
                    break;
                case 3:
                    append(s1);
                    break;
                case 4:
                    sort(s1);
                    break;
                case 5:
                    splice(s1);
                    break;
                case 6:
                    shift(s1);
                    break;
                case 7:
                    maxrepeat(s1);
                    break;
                case 8:
                    replace(s1);
                    break;
                case 9:
                    split(s1);
                    break;
                case 10:
                    countwords(s1);
                    break;
                    default:
                        System.out.println("Invalid method key");
                        break;

            }}
}}