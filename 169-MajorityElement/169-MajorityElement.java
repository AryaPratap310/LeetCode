// Last updated: 25/08/2025, 17:21:43
class Solution {
    public int majorityElement(int[] nums) {
        return Moore_Voting(nums);
    }
    public static int Moore_Voting(int[] arr) {
		int e=arr[0];
		int v=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==e) {
				v++;
			}
			else {
				v--;
				if(v==0) {
					e=arr[i];
					v=1;
				}
			}
		}
		return e;
	}
}