// Last updated: 25/08/2025, 17:21:54
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
		String [] arr=s.split("\s+");
		// String ans="";
		// for(int i=arr.length-1;i>=0;i--) {
		// 	ans=ans + arr[i] +" ";
		// }
		// return ans.trim();
        int l=0,r=arr.length-1;
        while(l<r){
            String temp=arr[l];
            // System.out.println(arr[l]);
            // System.out.println(arr[r]);
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        StringBuilder result = new StringBuilder();
        for (String word :arr) {
            if (!word.isEmpty()) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(word);
            }
        }

        return result.toString();

    }
}