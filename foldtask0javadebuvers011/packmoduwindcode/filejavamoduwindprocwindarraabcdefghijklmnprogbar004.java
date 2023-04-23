package packmoduwindcode;

import packmoduloggcode.filejavamoduloggproclogg;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangemenet abcdefghijklmn Progress Bar 004' process related methods.

    This class is part of the 'Window' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamoduwindprocwindarraabcdefghijklmnprogbar004 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

/*
Description :


    The 'Module Window Process Window Arrangemenet abcdefghijklmn Progress Bar 004' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool(int locaIntPara0,String locaStriPara0) throws Exception {

        try {

            //System.out.println("\nThe 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool' started.");

            if(locaStriPara0==null) {

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'String Parameter' is null.");

                System.out.println("'False End Case' : The given 'String Parameter' is null.");

                System.out.println("The 'Module Window Process Window Arrangemenet abcdefghijklmn Progress Bar 004' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool' finished.");

                return false;}

            if ((locaStriPara0.isEmpty()==true)) {

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'String Parameter' is empty or it only contains 'Whitespace(s)'.");

                System.out.println("'False End Case' : The given 'String Parameter' is empty or it only contains 'Whitespace(s)'.");

                System.out.println("The 'Module Window Process Window Arrangemenet abcdefghijklmn Progress Bar 004' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool' finished.");

                return false;}

            if (locaStriPara0.length()<1) {

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'String Parameter' length is less than the minimum.");

                System.out.println("\n'False End Case' : The given 'String Parameter' length is less than the minimum.");

                System.out.println("The 'Module Window Process Window Arrangemenet abcdefghijklmn Progress Bar 004' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool' finished.");

                return false;}

            if ((locaIntPara0<0)||(locaIntPara0>100)) {

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Int Parameter' value is inappropriate.");

                System.out.println("\n'False End Case' : The given 'Int Parameter' value is inappropriate.");

                System.out.println("The 'Module Window Process Window Arrangemenet abcdefghijklmn Progress Bar 004' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool' finished.");

                return false;}

            //System.out.println("Parameters :");

            //System.out.println("The 'Percentage' value in the beginning of the method : '"+locaIntPara0+"'.");

            //System.out.println("The 'Process Code' value in the beginning of the method : '"+locaStriPara0+"'.");

            boolean locaBoolStat0=false;

            locaBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth1PrivStatBool(locaStriPara0);

            if (locaBoolStat0==false) {

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'String Parameter' contains only 'Whitespace(s)'.");

                System.out.println("\n'False End Case' : The given 'String Parameter' contains only 'Whitespace(s)'.");

                System.out.println("The 'Module Window Process Window Arrangemenet abcdefghijklmn Progress Bar 004' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth2PrivStatBool(locaIntPara0,locaStriPara0);

            if (locaBoolStat0==false) {

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Progress Bar' not updated correctly.");

                System.out.println("\n'False End Case' : The given 'Progress Bar' not updated correctly.");

                System.out.println("The 'Module Window Process Window Arrangemenet abcdefghijklmn Progress Bar 004' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool' finished.");

                return false;}

            //System.out.println("'True End Case'.");

            //System.out.println("The 'Module Window Process Window Arrangemenet abcdefghijklmn Progress Bar 004' process manager method.");

            //System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The 'Module Window Process Window Arrangemenet abcdefghijklmn Progress Bar 004' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool' finished.");

            return false;}}

/*
Description :


    The given 'String Parameter' content status checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth1PrivStatBool(String locaStriPara0) throws Exception {

        try {

            //System.out.println("\nThe 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth1PrivStatBool' :\nParameter :");

            //System.out.println("The 'Process Code' value in the beginning of the method : '"+locaStriPara0+"'.");

            if ((locaStriPara0.isBlank()==true)||(locaStriPara0.replaceAll("\\s","").length()<4)) {

                System.out.println("'False End Case' : The given 'String Parameter' contains only 'Whitespace(s)'.");

                System.out.println("The given 'String Parameter' content status checker method.");

                System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth1PrivStatBool' finished.");

                return false;}

            //System.out.println("'True End Case'.");

            //System.out.println("The given 'String Parameter' content status checker method.");

            //System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'String Parameter' content status checker method.");

            System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth1PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Progress Bar' changer method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth2PrivStatBool(int locaIntPara0,String locaStriPara0) throws Exception {

        try {

            //System.out.println("\nThe 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth2PrivStatBool' started.\nParameters :");

            //System.out.println("The 'Percentage' value in the beginning of the method : '"+locaIntPara0+"'.");

            //System.out.println("The 'Process Code' value in the beginning of the method : '"+locaStriPara0+"'.");

            globProtStatJLabPosi003.setText(locaStriPara0);

            globProtStatJProBarPosi004.setValue(locaIntPara0);

            //System.out.println("'True End Case'.");

            //System.out.println("The given 'Progress Bar' changer method.");

            //System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth2PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth2PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Progress Bar' changer method.");

            System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth2PrivStatBool' finished.");

            return false;}}}
