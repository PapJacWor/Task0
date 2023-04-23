package packmoduwindcode;

import packmodudatacode.filejavamodudataprocwindarrabbutt124;

import packmoduloggcode.filejavamoduloggproclogg;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement b Button 124 Manager' process related methods.

    This class is part of the 'Window' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamoduwindprocwindarrabbutt124mana extends filejavamoduwindclaswindarraabcdefghijklmnbase {

/*
Description :


    The 'Module Window Process Window Arrangement b Button 124 Manager' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarrabbutt124mana.meth0PublStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarrabbutt124mana.meth0PublStatBool started.");

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(0,"MWPWAbB124M 0/2");

            if (globProtStatArraListStriModuWindRetuPara0.isEmpty()==false) {

                globProtStatArraListStriModuWindRetuPara0.clear();}

            boolean locaBoolStat0=false;

            if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

                locaBoolStat0=filejavamoduwindprocwindarrabbutt124mana.meth1PrivStatBool();

                filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(50,"MWPWAbB124M 1/2");

                if (locaBoolStat0==false) {

                    filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'New SQL Database Name' : '"+globProtStatJTexFielPosi131.getText()+"'\ndata cannot be displayed on the 'Table Area'.");

                    filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'New SQL Database Name' : '"+globProtStatJTexFielPosi131.getText()+"' data cannot be displayed on the 'Table Area'.");

                    System.out.println("\n'False End Case' : The given 'New SQL Database Name' : '"+globProtStatJTexFielPosi131.getText()+"' data cannot be displayed on the 'Table Area'.");

                    System.out.println("The 'Module Window Process Window Arrangement b Button 124 Manager' process manager method.");

                    System.out.println("The 'filejavamoduwindprocwindarrabbutt124mana.meth0PublStatBool' finished.");

                    return false;}}

            else {

                filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(50,"MWPWAbB124M 1/2");

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Call Parameter' is empty.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Call Parameter' is empty.");

                System.out.println("\n'False End Case' : The given 'Call Parameter' is empty.");

                System.out.println("The 'Module Window Process Window Arrangement b Button 124 Manager' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarrabbutt124mana.meth0PublStatBool' finished.");

                return false;}

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(100,"MWPWAbB124M 2/2");

            System.out.println("\n'True End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement b Button 124 Manager' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarrabbutt124mana.meth0PublStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarrabbutt124mana.meth0PublStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement b Button 124 Manager' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarrabbutt124mana.meth0PublStatBool' finished.");

            return false;}}

/*
Description:


    The given 'New SQL Database Name' displayer on the 'Table Area' method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth1PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarrabbutt124mana.meth1PrivStatBool' started.\nParameter :");

            System.out.println("The given 'New SQL Database Name' value in the beginning of the method : '"+globProtStatJTexFielPosi131.getText()+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarrabbutt124mana.meth1PrivStatBool started.");

            boolean locaBoolStat1=false;

            if ((globProtStatJTexFielPosi131.getText()!=null)&&(globProtStatJTexFielPosi131.getText().length()>0)&&(globProtStatJTexFielPosi131.getText().length()<61)) {

                char[] locaCharArraChec0=globProtStatJTexFielPosi131.getText().toCharArray();

                for(int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec0.length;locaIntForCyclCoun0++) {

                    if (Character.isWhitespace(locaCharArraChec0[locaIntForCyclCoun0])) {

                        locaBoolStat1=false;

                        break;}

                    else if (locaBoolStat1==false) {

                        locaBoolStat1=true;}}

                if (locaBoolStat1==true) {

                    System.out.println("The given 'New SQL Database Name' value is in correct format.");

                    globProtStatArraListStriModuWindCallPara0.add(globProtStatJTexFielPosi131.getText());

                    globProtStatArraListStriModuWindRetuPara0.addAll(filejavamodudataprocwindarrabbutt124.meth0PublStatArraListStri(globProtStatArraListStriModuWindCallPara0));

                    globProtStatArraListStriModuWindCallPara0.remove(globProtStatArraListStriModuWindCallPara0.size()-1);

                    locaBoolStat1=filejavamoduwindprocwindarrabbutt124.meth0PublStatBool();}}

            else {

                System.out.println("The given 'New SQL Database Name' value is empty.");

                globProtStatArraListStriModuWindRetuPara0.addAll(filejavamodudataprocwindarrabbutt124.meth0PublStatArraListStri(globProtStatArraListStriModuWindCallPara0));

                locaBoolStat1=filejavamoduwindprocwindarrabbutt124.meth0PublStatBool();}

            if (locaBoolStat1==false) {

                System.out.println("\n'False End Case' : The returned value is false from the 'filejavamoduwindprocwindarrabbutt124.meth0PublStatBool' method.");

                System.out.println("The given 'New SQL Database Name' displayer on the 'Table Area' method.");

                System.out.println("The 'filejavamoduwindprocwindarrabbutt124mana.meth1PrivStatBool' finished.");

                return false;}

            System.out.println("\n'True End Case'.");

            System.out.println("The given 'New SQL Database Name' displayer on the 'Table Area' method.");

            System.out.println("The 'filejavamoduwindprocwindarrabbutt124mana.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarrabbutt124mana.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The given 'New SQL Database Name' displayer on the 'Table Area' method.");

            System.out.println("The 'filejavamoduwindprocwindarrabbutt124mana.meth1PrivStatBool' finished.");

            return false;}}}
