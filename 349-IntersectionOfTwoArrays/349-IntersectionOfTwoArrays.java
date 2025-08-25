// Last updated: 25/08/2025, 17:20:57
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[]arr=new int[nums2.length];
        int c=0;
        for(int i=0;i<nums1.length;i++){
            if(i>0 && nums1[i]==nums1[i-1]){
                continue;
            }
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    arr[c]=nums2[j];
                    c++;
                    break;
                }
                
            }
        }
        int arr1[]=new int[c];
        for(int i=0;i<c;i++){
            arr1[i]=arr[i];
        }
        return arr1;
    }
}