// Last updated: 25/08/2025, 17:18:58
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        return count_subarray(nums,k);
    }
    public static int count_subarray(int []arr,int k){
        int n=k;
        int[] freq=new int[n];
        int sum=0;
        freq[0]=1;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int rem=(sum%n);
            if(rem<0){
                rem+=n;
            }
            freq[rem]++;
        }
        int ans=0;
            for(int i=0;i<freq.length;i++){
                if(freq[i]>=2){
                    int x=freq[i];
                    ans+=(x*(x-1))/2;
                }
            }
        return ans;
    }
}