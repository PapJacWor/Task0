package packmoduwindcode;

import packmoduloggcode.filejavamoduloggproclogg;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement m Button 154' process related methods.

    This class is part of the 'Window' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamoduwindprocwindarrambutt154 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

/*
Description :


    The 'Module Window Process Window Arrangement m Button 154' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarrambutt154.meth0PublStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarrambutt154.meth0PublStatBool started.");

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(0,"MWPWAmB154 0/4");

            boolean locaBoolStat0=false;

            locaBoolStat0=filejavamoduwindprocwindarrambutt154.meth1PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(25,"MWPWAmB154 1/4");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Fields' contains at least one field value that is not correct.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Fields' contains at least one field value that is not correct.");

                System.out.println("\n'False End Case' : The given 'Fields' contains at least one field value that is not correct.");

                System.out.println("The 'Module Window Process Window Arrangement m Button 154' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarrambutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamoduwindprocwindarrambutt154.meth2PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(50,"MWPWAmB154 2/4");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Fields' contains at least one 'Whitespace' character.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Fields' contains at least one 'Whitespace' character.");

                System.out.println("\n'False End Case' : The given 'Fields' contains at least one 'Whitespace' character.");

                System.out.println("The 'Module Window Process Window Arrangement m Button 154' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarrambutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamoduwindprocwindarrambutt154.meth3PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(75,"MWPWAmB154 3/4");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Fields' values cannot be added to the 'Call Parameter'.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Fields' values cannot be added to the 'Call Parameter'.");

                System.out.println("\n'False End Case' : The given 'Fields' values cannot be added to the 'Call Parameter'");

                System.out.println("The 'Module Window Process Window Arrangement m Button 154' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarrambutt154.meth0PublStatBool' finished.");

                return false;}

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(100,"MWPWAmB154 4/4");

            System.out.println("\n'True End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement m Button 154' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarrambutt154.meth0PublStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarrambutt154.meth0PublStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement m Button 154' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarrambutt154.meth0PublStatBool' finished.");

            return false;}}

/*
Description :


    The 'Field' content length checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth1PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarrambutt154.meth1PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Selected SQL Username' value in the beginning of the method : '"+globProtStatJTexFielPosi113.getText()+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarrambutt154.meth1PrivStatBool started.");

            if (globProtStatJTexFielPosi113.getText()==null) {

                System.out.println("'False End Case' : At least one of the given 'Field' content is null.");

                System.out.println("The input 'Field' content length checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrambutt154.meth1PrivStatBool' finished.");

                return false;}

            if (globProtStatJTexFielPosi113.getText().length()<1) {

                System.out.println("'False End Case' : At least one of the given 'Field' content has less length than the minimum.");

                System.out.println("The input 'Field' content length checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrambutt154.meth1PrivStatBool' finished.");

                return false;}

            if (globProtStatJTexFielPosi113.getText().length()>30) {

                System.out.println("'False End Case' : At least one of the given 'Field' content has more length than the maximum.");

                System.out.println("The input 'Field' content length checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrambutt154.meth1PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The input 'Field' content length checker method.");

            System.out.println("The 'filejavamoduwindprocwindarrambutt154.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarrambutt154.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The input 'Field' content length checker method.");

            System.out.println("The 'filejavamoduwindprocwindarrambutt154.meth1PrivStatBool' finished.");

            return false;}}

/*
Description :


    The input 'Field' content 'Whitespace' checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth2PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarrambutt154.meth2PrivStatBool' started.\nParameter :");

            System.out.println("The given 'Selected SQL Username' value in the beginning of the method : '"+globProtStatJTexFielPosi113.getText()+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarrambutt154.meth2PrivStatBool started.");

            boolean locaBoolStat1=true;

            char[] locaCharArraChec0=globProtStatJTexFielPosi113.getText().toCharArray();

            for(int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec0.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec0[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'Selected SQL Username' : '"+globProtStatJTexFielPosi113.getText()+"' value contains at least one 'Whitespace' character.");

                System.out.println("The input 'Field' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrambutt154.meth2PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The input 'Field' content 'Whitespace' checker method.");

            System.out.println("The 'filejavamoduwindprocwindarrambutt154.meth2PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarrambutt154.meth2PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The input 'Field' content 'Whitespace' checker method.");

            System.out.println("The 'filejavamoduwindprocwindarrambutt154.meth2PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'SQL Username' data adder to the 'Call Parameter' method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth3PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarrambutt154.meth3PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Selected SQL Username' value in the beginning of the method : '"+globProtStatJTexFielPosi113.getText()+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarrambutt154.meth3PrivStatBool started.");

            globProtStatArraListStriModuWindCallPara0.add(globProtStatJTexFielPosi113.getText());

            System.out.println("'True End Case'.");

            System.out.println("The given 'SQL Username' data adder to the 'Call Parameter' method.");

            System.out.println("The 'filejavamoduwindprocwindarrambutt154.meth3PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarrambutt154.meth3PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'SQL Username' data adder to the 'Call Parameter' method.");

            System.out.println("The 'filejavamoduwindprocwindarrambutt154.meth3PrivStatBool' finished.");

            return false;}}}
