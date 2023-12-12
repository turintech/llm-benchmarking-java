package run.java;

import algorithms.Primes;
import algorithms.Sort;
import control.Double;
import control.Single;
import datastructures.DsVector;
import generator.GenVector;
import java.util.Vector;

public class App {
    public static void single() {
        System.out.println("SingleForLoop");
        System.out.println("-------------");
        System.out.println(String.format("SumRange(10): %s", Single.SumRange(10)));
        System.out.println(
                String.format("MaxArray([1, 2, 3, 4, 5]): %s",
                        Single.MaxArray(new int[] { 1, 2, 3, 4, 5 })));
        System.out.println(
                String.format("SumModulus(100, 3): %s", Single.SumModulus(100, 3)));
        System.out.println();
    }

    public static void double_() {
        System.out.println("DoubleForLoop");
        System.out.println("-------------");
        System.out.println(
                String.format("SumSquare(10): %s", Double.SumSquare(10)));
        System.out.println(
                String.format("SumTriangle(10): %s", Double.SumTriangle(10)));
        System.out.println(
                String.format("CountPairs([1, 2, 3, 4, 5]): %s",
                        Double.CountPairs(new int[] { 1, 2, 3, 4, 5, 2 })));
        System.out.println(
                String.format("CountDuplicates([1, 2, 3, 4, 5], [1, 3, 2, 4, 5]): %s",
                        Double.CountDuplicates(new int[] { 1, 2, 3, 4, 5 },
                                new int[] { 1, 3, 2, 4, 5 })));
        System.out.println();
    }

    public static void vector() {
        Vector<Integer> inputVec = GenVector.GenerateVector(10, 10);
        Vector<Integer> inputVec2 = GenVector.GenerateVector(10, 10);

        System.out.println("Vector");
        System.out.println("------");
        System.out.println(
                String.format("ModifyVector(%s): %s", inputVec.toString(),
                        DsVector.ModifyVector(inputVec).toString()));
        System.out.println(String.format("SearchVector(%s, 5): %s",
                inputVec.toString(),
                DsVector.SearchVector(inputVec, 5)));
        System.out.println(String.format("SortVector(%s): %s", inputVec.toString(),
                DsVector.SortVector(inputVec).toString()));
        System.out.println(
                String.format("ReverseVector(%s): %s", inputVec.toString(),
                        DsVector.ReverseVector(inputVec).toString()));
        System.out.println(
                String.format("RotateVector(%s, 3): %s", inputVec.toString(),
                        DsVector.RotateVector(inputVec, 3).toString()));
        System.out.println(String.format(
                "MergeVectors(%s, %s): %s", inputVec.toString(), inputVec2.toString(),
                DsVector.MergeVectors(inputVec, inputVec2).toString()));

        System.out.println();
    }

    public static void primes() {
        System.out.println("Primes");
        System.out.println("------");
        System.out.println(String.format("IsPrime(10): %s", Primes.IsPrime(10)));
        System.out.println(
                String.format("SumPrimes(10): %s", Primes.SumPrimes(10)));
        System.out.println(String.format("PrimeFactors(10): %s",
                Primes.PrimeFactors(10).toString()));
        System.out.println();
    }

    public static void sort() {
        Vector<Integer> initialVec = GenVector.GenerateVector(20, 10);
        System.out.println("Sort");
        System.out.println("------");
        Vector<Integer> inputVec0 = new Vector<Integer>(initialVec);
        Sort.SortVector(inputVec0);
        System.out.println(String.format(
                "SortVector(%s): %s", initialVec.toString(), inputVec0.toString()));
        Vector<Integer> inputVec1 = new Vector<Integer>(initialVec);
        Sort.DutchFlagPartition(inputVec1, 5);
        System.out.println(String.format("DutchFlagPartition(%s, 5): %s",
                inputVec1.toString(),
                inputVec1.toString()));
        System.out.println(String.format("MaxN(%s, 5): %s", initialVec.toString(),
                Sort.MaxN(initialVec, 5).toString()));
        System.out.println();
    }

    public static void main(String[] args) {
        single();
        double_();
        vector();
        primes();
        sort();
    }
}
