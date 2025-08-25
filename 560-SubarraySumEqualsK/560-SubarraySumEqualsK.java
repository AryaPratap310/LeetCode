// Last updated: 25/08/2025, 17:20:05
class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==k){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        // int n=nums.length;
        // int PS[]=new int[n];
        // PS[0]=nums[0];
        // for(int i=1 ;i<n;i++){
        //     PS[i]=PS[i-1]+nums[i];
        // }
        // int count =0;
        // HashMap<Integer, Integer> PSmap = new HashMap<>();
        // for(int j=0;j<n;j++){
        //     if(PS[j]==k){
        //         count++;
        //         System.out.println(j+" ==");
        //     }
        //     int val=PS[j]-k;
        //     System.out.println(val+" val ");
        //     if(PSmap.containsKey(val)){
        //         count+=PSmap.get(val);
        //         System.out.println(j+"  ");
        //     }
        //     PSmap.put(PS[j],PSmap.getOrDefault(PS[j],0)+1);
        //     System.out.println(PSmap.get(val)+" mapvalue of"+val);
        // }
        // return count;


        int n=nums.length;
        int count =0;
        int sum=0;
        HashMap<Integer, Integer> PSmap = new HashMap<>();
        PSmap.put(0, 1);  // if(PS[j]==k)

        for(int j=0;j<n;j++){
            //  update running sum
            sum+=nums[j];  

            // if (s - k) has occurred before, then a subarray summing to k ends here
            // if(PSmap.containsKey(sum-k)){
            //     count+=PSmap.get(sum-k);
            // }
            count+=PSmap.getOrDefault(sum-k,0);
            // update frequency of current sum
            PSmap.put(sum,PSmap.getOrDefault(sum,0)+1);
        }
        return count;
    }
}