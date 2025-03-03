/*You are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.

Notice that x does not have to be an element in nums.

Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique.

 

Example 1:

Input: nums = [3,5]
Output: 2
Explanation: There are 2 values (3 and 5) that are greater than or equal to 2.
Example 2:

Input: nums = [0,0]
Output: -1
Explanation: No numbers fit the criteria for x.
If x = 0, there should be 0 numbers >= x, but there are 2.
If x = 1, there should be 1 number >= x, but there are 0.
If x = 2, there should be 2 numbers >= x, but there are 0.
x cannot be greater since there are only 2 numbers in nums.
Example 3:

Input: nums = [0,4,3,0,4]
Output: 3
Explanation: There are 3 values that are greater than or equal to 3.*/






class Main {
    public int specialArray(int[] arr) {
        int start = 0;
        int finalcheck = -1;
        int n = arr.length;

        int x = 0;
        while (x <= n) { // Checking for x from 0 to n
            int count = 0;
            start = 0;

            while (start < n) { // Count elements >= x
                if (arr[start] >= x) {
                    count++;
                }
                start++;
            }

            if (count == x) { // Check if x is valid
                finalcheck = x;
                break;
            }

            x++;
        }

        return finalcheck;
    }

    public static void main(String args[]) {
        Main obj = new Main();
        int arr[] = {0, 4, 3, 0, 4}; 
        System.out.println(obj.specialArray(arr)); // Expected Output: 3
    }
}
