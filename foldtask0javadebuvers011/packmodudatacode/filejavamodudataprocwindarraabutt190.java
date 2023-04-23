package packmodudatacode;

import java.sql.DriverManager;

import java.util.ArrayList;

import packmoduloggcode.filejavamoduloggproclogg;

import packmoduwindcode.filejavamoduwindprocwindarraabcdefghijklmnmess;

import packmoduwindcode.filejavamoduwindprocwindarraabcdefghijklmnprogbar004;

/*
Description :


    This is the class for the 'Module Database Process Window Arrangement a Button 190' process related methods.

    This class is part of the 'Database' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodudataprocwindarraabutt190 extends filejavamodudataclaswindarraabcdefghijklmnbase {

/*
Description :


    The 'Module Database Process Window Arrangement a Button 190' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool(ArrayList<String> locaArraListStriPara0) throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarraabutt190.meth0PublStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraabutt190.meth0PublStatBool started.");

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(0,"MDPWAaB190 0/7");

            if ((locaArraListStriPara0==null)||(locaArraListStriPara0.isEmpty()==true)||(locaArraListStriPara0.size()!=6)) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Parameter' is empty or its size is incorrect.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' is empty or its size is not correct.");

                System.out.println("'False End Case' : The given 'Parameter' is empty or its size is incorrect.");

                System.out.println("The 'Module Database Process Window Arrangement a Button 190' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraabutt190.meth0PublStatBool' finished.");

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

            boolean locaBoolStat0=false;

            locaBoolStat0=filejavamodudataprocwindarraabutt190.meth1PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(14,"MDPWAaB190 1/7");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one value that length is not correct.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one value that length is not correct.");

                System.out.println("\n'False End Case' : The given 'Parameter' contains at least one value that length is not correct.");

                System.out.println("The 'Module Database Process Window Arrangement a Button 190' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraabutt190.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarraabutt190.meth2PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(28,"MDPWAaB190 2/7");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one 'Whitespace' character.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one 'Whitespace' character.");

                System.out.println("\n'False End Case' : The given 'Parameter' contains at least one 'Whitespace' character.");

                System.out.println("The 'Module Database Process Window Arrangement a Button 190' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraabutt190.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarraabutt190.meth3PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(42,"MDPWAaB190 3/7");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'\ncontains at least one character that is not a digit type character.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"' contains at least one character that is not a digit type character.");

                System.out.println("\n'False End Case' : The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"' contains at least one character that is not a digit type character.");

                System.out.println("The 'Module Database Process Window Arrangement a Button 190' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraabutt190.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarraabutt190.meth4PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(57,"MDPWAaB190 4/7");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'SQL Server' connection with\nthe given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'\ncannot be established.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'SQL Server' connection with the given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"' cannot be established.");

                System.out.println("\n'False End Case' : The given 'SQL Server' connection with the given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"' cannot be established.");

                System.out.println("The 'Module Database Process Window Arrangement a Button 190' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraabutt190.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarraabutt190.meth5PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(71,"MDPWAaB190 5/7");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'\ncannot be used.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' cannot be used.");

                System.out.println("\n'False End Case' : The given 'SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' cannot be used.");

                System.out.println("The 'Module Database Process Window Arrangement a Button 190' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraabutt190.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamodudataprocwindarraabutt190.meth6PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(85,"MDPWAaB190 6/7");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'SQL Username' : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'\ndid not match in the table 'tablUser'.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'SQL Username' : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"' did not match in the table 'tablUser'.");

                System.out.println("\n'False End Case' : The given 'SQL Username' : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"' did not match in the table 'tablUser'.");

                System.out.println("The 'Module Database Process Window Arrangement a Button 190' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarraabutt190.meth0PublStatBool' finished.");

                return false;}

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(100,"MDPWAaB190 7/7");

            System.out.println("\n'True End Case'.");

            System.out.println("The 'Module Database Process Window Arrangement a Button 190' process manager method.");

            System.out.println("The 'filejavamodudataprocwindarraabutt190.meth0PublStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraabutt190.meth0PublStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The 'Module Database Process Window Arrangement a Button 190' process manager method.");

            System.out.println("The 'filejavamodudataprocwindarraabutt190.meth0PublStatBool' finished.");

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

            System.out.println("\nThe 'filejavamodudataprocwindarraabutt190.meth1PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'SQL User Password Hasher' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"'.");

            System.out.println("The given 'SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraabutt190.meth1PrivStatBool started.");

            if ((globProtStatArraListStriModuDataRecePara0.get(0)==null)||(globProtStatArraListStriModuDataRecePara0.get(1)==null)||(globProtStatArraListStriModuDataRecePara0.get(2)==null)||(globProtStatArraListStriModuDataRecePara0.get(3)==null)||(globProtStatArraListStriModuDataRecePara0.get(4)==null)||(globProtStatArraListStriModuDataRecePara0.get(5)==null)) {

                System.out.println("'False End Case' : At least one of the given 'Parameter' content is null.");

                System.out.println("The given 'Parameter' content length checker method.");

                System.out.println("The 'filejavamodudataprocwindarraabutt190.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatArraListStriModuDataRecePara0.get(0).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(1).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(2).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(3).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(4).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(5).length()<16)) {

                System.out.println("'False End Case' : At least one of the given 'Parameter' content has less length than the minimum.");

                System.out.println("The given 'Parameter' content length checker method.");

                System.out.println("The 'filejavamodudataprocwindarraabutt190.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatArraListStriModuDataRecePara0.get(0).length()>120)||(globProtStatArraListStriModuDataRecePara0.get(1).length()>5)||(globProtStatArraListStriModuDataRecePara0.get(2).length()>60)||(globProtStatArraListStriModuDataRecePara0.get(3).length()>30)||(globProtStatArraListStriModuDataRecePara0.get(4).length()>1)||(globProtStatArraListStriModuDataRecePara0.get(5).length()>30)) {

                System.out.println("'False End Case' : At least one of the given 'Parameter' content has more length than the maximum.");

                System.out.println("The given 'Parameter' content length checker method.");

                System.out.println("The 'filejavamodudataprocwindarraabutt190.meth1PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Parameter' content length checker method.");

            System.out.println("The 'filejavamodudataprocwindarraabutt190.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraabutt190.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Parameter' content length checker method.");

            System.out.println("The 'filejavamodudataprocwindarraabutt190.meth1PrivStatBool' finished.");

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

            System.out.println("\nThe 'filejavamodudataprocwindarraabutt190.meth2PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'SQL User Password Hasher' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"'.");

            System.out.println("The given 'SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraabutt190.meth2PrivStatBool started.");

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

                System.out.println("The 'filejavamodudataprocwindarraabutt190.meth2PrivStatBool' finished.");

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

                System.out.println("The 'filejavamodudataprocwindarraabutt190.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec2=globProtStatArraListStriModuDataRecePara0.get(2).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec2.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec2[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The 'SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarraabutt190.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec3=globProtStatArraListStriModuDataRecePara0.get(3).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec3.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec3[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The 'SQL Username' : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarraabutt190.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec4=globProtStatArraListStriModuDataRecePara0.get(4).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec4.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec4[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The 'SQL User Password Hasher' : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarraabutt190.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec5=globProtStatArraListStriModuDataRecePara0.get(5).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec5.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec5[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The 'SQL User Password' (Hashed) : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarraabutt190.meth2PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

            System.out.println("The 'filejavamodudataprocwindarraabutt190.meth2PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraabutt190.meth2PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

            System.out.println("The 'filejavamodudataprocwindarraabutt190.meth2PrivStatBool' finished.");

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

            System.out.println("\nThe 'filejavamodudataprocwindarraabutt190.meth3PrivStatBool' started.\nParameter :");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraabutt190.meth3PrivStatBool started.");

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

                System.out.println("The 'filejavamodudataprocwindarraabutt190.meth3PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Port Number' field value content checker method.");

            System.out.println("The 'filejavamodudataprocwindarraabutt190.meth3PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraabutt190.meth3PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Port Number' field value content checker method.");

            System.out.println("The 'filejavamodudataprocwindarraabutt190.meth3PrivStatBool' finished.");

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

            System.out.println("\nThe 'filejavamodudataprocwindarraabutt190.meth4PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraabutt190.meth4PrivStatBool started.");

            String locaStriSQLHostAndPort0="jdbc:mysql://"+globProtStatArraListStriModuDataRecePara0.get(0)+":"+globProtStatArraListStriModuDataRecePara0.get(1);

            globProtStatConnCrea0=DriverManager.getConnection(locaStriSQLHostAndPort0,globProtStatArraListStriModuDataRecePara0.get(3),globProtStatArraListStriModuDataRecePara0.get(5));

            globProtStatStatSQLCommExec0=globProtStatConnCrea0.createStatement();

            Thread.sleep(20);

            System.out.println("'True End Case'.");

            System.out.println("The given 'Host Name' and the given 'SQL Server' connection establisher method.");

            System.out.println("The 'filejavamodudataprocwindarraabutt190.meth4PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraabutt190.meth4PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Host Name' and the given 'SQL Server' connection establisher method.");

            System.out.println("The 'filejavamodudataprocwindarraabutt190.meth4PrivStatBool' finished.");

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

            System.out.println("\nThe 'filejavamodudataprocwindarraabutt190.meth5PrivStatBool' started.\nParameter :");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraabutt190.meth5PrivStatBool started.");

            globProtStatStriSQLComm0="USE "+globProtStatArraListStriModuDataRecePara0.get(2)+";";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("'True End Case'.");

            System.out.println("The given 'SQL Database Name' selecter method.");

            System.out.println("The 'filejavamodudataprocwindarraabutt190.meth5PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraabutt190.meth5PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'SQL Database Name' selecter method.");

            System.out.println("The 'filejavamodudataprocwindarraabutt190.meth5PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'SQL Username' data validity checker on the table 'tablUser'.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth6PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarraabutt190.meth6PrivStatBool' started.\nParameters :");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'SQL User Password Hasher' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"'.");

            System.out.println("The given 'SQL User Password' (Hashed) value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarraabutt190.meth6PrivStatBool started.");

            boolean locaBoolStat1=false;

            globProtStatStriSQLComm0="SELECT varcUserName,varcPassType,varcUserPass,varcUserStat FROM tablUser;";

            globProtStatResuSetQuerResu0=globProtStatStatSQLCommExec0.executeQuery(globProtStatStriSQLComm0);

            Thread.sleep(20);

            if (!(globProtStatResuSetQuerResu0.isBeforeFirst())) {

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : The table 'tablUser' data listing query is empty.");

                System.out.println("The given 'SQL Username' data validity checker on the table 'tablUser'.");

                System.out.println("The 'filejavamodudataprocwindarraabutt190.meth6PrivStatBool' finished.");

                return false;}

            while (globProtStatResuSetQuerResu0.next()) {

                if (globProtStatResuSetQuerResu0.getString(1).equals(globProtStatArraListStriModuDataRecePara0.get(3))&&globProtStatResuSetQuerResu0.getString(2).equals(globProtStatArraListStriModuDataRecePara0.get(4))&&globProtStatResuSetQuerResu0.getString(3).equals(globProtStatArraListStriModuDataRecePara0.get(5))&&globProtStatResuSetQuerResu0.getString(4).equals("Active")) {

                    locaBoolStat1=true;

                    System.out.println("Data match found :");

                    System.out.println("The 'varcUserName' : '"+globProtStatResuSetQuerResu0.getString(1)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

                    System.out.println("The 'varcPassType' : '"+globProtStatResuSetQuerResu0.getString(2)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(4)+"'.");

                    System.out.println("The 'varcUserPass' : '"+globProtStatResuSetQuerResu0.getString(3)+"' match with '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

                    System.out.println("The 'varcUserStat' : '"+globProtStatResuSetQuerResu0.getString(4)+"' match with 'Active'.");

                    break;}

                else if (locaBoolStat1==true) {

                    locaBoolStat1=false;}}

            if (locaBoolStat1==false) {

                globProtStatResuSetQuerResu0.close();

                globProtStatStatSQLCommExec0.close();

                globProtStatConnCrea0.close();

                System.out.println("'False End Case' : No data match was found for the given 'SQL Username' : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"' with the given 'SQL User Password Hasher' : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"' with the given 'SQL User Password' (Hashed) : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

                System.out.println("The given 'SQL Username' data validity checker on the table 'tablUser'.");

                System.out.println("The 'filejavamodudataprocwindarraabutt190.meth6PrivStatBool' finished.");

                return false;}

            globProtStatResuSetQuerResu0.close();

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'True End Case'.");

            System.out.println("The given 'SQL Username' data validity checker on the table 'tablUser'.");

            System.out.println("The 'filejavamodudataprocwindarraabutt190.meth6PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarraabutt190.meth6PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'SQL Username' data validity checker on the table 'tablUser'.");

            System.out.println("The 'filejavamodudataprocwindarraabutt190.meth6PrivStatBool' finished.");

            return false;}}}
