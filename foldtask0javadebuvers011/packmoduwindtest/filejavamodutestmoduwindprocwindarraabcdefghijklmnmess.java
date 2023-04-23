package packmoduwindtest;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmoduwindcode.filejavamoduwindclaswindarraabcdefghijklmnbase;

import packmoduwindcode.filejavamoduwindprocwindarraabcdefghijklmnmess;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement abcdefghijklmn Message' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmoduwindprocwindarraabcdefghijklmnmess extends filejavamoduwindclaswindarraabcdefghijklmnbase {

/*
Description :


    The 'Variable' initialiser before the test methods method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    boolean globBoolStat0=false;

    @BeforeEach

    public void test0PublVoid() {

        System.out.println("Variable initialiser method run for filejavamodutestmoduwindprocwindarraabcdefghijklmnmess.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        String locaStriPara0="INFO";

        String locaStriPara1="TestText0";

        locaStriPara0=null;

        locaStriPara1=null;

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool(locaStriPara0,locaStriPara1);

        assertFalse(globBoolStat0);

        locaStriPara0=null;

        locaStriPara1="TestText0";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool(locaStriPara0,locaStriPara1);

        assertFalse(globBoolStat0);

        locaStriPara0="INFO";

        locaStriPara1=null;

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool(locaStriPara0,locaStriPara1);

        assertFalse(globBoolStat0);

        locaStriPara0="";

        locaStriPara1="";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool(locaStriPara0,locaStriPara1);

        locaStriPara0=" ";

        locaStriPara1=" ";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool(locaStriPara0,locaStriPara1);

        assertFalse(globBoolStat0);

        assertFalse(globBoolStat0);

        locaStriPara0=" ";

        locaStriPara1="";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool(locaStriPara0,locaStriPara1);

        assertFalse(globBoolStat0);

        locaStriPara0="";

        locaStriPara1=" ";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool(locaStriPara0,locaStriPara1);

        assertFalse(globBoolStat0);

        locaStriPara0="INF";

        locaStriPara1="TestText0";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool(locaStriPara0,locaStriPara1);

        assertFalse(globBoolStat0);

        locaStriPara0="INFO";

        locaStriPara1="";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool(locaStriPara0,locaStriPara1);

        assertFalse(globBoolStat0);

        locaStriPara0="INFO";

        locaStriPara1="TestText0";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool(locaStriPara0,locaStriPara1);

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        String locaStriPara0="";

        String locaStriPara1="";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth1PrivStatBool(locaStriPara0,locaStriPara1);

        assertFalse(globBoolStat0);

        locaStriPara0=" ";

        locaStriPara1=" ";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth1PrivStatBool(locaStriPara0,locaStriPara1);

        assertFalse(globBoolStat0);

        locaStriPara0=" ";

        locaStriPara1="";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth1PrivStatBool(locaStriPara0,locaStriPara1);

        assertFalse(globBoolStat0);

        locaStriPara0="";

        locaStriPara1=" ";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth1PrivStatBool(locaStriPara0,locaStriPara1);

        assertFalse(globBoolStat0);

        locaStriPara0="INFO";

        locaStriPara1="TestText0";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth1PrivStatBool(locaStriPara0,locaStriPara1);

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth2PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth2PrivStatBool' method happy path test.")

    public void test3PublVoid() throws Exception {

        String locaStriPara0="INFO";

        String locaStriPara1="TestText0";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth1PrivStatBool(locaStriPara0,locaStriPara1);

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth2PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth3PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth3PrivStatBool' method happy path test.")

    public void test4PublVoid() throws Exception {

        String locaStriPara0="INFO";

        String locaStriPara1="TestText0";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth1PrivStatBool(locaStriPara0,locaStriPara1);

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globProtStatBoolThemChanPres0=false;

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globProtStatBoolThemChanPres0=true;

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth3PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth4PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabcdefghijklmnmess.meth4PrivStatBool' method happy path test.")

    public void test5PublVoid() throws Exception {

        String locaStriPara0="INFO";

        String locaStriPara1="TestText0";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth1PrivStatBool(locaStriPara0,locaStriPara1);

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth4PrivStatBool(locaStriPara0,locaStriPara1);

        assertTrue(globBoolStat0);

        locaStriPara0="ERROR";

        locaStriPara1="TestText0";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth1PrivStatBool(locaStriPara0,locaStriPara1);

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnmess.meth4PrivStatBool(locaStriPara0,locaStriPara1);

        assertTrue(globBoolStat0);}}
