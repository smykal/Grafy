package com.search.binary;

public class BinarySearch implements Searching {

    @Override
    public int search(int[] tableToSearch, int itemToSearch) {
        int low = 0;
        int high = tableToSearch.length - 1;

        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (tableToSearch[mid] == itemToSearch) {
                result = mid;
                break;
            } else if (tableToSearch[mid] > itemToSearch){
                high = mid - 1;
            } else if (tableToSearch[mid] < itemToSearch) {
                low = mid +1;
            }
        }
        return result;
    }
}
