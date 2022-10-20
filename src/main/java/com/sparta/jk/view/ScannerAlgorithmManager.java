package com.sparta.jk.view;

import com.sparta.jk.exceptions.IntMismatchException;
import com.sparta.jk.exceptions.OutOfBoundsException;

import java.util.Scanner;

import static com.sparta.jk.controller.SortManager.CLOSE_NUMBER;

public class ScannerAlgorithmManager {
    public static final int MAX_SIZE = 1000;
    public static final int MAX_ELEMENT = 10000;
    public static int scannerChooseAlgorithm() {
        Scanner scanner = new Scanner(System.in);
        int algorithmOfChoice = 0;
        DesignManager.printMenu();
        while(algorithmOfChoice == 0) {
            try {
                if (!scanner.hasNextInt()){
                    throw new IntMismatchException(CLOSE_NUMBER);
                }
                algorithmOfChoice = scanner.nextInt();
                if (algorithmOfChoice > CLOSE_NUMBER || algorithmOfChoice < 1) {
                    throw new OutOfBoundsException(CLOSE_NUMBER);
                }
            } catch (OutOfBoundsException e ) {
                algorithmOfChoice = 0;
                System.out.println(e.getMessage());
            } catch (IntMismatchException e) {
                System.out.println(e.getMessage());
                scanner.next();
            }
        }
        return algorithmOfChoice;
    }

    public static int scannerChooseArrayLen(){
        Scanner scanner = new Scanner(System.in);
        int chosenArrayLen = 0;
        DesignManager.printArrayLen(MAX_SIZE,MAX_ELEMENT);
        while (chosenArrayLen<1){
            try {
                if (!scanner.hasNextInt()){
                    throw new IntMismatchException(MAX_SIZE);
                }
                chosenArrayLen = scanner.nextInt();
                if (chosenArrayLen <= 0||chosenArrayLen > MAX_SIZE){
                    throw new OutOfBoundsException(MAX_SIZE);
                }
            } catch (OutOfBoundsException e) {
                chosenArrayLen = 0;
                System.out.println(e.getMessage());

            } catch (IntMismatchException e) {
                System.out.println(e.getMessage());
                scanner.next();
            }

        }
        return chosenArrayLen;
    }
}
