package packmodumaintest;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmodumaincode.filejavamodumainprocmaincons;

/*
Description :


    This is the class for the 'Module Main Process Main Console' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmodumainprocmaincons {

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

        System.out.println("Variable initialiser method run for filejavamodutestmodumainprocmaincons.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamodumainprocmaincons.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamodumainprocmaincons.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        String[] locaStriArraPara0=null;

        globBoolStat0=filejavamodumainprocmaincons.meth0PublStatBool(locaStriArraPara0);

        assertFalse(globBoolStat0);

        String[] locaStriArraPara1={null,""};

        globBoolStat0=filejavamodumainprocmaincons.meth0PublStatBool(locaStriArraPara1);

        assertFalse(globBoolStat0);

        String[] locaStriArraPara2={"-Help"};

        globBoolStat0=filejavamodumainprocmaincons.meth0PublStatBool(locaStriArraPara2);

        assertFalse(globBoolStat0);

        String[] locaStriArraPara3={"-a","-a"};;

        globBoolStat0=filejavamodumainprocmaincons.meth0PublStatBool(locaStriArraPara3);

        assertFalse(globBoolStat0);

        locaStriArraPara3[1]="-v";

        globBoolStat0=filejavamodumainprocmaincons.meth0PublStatBool(locaStriArraPara3);

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamodumainprocmaincons.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamodumainprocmaincons.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        String[] locaStriArraPara0={"-h","-v"};

        locaStriArraPara0[1]="a";

        globBoolStat0=filejavamodumainprocmaincons.meth1PrivStatBool(locaStriArraPara0);

        assertFalse(globBoolStat0);

        locaStriArraPara0[1]="-v";

        globBoolStat0=filejavamodumainprocmaincons.meth1PrivStatBool(locaStriArraPara0);

        assertTrue(globBoolStat0);

        locaStriArraPara0[1]="-V";

        globBoolStat0=filejavamodumainprocmaincons.meth1PrivStatBool(locaStriArraPara0);

        assertTrue(globBoolStat0);

        locaStriArraPara0[1]="-version";

        globBoolStat0=filejavamodumainprocmaincons.meth1PrivStatBool(locaStriArraPara0);

        assertTrue(globBoolStat0);

        locaStriArraPara0[1]="-Version";

        globBoolStat0=filejavamodumainprocmaincons.meth1PrivStatBool(locaStriArraPara0);

        assertTrue(globBoolStat0);

        locaStriArraPara0[1]="-h";

        globBoolStat0=filejavamodumainprocmaincons.meth1PrivStatBool(locaStriArraPara0);

        assertTrue(globBoolStat0);

        locaStriArraPara0[1]="-H";

        globBoolStat0=filejavamodumainprocmaincons.meth1PrivStatBool(locaStriArraPara0);

        assertTrue(globBoolStat0);

        locaStriArraPara0[1]="-help";

        globBoolStat0=filejavamodumainprocmaincons.meth1PrivStatBool(locaStriArraPara0);

        assertTrue(globBoolStat0);

        locaStriArraPara0[1]="-Help";

        globBoolStat0=filejavamodumainprocmaincons.meth1PrivStatBool(locaStriArraPara0);

        assertTrue(globBoolStat0);}}
