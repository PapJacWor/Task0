package packmoduwindcode;

import packmodudatacode.filejavamodudataprocwindarracdefghijkbutt144;

import packmoduloggcode.filejavamoduloggproclogg;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement cdefghijk Button 144 Manager' process related methods.

    This class is part of the 'Window' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamoduwindprocwindarracdefghijkbutt144mana extends filejavamoduwindclaswindarraabcdefghijklmnbase {

/*
Description :


    The 'Module Window Process Window Arrangement cdefghijk Button 144 Manager' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarracdefghijkbutt144mana.meth0PublStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarracdefghijkbutt144mana.meth0PublStatBool started.");

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(0,"MWPWAcdefghijkB144M 0/2");

            if (globProtStatArraListStriModuWindRetuPara0.isEmpty()==false) {

                globProtStatArraListStriModuWindRetuPara0.clear();}

            boolean locaBoolStat0=false;

            if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) { 

                locaBoolStat0=filejavamoduwindprocwindarracdefghijkbutt144mana.meth1PrivStatBool();

                filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(50,"MWPWAcdefghijkB144M 1/2");

                if (locaBoolStat0==false) {

                    filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Call Parameter' length did not match.");

                    filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Call Parameter' length did not match.");

                    System.out.println("\n'False End Case' : The given 'Call Parameter' length did not match.");

                    System.out.println("The 'Module Window Process Window Arrangement cdefghijk Button 144 Manager' process manager method.");

                    System.out.println("The 'filejavamoduwindprocwindarracdefghijkbutt144mana.meth0PublStatBool' finished.");

                    return false;}}

            else {

                filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(50,"MWPWAcdefghijkB144M 1/2");

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Call Parameter' is empty.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Call Parameter' is empty.");

                System.out.println("\n'False End Case' : The given 'Call Parameter' is empty.");

                System.out.println("The 'Module Window Process Window Arrangement cdefghijk Button 144 Manager' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarracdefghijkbutt144mana.meth0PublStatBool' finished.");

                return false;}

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(100,"MWPWAcdefghijkB144M 2/2");

            System.out.println("\n'True End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement cdefghijk Button 144 Manager' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarracdefghijkbutt144mana.meth0PublStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarracdefghijkbutt144mana.meth0PublStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement cdefghijk Button 144 Manager' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarracdefghijkbutt144mana.meth0PublStatBool' finished.");

            return false;}}

/*
Description:


    The table 'List Of Service(s)' filter and 'Call Parameter' adder method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth1PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarracdefghijkbutt144mana.meth1PrivStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarracdefghijkbutt144mana.meth1PrivStatBool started.");

            boolean locaBoolStat1=false;

            if ((globProtStatJTexFielPosi111.getText().length()>0)&&(globProtStatJTexFielPosi111.getText().length()<120)&&(globProtStatJTexFielPosi121.getText().length()>0)&&(globProtStatJTexFielPosi121.getText().length()<120)) {

                System.out.println("Parameters :");

                System.out.println("The given 'Selected Company Name' value in the beginning of the method : '"+globProtStatJTexFielPosi111.getText()+"'.");

                System.out.println("The given 'Selected Company Address' value in the beginning of the method : '"+globProtStatJTexFielPosi121.getText()+"'.");

                globProtStatArraListStriModuWindCallPara0.add(globProtStatJTexFielPosi111.getText());

                globProtStatArraListStriModuWindCallPara0.add(globProtStatJTexFielPosi121.getText());

                globProtStatArraListStriModuWindRetuPara0.addAll(filejavamodudataprocwindarracdefghijkbutt144.meth0PublStatArraListStri(globProtStatArraListStriModuWindCallPara0));

                globProtStatArraListStriModuWindCallPara0.remove(globProtStatArraListStriModuWindCallPara0.size()-1);

                globProtStatArraListStriModuWindCallPara0.remove(globProtStatArraListStriModuWindCallPara0.size()-1);

                locaBoolStat1=filejavamoduwindprocwindarracdefghijkbutt144.meth0PublStatBool();}

            else if ((globProtStatJTexFielPosi111.getText().length()>0)&&(globProtStatJTexFielPosi111.getText().length()<120)) {

                System.out.println("Parameter :");

                System.out.println("The given 'Selected Company Name' value in the beginning of the method : '"+globProtStatJTexFielPosi111.getText()+"'.");

                globProtStatArraListStriModuWindCallPara0.add(globProtStatJTexFielPosi111.getText());

                globProtStatArraListStriModuWindRetuPara0.addAll(filejavamodudataprocwindarracdefghijkbutt144.meth0PublStatArraListStri(globProtStatArraListStriModuWindCallPara0));

                globProtStatArraListStriModuWindCallPara0.remove(globProtStatArraListStriModuWindCallPara0.size()-1);

                locaBoolStat1=filejavamoduwindprocwindarracdefghijkbutt144.meth0PublStatBool();}

            else {

                System.out.println("The given 'Company Name' and the given 'Company Address' values are empty or are in incorrect format.");

                globProtStatArraListStriModuWindRetuPara0.addAll(filejavamodudataprocwindarracdefghijkbutt144.meth0PublStatArraListStri(globProtStatArraListStriModuWindCallPara0));

                locaBoolStat1=filejavamoduwindprocwindarracdefghijkbutt144.meth0PublStatBool();}

            if (locaBoolStat1==false) {

                System.out.println("\n'False End Case' : The returned value is false from the 'filejavamoduwindprocwindarracdefghijkbutt144.meth0PublStatBool' method.");

                System.out.println("The table 'List Of Service(s)' filter and 'Call Parameter' adder method.");

                System.out.println("The 'filejavamoduwindprocwindarracdefghijkbutt144mana.meth1PrivStatBool' finished.");

                return false;}

            System.out.println("\n'True End Case'.");

            System.out.println("The table 'List Of Service(s)' filter and 'Call Parameter' adder method.");

            System.out.println("The 'filejavamoduwindprocwindarracdefghijkbutt144mana.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarracdefghijkbutt144mana.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The table 'List Of Service(s)' filter and 'Call Parameter' adder method.");

            System.out.println("The 'filejavamoduwindprocwindarracdefghijkbutt144mana.meth1PrivStatBool' finished.");

            return false;}}}
