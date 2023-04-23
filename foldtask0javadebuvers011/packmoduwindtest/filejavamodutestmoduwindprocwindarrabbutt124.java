package packmoduwindtest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmoduwindcode.filejavamoduwindclaswindarraabcdefghijklmnbase;

import packmoduwindcode.filejavamoduwindprocwindarrabbutt124;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement b Button 124' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.


*/
public class filejavamodutestmoduwindprocwindarrabbutt124 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

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

        System.out.println("Variable initialiser method run for filejavamodutestmoduwindprocwindarrabbutt124.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt124.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt124.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindRetuPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindRetuPara0.clear();}

        globProtStatArraListStriModuWindRetuPara0.add("TestHostName");

        globProtStatArraListStriModuWindRetuPara0.add("1234");

        globProtStatArraListStriModuWindRetuPara0.add("TestSQLDatabaseName");

        globProtStatArraListStriModuWindRetuPara0.add("2023-01-27 01:02:03");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124.meth0PublStatBool();

        assertTrue(globBoolStat0);

        globProtStatArraListStriModuWindRetuPara0.clear();

        globBoolStat0=filejavamoduwindprocwindarrabbutt124.meth0PublStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt124.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt124.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindRetuPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindRetuPara0.clear();}

        globProtStatArraListStriModuWindRetuPara0.add("TestHostName");

        globProtStatArraListStriModuWindRetuPara0.add("1234");

        globProtStatArraListStriModuWindRetuPara0.add("TestSQLDatabaseName");

        globProtStatArraListStriModuWindRetuPara0.add("2023-01-27 01:02:03");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globProtStatArraListStriModuWindRetuPara0.clear();

        globBoolStat0=filejavamoduwindprocwindarrabbutt124.meth1PrivStatBool();

        assertTrue(globBoolStat0);}}
