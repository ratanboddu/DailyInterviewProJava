package com.dailyinterviewprojava.linkedin;

import java.util.Scanner;

/**
 * 
 * @author ema
 * You are given a positive integer N which represents the number of steps in a staircase. 
 * You can either climb 1 or 2 steps at a time. Write a function that returns the number of unique ways to climb the stairs.
 *
 * Can you find a solution in O(n) time?
 *
 */
public class ClimbingStairs {
	
	public static void main(String...strings) {
		Scanner scanner = new Scanner(System.in);
		int step = scanner.nextInt();
		System.out.println(climbStairs(step));
		scanner.close();
	}
	
	public static int climbStairs(int n) {
		if(n == 0) {
			return 1;
		}
		
		int[] fn = new int[n + 2];
		
		fn[0] = 1;
		fn[1] = 1;
		fn[2] = 2;
		
		if(n > 2) {
			for(int i = 3; i < n + 1; i++) {
				fn[i] = fn[i - 1] + fn[i - 2];
			}
		}
		
		return fn[n];
    }
	
}
