package packmoduwindcode;

import packmoduloggcode.filejavamoduloggproclogg;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement cdefghijk Button 144' process related methods.

    This class is part of the 'Window' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamoduwindprocwindarracdefghijkbutt144 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

/*
Description :


    The 'Module Window Process Window Arrangement cdefghijk Button 144' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarracdefghijkbutt144.meth0PublStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarracdefghijkbutt144.meth0PublStatBool started.");

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(0,"MWPWAcdefghijkB144 0/2");

            boolean locaBoolStat0=false;

            locaBoolStat0=filejavamoduwindprocwindarracdefghijkbutt144.meth1PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(50,"MWPWAcdefghijkB144 1/2");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Return Parameter' data cannot be displayed on the 'Table Area'.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Return Parameter' data cannot be displayed on the 'Table Area'.");

                System.out.println("\n'False End Case' : The given 'Return Parameter' data cannot be displayed on the 'Table Area'.");

                System.out.println("The 'Module Window Process Window Arrangement cdefghijk Button 144' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarracdefghijkbutt144.meth0PublStatBool' finished.");

                return false;}

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(100,"MWPWAcdefghijkB144 2/2");

            System.out.println("\n'True End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement cdefghijk Button 144' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarracdefghijkbutt144.meth0PublStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarracdefghijkbutt144.meth0PublStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement cdefghijk Button 144' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarracdefghijkbutt144.meth0PublStatBool' finished.");

            return false;}}

/*
Description:


    The 'Table Area' updater and dispalyer method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth1PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarracdefghijkbutt144.meth1PrivStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarracdefghijkbutt144.meth1PrivStatBool started.");

            globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.setColumnCount(0);

            globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.getDataVector().removeAllElements();

            globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.fireTableDataChanged();

            if (globProtStatArraListStriModuWindRetuPara0.isEmpty()==false) {

                globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.addColumn("Service Identifier");

                globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.addColumn("Service Status");

                globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.addColumn("Company Name");

                globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.addColumn("Company Address");

                globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.addColumn("Service Name");

                globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.addColumn("Service Length");

                globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.addColumn("Service Description");

                int locaIntForCyclCoun0=0;

                while (locaIntForCyclCoun0<globProtStatArraListStriModuWindRetuPara0.size()-1) {

                    System.out.println("The 'Return Parameter' content :");

                    System.out.println(globProtStatArraListStriModuWindRetuPara0.get(locaIntForCyclCoun0));

                    System.out.println(globProtStatArraListStriModuWindRetuPara0.get(locaIntForCyclCoun0+1));

                    System.out.println(globProtStatArraListStriModuWindRetuPara0.get(locaIntForCyclCoun0+2));

                    System.out.println(globProtStatArraListStriModuWindRetuPara0.get(locaIntForCyclCoun0+3));

                    System.out.println(globProtStatArraListStriModuWindRetuPara0.get(locaIntForCyclCoun0+4));

                    System.out.println(globProtStatArraListStriModuWindRetuPara0.get(locaIntForCyclCoun0+5));

                    System.out.println(globProtStatArraListStriModuWindRetuPara0.get(locaIntForCyclCoun0+6));

                    String[] locaStriTablRowCont0={globProtStatArraListStriModuWindRetuPara0.get(locaIntForCyclCoun0),globProtStatArraListStriModuWindRetuPara0.get(locaIntForCyclCoun0+6),globProtStatArraListStriModuWindRetuPara0.get(locaIntForCyclCoun0+2),globProtStatArraListStriModuWindRetuPara0.get(locaIntForCyclCoun0+1),globProtStatArraListStriModuWindRetuPara0.get(locaIntForCyclCoun0+5),globProtStatArraListStriModuWindRetuPara0.get(locaIntForCyclCoun0+4),globProtStatArraListStriModuWindRetuPara0.get(locaIntForCyclCoun0+3)};

                    globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.addRow(locaStriTablRowCont0);

                    locaIntForCyclCoun0+=7;}}

            else {

                globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.addColumn("Result of the 'List Of Service(s)' output query");

                String[] locaStriTablRowCont0 = {"No match for the requested 'List Of Service(s)' query."};

                globProtStatDefaTablModePosi020Posi023ToPosi090Posi093.addRow(locaStriTablRowCont0);}

            System.out.println("'True End Case'.");

            System.out.println("The 'Table Area' updater and displayer method.");

            System.out.println("The 'filejavamoduwindprocwindarracdefghijkbutt144.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarracdefghijkbutt144.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The 'Table Area' updater and displayer method.");

            System.out.println("The 'filejavamoduwindprocwindarracdefghijkbutt144.meth1PrivStatBool' finished.");

            return false;}}}
