class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans = ans ^ num;
        }
        return ans;
    }
}

// another code if there is no single element

// public class tpp {
//     public static int Single(int[] nums) {
//         int ans = 0;
//         for (int num : nums) {
//             ans = ans ^ num;
//         }
//         int count = 0;
//         for (int num : nums) {
//             if (num == ans) {
//                 count++;
//             }
//         }
//         if (count == 1) {
//             return ans;
//         } else {
//             return -1;
//         }

//     }

//     public static void main(String[] args) {
//         int[] arr = { 4, 1, 2, 1, 2, 4 ,5,5};

//         int ar = Single(arr);
//         if(ar == - 1){
//             System.out.println("No single element found");
//         } else{
//             System.out.println("Single element found : " + ar);
//         }
//     }
// }
