/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taba2022;

import java.util.ArrayList;

/**
 *
 * @author julia
 */
public class CountriesApp {

    //Declare and create object to synchronize threads
    private static final Object syncThread = new Object();

    public static void main(String[] args) {

        //Generate the data in a arraylist of countries
        ArrayList[] countries = Country.generateData();

        //Print the size of each country
        for (int i = 0; i < countries.length; i++) {
            System.out.println("The country C" + (i + 1) + " contains: " + countries[i].size() + " records");
        }

        //Test the printing of each country 
        //To print all the elements of a Country just use countries[index].get(i)
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("The records of the Country C1 are: ");
        for (int i = 0; i < countries[0].size(); i++) {
            System.out.println(countries[0].get(i));

        }
        System.out.println("END OF C1 RECORDS");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");

//        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//        System.out.println("The records of the Country C2 are: ");
//        for (int i = 0; i < countries[1].size(); i++) {
//            System.out.println(countries[1].get(i));
//        }
//        
//        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//        System.out.println("The records of the Country C3 are: ");
//        for (int i = 0; i < countries[2].size(); i++) {
//            System.out.println(countries[2].get(i));
//        }
//        
//        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//        System.out.println("The records of the Country C4 are: ");
//        for (int i = 0; i < countries[3].size(); i++) {
//            System.out.println(countries[3].get(i));
//        }
//        
//        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//        System.out.println("The records of the Country C5 are: ");
//        for (int i = 0; i < countries[4].size(); i++) {
//            System.out.println(countries[4].get(i));
//        }
        //Instatiate the Country.java class
        Country ct = new Country();

        //Creating a Thread for each Country (C1, C2, C3, C4, C5)
        //Thread for Country 1
        Thread tC1 = new Thread(new Runnable() {
            @Override
            //Initiate run method for Thread C1
            public void run() {
                //Syncronize Thread
                synchronized (syncThread) {
                    System.out.println("\nThread " + Thread.currentThread().getName() + " is running: ");
                    //Calling all the methods (total, mean, max, min for C1)
                    ct.getTotalC1();
                    ct.getMeanC1();
                    ct.getMaxC1();
                    ct.getMinC1();
                }
            }
        });

        //Thread for Country 2
        Thread tC2 = new Thread(new Runnable() {
            //Initiate run method for Thread C2
            @Override
            public void run() {
                //Syncronize Thread
                synchronized (syncThread) {

                    //Calling all the methods (total, mean, max, min for C2)
                    System.out.println("\nThread " + Thread.currentThread().getName() + " is running: ");
                    ct.getTotalC2();
                    ct.getMeanC2();
                    ct.getMaxC2();
                    ct.getMinC2();
                }

            }
        });

        //Thread for Country 3
        Thread tC3 = new Thread(new Runnable() {
            @Override
            //Initiate method for Thread C3
            public void run() {
                //Syncronize Thread
                synchronized (syncThread) {
                    System.out.println("\nThread " + Thread.currentThread().getName() + " is running: ");

                    //Calling all the methods (total, mean, max, min for C3)
                    ct.getTotalC3();
                    ct.getMeanC3();
                    ct.getMaxC3();
                    ct.getMinC3();
                }

            }
        });

        //Thread for Country 4
        Thread tC4 = new Thread(new Runnable() {
            @Override
            //Initiate run method for Thread C4
            public void run() {
                //Syncronize Thread
                synchronized (syncThread) {
                    System.out.println("\nThread " + Thread.currentThread().getName() + " is running: ");

                    //Calling all the methods (total, mean, max, min for C4)
                    ct.getTotalC4();
                    ct.getMeanC4();
                    ct.getMaxC4();
                    ct.getMinC4();
                }

            }
        });

        //Thread for Country 5
        Thread tC5 = new Thread(new Runnable() {
            @Override
            //Initiate run method for Thread C5
            public void run() {
                //Syncrhronize thread
                synchronized (syncThread) {
                    System.out.println("\nThread " + Thread.currentThread().getName() + " is running: ");

                    //Calling all the methods (total, mean, max, min for C5)
                    ct.getTotalC5();
                    ct.getMeanC5();
                    ct.getMaxC5();
                    ct.getMinC5();
                }

            }
        });

        //Set the names of each thread
        tC1.setName("Country C1");
        tC2.setName("Country C2");
        tC3.setName("Country C3");
        tC4.setName("Country C4");
        tC5.setName("Country C5");

        //Begin the execution of the threads
        tC1.start();
        tC2.start();
        tC3.start();
        tC4.start();
        tC5.start();

        try {
            //Wait for the threads to stop
            tC1.join();
            tC2.join();
            tC3.join();
            tC4.join();
            tC5.join();

            //Catch exception
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //2.B present the grand total, average, maximum and minimum of all the countries.
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("The grand total (sum) of all the countries is: " + ct.computeGrandSum());

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("The grand average of all the countries is: " + ct.computeGrandAverage());

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("The grand maximum of all the countries is: " + ct.computeGrandMax());

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("The grand minimum of all the countries is: " + ct.computeGrandMin());

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

}
