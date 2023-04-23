package packmoduwindtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmoduwindcode.filejavamoduwindclaswindarraabcdefghijklmnbase;

import packmoduwindcode.filejavamoduwindprocwindarraabcdefghijklmnbutt114;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement abcdefghijklmn Button 114' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmoduwindprocwindarraabcdefghijklmnbutt114 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

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

        System.out.println("Variable initialiser method run for filejavamodutestmoduwindprocwindarraabcdefghijklmnbutt114.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TestText00");

        globProtStatJPasFielPosi143.setText("TestText00");

        globProtStatJPasFielPosi173.setText("TestText00");

        globProtStatJTexFielPosi111.setText("TestText00");

        globProtStatJTexFielPosi113.setText("TestText00");

        globProtStatJTexFielPosi121.setText("TestText00");

        globProtStatJTexFielPosi123.setText("TestText00");

        globProtStatJTexFielPosi131.setText("TestText00");

        globProtStatJTexFielPosi133.setText("TestText00");

        globProtStatJTexFielPosi143.setText("TestText00");

        globProtStatJTexFielPosi153.setText("TestText00");

        globProtStatJTexFielPosi163.setText("TestText00");

        globProtStatStriCurrWind0="o";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth0PublStatBool();

        assertFalse(globBoolStat0);

        globProtStatStriCurrWind0="a";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth0PublStatBool();

        assertTrue(globBoolStat0);

        assertEquals("",String.valueOf(globProtStatJPasFielPosi133.getPassword()));

        assertEquals("",globProtStatJTexFielPosi111.getText());

        assertEquals("",globProtStatJTexFielPosi113.getText());

        assertEquals("",globProtStatJTexFielPosi121.getText());

        assertEquals("",globProtStatJTexFielPosi131.getText());}

