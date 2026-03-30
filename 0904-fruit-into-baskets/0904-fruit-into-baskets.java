class Solution {
    public int totalFruit(int[] fruits) {
        int maxFruits = 0;
        int left = 0;
        
        // Ippo HashMap-ku badhila idhu dhaan namma Basket
        int[] fruitCounts = new int[fruits.length]; 
        int types = 0; // Namma window-la ethana different fruit types iruku nu count panna

        for (int right = 0; right < fruits.length; right++) {
            int currentFruit = fruits[right];
            
            // Puthusa oru fruit add panrom na (adhavadhu count 0 va irundha), 
            // types count-ah increase panrom.
            if (fruitCounts[currentFruit] == 0) {
                types++; 
            }
            // Andha fruit oda count-ah 1 increase panrom
            fruitCounts[currentFruit]++;

            // 2 types-ku mela poirucha? Window-ah surukkanum!
            while (types > 2) {
                int leftFruit = fruits[left];
                
                // Left-most fruit-ah thookudrom (count-ah onnu korakurom)
                fruitCounts[leftFruit]--;
                
                // Oruvela andha fruit namma basket-la irundhu full-ah gaali aayiducha,
                // types count-ah onnu korachidrom.
                if (fruitCounts[leftFruit] == 0) {
                    types--; 
                }
                
                left++; // Left pointer-ah nagathurom
            }

            // Max length-ah update panrom
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
}