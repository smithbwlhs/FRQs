import java.util.ArrayList;

public class WeatherData {
    /** Guaranteed not to be null and to contain only non-null entries */
    private ArrayList<Double> temperatures;

    public WeatherData(ArrayList<Double> temperatures){
        this.temperatures = temperatures;
    }

    /**
     * * Cleans the data by removing from temperatures all values that are less than
     * lower and all values that are greater than upper, as described in part (a)
     */
    public void cleanData(double lower, double upper) {
        /* to be implemented in part (a) */ 
        int i = temperatures.size()-1;
        while(i >= 0){
            if(temperatures.get(i) < lower || temperatures.get(i) > upper){
                temperatures.remove(i);
            }
            i--;
        }
    }

    /**
     * * Returns the length of the longest heat wave found in temperatures, as
     * described in
     * part (b)
     * Precondition: There is at least one heat wave in temperatures based on
     * threshold.
     */
    public int longestHeatWave(double threshold) {
        /* to be implemented in part (b) */
        int waveLength = 0;
        int longestWaveLength = 0;

        for(double temp: temperatures){
            if(temp > threshold){
                waveLength++;
                if(waveLength>longestWaveLength){
                    longestWaveLength = waveLength;
                }
            }
            else{
                waveLength = 0;
            }
        }
        return longestWaveLength;
    }
    public String toString(){
        return temperatures.toString();
    }
}
