class Solution 
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
         // Stack for tracking next greater elements
        Stack<Integer> st = new Stack<>();

        // Find max value in nums2 for correct indexing
        int maxVal = 0;
        for(int x : nums2) {
            maxVal = Math.max(maxVal, x);
        }

        // Create array with size (maxVal + 1) and fill with 0
        int arr[] = new int[maxVal + 1];
        for(int i = 0; i <= maxVal; i++) {
            arr[i] = 0;
        }

        int N = nums2.length;
        arr[nums2[N-1]] = -1;
        st.push(nums2[N-1]);

        // Traverse nums2 from right to left
        for(int i = N-2; i >= 0; i--)
        {
            while(!st.empty() && st.peek() <= nums2[i])
            {
                st.pop();
            }

            if(st.empty()) {
                arr[nums2[i]] = -1;
            } else {
                arr[nums2[i]] = st.peek();
            }

            st.push(nums2[i]);
        }

        // Create output array for nums1
        int gr[] = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++) {
            gr[i] = arr[nums1[i]];
        }
        return gr;
    }
}
    
