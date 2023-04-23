package packmoduwindtest;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmoduwindcode.filejavamoduwindclaswindarraabcdefghijklmnbase;

import packmoduwindcode.filejavamoduwindprocwindarraabutt134;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement a Button 134' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmoduwindprocwindarraabutt134 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

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

        System.out.println("Variable initialiser method run for filejavamodutestmoduwindprocwindarraabutt134.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamoduwindprocwindarraabutt134.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabutt134.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        if (globProtStatJComStriPosi123.getItemCount()>0) {

            globProtStatJComStriPosi123.removeAllItems();}

        globProtStatJComStriPosi123.addItem("PBKDF2");

        globProtStatJComStriPosi123.addItem("SHA3-512");

        globProtStatJComStriPosi123.addItem("NONE"); 

        globProtStatJComStriPosi123.setSelectedItem(0);

        if (globProtStatJComStriPosi163.getItemCount()>0) {

            globProtStatJComStriPosi163.removeAllItems();}

        globProtStatJComStriPosi163.addItem("0"); 

        globProtStatJComStriPosi163.setSelectedIndex(0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth0PublStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarraabutt134.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabutt134.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarraabutt134.meth2PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabutt134.meth2PrivStatBool' method happy path test.")

    public void test3PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText(null);

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText(null);

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText(null);

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText(null);

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText(null);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("Test");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("aaaaaaaaaabbbbbbbbbbccccccccccd");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllm");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("aaaaaaaaaabbbbbbbbbbccccccccccd");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("aaaaaa");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffg");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarraabutt134.meth3PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabutt134.meth3PrivStatBool' method happy path test.")

    public void test4PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TestPass123Word456 ");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth3PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("TestHostName ");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth3PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername ");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth3PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234 ");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth3PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName ");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth3PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth3PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarraabutt134.meth4PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabutt134.meth4PrivStatBool' method happy path test.")

    public void test5PublVoid() throws Exception {

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234a");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth4PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth4PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarraabutt134.meth5PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabutt134.meth5PrivStatBool' method happy path test.")

    public void test6PublVoid() throws Exception {

        if (globProtStatJComStriPosi123.getItemCount()>0) {

            globProtStatJComStriPosi123.removeAllItems();}

        globProtStatJComStriPosi123.addItem("PBKDF2");

        globProtStatJComStriPosi123.addItem("SHA3-512");

        globProtStatJComStriPosi123.addItem("NONE"); 

        globProtStatJComStriPosi123.setSelectedItem(0);

        if (globProtStatJComStriPosi163.getItemCount()>0) {

            globProtStatJComStriPosi163.removeAllItems();}

        globProtStatJComStriPosi163.addItem("0"); 

        globProtStatJComStriPosi163.setSelectedIndex(0);

        globProtStatJPasFielPosi133.setText("TestPass123Word456");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi113.setText("TestUsername");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi131.setText("TestDatabaseName");

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabutt134.meth5PrivStatBool();

        assertTrue(globBoolStat0);}}
