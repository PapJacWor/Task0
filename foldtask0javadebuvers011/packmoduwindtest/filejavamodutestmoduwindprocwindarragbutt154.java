package packmoduwindtest;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmoduwindcode.filejavamoduwindclaswindarraabcdefghijklmnbase;

import packmoduwindcode.filejavamoduwindprocwindarragbutt154;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement g Button 154' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmoduwindprocwindarragbutt154 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

/*
Description :


    The variable initialiser before the test methods method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    boolean globBoolStat0=false;

    @BeforeEach

    public void test0PublVoid() {

        System.out.println("Variable initialiser method run for filejavamodutestmoduwindprocwindarragbutt154.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamoduwindprocwindarragbutt154.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarragbutt154.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindCallPara0.clear();}

        globProtStatJTexFielPosi111.setText("TestCompName0");

        globProtStatJTexFielPosi113.setText("TestServName0");

        globProtStatJTexFielPosi121.setText("TestCompAddr0");

        globBoolStat0=filejavamoduwindprocwindarragbutt154.meth0PublStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);}

/*
Description :


    The 'filejavamoduwindprocwindarragbutt154.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarragbutt154.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        globProtStatJTexFielPosi111.setText(null);

        globProtStatJTexFielPosi113.setText("TestServName0");

        globProtStatJTexFielPosi121.setText("TestCompAddr0");

        globBoolStat0=filejavamoduwindprocwindarragbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJTexFielPosi111.setText("TestCompName0");

        globProtStatJTexFielPosi113.setText(null);

        globProtStatJTexFielPosi121.setText("TestCompAddr0");

        globBoolStat0=filejavamoduwindprocwindarragbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJTexFielPosi111.setText("TestCompName0");

        globProtStatJTexFielPosi113.setText("TestServName0");

        globProtStatJTexFielPosi121.setText(null);

        globBoolStat0=filejavamoduwindprocwindarragbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJTexFielPosi111.setText("");

        globProtStatJTexFielPosi113.setText("TestServName0");

        globProtStatJTexFielPosi121.setText("TestCompAddr0");

        globBoolStat0=filejavamoduwindprocwindarragbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJTexFielPosi111.setText("TestCompName0");

        globProtStatJTexFielPosi113.setText("");

        globProtStatJTexFielPosi121.setText("TestCompAddr0");

        globBoolStat0=filejavamoduwindprocwindarragbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJTexFielPosi111.setText("TestCompName0");

        globProtStatJTexFielPosi113.setText("TestServName0");

        globProtStatJTexFielPosi121.setText("");

        globBoolStat0=filejavamoduwindprocwindarragbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJTexFielPosi111.setText("aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllm");

        globProtStatJTexFielPosi113.setText("TestServName0");

        globProtStatJTexFielPosi121.setText("TestCompAddr0");

        globBoolStat0=filejavamoduwindprocwindarragbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJTexFielPosi111.setText("TestCompName0");

        globProtStatJTexFielPosi113.setText("aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllm");

        globProtStatJTexFielPosi121.setText("TestCompAddr0");

        globBoolStat0=filejavamoduwindprocwindarragbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJTexFielPosi111.setText("TestCompName0");

        globProtStatJTexFielPosi113.setText("TestServName0");

        globProtStatJTexFielPosi121.setText("aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllm");

        globBoolStat0=filejavamoduwindprocwindarragbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJTexFielPosi111.setText("TestCompName0");

        globProtStatJTexFielPosi113.setText("TestServName0");

        globProtStatJTexFielPosi121.setText("TestCompAddr0");

        globBoolStat0=filejavamoduwindprocwindarragbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarragbutt154.meth2PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarragbutt154.meth2PrivStatBool' method happy path test.")

    public void test3PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindCallPara0.clear();}

        globProtStatJTexFielPosi111.setText("TestCompName0");

        globProtStatJTexFielPosi113.setText("TesServName0");

        globProtStatJTexFielPosi121.setText("TestCompAddr0");

        globBoolStat0=filejavamoduwindprocwindarragbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarragbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);}}
