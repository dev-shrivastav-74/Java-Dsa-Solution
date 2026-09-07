package Array.twoSum;

// Package batata hai ki ye class kis folder/package ke andar hai.

import java.util.HashMap;

// HashMap class ko use karne ke liye import kiya.
// HashMap Key-Value pair mein data store karta hai.

public class Solution {

  // Ye Two Sum ka method hai.
  // int[] return type ka matlab: ye method integer array return karega.
  // nums = input array
  // target = jis sum ko hume find karna hai
  public static int[] twoSum(int[] nums, int target) {

    // HashMap banaya.
    // Isme:
    // Key   = array ka number
    // Value = us number ka index
    HashMap<Integer, Integer> map = new HashMap<>();

    // Array ke har element par loop chalega.
    // i array ka index hai.
    // i = 0 se start hoga aur nums.length - 1 tak chalega.
    for (int i = 0; i < nums.length; i++) {

      // Hume current number ke saath target banane wala number chahiye.
      //
      // Example:
      // target = 9
      // nums[i] = 2
      //
      // result = 9 - 2 = 7
      //
      // Matlab 2 ke saath 7 chahiye taaki 9 ban sake.
      int result = target - nums[i];

      // Check kar rahe hain ki 'result' naam ki KEY
      // HashMap mein already present hai ya nahi.
      //
      // containsKey() boolean return karta hai:
      // present     -> true
      // not present -> false
      if (map.containsKey(result)) {

        // Agar result HashMap mein mil gaya,
        // toh us result ki VALUE nikal rahe hain.
        //
        // Humne HashMap mein:
        // Key   = number
        // Value = index
        //
        // Isliye map.get(result) se result ka INDEX milega.
        //
        // i = current number ka index
        //
        // Dono indices ko ek new int array mein return kar rahe hain.
        return new int[] {map.get(result), i};
      }

      // Current array value ko HashMap mein store kar rahe hain.
      //
      // nums[i] = KEY
      // i       = VALUE
      //
      // Example:
      // nums[i] = 2
      // i = 0
      //
      // map.put(2, 0)
      //
      // Matlab:
      // Key → Value
      //  2  →  0
      map.put(nums[i], i);
    }

    // Agar poora loop chal gaya aur koi pair nahi mila,
    // toh empty integer array return kar do.
    //
    // {} ka matlab array ke andar koi element nahi hai.
    return new int[] {};
  }

  // Program yahan se execution start karega.
  public static void main(String[] args) {

    // Input array banaya.
    int[] nums = {2, 7, 11, 15};

    // Hume do numbers chahiye jinka sum 9 ho.
    int target = 9;

    // twoSum method ko call kiya.
    //
    // nums aur target method ko pass kar rahe hain.
    //
    // Method jo int[] return karega,
    // usko answer variable mein store kar rahe hain.
    int[] answer = twoSum(nums, target);

    // Answer array ke index 0 aur index 1 ko print kar rahe hain.
    //
    // Is example mein:
    // answer = [0, 1]
    //
    // Output:
    // 0 1
    System.out.println(answer[0] + " " + answer[1]);
  }
}
