// Last updated: 25/08/2025, 17:20:21
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n=nums.length;
        int[] nge = new int[n];

        //first put the entire array into the stack to account for that circular part so that end of the array has a way to compare to the entire array and so does every element which needs to compare to its previous elements

        for(int i=n-1;i>=0;i--){
            stack.push(nums[i]);
        }

        //Rest all is the same
        for (int i = n-1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] >= stack.peek()) {
                stack.pop();
            }
                if (stack.isEmpty()) {
                    nge[i] = -1;
                } else {
                    nge[i] = stack.peek();
                }

            stack.push(nums[i]);
        }
        return nge;
    }
}