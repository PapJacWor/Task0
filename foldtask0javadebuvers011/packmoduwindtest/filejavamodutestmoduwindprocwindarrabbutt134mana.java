package packmoduwindtest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmoduwindcode.filejavamoduwindclaswindarraabcdefghijklmnbase;

import packmoduwindcode.filejavamoduwindprocwindarrabbutt134mana;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement b Button 134 Manager' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmoduwindprocwindarrabbutt134mana extends filejavamoduwindclaswindarraabcdefghijklmnbase {

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

        System.out.println("Variable initialiser method run for filejavamodutestmoduwindprocwindarrabbutt134mana.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt134mana.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt134mana.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindCallPara0.clear();}

        if (globProtStatArraListStriModuWindRetuPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindRetuPara0.clear();}

        globProtStatArraListStriModuWindCallPara0.add("TestHostName");

        globProtStatArraListStriModuWindCallPara0.add("TestSQLDatabaseName");

        globProtStatArraListStriModuWindCallPara0.add("TestPri.Username");

        globProtStatArraListStriModuWindCallPara0.add("TestPri.Password123");

        globBoolStat0=filejavamoduwindprocwindarrabbutt134mana.meth0PublStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        globProtStatJTexFielPosi131.setText("TestSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt134mana.meth0PublStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt134mana.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt134mana.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindCallPara0.clear();}

        if (globProtStatArraListStriModuWindRetuPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindRetuPara0.clear();}

        globProtStatArraListStriModuWindCallPara0.add("TestHostName");

        globProtStatArraListStriModuWindCallPara0.add("TestSQLDatabaseName");

        globProtStatArraListStriModuWindCallPara0.add("TestPri.Username");

        globProtStatArraListStriModuWindCallPara0.add("TestPri.Password123");

        globBoolStat0=filejavamoduwindprocwindarrabbutt134mana.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globProtStatJTexFielPosi131.setText("TestSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt134mana.meth1PrivStatBool();

        assertTrue(globBoolStat0);}}
