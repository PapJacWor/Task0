package packmoduwindtest;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmoduwindcode.filejavamoduwindclaswindarraabcdefghijklmnbase;

import packmoduwindcode.filejavamoduwindprocwindarradbutt154;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement d Button 154' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmoduwindprocwindarradbutt154 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

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

        System.out.println("Variable initialiser method run for filejavamodutestmoduwindprocwindarradbutt154.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamoduwindprocwindarradbutt1540.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarradbutt1540.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindCallPara0.clear();}

        globProtStatJTexFielPosi111.setText("TestCompName0");

        globProtStatJTexFielPosi121.setText("TestCompAddr0");

        globBoolStat0=filejavamoduwindprocwindarradbutt154.meth0PublStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);}

/*
Description :


    The 'filejavamoduwindprocwindarradbutt1540.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarradbutt1540.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        globProtStatJTexFielPosi111.setText(null);

        globProtStatJTexFielPosi121.setText("TestCompAddr0");

        globBoolStat0=filejavamoduwindprocwindarradbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJTexFielPosi111.setText("TestCompName0");

        globProtStatJTexFielPosi121.setText(null);

        globBoolStat0=filejavamoduwindprocwindarradbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJTexFielPosi111.setText("");

        globProtStatJTexFielPosi121.setText("TestCompAddr0");

        globBoolStat0=filejavamoduwindprocwindarradbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJTexFielPosi111.setText("TestCompName0");

        globProtStatJTexFielPosi121.setText("");

        globBoolStat0=filejavamoduwindprocwindarradbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJTexFielPosi111.setText("aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllm");

        globProtStatJTexFielPosi121.setText("TestCompAddr0");

        globBoolStat0=filejavamoduwindprocwindarradbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJTexFielPosi111.setText("TestCompName0");

        globProtStatJTexFielPosi121.setText("aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllm");

        globBoolStat0=filejavamoduwindprocwindarradbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJTexFielPosi111.setText("TestCompName0");

        globProtStatJTexFielPosi121.setText("TestCompAddr0");

        globBoolStat0=filejavamoduwindprocwindarradbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarradbutt1540.meth2PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarradbutt1540.meth2PrivStatBool' method happy path test.")

    public void test3PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindCallPara0.clear();}

        globProtStatJTexFielPosi111.setText("TestCompName0");

        globProtStatJTexFielPosi121.setText("TestCompAddr0");

        globBoolStat0=filejavamoduwindprocwindarradbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarradbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);}}
