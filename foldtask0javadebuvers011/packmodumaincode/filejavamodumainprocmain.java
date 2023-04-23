package packmodumaincode;

import packmoduloggcode.filejavamoduloggproclogg;

import packmoduwindcode.filejavamoduwindprocwindarraabcdefghijklmnmana;

/*
Description :


    This is the class for the 'Module Main Process Main' process related method.

    This class is part of the 'Main' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodumainprocmain {

/*
Description :


    The 'Module Main Process Main' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static void main(String[] locaStriArraPara0) throws Exception {

        try {

            System.out.println("\nThe 'filejavamodumainprocmain.main' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INDENT","The 'Task 0' program started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodumainprocmain.main started.");

            if (locaStriArraPara0.length>1) {

                System.out.println("The 'filejavamodumainprocmaincons.meth0PublStatBool' calling case.");

                filejavamodumainprocmaincons.meth0PublStatBool(locaStriArraPara0);}

            else {

                System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmana' calling case.");

                new filejavamoduwindprocwindarraabcdefghijklmnmana();}

            System.out.println("\n'True End Case'.");

            System.out.println("The 'Module Main Process Main' process manager method.");

            System.out.println("The 'filejavamodumainprocmain.main' finished.");

            Thread.sleep(20);}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodumainprocmain.main.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The 'Module Main Process Main' process manager method.");

            System.out.println("The 'filejavamodumainprocmain.main' finished.");

            return;}}}
