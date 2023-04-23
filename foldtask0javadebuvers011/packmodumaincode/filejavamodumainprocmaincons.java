package packmodumaincode;

import packmoduloggcode.filejavamoduloggproclogg;

/*
Description :


    This is the class for the 'Module Main Process Main Console' process related methods.

    This class is part of the 'Main' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodumainprocmaincons {

/*
Description :


    The 'Module Main Process Main Console' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool(String[] locaStriArraPara0) throws Exception {

        try {

            System.out.println("\nThe 'filejavamodumainprocmaincons.meth0PublStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodumainprocmaincons.meth0PublStatBool started.");

            if ((locaStriArraPara0==null)||(locaStriArraPara0[0]==null)) {

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' is null.");

                System.out.println("'False End Case' : The given 'Parameter' is null.");

                System.out.println("The 'Module Main Process Main Console' process manager method.");

                System.out.println("The 'filejavamodumainprocmaincons.meth0PublStatBool' finished.");

                return false;}

            if (locaStriArraPara0.length<2) {

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' size is less than 2.");

                System.out.println("'False End Case' : The given 'Parameter' size is less than 2.");

                System.out.println("The 'Module Main Process Main Console' process manager method.");

                System.out.println("The 'filejavamodumainprocmaincons.meth0PublStatBool' finished.");

                return false;}

            System.out.println("\nParameter : ");

            System.out.println("The 'Command Line Argument' value in the method beginning : '"+locaStriArraPara0[1]+"'.");

            boolean locaBoolStat0=false;

            locaBoolStat0=filejavamodumainprocmaincons.meth1PrivStatBool(locaStriArraPara0);

            if (locaBoolStat0==false) {

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Useful Command Line Argument' has no match.");

                System.out.println("\n'False End Case' : The given 'Command Line Argument' has no match.");

                System.out.println("The 'Module Main Process Main Console' process manager method.");

                System.out.println("The 'filejavamodumainprocmaincons.meth0PublStatBool' finished.");

                return false;}

            System.out.println("\n'True End Case'.");

            System.out.println("The 'Module Main Process Main Console' process manager method.");

            System.out.println("The 'filejavamodumainprocmaincons.meth0PublStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodumainprocmaincons.meth0PublStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The 'Module Main Process Main Console' process manager method.");

            System.out.println("The 'filejavamodumainprocmaincons.meth0PublStatBool' finished.");

            return false;}}

/*
Description :


    The 'Command Line Argument' matcher and information displayer method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth1PrivStatBool(String[] locaStriArraPara0) throws Exception {

        try {

            System.out.println("\nThe 'filejavamodumainprocmaincons.meth1PrivStatBool' started.\nParameter :");

            System.out.println("The 'Command Line Argument' value in the method beginning : '"+locaStriArraPara0[1]+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodumainprocmaincons.meth1PrivStatBool started.");

            if (locaStriArraPara0[1].equals("-h")||locaStriArraPara0[1].equals("-H")||locaStriArraPara0[1].equals("-help")||locaStriArraPara0[1].equals("-Help")) {

                System.err.println("\nThe 'Task 0' program's command line help.");

                System.err.println("Usage :");

                System.err.println("-h -H -help -Help");

                System.err.println("    Print help message to the system standard output.");

                System.err.println("-v -V -version -Version");

                System.err.println("    Print the version number of the program.");

                System.err.println("Current Version : Version 0.1.1. Demo");

                System.err.println("Made by : Jácint Papp, 2023-01-27");

                System.err.println("For Java programming showcase.");

                System.out.println("'True End Case'.");

                System.out.println("The 'Command Line Argument' matcher and information displayer method.");

                System.out.println("The 'filejavamodumainprocmaincons.meth1PrivStatBool' finished.");

                return true;}

            else if (locaStriArraPara0[1].equals("-v")||locaStriArraPara0[1].equals("-V")||locaStriArraPara0[1].equals("-version")||locaStriArraPara0[1].equals("-Version")) {

                System.err.println("\nCurrent Version : Version 0.1.1. Demo");

                System.err.println("Made by : Jácint Papp, 2023-01-27");

                System.err.println("For Java programming showcase.");

                System.out.println("'True End Case'.");

                System.out.println("The 'Command Line Argument' matcher and information displayer method.");

                System.out.println("The 'filejavamodumainprocmaincons.meth1PrivStatBool' finished.");

                return true;}

            else {

                System.out.println("'False End Case' : No 'Call Parameter' match case.");

                System.out.println("The 'Command Line Argument' matcher and information displayer method.");

                System.out.println("The 'filejavamodumainprocmaincons.meth1PrivStatBool' finished.");

                return false;}}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodumainprocmaincons.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The 'Command Line Argument' matcher and information displayer method.");

            System.out.println("The 'filejavamodumainprocmaincons.meth1PrivStatBool' finished.");

            return false;}}}
