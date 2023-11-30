public class AgeDistribution {
    public static void main(String[] args) {
        final int REITERATIONS = 1000;
        final int MAXAGE = 35;

        int[][] ageDistribution = {
                {12, 18},  		// 12 %
                {22, 19},  		// 10 %
                {31, 20},		// 9 %
                {46, 21},    	// 15 %
                {58, 22},  		// 12 %
                {65, 23}, 		// 7 %
                {70, 26},       // 5 %
                {75, 28},       // 5 %
                {77, 29},		// 2 %
                {85, 30},       // 8 %
                {88, 31},       // 3 %
                {94, 33},       // 6 %
                {100,MAXAGE}, 	// 6 %
        };

        int[] generatedAges = new int[MAXAGE+1];

        // Generate ages according to the distribution:
        for (int i = 1; i <= REITERATIONS; i++){
            int x = (int)(Math.random()*100)+1; 	// generate a random number 1..100
            int j = 0;
            while (x > ageDistribution[j][0]) j++;  // search for the correct row to get the matching age value
            generatedAges[ageDistribution[j][1]]++; // age founded gives an index to the generated ages count table: increment it (by one)
        }

        // Output the result of the generation:
        System.out.println("Age  Count  %-share");
        for (int age = 0; age <= MAXAGE; age++) {
            if (generatedAges[age] != 0) {
                String str = "%-4d %-6d %-8.2f\n";
                System.out.printf(str, age, generatedAges[age], ((double)generatedAges[age])/REITERATIONS*100 );
            }
        }
    }
}