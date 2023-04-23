package packmoduwindtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmoduwindcode.filejavamoduwindclaswindarraabcdefghijklmnbase;

import packmoduwindcode.filejavamoduwindprocwindarralbutt154;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement l Button 154' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmoduwindprocwindarralbutt154 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

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

        System.out.println("Variable initialiser method run for filejavamodutestmoduwindprocwindarralbutt154.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamoduwindprocwindarralbutt154.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarralbutt154.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindCallPara0.clear();}

        if (globProtStatJComStriPosi123.getItemCount()>0) {

            globProtStatJComStriPosi123.removeAllItems();}

        globProtStatJComStriPosi123.addItem("PBKDF2");

        globProtStatJComStriPosi123.addItem("SHA3-512");

        globProtStatJComStriPosi123.addItem("NONE");

        globProtStatJComStriPosi123.setSelectedIndex(0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth0PublStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);}

/*
Description :


    The 'filejavamoduwindprocwindarralbutt154.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarralbutt154.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText(null);

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText(null);

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText(null);

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText(null);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("aaaaaaaaaabbbbbbbbbbccccccccccd");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("aaaaaaaaaabbbbbbbbbbccccccccccd");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("aaaaaaaaaabbbbbbbbbbccccccccccd");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("aaaaaaa");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarralbutt154.meth2PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarralbutt154.meth2PrivStatBool' method happy path test.")

    public void test3PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234 ");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234 ");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername ");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Maste ");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarralbutt154.meth3PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarralbutt154.meth3PrivStatBool' method happy path test.")

    public void test4PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234a");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth3PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234a");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth3PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234a");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth3PrivStatBool();

        assertFalse(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarralbutt154.meth4PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarralbutt154.meth4PrivStatBool' method happy path test.")

    public void test5PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TestSQLUserPasswordaaaa");

        globProtStatJPasFielPosi143.setText("TestSQLUserPasswordaaaa");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth4PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestttSQLUserPassword01");

        globProtStatJPasFielPosi143.setText("TestttSQLUserPassword01");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarralbutt154.meth5PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarralbutt154.meth5PrivStatBool' method happy path test.")

    public void test6PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("0000000000111111");

        globProtStatJPasFielPosi143.setText("0000000000111111");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth5PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestttSQLUserPassword01");

        globProtStatJPasFielPosi143.setText("TestttSQLUserPassword01");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarralbutt154.meth6PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarralbutt154.meth6PrivStatBool' method happy path test.")

    public void test7PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("testsqlserpassword1234");

        globProtStatJPasFielPosi143.setText("testsqlserpassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth6PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarralbutt154.meth7PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarralbutt154.meth7PrivStatBool' method happy path test.")

    public void test8PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TESTSQLUSERPASS000");

        globProtStatJPasFielPosi143.setText("TESTSQLUSERPASS000");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth7PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarralbutt154.meth8PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarralbutt154.meth8PrivStatBool' method happy path test.")

    public void test9PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Test");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth8PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Basic");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth8PrivStatBool();

        assertTrue(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth8PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarralbutt154.meth9PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarralbutt154.meth9PrivStatBool' method happy path test.")

    public void test10PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindCallPara0.clear();}

        if (globProtStatJComStriPosi123.getItemCount()>0) {

            globProtStatJComStriPosi123.removeAllItems();}

        globProtStatJComStriPosi123.addItem("PBKDF2");

        globProtStatJComStriPosi123.addItem("SHA3-512");

        globProtStatJComStriPosi123.addItem("NONE");

        globProtStatJComStriPosi123.setSelectedIndex(0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPassword1234");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassword1234");

        globProtStatJTexFielPosi113.setText("TestSQLUsername");

        globProtStatJTexFielPosi153.setText("Master");

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth8PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth9PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("ZTk1MDljZTcyNzkzMjIyZjVkZmEzMG",globProtStatArraListStriModuWindCallPara0.get(2));

        globProtStatArraListStriModuWindCallPara0.clear();

        globProtStatJComStriPosi123.setSelectedIndex(1);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth8PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth9PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("ZDQ4ZDQ1YjJkOGVlZjJjOWUzZjEwMT",globProtStatArraListStriModuWindCallPara0.get(2));

        globProtStatArraListStriModuWindCallPara0.clear();

        globProtStatJComStriPosi123.setSelectedIndex(2);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth8PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarralbutt154.meth9PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("TestSQLUserPassword1234",globProtStatArraListStriModuWindCallPara0.get(2));}}
