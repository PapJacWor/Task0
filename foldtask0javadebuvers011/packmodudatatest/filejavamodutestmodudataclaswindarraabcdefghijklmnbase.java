package packmodudatatest;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmodudatacode.filejavamodudataclaswindarraabcdefghijklmnbase;

/*
Description :


    This is the class for the 'Base Database Class' related global variables test method.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmodudataclaswindarraabcdefghijklmnbase extends filejavamodudataclaswindarraabcdefghijklmnbase {

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

        System.out.println("Variable initialiser method run for filejavamodutestmodudataclaswindarraabcdefghijklmnbase.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamodudataclaswindarraabcdefghijklmnbase' class happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamodudataclaswindarraabcdefghijklmnbase' class happy path test.")

    public void test1PublVoid() throws Exception {

        if (globProtStatArraListStriModuDataRecePara0==null) {

            globBoolStat0=false;

            assertFalse(globBoolStat0);}

        if (globProtStatArraListStriModuDataRetuPara0==null) {

            globBoolStat0=false;

            assertFalse(globBoolStat0);}

        if (globProtStatConnCrea0==null) {

            globBoolStat0=false;

            assertFalse(globBoolStat0);}

        if (globProtStatStatSQLCommExec0==null) {

            globBoolStat0=false;

            assertFalse(globBoolStat0);}

        if (globProtStatResuSetQuerResu0==null) {

            globBoolStat0=false;

            assertFalse(globBoolStat0);}

        if (globProtStatStriSQLComm0==null) {

            globBoolStat0=false;

            assertFalse(globBoolStat0);}}}
