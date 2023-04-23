package packmoduwindcode;

import packmoduloggcode.filejavamoduloggproclogg;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement c Button 154' process related methods.

    This class is part of the 'Window' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamoduwindprocwindarracbutt154 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

/*
Description :


    The 'Module Window Process Window Arrangement c Button 154' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarracbutt154.meth0PublStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarracbutt154.meth0PublStatBool started.");

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(0,"MWPWAcB154 0/4");

            boolean locaBoolStat0=false;

            locaBoolStat0=filejavamoduwindprocwindarracbutt154.meth1PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(25,"MWPWAcB154 1/4");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Fields' contains at least one field value that is not correct.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Fields' contains at least one field value that is not correct.");

                System.out.println("\n'False End Case' : The given 'Fields' contains at least one field value that is not correct.");

                System.out.println("The 'Module Window Process Window Arrangement c Button 154' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth0PublStatBool' finshed.");

                return false;}

            locaBoolStat0=filejavamoduwindprocwindarracbutt154.meth2PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(50,"MWPWAcB154 2/4");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Company Hour' is not in the correct format or it has not valid hour(s) or not valid minute(s) value(s).");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Company Hour' is not in the correct format or it has not valid hour(s) or not valid minute(s) value(s).");

                System.out.println("\n'False End Case' : The given 'Company Hour' is not in the correct format or it has not valid hour(s) or not valid minute(s) value(s).");

                System.out.println("The 'Module Window Process Window Arrangement c Button 154' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth0PublStatBool' finshed.");

                return false;}

            locaBoolStat0=filejavamoduwindprocwindarracbutt154.meth3PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(75,"MWPWAcB154 3/4");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Fields' values cannot be added to the 'Call Parameter'.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Fields' values cannot be added to the 'Call Parameter'.");

                System.out.println("\n'False End Case' : The given 'Fields' values cannot be added to the 'Call Parameter'.");

                System.out.println("The 'Module Window Process Window Arrangement c Button 154' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth0PublStatBool' finshed.");

                return false;}

            System.out.println("\n'True End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement c Button 154' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth0PublStatBool' finshed.");

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(100,"MWPWAcB154 4/4");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarracbutt154.meth0PublStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement c Button 154' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth0PublStatBool' finshed.");

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

            System.out.println("\nThe 'filejavamoduwindprocwindarracbutt154.meth1PrivStatBool' started.\nParameters :");

            System.out.println("The given 'New Company Name' value in the beginning of the method : '"+globProtStatJTexFielPosi111.getText()+"'.");

            System.out.println("The given 'New Company Address' value in the beginning of the method : '"+globProtStatJTexFielPosi121.getText()+"'.");

            System.out.println("The given 'New Company Open Hours' value in the beginning of the method : '"+globProtStatJTexFielPosi113.getText()+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarracbutt154.meth1PrivStatBool started.");

            if ((globProtStatJTexFielPosi111.getText()==null)||(globProtStatJTexFielPosi113.getText()==null)||(globProtStatJTexFielPosi121.getText()==null)) {

                System.out.println("'False End Case' : At least one of the given 'Fields' content is null.");

                System.out.println("The input 'Fields' content length checker method.");

                System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatJTexFielPosi111.getText().length()<1)||(globProtStatJTexFielPosi113.getText().length()<1)||(globProtStatJTexFielPosi121.getText().length()<1)) {

                System.out.println("'False End Case' : At least one of the given 'Fields' content has less length than the minimum.");

                System.out.println("The input 'Fields' content length checker method.");

                System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatJTexFielPosi111.getText().length()>120)||(globProtStatJTexFielPosi113.getText().length()!=11)||(globProtStatJTexFielPosi121.getText().length()>120)) {

                System.out.println("'False End Case' : At least one of the given 'Fields' content has more length than the maximum or not the desired length.");

                System.out.println("The input 'Fields' content length checker method.");

                System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth1PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The input 'Fields' content length checker method.");

            System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarracbutt154.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The input 'Fields' content length checker method.");

            System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth1PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Company Open Hours' value checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth2PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarracbutt154.meth2PrivStatBool' started.\nParameter :");

            System.out.println("The given 'New Company Open Hours' value in the beginning of the method : '"+globProtStatJTexFielPosi113.getText()+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarracbutt154.meth2PrivStatBool started.");

            boolean locaBoolStat1=false;

            if ((globProtStatJTexFielPosi113.getText().contains("-")==false)||(globProtStatJTexFielPosi113.getText().contains(":")==false)) {

                System.out.println("'False End Case' : The given 'New Company Open Hours' : '"+globProtStatJTexFielPosi113.getText()+"' value  did not contain the '-' or the ':' character(s).");

                System.out.println("The given 'Company Open Hours' value checker method.");

                System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec0=String.valueOf(globProtStatJTexFielPosi113.getText()).toCharArray();

            for(int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec0.length;locaIntForCyclCoun0++) {

                if ((Character.isDigit(locaCharArraChec0[locaIntForCyclCoun0])==false)&&(locaCharArraChec0[locaIntForCyclCoun0]!='-')&&(locaCharArraChec0[locaIntForCyclCoun0]!=':')) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'New Company Open Hours' : '"+globProtStatJTexFielPosi113.getText()+"' value contains at least one character that is not a digital type or a dash or a colon point.");

                System.out.println("The given 'Company Open Hours' value checker method.");

                System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth2PrivStatBool' finished.");

                return false;}

            String[] locaStriArraSpli0=globProtStatJTexFielPosi113.getText().split("-");

            String[] locaStriArraSpli1=locaStriArraSpli0[0].split(":");

            int locaIntCompOpenHour0=Integer.parseInt(locaStriArraSpli1[0]);

            int locaIntCompOpenMinu0=Integer.parseInt(locaStriArraSpli1[1]);

            String[] locaStriArraSpli2=locaStriArraSpli0[1].split(":");

            int locaIntCompClosHour0=Integer.parseInt(locaStriArraSpli2[0]);

            int locaIntCompClosMinu0=Integer.parseInt(locaStriArraSpli2[1]);

            if ((locaIntCompOpenHour0<0)||(locaIntCompOpenHour0>23)||(locaIntCompOpenMinu0<0)||(locaIntCompOpenMinu0>59)) {

                System.out.println("'False End Case' : The given 'Open' data is not correct.");

                System.out.println("The given 'Company Open Hours' value checker method.");

                System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth2PrivStatBool' finished.");

                return false;}

            if ((locaIntCompClosHour0<0)||(locaIntCompClosHour0>23)||(locaIntCompClosMinu0<0)||(locaIntCompClosMinu0>59)) {

                System.out.println("'False End Case' : The given 'Close' data is not correct.");

                System.out.println("The given 'Company Open Hours' value checker method.");

                System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth2PrivStatBool' finished.");

                return false;}

            if (locaIntCompClosHour0<locaIntCompOpenHour0) {

                System.out.println("'False End Case' : The given 'Open Hour' value cannot be smaller than the 'Close Hour' value.");

                System.out.println("The given 'Company Open Hours' value checker method.");

                System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth2PrivStatBool' finished.");

                return false;}

            if ((locaIntCompClosHour0==locaIntCompOpenHour0)&&(locaIntCompClosMinu0<=locaIntCompOpenMinu0)) {

                System.out.println("'False End Case' : The given 'Open Hour' value and the given 'Close Hour' value equality with the given 'Open Minute' value cannot be smaller than the given 'Close Minute'.");

                System.out.println("The given 'Company Open Hours' value checker method.");

                System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth2PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Company Open Hours' value checker method.");

            System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth2PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarracbutt154.meth2PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Company Open Hours' value checker method.");

            System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth2PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Company' data adder to the calling 'Parameter' method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth3PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarracbutt154.meth3PrivStatBool' started.\nParameters :");

            System.out.println("The given 'New Company Name' value in the beginning of the method : '"+globProtStatJTexFielPosi111.getText()+"'.");

            System.out.println("The given 'New Company Address' value in the beginning of the method : '"+globProtStatJTexFielPosi121.getText()+"'.");

            System.out.println("The given 'New Company Open Hours' value in the beginning of the method : '"+globProtStatJTexFielPosi113.getText()+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarracbutt154.meth3PrivStatBool started.");

            globProtStatArraListStriModuWindCallPara0.add(globProtStatJTexFielPosi111.getText());

            globProtStatArraListStriModuWindCallPara0.add(globProtStatJTexFielPosi121.getText());

            globProtStatArraListStriModuWindCallPara0.add(globProtStatJTexFielPosi113.getText());

            System.out.println("'True End Case'.");

            System.out.println("The given 'Company' data adder to the calling 'Parameter' method.");

            System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth3PrivStatBool' finished");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarracbutt154.meth3PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Company' data adder to the calling 'Parameter' method.");

            System.out.println("The 'filejavamoduwindprocwindarracbutt154.meth3PrivStatBool' finished");

            return false;}}}
