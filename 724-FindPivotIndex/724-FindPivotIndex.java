// Last updated: 25/08/2025, 17:19:42
class Solution {
    public int pivotIndex(int[] nums) {
        
        int arr[]=new int[nums.length];
        arr[0]=nums[0];
        // System.out.print(arr[0]+" ");
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+nums[i];
            // System.out.print(arr[i]+" ");
        }
        if(arr[arr.length-1]-arr[0]==0){
            return 0;
        }
        for(int i=1;i<arr.length;i++){
        //    System.out.println("for loop "+"i"+i);
        //    System.out.println("check"+arr[i-1]+"  "+(arr[arr.length-1]-arr[i]));



            if(arr[i-1]==(arr[arr.length-1]-arr[i])){    
           System.out.println("ans "+"i"+i);

                return i;
            }
            
        }
        return -1;
    }
}