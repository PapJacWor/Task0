package packmodudatacode;

import java.sql.DriverManager;

import java.util.ArrayList;

import packmoduloggcode.filejavamoduloggproclogg;

import packmoduwindcode.filejavamoduwindprocwindarraabcdefghijklmnmess;

import packmoduwindcode.filejavamoduwindprocwindarraabcdefghijklmnprogbar004;

/*
Description :


    This is the class for the 'Module Database Process Window Arrangement cdefghijk 134' process related methods.

    This class is part of the 'Database' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodudataprocwindarracdefghijkbutt134 extends filejavamodudataclaswindarraabcdefghijklmnbase {

/*
Description :


    The 'Module Database Process Window Arrangement cdefghijk Button 134' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static ArrayList<String> meth0PublStatArraListStri(ArrayList<String> locaArraListStriPara0) throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarracdefghijkbutt134.meth0PublStatArraListStri' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarracdefghijkbutt134.meth0PublStatArraListStri started.");

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(0,"MDPWAcdefghijkB134 0/7");

            if ((locaArraListStriPara0==null)||(locaArraListStriPara0.isEmpty()==true)||(locaArraListStriPara0.size()<6)||(locaArraListStriPara0.size()>8)) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Parameter' is empty or its size is incorrect.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' is empty or its size is not correct.");

                System.out.println("'False End Case' : The given 'Parameter' is empty or its size is incorrect.");

                System.out.println("The 'Module Database Process Window Arrangement cdefghijk Button 134' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth0PublStatArraListStri' finished.");

                if (globProtStatArraListStriModuDataRetuPara0.isEmpty()==false) {

                    globProtStatArraListStriModuDataRetuPara0.clear();}

                return globProtStatArraListStriModuDataRetuPara0;}

            if (globProtStatArraListStriModuDataRecePara0.isEmpty()==false) {

                globProtStatArraListStriModuDataRecePara0.clear();}

            globProtStatArraListStriModuDataRecePara0.addAll(locaArraListStriPara0);

            if (globProtStatArraListStriModuDataRetuPara0.isEmpty()==false) {

                globProtStatArraListStriModuDataRetuPara0.clear();}

            System.out.println("Parameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'SQL User Password Hasher Type' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"'.");

            System.out.println("The given 'SQL User Password' (Hashed) : value in the beginning of the method "+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            if (globProtStatArraListStriModuDataRecePara0.size()>=7) {

                System.out.println("The given 'New / Selected Company Name' : value in the beginning of the method '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

                Thread.sleep(20);}

            if (globProtStatArraListStriModuDataRecePara0.size()==8) {

                System.out.println("The given 'New / Selected Company Address' : value in the beginning of the method '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

                Thread.sleep(20);}

            boolean locaBoolStat0=false;

            locaBoolStat0=filejavamodudataprocwindarracdefghijkbutt134.meth1PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(14,"MDPWAcdefghijkB134 1/7");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one value that length is not correct.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one value that length is not correct.");

                System.out.println("\n'False End Case' : The given 'Parameter' contains at least one value that length is not correct.");

                System.out.println("The 'Module Database Process Window Arrangement cdefghijk Button 134' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth0PublStatArraListStri' finished.");

                return globProtStatArraListStriModuDataRetuPara0;}

            locaBoolStat0=filejavamodudataprocwindarracdefghijkbutt134.meth2PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(28,"MDPWAcdefghijkB134 2/7");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one 'Whitespace' character.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Parameter' contains at least one 'Whitespace' character.");

                System.out.println("\n'False End Case' : The given 'Parameter' contains at least one 'Whitespace' character.");

                System.out.println("The 'Module Database Process Window Arrangement cdefghijk Button 134' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth0PublStatArraListStri' finished.");

                return globProtStatArraListStriModuDataRetuPara0;}

            locaBoolStat0=filejavamodudataprocwindarracdefghijkbutt134.meth3PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(42,"MDPWAcdefghijkB134 3/7");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'\ncontains at least one character that is not a digit type character.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"' contains at least one character that is not a digit type character.");

                System.out.println("\n'False End Case' : The given 'Port Number' : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"' contains at least one character that is not a digit type character.");

                System.out.println("The 'Module Database Process Window Arrangement cdefghijk Button 134' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth0PublStatArraListStri' finished.");

                return globProtStatArraListStriModuDataRetuPara0;}

            locaBoolStat0=filejavamodudataprocwindarracdefghijkbutt134.meth4PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(57,"MDPWAcdefghijkB134 4/7");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'SQL Server' connection with\nthe given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'\ncannot be established.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'SQL Server' connection with the given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"' cannot be established.");

                System.out.println("\n'False End Case' : The given 'SQL Server' connection with the given 'Host Name' : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"' cannot be established.");

                System.out.println("The 'Module Database Process Window Arrangement cdefghijk Button 134' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth0PublStatArraListStri' finished.");

                return globProtStatArraListStriModuDataRetuPara0;}

            locaBoolStat0=filejavamodudataprocwindarracdefghijkbutt134.meth5PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(71,"MDPWAcdefghijkB134 5/7");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'\ncannot be used.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' cannot be used.");

                System.out.println("\n'False End Case' : The given 'SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' cannot be used.");

                System.out.println("The 'Module Database Process Window Arrangement cdefghijk Button 134' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth0PublStatArraListStri' finished.");

                return globProtStatArraListStriModuDataRetuPara0;}

            locaBoolStat0=filejavamodudataprocwindarracdefghijkbutt134.meth6PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(85,"MDPWAcdefghijkB134 6/7");

            if (locaBoolStat0==false) {

                filejavamoduloggproclogg.meth0PublStatBool("INFO","The List Of Company(ies) listing query is empty.");

                System.out.println("\n'False End Case' : The List Of Company(ies) listing query is empty.");

                System.out.println("The 'Module Database Process Window Arrangement cdefghijk Button 134' process manager method.");

                System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth0PublStatArraListStri' finished.");

                return globProtStatArraListStriModuDataRetuPara0;}

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(100,"MDPWAcdefghijkB134 7/7");

            System.out.println("\n'True End Case'.");

            System.out.println("The 'Module Database Process Window Arrangement cdefghijk Button 134' process manager method.");

            System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth0PublStatArraListStri' finished.");

            return globProtStatArraListStriModuDataRetuPara0;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarracdefghijkbutt134.meth0PublStatArraListStri.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            if (globProtStatArraListStriModuDataRetuPara0.isEmpty()==false) {

                globProtStatArraListStriModuDataRetuPara0.clear();}

            System.out.println("\n'Exception End Case'.");

            System.out.println("The 'Module Database Process Window Arrangement cdefghijk Button 134' process manager method.");

            System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth0PublStatArraListStri' finished.");

            return globProtStatArraListStriModuDataRetuPara0;}}

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

            System.out.println("\nThe 'filejavamodudataprocwindarracdefghijkbutt134.meth1PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'SQL User Password Hasher Type' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"'.");

            System.out.println("The given 'SQL User Password' (Hashed) : value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            if (globProtStatArraListStriModuDataRecePara0.size()>=7) {

                System.out.println("The given 'New / Selected Company Name' : value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

                Thread.sleep(20);}

            if (globProtStatArraListStriModuDataRecePara0.size()==8) {

                System.out.println("The given 'New / Selected Company Address' : value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

                Thread.sleep(20);}

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarracdefghijkbutt134.meth1PrivStatBool started.");

            if ((globProtStatArraListStriModuDataRecePara0.get(0)==null)||(globProtStatArraListStriModuDataRecePara0.get(1)==null)||(globProtStatArraListStriModuDataRecePara0.get(2)==null)||(globProtStatArraListStriModuDataRecePara0.get(3)==null)||(globProtStatArraListStriModuDataRecePara0.get(4)==null)||(globProtStatArraListStriModuDataRecePara0.get(5)==null)) {

                System.out.println("'False End Case' : At least one of the given 'Parameter' content is null.");

                System.out.println("The given 'Parameter' content length checker method.");

                System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatArraListStriModuDataRecePara0.get(0).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(1).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(2).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(3).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(4).length()<1)||(globProtStatArraListStriModuDataRecePara0.get(5).length()<16)) {

                System.out.println("'False End Case' : At least one of the given 'Parameter' content has less length than the minimum.");

                System.out.println("The given 'Parameter' content length checker method.");

                System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatArraListStriModuDataRecePara0.get(0).length()>120)||(globProtStatArraListStriModuDataRecePara0.get(1).length()>5)||(globProtStatArraListStriModuDataRecePara0.get(2).length()>30)||(globProtStatArraListStriModuDataRecePara0.get(3).length()>30)||(globProtStatArraListStriModuDataRecePara0.get(4).length()>1)||(globProtStatArraListStriModuDataRecePara0.get(5).length()>30)) {

                System.out.println("'False End Case' : At least one of the given 'Parameter' content has more length than the maximum.");

                System.out.println("The given 'Parameter' content length checker method.");

                System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth1PrivStatBool' finished.");

                return false;}

            if (globProtStatArraListStriModuDataRecePara0.size()>=7) {

                if (globProtStatArraListStriModuDataRecePara0.get(6)==null) {

                    System.out.println("'False End Case' : The given 'New / Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' value is null.");

                    System.out.println("The given 'Parameter' content length checker method.");

                    System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth1PrivStatBool' finished.");

                    return false;}

                if (globProtStatArraListStriModuDataRecePara0.get(6).length()<1) {

                    System.out.println("'False End Case' : The given 'New / Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' value has less length than the minimum.");

                    System.out.println("The given 'Parameter' content length checker method.");

                    System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth1PrivStatBool' finished.");

                    return false;}

                if (globProtStatArraListStriModuDataRecePara0.get(6).length()>120) {

                    System.out.println("'False End Case' : The given 'New / Selected Company Name' : '"+globProtStatArraListStriModuDataRecePara0.get(6)+"' value has more length than the maximum.");

                    System.out.println("The given 'Parameter' content length checker method.");

                    System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth1PrivStatBool' finished.");

                    return false;}}

            if (globProtStatArraListStriModuDataRecePara0.size()==8) {

                if (globProtStatArraListStriModuDataRecePara0.get(7)==null) {

                    System.out.println("'False End Case' : The given 'New / Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' value is null.");

                    System.out.println("The given 'Parameter' content length checker method.");

                    System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth1PrivStatBool' finished.");

                    return false;}

                if (globProtStatArraListStriModuDataRecePara0.get(7).length()<1) {

                    System.out.println("'False End Case' : The given 'New / Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' value has less length than the minimum.");

                    System.out.println("The given 'Parameter' content length checker method.");

                    System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth1PrivStatBool' finished.");

                    return false;}

                if (globProtStatArraListStriModuDataRecePara0.get(7).length()>120) {

                    System.out.println("'False End Case' : The given 'New / Selected Company Address' : '"+globProtStatArraListStriModuDataRecePara0.get(7)+"' value has more length than the maximum.");

                    System.out.println("The given 'Parameter' content length checker method.");

                    System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth1PrivStatBool' finished.");

                    return false;}}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Parameter' content length checker method.");

            System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarracdefghijkbutt134.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Parameter' content length checker method.");

            System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth1PrivStatBool' finished.");

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

            System.out.println("\nThe 'filejavamodudataprocwindarracdefghijkbutt134.meth2PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'SQL User Password Hasher' value in the beginning of the method  : '"+globProtStatArraListStriModuDataRecePara0.get(4)+"'.");

            System.out.println("The given 'SQL User Password' (Hashed) : value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarracdefghijkbutt134.meth2PrivStatBool started.");

            boolean locaBoolStat1=true;

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

                System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth2PrivStatBool' finished.");

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

                System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec2=globProtStatArraListStriModuDataRecePara0.get(2).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec2.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec2[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'SQL Database Name' : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth2PrivStatBool' finished.");

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

                System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth2PrivStatBool' finished.");

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

                System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec5=globProtStatArraListStriModuDataRecePara0.get(5).toCharArray();

            for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec5.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec5[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'SQL User Password' : '"+globProtStatArraListStriModuDataRecePara0.get(5)+"' value contains at least a 'Whitespace' character.");

                System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth2PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

            System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth2PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarracdefghijkbutt134.meth2PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Parameter' content 'Whitespace' checker method.");

            System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth2PrivStatBool' finished.");

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

            System.out.println("\nThe 'filejavamodudataprocwindarracdefghijkbutt134.meth3PrivStatBool' started:\nParameter :");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarracdefghijkbutt134.meth3PrivStatBool started.");

            boolean locaBoolStat1=true;

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

                System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth3PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Port Number' field value content checker method.");

            System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth3PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarracdefghijkbutt134.meth3PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Port Number' field value content checker method.");

            System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth3PrivStatBool' finished.");

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

            System.out.println("\nThe 'filejavamodudataprocwindarracdefghijkbutt134.meth4PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(0)+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(1)+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(3)+"'.");

            System.out.println("The given 'SQL Password' (Hashed) value in the beginning of the method : "+globProtStatArraListStriModuDataRecePara0.get(5)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarracdefghijkbutt134.meth4PrivStatBool started.");

            String locaStriSQLHostAndPort0="jdbc:mysql://"+globProtStatArraListStriModuDataRecePara0.get(0)+":"+globProtStatArraListStriModuDataRecePara0.get(1);

            globProtStatConnCrea0=DriverManager.getConnection(locaStriSQLHostAndPort0,globProtStatArraListStriModuDataRecePara0.get(3),globProtStatArraListStriModuDataRecePara0.get(5));

            globProtStatStatSQLCommExec0=globProtStatConnCrea0.createStatement();

            Thread.sleep(20);

            System.out.println("'True End Case'.");

            System.out.println("The given 'Host Name' and the given 'SQL Server' connection establisher method.");

            System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth4PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarracdefghijkbutt134.meth4PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Host Name' and the given 'SQL Server' connection establisher method.");

            System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth4PrivStatBool' finished.");

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

            System.out.println("\nThe 'filejavamodudataprocwindarracdefghijkbutt134.meth5PrivStatBool' started.\nParameters :");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatArraListStriModuDataRecePara0.get(2)+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarracdefghijkbutt134.meth5PrivStatBool started.");

            globProtStatStriSQLComm0="USE "+globProtStatArraListStriModuDataRecePara0.get(2)+";";

            globProtStatStatSQLCommExec0.executeUpdate(globProtStatStriSQLComm0);

            Thread.sleep(20);

            System.out.println("'True End Case'.");

            System.out.println("The given 'SQL Database Name' selecter method.");

            System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth5PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarracdefghijkbutt134.meth5PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'SQL Database Name' selecter method.");

            System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth5PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Parameter' content searcher in the table 'tablComp' method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth6PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamodudataprocwindarracdefghijkbutt134.meth6PrivStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamodudataprocwindarracdefghijkbutt134.meth6PrivStatBool started.");

            if (globProtStatArraListStriModuDataRecePara0.size()==6) {

                System.out.println("The 'Parameter' with 0 element case.");

                globProtStatStriSQLComm0="SELECT * FROM tablComp;";}

            else if (globProtStatArraListStriModuDataRecePara0.size()==7) {

                System.out.println("Parameter :");

                System.out.println("The given 'New / Selected Company Name' : value in the beginning of the method  "+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

                System.out.println("The 'Parameter' with 1 element case.");

                globProtStatStriSQLComm0="SELECT * FROM tablComp WHERE varcCompName LIKE '%"+globProtStatArraListStriModuDataRecePara0.get(6)+"%';";}

            else if (globProtStatArraListStriModuDataRecePara0.size()==8) {

                System.out.println("Parameters :");

                System.out.println("The given 'New / Selected Company Name' : value in the beginning of the method  "+globProtStatArraListStriModuDataRecePara0.get(6)+"'.");

                System.out.println("The given 'New / Selected Company Address' : value in the beginning of the method  "+globProtStatArraListStriModuDataRecePara0.get(7)+"'.");

                System.out.println("The 'Parameter' with 2 elements case.");

                globProtStatStriSQLComm0="SELECT * FROM tablComp WHERE varcCompName LIKE '%"+globProtStatArraListStriModuDataRecePara0.get(6)+"%' AND varcCompAddr LIKE '%"+globProtStatArraListStriModuDataRecePara0.get(7)+"%';";}

            else {

                System.out.println("'False End Case' : Parameter length does not match.");

                System.out.println("The given 'Parameter' content searcher in the table 'tablComp' method.");

                System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth6PrivStatBool' finished.");

                return false;}

            globProtStatResuSetQuerResu0=globProtStatStatSQLCommExec0.executeQuery(globProtStatStriSQLComm0);

            Thread.sleep(20);

            if (!(globProtStatResuSetQuerResu0.isBeforeFirst())) {

                System.out.println("'False End Case' : The table 'tablComp' data listing query is empty.");

                System.out.println("The given 'Parameter' content searcher in the table 'tablComp' method.");

                System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth6PrivStatBool' finished.");

                return false;}

            while (globProtStatResuSetQuerResu0.next()) {

                globProtStatArraListStriModuDataRetuPara0.add(globProtStatResuSetQuerResu0.getString(1));

                globProtStatArraListStriModuDataRetuPara0.add(globProtStatResuSetQuerResu0.getString(2));

                globProtStatArraListStriModuDataRetuPara0.add(globProtStatResuSetQuerResu0.getString(3));

                globProtStatArraListStriModuDataRetuPara0.add(globProtStatResuSetQuerResu0.getString(4));

                globProtStatArraListStriModuDataRetuPara0.add(globProtStatResuSetQuerResu0.getString(5));}

            globProtStatResuSetQuerResu0.close();

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'True End Case'.");

            System.out.println("The given 'Parameter' content searcher in the table 'tablComp' method.");

            System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth6PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamodudataprocwindarracdefghijkbutt134.meth6PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            globProtStatStatSQLCommExec0.close();

            globProtStatConnCrea0.close();

            System.out.println("'True End Case'.");

            System.out.println("The given 'Parameter' content searcher in the table 'tablComp' method.");

            System.out.println("The 'filejavamodudataprocwindarracdefghijkbutt134.meth6PrivStatBool' finished.");

            return false;}}}
