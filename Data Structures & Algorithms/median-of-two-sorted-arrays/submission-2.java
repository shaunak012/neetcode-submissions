class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        if (n1 == 0 && n2 == 0) return 0.0;
        if(n2<n1) return findMedianSortedArrays(nums2,nums1);
        int s=0;
        int e=n1;
        while(s<=e){
            int mid_x=(s+e)/2;
            int mid_y=(n1+n2+1)/2 -mid_x;
            
            int x_left=mid_x==0?Integer.MIN_VALUE:nums1[mid_x-1];
            int y_left=mid_y==0?Integer.MIN_VALUE:nums2[mid_y-1];
            int x_right=mid_x==n1?Integer.MAX_VALUE:nums1[mid_x];
            int y_right=mid_y==n2?Integer.MAX_VALUE:nums2[mid_y];

            if(x_left<=y_right && y_left<=x_right){
                return (n1+n2)%2==0?(double)(Math.max(x_left,y_left)+Math.min(x_right,y_right))/2:Math.max(x_left,y_left);
            }else if (x_left>y_right){
                e=mid_x-1;
            }else{
                s=mid_x+1;
            }
        }
        return 0;
    }
}
