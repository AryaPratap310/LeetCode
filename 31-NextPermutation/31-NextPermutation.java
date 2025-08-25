// Last updated: 25/08/2025, 17:23:05
class Solution {
    public void nextPermutation(int[] arr) {
        
		 int n=arr.length;
			int p=-1;
			for(int i=n-2;i>=0;i--) {
				if(arr[i]<arr[i+1]) {
					p=i;
					break;
				}
			}
			int q=-1;
			for(int i=n-1;i>p &&p!=-1;i--) {
				if(arr[i]>arr[p]) {
					int temp=arr[p];
			        arr[p]=arr[i];
			        arr[i]=temp;
					break;
				}
			}
			
			int i=p+1;
			int j=n-1;
			while(i<j) {
				int ck =arr[i];
				arr[i]= arr[j];
				arr[j]=ck;
				i++;
				j--;
			}
			
			
	 }
    }
