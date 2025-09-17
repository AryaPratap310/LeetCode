// Last updated: 17/09/2025, 14:34:41
class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> even=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> odd=new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> ll=new ArrayList<>();
        while(num>0){
            int rem=num%10;
            if(rem%2==0){
                even.add(rem);
            }
            else{
                odd.add(rem);
            }
            ll.add(rem);
            num=num/10;
        }
        int ans=0;
        for(int i=ll.size()-1;i>=0;i--){
            if(ll.get(i)%2==0){
                ans=ans*10+even.poll();
            }
            else{
                ans=ans*10+odd.poll();
            }
        }
        return ans;


    }
}