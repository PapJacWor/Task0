package packmoduwindtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmoduwindcode.filejavamoduwindclaswindarraabcdefghijklmnbase;

import packmoduwindcode.filejavamoduwindprocwindarraabcdefghijklmnprogbar004;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement abcdefghijklmn Progress Bar 004' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmoduwindprocwindarraabcdefghijklmnprogbar004 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

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

        System.out.println("Variable initialiser method run for filejavamodutestmoduwindprocwindarraabcdefghijklmnprogbar004.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        int locaIntPara0=0;

        String locaStrinPara0="TestText0";

        locaStrinPara0=null;

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(locaIntPara0,locaStrinPara0);

        assertFalse(globBoolStat0);

        locaIntPara0=0;

        locaStrinPara0="";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(locaIntPara0,locaStrinPara0);

        assertFalse(globBoolStat0);

        locaIntPara0=-1;

        locaStrinPara0="TestText0";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(locaIntPara0,locaStrinPara0);

        assertFalse(globBoolStat0);

        locaIntPara0=101;

        locaStrinPara0="TestText0";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(locaIntPara0,locaStrinPara0);

        assertFalse(globBoolStat0);

        locaIntPara0=0;

        locaStrinPara0="TestText0";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(locaIntPara0,locaStrinPara0);

        assertTrue(globBoolStat0);

        assertEquals(locaStrinPara0,globProtStatJLabPosi003.getText());

        assertEquals(locaIntPara0,globProtStatJProBarPosi004.getValue());}

/*
Description :


    The 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        String locaStrinPara0="TestText0";

        locaStrinPara0="";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth1PrivStatBool(locaStrinPara0);

        assertFalse(globBoolStat0);

        locaStrinPara0="     ";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth1PrivStatBool(locaStrinPara0);

        assertFalse(globBoolStat0);

        locaStrinPara0="TestText0";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth1PrivStatBool(locaStrinPara0);

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth2PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth2PrivStatBool' method happy path test.")

    public void test3PublVoid() throws Exception {

        int locaIntPara0=0;

        String locaStrinPara0="TestText0";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth1PrivStatBool(locaStrinPara0);

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth2PrivStatBool(locaIntPara0,locaStrinPara0);

        assertTrue(globBoolStat0);

        assertEquals(locaStrinPara0,globProtStatJLabPosi003.getText());

        assertEquals(locaIntPara0,globProtStatJProBarPosi004.getValue());}}
