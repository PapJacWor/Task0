package packmoduwindtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmoduwindcode.filejavamoduwindclaswindarraabcdefghijklmnbase;

import packmoduwindcode.filejavamoduwindprocwindarraacombbox163;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement a Combo Box 163' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmoduwindprocwindarraacombbox163 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

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

        System.out.println("Variable initialiser method run for filejavamodutestmoduwindprocwindarraacombbox163.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamoduwindprocwindarraacombbox163.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraacombbox163.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        globBoolStat0=filejavamoduwindprocwindarraacombbox163.meth0PublStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarraacombbox163.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraacombbox163.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        globBoolStat0=filejavamoduwindprocwindarraacombbox163.meth1PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarraacombbox163.meth2PrivStatInt' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraacombbox163.meth2PrivStatInt' method happy path test.")

    public void test3PublVoid() throws Exception {

        globBoolStat0=filejavamoduwindprocwindarraacombbox163.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        int locaBoolIntNumb0=0;

        locaBoolIntNumb0=filejavamoduwindprocwindarraacombbox163.meth2PrivStatInt();

        assertNotEquals(2,locaBoolIntNumb0);

        globBoolStat0=filejavamoduwindprocwindarraacombbox163.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        locaBoolIntNumb0=0;

        locaBoolIntNumb0=filejavamoduwindprocwindarraacombbox163.meth2PrivStatInt();

        assertEquals(1,locaBoolIntNumb0);}

/*
Description :


    The 'filejavamoduwindprocwindarraacombbox163.meth3PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraacombbox163.meth3PrivStatBool' method happy path test.")

    public void test4PublVoid() throws Exception {

        globBoolStat0=filejavamoduwindprocwindarraacombbox163.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        int locaBoolIntNumb0=0;

        locaBoolIntNumb0=filejavamoduwindprocwindarraacombbox163.meth2PrivStatInt();

        assertEquals(1,locaBoolIntNumb0);

        globBoolStat0=filejavamoduwindprocwindarraacombbox163.meth3PrivStatBool(2);

        assertTrue(globBoolStat0);}}
