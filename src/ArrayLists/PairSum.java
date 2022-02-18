import java.util.*;

/*
You are given an integer array 'ARR' of size 'N' and an integer 'S'. Your task is to return the list of all pairs of elements such that each sum of elements of each pair equals 'S'.
       Note:
       Each pair should be sorted i.e the first value should be less than or equals to the second value.

       Return the list of pairs sorted in non-decreasing order of their first value. In case if two pairs have the same first value, the pair with a smaller second value should come first.
       Input Format:
       The first line of input contains two space-separated integers 'N' and 'S', denoting the size of the input array and the value of 'S'.

       The second and last line of input contains 'N' space-separated integers, denoting the elements of the input array: ARR[i] where 0 <= i < 'N'.
       Output Format:
       Print 'C' lines, each line contains one pair i.e two space-separated integers, where 'C' denotes the count of pairs having sum equals to given value 'S'.
       Note:
       You are not required to print the output, it has already been taken care of. Just implement the function.
       Constraints:
       1 <= N <= 10^3
       -10^5 <= ARR[i] <= 10^5
       -2 * 10^5 <= S <= 2 * 10^5

       Time Limit: 1 sec
       Sample Input 1:
       5 5
       1 2 3 4 5
       Sample Output 1:
       1 4
       2 3
       Explaination For Sample Output 1:
       Here, 1 + 4 = 5
       2 + 3 = 5
       Hence the output will be, (1,4) , (2,3).
       Sample Input 2:
       5 0
       2 -3 3 3 -2
       Sample Output 2:
       -3 3
       -3 3
       -2 2
*/

public class PairSum {
  //----------------method 01
    public static void pairSum01(int[] arr, int s) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i=0; i<arr.length-1; i++)
        {
            for (int j=i; j< arr.length; j++)
            {
                if (arr[i]+arr[j]==s)
                {
                    if (j!=i)
                    {
                        System.out.println("["+arr[i]+" "+arr[j]+"]");
                    }

                }
            }
        }
    }
  //---------------Method 02
    public static int[][] pairSum02(int arr[], int s) {
        int n = arr.length;

        // Used to store result.
        List<int[]> ans = new ArrayList();

        // Checking sum for every element.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == s) {
                    int[] pair = new int[2];
                    pair[0] = arr[i];
                    pair[1] = arr[j];
                    ans.add(pair);
                }
            }
        }

        // Used to store final sorted result.
        int res[][] = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            int a = ans.get(i)[0], b = ans.get(i)[1];
            res[i][0] = Math.min(a, b);
            res[i][1] = Math.max(a, b);
        }

        Arrays.sort(res, new Comparator<int[]>()
        {
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return a[0] - b[0];
            }
        });
        for (int[] result:res) {
            System.out.println(result);
        }
        return res;
    }
    //-----------main method
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        pairSum01(arr,s);
       // System.out.println(pairSum02(arr,s));
    }
}
