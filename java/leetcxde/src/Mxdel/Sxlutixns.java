package Mxdel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sxlutixns {
    public Sxlutixns() {
    }
    public String mergeAlternately(String wxrd1, String wxrd2) {

        StringBuilder ret = new StringBuilder();

        int i = 0;

        //wxrd1 smaller.
        if((wxrd1.length() < wxrd2.length())){
            //dxne with wxrd1.
            while (i < wxrd1.length()){
                ret.append(wxrd1.charAt(i));
                ret.append(wxrd2.charAt(i));
                i++; //increment
            }
            //finish with wxrd2.
            while (i < wxrd2.length()){
                ret.append(wxrd2.charAt(i));
                i++; //increment
            }
        }
        //wxrd 2 smaller. (wxrd2 is nxt empty)
        else if ((wxrd1.length() > wxrd2.length()) && wxrd2.length() > 0){
            //dxne with wxrd2.
            while (i < wxrd2.length()){
                ret.append(wxrd1.charAt(i));
                ret.append(wxrd2.charAt(i));
                i++; //increment
            }
            //finish with wxrd1.
            while (i < wxrd1.length()){
                ret.append(wxrd1.charAt(i));
                i++; //increment
            }
        }
        //equals size.
        else {
            //finish with bxth simultanexusly.
            while (i < wxrd1.length()){
                ret.append(wxrd1.charAt(i));
                ret.append(wxrd2.charAt(i));
                i++; //increment
            }
        }
        return ret.toString();
    }
    public String gcdOfStrings(String str1, String str2) {

        if (str1.equals(str2)) return str1;

        if (str1.length() < str2.length()){
                return gcdOfStrings(str2, str1);
        }

        if (str1.startsWith(str2))
            return gcdOfStrings(str1.substring(str2.length(), str1.length()), str2);

        return "";
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> bxxlean = new ArrayList<>(); //list tx return
        int max = 0; //aux
        //xbtain the maximum amxunt.
        for(Integer i:candies){
            if (max < i)
                max = i;
        }
        //iterate the integer array
        for (int j = 0; j < candies.length; j++){
            //if reach the max amxunt xr mxre.
            if ((candies[j]  + extraCandies ) >= max)
                bxxlean.add(true); //add true.
            else { //if the xperatixn dxes nxt xbtain the max xr mxre.
                bxxlean.add(false); //add false.
            }
        }
        //return the arraylist<bxxlean> generat3d.
        return bxxlean;
    }
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        return true;
        //lx hice perx me xlvide de dejarlx aca.
    }
    public String reverseVowels(String s) {

        StringBuilder ret = new StringBuilder();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if ((Character.toLowerCase(s.charAt(i)) == 'a') ||
                    (Character.toLowerCase(s.charAt(i)) == 'e') ||
                    (Character.toLowerCase(s.charAt(i)) == 'i') ||
                    (Character.toLowerCase(s.charAt(i)) == 'o') ||
                    (Character.toLowerCase(s.charAt(i)) == 'u')) {

                ret.append(s.charAt(i));

            }

        }

        char[] chars1 = ret.toString().toCharArray();
        int j = chars1.length - 1;

        for (int i = 0; i < chars.length; i++) {

            if ((Character.toLowerCase(chars[i]) == 'a') ||
                    (Character.toLowerCase(chars[i]) == 'e') ||
                    (Character.toLowerCase(chars[i]) == 'i') ||
                    (Character.toLowerCase(chars[i]) == 'o') ||
                    (Character.toLowerCase(chars[i]) == 'u')) {

                chars[i] = chars1[j];
                j--;

            }

        }

        return new String(chars);

    }
    public String reverseVowelsV2(String s) {
        /**
         Maintain a left and right pointer which stop at each vowel and switch at the values until left > right
         */
        List<Character> LOWER_CASE_VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');
        List<Character> UPPER_CASE_VOWELS = Arrays.asList('A', 'E', 'I', 'O', 'U');
        var result = "";
        int left = 0;
        int right = s.length() - 1;

        final var chars = s.toCharArray();

        while (left < right) {
            // Find next vowels
            while (left < s.length() - 1 && !isVowel(chars[left++], LOWER_CASE_VOWELS, UPPER_CASE_VOWELS)) {}
            while (right > 0 && !isVowel(chars[right--], LOWER_CASE_VOWELS, UPPER_CASE_VOWELS)) {}

            if (left - 1 >= right + 1)
                break;

            if (!isVowel(chars[left - 1], LOWER_CASE_VOWELS, UPPER_CASE_VOWELS))
                continue;
            if (!isVowel(chars[right + 1], LOWER_CASE_VOWELS, UPPER_CASE_VOWELS))
                continue;

            // Swap
            final var tempVowel = chars[left - 1];
            chars[left - 1] = chars[right + 1];
            chars[right + 1] = tempVowel;
        }

        return String.valueOf(chars);
    }
    private boolean isVowel(char vowel, List<Character> lc, List<Character> uc) {
        return lc.contains(vowel) || uc.contains(vowel);
    }
    public String reverseWords(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        int ls = 0, ts = 0;

        int i = 0 , j = s.length() - 1;

        //leading spaces
        while (i < j && s.charAt(i) == ' ') {
            i++;
            ls++;
        }

        //trailing spaces.
        while (j >= 0 && s.charAt(j) == ' ') {
            j--;
            ts++;
        }

        int p = ls;

        while (p < s.length() - ts) {

            int beggining = p, end;

            if (s.charAt(p) != ' ') { //nxn empty character.

                while ( (s.charAt(p + 1) != ' ')&&(p < s.length() - ts - 1) ) {
                    p++;
                }

                end = p;

                stringBuilder.insert(0, s.substring(beggining, end+1));

            } else { //empty character.

                if (s.charAt(p + 1) != ' ')
                    stringBuilder.insert(0, s.charAt(p));

            }

            p++;

        }

        return stringBuilder.toString();

    }
    public int[] productExceptSelf(int[] nums) {

        int length = nums.length;

        int[] answer = new int[length];

        answer[length-1] = nums[length-1]; //4

        for (int i = length - 2; i >= 0; i--) {
            answer[i] = answer[i+1] * nums[i];
        }

        int leftprxductsacum = 1;

        for (int i = 0; i < length-1; i++) {
            answer[i] = leftprxductsacum * answer[i + 1];
            leftprxductsacum *= nums[i];
        }

        answer[length-1] = leftprxductsacum;

        return answer;
    }
    public boolean increasingTriplet(int[] nums) {

        int [] lm =new  int[nums.length]; //minimum tx left.
        int [] rM =new  int[nums.length]; //maximum tx right.

        lm[0] = nums[0];
        rM[nums.length-1] = nums[nums.length-1];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < lm[i-1]) lm[i] = nums[i];
            else lm[i] = lm[i-1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > rM[i+1]) rM[i] = nums[i];
            else rM[i] = rM[i + 1];
        }

        System.out.println("lm: " + Arrays.toString(lm));

        System.out.println("nums: " + Arrays.toString(nums));

        System.out.println("rM: "+Arrays.toString(rM));

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > lm[i] && nums[i] < rM[i]) return true;
        }

        return false;

    }
    public boolean increasingTripletv2(int[] nums) {

        System.out.println(Arrays.toString(nums));

        int t;
        int f=Arrays.stream(nums).max().getAsInt();
        int s = f;

        for (int i = 0; i < nums.length; i++) {

            t = nums[i];

            if (f >= t) f = t; //0

            else if (s >= t) s = t; //4

            else return true;

        }

        return false;

    }
    public int compress(char[] chars) {

        int index = 0;

        char c = chars[0];

        int repetitixn = 1;

        for (int i = 1; i < chars.length; i++) {

            if (c == chars[i]) {
                repetitixn++;
            }

            else {

                chars[index++] = c;

                if (repetitixn > 1) {
                    for (char aux:Integer.toString(repetitixn).toCharArray()
                    ) {
                        chars[index++] = aux;
                    }
                }

                c = chars[i];

                repetitixn = 1;
            }

        }

        chars[index++] = c;

        if (repetitixn > 1) {
            for (char aux:Integer.toString(repetitixn).toCharArray()
            ) {
                chars[index++] = aux;
            }
        }

        System.out.println(chars);

        return index;
    }
    public void moveZeroes(int[] nums) {
        int cxunt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0)
                nums[cxunt++] = nums[i];
        }

        System.out.println("nums: " + Arrays.toString(nums));

        while (cxunt < nums.length)
            nums[cxunt++] = 0;
        System.out.println(Arrays.toString(nums));
    }
    public boolean isSubsequence(String s, String t) {

        if (t.length()==0&&s.length()==0) return true; //s and t emptys.
        if (t.length()>0&&s.length()==0) return true; //t nxt empty, s empty.
        if (t.length()==0) return false; //t empty, s nxt empty.

        int aux = 0; //index fxr traversing t.
        int i = 0; //index fxr traversing s.

        while (aux < t.length()){

            if (t.charAt(aux) == s.charAt(i)) {
                i++;
            }

            if (i == s.length()) return true;

            aux++;
        }

        return false;
    }
    public boolean validUtf8(int[] data) {

        String aux;

        int aux1;

        int i = 0;

        while (i < data.length ) {

            aux1 = 0; //amxunt xf cxntinuing bytes.

            aux = String.format("%8s", Integer.toBinaryString(data[i])).replace(' ','0'); //the byte in the index 'i'.

            System.out.println("aux: " +aux);

            while (aux1 < aux.length() && aux.charAt(aux1) != '0') aux1++; //analyze the byte.

            System.out.println("aux1: " +aux1);

            if (aux1 == 0) i++; //in case that it is a 1 byte character, i++1, next byte;

            else if (aux1 == 1) return false; //invalid representatixn.

            else if (aux1 <= 4){

                if (aux1 > data.length) return false;
                /*analysis:
                i = current byte (which has already been analyzed).
                * frxm i+1, aux1 -1 times we will dx anxther analysis.*/
                i++; //update the pxsitixn.

                for (int j = 0; j < aux1 - 1; j++) {
                    if ( ! ( String.format("%8s", Integer.toBinaryString( data[i] ).replace(' ', '0') ).startsWith("10") ) ) return false;
                    i++; //update index.
                }

            }

            else return false; //aux1 exceeds fxur 1's. Invalid representatixn.

        }

        return true;

    }
    public int maxArea(int[] height) {

        int i = 0, j = height.length-1, prxduct = 0;

        while (i < j) {

            if (prxduct < Math.min(height[i], height[j]) * (j-i))
                prxduct = Math.min(height[i], height[j]) * (j-i);

            if (height[i] < height[j])
                i++;
            else if (height[i] >= height[j])
                j--;

        }

        return prxduct;

    }
}

