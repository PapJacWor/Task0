package packmoduwindcode;

import java.awt.Dimension;

import java.awt.Font;

import javax.swing.JOptionPane;

import javax.swing.UIManager;

import javax.swing.plaf.ColorUIResource;

import packmoduloggcode.filejavamoduloggproclogg;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement abcdefghijklmn Message' process related methods.

    This class is part of the 'Window' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamoduwindprocwindarraabcdefghijklmnmess extends filejavamoduwindclaswindarraabcdefghijklmnbase {

/*
Description :


    The 'Module Window Process Window Arrangement abcdefghijklmn Message' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool(String locaStriPara0,String locaStriPara1) throws Exception {

        try {

            //System.out.println("\nThe 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool started.");

            if((locaStriPara0==null)||(locaStriPara1==null)) {

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","At least one of the given 'Parameters' is null.");

                System.out.println("'False End Case' : At least one of the given 'Parameters' is null.");

                System.out.println("The 'Module Window Process Window Arrangement abcdefghijklmn Message' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool' finished.");

                return false;}

            if ((locaStriPara0.isEmpty()==true)||(locaStriPara1.isEmpty()==true)) {

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","At least one of the given 'Parameters' is empty.");

                System.out.println("'False End Case' : At least one of the given 'Parameters' is empty.");

                System.out.println("The 'Module Window Process Window Arrangement abcdefghijklmn Message' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool' finished.");

                return false;}

            if ((locaStriPara0.length()<4)||(locaStriPara1.length()<1)) {

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","At least one of the given 'Parameters' length is inappropriate.");

                System.out.println("'False End Case' : At least one of the given 'Parameters' length is inappropriate.");

                System.out.println("The 'Module Window Process Window Arrangement abcdefghijklmn Message' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool' finished.");

                return false;}

            //System.out.println("Parameters :");

            //System.out.println("The 'Message Type' value in the beginning of the method : '"+locaStriPara0+"'.");

            //System.out.println("The 'Message Content' value in the beginning of the method : '"+locaStriPara1+"'.");

            boolean locaBoolStat0=false;

            locaBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth1PrivStatBool(locaStriPara0,locaStriPara1);

            if (locaBoolStat0==false) {

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","At least one of the 'Parameters' contains only 'Whitespace(s)'.");

                System.out.println("\n'False End Case' : At least one of the 'Parameters' contains only 'Whitespace(s)'.");

                System.out.println("The 'Module Window Process Window Arrangement abcdefghijklmn Message' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth2PrivStatBool();

            if (locaBoolStat0==false) {

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Message Window Minimum Size' cannot be setted or the 'Scale' value is undefined.");

                System.out.println("\n'False End Case' : The given 'Message Window Minimum Size' cannot be setted or the 'Scale' value is undefined.");

                System.out.println("The 'Module Window Process Window Arrangement abcdefghijklmn Message' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth3PrivStatBool();

            if (locaBoolStat0==false) {

                System.out.println("\n'Warning End Case' : The given 'Message Window Theme' cannot be setted.");

                System.out.println("The 'Module Window Process Window Arrangement abcdefghijklmn Message' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool' finished.");

                filejavamoduloggproclogg.meth0PublStatBool("WARNING","The given 'Message Window Theme' cannot be setted.");}

            locaBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth4PrivStatBool(locaStriPara0,locaStriPara1);

            if (locaBoolStat0==false) {

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Message Window Content' cannot be setted and displayed.");

                System.out.println("\n'False End Case' : The given 'Message Window Content' cannot be setted and displayed.");

                System.out.println("The 'Module Window Process Window Arrangement abcdefghijklmn Message' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool' finished.");

                return false;}

            //System.out.println("\n'True End Case.'");

            //System.out.println("The 'Module Window Process Window Arrangement abcdefghijklmn Message' process manager method.");

            //System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("\n'Exception End Case.'");

            System.out.println("The 'Module Window Process Window Arrangement abcdefghijklmn Message' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Parameters' content status checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth1PrivStatBool(String locaStriPara0,String locaStriPara1) throws Exception {

        try {

            //System.out.println("\nThe 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth1PrivStatBool' started.\nParameters :");

            //System.out.println("The given 'Log Level' value in the method beginning : '"+locaStriPara0+"'.");

            //System.out.println("The given 'Log Content' value in the method beginning : '"+locaStriPara1+"'.");

            if ((locaStriPara0.isBlank()==true)||(locaStriPara0.replaceAll("\\s","").length()<4)||(locaStriPara1.isBlank()==true)||(locaStriPara1.replaceAll("\\s","").length()<1)) {

                System.out.println("'False End Case' : At least one of the 'Parameters' contains only 'Whitespace(s)'.");

                System.out.println("The given 'Parameters' content status checker method.");

                System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth1PrivStatBool' finished.");

                return false;}

            //System.out.println("'True End Case'.");

            //System.out.println("The given 'Parameters' content status checker method.");

            //System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarraabcdefghijklmnmess.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Parameters' content status checker method.");

            System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth1PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Window Popup Minimum Message' size setter method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth2PrivStatBool() throws Exception {

        try {

            //System.out.println("\nThe 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth2PrivStatBool' started.");

            if (globProtStatIntScalMult0==0) {

                UIManager.put("OptionPane.minimumSize",new Dimension(400,100));

                //System.out.println("'True End Case'.");

                //System.out.println("The given 'Window Popup Minimum Message' size setter method.");

                //System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth2PrivStatBool' finished.");

                return true;}

            else if (globProtStatIntScalMult0==1) {

                UIManager.put("OptionPane.minimumSize",new Dimension(500,100));

                //System.out.println("'True End Case'.");

                //System.out.println("The given 'Window Popup Minimum Message' size setter method.");

                //System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth2PrivStatBool' finished.");

                return true;}

            else if (globProtStatIntScalMult0==2) {

                UIManager.put("OptionPane.minimumSize",new Dimension(600,100));

                //System.out.println("'True End Case'.");

                //System.out.println("The given 'Window Popup Minimum Message' size setter method.");

                //System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth2PrivStatBool' finished.");

                return true;}

            else if (globProtStatIntScalMult0==3) {

                UIManager.put("OptionPane.minimumSize",new Dimension(700,100));

                //System.out.println("'True End Case'.");

                //System.out.println("The given 'Window Popup Minimum Message' size setter method.");

                //System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth2PrivStatBool' finished.");

                return true;}

            System.out.println("'False End Case' : No match found for the given 'Scale' : '"+globProtStatIntScalMult0+"'.");

            System.out.println("The given 'Window Popup Minimum Message' size setter method.");

            System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth2PrivStatBool' finished.");

            return false;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarraabcdefghijklmnmess.meth2PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Window Popup Minimum Message' size setter method.");

            System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth2PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Window Popup Message' theme changer method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth3PrivStatBool() throws Exception {

        try {

            //System.out.println("\nThe 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth3PrivStatBool' started.\nParameter :");

            //System.out.println("The 'Theme Changer' value in the method beginning : '"+globProtStatBoolThemChanPres0+"'.");

            if (globProtStatBoolThemChanPres0==false) {

                UIManager.put("OptionPane.background",new ColorUIResource(200,200,200));

                UIManager.put("Panel.background",new ColorUIResource(200,200,200));

                UIManager.put("OptionPane.messageForeground",new ColorUIResource(5,5,5));

                UIManager.put("OptionPane.messageFont",new Font("Waree",Font.PLAIN,globProtStatIntFontSize0));}

            else {

                UIManager.put("OptionPane.background",new ColorUIResource(55,55,55));

                UIManager.put("Panel.background",new ColorUIResource(55,55,55));

                UIManager.put("OptionPane.messageForeground",new ColorUIResource(250,250,250));

                UIManager.put("OptionPane.messageFont",new Font("Waree",Font.PLAIN,globProtStatIntFontSize0));}

            //System.out.println("'True End Case'.");

            //System.out.println("The given 'Window Popup Message' theme changer method.");

            //System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth3PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarraabcdefghijklmnmess.meth3PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Window Popup Message' theme changer method.");

            System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth3PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Window Popup Message' content setter and displayer method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth4PrivStatBool(String locaStriPara0,String locaStriPara1) throws Exception {

        try {

            //System.out.println("\nThe 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth4PrivStatBool' started.\nParameters :");

            //System.out.println("The 'Message Type' value in the beginning of the method : '"+locaStriPara0+"'.");

            //System.out.println("The 'Message Content' value in the beginning of the method : '"+locaStriPara1+"'.");

            if (locaStriPara0.equals("ERROR")) {

                JOptionPane.showMessageDialog(null,locaStriPara1,"Task 0 ERROR Message",JOptionPane.PLAIN_MESSAGE);

                //System.out.println("'True End Case'.");

                //System.out.println("The given 'Window Popup Message' content setter and displayer method.");

                //System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth4PrivStatBool' finished.");

                return true;}

            else if (locaStriPara0.equals("INFO")) {

                JOptionPane.showMessageDialog(null,locaStriPara1,"Task 0 INFO Message",JOptionPane.PLAIN_MESSAGE);

                //System.out.println("'True End Case'.");

                //System.out.println("The given 'Window Popup Message' content setter and displayer method.");

                //System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth4PrivStatBool' finished.");

                return true;}

            System.out.println("'False End Case' : No match found for the given 'Message Type' : '"+locaStriPara0+"'.");

            System.out.println("The given 'Window Popup Message' content setter and displayer method.");

            System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth4PrivStatBool' finished.");

            return false;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarraabcdefghijklmnmess.meth4PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Window Popup Message' content setter and displayer method.");

            System.out.println("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth4PrivStatBool' finished.");

            return false;}}}
