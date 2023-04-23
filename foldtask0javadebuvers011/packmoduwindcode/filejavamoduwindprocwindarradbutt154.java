package packmoduwindcode;

import packmoduloggcode.filejavamoduloggproclogg;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement d Button 154' process related methods.

    This class is part of the 'Window' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamoduwindprocwindarradbutt154 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

/*
Description :


    The 'Module Window Process Window Arrangement d Button 154' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarradbutt154.meth0PublStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarradbutt154.meth0PublStatBool started.");

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(0,"MWPWAdB154 0/3");

            boolean locaBoolStat0=false;

            locaBoolStat0=filejavamoduwindprocwindarradbutt154.meth1PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(33,"MWPWAdB154 1/3");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Fields' contains at least one field value that is not correct.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Fields' contains at least one field value that is not correct.");

                System.out.println("\n'False End Case' : The given 'Fields' contains at least one field value that is not correct.");

                System.out.println("The 'Module Window Process Window Arrangement d Button 154' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarradbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamoduwindprocwindarradbutt154.meth2PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(66,"MWPWAdB154 2/3");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Fields' values cannot be added to the 'Call Parameter'.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Fields' values cannot be added to the 'Call Parameter'.");

                System.out.println("\n'False End Case' : The given 'Fields' values cannot be added to the 'Call Parameter'.");

                System.out.println("The 'Module Window Process Window Arrangement d Button 154' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarradbutt154.meth0PublStatBool' finished.");

                return false;}

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(100,"MWPWAdB154 3/3");

            System.out.println("\n'True End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement d Button 154' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarradbutt154.meth0PublStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarradbutt154.meth0PublStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement d Button 154' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarradbutt154.meth0PublStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Fields' content length checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth1PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarradbutt154.meth1PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Selected Company Name' value in the beginning of the method : '"+globProtStatJTexFielPosi111.getText()+"'.");

            System.out.println("The given 'Selected Company Address' value in the beginning of the method : '"+globProtStatJTexFielPosi121.getText()+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarradbutt154.meth1PrivStatBool started.");

            if ((globProtStatJTexFielPosi111.getText()==null)||(globProtStatJTexFielPosi121.getText()==null)) {

                System.out.println("'False End Case' : At least one of the given 'Fields' content is null.");

                System.out.println("The input 'Fields' content length checker method.");

                System.out.println("The 'filejavamoduwindprocwindarradbutt154.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatJTexFielPosi111.getText().length()<1)||(globProtStatJTexFielPosi121.getText().length()<1)) {

                System.out.println("'False End Case' : At least one of the given 'Fields' content has less length than the minimum.");

                System.out.println("The input 'Fields' content length checker method.");

                System.out.println("The 'filejavamoduwindprocwindarradbutt154.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatJTexFielPosi111.getText().length()>120)||(globProtStatJTexFielPosi121.getText().length()>120)) {

                System.out.println("'False End Case' : At least one of the given 'Fields' content has more length than the maximum.");

                System.out.println("The input 'Fields' content length checker method.");

                System.out.println("The 'filejavamoduwindprocwindarradbutt154.meth1PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The input 'Fields' content length checker method.");

            System.out.println("The 'filejavamoduwindprocwindarradbutt154.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarradbutt154.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The input 'Fields' content length checker method.");

            System.out.println("The 'filejavamoduwindprocwindarradbutt154.meth1PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Selected Company' data adder to the 'Call Parameter' method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth2PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarradbutt154.meth2PrivStatBool' started.\nParameters :");

            System.out.println("The 'Selected Company Name' value in the beginning of the method : '"+globProtStatJTexFielPosi111.getText()+"'.");

            System.out.println("The 'Selected Company Address' value in the beginning of the method : '"+globProtStatJTexFielPosi121.getText()+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarradbutt154.meth2PrivStatBool started.");

            globProtStatArraListStriModuWindCallPara0.add(globProtStatJTexFielPosi111.getText());

            globProtStatArraListStriModuWindCallPara0.add(globProtStatJTexFielPosi121.getText());

            System.out.println("'True End Case'.");

            System.out.println("The given 'Selected Company' data adder to the 'Call Parameter' method.");

            System.out.println("The 'filejavamoduwindprocwindarradbutt154.meth2PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarradbutt154.meth2PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Selected Company' data adder to the 'Call Parameter' method.");

            System.out.println("The 'filejavamoduwindprocwindarradbutt154.meth2PrivStatBool' finished.");

            return false;}}}
