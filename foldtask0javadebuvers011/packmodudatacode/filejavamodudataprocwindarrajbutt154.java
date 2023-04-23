package packmodudatacode;

import java.sql.DriverManager;

import java.util.ArrayList;

import packmoduloggcode.filejavamoduloggproclogg;

import packmoduwindcode.filejavamoduwindprocwindarraabcdefghijklmnmess;

import packmoduwindcode.filejavamoduwindprocwindarraabcdefghijklmnprogbar004;

/*
Description :


    This is the class for the 'Module Database Process Window Arrangement j Button 154' process related methods.

    This class is part of the 'Database' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodudataprocwindarrajbutt154 extends filejavamodudataclaswindarraabcdefghijklmnbase {

/*
Description :


    The 'Module Database Process Window Arrangement j Button 154' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool(ArrayList<String> locaArraListStriPara0) throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrajbutt154.meth0PublStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrajbutt154.meth0PublStatBool started.");

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(0,"MDPWAjB154 0/10");

            if ((locaArraListStriPara0==null)||(locaArraListStriPara0.isEmpty()==true)||(locaArraListStriPara0.size()!=11)) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Parameter' is empty or its size is incorrect.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' is empty or its size is not correct.");

                System.out.println("'False End Case' : The given 'Parameter' is empty or its size is incorrect.");

                System.out.println("The 'Module Database Process Window Arrangement j Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth0PublStatBool' finished.");

                return false;}

            if (globProtStatArraListStriModuDataRecePara0.isEmpty()==false) {

                globProtStatArraListStriModuDataRecePara0.clear();}

            globProtStatArraListStriModuDataRecePara0.addAll(locaArraListStriPara0);

            System.out.println("Parameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'SQL User Password Hasher' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"'.");

            System.out.println("The given 'SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            System.out.println("The given 'Selected Company Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

            System.out.println("The given 'Selected Company Address' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

            System.out.println("The given 'Selected Service Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

            System.out.println("The given 'Selected Appointment Date' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"'.");

            System.out.println("The given 'Selected Appointment Hour' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'.");

            boolean locaBoolStat0=false;

            locaBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(10,"MDPWAjB154 1/10");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one value that length is not correct.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one value that length is not correct.");

                System.out.println("\n'False End Case' : The given 'Parameter' contains at least one value that length is not correct.");

                System.out.println("The 'Module Database Process Window Arrangement j Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrajbutt154.meth2PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(20,"MDPWAjB154 2/10");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one 'Whitespace' character.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one 'Whitespace' character.");

                System.out.println("\n'False End Case' : The given 'Parameter' contains at least one 'Whitespace' character.");

                System.out.println("The 'Module Database Process Window Arrangement j Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrajbutt154.meth3PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(30,"MDPWAjB154 3/10");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'\ncontains at least one character that is not a digit type character.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"' contains at least one character that is not a digit type character.");

                System.out.println("\n'False End Case' : The given 'Port Number' contains at least one character that is not a digit type character.");

                System.out.println("The 'Module Database Process Window Arrangement j Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrajbutt154.meth4PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(40,"MDPWAjB154 4/10");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'\ncontains at least one character that is not a digit type character.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"' contains at least one character that is not a digit type character.");

                System.out.println("\n'False End Case' : The given 'Port Number' contains at least one character that is not a digit type character.");

                System.out.println("The 'Module Database Process Window Arrangement j Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrajbutt154.meth5PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(50,"MDPWAjB154 5/10");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'\ncontains at least one character that is not a digit type character.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"' contains at least one character that is not a digit type character.");

                System.out.println("\n'False End Case' : The given 'Port Number' contains at least one character that is not a digit type character.");

                System.out.println("The 'Module Database Process Window Arrangement j Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrajbutt154.meth6PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(60,"MDPWAjB154 6/10");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'SQL Server' connection with the given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'\ncannot be established.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'SQL Server' connection with the given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"' cannot be established.");

                System.out.println("\n'False End Case' : The given 'SQL Server' connection with the given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"' cannot be established.");

                System.out.println("The 'Module Database Process Window Arrangement j Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrajbutt154.meth7PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(70,"MDPWAjB154 7/10");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'\ncannot be used.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' cannot be used.");

                System.out.println("\n'False End Case' : The given 'SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' cannot be used.");

                System.out.println("The 'Module Database Process Window Arrangement j Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrajbutt154.meth8PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(80,"MDPWAjB154 8/10");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with\nthe given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with\nthe given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' with\nthe given 'Selected Book Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' with\nthe given 'Selected Book Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'\ndoes not exists with 'Active Status' in the table 'tablAppo'.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' with the given 'Selected Book Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' with the given 'Selected Book Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' does not exists with 'Active Status' in the table 'tablAppo'.");

                System.out.println("\n'False End Case' : The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' with the given 'Selected Book Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' with the given 'Selected Book Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' does not exists with 'Active Status' in the table 'tablAppo'.");

                System.out.println("The 'Module Database Process Window Arrangement j Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrajbutt154.meth9PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(90,"MDPWAjB154 9/10");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with\nthe given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with\nthe given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' with\nthe given 'Selected Book Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' with\nthe given 'Selected Book Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'\ncannot be deleted.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' with the given 'Selected Book Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' with the given 'Selected Book Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' cannot be deleted.");

                System.out.println("\n'False End Case' : The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' with the given 'Selected Book Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' with the given 'Selected Book Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' cannot be deleted.");

                System.out.println("The 'Module Database Process Window Arrangement j Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth0PublStatBool' finished.");

                return false;}

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(100,"MDPWAjB154 10/10");

            System.out.println("\n'True End Case'.");

            System.out.println("The 'Module Database Process Window Arrangement j Button 154' process manager method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth0PublStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrajbutt154.meth0PublStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The 'Module Database Process Window Arrangement j Button 154' process manager method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth0PublStatBool' finished.");

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

            System.out.println("\nThe 'filejavamodudataprocwindarrajbutt154.meth1PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'SQL User Password Hasher' type value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"'.");

            System.out.println("The given 'SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            System.out.println("The given 'Selected Company Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

            System.out.println("The given 'Selected Company Address' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

            System.out.println("The given 'Selected Service Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

            System.out.println("The given 'Selected Appointment Date' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"'.");

            System.out.println("The given 'Selected Appointment Hour' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrajbutt154.meth1PrivStatBool started.");

            if ((globProtStatArraListStriModuDataRecePara0.get(0)==null)||(globProtStatArraListStriModuDataRecePara0.get(1)==null)||(globProtStatArraListStriModuDataRecePara0.get(2)==null)||(globProtStatArraListStriModuDataRecePara0.get(3)==null)||(globProtStatArraListStriModuDataRecePara0.get(4)==null)||(globProtStatArraListStriModuDataRecePara0.get(5)==null)||(globProtStatArraListStriModuDataRecePara0.get(6)==null)||(globProtStatArraListStriModuDataRecePara0.get(7)==null)||(globProtStatArraListStriModuDataRecePara0.get(8)==null)||(globProtStatArraListStriModuDataRecePara0.get(9)==null)||(globProtStatArraListStriModuDataRecePara0.get(10)==null)) {

                System.out.println("'False End Case' : At least one of the given 'Parameter' content is null.");

                System.out.println("The given 'Parameter' content length checker method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatArraListStriModuDataRecePara0.get(0).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(1).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(2).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(3).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(4).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(5).length()<16)||(globProtStatArraListStriModuDataRecePara0.get(6).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(7).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(8).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(9).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(10).length()<1)) {

                System.out.println("'False End Case' : At least one of the given 'Parameter' content has less length than the minimum.");

                System.out.println("The given 'Parameter' content length checker method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatArraListStriModuDataRecePara0.get(0).length()>120)||(globProtStatArraListStriModuDataRecePara0.get(1).length()>5)||(globProtStatArraListStriModuDataRecePara0.get(2).length()>60)||(globProtStatArraListStriModuDataRecePara0.get(3).length()>30)||(globProtStatArraListStriModuDataRecePara0.get(4).length()>1)||(globProtStatArraListStriModuDataRecePara0.get(5).length()>30)||(globProtStatArraListStriModuDataRecePara0.get(6).length()>120)||(globProtStatArraListStriModuDataRecePara0.get(7).length()>120)||(globProtStatArraListStriModuDataRecePara0.get(8).length()>120)||(globProtStatArraListStriModuDataRecePara0.get(9).length()!=10)||(globProtStatArraListStriModuDataRecePara0.get(10).length()!=5)) {

                System.out.println("'False End Case' : At least one of the given 'Parameter' content has more length than the maximum.");

                System.out.println("The given 'Parameter' content length checker method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth1PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Parameter' content length checker method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrajbutt154.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Parameter' content length checker method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth1PrivStatBool' finished.");

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

            System.out.println("\nThe 'filejavamodudataprocwindarrajbutt154.meth2PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'SQL User Password Hasher' type value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"'.");

            System.out.println("The given 'SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            System.out.println("The given 'Selected Appointment Date' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"'.");

            System.out.println("The given 'Selected Appointment Hour' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrajbutt154.meth2PrivStatBool started.");

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

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth2PrivStatBool' finished.");

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

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth2PrivStatBool' finished.");

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

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth2PrivStatBool' finished.");

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

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec4=globProtStatArraListStriModuDataRecePara0.get(4).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec4.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec4[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'SQL User Password Hasher' : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"' type value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth2PrivStatBool' finished.");

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

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec6=globProtStatArraListStriModuDataRecePara0.get(9).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec6.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec6[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given  'Selected Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec7=globProtStatArraListStriModuDataRecePara0.get(10).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec7.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec7[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'Selected Appointment Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth2PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth2PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrajbutt154.meth2PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth2PrivStatBool' finished.");

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

            System.out.println("\nThe 'filejavamodudataprocwindarrajbutt154.meth3PrivStatBool' started.\nParameter :");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrajbutt154.meth3PrivStatBool started.");

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

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth3PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Port Number' field value content checker method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth3PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrajbutt154.meth3PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Port Number' field value content checker method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth3PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Selected Appointment Date' field value validity checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth4PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrajbutt154.meth4PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Selected Appointment Date' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrajbutt154.meth4PrivStatBool started.");

            boolean locaBoolStat1=false;

            String locaStriSeleAppoDate0=globProtStatArraListStriModuDataRecePara0.get(9);

            if (locaStriSeleAppoDate0.contains("-")==false) {

                System.out.println("'False End Case' : The given 'Selected Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' value does not contain the '-' character.");

                System.out.println("The given 'Selected Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth4PrivStatBool' finished.");

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

                System.out.println("The given 'Selected Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth4PrivStatBool' finished.");

                return false;}

            String[] locaStriArraSpli0=locaStriSeleAppoDate0.split("-");

            int locaIntYear0=Integer.parseInt(locaStriArraSpli0[0]);

            if ((locaIntYear0<2023)||(locaIntYear0>2100)) {

                System.out.println("'False End Case' : The given 'Selected Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' year value is less than 2023 or bigger than 2100.");

                System.out.println("The given 'Selected Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth4PrivStatBool' finished.");

                return false;}

            int locaIntMont0=Integer.parseInt(locaStriArraSpli0[1]);

            if ((locaIntMont0<1)||(locaIntMont0>12)) {

                System.out.println("'False End Case' : The given 'Selected Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' month value is less than 1 or bigger than 12.");

                System.out.println("The given 'Selected Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth4PrivStatBool' finished.");

                return false;}

            int locaIntDay0=Integer.parseInt(locaStriArraSpli0[2]);

            if ((locaIntMont0==2)&&((locaIntDay0<1)||(locaIntDay0>29))) {

                System.out.println("'False End Case' : The given 'Selected Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' month value is 2 and the day value is less than 1 or bigger than 29.");

                System.out.println("The given 'Selected Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth4PrivStatBool' finished.");

                return false;}

            if (((locaIntMont0==1)||(locaIntMont0==3)||(locaIntMont0==5)||(locaIntMont0==7)||(locaIntMont0==8)||(locaIntMont0==10)||(locaIntMont0==12))&&(locaIntDay0<1)||(locaIntDay0>31)) {

                System.out.println("'False End Case' : The given 'Selected Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' day value is less than 1 or bigger than 31.");

                System.out.println("The given 'Selected Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth4PrivStatBool' finished.");

                return false;}

            if (((locaIntMont0==4)||(locaIntMont0==6)||(locaIntMont0==9)||(locaIntMont0==11))&&((locaIntDay0<1)||(locaIntDay0>30))) {

                System.out.println("'False End Case' : The given 'Selected Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' day value is less than 1 or bigger than 30.");

                System.out.println("The given 'Selected Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth4PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Selected Appointment Date' field value validity checker method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth4PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrajbutt154.meth4PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Selected Appointment Date' field value validity checker method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth4PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Selected Appointment Hour' field value validity checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth5PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrajbutt154.meth5PrivStatBool' started.\nParameter :");

            System.out.println("The given 'Selected Appointment Hour' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrajbutt154.meth5PrivStatBool started.");

            boolean locaBoolStat1=false;

            String locaStriSeleAppoHour0=globProtStatArraListStriModuDataRecePara0.get(10);

            if (locaStriSeleAppoHour0.contains(":")==false) {

                System.out.println("'False End Case' : The given 'Selected Appointment Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' value does not contain the ':' character.");

                System.out.println("The given 'Selected Appointment Hour' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth5PrivStatBool' finished.");

                return false;}

            char[] locaCharArraDate=globProtStatArraListStriModuDataRecePara0.get(10).toCharArray();

            for (int locaIntForCyclCoun=0;locaIntForCyclCoun<locaCharArraDate.length;locaIntForCyclCoun++) {

                if ((Character.isDigit(locaCharArraDate[locaIntForCyclCoun])==false)&&locaCharArraDate[locaIntForCyclCoun]!=':') {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'Selected Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' value contains at least one character that is not a digit type character neither the ':' character.");

                System.out.println("The given 'Selected Appointment Hour' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth5PrivStatBool' finished.");

                return false;}

            String[] locaStriArraSpli0=locaStriSeleAppoHour0.split(":");

            int locaIntStartHour0=Integer.parseInt(locaStriArraSpli0[0]);

            int locaIntStartMinu0=Integer.parseInt(locaStriArraSpli0[1]);

            if ((locaIntStartHour0<0)||(locaIntStartHour0>23)) {

                System.out.println("'False End Case' : The given 'Selected Appointment Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' starting hour value is less than 0 or bigger than 23.");

                System.out.println("The given 'Selected Appointment Hour' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth5PrivStatBool' finished.");

                return false;}

            if ((locaIntStartMinu0<0)||(locaIntStartMinu0>59)) {

                System.out.println("'False End Case' : The given 'Selected Appointment Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' starting minute value is less than 0 or bigger than 59.");

                System.out.println("The given 'Selected Appointment Hour' field value validity checker method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth5PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Selected Appointment Hour' field value validity checker method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth5PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrajbutt154.meth5PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Selected Appointment Hour' field value validity checker method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth5PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Host Name' and the given 'SQL Server' connection establisher method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth6PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrajbutt154.meth6PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrajbutt154.meth6PrivStatBool started.");

            String locaStriSQLHostAndPort0="jdbc:mysql://"+globProtStatArraListStriModuDataRecePara0.get(0)+":"+globProtStatArraListStriModuDataRecePara0.get(1);

            globProtStatConnCrea0=DriverManager.getConnection(locaStriSQLHostAndPort0,globProtStatArraListStriModuDataRecePara0.get(3),globProtStatArraListStriModuDataRecePara0.get(5));

            globProtStatStatSQLCommExec0=globProtStatConnCrea0.createStatement();

            Thread.sleep(20);

            System.out.println("'True End Case'.");

            System.out.println("The given 'Host Name' and the given 'SQL Server' connection establisher method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth6PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrajbutt154.meth6PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Host Name' and the given 'SQL Server' connection establisher method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth6PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'SQL Database Name' selecter method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth7PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrajbutt154.meth7PrivStatBool' started.\nParameter :");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrajbutt154.meth7PrivStatBool started.");

            globProtStatStriSQLComm0="USE "+globProtStatArraListStriModuDataRecePara0.get(2)+";";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("'True End Case'.");

            System.out.println("The given 'SQL Database Name' selecter method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth7PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrajbutt154.meth7PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'SQL Database Name' selecter method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth7PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Selected Appointment' data existence checker on the table 'tablAppo' method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth8PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrajbutt154.meth8PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Selected Company Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

            System.out.println("The given 'Selected Company Address' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

            System.out.println("The given 'Selected Service Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

            System.out.println("The given 'Selected Appointment Date' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"'.");

            System.out.println("The given 'Selected Appointment Hour' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrajbutt154.meth8PrivStatBool started.");

            boolean locaBoolStat1=false;

            globProtStatStriSQLComm0="SELECT varcCompName,varcCompAddr,varcServName,varcAppoDate,varcAppoHour,varcAppoStat FROM tablAppo;";

            globProtStatResuSetQuerResu0=globProtStatStatSQLCommExec0.executeQuery(globProtStatStriSQLComm0);

            Thread.sleep(20);

            if (!(globProtStatResuSetQuerResu0.isBeforeFirst())) {

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The table 'tablAppo' data listing query is empty.");

                System.out.println("The given 'Selected Appointment' data existence checker on the table 'tablAppo' method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth8PrivStatBool' finished.");

                locaBoolStat1=false;}

            while (globProtStatResuSetQuerResu0.next()) {

                if (globProtStatResuSetQuerResu0.getString(1).equals(globProtStatArraListStriModuDataRecePara0.get(6))&&globProtStatResuSetQuerResu0.getString(2).equals(globProtStatArraListStriModuDataRecePara0.get(7))&&globProtStatResuSetQuerResu0.getString(3).equals(globProtStatArraListStriModuDataRecePara0.get(8))&&globProtStatResuSetQuerResu0.getString(4).equals(globProtStatArraListStriModuDataRecePara0.get(9))&&globProtStatResuSetQuerResu0.getString(5).equals(globProtStatArraListStriModuDataRecePara0.get(10))&&globProtStatResuSetQuerResu0.getString(6).equals("Active")) {

                    locaBoolStat1=true;

                    System.out.println("Data match found :");

                    System.out.println("The 'varcCompName' : '"+globProtStatResuSetQuerResu0.getString(1)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

                    System.out.println("The 'varcCompAddr' : '"+globProtStatResuSetQuerResu0.getString(2)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

                    System.out.println("The 'varcServName' : '"+globProtStatResuSetQuerResu0.getString(3)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

                    System.out.println("The 'varcAppoDate' : '"+globProtStatResuSetQuerResu0.getString(4)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(9)+"'.");

                    System.out.println("The 'varcAppoHour' : '"+globProtStatResuSetQuerResu0.getString(5)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'.");

                    System.out.println("The 'varcAppoStat' : '"+globProtStatResuSetQuerResu0.getString(6)+"' match with 'Active'.");

                    break;}

                else if (locaBoolStat1==true) {

                    locaBoolStat1=false;}}

            if (locaBoolStat1==false) {

                globProtStatResuSetQuerResu0.close();

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The given 'Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' with the given 'Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' with the given 'Selected Service Name' : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' with the given 'Selected Appointment Date' : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"' with the given 'Selected Appointment Hour' : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"' does not exist.");

                System.out.println("The given 'Selected Appointment' data existence checker on the table 'tablAppo' method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth8PrivStatBool' finished.");

                return false;}

            globProtStatResuSetQuerResu0.close();

            System.out.println("'True End Case'.");

            System.out.println("The given 'Selected Appointment' data existence checker on the table 'tablAppo' method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth8PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrajbutt154.meth8PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Selected Appointment' data existence checker on the table 'tablAppo' method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth8PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Selected Appointment' data 'Deleter' on the table 'tablAppo' method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth9PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrajbutt154.meth9PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Selected Company Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

            System.out.println("The given 'Selected Company Address' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

            System.out.println("The given 'Selected Service Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

            System.out.println("The given 'Selected Appointment Date' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(9)+"'.");

            System.out.println("The given 'Selected Appointment Hour' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(10)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrajbutt154.meth9PrivStatBool started.");

            ArrayList<String> locaArraListStriUpda0=new ArrayList<String>();

            if (locaArraListStriUpda0.isEmpty()==false) {

                locaArraListStriUpda0.clear();}

            globProtStatStriSQLComm0="SELECT * FROM tablAppo WHERE varcCompName='"+globProtStatArraListStriModuDataRecePara0.get(6)+"' AND varcCompAddr='"+globProtStatArraListStriModuDataRecePara0.get(7)+"' AND varcServName='"+globProtStatArraListStriModuDataRecePara0.get(8)+"' AND varcAppoDate='"+globProtStatArraListStriModuDataRecePara0.get(9)+"' AND varcAppoHour='"+globProtStatArraListStriModuDataRecePara0.get(10)+"';";

            globProtStatResuSetQuerResu0=globProtStatStatSQLCommExec0.executeQuery(globProtStatStriSQLComm0);

            Thread.sleep(20);

            if (!(globProtStatResuSetQuerResu0.isBeforeFirst())) {

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The table 'tablAppo' data listing query is empty.");

                System.out.println("The given 'Selected Appointment' data 'Deleter' on the table 'tablAppo' method.");

                System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth9PrivStatBool' finished.");

                return false;}

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

            globProtStatStriSQLComm0="UPDATE tablAppo SET varcAppoStat='Inactive' WHERE varcCompName='"+globProtStatArraListStriModuDataRecePara0.get(6)+"' AND varcCompAddr='"+globProtStatArraListStriModuDataRecePara0.get(7)+"' AND varcServName='"+globProtStatArraListStriModuDataRecePara0.get(8)+"' AND varcAppoDate='"+globProtStatArraListStriModuDataRecePara0.get(9)+"' AND varcAppoHour='"+globProtStatArraListStriModuDataRecePara0.get(10)+"';";

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

            while(locaIntForCyclCoun0<locaArraListStriUpda0.size()) {

                String locaStriPrev0 ="";

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

                globProtStatStriSQLComm0="INSERT INTO tablAppoLogs (dateLastModi,varcPrevVers,varcCompName,varcCompAddr,varcServName,varcAppoDate,varcAppoHour,varcAppoEmai,varcAppoName,varcAppoTele,varcServLeng,varcAppoStat) VALUES ('"+locaStriDateTime0+"','"+locaStriPrev0+"','"+globProtStatArraListStriModuDataRecePara0.get(6)+"','"+globProtStatArraListStriModuDataRecePara0.get(7)+"','"+globProtStatArraListStriModuDataRecePara0.get(8)+"','"+globProtStatArraListStriModuDataRecePara0.get(9)+"','"+globProtStatArraListStriModuDataRecePara0.get(10)+"','"+locaArraListStriUpda0.get(locaIntForCyclCoun0+2)+"','"+locaArraListStriUpda0.get(locaIntForCyclCoun0+4)+"','"+locaArraListStriUpda0.get(locaIntForCyclCoun0+6)+"','"+locaArraListStriUpda0.get(locaIntForCyclCoun0+9)+"','Inactive');";

                globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

                Thread.sleep(20);

                locaIntForCyclCoun0+=11;}

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'True End Case'.");

            System.out.println("The given 'Selected Appointment' data 'Deleter' on the table 'tablAppo' method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth9PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrajbutt154.meth9PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Selected Appointment' data 'Deleter' on the table 'tablAppo' method.");

            System.out.println("The 'filejavamodudataprocwindarrajbutt154.meth9PrivStatBool' finished.");

            return false;}}}
