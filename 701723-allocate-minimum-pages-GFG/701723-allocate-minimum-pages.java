class Solution {
    public int findPages(int[] arr, int k) {

        if (k > arr.length) {
            return -1;
        }

        long st = 0;
        long end = 0;

        for (int a : arr) {
            st = Math.max(st, a);
            end += a;
        }

        long ans = -1;

        while (st <= end) {

            long mid = st + (end - st) / 2;

            if (allocationPossible(arr, mid, k)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return (int) ans;
    }

    private boolean allocationPossible(int[] arr, long maxpages, int stud) {

        int studc = 1;
        long pages = 0;

        for (int a : arr) {

            if (pages + a > maxpages) {
                studc++;
                pages = a;
            } else {
                pages += a;
            }

            if (studc > stud) {
                return false;
            }
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna