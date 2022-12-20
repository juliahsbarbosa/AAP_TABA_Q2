/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taba2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author yalemisew
 */
public class Country {

    // Arraylist that contains all the 5 countries
    static ArrayList<Integer>[] countries = new ArrayList[5];

    // The data that contains the statisitistics of each country
    long sum[] = {0, 0, 0, 0, 0};
    float average[] = {0, 0, 0, 0, 0};
    int min[] = {0, 0, 0, 0, 0};
    int max[] = {0, 0, 0, 0, 0};

    public Country() {
    }

    // The code that generates the country data using random function
    public static ArrayList[] generateData() {
        Random random = new Random();
        // for testing purpose you may fix the random value to a constant
        random.setSeed(4);
        for (int i = 0; i < 5; i++) {
            // Generates 10000 random numbers between -10,000 and 10,000
            int[] numbers = random.ints(10000, -10000, 10000).toArray();
            countries[i] = new ArrayList<Integer>();
            for (int j = 0; j < numbers.length; j++) {
                countries[i].add(numbers[j]);
            }
        }
        return countries;

    }

    //Getters & Setters
    // Sets the sum of each country stat. the index represent the respective country
    public void setSum(long sum, int index) {
        this.sum[index] = sum;
    }

    public void setAverage(float average, int index) {
        this.average[index] = average;
    }

    public void setMin(int min, int index) {
        this.min[index] = min;
    }

    public void setMax(int max, int index) {
        this.max[index] = max;
    }

    public float[] getAverage() {
        return average;
    }

    public int[] getMin() {
        return min;
    }

    public int[] getMax() {
        return max;
    }

    //B. Write a program that combines the statistics computed from each thread above (Q2.a)
    //and present the grand total, average, maximum and minimum of all the countries.
    //Gets all sum array values to calculate the sum of all countries
    //Compute Grand Sum of all countries
    public long computeGrandSum() {
        long grandSum = 0;
        for (int i = 0; i < sum.length; i++) {
            grandSum += sum[i];
        }
        return grandSum;

    }

    //Compute grand average
    //Gets all average array values to calculate the average of all countries
    public float computeGrandAverage() {
        float grandAvgSum = 0;
        for (int i = 0; i < average.length; i++) {
            grandAvgSum += average[i];
        }
        return (float) grandAvgSum / average.length;
    }

    //Compute Grand minimum
    //Gets all min array values to calculate the minimum of all countries
    public int computeGrandMin() {
        int grandMin = min[0];
        for (int i = 0; i < min.length; i++) {
            if (grandMin > min[i]) {
                grandMin = min[i];//gets all min array values to calculate the minimum of all countries
            }
        }
        return grandMin;
    }

    //Compute Grand Max
    //Gets all max array values to calculate the maximum of all countries
    public int computeGrandMax() {
        int grandMax = max[0];
        for (int i = 0; i < max.length; i++) {
            if (grandMax < max[i]) {
                grandMax = max[i];
            }
        }
        return grandMax;
    }

    //Compute the total (sum) for each Country and set the calculated value to the sum array
    public void getTotalC1() {
        long sumC1 = 0;
        for (int i = 0; i < countries[0].size(); i++) {
            sumC1 += countries[0].get(i);// gets all the records in that array index
            //Set the calculated sum to the first posision of the sum array
            this.setSum(sumC1, 0);

        }
        System.out.println("The total (sum) of all records for Country C1 array is: " + sumC1);
    }

    public void getTotalC2() {
        long sumC2 = 0;
        for (int i = 0; i < countries[1].size(); i++) {
            sumC2 += countries[1].get(i);// gets all the records in that array index
            //Set the calculated sum to the second posision of the sum array
            this.setSum(sumC2, 1);

        }
        System.out.println("The total (sum) of all records for Country C2 array is: " + sumC2);
    }

    public void getTotalC3() {
        long sumC3 = 0;
        for (int i = 0; i < countries[2].size(); i++) {
            sumC3 += countries[2].get(i);// gets all the records in that array index
            //Set the calculated sum to the third posision of the sum array
            this.setSum(sumC3, 2);

        }
        System.out.println("The total (sum) of all records for Country C3 array is: " + sumC3);
    }

    public void getTotalC4() {
        long sumC4 = 0;
        for (int i = 0; i < countries[3].size(); i++) {
            sumC4 += countries[3].get(i);// gets all the records in that array index
            //Set the calculated sum to the fourth posision of the sum array
            this.setSum(sumC4, 3);

        }
        System.out.println("The total (sum) of all records for Country C4 array is: " + sumC4);
    }

    public void getTotalC5() {
        long sumC5 = 0;
        for (int i = 0; i < countries[4].size(); i++) {
            sumC5 += countries[4].get(i);// gets all the records in that array index
            //Set the calculated sum to the last position of the sum array
            this.setSum(sumC5, 4);
        }
        System.out.println("The total (sum) of all records for Country C5 array is: " + sumC5);
    }

    //Compute the mean (average) for each country and set the calculated value to the average array
    public void getMeanC1() {
        long sum = 0;
        for (int i = 0; i < countries[0].size(); i++) {
            sum += countries[0].get(i);// gets all the records in that array index
        }

        float average = sum / countries[0].size();
        //Set the calculated average to the first position of the average array
        this.setAverage(average, 0);
        System.out.println("The mean (average) of all records for Country C1 array is: " + average);

    }

    public void getMeanC2() {
        long sum = 0;
        for (int i = 0; i < countries[1].size(); i++) {
            sum += countries[1].get(i);
        }

        float average = sum / countries[1].size();
        //Set the calculated average to the second position of the average array
        this.setAverage(average, 1);

        System.out.println("The mean (average) of all records for Country C2 array is: " + average);
    }

    public void getMeanC3() {//line120
        long sum = 0;

        for (int i = 0; i < countries[2].size(); i++) {
            sum += countries[2].get(i);
        }

        float average = sum / countries[2].size();
        //Set the calculated average to the third position of the average array
        this.setAverage(average, 2);
        System.out.println("The mean (average) of all records for Country C3 array is: " + average);
    }

    public void getMeanC4() {
        long sum = 0;

        for (int i = 0; i < countries[3].size(); i++) {
            sum += countries[3].get(i);
        }

        float average = sum / countries[3].size();

        //Set the calculated average to the fourth position of the average array
        this.setAverage(average, 3);
        System.out.println("The mean (average) of all records for Country C4 array is: " + average);
    }

    public void getMeanC5() {
        long sum = 0;
        for (int i = 0; i < countries[4].size(); i++) {
            sum += countries[4].get(i);
        }
        float average = sum / countries[4].size();
        //Set the calculated average to the last position of the average array
        this.setAverage(average, 4);
        System.out.println("The mean (average) of all records for Country C5 array is: " + average);
    }

    //Compute the maximum for each country and set the calculated value to the max array
    public void getMaxC1() {
        int maxC1 = Collections.max(countries[0]);
        //Set the calculated maximum to the first position of the max array
        this.setMax(maxC1, 0);
        System.out.println("The maximum number of all records for Country C1 array is: " + maxC1);
    }

    public void getMaxC2() {
        int maxC2 = Collections.max(countries[1]);
        //Set the calculated maximum to the second position of the max array
        this.setMax(maxC2, 1);
        System.out.println("The maximum number of all records for Country C2 array is: " + maxC2);
    }

    public void getMaxC3() {
        int maxC3 = Collections.max(countries[2]);
        //Set the calculated maximum to the third position of the max array
        this.setMax(maxC3, 2);
        System.out.println("The maximum number of all records for Country C3 array is: " + maxC3);
    }

    public void getMaxC4() {
        int maxC4 = Collections.max(countries[3]);
        //Set the calculated maximum to the fourth position of the max array
        this.setMax(maxC4, 3);
        System.out.println("The maximum number of all records for Country C4 array is: " + maxC4);
    }

    public void getMaxC5() {
        int maxC5 = Collections.max(countries[4]);
        //Set the calculated maximum to the last position of the max array
        this.setMax(maxC5, 4);
        System.out.println("The maximum number of all records for Country C5 array is: " + maxC5);
    }

    //Compute the minimum for each country and set the calculated value to the min array
    public void getMinC1() {
        int minC1 = Collections.min(countries[0]);
        //Set the calculated minimum to the first position of the min array
        this.setMin(minC1, 0);
        System.out.println("The minimum number of all records for Country C1 array is: " + minC1);
    }

    public void getMinC2() {
        int minC2 = Collections.min(countries[1]);
        //Set the calculated minimum to the second position of the min array
        this.setMin(minC2, 1);
        System.out.println("The minimum number of all records for Country C2 array is: " + minC2);
    }

    public void getMinC3() {
        int minC3 = Collections.min(countries[2]);
        //Set the calculated minimum to the third position of the min array
        this.setMin(minC3, 2);
        System.out.println("The minimum number of all records for Country C3 array is: " + minC3);
    }

    public void getMinC4() {
        int minC4 = Collections.min(countries[3]);
        //Set the calculated minimum to the fourth position of the min array
        this.setMin(minC4, 3);
        System.out.println("The minimum number of all records for Country C4 array is: " + minC4);
    }

    public void getMinC5() {
        int minC5 = Collections.min(countries[4]);
        //Set the calculated minimum to the last position of the min array
        this.setMin(minC5, 4);
        System.out.println("The minimum number of all records for Country C5 array is: " + minC5);
    }

}
