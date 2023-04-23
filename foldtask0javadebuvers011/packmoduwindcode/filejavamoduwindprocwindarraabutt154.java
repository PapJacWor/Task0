package packmoduwindcode;

import java.io.File;

import java.util.Scanner;

import packmoduloggcode.filejavamoduloggproclogg;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement a Button 154' process related methods.

    This class is part of the 'Window' module. 


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamoduwindprocwindarraabutt154 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

/*
Description:


    The 'Module Window Process Window Arrangement a Button 154' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarraabutt154.meth0PublStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarraabutt154.meth0PublStatBool started.");

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(0,"MWPWAaB154 0/4");

            boolean locaBoolStat0=false;

            locaBoolStat0=filejavamoduwindprocwindarraabutt154.meth1PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(25,"MWPWAaB154 1/4");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Profile File' is unreadable or unwritable.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Profile File' is unreadable or unwritable.");

                System.out.println("\n'False End Case' : The given 'Profile File' is unreadable or unwritable.");

                System.out.println("The 'Module Window Process Window Arrangement a Button 154' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamoduwindprocwindarraabutt154.meth2PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(50,"MWPWAaB154 2/4");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Profile File' has not enough lines for all the 'Profile(s)' listed in the file.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Profile File' has not enough lines for all the 'Profile(s)' listed in the file.");

                System.out.println("\n'False End Case' : The given 'Profile File' has not enough lines for all the profiles.");

                System.out.println("The 'Module Window Process Window Arrangement a Button 154' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamoduwindprocwindarraabutt154.meth3PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(75,"MWPWAaB154 3/4");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Selected Profile Number' : '"+Integer.toString(globProtStatJComStriPosi163.getSelectedIndex())+"'\ncannot be loaded.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Selected Profile Number' : '"+Integer.toString(globProtStatJComStriPosi163.getSelectedIndex())+"' cannot be loaded.");

                System.out.println("\n'False End Case' : The given 'Selected Profile Number' : '"+Integer.toString(globProtStatJComStriPosi163.getSelectedIndex())+"' cannot be loaded.");

                System.out.println("The 'Module Window Process Window Arrangement a Button 154' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt154.meth0PublStatBool' finished.");

                return false;}

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(100,"MWPWAaB154 4/4");

            System.out.println("\n'True End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement a Button 154' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarraabutt154.meth0PublStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarraabutt154.meth0PublStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement a Button 154' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarraabutt154.meth0PublStatBool' finished.");

            return false;}}

/*
Description:


    The given 'Profile File' status checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth1PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarraabutt154.meth1PrivStatBool' started.\n Parameter :");

            System.out.println("The given 'Profile File' value in the beginning of the method : 'fileconftask0prof.conf'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarraabutt154.meth1PrivStatBool started.");

            File locaFileStat0=new File("fileconftask0prof.conf");

            if ((locaFileStat0.exists()==false)||(locaFileStat0.isFile()==false)||(locaFileStat0.canRead()==false)||(locaFileStat0.canWrite()==false)) {

                System.out.println("'False End Case' : The given 'Profile File' does not exist or it is not a file or it cannot be read or it cannot be written.");

                System.out.println("The given 'Profile File' status checker method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt154.meth1PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Profile File' status checker method.");

            System.out.println("The 'filejavamoduwindprocwindarraabutt154.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarraabutt154.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Profile File' status checker method.");

            System.out.println("The 'filejavamoduwindprocwindarraabutt154.meth1PrivStatBool' finished.");

            return false;}}

/*
Description:


    The given 'Profile File' minimum line counter method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth2PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarraabutt154.meth2PrivStatBool' started.\nParameter :");

            System.out.println("The given 'Profile File' value in the beginning of the method : 'fileconftask0prof.conf'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarraabutt154.meth2PrivStatBool started.");

            File locaFileStat0=new File("fileconftask0prof.conf");

            Scanner locaScanFile0=new Scanner(locaFileStat0);

            int locaIntFileLineCoun0=0;

            int locaIntFileProfCoun0=0;

            while (locaScanFile0.hasNextLine()) {

                String locaStriReadRow0=locaScanFile0.nextLine();

                String[] locaStriArraRowSpli0=locaStriReadRow0.split(":");

                if (locaStriArraRowSpli0[0].equals("PROFILE")) {

                    locaIntFileProfCoun0++;}

                locaIntFileLineCoun0++;}

            locaScanFile0.close();

            System.out.println("The 'Profile File' line count value : '"+locaIntFileLineCoun0+"'.");

            System.out.println("The 'Profile File' 'Profile' count value : '"+locaIntFileProfCoun0+"'.");

            if ((locaIntFileLineCoun0/7)<locaIntFileProfCoun0) {

                System.out.println("'False End Case' : The 'Profile File Line Count' value is not in ratio with the 'Profile Number' value.");

                System.out.println("The given 'Profile File' minimum line counter method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt154.meth2PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Profile File' minimum line counter method.");

            System.out.println("The 'filejavamoduwindprocwindarraabutt154.meth2PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarraabutt154.meth2PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Profile File' minimum line counter method.");

            System.out.println("The 'filejavamoduwindprocwindarraabutt154.meth2PrivStatBool' finished.");

            return false;}}

/*
Description:


    The given 'Selected Profile Number' content loader to the 'Fields' method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth3PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarraabutt154.meth3PrivStatBool' started.\nParameter :");

            System.out.println("The given 'Profile File' value in the beginning of the method : 'fileconftask0prof.conf'.");

            System.out.println("The given 'Selected Profile Number' value in the beginning of the method : '"+Integer.toString(globProtStatJComStriPosi163.getSelectedIndex())+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarraabutt154.meth3PrivStatBool started.");

            File locaFileStat0=new File("fileconftask0prof.conf");

            Scanner locaScanFile0=new Scanner(locaFileStat0);

            while (locaScanFile0.hasNextLine()) {

                String locaStriReadRow0=locaScanFile0.nextLine();

                String[] locaStriArraRowSpli0=locaStriReadRow0.split(":");

                if ((locaStriArraRowSpli0[0].equals("PROFILE"))&&(locaStriArraRowSpli0[1].equals(Integer.toString(globProtStatJComStriPosi163.getSelectedIndex())))&&(locaScanFile0.hasNextLine())) {

                    System.out.println("The given 'Selected Profile Number' '"+Integer.toString(globProtStatJComStriPosi163.getSelectedIndex())+"' has a match in the 'Profile File' : 'fileconftask0prof.conf' file.");

                    globProtStatJTexFielPosi111.setText(locaScanFile0.nextLine());

                    globProtStatJTexFielPosi121.setText(locaScanFile0.nextLine());

                    globProtStatJTexFielPosi131.setText(locaScanFile0.nextLine());

                    globProtStatJTexFielPosi113.setText(locaScanFile0.nextLine());

                    globProtStatJComStriPosi123.setSelectedIndex(Integer.parseInt(locaScanFile0.nextLine()));

                    globProtStatJPasFielPosi133.setText(locaScanFile0.nextLine());

                    break;}}

            locaScanFile0.close();

            System.out.println("'True End Case'.");

            System.out.println("The given 'Selected Profile Number' content loader to the 'Fields' method.");

            System.out.println("The 'filejavamoduwindprocwindarraabutt154.meth3PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarraabutt154.meth3PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Selected Profile Number' content loader to the 'Fields' method.");

            System.out.println("The 'filejavamoduwindprocwindarraabutt154.meth3PrivStatBool' finished.");

            return false;}}}
