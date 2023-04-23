package packmoduloggtest;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmoduloggcode.filejavamoduloggproclogg;

/*
Description :


    This is the class for the 'Module Logging Process Logging' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmoduloggproclogg {

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

        System.out.println("Variable initialiser method run for filejavamodutestmoduloggproclogg.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamoduloggproclogg.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduloggproclogg.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        String locaStriPara0=null;

        String locaStriPara1=null;

        String locaStriPara2="INFO";

        String locaStriPara3="TestText0";

        globBoolStat0=filejavamoduloggproclogg.meth0PublStatBool(locaStriPara0,locaStriPara2);

        assertFalse(globBoolStat0);

        globBoolStat0=filejavamoduloggproclogg.meth0PublStatBool(locaStriPara2,locaStriPara1);

        assertFalse(globBoolStat0);

        locaStriPara2="";

        locaStriPara3="";

        globBoolStat0=filejavamoduloggproclogg.meth0PublStatBool(locaStriPara2,locaStriPara3);

        assertFalse(globBoolStat0);

        locaStriPara2="INF";

        locaStriPara3="";

        globBoolStat0=filejavamoduloggproclogg.meth0PublStatBool(locaStriPara2,locaStriPara3);

        assertFalse(globBoolStat0);

        locaStriPara2="WARNINGa";

        locaStriPara3="TestText0";

        globBoolStat0=filejavamoduloggproclogg.meth0PublStatBool(locaStriPara2,locaStriPara3);

        assertFalse(globBoolStat0);

        locaStriPara2="INFO";

        locaStriPara3="TestText0";

        globBoolStat0=filejavamoduloggproclogg.meth0PublStatBool(locaStriPara2,locaStriPara3);

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduloggproclogg.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduloggproclogg.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        String locaStriPara0="";

        String locaStriPara1="";

        globBoolStat0=filejavamoduloggproclogg.meth1PrivStatBool(locaStriPara0,locaStriPara1);

        assertFalse(globBoolStat0);

        locaStriPara0="    ";

        locaStriPara1="TestText0 ";

        globBoolStat0=filejavamoduloggproclogg.meth1PrivStatBool(locaStriPara0,locaStriPara1);

        assertFalse(globBoolStat0);

        locaStriPara0="INFO";

        locaStriPara1="    ";

        globBoolStat0=filejavamoduloggproclogg.meth1PrivStatBool(locaStriPara0,locaStriPara1);

        assertFalse(globBoolStat0);

        locaStriPara0="INFO";

        locaStriPara1="TestText0";

        globBoolStat0=filejavamoduloggproclogg.meth1PrivStatBool(locaStriPara0,locaStriPara1);

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduloggproclogg.meth2PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduloggproclogg.meth2PrivStatBool' method happy path test.")

    public void test3PublVoid() throws Exception {

        String locaStriPara0="INFO";

        String locaStriPara1="TestText0";

        globBoolStat0=filejavamoduloggproclogg.meth1PrivStatBool(locaStriPara0,locaStriPara1);

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduloggproclogg.meth2PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduloggproclogg.meth3PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduloggproclogg.meth3PrivStatBool' method happy path test.")

    public void test4PublVoid() throws Exception {

        String locaStriPara0="NONE";

        String locaStriPara1="TestText0";

        globBoolStat0=filejavamoduloggproclogg.meth1PrivStatBool(locaStriPara0,locaStriPara1);

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduloggproclogg.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduloggproclogg.meth3PrivStatBool(locaStriPara0,locaStriPara1);

        assertFalse(globBoolStat0);

        locaStriPara0="ERROR";

        locaStriPara1="TestText0";

        globBoolStat0=filejavamoduloggproclogg.meth1PrivStatBool(locaStriPara0,locaStriPara1);

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduloggproclogg.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduloggproclogg.meth3PrivStatBool(locaStriPara0,locaStriPara1);

        assertTrue(globBoolStat0);

        locaStriPara0="ERROR";

        locaStriPara1="TestText0";

        globBoolStat0=filejavamoduloggproclogg.meth1PrivStatBool(locaStriPara0,locaStriPara1);

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduloggproclogg.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduloggproclogg.meth3PrivStatBool(locaStriPara0,locaStriPara1);

        assertTrue(globBoolStat0);

        locaStriPara0="INDENT";

        locaStriPara1="TestText0";

        globBoolStat0=filejavamoduloggproclogg.meth1PrivStatBool(locaStriPara0,locaStriPara1);

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduloggproclogg.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduloggproclogg.meth3PrivStatBool(locaStriPara0,locaStriPara1);

        assertTrue(globBoolStat0);

        locaStriPara0="WARNING";

        locaStriPara1="TestText0";

        globBoolStat0=filejavamoduloggproclogg.meth1PrivStatBool(locaStriPara0,locaStriPara1);

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduloggproclogg.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduloggproclogg.meth3PrivStatBool(locaStriPara0,locaStriPara1);

        assertTrue(globBoolStat0);}}
