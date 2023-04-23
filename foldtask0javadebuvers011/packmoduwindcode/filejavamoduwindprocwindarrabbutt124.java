package packmoduwindcode;

import packmoduloggcode.filejavamoduloggproclogg;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement b Button 124' process related methods.

    This class is part of the 'Window' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamoduwindprocwindarrabbutt124 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

/*
Description :


    The 'Module Window Process Window Arrangement b Button 124' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarrabbutt124.meth0PublStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarrabbutt124.meth0PublStatBool started.");

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(0,"MWPWAbB124 0/2");

            boolean locaBoolStat0=false;

            locaBoolStat0=filejavamoduwindprocwindarrabbutt124.meth1PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(50,"MWPWAbB124 1/2");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Return Parameter' data cannot be displayed on the 'Table Area'.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Return Parameter' data cannot be displayed on the 'Table Area'.");

                System.out.println("\n'False End Case' : The given 'Return Parameter' data cannot be displayed on the 'Table Area'.");

                System.out.println("The 'Module Window Process Window Arrangement b Button 124' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarrabbutt124.meth0PublStatBool' finished.");

                return false;}

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(100,"MWPWAbB124 2/2");

            System.out.println("\n'True End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement b Button 124' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarrabbutt124.meth0PublStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarrabbutt124.meth0PublStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement b Button 124' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarrabbutt124.meth0PublStatBool' finished.");

            return false;}}

/*
Description:


    The 'Table Area' updater and displayer method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth1PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarrabbutt124.meth1PrivStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarrabbutt124.meth1PrivStatBool started.");

            globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.setColumnCount(0);

            globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.getDataVector().removeAllElements();

            globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.fireTableDataChanged();

            if ((globProtStatArraListStriModuWindRetuPara0.isEmpty()==false)&&(globProtStatArraListStriModuWindRetuPara0.size()>2)) {

                globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.addColumn("Host Name");

                globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.addColumn("Port Number");

                globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.addColumn("SQL Database Name");

                globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.addColumn("Last Refresh");

                int locaIntForCyclCoun0=0;

                while (locaIntForCyclCoun0<globProtStatArraListStriModuWindRetuPara0.size()-1) {

                    String[] locaStriTablRowCont0={globProtStatArraListStriModuWindRetuPara0.get(locaIntForCyclCoun0),globProtStatArraListStriModuWindRetuPara0.get(locaIntForCyclCoun0+1),globProtStatArraListStriModuWindRetuPara0.get(locaIntForCyclCoun0+2),globProtStatArraListStriModuWindRetuPara0.get(locaIntForCyclCoun0+3)};

                    globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.addRow(locaStriTablRowCont0);

                    locaIntForCyclCoun0+=4;}}

            else {

                globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.addColumn("Result of the 'SQL Database(s) Name(s)' output query");

                String[] locaStriTablRowCont0 = {"No match for the requested 'List Of SQL Database(s) Name(s)' query."};

                globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.addRow(locaStriTablRowCont0);}

            System.out.println("'True End Case'.");

            System.out.println("The 'Table Area' updater and displayer method.");

            System.out.println("The 'filejavamoduwindprocwindarrabbutt124.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarrabbutt124.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The 'Table Area' updater and displayer method.");

            System.out.println("The 'filejavamoduwindprocwindarrabbutt124.meth1PrivStatBool' finished.");

            return false;}}}
