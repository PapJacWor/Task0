package packmoduwindcode;

import java.nio.charset.StandardCharsets;

import java.security.MessageDigest;

import java.security.spec.KeySpec;

import java.util.Base64;

import javax.crypto.SecretKeyFactory;

import javax.crypto.spec.PBEKeySpec;

import packmoduloggcode.filejavamoduloggproclogg;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement b Button 124 And Button 134' process related methods.

    This class is part of the 'Window' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamoduwindprocwindarrabbutt124andbutt134 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

/*
Description :


    The 'Module Window Process Window Arrangement b Button 124 And Button 134' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarrabbutt124andbutt134.meth0PublStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarrabbutt124andbutt134.meth0PublStatBool started.");

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(0,"MWPWAbB124AB134 0/5");

            if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

                globProtStatArraListStriModuWindCallPara0.clear();}

            boolean globProtStatBoolStat0=false;

            globProtStatBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(20,"MWPWAbB124AB134 1/5");

            if (globProtStatBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Fields' contains at least one field value that length is not correct.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Fields' contains at least one field value that length is not correct.");

                System.out.println("\n'False End Case' : The given 'Fields' contains at least one field value that length is not correct.");

                System.out.println("The 'Module Window Process Window Arrangement b Button 124 And Button 134' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth0PublStatBool' finished.");

                return false;}

            globProtStatBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(40,"MWPWAbB124AB134 2/5");

            if (globProtStatBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Fields' contains at least one 'Whitespace' character.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Fields' contains at least one 'Whitespace' character.");

                System.out.println("\n'False End Case' : The given 'Fields' contains at least one 'Whitespace' character.");

                System.out.println("The 'Module Window Process Window Arrangement b Button 124 And Button 134' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth0PublStatBool' finished.");

                return false;}

            globProtStatBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth3PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(60,"MWPWAbB124AB134 3/5");

            if (globProtStatBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Port Number' : '"+globProtStatJTexFielPosi121.getText()+"'\ncontains at least one character that is not a digit type.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Port Number' : '"+globProtStatJTexFielPosi121.getText()+"' contains at least one character that is not a digit type.");

                System.out.println("\n'False End Case' : The given 'Port Number' : '"+globProtStatJTexFielPosi121.getText()+"' contains at least one character that is not a digit type.");

                System.out.println("The 'Module Window Process Window Arrangement b Button 124 And Button 134' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth0PublStatBool' finished.");

                return false;}

            globProtStatBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth4PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(80,"MWPWAbB124AB134 4/5");

            if (globProtStatBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Password' run into a problem during the hashing.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Password' run into a problem during the hashing.");

                System.out.println("\n'False End Case' : The given 'Password' run into a problem during the hashing.");

                System.out.println("The 'Module Window Process Window Arrangement b Button 124 And Button 134' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth0PublStatBool' finished.");

                return false;}

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(100,"MWPWAbB124AB134 5/5");

            System.out.println("\n'True End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement b Button 124 And Button 134' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth0PublStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarrabbutt124andbutt134.meth0PublStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement b Button 124 And Button 134' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth0PublStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Fields' content length checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth1PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatJTexFielPosi111.getText()+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatJTexFielPosi121.getText()+"'.");

            System.out.println("The given 'Pri. SQL Username' value in the beginning of the method : '"+globProtStatJTexFielPosi153.getText()+"'.");

            System.out.println("The given 'Pri. SQL User Password' value in the beginning of the method : '"+String.valueOf(globProtStatJPasFielPosi173.getPassword())+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool started.");

            if ((globProtStatJPasFielPosi173.getPassword()==null)||(globProtStatJTexFielPosi111.getText()==null)||(globProtStatJTexFielPosi121.getText()==null)||(globProtStatJTexFielPosi153.getText()==null)) {

                System.out.println("'False End Case' : At least one of the given 'Fields' content is null.");

                System.out.println("The input 'Fields' content length checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatJPasFielPosi173.getPassword().length<1)||(globProtStatJTexFielPosi111.getText().length()<1)||(globProtStatJTexFielPosi121.getText().length()<1)||(globProtStatJTexFielPosi153.getText().length()<1)) {

                System.out.println("'False End Case' : At least one of the given 'Fields' content has less length than the minimum.");

                System.out.println("The input 'Fields' content length checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatJPasFielPosi173.getPassword().length>30)||(globProtStatJTexFielPosi111.getText().length()>120)||(globProtStatJTexFielPosi121.getText().length()>5)||(globProtStatJTexFielPosi153.getText().length()>30)) {

                System.out.println("'False End Case' : At least one of the given 'Fields' content has more length than the maximum.");

                System.out.println("The input 'Fields' content length checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The input 'Fields' content length checker method.");

            System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The input 'Fields' content length checker method.");

            System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool' finished.");

            return false;}}

/*
Description :


    The input 'Fields' content 'Whitespace' checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth2PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatJTexFielPosi111.getText()+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatJTexFielPosi121.getText()+"'.");

            System.out.println("The given 'Pri. SQL Username' value in the beginning of the method : '"+globProtStatJTexFielPosi153.getText()+"'.");

            System.out.println("The given 'Pri. SQL User Password' value in the beginning of the method : '"+String.valueOf(globProtStatJPasFielPosi173.getPassword())+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool started.");

            boolean locaBoolStat1=false;

            char[] locaCharArraChec0=String.valueOf(globProtStatJPasFielPosi173.getPassword()).toCharArray();

            for(int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec0.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec0[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'Pri. SQL User Password' : '"+String.valueOf(globProtStatJPasFielPosi173.getPassword())+"' value contains at least a 'Whitespace' character.");

                System.out.println("The input 'Fields' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool' finished.");

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

                System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec2=globProtStatJTexFielPosi121.getText().toCharArray();

            for(int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec2.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec2[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'Port Number' : '"+globProtStatJTexFielPosi121.getText()+"' value contains at least a 'Whitespace' character.");

                System.out.println("The input 'Fields' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraChec3=globProtStatJTexFielPosi153.getText().toCharArray();

            for(int locaIntForCyclCoun0=0;locaIntForCyclCoun0<locaCharArraChec3.length;locaIntForCyclCoun0++) {

                if (Character.isWhitespace(locaCharArraChec3[locaIntForCyclCoun0])) {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'Pri. SQL Username' : '"+globProtStatJTexFielPosi153.getText()+"' value contains at least a 'Whitespace' character.");

                System.out.println("The input 'Fields' content 'Whitespace' checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The input 'Fields' content 'Whitespace' checker method.");

            System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The input 'Fields' content 'Whitespace' checker method.");

            System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool' finished.");

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

            System.out.println("\nThe 'filejavamoduwindprocwindarrabbutt124andbutt134.meth3PrivStatBool' started.\nParameter :");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatJTexFielPosi121.getText()+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarrabbutt124andbutt134.meth3PrivStatBool started.");

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

                System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth3PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Port Number' field value content checker method.");

            System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth3PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarrabbutt124andbutt134.meth3PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Port Number' field value content checker method.");

            System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth3PrivStatBool' finished.");

            return false;}}



/*
Description :


    The given 'Pri. User Password' hasher method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth4PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarrabbutt124andbutt134.meth4PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Host Name' value in the beginning of the method : '"+globProtStatJTexFielPosi111.getText()+"'.");

            System.out.println("The given 'Port Number' value in the beginning of the method : '"+globProtStatJTexFielPosi121.getText()+"'.");

            System.out.println("The given 'Pri. SQL Username' value in the beginning of the method : '"+globProtStatJTexFielPosi153.getText()+"'.");

            System.out.println("The given 'Pri. SQL User Password' value in the beginning of the method : '"+String.valueOf(globProtStatJPasFielPosi173.getPassword())+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarrabbutt124andbutt134.meth4PrivStatBool started.");

            globProtStatArraListStriModuWindCallPara0.add(globProtStatJTexFielPosi111.getText());

            globProtStatArraListStriModuWindCallPara0.add(globProtStatJTexFielPosi121.getText());

            globProtStatArraListStriModuWindCallPara0.add(globProtStatJTexFielPosi153.getText());

            if (globProtStatJComStriPosi163.getSelectedIndex()==0) {

                System.out.println("The 'PBKDF2' hashing type is selected.");

                String locaStriPassSaltToAdd0="f0065734b99e7920";

                byte[] locaByteArraSaltInByteArra0=locaStriPassSaltToAdd0.getBytes();

                KeySpec locaKeySpecSpec0=new PBEKeySpec(String.valueOf(globProtStatJPasFielPosi173.getPassword()).toCharArray(),locaByteArraSaltInByteArra0,512,512);

                SecretKeyFactory locaSecrKeyFactFactInst0=SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");

                byte[] locaByteArraHashInpuPass0=locaSecrKeyFactFactInst0.generateSecret(locaKeySpecSpec0).getEncoded();

                StringBuilder locaStriBuilOut0ForHash0=new StringBuilder();

                for (byte locaByteHashChar0 : locaByteArraHashInpuPass0) {

                    locaStriBuilOut0ForHash0.append(String.format("%x",locaByteHashChar0));}

                String locaStriEncoAndHashPass0=Base64.getEncoder().withoutPadding().encodeToString(locaStriBuilOut0ForHash0.toString().getBytes());

                char[] locaCharArraHashPass0=locaStriEncoAndHashPass0.toCharArray();

                StringBuilder locaStriBuilOut0=new StringBuilder();

                for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<30;locaIntForCyclCoun0++) {        

                    locaStriBuilOut0.append(locaCharArraHashPass0[locaIntForCyclCoun0]);}

                System.out.println("The 'Pri. SQL User Password Hashed' : '"+locaStriBuilOut0.toString()+"' value.");

                globProtStatArraListStriModuWindCallPara0.add(locaStriBuilOut0.toString());}

            else if (globProtStatJComStriPosi163.getSelectedIndex()==1) {

                System.out.println("The 'SHA3-512' hashing type is selected.");

                String locaStriPassSaltToAdd0="f0065734b99e7920";

                String locaStriSaltPass0=String.valueOf(globProtStatJPasFielPosi173.getPassword())+locaStriPassSaltToAdd0;

                MessageDigest locaMessDigeHashInst0=MessageDigest.getInstance("SHA3-512");

                byte[] locaByteArraHashInpuPass0=locaMessDigeHashInst0.digest(locaStriSaltPass0.getBytes(StandardCharsets.UTF_8));

                StringBuilder locaStriBuilForHash0=new StringBuilder();

                for (byte locaByteHashChar0 : locaByteArraHashInpuPass0) {

                    locaStriBuilForHash0.append(String.format("%x",locaByteHashChar0));}

                String locaStriEncoAndHashPass0=Base64.getEncoder().withoutPadding().encodeToString(locaStriBuilForHash0.toString().getBytes());

                char[] locaCharArraHashPass0=locaStriEncoAndHashPass0.toCharArray();

                StringBuilder locaStriBuilOut0=new StringBuilder();

                for (int locaIntForCyclCoun0=0;locaIntForCyclCoun0<30;locaIntForCyclCoun0++) {        

                    locaStriBuilOut0.append(locaCharArraHashPass0[locaIntForCyclCoun0]);}

                System.out.println("The 'Pri. SQL User Password Hashed' : '"+locaStriBuilOut0.toString()+"' value.");

                globProtStatArraListStriModuWindCallPara0.add(locaStriBuilOut0.toString());}

            else {

                System.out.println("The 'NONE' hashing type is selected.");

                System.out.println("The 'Pri. SQL User Password Unhashed' : '"+String.valueOf(globProtStatJPasFielPosi133.getPassword())+"' value.");

                globProtStatArraListStriModuWindCallPara0.add(String.valueOf(globProtStatJPasFielPosi173.getPassword()));}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Pri. User Password' hasher method.");

            System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth4PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarrabbutt124andbutt134.meth4PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Pri. User Password' hasher method.");

            System.out.println("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth4PrivStatBool' finished.");

            return false;}}}
