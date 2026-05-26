// YOUR NAME:
// COLLABORATORS:
// LAST MODIFIED DATE: 
/*
Yearly Global Atmospheric CO₂ Levels (parts per million)
2001: 371.32 ppm
2002: 373.45 ppm
2003: 375.98 ppm
2004: 377.70 ppm
2005: 379.98 ppm
2006: 382.09 ppm
2007: 384.03 ppm
2008: 385.83 ppm
2009: 387.64 ppm
2010: 390.10 ppm
2011: 391.85 ppm
2012: 394.06 ppm
2013: 396.74 ppm
2014: 398.87 ppm
2015: 401.01 ppm
2016: 404.41 ppm
2017: 406.76 ppm
2018: 408.72 ppm
2019: 411.66 ppm
2020: 414.24 ppm
(Data from: https://www.esrl.noaa.gov/gmd/webdata/ccgg/trends/co2/co2_annmean_mlo.txt)
*/


class Main 
{
    // CONSTANTS
    public static final int START_YEAR = 2001;
    public static final int NUM_YEARS = 20;

  public static void main(String[] args) 
  {
  // Step 1: Declare and initialize arrays
    double[] co2Levels = {
      371.32, 373.45, 375.98, 377.70, 379.98,
      382.09, 384.03, 385.83, 387.64, 390.10,
      391.85, 394.06, 396.74, 398.87, 401.01,
      404.41, 406.76, 408.72, 411.66, 414.24
    };

    int[] years = new int[NUM_YEARS];
    int year = START_YEAR;

    for (int i = 0; i < years.length; i++) {
    years[i] = year;
    year++;
  }

  // OUTPUT HEADER
  System.out.println("\nData displayed for each year begins at 360 ppm.");
  System.out.println("Each additional oil drum (🛢 ) represents an additional 10 ppm.\n");

  System.out.print("Year");
  UtilityBelt.printCentered(55, "CO₂ in Atmosphere (ppm)");

  // Print the graph
  printGraph(co2Levels, years);

  // Print ppm increase
    double increase = co2Levels[co2Levels.length - 1] - co2Levels[0];
    System.out.printf("\nFrom 2001 to 2020, the average atmospheric CO₂ levels across the globe have grown %.2f ppm.\n", increase);
  }

  // Print a single bar
  public static void printBar(double value)
  {
    int drums = (int)(value - 360);  // whole numbers above 360

  for (int i = 0; i < drums; i++) {
      System.out.print("🛢");
  }

  System.out.println(" " + value);
  }

    // Step 3: Print the full graph
    public static void printGraph(double[] levels, int[] years)
    {
    for (int i = 0; i < levels.length; i++) {
      System.out.print(years[i] + " ");
      printBar(levels[i]);
    }
  }
}
