package packmoduloggcode;

import java.io.BufferedWriter;

import java.io.File;

import java.io.FileWriter;

import java.time.format.DateTimeFormatter;

import java.time.LocalDateTime;

/*
Description :


    This is the class for the 'Module Logging Process Logging' process related methods.

    This class is part of the 'Logging' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamoduloggproclogg {

/*
Description :


    The 'Module Logging Process Logging' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool(String locaStriPara0,String locaStriPara1) throws Exception {

        try {

            //System.out.println("\nThe 'filejavamoduloggproclogg.meth0PublStatBool' started.");

            if((locaStriPara0==null)||(locaStriPara1==null)) {

                System.err.println("ERROR   - At least one of the given 'Parameters' is null.");

                System.out.println("'False End Case' : At least one of the given 'Parameters' is null.");

                System.out.println("The 'Module Logging Process Logging' process manager method.");

                System.out.println("The 'filejavamoduloggproclogg.meth0PublStatBool' finished.");

                System.exit(0);

                return false;}

            if ((locaStriPara0.isEmpty()==true)||(locaStriPara1.isEmpty()==true)) {

                System.err.println("ERROR   - At least one of the given 'Parameters' is empty.");

                System.out.println("'False End Case' : At least one of the given 'Parameters' is empty.");

                System.out.println("The 'Module Logging Process Logging' process manager method.");

                System.out.println("The 'filejavamoduloggproclogg.meth0PublStatBool' finished.");

                System.exit(0);

                return false;}

            if ((locaStriPara0.length()<4)||(locaStriPara1.length()<1)) {

                System.err.println("ERROR   - At least one of the given 'Parameters' length is less than the minimum.");

                System.out.println("'False End Case' : At least one of the given 'Parameters' length is less than the minimum.");

                System.out.println("The 'Module Logging Process Logging' process manager method.");

                System.out.println("The 'filejavamoduloggproclogg.meth0PublStatBool' finished.");

                return false;}

            if (locaStriPara0.length()>7) {

                System.err.println("ERROR   - The given 'Log Level' : '"+locaStriPara0+"' length is more than the maximum.");

                System.out.println("'False End Case' : The given 'Log Level' : '"+locaStriPara0+"' length is more than the maximum.");

                System.out.println("The 'Module Logging Process Logging' process manager method.");

                System.out.println("The 'filejavamoduloggproclogg.meth0PublStatBool' finished.");

                System.exit(0);

                return false;}

            //System.out.println("Parameters :");

            //System.out.println("The 'Log Level' value in the method beginning : '"+locaStriPara0+"'.");

            //System.out.println("The 'Log Content' value in the method beginning : '"+locaStriPara1+"'.");

            boolean locaBoolStat0=false;

            locaBoolStat0=filejavamoduloggproclogg.meth1PrivStatBool(locaStriPara0,locaStriPara1);

            if (locaBoolStat0==false) {

                System.err.println("ERROR   - At least one of the 'Parameters' contains only 'Whitespace(s)'.");

                System.out.println("\n'False End Case' : At least one of the 'Parameters' contains only 'Whitespace(s)'.");

                System.out.println("The 'Module Logging Process Logging' process manager method.");

                System.out.println("The 'filejavamoduloggproclogg.meth0PublStatBool' finished.");

                System.exit(0);

                return false;}

            locaBoolStat0=filejavamoduloggproclogg.meth2PrivStatBool();

            locaBoolStat0=filejavamoduloggproclogg.meth3PrivStatBool(locaStriPara0,locaStriPara1);

            if (locaBoolStat0==false) {

                System.err.println("ERROR   - The 'Log Level' is undefined.");

                System.out.println("\n'False End Case' : The 'Log Level' is in undefined.");

                System.out.println("The 'Module Logging Process Logging' process manager method.");

                System.out.println("The 'filejavamoduloggproclogg.meth0PublStatBool' finished.");

                System.exit(0);

                return false;}

            //System.out.println("\n'True End Case'.");

            //System.out.println("The 'Module Logging Process Logging' process manager method.");

            //System.out.println("The 'filejavamoduloggproclogg.meth0PublStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            System.err.println("ERROR   - EXCEPTION in filejavamoduloggproclogg.meth0PublStatBool.");

            System.err.println("ERROR   - "+locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The 'Module Logging Process Logging' process manager method.");

            System.out.println("The 'filejavamoduloggproclogg.meth0PublStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Parameters' content 'Whitespace(s)' checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth1PrivStatBool(String locaStriPara0,String locaStriPara1) throws Exception {

        try {

            //System.out.println("\nThe 'filejavamoduloggproclogg.meth1PrivStatBool' started.\nParameters :");

            //System.out.println("The 'Log Level' value in the method beginning : '"+locaStriPara0+"'.");

            //System.out.println("The 'Log Content' value in the method beginning : '"+locaStriPara1+"'.");

            if ((locaStriPara0.isBlank()==true)||(locaStriPara0.replaceAll("\\s","").length()<4)||(locaStriPara1.isBlank()==true)||(locaStriPara1.replaceAll("\\s","").length()<1)) {

                System.err.println("ERROR   - At least one of the 'Parameters' contains only 'Whitespace(s)'.");

                System.out.println("'False End Case' : At least one of the 'Parameters' contains only 'Whitespace'.");

                System.out.println("The given 'Parameters' content 'Whitespace(s)' checker method.");

                System.out.println("The 'filejavamoduloggproclogg.meth1PrivStatBool' finished.");

                return false;}

            //System.out.println("'True End Case'.");

            //System.out.println("The given 'Parameters' content 'Whitespace(s)' checker method.");

            //System.out.println("The 'filejavamoduloggproclogg.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            System.err.println("ERROR   - EXCEPTION in filejavamoduloggproclogg.meth1PrivStatBool.");

            System.err.println("ERROR   - "+locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Parameters' content 'Whitespace(s)' checker method.");

            System.out.println("The 'filejavamoduloggproclogg.meth1PrivStatBool' finished.");

            return false;}}

/*
Description :


    The 'Log File(s)' status checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth2PrivStatBool() throws Exception {

        try {

            //System.out.println("\nThe 'filejavamoduloggproclogg.meth2PrivStatBool' started.\nParameters :");

            //System.out.println("The 'Log File' value in the method beginning : 'filelogtask0logs.log'.");

            //System.out.println("The 'Error File' value in the method beginning : 'filelogtask0erro.log'.");

            //System.out.println("The 'Info File' value in the method beginning : 'filelogtask0info.log'.");

            File locaFileStat0=new File("filelogtask0logs.log");

            if ((locaFileStat0.exists()==false)||(locaFileStat0.canRead()==false)||(locaFileStat0.canWrite()==false)||(locaFileStat0.isFile()==false)) {

                System.err.println("INFO    - The 'filelogtask0logs.log' file status is inappropriate.");

                if (locaFileStat0.createNewFile()) {

                    System.err.println("INFO    - The 'filelogtask0logs.log' file got (re)created.");}

                else {

                    System.err.println("ERROR   - The 'filelogtask0logs.log' file cannot be (re)created.");}

                if ((locaFileStat0.exists()==false)||(locaFileStat0.canRead()==false)||(locaFileStat0.canWrite()==false)||(locaFileStat0.isFile()==false)) {

                    System.err.println("INFO    - The 'filelogtask0logs.log' file status is still appropriate.");

                    System.err.println("INFO    - The 'filelogtask0logs.log' file cannot be created, therefore the 'Task 0' program closes.");

                    System.out.println("'False End Case' : The 'filelogtask0logs.log' file cannot be created, therefore the 'Task 0' program closes.");

                    System.out.println("The 'Log File(s)' status checker method.");

                    System.out.println("The 'filejavamoduloggproclogg.meth2PrivStatBool' finished.");

                    System.exit(0);

                    return false;}}

            File locaFileStat1=new File("filelogtask0erro.log");

            if ((locaFileStat1.exists()==false)||(locaFileStat1.canRead()==false)||(locaFileStat1.canWrite()==false)||(locaFileStat1.isFile()==false)) {

                System.err.println("INFO    - The 'filelogtask0erro.log' file status is inappropriate.");

                if (locaFileStat1.createNewFile()) {

                    System.err.println("INFO    - The 'filelogtask0erro.log' file got (re)created.");}

                else {

                    System.err.println("WARNING - The 'filelogtask0erro.log' file cannot be (re)created.");}}

            File locaFileStat2=new File("filelogtask0info.log");

            if ((locaFileStat2.exists()==false)||(locaFileStat2.canRead()==false)||(locaFileStat2.canWrite()==false)||(locaFileStat2.isFile()==false)) {

                System.err.println("INFO    - The 'filelogtask0info.log' file status is inappropriate.");

                if (locaFileStat2.createNewFile()) {

                    System.err.println("INFO    - The 'filelogtask0info.log' file got (re)created");}

                else {

                    System.err.println("WARNING - The 'filelogtask0info.log' file cannot be (re)created.");}}

            //System.out.println("'True End Case.'");

            //System.out.println("The 'Log File(s)' status checker method.");

            //System.out.println("The 'filejavamoduloggproclogg.meth2PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            System.err.println("ERROR   - EXCEPTION in filejavamoduloggproclogg.meth2PrivStatBool.");

            System.err.println("ERROR   - "+locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case.'");

            System.out.println("The 'Log File(s)' status checker method.");

            System.out.println("The 'filejavamoduloggproclogg.meth2PrivStatBool' finished.");

            return false;}}

/*
Description :


    The 'Log File(s)' writer method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth3PrivStatBool(String locaStriPara0,String locaStriPara1) throws Exception {

        try {

            //System.out.println("\nThe 'filejavamoduloggproclogg.meth3PrivStatBool' started.\nParameters :");

            //System.out.println("The 'Log Level' value in the method beginning : '"+locaStriPara0+"'.");

            //System.out.println("The 'Log Content' value in the method beginning : '"+locaStriPara1+"'.");

            FileWriter locaFileWritStat0=new FileWriter("filelogtask0logs.log",true);

            FileWriter locaFileWritStat1=new FileWriter("filelogtask0erro.log",true);

            FileWriter locaFileWritStat2=new FileWriter("filelogtask0info.log",true);

            BufferedWriter locaBuffWritStat0=new BufferedWriter(locaFileWritStat0);

            BufferedWriter locaBuffWritStat1=new BufferedWriter(locaFileWritStat1);

            BufferedWriter locaBuffWritStat2=new BufferedWriter(locaFileWritStat2);

            DateTimeFormatter locaDateTimeFormStat0=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            String locaStriRowCont0="";

            if (locaStriPara0.equals("ERROR")) {

                locaStriRowCont0=locaStriPara0+"   - "+locaDateTimeFormStat0.format(LocalDateTime.now())+" - "+ locaStriPara1;

                locaBuffWritStat0.append(locaStriRowCont0);

                locaBuffWritStat1.append(locaStriRowCont0);

                locaBuffWritStat0.newLine();

                locaBuffWritStat1.newLine();

                locaBuffWritStat0.append("INDENT  - "+locaDateTimeFormStat0.format(LocalDateTime.now()));

                locaBuffWritStat1.append("INDENT  - "+locaDateTimeFormStat0.format(LocalDateTime.now()));

                locaBuffWritStat0.newLine();

                locaBuffWritStat1.newLine();

                locaBuffWritStat0.close();

                locaBuffWritStat1.close();

                locaBuffWritStat2.close();

                locaFileWritStat0.close();

                locaFileWritStat1.close();

                locaFileWritStat2.close();

                //System.out.println("'True End Case'.");

                //System.out.println("The 'Log File(s)' writer method.");

                //System.out.println("The 'filejavamoduloggproclogg.meth3PrivStatBool' finished.");

                return true;}

            else if (locaStriPara0.equals("INDENT")) {

                locaStriRowCont0=locaStriPara0+"  - "+locaDateTimeFormStat0.format(LocalDateTime.now());

                locaBuffWritStat0.append(locaStriRowCont0);

                locaBuffWritStat1.append(locaStriRowCont0);

                locaBuffWritStat2.append(locaStriRowCont0);

                locaBuffWritStat0.newLine();

                locaBuffWritStat1.newLine();

                locaBuffWritStat2.newLine();

                locaBuffWritStat0.close();

                locaBuffWritStat1.close();

                locaBuffWritStat2.close();

                locaFileWritStat0.close();

                locaFileWritStat1.close();

                locaFileWritStat2.close();

                //System.out.println("'True End Case'.");

                //System.out.println("The 'Log File(s)' writer method.");

                //System.out.println("The 'filejavamoduloggproclogg.meth3PrivStatBool' finished.");

                return true;}

            else if (locaStriPara0.equals("INFO")) {

                locaStriRowCont0=locaStriPara0+"    - "+locaDateTimeFormStat0.format(LocalDateTime.now())+" - "+locaStriPara1;

                locaBuffWritStat0.append(locaStriRowCont0);

                locaBuffWritStat2.append(locaStriRowCont0);

                locaBuffWritStat0.newLine();

                locaBuffWritStat2.newLine();

                locaBuffWritStat0.close();

                locaBuffWritStat1.close();

                locaBuffWritStat2.close();

                locaFileWritStat0.close();

                locaFileWritStat1.close();

                locaFileWritStat2.close();

                //System.out.println("'True End Case'.");

                //System.out.println("The 'Log File(s)' writer method.");

                //System.out.println("The 'filejavamoduloggproclogg.meth3PrivStatBool' finished.");

                return true;}

            else if (locaStriPara0.equals("WARNING")) {

                locaStriRowCont0=locaStriPara0+" - "+locaDateTimeFormStat0.format(LocalDateTime.now())+" - "+locaStriPara1;

                locaBuffWritStat0.append(locaStriRowCont0);

                locaBuffWritStat0.newLine();

                locaBuffWritStat0.close();

                locaBuffWritStat1.close();

                locaBuffWritStat2.close();

                locaFileWritStat0.close();

                locaFileWritStat1.close();

                locaFileWritStat2.close();

                //System.out.println("'True End Case'.");

                //System.out.println("The 'Log File(s)' writer method.");

                //System.out.println("The 'filejavamoduloggproclogg.meth3PrivStatBool' finished.");

                return true;}

            locaBuffWritStat0.newLine();

            locaBuffWritStat0.close();

            locaBuffWritStat1.close();

            locaBuffWritStat2.close();

            locaFileWritStat0.close();

            locaFileWritStat1.close();

            locaFileWritStat2.close();

            System.err.println("No match for the given 'Log Level' : '"+locaStriPara0+"' was found.");

            //System.out.println("'False End Case' : No match for the given 'Log Level' : '"+locaStriPara0+"' was found.");

            //System.out.println("The 'Log File(s)' writer method.");

            //System.out.println("The 'filejavamoduloggproclogg.meth3PrivStatBool' finished.");

            return false;}

        catch (Exception locaExceCatcExce0) {

            System.err.println("ERROR   - EXCEPTION in filejavamoduloggproclogg.meth3PrivStatBool.");

            System.err.println("ERROR   - "+locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case.'");

            System.out.println("The 'Log File(s)' writer method.");

            System.out.println("The 'filejavamoduloggproclogg.meth3PrivStatBool' finished.");

            return false;}}}
