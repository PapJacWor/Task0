package packmoduwindtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmoduwindcode.filejavamoduwindclaswindarraabcdefghijklmnbase;

import packmoduwindcode.filejavamoduwindprocwindarrabbutt124andbutt134;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement b Button 124 And Button 134' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmoduwindprocwindarrabbutt124andbutt134 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

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

        System.out.println("Variable initialiser method run for filejavamodutestmoduwindprocwindarrabbutt124andbutt134.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindCallPara0.clear();}

        if (globProtStatJComStriPosi163.getItemCount()>0) {

            globProtStatJComStriPosi163.removeAllItems();}

        globProtStatJComStriPosi163.addItem("PBKDF2");

        globProtStatJComStriPosi163.addItem("SHA3-512");

        globProtStatJComStriPosi163.addItem("NONE");

        globProtStatJComStriPosi163.setSelectedIndex(0);

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth0PublStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("N2Y0M2RkNjk5ZWEwY2JmMmU0N2ZmMG",globProtStatArraListStriModuWindCallPara0.get(3));

        globProtStatArraListStriModuWindCallPara0.clear();

        globProtStatJComStriPosi163.setSelectedIndex(1);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth0PublStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("YWY4YzJkZTNhZjNmZDQyOTM5OTY4Zj",globProtStatArraListStriModuWindCallPara0.get(3));

        globProtStatArraListStriModuWindCallPara0.clear();

        globProtStatJComStriPosi163.setSelectedIndex(2);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth0PublStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("TestPriSQLPassword123",globProtStatArraListStriModuWindCallPara0.get(3));}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        globProtStatJPasFielPosi173.setText(null);

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123");

        globProtStatJTexFielPosi111.setText(null);

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi121.setText(null);

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi153.setText(null);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi173.setText("");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123");

        globProtStatJTexFielPosi111.setText("");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi121.setText("");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi153.setText("");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi173.setText("aaaaaaaaaabbbbbbbbbbccccccccccd");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123");

        globProtStatJTexFielPosi111.setText("aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllm");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi121.setText("aaaaaa");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi153.setText("aaaaaaaaaabbbbbbbbbbccccccccccd");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool' method happy path test.")

    public void test3PublVoid() throws Exception {

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123 ");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123");

        globProtStatJTexFielPosi111.setText("TestHostName ");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi121.setText("123 ");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName ");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth3PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth3PrivStatBool' method happy path test.")

    public void test4PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindCallPara0.clear();}

        if (globProtStatJComStriPosi163.getItemCount()>0) {

            globProtStatJComStriPosi163.removeAllItems();}

        globProtStatJComStriPosi163.addItem("PBKDF2");

        globProtStatJComStriPosi163.addItem("SHA3-512");

        globProtStatJComStriPosi163.addItem("NONE");

        globProtStatJComStriPosi163.setSelectedIndex(0);

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi121.setText("1234a");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth3PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatJTexFielPosi121.setText("1234");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth3PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth4PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarrabbutt124andbutt134.meth4PrivStatBool' method happy path test.")

    public void test5PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindCallPara0.clear();}

        if (globProtStatJComStriPosi163.getItemCount()>0) {

            globProtStatJComStriPosi163.removeAllItems();}

        globProtStatJComStriPosi163.addItem("PBKDF2");

        globProtStatJComStriPosi163.addItem("SHA3-512");

        globProtStatJComStriPosi163.addItem("NONE");

        globProtStatJComStriPosi163.setSelectedIndex(0);

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("N2Y0M2RkNjk5ZWEwY2JmMmU0N2ZmMG",globProtStatArraListStriModuWindCallPara0.get(3));

        globProtStatArraListStriModuWindCallPara0.clear();

        globProtStatJComStriPosi163.setSelectedIndex(1);

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("YWY4YzJkZTNhZjNmZDQyOTM5OTY4Zj",globProtStatArraListStriModuWindCallPara0.get(3));

        globProtStatArraListStriModuWindCallPara0.clear();

        globProtStatJComStriPosi163.setSelectedIndex(2);

        globProtStatJPasFielPosi173.setText("TestPriSQLPassword123");

        globProtStatJTexFielPosi111.setText("TestHostName");

        globProtStatJTexFielPosi121.setText("1234");

        globProtStatJTexFielPosi153.setText("TestPriSQLUsernName");

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarrabbutt124andbutt134.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        assertTrue(globProtStatArraListStriModuWindCallPara0.isEmpty()==false);

        assertEquals("TestPriSQLPassword123",globProtStatArraListStriModuWindCallPara0.get(3));}}
