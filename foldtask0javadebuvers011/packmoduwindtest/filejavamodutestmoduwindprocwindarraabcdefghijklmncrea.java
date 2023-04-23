package packmoduwindtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmoduwindcode.filejavamoduwindclaswindarraabcdefghijklmnbase;

import packmoduwindcode.filejavamoduwindprocwindarraabcdefghijklmncrea;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement abcdefghijklmn Creation' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmoduwindprocwindarraabcdefghijklmncrea extends filejavamoduwindclaswindarraabcdefghijklmnbase {

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

        System.out.println("Variable initialiser method run for filejavamodutestmoduwindprocwindarraabcdefghijklmncrea.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamoduwindprocwindarraabcdefghijklmncrea.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabcdefghijklmncrea.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmncrea.meth0PublStatBool();

        assertTrue(globBoolStat0);

        assertEquals("Task 0 Version 0.1.1. Demo Version Made By Jácint Papp",globProtStatJFraBaseFram0.getTitle());}

/*
Description :


    The 'filejavamoduwindprocwindarraabcdefghijklmncrea.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabcdefghijklmncrea.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmncrea.meth1PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarraabcdefghijklmncrea.meth2PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabcdefghijklmncrea.meth2PrivStatBool' method happy path test.")

    public void test3PublVoid() throws Exception {

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmncrea.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmncrea.meth2PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarraabcdefghijklmncrea.meth3PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabcdefghijklmncrea.meth3PrivStatBool' method happy path test.")

    public void test4PublVoid() throws Exception {

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmncrea.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmncrea.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmncrea.meth3PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarraabcdefghijklmncrea.meth4PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabcdefghijklmncrea.meth4PrivStatBool' method happy path test.")

    public void test5PublVoid() throws Exception {

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmncrea.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmncrea.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmncrea.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamoduwindprocwindarraabcdefghijklmncrea.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        assertEquals("Task 0 Version 0.1.1. Demo Version Made By Jácint Papp",globProtStatJFraBaseFram0.getTitle());}}
