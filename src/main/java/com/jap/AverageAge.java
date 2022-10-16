package com.jap;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData)
    {
        double avg = 0;

        try{
            //Write the logic
            for (int i = 0; i < ageRawData.length; i++) {
                avg = avg + Double.parseDouble(ageRawData[i]);
            }
            avg = avg / ageRawData.length;

            //Handle specific exception
        }catch (Exception exception)
        {
            return exception.toString();
        }
        return String.valueOf(avg);
    }



}
