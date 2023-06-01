package com.dpk.ds.array;

import java.util.Arrays;

public class TruckMaxBoxUnit {

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));

        int boxLoaded = 0;
        int unitLoaded = 0;

        for(int i=0; i < boxTypes.length; i++) {
            int currentNumOfBoxes = boxTypes[i][0];
            int currentUnitsPerBoxes = boxTypes[i][1];

            int boxesToLoad = currentNumOfBoxes;

            if(truckSize <= (boxLoaded + currentNumOfBoxes)) {
                boxesToLoad = Math.min(truckSize - boxLoaded, currentNumOfBoxes);

                boxLoaded += boxesToLoad;
                unitLoaded += boxesToLoad * currentUnitsPerBoxes;
                return unitLoaded;
            }

            boxLoaded += boxesToLoad;
            unitLoaded += boxesToLoad * currentUnitsPerBoxes;
        }

        return unitLoaded;
    }

    private void sortByUnits(int[][] boxTypes) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
    }

    public static void main(String[] args) {
        int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
        int truckSize = 10;

        TruckMaxBoxUnit truckMaxBoxUnit = new TruckMaxBoxUnit();
        int maxUnits = truckMaxBoxUnit.maximumUnits(boxTypes, truckSize);
        boolean result = maxUnits == 91;

        System.out.println("maxUnits=" + maxUnits);
        System.out.println("Result=" + result);
    }
}
