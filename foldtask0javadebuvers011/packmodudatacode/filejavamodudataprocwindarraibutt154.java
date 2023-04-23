package packmodudatacode;

import java.sql.DriverManager;

import java.util.ArrayList;

import packmoduloggcode.filejavamoduloggproclogg;

import packmoduwindcode.filejavamoduwindprocwindarraabcdefghijklmnmess;

import packmoduwindcode.filejavamoduwindprocwindarraabcdefghijklmnprogbar004;

/*
Description :


    This is the class for the 'Module Database Process Window Arrangement i Button 154' process related methods.

    This class is part of the 'Database' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodudataprocwindarraibutt154 extends filejavamodudataclaswindarraabcdefghijklmnbase {

/*
Description :


    The 'Module Database Process Window Arrangement i Button 154' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool(ArrayList<String> locaArraListStriPara0) throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarraibutt154.meth0PublStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraibutt154.meth0PublStatBool started.");

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(0,"MDPWAiB154 0/13");

            if ((locaArraListStriPara0==null)||(locaArraListStriPara0.isEmpty()==true)||(locaArraListStriPara0.size()!=14)) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Parameter' is empty or its size is incorrect.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' is empty or its size is not correct.");

                System.out.println("'False End Case' : The given 'Parameter' is empty or its size is incorrect.");

                System.out.println("The 'Module Database Process Window Arrangement i Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth0PublStatBool' finished.");

                return false;}

            if (globProtStatArraListStriModuDataRecePara0.isEmpty()==false) {

                globProtStatArraListStriModuDataRecePara0.clear();}

            globProtStatArraListStriModuDataRecePara0.addAll(locaArraListStriPara0);

            System.out.println("Parameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'SQL User Password Hasher' type value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"'.");

            System.out.println("The given 'SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            System.out.println("The given 'Selected Company Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

            System.out.println("The given 'Selected Company Address' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

            System.out.println("The given 'Selected Service Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

            System.out.println("The given 'New Appointment Date' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"'.");

            System.out.println("The given 'New Appointment Hour' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'.");

            System.out.println("The given 'New Appointment Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(11)+"'.");

            System.out.println("The given 'New Appointment Telephone' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(12)+"'.");

            System.out.println("The given 'New Appointment E-mail' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(13)+"'.");

            boolean locaBoolStat0=false;

            locaBoolStat0=filejavamodudataprocwindarraibutt154.meth1PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(7,"MDPWAiB154 1/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one value that length is not correct.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one value that length is not correct.");

                System.out.println("\n'False End Case' : The given 'Parameter' contains at least one value that length is not correct.");

                System.out.println("The 'Module Database Process Window Arrangement i Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarraibutt154.meth2PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(15,"MDPWAiB154 2/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one 'Whitespace' character.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one 'Whitespace' character.");

                System.out.println("\n'False End Case' : The given 'Parameter' contains at least one 'Whitespace' character.");

                System.out.println("The 'Module Database Process Window Arrangement i Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarraibutt154.meth3PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(23,"MDPWAiB154 3/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'\ncontains at least one character that is not a digit type character.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"' contains at least one character that is not a digit type character.");

                System.out.println("\n'False End Case' : The given 'Port Number' contains at least one character that is not a digit type character.");

                System.out.println("The 'Module Database Process Window Arrangement i Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarraibutt154.meth4PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(30,"MDPWAiB154 4/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'New Appointment Date' field value is not valid.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'New Appointment Date' field value is not valid.");

                System.out.println("\n'False End Case' : The given 'New Appointment Date' field value is not valid.");

                System.out.println("The 'Module Database Process Window Arrangement i Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarraibutt154.meth5PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(38,"MDPWAiB154 5/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'New Appointment Hour' field value is not valid because it is not given in the correct format.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'New Appointment Hour' field value is not valid because it is not given in the correct format.");

                System.out.println("\n'False End Case' : The given 'New Appointment Hour' field value is not valid because it is not given in the correct format.");

                System.out.println("The 'Module Database Process Window Arrangement i Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarraibutt154.meth6PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(46,"MDPWAiB154 6/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'New Appointment Telephone' value is not valid.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'New Appointment Telephone' value is not valid.");

                System.out.println("\n'False End Case' : The given 'New Appointment Telephone' value is not valid.");

                System.out.println("The 'Module Database Process Window Arrangement i Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarraibutt154.meth7PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(53,"MDPWAiB154 7/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'New Appointment E-mail' value is not valid because it does not contain the '@' or the '.' character(s).");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'New Appointment E-mail' value is not valid because it does not contain the '@' or the '.' character(s).");

                System.out.println("\n'False End Case' : The given 'New Appointment E-mail' value is not valid because it does not contain the '@' or the '.' character(s).");

                System.out.println("The 'Module Database Process Window Arrangement i Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarraibutt154.meth8PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(61,"MDPWAiB154 8/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'SQL Server' connection with the given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'\ncannot be established.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'SQL Server' connection with the given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"' cannot be established.");

                System.out.println("\n'False End Case' : The given 'SQL Server' connection with the given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"' cannot be established.");

                System.out.println("The 'Module Database Process Window Arrangement i Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarraibutt154.meth9PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(69,"MDPWAiB154 9/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'\ncannot be used.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' cannot be used.");

                System.out.println("\n'False End Case' : The given 'SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' cannot be used.");

                System.out.println("The 'Module Database Process Window Arrangement i Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarraibutt154.meth10PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(76,"MDPWAiB154 10/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with\nthe given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with\nthe given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' with\nthe given 'New Book Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' with\nthe given 'New Book Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' with\nthe given 'New Book Name' : '"+globProtStatArraListStriModuDataRecePara0.get(11)+"' with\nthe given 'New Book E-mail' : '"+globProtStatArraListStriModuDataRecePara0.get(12)+"' with\nthe given 'New Book Telephone' : '"+globProtStatArraListStriModuDataRecePara0.get(13)+"'\ncollides with the 'Company Open Hours' or with an another 'Appointment' for that 'Date' and 'Hour'.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' with the given 'New Book Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' with the given 'New Book Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' with the given 'New Book Name' : '"+globProtStatArraListStriModuDataRecePara0.get(11)+"' with the given 'New Book E-mail' : '"+globProtStatArraListStriModuDataRecePara0.get(12)+"' with the given 'New Book Telephone' : '"+globProtStatArraListStriModuDataRecePara0.get(13)+"' collides with the 'Company Open Hours' or with an another 'Appointment' for that 'Date' and 'Hour'.");

                System.out.println("\n'False End Case' : The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' with the given 'New Book Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' with the given 'New Book Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' with the given 'New Book Name' : '"+globProtStatArraListStriModuDataRecePara0.get(11)+"' with the given 'New Book E-mail' : '"+globProtStatArraListStriModuDataRecePara0.get(12)+"' with the given 'New Book Telephone' : '"+globProtStatArraListStriModuDataRecePara0.get(13)+"' collides with the 'Company Open Hours' or with an another 'Appointment' for that 'Date' and 'Hour'.");

                System.out.println("The 'Module Database Process Window Arrangement i Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarraibutt154.meth11PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(84,"MDPWAiB154 11/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with\nthe given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with\nthe given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'\ndoes not exists in 'Active Status' in the table 'tablServ'.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' does not exists in 'Active Status' in the table 'tablServ'.");

                System.out.println("\n'False End Case' : The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' does not exists in 'Active Status' in the table 'tablServ'.");

                System.out.println("The 'Module Database Process Window Arrangement i Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarraibutt154.meth12PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(92,"MDPWAiB154 12/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with\nthe given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with\nthe given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' with\nthe given 'New Book Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' with\nthe given 'New Book Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' with\nthe given 'New Book Name' : '"+globProtStatArraListStriModuDataRecePara0.get(11)+"' with\nthe given 'New Book E-mail' : '"+globProtStatArraListStriModuDataRecePara0.get(12)+"' with\nthe given 'New Book Telephone' : '"+globProtStatArraListStriModuDataRecePara0.get(13)+"'\ncannot be created.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' with the given 'New Book Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' with the given 'New Book Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' with the given 'New Book Name' : '"+globProtStatArraListStriModuDataRecePara0.get(11)+"' with the given 'New Book E-mail' : '"+globProtStatArraListStriModuDataRecePara0.get(12)+"' with the given 'New Book Telephone' : '"+globProtStatArraListStriModuDataRecePara0.get(13)+"' cannot be created.");

                System.out.println("\n'False End Case' : The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' with the given 'New Book Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' with the given 'New Book Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' with the given 'New Book Name' : '"+globProtStatArraListStriModuDataRecePara0.get(11)+"' with the given 'New Book E-mail' : '"+globProtStatArraListStriModuDataRecePara0.get(12)+"' with the given 'New Book Telephone' : '"+globProtStatArraListStriModuDataRecePara0.get(13)+"' cannot be created.");

                System.out.println("The 'Module Database Process Window Arrangement i Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth0PublStatBool' finished.");

                return false;}

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(100,"MDPWAiB154 13/13");

            System.out.println("\n'True End Case'.");

            System.out.println("The 'Module Database Process Window Arrangement i Button 154' process manager method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth0PublStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraibutt154.meth0PublStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The 'Module Database Process Window Arrangement i Button 154' process manager method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth0PublStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Parameter' content length checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth1PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarraibutt154.meth1PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'SQL User Password Hasher' type value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"'.");

            System.out.println("The given 'SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            System.out.println("The given 'Selected Company Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

            System.out.println("The given 'Selected Company Address' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

            System.out.println("The given 'Selected Service Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

            System.out.println("The given 'New Appointment Date' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"'.");

            System.out.println("The given 'New Appointment Hour' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'.");

            System.out.println("The given 'New Appointment Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(11)+"'.");

            System.out.println("The given 'New Appointment Telephone' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(12)+"'.");

            System.out.println("The given 'New Appointment E-mail' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(13)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraibutt154.meth1PrivStatBool started.");

            if ((globProtStatArraListStriModuDataRecePara0.get(0)==null)||(globProtStatArraListStriModuDataRecePara0.get(1)==null)||(globProtStatArraListStriModuDataRecePara0.get(2)==null)||(globProtStatArraListStriModuDataRecePara0.get(3)==null)||(globProtStatArraListStriModuDataRecePara0.get(4)==null)||(globProtStatArraListStriModuDataRecePara0.get(5)==null)||(globProtStatArraListStriModuDataRecePara0.get(6)==null)||(globProtStatArraListStriModuDataRecePara0.get(7)==null)||(globProtStatArraListStriModuDataRecePara0.get(8)==null)||(globProtStatArraListStriModuDataRecePara0.get(9)==null)||(globProtStatArraListStriModuDataRecePara0.get(10)==null)||(globProtStatArraListStriModuDataRecePara0.get(11)==null)||(globProtStatArraListStriModuDataRecePara0.get(12)==null)||(globProtStatArraListStriModuDataRecePara0.get(13)==null)) {

                System.out.println("'False End Case' : At least one of the given 'Parameter' content is null.");

                System.out.println("The given 'Parameter' content length checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatArraListStriModuDataRecePara0.get(0).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(1).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(2).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(3).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(4).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(5).length()<16)||(globProtStatArraListStriModuDataRecePara0.get(6).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(7).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(8).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(9).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(10).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(11).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(12).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(13).length()<1)) {

                System.out.println("'False End Case' : At least one of the given 'Parameter' content has less length than the minimum.");

                System.out.println("The given 'Parameter' content length checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatArraListStriModuDataRecePara0.get(0).length()>120)||(globProtStatArraListStriModuDataRecePara0.get(1).length()>5)||(globProtStatArraListStriModuDataRecePara0.get(2).length()>60)||(globProtStatArraListStriModuDataRecePara0.get(3).length()>30)||(globProtStatArraListStriModuDataRecePara0.get(4).length()>1)||(globProtStatArraListStriModuDataRecePara0.get(5).length()>30)||(globProtStatArraListStriModuDataRecePara0.get(6).length()>120)||(globProtStatArraListStriModuDataRecePara0.get(7).length()>120)||(globProtStatArraListStriModuDataRecePara0.get(8).length()>120)||(globProtStatArraListStriModuDataRecePara0.get(9).length()!=10)||(globProtStatArraListStriModuDataRecePara0.get(10).length()!=5)||(globProtStatArraListStriModuDataRecePara0.get(11).length()>120)||(globProtStatArraListStriModuDataRecePara0.get(12).length()>15)||(globProtStatArraListStriModuDataRecePara0.get(13).length()>120)) {

                System.out.println("'False End Case' : At least one of the given 'Parameter' content has more length than the maximum.");

                System.out.println("The given 'Parameter' content length checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth1PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Parameter' content length checker method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraibutt154.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Parameter' content length checker method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth1PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Parameter' content 'Whitespace' checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth2PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarraibutt154.meth2PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'SQL User Password Hasher' type value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"'.");

            System.out.println("The given 'SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            System.out.println("The given 'New Appointment Date' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"'.");

            System.out.println("The given 'New Appointment Hour' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'.");

            System.out.println("The given 'New Appointment Telephone' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(12)+"'.");

            System.out.println("The given 'New Appointment E-mail' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(13)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraibutt154.meth2PrivStatBool started.");

            boolean locaBoolStat1=false;

            char[] locaCharArraChec0=globProtStatArraListStriModuDataRecePara0.get(0).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec0.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec0[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec1=globProtStatArraListStriModuDataRecePara0.get(1).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec1.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec1[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec2=globProtStatArraListStriModuDataRecePara0.get(2).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec2.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec2[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec3=globProtStatArraListStriModuDataRecePara0.get(3).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec3.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec3[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'SQL Username' : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec4=globProtStatArraListStriModuDataRecePara0.get(4).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec4.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec4[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'SQL User Password Hasher' : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec5=globProtStatArraListStriModuDataRecePara0.get(5).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec5.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec5[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'SQL User Password' (Hashed) : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec6=globProtStatArraListStriModuDataRecePara0.get(9).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec6.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec6[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'New Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec7=globProtStatArraListStriModuDataRecePara0.get(10).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec7.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec7[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given  'New Appointment Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec8=globProtStatArraListStriModuDataRecePara0.get(12).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec8.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec8[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'New Appointment Telephone' : '"+globProtStatArraListStriModuDataRecePara0.get(12)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec9=globProtStatArraListStriModuDataRecePara0.get(13).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec9.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec9[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'New Appointment E-mail' : '"+globProtStatArraListStriModuDataRecePara0.get(13)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth2PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth2PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraibutt154.meth2PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth2PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Port Number' field value content checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth3PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarraibutt154.meth3PrivStatBool' started.\nParameter :");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraibutt154.meth3PrivStatBool started.");

            boolean locaBoolStat1=false;

            char[] locaCharArraChec0=globProtStatArraListStriModuDataRecePara0.get(1).toCharArray();

            for(int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec0.length;locaIntForCyclCoun0++) {

                if (Character.isDigit(locaCharArraChec0[locaIntForCyclCoun0])==false) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"' value contains at least one character that is not a digit type.");

                System.out.println("The given 'Port Number' field value content checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth3PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Port Number' field value content checker method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth3PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraibutt154.meth3PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Port Number' field value content checker method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth3PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'New Appointment Date' field value validity checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth4PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarraibutt154.meth4PrivStatBool' started.\nParameter :");

            System.out.println("The given 'New Appointment Date' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraibutt154.meth4PrivStatBool started.");

            boolean locaBoolStat1=false;

            String locaStriNewAppoDate0=globProtStatArraListStriModuDataRecePara0.get(9);

            if (locaStriNewAppoDate0.contains("-")==false) {

                System.out.println("'False End Case' : The given 'New Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' value does not contain the '-' character.");

                System.out.println("The given 'New Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth4PrivStatBool' finished.");

                return false;}

            char[] locaCharArraDate=globProtStatArraListStriModuDataRecePara0.get(9).toCharArray();

            for (int locaIntForCyclCoun=0;locaIntForCyclCoun<locaCharArraDate.length;locaIntForCyclCoun++) {

                if ((Character.isDigit(locaCharArraDate[locaIntForCyclCoun])==false)&&locaCharArraDate[locaIntForCyclCoun]!='-') {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'New Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' value contains at least one character that is not a digit type character neither the '-' character.");

                System.out.println("The given 'New Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth4PrivStatBool' finished.");

                return false;}

            String[] locaStriArraSpli0=locaStriNewAppoDate0.split("-");

            int locaIntYear0=Integer.parseInt(locaStriArraSpli0[0]);

            if ((locaIntYear0<2023)||(locaIntYear0>2100)) {

                System.out.println("'False End Case' : The given 'New Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' year value is less than 2023 or bigger than 2100.");

                System.out.println("The given 'New Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth4PrivStatBool' finished.");

                return false;}

            int locaIntMont0=Integer.parseInt(locaStriArraSpli0[1]);

            if ((locaIntMont0<1)||(locaIntMont0>12)) {

                System.out.println("'False End Case' : The given 'New Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' month value is less than 1 or bigger than 12.");

                System.out.println("The given 'New Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth4PrivStatBool' finished.");

                return false;}

            int locaIntDay0=Integer.parseInt(locaStriArraSpli0[2]);

            if ((locaIntMont0==2)&&((locaIntDay0<1)||(locaIntDay0>29))) {

                System.out.println("'False End Case' : The given 'New Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' month value is 2 and the day value is less than 1 or bigger than 29.");

                System.out.println("The given 'New Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth4PrivStatBool' finished.");

                return false;}

            if (((locaIntMont0==1)||(locaIntMont0==3)||(locaIntMont0==5)||(locaIntMont0==7)||(locaIntMont0==8)||(locaIntMont0==10)||(locaIntMont0==12))&&((locaIntDay0<1)||(locaIntDay0>31))) {

                System.out.println("'False End Case' : The given 'New Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' day value is less than 1 or bigger than 31.");

                System.out.println("The given 'New Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth4PrivStatBool' finished.");

                return false;}

            if (((locaIntMont0==4)||(locaIntMont0==6)||(locaIntMont0==9)||(locaIntMont0==11))&&((locaIntDay0<1)||(locaIntDay0>30))) {

                System.out.println("'False End Case' : The given 'New Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' day value is less than 1 or bigger than 30.");

                System.out.println("The given 'New Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth4PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'New Appointment Date' field value validity checker method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth4PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraibutt154.meth2PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'New Appointment Date' field value validity checker method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth4PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'New Appointment Hour' field value validity checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth5PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarraibutt154.meth5PrivStatBool' started.\nParameter :");

            System.out.println("The given 'New Appointment Hour' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraibutt154.meth5PrivStatBool started.");

            boolean locaBoolStat1=false;

            String locaStriNewAppoHour0=globProtStatArraListStriModuDataRecePara0.get(10);

            if (locaStriNewAppoHour0.contains(":")==false) {

                System.out.println("'False End Case' : The given 'New Appointment Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' value does not contain the ':' character.");

                System.out.println("The given 'New Appointment Hour' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth5PrivStatBool' finished.");

                return false;}

            char[] locaCharArraDate=globProtStatArraListStriModuDataRecePara0.get(10).toCharArray();

            for (int locaIntForCyclCoun=0;locaIntForCyclCoun<locaCharArraDate.length;locaIntForCyclCoun++) {

                if ((Character.isDigit(locaCharArraDate[locaIntForCyclCoun])==false)&&locaCharArraDate[locaIntForCyclCoun]!=':') {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'New Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' value contains at least one character that is not a digit type character neither the ':' character.");

                System.out.println("The given 'New Appointment Hour' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth5PrivStatBool' finished.");

                return false;}

            String[] locaStriArraSpli0=locaStriNewAppoHour0.split(":");

            int locaIntStartHour0=Integer.parseInt(locaStriArraSpli0[0]);

            int locaIntStartMinu0=Integer.parseInt(locaStriArraSpli0[1]);

            if ((locaIntStartHour0<0)||(locaIntStartHour0>23)) {

                System.out.println("'False End Case' : The given 'New Appointment Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' starting hour value is less than 0 or bigger than 23.");

                System.out.println("The given 'New Appointment Hour' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth5PrivStatBool' finished.");

                return false;}

            if ((locaIntStartMinu0<0)||(locaIntStartMinu0>59)) {

                System.out.println("'False End Case' : The given 'New Appointment Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' starting minute value is less than 0 or bigger than 59.");

                System.out.println("The given 'New Appointment Hour' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth5PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'New Appointment Hour' field value validity checker method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth5PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraibutt154.meth5PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'New Appointment Hour' field value validity checker method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth5PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'New Appointment Telephone' field value validity checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth6PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarraibutt154.meth6PrivStatBool' started.\nParameter :");

            System.out.println("The given 'New Appointment Telephone' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(12)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraibutt154.meth6PrivStatBool started.");

            char[] locaCharArraNewAppoTele0=globProtStatArraListStriModuDataRecePara0.get(12).toCharArray();

            for (int locaForCyclCoun0=0;locaForCyclCoun0<locaCharArraNewAppoTele0.length;locaForCyclCoun0++) {

                if ((Character.isDigit(locaCharArraNewAppoTele0[locaForCyclCoun0])==false)&&(locaCharArraNewAppoTele0[locaForCyclCoun0]!='+')) {

                    System.out.println("'False End Case' : The given 'New Appointment Telephone' : '"+globProtStatArraListStriModuDataRecePara0.get(12)+"' field value contains at least one character that is not a digit type or the '+' character.");

                    System.out.println("The given 'New Appointment Telephone' field value validity checker method.");

                    System.out.println("The 'filejavamodudataprocwindarraibutt154.meth6PrivStatBool' finished.");

                    return false;}}

            System.out.println("'True End Case'.");

            System.out.println("The given 'New Appointment Telephone' field value validity checker method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth6PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraibutt154.meth6PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'New Appointment Telephone' field value validity checker method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth6PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'New Appointment E-mail' field value validity checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth7PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarraibutt154.meth7PrivStatBool' started.\nParameter :");

            System.out.println("The given 'New Appointment E-mail' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(13)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraibutt154.meth7PrivStatBool started.");

            String locaStriNewAppoEmai0=globProtStatArraListStriModuDataRecePara0.get(13);

            if (locaStriNewAppoEmai0.contains("@")==false) {

                System.out.println("'False End Case' : The given 'New Appointment E-mail' : '"+globProtStatArraListStriModuDataRecePara0.get(13)+"' field value does not contain the '@' character.");

                System.out.println("The given 'New Appointment E-mail' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth7PrivStatBool' finished.");

                return false;}

            if (locaStriNewAppoEmai0.contains(".")==false) {

                System.out.println("'False End Case' : The given 'New Appointment E-mail' : '"+globProtStatArraListStriModuDataRecePara0.get(13)+"' field value does not contain the '.' character.");

                System.out.println("The given 'New Appointment E-mail' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth7PrivStatBool' finished.");

                return false;}

            char[] locaCharArraNewAppoEmai0=globProtStatArraListStriModuDataRecePara0.get(13).toCharArray();

            for (int locaForCyclCoun0=0;locaForCyclCoun0<locaCharArraNewAppoEmai0.length;locaForCyclCoun0++) {

                if ((Character.isWhitespace(locaCharArraNewAppoEmai0[locaForCyclCoun0]))) {

                    System.out.println("'False End Case' : The given 'New Appointment E-mail' : '"+globProtStatArraListStriModuDataRecePara0.get(13)+"' field value contains at least one 'Whitespace' character.");

                    System.out.println("The given 'New Appointment E-mail' field value validity checker method.");

                    System.out.println("The 'filejavamodudataprocwindarraibutt154.meth7PrivStatBool' finished.");

                    return false;}}

            System.out.println("'True End Case'.");

            System.out.println("The given 'New Appointment E-mail' field value validity checker method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth7PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraibutt154.meth7PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'New Appointment E-mail' field value validity checker method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth7PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Host Name' and the given 'SQL Server' connection establisher method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth8PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarraibutt154.meth8PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraibutt154.meth8PrivStatBool started.");

            String locaStriSQLHostAndPort0="jdbc:mysql://"+globProtStatArraListStriModuDataRecePara0.get(0)+":"+globProtStatArraListStriModuDataRecePara0.get(1);

            globProtStatConnCrea0=DriverManager.getConnection(locaStriSQLHostAndPort0,globProtStatArraListStriModuDataRecePara0.get(3),globProtStatArraListStriModuDataRecePara0.get(5));

            globProtStatStatSQLCommExec0=globProtStatConnCrea0.createStatement();

            Thread.sleep(20);

            System.out.println("'True End Case'.");

            System.out.println("The given 'Host Name' and the given 'SQL Server' connection establisher method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth8PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraibutt154.meth8PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Host Name' and the given 'SQL Server' connection establisher method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth8PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'SQL Database Name' selecter method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth9PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarraibutt154.meth9PrivStatBool' started.\nParameter :");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraibutt154.meth9PrivStatBool started.");

            globProtStatStriSQLComm0="USE "+globProtStatArraListStriModuDataRecePara0.get(2)+";";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("'True End Case'.");

            System.out.println("The given 'SQL Database Name' selecter method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth9PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraibutt154.meth9PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'SQL Database Name' selecter method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth9PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'New Appointment' data validity checker on the table 'tablAppo' method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth10PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarraibutt154.meth10PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Selected Company Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

            System.out.println("The given 'Selected Company Address' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

            System.out.println("The given 'Selected Service Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

            System.out.println("The given 'New Appointment Date' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"'.");

            System.out.println("The given 'New Appointment Hour' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'.");

            System.out.println("The given 'New Appointment Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(11)+"'.");

            System.out.println("The given 'New Appointment Telephone' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(12)+"'.");

            System.out.println("The given 'New Appointment E-mail' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(13)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraibutt154.meth10PrivStatBool started.");

            boolean locaBoolStat1=false;

            int locaIntCompClosValu0=0;

            int locaIntCompOpenValu0=0;

            globProtStatStriSQLComm0="SELECT varcCompName,varcCompAddr,varcCompStat,varcCompHour FROM tablComp;";

            globProtStatResuSetQuerResu0=globProtStatStatSQLCommExec0.executeQuery(globProtStatStriSQLComm0);

            Thread.sleep(20);

            if (!(globProtStatResuSetQuerResu0.isBeforeFirst())) {

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The table 'tablComp' data listing query is empty.");

                System.out.println("The given 'New Appointment' data validity checker on the table 'tablAppo' method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth10PrivStatBool' finished.");

                return false;}

            while (globProtStatResuSetQuerResu0.next()) {

                if ((globProtStatResuSetQuerResu0.getString(1).equals(globProtStatArraListStriModuDataRecePara0.get(6)))&&(globProtStatResuSetQuerResu0.getString(2).equals(globProtStatArraListStriModuDataRecePara0.get(7)))&&(globProtStatResuSetQuerResu0.getString(3).equals("Active"))) {

                    System.out.println("Data match found :");

                    System.out.println("The 'varcCompName' : '"+globProtStatResuSetQuerResu0.getString(1)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

                    System.out.println("The 'varcCompAddr' : '"+globProtStatResuSetQuerResu0.getString(2)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

                    System.out.println("The 'varcCompStat' : '"+globProtStatResuSetQuerResu0.getString(3)+"' match with 'Active'.");

                    String[] locaStriArraSpli0=globProtStatResuSetQuerResu0.getString(4).split("-");

                    String[] locaStriArraSpli1=locaStriArraSpli0[0].split(":");

                    String locaStriCompOpenHour0=locaStriArraSpli1[0];

                    String locaStriCompOpenMinu0=locaStriArraSpli1[1];

                    int locaIntCompOpenHour0=Integer.parseInt(locaStriCompOpenHour0);

                    int locaIntCompOpenMinu0=Integer.parseInt(locaStriCompOpenMinu0);

                    String[] locaStriArraSpli2=locaStriArraSpli0[1].split(":");

                    String locaStriCompClosHour0=locaStriArraSpli2[0];

                    String locaStriCompClosMinu0=locaStriArraSpli2[1];

                    int locaIntCompClosHour0=Integer.parseInt(locaStriCompClosHour0);

                    int locaIntCompClosMinu0=Integer.parseInt(locaStriCompClosMinu0);

                    locaIntCompOpenValu0=(locaIntCompOpenHour0*60)+locaIntCompOpenMinu0;

                    locaIntCompClosValu0=(locaIntCompClosHour0*60)+locaIntCompClosMinu0;

                    if (locaBoolStat1==false) {

                        locaBoolStat1=true;}

                    break;}}

            if (locaBoolStat1==false) {

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : No match found for the given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' value in 'Active Status'.");

                System.out.println("The given 'New Appointment' data validity checker on the table 'tablAppo' method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth10PrivStatBool' finished.");

                return false;}

            locaBoolStat1=false;

            String[] locaStriArraSpli3=globProtStatArraListStriModuDataRecePara0.get(10).split(":");

            String locaStriNewAppoHour0=locaStriArraSpli3[0];

            String locaStriNewAppoMinu0=locaStriArraSpli3[1];

            int locaIntNewAppoStarHour0=Integer.parseInt(locaStriNewAppoHour0);

            int locaIntNewAppoStarMinu0=Integer.parseInt(locaStriNewAppoMinu0);

            int locaIntNewAppoStarValu0=(locaIntNewAppoStarHour0*60)+locaIntNewAppoStarMinu0;

            System.out.println("The given 'Selected Company Open Value' : '"+locaIntCompOpenValu0+"'.");

            System.out.println("The given 'Selected Company Closing Value' : '"+locaIntCompClosValu0+"'.");

            System.out.println("The given 'New Appointment Start Value' : "+locaIntNewAppoStarValu0+"'.");

            if (locaIntCompOpenValu0>locaIntNewAppoStarValu0) {

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The given 'Selected Company Open Value' '"+locaIntCompOpenValu0+"'. is bigger than the given 'New Appointment Start Value' : "+locaIntNewAppoStarValu0+"'.");

                System.out.println("The given 'New Appointment' data validity checker on the table 'tablAppo' method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth10PrivStatBool' finished.");

                return false;}

            if (locaIntCompClosValu0<locaIntNewAppoStarValu0) {

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The given 'Selected Company Closing Value' '"+locaIntCompClosValu0+"'. is less than the given 'New Appointment Start Value' : "+locaIntNewAppoStarValu0+"'.");

                System.out.println("The given 'New Appointment' data validity checker on the table 'tablAppo' method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth10PrivStatBool' finished.");

                return false;}

            int locaIntNewAppoEndValu0=0;

            globProtStatStriSQLComm0="SELECT varcCompName,varcCompAddr,varcServName,varcServStat,varcServLeng FROM tablServ;";

            globProtStatResuSetQuerResu0=globProtStatStatSQLCommExec0.executeQuery(globProtStatStriSQLComm0);

            Thread.sleep(20);

            if (!(globProtStatResuSetQuerResu0.isBeforeFirst())) {

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The table 'tablServ' data listing query is empty.");

                System.out.println("The given 'New Appointment' data validity checker on the table 'tablAppo' method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth10PrivStatBool' finished.");

                return false;}

            while (globProtStatResuSetQuerResu0.next()) {

                if ((globProtStatResuSetQuerResu0.getString(1).equals(globProtStatArraListStriModuDataRecePara0.get(6)))&&(globProtStatResuSetQuerResu0.getString(2).equals(globProtStatArraListStriModuDataRecePara0.get(7)))&&(globProtStatResuSetQuerResu0.getString(3).equals(globProtStatArraListStriModuDataRecePara0.get(8)))&&(globProtStatResuSetQuerResu0.getString(4).equals("Active"))) {

                    System.out.println("Data match found :");

                    System.out.println("The 'varcCompName' : '"+globProtStatResuSetQuerResu0.getString(1)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

                    System.out.println("The 'varcCompAddr' : '"+globProtStatResuSetQuerResu0.getString(2)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

                    System.out.println("The 'varcServName' : '"+globProtStatResuSetQuerResu0.getString(3)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

                    System.out.println("The 'varcServStat' : '"+globProtStatResuSetQuerResu0.getString(4)+"' match with 'Active'.");

                    locaIntNewAppoEndValu0=locaIntNewAppoStarValu0+Integer.parseInt(globProtStatResuSetQuerResu0.getString(5))+5;

                    locaBoolStat1=true;

                    break;}

                else if (locaBoolStat1==true) {

                    locaBoolStat1=false;}}

            if (locaBoolStat1==false) {

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : No match found for the given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' value in 'Active Status'.");

                System.out.println("The given 'New Appointment' data validity checker on the table 'tablAppo' method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth10PrivStatBool' finished.");

                return false;}

            locaBoolStat1=false;

            System.out.println("The given 'New Appointment End Value' : "+locaIntNewAppoEndValu0);

            if (locaIntNewAppoEndValu0>locaIntCompClosValu0) {

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The given 'New Appointment End Value' '"+locaIntNewAppoEndValu0+"' is more than the given 'Selected Company Closing Value' : "+locaIntCompClosValu0+"'.");

                System.out.println("The given 'New Appointment' data validity checker on the table 'tablAppo' method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth10PrivStatBool' finished.");

                return false;}

            globProtStatStriSQLComm0="SELECT varcCompName,varcCompAddr,varcAppoDate,varcAppoHour,varcServLeng FROM tablAppo;";

            globProtStatResuSetQuerResu0=globProtStatStatSQLCommExec0.executeQuery(globProtStatStriSQLComm0);

            Thread.sleep(20);

            if (!(globProtStatResuSetQuerResu0.isBeforeFirst())) {

                System.out.println("'True End Case'.");

                System.out.println("The given 'New Appointment' data validity checker on the table 'tablAppo' method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth10PrivStatBool' finished.");

                return true;}

            while (globProtStatResuSetQuerResu0.next()) {

                if ((globProtStatResuSetQuerResu0.getString(1).equals(globProtStatArraListStriModuDataRecePara0.get(6)))&&(globProtStatResuSetQuerResu0.getString(2).equals(globProtStatArraListStriModuDataRecePara0.get(7)))&&(globProtStatResuSetQuerResu0.getString(3).equals(globProtStatArraListStriModuDataRecePara0.get(9)))) {

                    System.out.println("Data match found :");

                    System.out.println("The 'varcCompName' : '"+globProtStatResuSetQuerResu0.getString(1)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

                    System.out.println("The 'varcCompAddr' : '"+globProtStatResuSetQuerResu0.getString(2)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

                    System.out.println("The 'varcAppoDate' : '"+globProtStatResuSetQuerResu0.getString(3)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(9)+"'.");

                    String[] locaStriArraSpli4=globProtStatResuSetQuerResu0.getString(4).split(":");

                    String locaStriOtheAppoHour0=locaStriArraSpli4[0];

                    String locaStriOtheAppoMinu0=locaStriArraSpli4[1];

                    int locaIntOtheAppoHour0=Integer.parseInt(locaStriOtheAppoHour0);

                    int locaIntOtheAppoMinu0=Integer.parseInt(locaStriOtheAppoMinu0);

                    int locaIntOtheAppoLengMinu0=Integer.parseInt(globProtStatResuSetQuerResu0.getString(5));

                    int locaIntOtheAppoEndValu0=(locaIntOtheAppoHour0*60)+locaIntOtheAppoMinu0+locaIntOtheAppoLengMinu0+5;

                    int locaIntOtheAppoStartValu0=(locaIntOtheAppoHour0*60)+locaIntOtheAppoMinu0;

                    System.out.println("The given 'Selected Company Open Value' : '"+locaIntCompOpenValu0+"'.");

                    System.out.println("The given 'Selected Company Closing Value' : '"+locaIntCompClosValu0+"'.");

                    System.out.println("The given 'New Appointment Start Value' : "+locaIntNewAppoStarValu0+"'.");

                    System.out.println("The given 'New Appointment End Value' : "+locaIntNewAppoEndValu0);

                    System.out.println("The 'Other Appointment Start Value' For the Selected Company : '"+locaIntOtheAppoStartValu0+"'.");

                    System.out.println("The 'Other Appointment End Value' For the Selected Company : '"+locaIntOtheAppoEndValu0+"'.");

                    if (locaIntNewAppoStarValu0==locaIntOtheAppoStartValu0) {

                        locaBoolStat1=false;

                        System.out.println("The given 'New Appointment Start Value' is the same as the 'Other Appointment Start Value'.");

                        break;}

                    if ((locaIntNewAppoStarValu0>locaIntOtheAppoStartValu0)&&(locaIntNewAppoStarValu0<=locaIntOtheAppoEndValu0)) {

                        locaBoolStat1=false;

                        System.out.println("The given 'New Appointment' start after the 'Other Appointment' start but starts before the 'Other Appointment' finishes.");

                        break;}

                    if ((locaIntNewAppoStarValu0<locaIntOtheAppoStartValu0)&&(locaIntNewAppoEndValu0>=locaIntOtheAppoStartValu0)) {

                        locaBoolStat1=false;

                        System.out.println("The given 'New Appointment' start before the 'Other Appointment' but the 'New Appointment' is still going when the 'Other Appointment' starts.");

                        break;}

                    if (locaBoolStat1==false) {

                        locaBoolStat1=true;}}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                globProtStatResuSetQuerResu0.close();

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The given 'New Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' value is not valid.");

                System.out.println("The given 'New Appointment' data validity checker on the table 'tablAppo' method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth10PrivStatBool' finished.");

                return false;}

            globProtStatResuSetQuerResu0.close();

            System.out.println("'True End Case'.");

            System.out.println("The given 'New Appointment' data validity checker on the table 'tablAppo' method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth10PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraibutt154.meth10PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'New Appointment' data validity checker on the table 'tablAppo' method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth10PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Selected Service' data existence checker on the table 'tablServ' method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth11PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarraibutt154.meth11PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Selected Company Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

            System.out.println("The given 'Selected Company Address' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

            System.out.println("The given 'Selected Service Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraibutt154.meth11PrivStatBool started.");

            boolean locaBoolStat1=false;

            globProtStatStriSQLComm0="SELECT varcCompName,varcCompAddr,varcServName,varcServStat FROM tablServ;";

            globProtStatResuSetQuerResu0=globProtStatStatSQLCommExec0.executeQuery(globProtStatStriSQLComm0);

            Thread.sleep(20);

            if (!(globProtStatResuSetQuerResu0.isBeforeFirst())) {

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The table 'tablServ' data listing query is empty.");

                System.out.println("The given 'Selected Service' data existence checker on the table 'tablServ' method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth11PrivStatBool' finished.");

                return false;}

            while (globProtStatResuSetQuerResu0.next()) {

                if ((globProtStatResuSetQuerResu0.getString(1).equals(globProtStatArraListStriModuDataRecePara0.get(6)))&&(globProtStatResuSetQuerResu0.getString(2).equals(globProtStatArraListStriModuDataRecePara0.get(7)))&&(globProtStatResuSetQuerResu0.getString(3).equals(globProtStatArraListStriModuDataRecePara0.get(8)))&&(globProtStatResuSetQuerResu0.getString(4).equals("Active"))) {

                    locaBoolStat1=true;

                    System.out.println("Data match found :");

                    System.out.println("The 'varcCompName' : '"+globProtStatResuSetQuerResu0.getString(1)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

                    System.out.println("The 'varcCompAddr' : '"+globProtStatResuSetQuerResu0.getString(2)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

                    System.out.println("The 'varcServName' : '"+globProtStatResuSetQuerResu0.getString(3)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

                    System.out.println("The 'varcServStat' : '"+globProtStatResuSetQuerResu0.getString(4)+"' match with 'Active'.");

                    break;}

                else if (locaBoolStat1==true) {

                    locaBoolStat1=false;}}

            if (locaBoolStat1==false) {

                globProtStatResuSetQuerResu0.close();

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' with the given 'Selected Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' with the given 'Selected Appointment Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' does not exist in 'Active Status'.");

                System.out.println("The given 'Selected Service' data existence checker on the table 'tablServ' method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth11PrivStatBool' finished.");

                return false;}

            globProtStatResuSetQuerResu0.close();

            System.out.println("'True End Case'.");

            System.out.println("The given 'Selected Service' data existence checker on the table 'tablServ' method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth11PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraibutt154.meth11PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Selected Service' data existence checker on the table 'tablServ' method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth11PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'New Appointment' data inserter to the table 'tablAppo' method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth12PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarraibutt154.meth12PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Selected Company Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

            System.out.println("The given 'Selected Company Address' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

            System.out.println("The given 'Selected Service Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

            System.out.println("The given 'New Appointment Date' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"'.");

            System.out.println("The given 'New Appointment Hour' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'.");

            System.out.println("The given 'New Appointment Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(11)+"'.");

            System.out.println("The given 'New Appointment Telephone' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(12)+"'.");

            System.out.println("The given 'New Appointment E-mail' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(13)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraibutt154.meth12PrivStatBool started.");

            globProtStatStriSQLComm0="SELECT varcServLeng FROM tablServ WHERE varcCompName='"+globProtStatArraListStriModuDataRecePara0.get(6)+"' AND varcCompAddr='"+globProtStatArraListStriModuDataRecePara0.get(7)+"' AND varcServName='"+globProtStatArraListStriModuDataRecePara0.get(8)+"' AND varcServStat='Active';";

            globProtStatResuSetQuerResu0=globProtStatStatSQLCommExec0.executeQuery(globProtStatStriSQLComm0);

            Thread.sleep(20);

            if (!(globProtStatResuSetQuerResu0.isBeforeFirst())) {

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The table 'tablAppo' data listing query is empty.");

                System.out.println("The given 'New Appointment' data inserter to the table 'tablAppo' method.");

                System.out.println("The 'filejavamodudataprocwindarraibutt154.meth12PrivStatBool' finished.");

                return false;}

            String locaStriServLeng="";

            while (globProtStatResuSetQuerResu0.next()) {

                locaStriServLeng=globProtStatResuSetQuerResu0.getString(1);}

            globProtStatResuSetQuerResu0.close();

            globProtStatStriSQLComm0="INSERT INTO tablAppo (varcCompName,varcCompAddr,varcServName,varcAppoDate,varcAppoHour,varcAppoName,varcAppoTele,varcAppoEmai,varcAppoStat,varcServLeng) VALUES ('"+globProtStatArraListStriModuDataRecePara0.get(6)+"','"+globProtStatArraListStriModuDataRecePara0.get(7)+"','"+globProtStatArraListStriModuDataRecePara0.get(8)+"','"+globProtStatArraListStriModuDataRecePara0.get(9)+"','"+globProtStatArraListStriModuDataRecePara0.get(10)+"','"+globProtStatArraListStriModuDataRecePara0.get(11)+"','"+globProtStatArraListStriModuDataRecePara0.get(12)+"','"+globProtStatArraListStriModuDataRecePara0.get(13)+"','Active','"+locaStriServLeng+"');";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            String locaStriDateTime0="2023-01-27 01:02:03";

            globProtStatStriSQLComm0="SELECT NOW();";

            globProtStatResuSetQuerResu0=globProtStatStatSQLCommExec0.executeQuery(globProtStatStriSQLComm0);

            Thread.sleep(20);

            while (globProtStatResuSetQuerResu0.next()) {

                locaStriDateTime0=globProtStatResuSetQuerResu0.getString(1);}

            globProtStatResuSetQuerResu0.close();

            globProtStatStriSQLComm0="INSERT INTO tablAppoLogs (dateLastModi,varcPrevVers,varcCompName,varcCompAddr,varcServName,varcAppoDate,varcAppoHour,varcAppoName,varcAppoTele,varcAppoEmai,varcAppoStat,varcServLeng) VALUES ('"+locaStriDateTime0+"','Created','"+globProtStatArraListStriModuDataRecePara0.get(6)+"','"+globProtStatArraListStriModuDataRecePara0.get(7)+"','"+globProtStatArraListStriModuDataRecePara0.get(8)+"','"+globProtStatArraListStriModuDataRecePara0.get(9)+"','"+globProtStatArraListStriModuDataRecePara0.get(10)+"','"+globProtStatArraListStriModuDataRecePara0.get(11)+"','"+globProtStatArraListStriModuDataRecePara0.get(12)+"','"+globProtStatArraListStriModuDataRecePara0.get(13)+"','Active','"+locaStriServLeng+"');";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'True End Case'.");

            System.out.println("The given 'New Appointment' data inserter to the table 'tablAppo' method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth12PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraibutt154.meth12PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'New Appointment' data inserter to the table 'tablAppo' method.");

            System.out.println("The 'filejavamodudataprocwindarraibutt154.meth12PrivStatBool' finished.");

            return false;}}}