/*
Description :


    The 'filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TestText00");

        globProtStatJPasFielPosi143.setText("TestText00");

        globProtStatJPasFielPosi173.setText("TestText00");

        globProtStatJTexFielPosi111.setText("TestText00");

        globProtStatJTexFielPosi113.setText("TestText00");

        globProtStatJTexFielPosi121.setText("TestText00");

        globProtStatJTexFielPosi123.setText("TestText00");

        globProtStatJTexFielPosi131.setText("TestText00");

        globProtStatJTexFielPosi133.setText("TestText00");

        globProtStatJTexFielPosi143.setText("TestText00");

        globProtStatJTexFielPosi153.setText("TestText00");

        globProtStatJTexFielPosi163.setText("TestText00");

        globProtStatStriCurrWind0=null;

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatStriCurrWind0="o";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatStriCurrWind0="a";

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        assertEquals("",String.valueOf(globProtStatJPasFielPosi133.getPassword()));

        assertEquals("",globProtStatJTexFielPosi111.getText());

        assertEquals("",globProtStatJTexFielPosi113.getText());

        assertEquals("",globProtStatJTexFielPosi121.getText());

        assertEquals("",globProtStatJTexFielPosi131.getText());

        globProtStatStriCurrWind0="b";

        globProtStatJPasFielPosi133.setText("TestText0");

        globProtStatJPasFielPosi143.setText("TestText0");

        globProtStatJPasFielPosi173.setText("TestText0");

        globProtStatJTexFielPosi111.setText("TestText0");

        globProtStatJTexFielPosi113.setText("TestText0");

        globProtStatJTexFielPosi121.setText("TestText0");

        globProtStatJTexFielPosi131.setText("TestText0");

        globProtStatJTexFielPosi153.setText("TestText0");

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        assertEquals("",String.valueOf(globProtStatJPasFielPosi133.getPassword()));

        assertEquals("",String.valueOf(globProtStatJPasFielPosi143.getPassword()));

        assertEquals("",String.valueOf(globProtStatJPasFielPosi173.getPassword()));

        assertEquals("",globProtStatJTexFielPosi111.getText());

        assertEquals("",globProtStatJTexFielPosi113.getText());

        assertEquals("",globProtStatJTexFielPosi121.getText());

        assertEquals("",globProtStatJTexFielPosi131.getText());

        assertEquals("",globProtStatJTexFielPosi153.getText());

        globProtStatStriCurrWind0="c";

        globProtStatJTexFielPosi111.setText("TestText0");

        globProtStatJTexFielPosi113.setText("TestText0");

        globProtStatJTexFielPosi121.setText("TestText0");

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        assertEquals("",globProtStatJTexFielPosi111.getText());

        assertEquals("",globProtStatJTexFielPosi113.getText());

        assertEquals("",globProtStatJTexFielPosi121.getText());

        globProtStatStriCurrWind0="d";

        globProtStatJTexFielPosi111.setText("TestText0");

        globProtStatJTexFielPosi121.setText("TestText0");

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        assertEquals("",globProtStatJTexFielPosi111.getText());

        assertEquals("",globProtStatJTexFielPosi121.getText());

        globProtStatStriCurrWind0="e";

        globProtStatJTexFielPosi111.setText("TestText0");

        globProtStatJTexFielPosi113.setText("TestText0");

        globProtStatJTexFielPosi121.setText("TestText0");

        globProtStatJTexFielPosi123.setText("TestText0");

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        assertEquals("",globProtStatJTexFielPosi111.getText());

        assertEquals("",globProtStatJTexFielPosi113.getText());

        assertEquals("",globProtStatJTexFielPosi121.getText());

        assertEquals("",globProtStatJTexFielPosi123.getText());

        globProtStatStriCurrWind0="f";

        globProtStatJTexFielPosi111.setText("TestText0");

        globProtStatJTexFielPosi113.setText("TestText0");

        globProtStatJTexFielPosi121.setText("TestText0");

        globProtStatJTexFielPosi123.setText("TestText0");

        globProtStatJTexFielPosi133.setText("TestText0");

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        assertEquals("",globProtStatJTexFielPosi111.getText());

        assertEquals("",globProtStatJTexFielPosi113.getText());

        assertEquals("",globProtStatJTexFielPosi121.getText());

        assertEquals("",globProtStatJTexFielPosi123.getText());

        assertEquals("",globProtStatJTexFielPosi133.getText());

        globProtStatStriCurrWind0="g";

        globProtStatJTexFielPosi111.setText("TestText0");

        globProtStatJTexFielPosi113.setText("TestText0");

        globProtStatJTexFielPosi121.setText("TestText0");

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        assertEquals("",globProtStatJTexFielPosi111.getText());

        assertEquals("",globProtStatJTexFielPosi113.getText());

        assertEquals("",globProtStatJTexFielPosi121.getText());

        globProtStatStriCurrWind0="h";

        globProtStatJTexFielPosi111.setText("TestText0");

        globProtStatJTexFielPosi113.setText("TestText0");

        globProtStatJTexFielPosi121.setText("TestText0");

        globProtStatJTexFielPosi123.setText("TestText0");

        globProtStatJTexFielPosi133.setText("TestText0");

        globProtStatJTexFielPosi143.setText("TestText0");

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        assertEquals("",globProtStatJTexFielPosi111.getText());

        assertEquals("",globProtStatJTexFielPosi113.getText());

        assertEquals("",globProtStatJTexFielPosi121.getText());

        assertEquals("",globProtStatJTexFielPosi123.getText());

        assertEquals("",globProtStatJTexFielPosi133.getText());

        assertEquals("",globProtStatJTexFielPosi143.getText());

        globProtStatStriCurrWind0="i";

        globProtStatJTexFielPosi111.setText("TestText0");

        globProtStatJTexFielPosi113.setText("TestText0");

        globProtStatJTexFielPosi121.setText("TestText0");

        globProtStatJTexFielPosi123.setText("TestText0");

        globProtStatJTexFielPosi131.setText("TestText0");

        globProtStatJTexFielPosi133.setText("TestText0");

        globProtStatJTexFielPosi143.setText("TestText0");

        globProtStatJTexFielPosi153.setText("TestText0");

        globProtStatJTexFielPosi163.setText("TestText0");

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        assertEquals("",globProtStatJTexFielPosi111.getText());

        assertEquals("",globProtStatJTexFielPosi113.getText());

        assertEquals("",globProtStatJTexFielPosi121.getText());

        assertEquals("",globProtStatJTexFielPosi123.getText());

        assertEquals("",globProtStatJTexFielPosi133.getText());

        assertEquals("",globProtStatJTexFielPosi143.getText());

        assertEquals("",globProtStatJTexFielPosi153.getText());

        assertEquals("",globProtStatJTexFielPosi163.getText());

        globProtStatStriCurrWind0="j";

        globProtStatJTexFielPosi111.setText("TestText0");

        globProtStatJTexFielPosi113.setText("TestText0");

        globProtStatJTexFielPosi121.setText("TestText0");

        globProtStatJTexFielPosi123.setText("TestText0");

        globProtStatJTexFielPosi133.setText("TestText0");

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        assertEquals("",globProtStatJTexFielPosi111.getText());

        assertEquals("",globProtStatJTexFielPosi113.getText());

        assertEquals("",globProtStatJTexFielPosi121.getText());

        assertEquals("",globProtStatJTexFielPosi123.getText());

        assertEquals("",globProtStatJTexFielPosi133.getText());

        globProtStatStriCurrWind0="k";

        globProtStatJTexFielPosi111.setText("TestText0");

        globProtStatJTexFielPosi113.setText("TestText0");

        globProtStatJTexFielPosi121.setText("TestText0");

        globProtStatJTexFielPosi123.setText("TestText0");

        globProtStatJTexFielPosi133.setText("TestText0");

        globProtStatJTexFielPosi143.setText("TestText0");

        globProtStatJTexFielPosi153.setText("TestText0");

        globProtStatJTexFielPosi163.setText("TestText0");

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        assertEquals("",globProtStatJTexFielPosi111.getText());

        assertEquals("",globProtStatJTexFielPosi113.getText());

        assertEquals("",globProtStatJTexFielPosi121.getText());

        assertEquals("",globProtStatJTexFielPosi123.getText());

        assertEquals("",globProtStatJTexFielPosi133.getText());

        assertEquals("",globProtStatJTexFielPosi143.getText());

        assertEquals("",globProtStatJTexFielPosi153.getText());

        assertEquals("",globProtStatJTexFielPosi163.getText());

        globProtStatStriCurrWind0="l";

        globProtStatJPasFielPosi133.setText("TestText0");

        globProtStatJPasFielPosi143.setText("TestText0");

        globProtStatJTexFielPosi113.setText("TestText0");

        globProtStatJTexFielPosi153.setText("TestText0");

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth1PrivStatBool();

        assertEquals("",String.valueOf(globProtStatJPasFielPosi133.getPassword()));

        assertEquals("",String.valueOf(globProtStatJPasFielPosi143.getPassword()));

        assertEquals("",globProtStatJTexFielPosi113.getText());

        assertEquals("",globProtStatJTexFielPosi153.getText());

        assertTrue(globBoolStat0);

        globProtStatStriCurrWind0="m";

        globProtStatJTexFielPosi113.setText("TestText0");

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        assertEquals("",globProtStatJTexFielPosi113.getText());

        globProtStatStriCurrWind0="n";

        globProtStatJPasFielPosi133.setText("TestText0");

        globProtStatJPasFielPosi143.setText("TestText0");

        globProtStatJTexFielPosi113.setText("TestText0");

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmnbutt114.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        assertEquals("",String.valueOf(globProtStatJPasFielPosi133.getPassword()));

        assertEquals("",String.valueOf(globProtStatJPasFielPosi143.getPassword()));

        assertEquals("",globProtStatJTexFielPosi113.getText());}}
