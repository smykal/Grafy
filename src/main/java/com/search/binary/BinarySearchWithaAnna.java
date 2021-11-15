package com.search.binary;

public class BinarySearchWithaAnna implements Searching{
    @Override
    public int search(int[] tableToSearch, int itemToSearch) {
        int middleIndex = (tableToSearch.length -1)/2;
        System.out.println("middle index: " + middleIndex);
        int searchValue = tableToSearch[middleIndex];
        System.out.println("searchValue: " + searchValue);
        if (tableToSearch.length == 1 && itemToSearch != searchValue) {
            return 0;

        } else if (itemToSearch == searchValue) {
            return 1;
        } else if (itemToSearch > searchValue) {
            return search(subArray(tableToSearch,middleIndex+1,tableToSearch.length), itemToSearch);
        } else {
            return search(subArray(tableToSearch,0,middleIndex), itemToSearch);
        }
    }

    private int[] subArray(int[] tableToCut, int startIndex, int endIndex) {
        int newArrayLength = endIndex - startIndex;
        int[] newArray = new int[newArrayLength];

        System.arraycopy(tableToCut, startIndex, newArray, 0, newArrayLength);
     return newArray;
    }
}
