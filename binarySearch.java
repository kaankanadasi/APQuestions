public static int binarySearch (int [] data, int target) {
    int start = 0;
    int end = data.length - 1;
    while (start <= end) {
        int mid = (start + end) / 2;
        if (target < data [mid]) {
            end = mid - 1;
        } else if (target > data [mid]) {
            start = mid + 1;
        } else  {
            return mid;
        }
    }
    return -1;
}