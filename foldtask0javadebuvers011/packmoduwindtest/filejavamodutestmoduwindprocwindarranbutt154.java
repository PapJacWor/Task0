package packmoduwindtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmoduwindcode.filejavamoduwindclaswindarraabcdefghijklmnbase;

import packmoduwindcode.filejavamoduwindprocwindarranbutt154;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement n Button 154' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmoduwindprocwindarranbutt154 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

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

        System.out.println("Variable initialiser method run for filejavamodutestmoduwindprocwindarranbutt154.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamoduwindprocwindarranbutt154.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarranbutt154.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindCallPara0.clear();}

        if (globProtStatJComStriPosi123.getItemCount()>0) {

            globProtStatJComStriPosi123.removeAllItems();}

        globProtStatJComStriPosi123.addItem("PBKDF2");

        globProtStatJComStriPosi123.addItem("SHA3-512");

        globProtStatJComStriPosi123.addItem("NONE");

        globProtStatJComStriPosi123.setSelectedItem(0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000");

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth0PublStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);}

/*
Description :


    The 'filejavamoduwindprocwindarranbutt154.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarranbutt154.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText(null);

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000");

        globProtStatJPasFielPosi143.setText(null);

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000");

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000");

        globProtStatJTexFielPosi113.setText(null);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("");

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000");

        globProtStatJPasFielPosi143.setText("");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000");

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000");

        globProtStatJTexFielPosi113.setText("");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("aaaaaaaaaabbbbbbbbbbccccccccccd");

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000");

        globProtStatJPasFielPosi143.setText("aaaaaaaaaabbbbbbbbbbccccccccccd");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000");

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000");

        globProtStatJTexFielPosi113.setText("aaaaaaaaaabbbbbbbbbbccccccccccd");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000");

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarranbutt154.meth2PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarranbutt154.meth2PrivStatBool' method happy path test.")

    public void test3PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000 ");

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000");

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000 ");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000");

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0 ");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000");

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarranbutt154.meth3PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarranbutt154.meth3PrivStatBool' method happy path test.")

    public void test4PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000a");

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth3PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000");

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000a");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth3PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000");

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarranbutt154.meth4PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarranbutt154.meth4PrivStatBool' method happy path test.")

    public void test5PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TestSQLUserPassaa");

        globProtStatJPasFielPosi143.setText("TestSQLUserPassaa");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth4PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000");

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarranbutt154.meth5PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarranbutt154.meth5PrivStatBool' method happy path test.")

    public void test6PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("0000000000111111");

        globProtStatJPasFielPosi143.setText("0000000000111111");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth5PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000");

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarranbutt154.meth6PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarranbutt154.meth6PrivStatBool' method happy path test.")

    public void test7PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("Testsqluserpass000");

        globProtStatJPasFielPosi143.setText("Testsqluserpass000");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth6PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000");

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarranbutt154.meth7PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarranbutt154.meth7PrivStatBool' method happy path test.")

    public void test8PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TESTSQLUSERPASS000");

        globProtStatJPasFielPosi143.setText("TESTSQLUSERPASS000");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth7PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000");

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarranbutt154.meth8PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarranbutt154.meth8PrivStatBool' method happy path test.")

    public void test9PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindCallPara0.clear();}

        if (globProtStatJComStriPosi123.getItemCount()>0) {

            globProtStatJComStriPosi123.removeAllItems();}

        globProtStatJComStriPosi123.addItem("PBKDF2");

        globProtStatJComStriPosi123.addItem("SHA3-512");

        globProtStatJComStriPosi123.addItem("NONE");

        globProtStatJComStriPosi123.setSelectedIndex(0);

        globProtStatJPasFielPosi133.setText("TestSQLUserPass000");

        globProtStatJPasFielPosi143.setText("TestSQLUserPass000");

        globProtStatJTexFielPosi113.setText("TestSQLUserName0");

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth8PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("ZDgxNDk0OWZmNjhlYTcxNGVkM2RlMT",globProtStatArraListStriModuWindCallPara0.get(2));

        globProtStatArraListStriModuWindCallPara0.clear();

        globProtStatJComStriPosi123.setSelectedIndex(1);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth8PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("N2RhOTY3OWJiYTczNzU5ZThiNTgxZD",globProtStatArraListStriModuWindCallPara0.get(2));

        globProtStatArraListStriModuWindCallPara0.clear();

        globProtStatJComStriPosi123.setSelectedIndex(2);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarranbutt154.meth8PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("TestSQLUserPass000",globProtStatArraListStriModuWindCallPara0.get(2));}}
