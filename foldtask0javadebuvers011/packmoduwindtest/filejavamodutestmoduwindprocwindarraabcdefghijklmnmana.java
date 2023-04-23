package packmoduwindtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmoduwindcode.filejavamoduwindclaswindarraabcdefghijklmnbase;

import packmoduwindcode.filejavamoduwindprocwindarraabcdefghijklmnmana;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement abcdefghijklmn Manager' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmoduwindprocwindarraabcdefghijklmnmana extends filejavamoduwindclaswindarraabcdefghijklmnbase {

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

        System.out.println("Variable initialiser method run for filejavamodutestmoduwindprocwindarraabcdefghijklmnmana.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamoduwindprocwindarraabcdefghijklmnmana' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarraabcdefghijklmnmana' method happy path test.")

    public void test1PublVoid() throws Exception {

        new filejavamoduwindprocwindarraabcdefghijklmnmana();

        assertEquals("a",globProtStatStriCurrWind0);}}
