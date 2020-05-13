package com.company;

import java.util.ArrayList;

public class OnlinePurchaseManager {

    private ArrayList<Gizmo> purchases;
    /** Returns the number of purchased Gizmo objects that are
     electronic and are
     * manufactured by maker, as described in part (a). */
    public int countElectronicsByMaker(String maker)
    {
        int count = 0;
        for (int i = 0; i < purchases.size(); i++) {
            if (purchases.get(i).getMaker().equals(maker) && purchases.get(i).isElectronic()) {
                count++;
            }
        }
        return count;
    }
    /** Returns true if any pair of adjacent purchased Gizmo
     objects are equivalent, and
     * false otherwise, as described in part (b). */
    public boolean hasAdjacentEqualPair() {
        for (int i = 0; i< purchases.size()-1; i++){
            if (purchases.get(i).equals(purchases.get(i+1))) {
                return true;
            }
        }
        return false;

    }

    /*
    public double getCheapestGizmoByMaker()
    In the Gizmo class would have to create a private double object for price
    In the Gizmo class would have to create an accessor method that returns the price of the object
     */


}

