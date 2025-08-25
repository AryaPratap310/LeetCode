// Last updated: 25/08/2025, 17:18:34
class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        int freqArrSize=0;
        //taking the even ones as they are the frequencies
        for(int i=0;i<nums.length;i=i+2){
            //add up the frequencies to get the size of output array
            freqArrSize+=nums[i];
        }
        //Initialize the output array with the size
        int freqArr[]=new int[freqArrSize];
        int k=0;// k is be the index of freqArr
        
        for(int i=0;i<nums.length;i=i+2){
            //frequncy loop below
            for(int j=0;j<nums[i];j++){ // freq = nums[i] , value=nums[i+1]
                freqArr[k]=nums[i+1];// putting values directly to output array
                k++;//incrementing index of freqArr
            }
        }
        return freqArr;
    }
}