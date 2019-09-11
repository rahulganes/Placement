/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
/**
Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

Expected Time Complexity: O(n)

Input:
The first line of input contains an integer T, denoting the number of testcases. Then T test cases follow. Each test case consists of three lines. First line of each testcase contains an integer N denoting size of the array. Second line contains N space separated integer denoting elements of the array. Third line of the test case contains an integer K.

Output:
Corresponding to each test case, print the kth smallest element in a new line.

Constraints:
1 <= T <= 100
1 <= N <= 105
1 <= arr[i] <= 105
1 <= K <= N

Example:
Input:
2
6
7 10 4 3 20 15
3
5
7 10 4 20 15
4

Output:
7
15

Explanation:
Testcase 1: 3rd smallest element in the given array is 7.
**/

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int test_cases = 0;
		int elements[][];
		int kth[];
		int answer=0;
		
		Scanner input = new Scanner(System.in); 
		
		test_cases = input.nextInt();
		elements = new int[test_cases][];
		kth = new int[test_cases];
		int numberofelements[] = new int[test_cases];
		
		for(int i =0;i<test_cases;i++)
		{
		    numberofelements[i] = input.nextInt();
		    
		    elements[i] = new int[numberofelements[i]];
		    
		    for(int j=0;j<numberofelements[i];j++)
		    {
		        elements[i][j] = input.nextInt();
		    }
		    
		    kth[i] = input.nextInt();
		}
		
		PriorityQueue <Integer> pQueue = new PriorityQueue<Integer>();
		
		for(int i = 0;i<test_cases;i++)
		{
		    for(int j=0;j<numberofelements[i];j++)
		    {
		        pQueue.add(elements[i][j]);
		    }
		    
		    for(int k=0;k<kth[i];k++)
		    {
		        answer = pQueue.poll();
		    }
		    
		    System.out.println(answer);
		    pQueue.clear();
		    
		}
	}
}