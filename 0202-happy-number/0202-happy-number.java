class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            if(n==1)
            return true;
            n=square(n);
        }
        return false;
    }
    public static int square(int n){
        int s=0;
        while(n!=0){
            int r=n%10;
            s+=r*r;
            n/=10;
        }
        return s;
    }
}