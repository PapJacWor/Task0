package packmoduwindtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmoduwindcode.filejavamoduwindclaswindarraabcdefghijklmnbase;

import packmoduwindcode.filejavamoduwindprocwindarraabutt190;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement a Button 190' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmoduwindprocwindarraabutt190 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

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

        System.out.println("Variable initialiser method run for filejavamodutestmoduwindprocwindarraabutt190.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamoduwindprocwindarraabutt190.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabutt190.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindCallPara0.clear();}

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        if (globProtStatJComStriPosi123.getItemCount()>0) {

            globProtStatJComStriPosi123.removeAllItems();}

        globProtStatJComStriPosi123.addItem("PBKDF2");

        globProtStatJComStriPosi123.addItem("SHA3-512");

        globProtStatJComStriPosi123.addItem("NONE");

        globProtStatJComStriPosi123.setSelectedIndex(0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth0PublStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("NmJiYzFjZjllYmUzZDBkYTUzZDU5ZD",globProtStatArraListStriModuWindCallPara0.get(5));}

/*
Description :


    The 'filejavamoduwindprocwindarraabutt190.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabutt190.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText(null);

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText(null);

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText(null);

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText(null);

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText(null);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("aaaaaaaaaabbbbbbbbbbccccccccccd");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllm");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("aaaaaaaaaabbbbbbbbbbccccccccccd");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("aaaaaa");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffg");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarraabutt190.meth2PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabutt190.meth2PrivStatBool' method happy path test.")

    public void test3PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TestPassword1234 ");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234 ");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName ");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername ");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234 ");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName ");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth2PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarraabutt190.meth3PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabutt190.meth3PrivStatBool' method happy path test.")

    public void test4PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234a");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth3PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth3PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarraabutt190.meth4PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabutt190.meth4PrivStatBool' method happy path test.")

    public void test5PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindCallPara0.clear();}

        globProtStatJPasFielPosi133.setText("TestPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        if (globProtStatJComStriPosi123.getItemCount()>0) {

            globProtStatJComStriPosi123.removeAllItems();}

        globProtStatJComStriPosi123.addItem("PBKDF2");

        globProtStatJComStriPosi123.addItem("SHA3-512");

        globProtStatJComStriPosi123.addItem("NONE");

        globProtStatJComStriPosi123.setSelectedIndex(0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("NmJiYzFjZjllYmUzZDBkYTUzZDU5ZD",globProtStatArraListStriModuWindCallPara0.get(5));

        globProtStatArraListStriModuWindCallPara0.clear();

        globProtStatJComStriPosi123.setSelectedIndex(1);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("M2U1ZTM0OWM0ZGFiMjdhNzc5NzQ0Nj",globProtStatArraListStriModuWindCallPara0.get(5));

        globProtStatArraListStriModuWindCallPara0.clear();

        globProtStatJComStriPosi123.setSelectedIndex(2);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt190.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("TestPassword1234",globProtStatArraListStriModuWindCallPara0.get(5));}}
