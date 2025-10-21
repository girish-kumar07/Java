import java.util.*;

public class trapping_Rain_Water{
    
    // trw = Trapped Rain Water
    public static int trappedRainWater(int height[]){
        
        // Calculating Left Max Boundary -- Array
        // lmb = Left Max Boundary
        int n = height.length;
        int lmb [] = new int [n];
        lmb[0] = height[0];
        // Loop for creating Left Max Boundary Array
        for(int i = 1; i<n; i++){
            lmb[i] = Math.max(height[i], lmb[i-1]);
        }

        // Calculating Right Max Boundary -- Array
        // rmb = Right Max Boundary
        int rmb[] = new int[n];
        rmb[n-1] = height[n-1];
        // Loop for creating Right Max Boundary -- Array
        for(int i = n-2; i>=0; i--){
            rmb[i] = Math.max(height[i], rmb[i+1]);
        }

        int trw = 0;
        // Loop for Calculating Waterlevel
        // wl = WaterLevel
        for( int i = 0; i<n; i++){
            int wl = Math.min(lmb[i], rmb[i]);
            //Trapped Rain Water = (WaterLevel - Height of Bar)
            trw  += (wl - height[i]);
        }

        return trw;
    }

    public static void main(String[] args) {
        
        int height[] = {4,2,0,6,3,2,5};

        System.out.println("Rain Water Trapped = " + trappedRainWater(height));
    }
    
}