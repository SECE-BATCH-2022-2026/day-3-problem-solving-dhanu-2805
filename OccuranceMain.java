import java.util.Scanner;

class OccurranceMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String str1 = sc.nextLine();

        System.out.print("Enter String 2: ");
        String str2 = sc.nextLine();

        int count = countOccurrances(str1, str2);

        System.out.println("String 2 occurs in String 1: " + count + " times");
    }

    public static int countOccurrances(String s1, String s2) {
        int count = 0;
        int index = 0;

        while ((index = s1.indexOf(s2, index)) != -1) {
            count++;
            index += s2.length();
        }

        return count;
    }
}
