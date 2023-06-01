package com.dpk.algorithms.bruteforce;

public class EggDropping {

    public static int eggDrop(int eggs, int floors) {
        // If there are no eggs or there are no floors there won't be any trials.
        if(eggs <= 0 || floors == 0) {
            return 0;
        }

        // If there is only one floor, one trial is needed.
        if(floors == 1) {
            return 1;
        }

        // If there is only one egg, number of trials possible would be equal to number of floors.
        if(eggs == 1) {
            return floors;
        }

        int min = Integer.MAX_VALUE;
        int res;

        // Consider all the eggs are dropping from 1st floor to kth floor.
        for(int i=1; i <= floors; i++) {
            res = Math.max(eggDrop(eggs -1, i-1), eggDrop(eggs, floors - i));
            min = Math.min(min, res);
        }

        // Return the minimum of these values plus 1.
        return min + 1;
    }

    public static void main(String[] args) {
        System.out.println(eggDrop(6, 15));
    }
}
