package packmodudatacode;

import java.sql.DriverManager;

import java.util.ArrayList;

import packmoduloggcode.filejavamoduloggproclogg;

import packmoduwindcode.filejavamoduwindprocwindarraabcdefghijklmnmess;

import packmoduwindcode.filejavamoduwindprocwindarraabcdefghijklmnprogbar004;

/*
Description :


    This is the class for the 'Module Database Process Window Arrangement b Button 154' process related methods.

    This class is part of the 'Database' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodudataprocwindarrabbutt154 extends filejavamodudataclaswindarraabcdefghijklmnbase {   
 
/*
Description :


    The 'Module Database Process Window Arrangement b Button 154' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool(ArrayList<String> locaArraListStriPara0) throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrabbutt154.meth0PublStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrabbutt154.meth0PublStatBool started.");

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(0,"MDPWAbB154 0/13");

            if ((locaArraListStriPara0==null)||(locaArraListStriPara0.isEmpty()==true)||(locaArraListStriPara0.size()!=9)) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Parameter' is empty or its size is incorrect.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' is empty or its size is not correct.");

                System.out.println("'False End Case' : The given 'Parameter' is empty or its size is incorrect.");

                System.out.println("The 'Module Database Process Window Arrangement b Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth0PublStatBool' finished.");

                return false;}

            if (globProtStatArraListStriModuDataRecePara0.isEmpty() == false) {

                globProtStatArraListStriModuDataRecePara0.clear();}

            globProtStatArraListStriModuDataRecePara0.addAll(locaArraListStriPara0);

            System.out.println("Parameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'New SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            System.out.println("The given 'New SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'New SQL User Password Hasher' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"'.");

            System.out.println("The given 'New SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            System.out.println("The given 'Pri. SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

            System.out.println("The given 'Pri. SQL User Password Hasher' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

            System.out.println("The given 'Pri. SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

            boolean locaBoolStat0=false;

            locaBoolStat0=filejavamodudataprocwindarrabbutt154.meth1PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(7,"MDPWAbB154 1/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one value that length is not correct.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one value that length is not correct.");

                System.out.println("\n'False End Case' : The given 'Parameter' contains at least one value that length is not correct.");

                System.out.println("The 'Module Database Process Window Arrangement b Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrabbutt154.meth2PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(15,"MDPWAbB154 2/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one 'Whitespace' character.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one 'Whitespace' character.");

                System.out.println("\n'False End Case' : The given 'Parameter' contains at least one 'Whitespace' character.");

                System.out.println("The 'Module Database Process Window Arrangement b Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrabbutt154.meth3PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(23,"MDPWAbB154 3/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'\ncontains at least one character that is not a digit type character.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"' contains at least one character that is not a digit type character.");

                System.out.println("\n'False End Case' : The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"' contains at least one character that is not a digit type character.");

                System.out.println("The 'Module Database Process Window Arrangement b Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrabbutt154.meth4PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(30,"MDPWAbB154 4/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'SQL Server' connection with\nthe given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'\ncannot be established.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'SQL Server' connection with the given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"' cannot be established.");

                System.out.println("\n'False End Case' : The given 'SQL Server' connection with the given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"' cannot be established.");

                System.out.println("The 'Module Database Process Window Arrangement b Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrabbutt154.meth5PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(38,"MDPWAbB154 5/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'New SQL Databese Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'\nalready exists.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'New SQL Databese Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' already exists.");

                System.out.println("\n'False End Case' : The given 'New SQL Databese Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' already exists.");

                System.out.println("The 'Module Database Process Window Arrangement b Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrabbutt154.meth6PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(46,"MDPWAbB154 6/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'New SQL UserName' : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'\nalready exists.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'New SQL UserName' : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"' already exists.");

                System.out.println("\n'False End Case' : The given 'New SQL UserName' : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"' already exists.");

                System.out.println("The 'Module Database Process Window Arrangement b Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrabbutt154.meth7PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(53,"MDPWAbB154 7/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'New SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'\ncannot be created.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'New SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' cannot be created.");

                System.out.println("\n'False End Case' : The given 'New SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' cannot be created.");

                System.out.println("The 'Module Database Process Window Arrangement b Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrabbutt154.meth8PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(61,"MDPWAbB154 8/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'New SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'\ncannot be used.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'New SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' cannot be used.");

                System.out.println("\n'False End Case' : The given 'New SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' cannot be used.");

                System.out.println("The 'Module Database Process Window Arrangement b Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrabbutt154.meth9PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(69,"MDPWAbB154 9/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'New SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'\ntables cannot be created.");

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'New SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' tables cannot be created.");

                System.out.println("\n'False End Case' : The given 'New SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' tables cannot be created.");

                System.out.println("The 'Module Database Process Window Arrangement b Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrabbutt154.meth10PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(76,"MDPWAbB154 10/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'New SQL Username' : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'\ncannot be created.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'New SQL Username' : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"' cannot be created.");

                System.out.println("\n'False End Case' : The given 'New SQL Username' : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"' cannot be created.");

                System.out.println("The 'Module Database Process Window Arrangement b Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrabbutt154.meth11PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(84,"MDPWAbB154 11/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'New SQL Username' : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'\ncould not get the privileges.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'New SQL Username' : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"' could not get the privileges.");

                System.out.println("\n'False End Case' : The given 'New SQL Username' : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"' could not get the privileges.");

                System.out.println("The 'Module Database Process Window Arrangement b Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarrabbutt154.meth12PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(92,"MDPWAbB154 12/13");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'New SQL Username' data cannot be inserted to the table 'tablUser'.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'New SQL Username' data cannot be inserted to the table 'tablUser'.");

                System.out.println("\n'False End Case' : The given 'New SQL Username' data cannot be inserted to the table 'tablUser'.");

                System.out.println("The 'Module Database Process Window Arrangement b Button 154' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth0PublStatBool' finished.");

                return false;}

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(100,"MDPWAbB154 13/13");

            System.out.println("\n'True End Case'.");

            System.out.println("The 'Module Database Process Window Arrangement b Button 154' process manager method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth0PublStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrabbutt154.meth0PublStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The 'Module Database Process Window Arrangement b Button 154' process manager method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth0PublStatBool' finished.");

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

            System.out.println("\nThe 'filejavamodudataprocwindarrabbutt154.meth1PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'New SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            System.out.println("The given 'New SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'New SQL User Password Hasher' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"'.");

            System.out.println("The given 'New SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            System.out.println("The given 'Pri. SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

            System.out.println("The given 'Pri. SQL User Password Hasher' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

            System.out.println("The given 'Pri. SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrabbutt154.meth1PrivStatBool started.");

            if ((globProtStatArraListStriModuDataRecePara0.get(0)==null)||(globProtStatArraListStriModuDataRecePara0.get(1)==null)||(globProtStatArraListStriModuDataRecePara0.get(2)==null)||(globProtStatArraListStriModuDataRecePara0.get(3)==null)||(globProtStatArraListStriModuDataRecePara0.get(4)==null)||(globProtStatArraListStriModuDataRecePara0.get(5)==null)||(globProtStatArraListStriModuDataRecePara0.get(6)==null)||(globProtStatArraListStriModuDataRecePara0.get(7)==null)||(globProtStatArraListStriModuDataRecePara0.get(8)==null)) {

                System.out.println("'False End Case' : At least one of the given 'Parameter' content is null.");

                System.out.println("The given 'Parameter' content length checker method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatArraListStriModuDataRecePara0.get(0).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(1).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(2).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(3).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(4).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(5).length()<16)||(globProtStatArraListStriModuDataRecePara0.get(6).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(7).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(8).length()<1)) {

                System.out.println("'False End Case' : At least one of the given 'Parameter' content has less length than the minimum.");

                System.out.println("The given 'Parameter' content length checker method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatArraListStriModuDataRecePara0.get(0).length()>120)||(globProtStatArraListStriModuDataRecePara0.get(1).length()>5)||(globProtStatArraListStriModuDataRecePara0.get(2).length()>60)||(globProtStatArraListStriModuDataRecePara0.get(3).length()>30)||(globProtStatArraListStriModuDataRecePara0.get(4).length()>1)||(globProtStatArraListStriModuDataRecePara0.get(5).length()>30)||(globProtStatArraListStriModuDataRecePara0.get(6).length()>30)||(globProtStatArraListStriModuDataRecePara0.get(7).length()>1)||(globProtStatArraListStriModuDataRecePara0.get(8).length()>30)) {

                System.out.println("'False End Case' : At least one of the given 'Parameter' content has more length than the maximum.");

                System.out.println("The given 'Parameter' content length checker method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth1PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Parameter' content length checker method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrabbutt154.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Parameter' content length checker method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth1PrivStatBool' finished.");

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

            System.out.println("\nThe 'filejavamodudataprocwindarrabbutt154.meth2PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'New SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            System.out.println("The given 'New SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'New SQL User Password Hasher' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"'.");

            System.out.println("The given 'New SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            System.out.println("The given 'Pri. SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

            System.out.println("The given 'Pri. SQL User Password Hasher' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

            System.out.println("The given 'Pri. SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrabbutt154.meth2PrivStatBool started.");

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

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth2PrivStatBool' finished.");

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

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec2=globProtStatArraListStriModuDataRecePara0.get(2).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec2.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec2[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'New SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec3=globProtStatArraListStriModuDataRecePara0.get(3).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec3.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec3[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'New SQL Username' : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec4=globProtStatArraListStriModuDataRecePara0.get(4).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec4.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec4[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'New SQL User Password Hasher' : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec5=globProtStatArraListStriModuDataRecePara0.get(5).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec5.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec5[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'New SQL User Password' (Hashed) : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec6=globProtStatArraListStriModuDataRecePara0.get(6).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec6.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec6[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'Pri. SQL Username' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec7=globProtStatArraListStriModuDataRecePara0.get(7).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec7.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec7[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'Pri. SQL User Password Hasher' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec8=globProtStatArraListStriModuDataRecePara0.get(8).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec8.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec8[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'Pri. SQL User Password' (Hashed) : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth2PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth2PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrabbutt154.meth2PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth2PrivStatBool' finished.");

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

            System.out.println("\nThe 'filejavamodudataprocwindarrabbutt154.meth3PrivStatBool' started.\nParameter :");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrabbutt154.meth3PrivStatBool started.");

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

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth3PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Port Number' field value content checker method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth3PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrabbutt154.meth3PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Port Number' field value content checker method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth3PrivStatBool' finished.");

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

            System.out.println("\nThe 'filejavamodudataprocwindarrabbutt154.meth4PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'Pri. SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

            System.out.println("The given 'Pri. SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(8)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrabbutt154.meth4PrivStatBool started.");

            String locaStriSQLHostAndPort0="jdbc:mysql://"+globProtStatArraListStriModuDataRecePara0.get(0)+":"+globProtStatArraListStriModuDataRecePara0.get(1);

            globProtStatConnCrea0=DriverManager.getConnection(locaStriSQLHostAndPort0,globProtStatArraListStriModuDataRecePara0.get(6),globProtStatArraListStriModuDataRecePara0.get(8));

            globProtStatStatSQLCommExec0=globProtStatConnCrea0.createStatement();

            Thread.sleep(20);

            System.out.println("'True End Case'.");

            System.out.println("The given 'Host Name' and the given 'SQL Server' connection establisher method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth4PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrabbutt154.meth4PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Host Name' and the given 'SQL Server' connection establisher method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth4PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'New SQL Database Name' existence checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth5PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrabbutt154.meth5PrivStatBool' started.\nParameter :");

            System.out.println("The given 'New SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrabbutt154.meth5PrivStatBool started.");

            boolean locaBoolStat1=false;

            globProtStatStriSQLComm0="SHOW DATABASES;";

            globProtStatResuSetQuerResu0=globProtStatStatSQLCommExec0.executeQuery(globProtStatStriSQLComm0);

            Thread.sleep(20);

            if (!(globProtStatResuSetQuerResu0.isBeforeFirst())) {    

                System.out.println("'True End Case'.");

                System.out.println("The given 'New SQL Database Name' existence checker method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth5PrivStatBool' finished.");

                return true;}

            while (globProtStatResuSetQuerResu0.next()) {

                if (globProtStatResuSetQuerResu0.getString(1).equals(globProtStatArraListStriModuDataRecePara0.get(2))) {

                    locaBoolStat1=false;

                    System.out.println("Data match found :");

                    System.out.println("The 'SQL Server Database Name' : '"+globProtStatResuSetQuerResu0.getString(1)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                globProtStatResuSetQuerResu0.close();

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The given 'New SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' already exist.");

                System.out.println("The given 'New SQL Database Name' existence checker method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth5PrivStatBool' finished.");

                return false;}

            globProtStatResuSetQuerResu0.close();

            System.out.println("'True End Case'.");

            System.out.println("The given 'New SQL Database Name' existence checker method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth5PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrabbutt154.meth5PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'New SQL Database Name' existence checker method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth5PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'New SQL User Name' existence checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth6PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrabbutt154.meth5PrivStatBool' started.\nParameter :");

            System.out.println("The given 'New SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrabbutt154.meth6PrivStatBool started.");

            boolean locaBoolStat1=false;

            globProtStatStriSQLComm0="SELECT user FROM mysql.user;";

            globProtStatResuSetQuerResu0=globProtStatStatSQLCommExec0.executeQuery(globProtStatStriSQLComm0);

            Thread.sleep(20);

            if (!(globProtStatResuSetQuerResu0.isBeforeFirst())) {

                System.out.println("'True End Case'.");

                System.out.println("The given 'New SQL User Name' existence checker method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth6PrivStatBool' finished.");

                return true;}

            while (globProtStatResuSetQuerResu0.next()) {

                if (globProtStatResuSetQuerResu0.getString(1).equals(globProtStatArraListStriModuDataRecePara0.get(3))) {

                    locaBoolStat1=false;

                    System.out.println("Data match found :");

                    System.out.println("The 'SQL Server Username' : '"+globProtStatResuSetQuerResu0.getString(1)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                globProtStatResuSetQuerResu0.close();

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The given 'New SQL Username' : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"' already exist.");

                System.out.println("The given 'New SQL User Name' existence checker method.");

                System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth6PrivStatBool' finished.");

                return false;}

            globProtStatResuSetQuerResu0.close();

            System.out.println("'True End Case'.");

            System.out.println("The given 'New SQL User Name' existence checker method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth6PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrabbutt154.meth6PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'New SQL User Name' existence checker method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth6PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'New SQL Database Name' creator method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth7PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrabbutt154.meth7PrivStatBool' started.\nParameter :");

            System.out.println("The given 'New SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrabbutt154.meth7PrivStatBool started.");

            globProtStatStriSQLComm0="CREATE DATABASE "+globProtStatArraListStriModuDataRecePara0.get(2)+";";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("'True End Case'.");

            System.out.println("The given 'New SQL Database Name' creator method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth7PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrabbutt154.meth7PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'New SQL Database Name' creator method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth7PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'New SQL Database Name' selecter method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth8PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrabbutt154.meth8PrivStatBool' started.\nParameter :");

            System.out.println("The given 'New SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrabbutt154.meth8PrivStatBool started.");

            globProtStatStriSQLComm0="USE "+globProtStatArraListStriModuDataRecePara0.get(2)+";";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("'True End Case'.");

            System.out.println("The given 'New SQL Database Name' selecter method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth8PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrabbutt154.meth8PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'New SQL Database Name' selecter method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth8PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'New SQL Database Name' tables creator method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth9PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrabbutt154.meth9PrivStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrabbutt154.meth9PrivStatBool started.");

            globProtStatStriSQLComm0="CREATE TABLE tablAppo (inteTablRow INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,varcAppoDate VARCHAR(10) NOT NULL,varcAppoEmai VARCHAR(120) NOT NULL,varcAppoHour VARCHAR(5) NOT NULL,varcAppoName VARCHAR(120) NOT NULL,varcAppoStat VARCHAR(8) NOT NULL,varcAppoTele VARCHAR(15) NOT NULL,varcCompAddr VARCHAR(120) NOT NULL,varcCompName VARCHAR(120) NOT NULL,varcServLeng VARCHAR(3) NOT NULL,varcServName VARCHAR(120) NOT NULL);";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("The table 'tablAppo' created successfully.");

            globProtStatStriSQLComm0="CREATE TABLE tablAppoLogs (dateLastModi DATETIME NOT NULL,inteTablRow INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,varcAppoDate VARCHAR(10) NOT NULL,varcAppoEmai VARCHAR(120) NOT NULL,varcAppoHour VARCHAR(5) NOT NULL,varcAppoName VARCHAR(120) NOT NULL,varcAppoStat VARCHAR(8) NOT NULL,varcAppoTele VARCHAR(15) NOT NULL,varcCompAddr VARCHAR(120) NOT NULL,varcCompName VARCHAR(120) NOT NULL,varcPrevVers VARCHAR(700) NOT NULL,varcServLeng VARCHAR(3) NOT NULL,varcServName VARCHAR(120) NOT NULL);";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("The table 'tablAppoLogs' created successfully.");

            globProtStatStriSQLComm0="CREATE TABLE tablComp (inteTablRow INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,varcCompAddr VARCHAR(120) NOT NULL,varcCompHour VARCHAR(11) NOT NULL,varcCompName VARCHAR(120) NOT NULL,varcCompStat VARCHAR(8) NOT NULL);";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("The table 'tablComp' created successfully.");

            globProtStatStriSQLComm0="CREATE TABLE tablCompLogs (dateLastModi DATETIME NOT NULL,inteTablRow INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,varcCompAddr VARCHAR(120) NOT NULL,varcCompHour VARCHAR(11) NOT NULL,varcCompName VARCHAR(120) NOT NULL,varcCompStat VARCHAR(8) NOT NULL,varcPrevVers VARCHAR(300) NOT NULL);";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("The table 'tablCompLogs' created successfully.");

            globProtStatStriSQLComm0="CREATE TABLE tablServ (inteTablRow INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,varcCompAddr VARCHAR(120) NOT NULL,varcCompName VARCHAR(120) NOT NULL,varcServDesc VARCHAR(120) NOT NULL,varcServLeng VARCHAR(3) NOT NULL,varcServName VARCHAR(120) NOT NULL,varcServStat VARCHAR(8) NOT NULL);";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("The table 'tablServ' created successfully.");

            globProtStatStriSQLComm0="CREATE TABLE tablServLogs (dateLastModi DATETIME NOT NULL,inteTablRow INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,varcCompAddr VARCHAR(120) NOT NULL,varcCompName VARCHAR(120) NOT NULL,varcPrevVers VARCHAR(500) NOT NULL,varcServDesc VARCHAR(120) NOT NULL,varcServLeng VARCHAR(3) NOT NULL,varcServName VARCHAR(120) NOT NULL,varcServStat VARCHAR(8) NOT NULL);";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("The table 'tablServLogs' created successfully.");

            globProtStatStriSQLComm0="CREATE TABLE tablUser (inteTablRow INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,varcPassType VARCHAR(1) NOT NULL,varcUserName VARCHAR(30) NOT NULL,varcUserPass VARCHAR(30) NOT NULL,varcUserPriv VARCHAR(6) NOT NULL,varcUserStat VARCHAR(8) NOT NULL);";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("The table 'tablUser' created successfully.");

            globProtStatStriSQLComm0="CREATE TABLE tablUserLogs (dateLastModi DATETIME NOT NULL,inteTablRow INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,varcPassType VARCHAR(1) NOT NULL,varcPrevVers VARCHAR(100) NOT NULL,varcUserName VARCHAR(30) NOT NULL,varcUserPass VARCHAR(30) NOT NULL,varcUserPriv VARCHAR(6) NOT NULL,varcUserStat VARCHAR(8) NOT NULL);";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("The table 'tablUserLogs' created successfully.");

            System.out.println("'True End Case'.");

            System.out.println("The given 'New SQL Database Name' tables creator method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth9PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrabbutt154.meth9PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'New SQL Database Name' tables creator method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth9PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'New SQL Username' creator method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth10PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrabbutt154.meth10PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'New SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'New SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrabbutt154.meth10PrivStatBool started.");

            globProtStatStriSQLComm0="CREATE USER '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'@'"+globProtStatArraListStriModuDataRecePara0.get(0)+"' IDENTIFIED BY '"+globProtStatArraListStriModuDataRecePara0.get(5)+"';";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("The given 'New SQL Username' : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"' on the given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"' created successfully.");

            globProtStatStriSQLComm0="FLUSH PRIVILEGES";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("'True End Case'.");

            System.out.println("The given 'New SQL Username' creator method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth10PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0){

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrabbutt154.meth10PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'New SQL Username' creator method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth10PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'New SQL Username' privilege granter method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth11PrivStatBool() throws Exception{

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarrabbutt154.meth11PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'New SQL Database Name' value in the beginning of the method : "+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            System.out.println("The given 'New SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarrabbutt154.meth11PrivStatBool started.");

            globProtStatStriSQLComm0="GRANT ALL PRIVILEGES ON "+globProtStatArraListStriModuDataRecePara0.get(2)+".* TO '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'@'"+globProtStatArraListStriModuDataRecePara0.get(0)+"';";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("The 'ALL' privileges granted successfully.");

            globProtStatStriSQLComm0="GRANT CREATE USER ON *.* TO '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'@'"+globProtStatArraListStriModuDataRecePara0.get(0)+"';";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("The 'CREATE USER' privilege granted successfully.");

            globProtStatStriSQLComm0="GRANT GRANT OPTION ON *.* TO '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'@'"+globProtStatArraListStriModuDataRecePara0.get(0)+"';";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("The 'GRANT' privilege granted successfully.");

            globProtStatStriSQLComm0="GRANT RELOAD ON *.* TO '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'@'"+globProtStatArraListStriModuDataRecePara0.get(0)+"';";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("The 'RELOAD' privilege granted successfully.");

            globProtStatStriSQLComm0="GRANT SELECT ON *.* TO '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'@'"+globProtStatArraListStriModuDataRecePara0.get(0)+"';";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("The 'SELECT' privilege granted successfully.");

            globProtStatStriSQLComm0="FLUSH PRIVILEGES";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("'True End Case'.");

            System.out.println("The given 'New SQL Username' privilege granter method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth11PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrabbutt154.meth11PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'New SQL Username' privilege granter method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth11PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'New SQL Username' data to the table 'tablUser' inserter method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth12PrivStatBool() throws Exception {

        try {

            System.out.println("filejavamodudataprocwindarrabbutt154.meth12PrivStatBool started.\nParametes :");

            System.out.println("The given 'New SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'New SQL User Password Hasher' type value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"'.");

            System.out.println("The given 'New SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO", "The filejavamodudataprocwindarrabbutt154.meth12PrivStatBool started.");

            globProtStatStriSQLComm0="INSERT INTO tablUser (varcUserName,varcPassType,varcUserPass,varcUserPriv,varcUserStat) VALUES ('"+globProtStatArraListStriModuDataRecePara0.get(3)+"','"+globProtStatArraListStriModuDataRecePara0.get(4)+"','"+globProtStatArraListStriModuDataRecePara0.get(5)+"','Master','Active');";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            String locaStriDateTime0="2023-01-27 01:02:03";

            globProtStatStriSQLComm0="SELECT NOW();";

            globProtStatResuSetQuerResu0=globProtStatStatSQLCommExec0.executeQuery(globProtStatStriSQLComm0);

            Thread.sleep(20);

            while (globProtStatResuSetQuerResu0.next()) {

                locaStriDateTime0=globProtStatResuSetQuerResu0.getString(1);}

            globProtStatResuSetQuerResu0.close();

            globProtStatStriSQLComm0="INSERT INTO tablUserLogs (dateLastModi,varcPrevVers,varcUserName,varcPassType,varcUserPass,varcUserPriv,varcUserStat) VALUES ('"+locaStriDateTime0+"','Created','"+globProtStatArraListStriModuDataRecePara0.get(3)+"','"+globProtStatArraListStriModuDataRecePara0.get(4)+"','"+globProtStatArraListStriModuDataRecePara0.get(5)+"','Master','Active');";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'True End Case'.");

            System.out.println("The given 'New SQL Username' data to the table 'tablUser' inserter method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth12PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarrabbutt154.meth12PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'New SQL Username' data to the table 'tablUser' inserter method.");

            System.out.println("The 'filejavamodudataprocwindarrabbutt154.meth12PrivStatBool' finished.");

            return false;}}}
