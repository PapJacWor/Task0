import java.io.BufferedWriter;

import java.io.File;

import java.io.FileWriter;

import java.util.ArrayList;

import java.util.Scanner;

/*
Description :


    This is the class for the 'Program Code Debug Version To Final Version' process related method.

    This class is part of the 'Main' module.


    Version :


        0.1. :


            2023-01-27 :


                Initial demo version.
*/

public class filejavamodumainprocmain {

/*
Description :


    The 'Module Main Process Main' process method.


    Version :


        0.1. :


            2023-01-27 :


                Initial demo version.
*/

    public static void main(String[] locaStriArraPara0) throws Exception {

        try {

            System.err.println("\nTo create a folder in the desired location, add the item to the program's first (0) list.");

            System.err.println("It should start with the 'folder' keyword followed by a comma.");

            System.err.println("Then the folder path with the folder name.");

            System.err.println("An example value like :");

            System.err.println("folder,/home/test/Desktop/foldtestdebu/");

            ArrayList<String> locaArraListStriPara0=new ArrayList<>();

            if (locaArraListStriPara0.isEmpty()==false) {

                locaArraListStriPara0.clear();}

            locaArraListStriPara0.add("folder,/home/test/Desktop/foldtask0javadebuvers011/");

            locaArraListStriPara0.add("folder,/home/test/Desktop/foldtask0javadebuvers011/foldcompcode/");

            locaArraListStriPara0.add("folder,/home/test/Desktop/foldtask0javadebuvers011/foldtask0docu/");

            locaArraListStriPara0.add("folder,/home/test/Desktop/foldtask0javadebuvers011/foldtask0outdlibl/");

            locaArraListStriPara0.add("folder,/home/test/Desktop/foldtask0javadebuvers011/foldtask0testfile/");

            locaArraListStriPara0.add("folder,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/");

            locaArraListStriPara0.add("folder,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/");

            locaArraListStriPara0.add("folder,/home/test/Desktop/foldtask0javadebuvers011/packmoduloggcode/");

            locaArraListStriPara0.add("folder,/home/test/Desktop/foldtask0javadebuvers011/packmoduloggtest/");

            locaArraListStriPara0.add("folder,/home/test/Desktop/foldtask0javadebuvers011/packmodumaincode/");

            locaArraListStriPara0.add("folder,/home/test/Desktop/foldtask0javadebuvers011/packmodumaintest/");

            locaArraListStriPara0.add("folder,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/");

            locaArraListStriPara0.add("folder,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/");

            System.err.println("\nTo create a copied program code file in the desired location, add the item to the program's first (0) list.");

            System.err.println("It should start with the 'file' keyword followed by a comma.");

            System.err.println("Then the source file's source path with the file's name followed by a comma.");

            System.err.println("Then the destination file's destination path with the file's name.");

            System.err.println("An example value like :");

            System.err.println("file,/home/test/foldtestdebu/filejavatest.java,/home/test/Desktop/foldtestdebu/filejavatest.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataclaswindarraabcdefghijklmnbase.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataclaswindarraabcdefghijklmnbase.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarraabutt190.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarraabutt190.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrabbutt124.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrabbutt124.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrabbutt134.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrabbutt134.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrabbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrabbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarracbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarracbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarracdefghijkbutt124.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarracdefghijkbutt124.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarracdefghijkbutt134.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarracdefghijkbutt134.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarracdefghijkbutt144.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarracdefghijkbutt144.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarradbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarradbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarraebutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarraebutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrafbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrafbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarragbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarragbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrahbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrahbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarraibutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarraibutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrajbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrajbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrakbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrakbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarralbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarralbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrambutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrambutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarranbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarranbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataclaswindarraabcdefghijklmnbase.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataclaswindarraabcdefghijklmnbase.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarraabutt190.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarraabutt190.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarrabbutt124.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarrabbutt124.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarrabbutt134.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarrabbutt134.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarrabbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarrabbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarracbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarracbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarracdefghijkbutt124.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarracdefghijkbutt124.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarracdefghijkbutt134.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarracdefghijkbutt134.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarracdefghijkbutt144.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarracdefghijkbutt144.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarradbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarradbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarraebutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarraebutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarrafbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarrafbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarragbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarragbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarrahbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarrahbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarraibutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarraibutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarrajbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarrajbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarrakbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarrakbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarralbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarralbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarrambutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarrambutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarranbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmodudatatest/filejavamodutestmodudataprocwindarranbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduloggcode/filejavamoduloggproclogg.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduloggcode/filejavamoduloggproclogg.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduloggtest/filejavamodutestmoduloggproclogg.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduloggtest/filejavamodutestmoduloggproclogg.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodumaincode/filejavamodumainprocmain.java,/home/test/Desktop/foldtask0javadebuvers011/packmodumaincode/filejavamodumainprocmain.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodumaincode/filejavamodumainprocmaincons.java,/home/test/Desktop/foldtask0javadebuvers011/packmodumaincode/filejavamodumainprocmaincons.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodumaintest/filejavamodutestmodumainprocmain.java,/home/test/Desktop/foldtask0javadebuvers011/packmodumaintest/filejavamodutestmodumainprocmain.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmodumaintest/filejavamodutestmodumainprocmaincons.java,/home/test/Desktop/foldtask0javadebuvers011/packmodumaintest/filejavamodutestmodumainprocmaincons.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindclaswindarraabcdefghijklmnbase.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindclaswindarraabcdefghijklmnbase.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt000.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt000.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt001.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt001.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt002.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt002.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt005.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt005.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt114.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt114.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmncrea.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmncrea.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnmana.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnmana.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnmess.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnmess.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnprogbar004.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnprogbar004.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabutt134.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabutt134.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabutt190.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabutt190.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraacombbox163.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraacombbox163.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraa.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraa.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt124andbutt134.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt124andbutt134.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt124.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt124.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt124mana.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt124mana.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt134.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt134.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt134mana.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt134mana.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrab.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrab.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt124.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt124.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt124mana.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt124mana.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt134.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt134.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt134mana.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt134mana.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt144.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt144.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt144mana.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt144mana.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrac.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrac.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarradbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarradbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrad.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrad.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraebutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraebutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrae.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrae.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrafbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrafbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraf.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraf.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarragbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarragbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrag.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrag.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrahbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrahbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrah.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrah.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraibutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraibutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrai.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrai.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrajbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrajbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraj.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraj.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrakbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrakbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrak.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrak.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarralbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarralbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarral.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarral.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrambutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrambutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarram.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarram.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarranbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarranbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarran.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarran.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindclaswindarraabcdefghijklmnbase.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindclaswindarraabcdefghijklmnbase.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabcdefghijklmnbutt000.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabcdefghijklmnbutt000.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabcdefghijklmnbutt001.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabcdefghijklmnbutt001.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabcdefghijklmnbutt002.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabcdefghijklmnbutt002.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabcdefghijklmnbutt005.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabcdefghijklmnbutt005.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabcdefghijklmnbutt114.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabcdefghijklmnbutt114.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabcdefghijklmncrea.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabcdefghijklmncrea.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabcdefghijklmnmana.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabcdefghijklmnmana.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabcdefghijklmnmess.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabcdefghijklmnmess.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabcdefghijklmnprogbar004.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabcdefghijklmnprogbar004.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabutt134.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabutt134.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabutt190.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraabutt190.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraacombbox163.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraacombbox163.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraa.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraa.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrabbutt124andbutt134.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrabbutt124andbutt134.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrabbutt124.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrabbutt124.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrabbutt124mana.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrabbutt124mana.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrabbutt134.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrabbutt134.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrabbutt134mana.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrabbutt134mana.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrabbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrabbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrab.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrab.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrab.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrab.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarracbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarracbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarracdefghijkbutt124.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarracdefghijkbutt124.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarracdefghijkbutt124mana.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarracdefghijkbutt124mana.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarracdefghijkbutt134.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarracdefghijkbutt134.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarracdefghijkbutt134mana.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarracdefghijkbutt134mana.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarracdefghijkbutt144.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarracdefghijkbutt144.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarracdefghijkbutt144mana.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarracdefghijkbutt144mana.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrac.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrac.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarradbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarradbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrad.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrad.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraebutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraebutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrae.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrae.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrafbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrafbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraf.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraf.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarragbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarragbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrag.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrag.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrahbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrahbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrah.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrah.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraibutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraibutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrai.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrai.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrajbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrajbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraj.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarraj.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrakbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrakbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrak.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrak.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarralbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarralbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarral.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarral.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrambutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarrambutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarram.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarram.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarranbutt154.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarranbutt154.java");

            locaArraListStriPara0.add("file,/home/test/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarran.java,/home/test/Desktop/foldtask0javadebuvers011/packmoduwindtest/filejavamodutestmoduwindprocwindarran.java");

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaArraListStriPara0.size();locaIntForCyclCoun0++) {

                String[] locaStriArraSpli0=locaArraListStriPara0.get(locaIntForCyclCoun0).split(",");

                if (locaStriArraSpli0[0].equals("folder")) {

                    File locaFileFold0=new File(locaStriArraSpli0[1]);

                    if (locaFileFold0.exists()==false) {

                        locaFileFold0.mkdirs();}}

                if (locaStriArraSpli0[0].equals("file")) {

                    ArrayList<String> locaArraListStriFileCont0=new ArrayList<>();

                    if (locaArraListStriFileCont0.isEmpty()==false) {

                        locaArraListStriFileCont0.clear();}           

                    File locaFileStat0=new File(locaStriArraSpli0[1]);

                    Scanner locaScanFile0=new Scanner(locaFileStat0);

                    String locaStriReadRow0="";

                    while (locaScanFile0.hasNextLine()) {

                        locaStriReadRow0=locaScanFile0.nextLine();

                        locaArraListStriFileCont0.add(locaStriReadRow0);}

                    locaScanFile0.close();

                    FileWriter locaFileWritStat0=new FileWriter(locaStriArraSpli0[2],false);

                    BufferedWriter locaBuffWritStat0=new BufferedWriter(locaFileWritStat0);

                    for (int locaIntForCyclCoun1=0;locaIntForCyclCoun1<locaArraListStriFileCont0.size();locaIntForCyclCoun1++) {

                        locaBuffWritStat0.append(locaArraListStriFileCont0.get(locaIntForCyclCoun1));

                        locaBuffWritStat0.newLine();}

                    locaBuffWritStat0.close();

                    locaFileWritStat0.close();}}

            ArrayList<String> locaArraListStriPara1=new ArrayList<>();

            if (locaArraListStriPara1.isEmpty()==false) {

                locaArraListStriPara1.clear();}

            System.err.println("\nTo create a folder in the desired location, add the item to the program's second (1) list.");

            System.err.println("It should start with the 'folder' keyword followed by a comma.");

            System.err.println("Then the folder path with the folder name.");

            System.err.println("An example value like :");

            System.err.println("folder,/home/test/Desktop/foldtestfina/");

            locaArraListStriPara1.add("folder,/home/test/Desktop/foldtask0javafinavers011/");

            locaArraListStriPara1.add("folder,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/");

            locaArraListStriPara1.add("folder,/home/test/Desktop/foldtask0javafinavers011/packmoduloggcode/");

            locaArraListStriPara1.add("folder,/home/test/Desktop/foldtask0javafinavers011/packmodumaincode/");

            locaArraListStriPara1.add("folder,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/");

            System.err.println("\nTo create a copied program code file in the desired location without the 'System.out.println' lines, add the item to the program's second (1) list.");

            System.err.println("It should start with the 'file' keyword followed by a comma.");

            System.err.println("Then the source file's source path with the file's name followed by a comma.");

            System.err.println("Then the destination file's destination path with the file's name.");

            System.err.println("An example value like :");

            System.err.println("file,/home/test/foldtestfina/filejavatest.java,/home/test/Desktop/foldtestfina/filejavatest.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataclaswindarraabcdefghijklmnbase.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataclaswindarraabcdefghijklmnbase.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarraabutt190.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataprocwindarraabutt190.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrabbutt124.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataprocwindarrabbutt124.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrabbutt134.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataprocwindarrabbutt134.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrabbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataprocwindarrabbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarracbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataprocwindarracbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarracdefghijkbutt124.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataprocwindarracdefghijkbutt124.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarracdefghijkbutt134.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataprocwindarracdefghijkbutt134.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarracdefghijkbutt144.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataprocwindarracdefghijkbutt144.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarradbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataprocwindarradbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarraebutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataprocwindarraebutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrafbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataprocwindarrafbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarragbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataprocwindarragbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrahbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataprocwindarrahbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarraibutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataprocwindarraibutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrajbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataprocwindarrajbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrakbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataprocwindarrakbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarralbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataprocwindarralbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarrambutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataprocwindarrambutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodudatacode/filejavamodudataprocwindarranbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmodudatacode/filejavamodudataprocwindarranbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduloggcode/filejavamoduloggproclogg.java,/home/test/Desktop/foldtask0javafinavers011/packmoduloggcode/filejavamoduloggproclogg.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodumaincode/filejavamodumainprocmain.java,/home/test/Desktop/foldtask0javafinavers011/packmodumaincode/filejavamodumainprocmain.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmodumaincode/filejavamodumainprocmaincons.java,/home/test/Desktop/foldtask0javafinavers011/packmodumaincode/filejavamodumainprocmaincons.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindclaswindarraabcdefghijklmnbase.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindclaswindarraabcdefghijklmnbase.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt000.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt000.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt001.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt001.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt002.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt002.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt005.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt005.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt114.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnbutt114.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmncrea.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmncrea.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnmana.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnmana.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnmess.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnmess.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnprogbar004.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarraabcdefghijklmnprogbar004.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabutt134.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarraabutt134.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarraabutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraabutt190.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarraabutt190.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraacombbox163.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarraacombbox163.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraa.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarraa.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt124andbutt134.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt124andbutt134.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt124.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt124.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt124mana.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt124mana.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt134.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt134.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt134mana.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt134mana.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarrabbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrab.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarrab.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarracbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt124.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt124.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt124mana.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt124mana.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt134.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt134.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt134mana.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt134mana.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt144.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt144.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt144mana.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarracdefghijkbutt144mana.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrac.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarrac.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarradbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarradbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrad.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarrad.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraebutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarraebutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrae.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarrae.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrafbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarrafbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraf.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarraf.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarragbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarragbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrag.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarrag.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrahbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarrahbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrah.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarrah.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraibutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarraibutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrai.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarrai.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrajbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarrajbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarraj.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarraj.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrakbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarrakbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrak.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarrak.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarralbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarralbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarral.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarral.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarrambutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarrambutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarram.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarram.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarranbutt154.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarranbutt154.java");

            locaArraListStriPara1.add("file,/home/test/foldtask0javadebuvers011/packmoduwindcode/filejavamoduwindprocwindarran.java,/home/test/Desktop/foldtask0javafinavers011/packmoduwindcode/filejavamoduwindprocwindarran.java");

            for (int locaIntForCyclCoun2=0;locaIntForCyclCoun2<locaArraListStriPara1.size();locaIntForCyclCoun2++) {

                String[] locaStriArraSpli0=locaArraListStriPara1.get(locaIntForCyclCoun2).split(",");

                if (locaStriArraSpli0[0].equals("folder")) {

                    File locaFileFold0=new File(locaStriArraSpli0[1]);

                    if (locaFileFold0.exists()==false) {

                        locaFileFold0.mkdirs();}}

                if (locaStriArraSpli0[0].equals("file")) {

                    ArrayList<String> locaArraListStriFileCont0=new ArrayList<>();

                    if (locaArraListStriFileCont0.isEmpty()==false) {

                        locaArraListStriFileCont0.clear();}

                    File locaFileStat0=new File(locaStriArraSpli0[1]);

                    Scanner locaScanFile0=new Scanner(locaFileStat0);

                    String locaStriReadRow0="";

                    while (locaScanFile0.hasNextLine()) {

                        locaStriReadRow0=locaScanFile0.nextLine();

                        if (locaStriReadRow0.contains("System.out.print")) {

                            locaStriReadRow0=locaScanFile0.nextLine();}

                        else {

                            locaArraListStriFileCont0.add(locaStriReadRow0);}}

                    locaScanFile0.close();

                    FileWriter locaFileWritStat0=new FileWriter(locaStriArraSpli0[2],false);

                    BufferedWriter locaBuffWritStat0=new BufferedWriter(locaFileWritStat0);

                    for (int locaIntForCyclCoun1=0;locaIntForCyclCoun1<locaArraListStriFileCont0.size();locaIntForCyclCoun1++) {

                        locaBuffWritStat0.append(locaArraListStriFileCont0.get(locaIntForCyclCoun1));

                        locaBuffWritStat0.newLine();}

                    locaBuffWritStat0.close();

                    locaFileWritStat0.close();}}}

        catch (Exception locaExceCatcExce0){

            System.err.println(locaExceCatcExce0.getMessage());

            System.err.println("'Exception End Case'.");}}}