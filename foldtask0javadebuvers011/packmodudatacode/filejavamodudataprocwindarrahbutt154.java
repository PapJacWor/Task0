package packmodudatacode;

import java.sql.DriverManager;

import java.util.ArrayList;

import packmoduloggcode.filejavamoduloggproclogg;

import packmoduwindcode.filejavamoduwindprocwindarraabcdefghijklmnmess;

import packmoduwindcode.filejavamoduwindprocwindarraabcdefghijklmnprogbar004;

/*
Description :


    This is the class for the 'Module Database Process Window Arrangement h Button 154' process related methods.

    This class is part of the 'Database' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodudataprocwindarrahbutt154 extends filejavamodudataclaswindarraabcdefghijklmnbase {

/*
Description :


    The 'Module Database Process Window Arrangement h Button 154' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool(ArrayList<String> locaArraListStriPara0) throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrahbutt154.meth0PublStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrahbutt154.meth0PublStatBool started.");

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(0,"MDPWAhB154 0/10");

            if ((locaArraListStriPara0==null)||(locaArraListStriPara0.isEmpty()==true)||(locaArraListStriPara0.size()!=11)) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Parameter' is empty or its size is incorrect.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' is empty or its size is not correct.");

                System.out.println("'False End Case' : The given 'Parameter' is empty or its size is incorrect.");

                System.out.println("The 'Module Database Process Window Arrangement h Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth0PublStatBool' finished.");

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

            System.out.println("The given 'Modified Service Description' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"'.");

            System.out.println("The given 'Modified Service Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'.");

            boolean locaBoolStat0=false;

            locaBoolStat0=filejavamodudataprocwindarrahbutt154.meth1PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(10,"MDPWAhB154 1/10");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one value that length is not correct.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one value that length is not correct.");

                System.out.println("'False End Case' : The given 'Parameter' contains at least one value that length is not correct.");

                System.out.println("The 'Module Database Process Window Arrangement h Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrahbutt154.meth2PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(20,"MDPWAhB154 2/10");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one 'Whitespace' character.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one 'Whitespace' character.");

                System.out.println("\n'False End Case' : The given 'Parameter' contains at least one 'Whitespace' character.");

                System.out.println("The 'Module Database Process Window Arrangement h Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrahbutt154.meth3PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(30,"MDPWAhB154 3/10");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'\ncontains at least one character that is not a digit type character.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"' contains at least one character that is not a digit type character.");

                System.out.println("\n'False End Case' : The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"' contains at least one character that is not a digit type character.");

                System.out.println("The 'Module Database Process Window Arrangement h Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrahbutt154.meth4PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(40,"MDPWAhB154 4/10");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'SQL Server' connection with the given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'\ncannot be established.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'SQL Server' connection with the given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"' cannot be established.");

                System.out.println("\n'False End Case' : The given 'SQL Server' connection with the given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"' cannot be established.");

                System.out.println("The 'Module Database Process Window Arrangement h Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrahbutt154.meth5PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(50,"MDPWAhB154 5/10");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'\ncannot be used.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' cannot be used.");

                System.out.println("\n'False End Case' : The given 'SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' cannot be used.");

                System.out.println("The 'Module Database Process Window Arrangement h Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrahbutt154.meth6PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(60,"MDPWAhB154 6/10");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with\nthe given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with\nthe given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'\ndoes not exist on the table 'tablServ'.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' does not exist on the table 'tablServ'.");

                System.out.println("\n'False End Case' : The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' does not exist on the table 'tablServ'.");

                System.out.println("The 'Module Database Process Window Arrangement h Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrahbutt154.meth7PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(70,"MDPWAhB154 7/10");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with\nthe given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with\nthe given 'Modified Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'\nalready exists on the table 'tablServ'.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Modified Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' already exists on the table 'tablServ'.");

                System.out.println("\n'False End Case' : The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Modified Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' already exists on the table 'tablServ'.");

                System.out.println("The 'Module Database Process Window Arrangement h Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrahbutt154.meth8PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(80,"MDPWAhB154 8/10");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with\nthe given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with\nthe given 'Modified Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'\ncannot be modified on the table 'tablServ'.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Modified Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' cannot be modified on the table 'tablServ'.");

                System.out.println("\n'False End Case' : The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Modified Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' cannot be modified on the table 'tablServ'.");

                System.out.println("The 'Module Database Process Window Arrangement h Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrahbutt154.meth9PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(90,"MDPWAhB154 9/10");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with\nthe given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with\nthe given 'Modified Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'\ncannot be modified on the table 'tablAppo'.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Modified Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' cannot be modified on the table 'tablAppo'.");

                System.out.println("\n'False End Case' : The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Modified Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' cannot be modified on the table 'tablAppo'.");

                System.out.println("The 'Module Database Process Window Arrangement h Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth0PublStatBool' finished.");

                return false;}

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(100,"MDPWAhB154 10/10");

            System.out.println("\n'True End Case'.");

            System.out.println("The 'Module Database Process Window Arrangement h Button 154' process manager method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth0PublStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrahbutt154.meth0PublStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The 'Module Database Process Window Arrangement h Button 154' process manager method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth0PublStatBool' finished.");

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

            System.out.println("\nThe 'filejavamodudataprocwindarrahbutt154.meth1PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'SQL User Password Hasher' type value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"'.");

            System.out.println("The given 'SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            System.out.println("The given 'Selected Company Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

            System.out.println("The given 'Selected Company Address' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

            System.out.println("The given 'Selected Service Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

            System.out.println("The given 'Modified Service Description' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"'.");

            System.out.println("The given 'Modified Service Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrahbutt154.meth1PrivStatBool started.");

            if ((globProtStatArraListStriModuDataRecePara0.get(0)==null)||(globProtStatArraListStriModuDataRecePara0.get(1)==null)||(globProtStatArraListStriModuDataRecePara0.get(2)==null)||(globProtStatArraListStriModuDataRecePara0.get(3)==null)||(globProtStatArraListStriModuDataRecePara0.get(4)==null)||(globProtStatArraListStriModuDataRecePara0.get(5)==null)||(globProtStatArraListStriModuDataRecePara0.get(6)==null)||(globProtStatArraListStriModuDataRecePara0.get(7)==null)||(globProtStatArraListStriModuDataRecePara0.get(8)==null)||(globProtStatArraListStriModuDataRecePara0.get(9)==null)||(globProtStatArraListStriModuDataRecePara0.get(10)==null)) {

                System.out.println("'False End Case' : At least one of the given 'Parameter' content is null.");

                System.out.println("The given 'Parameter' content length checker method.");

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatArraListStriModuDataRecePara0.get(0).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(1).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(2).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(3).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(4).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(5).length()<16)||(globProtStatArraListStriModuDataRecePara0.get(6).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(7).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(8).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(9).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(10).length()<1)) {

                System.out.println("'False End Case' : At least one of the given 'Parameter' content has less length than the minimum.");

                System.out.println("The given 'Parameter' content length checker method.");

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatArraListStriModuDataRecePara0.get(0).length()>120)||(globProtStatArraListStriModuDataRecePara0.get(1).length()>5)||(globProtStatArraListStriModuDataRecePara0.get(2).length()>60)||(globProtStatArraListStriModuDataRecePara0.get(3).length()>30)||(globProtStatArraListStriModuDataRecePara0.get(4).length()>1)||(globProtStatArraListStriModuDataRecePara0.get(5).length()>30)||(globProtStatArraListStriModuDataRecePara0.get(6).length()>120)||(globProtStatArraListStriModuDataRecePara0.get(7).length()>120)||(globProtStatArraListStriModuDataRecePara0.get(8).length()>120)||(globProtStatArraListStriModuDataRecePara0.get(9).length()>120)||(globProtStatArraListStriModuDataRecePara0.get(10).length()>120)) {

                System.out.println("'False End Case' : At least one of the given 'Parameter' content has more length than the maximum.");

                System.out.println("The given 'Parameter' content length checker method.");

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth1PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Parameter' content length checker method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrahbutt154.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Parameter' content length checker method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth1PrivStatBool' finished.");

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

            System.out.println("\nThe 'filejavamodudataprocwindarrahbutt154.meth2PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'SQL User Password Hasher' type value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"'.");

            System.out.println("The given 'SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrahbutt154.meth2PrivStatBool started.");

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

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth2PrivStatBool' finished.");

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

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth2PrivStatBool' finished.");

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

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth2PrivStatBool' finished.");

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

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth2PrivStatBool' finished.");

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

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth2PrivStatBool' finished.");

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

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth2PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth2PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrahbutt154.meth2PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth2PrivStatBool' finished.");

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

            System.out.println("\nThe 'filejavamodudataprocwindarrahbutt154.meth3PrivStatBool' started.\nParameter :");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrahbutt154.meth3PrivStatBool started.");

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

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth3PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Port Number' field value content checker method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth3PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrahbutt154.meth3PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Port Number' field value content checker method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth3PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Host Name' and the given 'SQL Server' connection establisher method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth4PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrahbutt154.meth4PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrahbutt154.meth4PrivStatBool started.");

            String locaStriSQLHostAndPort0="jdbc:mysql://"+globProtStatArraListStriModuDataRecePara0.get(0)+":"+globProtStatArraListStriModuDataRecePara0.get(1);

            globProtStatConnCrea0=DriverManager.getConnection(locaStriSQLHostAndPort0,globProtStatArraListStriModuDataRecePara0.get(3),globProtStatArraListStriModuDataRecePara0.get(5));

            globProtStatStatSQLCommExec0=globProtStatConnCrea0.createStatement();

            Thread.sleep(20);

            System.out.println("'True End Case'.");

            System.out.println("The given 'Host Name' and the given 'SQL Server' connection establisher method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth4PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrahbutt154.meth4PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Host Name' and the given 'SQL Server' connection establisher method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth4PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'SQL Database Name' selecter method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth5PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrahbutt154.meth5PrivStatBool' started.\nParameter :");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrahbutt154.meth5PrivStatBool started.");

            globProtStatStriSQLComm0="USE "+globProtStatArraListStriModuDataRecePara0.get(2)+";";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("'True End Case'.");

            System.out.println("The given 'SQL Database Name' selecter method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth5PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrahbutt154.meth5PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'SQL Database Name' selecter method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth5PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Selected Service' data existence checker on the table 'tablServ' method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth6PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrahbutt154.meth6PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Selected Company Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

            System.out.println("The given 'Selected Company Address' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

            System.out.println("The given 'Selected Service Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrahbutt154.meth6PrivStatBool started.");

            boolean locaBoolStat1=false;

            globProtStatStriSQLComm0="SELECT varcCompName,varcCompAddr,varcServName FROM tablServ;";

            globProtStatResuSetQuerResu0=globProtStatStatSQLCommExec0.executeQuery(globProtStatStriSQLComm0);

            Thread.sleep(20);

            if (!(globProtStatResuSetQuerResu0.isBeforeFirst())) {

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The table 'tablServ' data listing query is empty.");

                System.out.println("The given 'Selected Service' data existence checker on the table 'tablServ' method.");

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth6PrivStatBool' finished.");

                return false;}

            while (globProtStatResuSetQuerResu0.next()) {

                if ((globProtStatResuSetQuerResu0.getString(1).equals(globProtStatArraListStriModuDataRecePara0.get(6)))&&(globProtStatResuSetQuerResu0.getString(2).equals(globProtStatArraListStriModuDataRecePara0.get(7)))&&(globProtStatResuSetQuerResu0.getString(3).equals(globProtStatArraListStriModuDataRecePara0.get(8)))) {

                    locaBoolStat1=true;

                    System.out.println("Data match found :");

                    System.out.println("The 'varcCompName' : '"+globProtStatResuSetQuerResu0.getString(1)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

                    System.out.println("The 'varcCompAddr' : '"+globProtStatResuSetQuerResu0.getString(2)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

                    System.out.println("The 'varcServName' : '"+globProtStatResuSetQuerResu0.getString(3)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

                    break;}

                else if (locaBoolStat1==true) {

                    locaBoolStat1=false;}}

            if (locaBoolStat1==false) {

                globProtStatResuSetQuerResu0.close();

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' does not exist.");

                System.out.println("The given 'Selected Service' data existence checker on the table 'tablServ' method.");

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth6PrivStatBool' finished.");

                return false;}

            globProtStatResuSetQuerResu0.close();

            System.out.println("'True End Case'.");

            System.out.println("The given 'Selected Service' data existence checker on the table 'tablServ' method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth6PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrahbutt154.meth6PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Selected Service' data existence checker on the table 'tablServ' method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth6PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Modified Service' data existence checker on the table 'tablServ' method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth7PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrahbutt154.meth7PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Selected Company Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

            System.out.println("The given 'Selected Company Address' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

            System.out.println("The given 'Modified Service Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrahbutt154.meth7PrivStatBool started.");

            boolean locaBoolStat1=false;

            globProtStatStriSQLComm0="SELECT varcCompName,varcCompAddr,varcServName FROM tablServ;";

            globProtStatResuSetQuerResu0=globProtStatStatSQLCommExec0.executeQuery(globProtStatStriSQLComm0);

            Thread.sleep(20);

            if (!(globProtStatResuSetQuerResu0.isBeforeFirst())) {

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The table 'tablServ' data listing query is empty.");

                System.out.println("The given 'Modified Service' data existence checker on the table 'tablServ' method.");

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth7PrivStatBool' finished.");

                return false;}

            while (globProtStatResuSetQuerResu0.next()) {

                if ((globProtStatResuSetQuerResu0.getString(1).equals(globProtStatArraListStriModuDataRecePara0.get(6)))&&(globProtStatResuSetQuerResu0.getString(2).equals(globProtStatArraListStriModuDataRecePara0.get(7)))&&(globProtStatResuSetQuerResu0.getString(3).equals(globProtStatArraListStriModuDataRecePara0.get(10)))) {

                    locaBoolStat1=false;

                    System.out.println("Data match found :");

                    System.out.println("The 'varcCompName' : '"+globProtStatResuSetQuerResu0.getString(1)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

                    System.out.println("The 'varcCompAddr' : '"+globProtStatResuSetQuerResu0.getString(2)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

                    System.out.println("The 'varcServName' : '"+globProtStatResuSetQuerResu0.getString(3)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'.");

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                globProtStatResuSetQuerResu0.close();

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Modified Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' already exist.");

                System.out.println("The given 'Modified Service' data existence checker on the table 'tablServ' method.");

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth7PrivStatBool' finished.");

                return false;}

            globProtStatResuSetQuerResu0.close();

            System.out.println("'True End Case'.");

            System.out.println("The given 'Modified Service' data existence checker on the table 'tablServ' method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth7PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrahbutt154.meth7PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Modified Service' data existence checker on the table 'tablServ' method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth7PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Modified Service' data 'Modifier' on the table 'tablServ' method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth8PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrahbutt154.meth8PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Selected Company Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

            System.out.println("The given 'Selected Company Address' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

            System.out.println("The given 'Selected Service Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

            System.out.println("The given 'Modified Service Description' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"'.");

            System.out.println("The given 'Modified Service Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrahbutt154.meth8PrivStatBool started.");

            ArrayList<String> locaArraListStriUpda0=new ArrayList<String>();

            if (locaArraListStriUpda0.isEmpty()==false) {

                locaArraListStriUpda0.clear();}

            globProtStatStriSQLComm0="SELECT * FROM tablServ WHERE varcCompName='"+globProtStatArraListStriModuDataRecePara0.get(6)+"' AND varcCompAddr='"+globProtStatArraListStriModuDataRecePara0.get(7)+"' AND varcServName='"+globProtStatArraListStriModuDataRecePara0.get(8)+"';";

            globProtStatResuSetQuerResu0=globProtStatStatSQLCommExec0.executeQuery(globProtStatStriSQLComm0);

            Thread.sleep(20);

            if (!(globProtStatResuSetQuerResu0.isBeforeFirst())) {

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The table 'tablServ' data listing query is empty.");

                System.out.println("The given 'Modified Service' data 'Modifier' on the table 'tablServ' method.");

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth8PrivStatBool' finished.");

                return false;}

            while (globProtStatResuSetQuerResu0.next()) {

                locaArraListStriUpda0.add(globProtStatResuSetQuerResu0.getString(1));

                locaArraListStriUpda0.add(globProtStatResuSetQuerResu0.getString(2));

                locaArraListStriUpda0.add(globProtStatResuSetQuerResu0.getString(3));

                locaArraListStriUpda0.add(globProtStatResuSetQuerResu0.getString(4));

                locaArraListStriUpda0.add(globProtStatResuSetQuerResu0.getString(5));

                locaArraListStriUpda0.add(globProtStatResuSetQuerResu0.getString(6));

                locaArraListStriUpda0.add(globProtStatResuSetQuerResu0.getString(7));}

            globProtStatStriSQLComm0="UPDATE tablServ SET varcServDesc='"+globProtStatArraListStriModuDataRecePara0.get(9)+"',varcServName='"+globProtStatArraListStriModuDataRecePara0.get(10)+"' WHERE varcCompName='"+globProtStatArraListStriModuDataRecePara0.get(6)+"' AND varcCompAddr='"+globProtStatArraListStriModuDataRecePara0.get(7)+"' AND varcServName='"+globProtStatArraListStriModuDataRecePara0.get(8)+"';";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            String locaStriDateTime0="2023-01-27 01:02:03";

            globProtStatStriSQLComm0="SELECT NOW();";

            globProtStatResuSetQuerResu0=globProtStatStatSQLCommExec0.executeQuery(globProtStatStriSQLComm0);

            Thread.sleep(20);

            while (globProtStatResuSetQuerResu0.next()) {

                locaStriDateTime0=globProtStatResuSetQuerResu0.getString(1);}

            globProtStatResuSetQuerResu0.close();

            int locaIntForCyclCoun0=0;

            while (locaIntForCyclCoun0<locaArraListStriUpda0.size()) {

                String locaStriPrev0="";

                locaStriPrev0+=locaArraListStriUpda0.get(locaIntForCyclCoun0)+",";

                locaStriPrev0+=locaArraListStriUpda0.get(locaIntForCyclCoun0+1)+",";

                locaStriPrev0+=locaArraListStriUpda0.get(locaIntForCyclCoun0+2)+",";

                locaStriPrev0+=locaArraListStriUpda0.get(locaIntForCyclCoun0+3)+",";

                locaStriPrev0+=locaArraListStriUpda0.get(locaIntForCyclCoun0+4)+",";

                locaStriPrev0+=locaArraListStriUpda0.get(locaIntForCyclCoun0+5)+",";

                locaStriPrev0+=locaArraListStriUpda0.get(locaIntForCyclCoun0+6);

                globProtStatStriSQLComm0="INSERT INTO tablServLogs (dateLastModi,varcPrevVers,varcCompName,varcCompAddr,varcServDesc,varcServName,varcServLeng,varcServStat) VALUES ('"+locaStriDateTime0+"','"+locaStriPrev0+"','"+globProtStatArraListStriModuDataRecePara0.get(6)+"','"+globProtStatArraListStriModuDataRecePara0.get(7)+"','"+globProtStatArraListStriModuDataRecePara0.get(9)+"','"+globProtStatArraListStriModuDataRecePara0.get(10)+"','"+locaArraListStriUpda0.get(locaIntForCyclCoun0+4)+"','"+locaArraListStriUpda0.get(locaIntForCyclCoun0+6)+"');";

                globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

                Thread.sleep(20);

                locaIntForCyclCoun0+=7;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Modified Service' data 'Modifier' on the table 'tablServ' method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth8PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrahbutt154.meth8PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Modified Service' data 'Modifier' on the table 'tablServ' method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth8PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Modified Service' data 'Modifier' on the table 'tablAppo' method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth9PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrahbutt154.meth9PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Selected Company Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

            System.out.println("The given 'Selected Company Address' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

            System.out.println("The given 'Selected Service Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

            System.out.println("The given 'Modified Service Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrahbutt154.meth9PrivStatBool started.");

            ArrayList<String> locaArraListStriUpda0=new ArrayList<String>();

            if (locaArraListStriUpda0.isEmpty()==false) {

                locaArraListStriUpda0.clear();}

            globProtStatStriSQLComm0="SELECT * FROM tablAppo WHERE varcCompName='"+globProtStatArraListStriModuDataRecePara0.get(6)+"' AND varcCompAddr='"+globProtStatArraListStriModuDataRecePara0.get(7)+"' AND varcServName='"+globProtStatArraListStriModuDataRecePara0.get(8)+"';";

            globProtStatResuSetQuerResu0=globProtStatStatSQLCommExec0.executeQuery(globProtStatStriSQLComm0);

            Thread.sleep(20);

            if (!(globProtStatResuSetQuerResu0.isBeforeFirst())) {

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'True End Case'.");

                System.out.println("The given 'Modified Service' data 'Modifier' on the table 'tablAppo' method.");

                System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth9PrivStatBool' finished.");

                return true;}

            while (globProtStatResuSetQuerResu0.next()) {

                locaArraListStriUpda0.add(globProtStatResuSetQuerResu0.getString(1));

                locaArraListStriUpda0.add(globProtStatResuSetQuerResu0.getString(2));

                locaArraListStriUpda0.add(globProtStatResuSetQuerResu0.getString(3));

                locaArraListStriUpda0.add(globProtStatResuSetQuerResu0.getString(4));

                locaArraListStriUpda0.add(globProtStatResuSetQuerResu0.getString(5));

                locaArraListStriUpda0.add(globProtStatResuSetQuerResu0.getString(6));

                locaArraListStriUpda0.add(globProtStatResuSetQuerResu0.getString(7));

                locaArraListStriUpda0.add(globProtStatResuSetQuerResu0.getString(8));

                locaArraListStriUpda0.add(globProtStatResuSetQuerResu0.getString(9));

                locaArraListStriUpda0.add(globProtStatResuSetQuerResu0.getString(10));

                locaArraListStriUpda0.add(globProtStatResuSetQuerResu0.getString(11));}

            globProtStatStriSQLComm0="UPDATE tablAppo SET varcServName='"+globProtStatArraListStriModuDataRecePara0.get(10)+"' WHERE varcCompName='"+globProtStatArraListStriModuDataRecePara0.get(6)+"' AND varcCompAddr='"+globProtStatArraListStriModuDataRecePara0.get(7)+"' AND varcServName='"+globProtStatArraListStriModuDataRecePara0.get(8)+"';";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            String locaStriDateTime0="2023-01-27 01:02:03";

            globProtStatStriSQLComm0="SELECT NOW();";

            globProtStatResuSetQuerResu0=globProtStatStatSQLCommExec0.executeQuery(globProtStatStriSQLComm0);

            Thread.sleep(20);

            while (globProtStatResuSetQuerResu0.next()) {

                locaStriDateTime0=globProtStatResuSetQuerResu0.getString(1);}

            globProtStatResuSetQuerResu0.close();

            int locaIntForCyclCoun0=0;

            while (locaIntForCyclCoun0<locaArraListStriUpda0.size()) {

                String locaStriPrev0="";

                locaStriPrev0+=locaArraListStriUpda0.get(locaIntForCyclCoun0)+",";

                locaStriPrev0+=locaArraListStriUpda0.get(locaIntForCyclCoun0+1)+",";

                locaStriPrev0+=locaArraListStriUpda0.get(locaIntForCyclCoun0+2)+",";

                locaStriPrev0+=locaArraListStriUpda0.get(locaIntForCyclCoun0+3)+",";

                locaStriPrev0+=locaArraListStriUpda0.get(locaIntForCyclCoun0+4)+",";

                locaStriPrev0+=locaArraListStriUpda0.get(locaIntForCyclCoun0+5)+",";

                locaStriPrev0+=locaArraListStriUpda0.get(locaIntForCyclCoun0+6)+",";

                locaStriPrev0+=locaArraListStriUpda0.get(locaIntForCyclCoun0+7)+",";

                locaStriPrev0+=locaArraListStriUpda0.get(locaIntForCyclCoun0+8)+",";

                locaStriPrev0+=locaArraListStriUpda0.get(locaIntForCyclCoun0+9)+",";

                locaStriPrev0+=locaArraListStriUpda0.get(locaIntForCyclCoun0+10);

                globProtStatStriSQLComm0="INSERT INTO tablAppoLogs (dateLastModi,varcPrevVers,varcCompName,varcCompAddr,varcServName,varcAppoDate,varcAppoEmai,varcAppoHour,varcAppoName,varcAppoStat,varcAppoTele,varcServLeng) VALUES ('"+locaStriDateTime0+"','"+locaStriPrev0+"','"+globProtStatArraListStriModuDataRecePara0.get(6)+"','"+globProtStatArraListStriModuDataRecePara0.get(7)+"','"+globProtStatArraListStriModuDataRecePara0.get(10)+"','"+locaArraListStriUpda0.get(locaIntForCyclCoun0+1)+"','"+locaArraListStriUpda0.get(locaIntForCyclCoun0+2)+"','"+locaArraListStriUpda0.get(locaIntForCyclCoun0+3)+"','"+locaArraListStriUpda0.get(locaIntForCyclCoun0+4)+"','"+locaArraListStriUpda0.get(locaIntForCyclCoun0+5)+"','"+locaArraListStriUpda0.get(locaIntForCyclCoun0+6)+"','"+locaArraListStriUpda0.get(locaIntForCyclCoun0+9)+"');";

                globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

                Thread.sleep(20);

                locaIntForCyclCoun0+=11;}

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'True End Case'.");

            System.out.println("The given 'Modified Service' data 'Modifier' on the table 'tablAppo' method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth9PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrahbutt154.meth9PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Modified Service' data 'Modifier' on the table 'tablAppo' method.");

            System.out.println("The 'filejavamodudataprocwindarrahbutt154.meth9PrivStatBool' finished.");

            return false;}}}
