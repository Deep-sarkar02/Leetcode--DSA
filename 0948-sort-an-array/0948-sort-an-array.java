class Solution {
        public static void heapify(int i , int n , int arr[])
    {
        //n is the size of heap
        int left = 2*i+1;
        int right = 2*i+2;
        // for the max
        int maxIdx = i;
        // chekc of the max in the left and the right
        if(left <n && arr[left]>arr[maxIdx])
        {
            maxIdx = left;
        }
        if(right < n && arr[right]>arr[maxIdx])
        {
            maxIdx = right;
        }
        // if the max is not the root
        if(maxIdx != i)
        {
            // swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            heapify(maxIdx, n, arr);
        }

    }
    public int[] sortArray(int[] arr) {
         //step  1build the max heap from the non leaf node
        int n = arr.length;
        for(int i = n/2 ; i>= 0 ; i--)
        {
            // call for the heapify
            // 2 params -> which index
            //size 
            heapify(i , n , arr);
        }

        // step: 2 // puish the largest at the end
        for(int i = n-1 ; i>0 ; i--)
        {
            // swap the largest with the last index
            // fisrst with the last
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(0 , i , arr);// heapify from the ind 0 and every time it will go i-1;
        
        }
        return arr;
    }
    
}