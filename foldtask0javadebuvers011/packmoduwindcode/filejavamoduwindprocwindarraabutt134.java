package packmoduwindcode;

import java.io.BufferedWriter;

import java.io.File;

import java.io.FileWriter;

import java.util.ArrayList;

import java.util.Scanner;

import packmoduloggcode.filejavamoduloggproclogg;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement a Button 134' process related methods.

    This class is part of the 'Window' module. 

    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamoduwindprocwindarraabutt134 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

/*
Description:


    The 'Module Window Process Window Arrangement a Button 134' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarraabutt134.meth0PublStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarraabutt134.meth0PublStatBool started.");

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(0,"MWPWAaB134 0/6");

            boolean locaBoolStat0=false;

            locaBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(16,"MWPWAaB134 1/6");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Profile File' cannot be read or written.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Profile File' cannot be read or written.");

                System.out.println("\n'False End Case' : The given 'Profile File' cannot be read or written.");

                System.out.println("The 'Module Window Process Window Arrangement a Button 134' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(33,"MWPWAaB134 2/6");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Fields' contains at least one field value that length is not correct.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Fields' contains at least one field value that length is not correct.");

                System.out.println("\n'False End Case' : The given 'Fields' contains at least one field value that length is not correct.");

                System.out.println("The 'Module Window Process Window Arrangement a Button 134' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamoduwindprocwindarraabutt134.meth3PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(50,"MWPWAaB134 3/6");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Fields' contains at least one 'Whitespace' character.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Fields' contains at least one 'Whitespace' character.");

                System.out.println("\n'False End Case' : The given 'Fields' contains at least one 'Whitespace' character.");

                System.out.println("The 'Module Window Process Window Arrangement a Button 134' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamoduwindprocwindarraabutt134.meth4PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(66,"MWPWAaB134 4/6");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Port Number' contains at least one character that is not a digit type character.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Port Number' contains at least one character that is not a digit type character.");

                System.out.println("\n'False End Case' : The given 'Port Number' contains at least one character that is not a digit type character.");

                System.out.println("The 'Module Window Process Window Arrangement a Button 134' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamoduwindprocwindarraabutt134.meth5PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(83,"MWPWAaB134 5/6");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Selected Profile Number' : '"+Integer.toString(globProtStatJComStriPosi163.getSelectedIndex())+"'\ncannot be saved.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Selected Profile Number' : '"+Integer.toString(globProtStatJComStriPosi163.getSelectedIndex())+"'\ncannot be saved.");

                System.out.println("\n'False End Case' : The given 'Selected Profile Number' : '"+Integer.toString(globProtStatJComStriPosi163.getSelectedIndex())+"' cannot be saved.");

                System.out.println("The 'Module Window Process Window Arrangement a Button 134' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth0PublStatBool' finished.");

                return false;}

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(100,"MWPWAaB134 6/6");

            System.out.println("\n'True End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement a Button 134' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth0PublStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarraabutt134.meth0PublStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement a Button 134' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth0PublStatBool' finished.");

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

            System.out.println("\nThe 'filejavamoduwindprocwindarraabutt134.meth1PrivStatBool' started.\nParameter :");

            System.out.println("The given 'Profile File' value in the beginning of the method : 'fileconftask0prof.conf'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarraabutt134.meth1PrivStatBool started.");

            File locaFileStat0=new File("fileconftask0prof.conf");

            if ((locaFileStat0.exists()==false)||(locaFileStat0.isFile()==false)||(locaFileStat0.canRead()==false)||(locaFileStat0.canWrite()==false)) {

                System.out.println("'False End Case' : The given 'Profile File' does not exist or it is not a file or it cannot be read or it cannot be written.");

                System.out.println("The given 'Profile File' status checker method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth1PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Profile File' status checker method.");

            System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarraabutt134.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Profile File' status checker method.");

            System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth1PrivStatBool' finished.");

            return false;}}

/*
Description:


    The given 'Fields' content length checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth2PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarraabutt134.meth2PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatJTexFielPosi111.getText()+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatJTexFielPosi121.getText()+"'.");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatJTexFielPosi131.getText()+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatJTexFielPosi113.getText()+"'.");

            System.out.println("The given 'SQL User Password' value in the beginning of the method : '"+String.valueOf(globProtStatJPasFielPosi133.getPassword())+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarraabutt134.meth2PrivStatBool started.");

            if ((globProtStatJPasFielPosi133.getPassword()==null)||(globProtStatJTexFielPosi111.getText()==null)||(globProtStatJTexFielPosi113.getText()==null)||(globProtStatJTexFielPosi121.getText()==null)||(globProtStatJTexFielPosi131.getText()==null)) {

                System.out.println("'False End Case' : At least one of the given 'Fields' content is null.");

                System.out.println("The given 'Fields' content length checker method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth2PrivStatBool' finished.");

                return false;}

            if ((globProtStatJPasFielPosi133.getPassword().length<16)||(globProtStatJTexFielPosi111.getText().length()<1)||(globProtStatJTexFielPosi113.getText().length()<1)||(globProtStatJTexFielPosi121.getText().length()<1)||(globProtStatJTexFielPosi131.getText().length()<1)) {

                System.out.println("'False End Case' : At least one of the given 'Fields' content has less length than the minimum.");

                System.out.println("The given 'Fields' content length checker method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth2PrivStatBool' finished.");

                return false;}

            if ((globProtStatJPasFielPosi133.getPassword().length>30)||(globProtStatJTexFielPosi111.getText().length()>120)||(globProtStatJTexFielPosi113.getText().length()>30)||(globProtStatJTexFielPosi121.getText().length()>5)||(globProtStatJTexFielPosi131.getText().length()>60)) {

                System.out.println("'False End Case' : At least one of the given 'Fields' content has more length than the maximum.");

                System.out.println("The given 'Fields' content length checker method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth2PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Fields' content length checker method.");

            System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth2PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarraabutt134.meth2PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Fields' content length checker method.");

            System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth2PrivStatBool' finished.");

            return false;}}

/*
Description :


    The input 'Fields' content 'Whitespace' checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth3PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarraabutt134.meth3PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatJTexFielPosi111.getText()+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatJTexFielPosi121.getText()+"'.");

            System.out.println("The given 'SQL Database Name' value in the beginning of the method : '"+globProtStatJTexFielPosi131.getText()+"'.");

            System.out.println("The given 'SQL Username' value in the beginning of the method : '"+globProtStatJTexFielPosi113.getText()+"'.");

            System.out.println("The given 'SQL User Password' value in the beginning of the method : '"+String.valueOf(globProtStatJPasFielPosi133.getPassword())+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarraabutt134.meth3PrivStatBool started.");

            boolean locaBoolStat1=false;

            char[] locaCharArraChec0=String.valueOf(globProtStatJPasFielPosi133.getPassword()).toCharArray();

            for(int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec0.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec0[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'SQL User Password' : '"+String.valueOf(globProtStatJPasFielPosi133.getPassword())+"' value contains at least a 'Whitespace' character.");

                System.out.println("The input 'Fields' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth3PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec1=globProtStatJTexFielPosi111.getText().toCharArray();

            for(int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec1.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec1[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'Host Name' : '"+globProtStatJTexFielPosi111.getText()+"' value contains at least a 'Whitespace' character.");

                System.out.println("The input 'Fields' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth3PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec2=globProtStatJTexFielPosi113.getText().toCharArray();

            for(int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec2.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec2[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'SQL Username' : '"+globProtStatJTexFielPosi113.getText()+"' value contains at least a 'Whitespace' character.");

                System.out.println("The input 'Fields' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth3PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec3=globProtStatJTexFielPosi121.getText().toCharArray();

            for(int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec3.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec3[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'Port Number' : '"+globProtStatJTexFielPosi121.getText()+"' value contains at least a 'Whitespace' character.");

                System.out.println("The input 'Fields' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth3PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec4=globProtStatJTexFielPosi131.getText().toCharArray();

            for(int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec4.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec4[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'SQL Database Name' : '"+globProtStatJTexFielPosi131.getText()+"' value contains at least a 'Whitespace' character.");

                System.out.println("The input 'Fields' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth3PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The input 'Fields' content 'Whitespace' checker method.");

            System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth3PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarraabutt134.meth3PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The input 'Fields' content 'Whitespace' checker method.");

            System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth3PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Port Number' field value content checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth4PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarraabutt134.meth4PrivStatBool' started.\nParameter :");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatJTexFielPosi121.getText()+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarraabutt134.meth4PrivStatBool started.");

            boolean locaBoolStat1=false;

            char[] locaCharArraChec0=globProtStatJTexFielPosi121.getText().toCharArray();

            for(int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec0.length;locaIntForCyclCoun0++) {

                if (Character.isDigit(locaCharArraChec0[locaIntForCyclCoun0])==false) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'Port Number' : '"+globProtStatJTexFielPosi121.getText()+"' value contains at least a character that is not a digit type.");

                System.out.println("The given 'Port Number' field value content checker method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth4PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Port Number' field value content checker method.");

            System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth4PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarraabutt134.meth4PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Port Number' field value content checker method.");

            System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth4PrivStatBool' finished.");

            return false;}}

/*
Description:


    The given 'Selected Profile' data saver as the given 'Selected Profile Number' to the given 'Profile File' method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth5PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarraabutt134.meth5PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Profile File' value in the beginning of the method : 'fileconftask0prof.conf'.");

            System.out.println("The given 'Selected Profile Number' value in the beginning of the method : '"+Integer.toString(globProtStatJComStriPosi163.getSelectedIndex())+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarraabutt134.meth5PrivStatBool started.");

            ArrayList<String> locaArraListStriNewFileCont0=new ArrayList<String>();

            boolean locaBoolProfUsed0=false;

            File locaFileStat0=new File("fileconftask0prof.conf");

            Scanner locaScanFile0=new Scanner(locaFileStat0);

            String locaStriEqua0="PROFILE:"+Integer.toString(globProtStatJComStriPosi163.getSelectedIndex());

            String locaStriReadRow0="";

            while (locaScanFile0.hasNextLine()) {

                locaStriReadRow0=locaScanFile0.nextLine();

                if (locaStriReadRow0.equals(locaStriEqua0)) {

                    System.out.println("The given 'Profile Number' : '"+Integer.toString(globProtStatJComStriPosi163.getSelectedIndex())+"' already existed in the 'fileconftask0prof.conf' file.");

                    locaBoolProfUsed0=true;

                    locaArraListStriNewFileCont0.add(locaStriReadRow0);

                    locaArraListStriNewFileCont0.add(globProtStatJTexFielPosi111.getText());

                    locaArraListStriNewFileCont0.add(globProtStatJTexFielPosi121.getText());

                    locaArraListStriNewFileCont0.add(globProtStatJTexFielPosi131.getText());

                    locaArraListStriNewFileCont0.add(globProtStatJTexFielPosi113.getText());

                    locaArraListStriNewFileCont0.add(Integer.toString(globProtStatJComStriPosi123.getSelectedIndex()));

                    locaArraListStriNewFileCont0.add(String.valueOf(globProtStatJPasFielPosi133.getPassword()));

                    for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<6;locaIntForCyclCoun0++) {

                        locaScanFile0.nextLine();}}

                else {

                    locaArraListStriNewFileCont0.add(locaStriReadRow0);}}

            locaScanFile0.close();

            if (locaBoolProfUsed0==true) {

                FileWriter locaFileWritStat0=new FileWriter("fileconftask0prof.conf",false);

                BufferedWriter locaBuffWritStat0=new BufferedWriter(locaFileWritStat0);

                for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaArraListStriNewFileCont0.size();locaIntForCyclCoun0++) {

                    locaBuffWritStat0.append(locaArraListStriNewFileCont0.get(locaIntForCyclCoun0));

                    locaBuffWritStat0.newLine();}

                locaBuffWritStat0.close();

                locaFileWritStat0.close();

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("INFO","The given 'Profile Number' : '"+Integer.toString(globProtStatJComStriPosi163.getSelectedIndex())+"'\nwas overridden.");    

                System.out.println("The given 'Profile Number' : '"+Integer.toString(globProtStatJComStriPosi163.getSelectedIndex())+"' was overridden.");

                System.out.println("'True End Case'.");

                System.out.println("The given 'Selected Profile' data saver as the given 'Selected Profile Number' to the given 'Profile File' method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth5PrivStatBool' finished.");

                return true;}

            else {

                System.out.println("The given 'Profile Number' : '"+Integer.toString(globProtStatJComStriPosi163.getSelectedIndex())+"' not existed in the 'fileconftask0prof.conf' file.");

                FileWriter locaFileWritStat0=new FileWriter("fileconftask0prof.conf",true);

                BufferedWriter locaBuffWritStat0=new BufferedWriter(locaFileWritStat0);

                locaBuffWritStat0.append("PROFILE:"+Integer.toString(globProtStatJComStriPosi163.getSelectedIndex()));

                locaBuffWritStat0.newLine();

                locaBuffWritStat0.append(globProtStatJTexFielPosi111.getText());

                locaBuffWritStat0.newLine();

                locaBuffWritStat0.append(globProtStatJTexFielPosi121.getText());

                locaBuffWritStat0.newLine();

                locaBuffWritStat0.append(globProtStatJTexFielPosi131.getText());

                locaBuffWritStat0.newLine();

                locaBuffWritStat0.append(globProtStatJTexFielPosi113.getText());

                locaBuffWritStat0.newLine();

                locaBuffWritStat0.append(Integer.toString(globProtStatJComStriPosi123.getSelectedIndex()));

                locaBuffWritStat0.newLine();

                locaBuffWritStat0.append(String.valueOf(globProtStatJPasFielPosi133.getPassword()));

                locaBuffWritStat0.newLine();

                locaBuffWritStat0.close();

                locaFileWritStat0.close();

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("INFO","The 'Profile' data has been saved as the given 'Profile Number' : '"+Integer.toString(globProtStatJComStriPosi163.getSelectedIndex())+"'\nto the 'fileconftask0prof.conf' file.");

                System.out.println("The 'Profile' data has been saved as the given 'Profile Number' : '"+Integer.toString(globProtStatJComStriPosi163.getSelectedIndex())+"' to the 'fileconftask0prof.conf' file.");

                System.out.println("'True End Case'.");

                System.out.println("The given 'Selected Profile' data saver as the given 'Selected Profile Number' to the given 'Profile File' method.");

                System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth5PrivStatBool' finished.");

                return true;}}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarraabutt134.meth5PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Selected Profile' data saver as the given 'Selected Profile Number' to the given 'Profile File' method.");

            System.out.println("The 'filejavamoduwindprocwindarraabutt134.meth5PrivStatBool' finished.");

            return false;}}}
