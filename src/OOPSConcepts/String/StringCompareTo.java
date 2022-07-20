package OOPSConcepts.String;

public class StringCompareTo {
/*
if s1 > s2, it returns positive number
if s1 < s2, it returns negative number
if s1 == s2, it returns 0
A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
*/
    public static void main(String[] args) {
        String s1 = "Pradip";
        String s2 = "Darji";
        String s3 = "Vishakha";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));


        String s4="hello";
        String s5="";
        String s6="me";
        System.out.println(s4.compareTo(s5));
        System.out.println(s5.compareTo(s6));
    }
}
