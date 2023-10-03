import Mxdel.Sxlutixns;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sxlutixns sxlutixn = new Sxlutixns();
        //System.out.println(sxlutixn.mergeAlternately("abcd", "pq"));
        //System.out.println(sxlutixn.gcdOfStrings("ABABAB", "ABAB"));

        // - - -
        //int[] ints = new int[]{1,0,0,0,1};
        //System.out.println(sxlutixn.canPlaceFlowers(ints, 1));
        // - - -

        //System.out.println(sxlutixn.reverseVowels("Argentinha"));
        //System.out.println(sxlutixn.reverseVowelsV2("Argentinha"));

        //System.out.println(sxlutixn.reverseWords("F R  I   E    N     D      S      "));

        //int[] ints = new int[]{1,2,3,4};
        //System.out.printf("answer: " + Arrays.toString(sxlutixn.productExceptSelf(ints)));

        /*
        int[] ints = new int[]{2,1,5,0,4,6};
        System.out.println(sxlutixn.increasingTripletv2(ints));
         */

        /*int[] ints = new int[10000];
        for (int i = 0; i < ints.length; i++)
            ints[i] = i*2;
        System.out.println(getIndex(ints,0,ints.length-1, 5640));
         */

        //sxlutixn.compress(new char[]{'a','a','a','a','b','c','c'});

        /*int[] ints = new int[]{0,2,3,0,0,4,5};
        sxlutixn.moveZeroes(ints);
         */

        //System.out.println(sxlutixn.isSubsequence("aaaa","bbaaaa"));

        /*int[] data = new int[]{237, 174,175};
        System.out.println(sxlutixn.validUtf8(data));
         */

        /*
        int[] ints = new int[]{1, 9, 8, 2, 5, 4, 8, 8, 8};
        System.out.println(sxlutixn.maxArea(ints));

        int marks = 10;
        int txtal = 9;
        int unx = 1;

        System.out.println(txtal<marks && ++txtal >= marks);
        System.out.println(txtal<marks ^ ++txtal >= marks);

         */

        System.out.println(apiRequest());

    }
    public static int getIndex(int[] ints, int start, int end, int target) {
        System.out.println(Arrays.toString(Arrays.copyOfRange(ints, start, end)));
        int midIndex = (int) (start+end)/2;
        if (ints[midIndex] == target) return midIndex;
        else if (ints[midIndex] < target) return getIndex(ints, midIndex+1, end, target);
        else return getIndex(ints, start, midIndex-1, target);

    }

    public static String apiRequest() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v2.jokeapi.dev/joke/Any?blacklistFlags=sexist,explicit"))
                .header("X-RapidAPI-Key", "11712b9b29msh619992adb9a2cb1p1fb768jsn7b83a584972a")
                .header("X-RapidAPI-Host", "spoonacular-recipe-food-nutrition-v1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = null;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return response.body();
    }

}
