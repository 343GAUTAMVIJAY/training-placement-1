import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b){
        if (a.length() != b.length()){
            return false;
        }

        a=a.toLowerCase();
        b=b.toLowerCase();

        int[] charCountA = new int[26];
        int[] charCountB = new int[26];

        for (int i = 0; i < a.length(); i++){
            charCountA[a.charAt(i) - 'a']++;
            charCountB[b.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (charCountA[i] != charCountB[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String a=scan.next();
        String b=scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
