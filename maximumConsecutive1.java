import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        String str=Integer.toBinaryString(n);
        char arr[]=str.toCharArray();
        int count=0;
        int maxCount=0;
        for(int i=0;i<arr.length;i++)
        {
        if (arr[i]=='1')
        {
        count++;
        }
        else if(arr[i]=='0')
        {
        if (count>maxCount)
        {
        maxCount=count;
        }
        count=0;
        }
    }
    if (count>maxCount)
    {
    maxCount=count;
    }
    System.out.println(maxCount);
}
}
