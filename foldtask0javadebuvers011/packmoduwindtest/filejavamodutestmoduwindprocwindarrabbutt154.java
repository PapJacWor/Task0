package packmoduwindtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmoduwindcode.filejavamoduwindclaswindarraabcdefghijklmnbase;

import packmoduwindcode.filejavamoduwindprocwindarrabbutt154;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement b Button 154' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmoduwindprocwindarrabbutt154 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

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

        System.out.println("Variable initialiser method run for filejavamodutestmoduwindprocwindarrabbutt154.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt154.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt154.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindCallPara0.clear();}

        if (globProtStatJComStriPosi123.getItemCount()>0) {

            globProtStatJComStriPosi123.removeAllItems();}

        globProtStatJComStriPosi123.addItem("PBKDF2");

        globProtStatJComStriPosi123.addItem("SHA3-512");

        globProtStatJComStriPosi123.addItem("NONE");

        globProtStatJComStriPosi123.setSelectedIndex(0);

        if (globProtStatJComStriPosi163.getItemCount()>0) {

            globProtStatJComStriPosi163.removeAllItems();}

        globProtStatJComStriPosi163.addItem("PBKDF2");

        globProtStatJComStriPosi163.addItem("SHA3-512");

        globProtStatJComStriPosi163.addItem("NONE");

        globProtStatJComStriPosi163.setSelectedIndex(0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth0PublStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText(null);

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText(null);

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText(null);

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText(null);

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText(null);

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText(null);

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText(null);

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText(null);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("aaaaaaaaaabbbbbbbbbbccccccccccd");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("aaaaaaaaaabbbbbbbbbbccccccccccd");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("aaaaaaaaaabbbbbbbbbbccccccccccd");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllm");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("aaaaaaaaaabbbbbbbbbbccccccccccd");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("aaaaaa");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffg");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("aaaaaaaaaabbbbbbbbbbccccccccccd");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool' method happy path test.")

    public void test3PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234 ");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234 ");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234 ");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName ");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername ");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234 ");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName ");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername ");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool' method happy path test.")

    public void test4PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234a");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt154.meth4PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt154.meth4PrivStatBool' method happy path test.")

    public void test5PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword123");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth4PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt154.meth5PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt154.meth5PrivStatBool' method happy path test.")

    public void test6PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPasswordtest");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPasswordtest");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth5PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt154.meth6PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt154.meth6PrivStatBool' method happy path test.")

    public void test7PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("01234567890123456789");

        globProtStatJPasFielPosi143.setText("01234567890123456789");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth6PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt154.meth7PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt154.meth7PrivStatBool' method happy path test.")

    public void test8PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("testnewsqluserpassword1234");

        globProtStatJPasFielPosi143.setText("testnewsqluserpassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth7PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt154.meth8PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt154.meth8PrivStatBool' method happy path test.")

    public void test9PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TESTNEWSQLUSERPASSWORD1234");

        globProtStatJPasFielPosi143.setText("TESTNEWSQLUSERPASSWORD1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth8PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth8PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt154.meth9PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt154.meth9PrivStatBool' method happy path test.")

    public void test10PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindCallPara0.clear();}

        if (globProtStatJComStriPosi123.getItemCount()>0) {

            globProtStatJComStriPosi123.removeAllItems();}

        globProtStatJComStriPosi123.addItem("PBKDF2");

        globProtStatJComStriPosi123.addItem("SHA3-512");

        globProtStatJComStriPosi123.addItem("NONE");

        globProtStatJComStriPosi123.setSelectedIndex(0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth8PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth9PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("NDhhNWRmOWJhMTg4YzU4MWRmZDM4MD",globProtStatArraListStriModuWindCallPara0.get(5));

        globProtStatArraListStriModuWindCallPara0.clear();

        globProtStatJComStriPosi123.setSelectedIndex(1);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth8PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth9PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("ZjE5NTY4OGI4YTBmZjkyODRmNjM4Zj",globProtStatArraListStriModuWindCallPara0.get(5));

        globProtStatArraListStriModuWindCallPara0.clear();

        globProtStatJComStriPosi123.setSelectedIndex(2);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth8PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth9PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("TestNewSQLUserPassword1234",globProtStatArraListStriModuWindCallPara0.get(5));

        globProtStatArraListStriModuWindCallPara0.clear();}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt154.meth10PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt154.meth10PrivStatBool' method happy path test.")

    public void test11PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindCallPara0.clear();}

        if (globProtStatJComStriPosi123.getItemCount()>0) {

            globProtStatJComStriPosi123.removeAllItems();}

        globProtStatJComStriPosi123.addItem("PBKDF2");

        globProtStatJComStriPosi123.addItem("SHA3-512");

        globProtStatJComStriPosi123.addItem("NONE");

        globProtStatJComStriPosi123.setSelectedIndex(0);

        if (globProtStatJComStriPosi163.getItemCount()>0) {

            globProtStatJComStriPosi163.removeAllItems();}

        globProtStatJComStriPosi163.addItem("PBKDF2");

        globProtStatJComStriPosi163.addItem("SHA3-512");

        globProtStatJComStriPosi163.addItem("NONE");

        globProtStatJComStriPosi163.setSelectedIndex(0);

        globProtStatJPasFielPosi133.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestNewSQLUserPassword1234");

        globProtStatJPasFielPosi173.setText("TestPriSQLUserPassword1234");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestNewSQLUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestNewSQLDatabaseName");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsername");

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth8PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth9PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth10PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("NDhhNWRmOWJhMTg4YzU4MWRmZDM4MD",globProtStatArraListStriModuWindCallPara0.get(5));

        assertEquals("Njg0YWU2MTg0ZmJhMWQ5ODMwMjA2MW",globProtStatArraListStriModuWindCallPara0.get(8));

        globProtStatArraListStriModuWindCallPara0.clear();

        globProtStatJComStriPosi123.setSelectedIndex(1);

        globProtStatJComStriPosi163.setSelectedIndex(1);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth8PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth9PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth10PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("ZjE5NTY4OGI4YTBmZjkyODRmNjM4Zj",globProtStatArraListStriModuWindCallPara0.get(5));

        assertEquals("ZTgyMmFjNjJjZmJlNjRhNDYzYzZlZG",globProtStatArraListStriModuWindCallPara0.get(8));

        globProtStatArraListStriModuWindCallPara0.clear();

        globProtStatJComStriPosi123.setSelectedIndex(2);

        globProtStatJComStriPosi163.setSelectedIndex(2);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth8PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth9PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt154.meth10PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("TestNewSQLUserPassword1234",globProtStatArraListStriModuWindCallPara0.get(5));

        assertEquals("TestPriSQLUserPassword1234",globProtStatArraListStriModuWindCallPara0.get(8));

        globProtStatArraListStriModuWindCallPara0.clear();}}
