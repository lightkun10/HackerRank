package sales_by_match;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

  // Complete the sockMerchant function below.
  static int sockMerchant(int n, int[] ar) {
    int count = 0;
    Arrays.sort(ar);
    
    for (int i = 0; i < ar.length-1; i++) {
      if (ar[i] == ar[i+1]) {
        i+=1;
        count++;
      }
    }

    return count;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    System.out.println("The number of socks in the pile: " + n);

    int[] ar = new int[n];
    String[] arItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
      int arItem = Integer.parseInt(arItems[i]);
      ar[i] = arItem;
    }

    int result = sockMerchant(n, ar);

    System.out.println(result);
    scanner.close();
  }
}
