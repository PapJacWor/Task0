package packmodudatatest;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmodudatacode.filejavamodudataclaswindarraabcdefghijklmnbase;

import packmodudatacode.filejavamodudataprocwindarrajbutt154;

/*
Description :


    This is the class for the 'Module Database Process Window Arrangement j Button 154' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmodudataprocwindarrajbutt154 extends filejavamodudataclaswindarraabcdefghijklmnbase {

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

        System.out.println("Variable initialiser method run for filejavamodutestmodudataprocwindarrajbutt154.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}

        if (globProtStatArraListStriModuDataRecePara0.isEmpty()==false) {

            globProtStatArraListStriModuDataRecePara0.clear();}}

/*
Description :


    The 'filejavamodudataprocwindarrajbutt154.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamodudataprocwindarrajbutt154.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        ArrayList<String> locaArraListStriPara0=null;

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth0PublStatBool(locaArraListStriPara0);

        assertFalse(globBoolStat0);

        ArrayList<String> locaArraListStriPara1=new ArrayList<String>();

        if (locaArraListStriPara1.isEmpty()==false) {

            locaArraListStriPara1.clear();}

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth0PublStatBool(locaArraListStriPara1);

        assertFalse(globBoolStat0);

        locaArraListStriPara1.add("localhost");

        locaArraListStriPara1.add("3306");

        locaArraListStriPara1.add("testdataname0");

        locaArraListStriPara1.add("task0testuser0");

        locaArraListStriPara1.add("0");

        locaArraListStriPara1.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        locaArraListStriPara1.add("TestSeleCompName0");

        locaArraListStriPara1.add("TestSeleCompAddr0");

        locaArraListStriPara1.add("TestSeleServName0");

        locaArraListStriPara1.add("2023-01-27");

        locaArraListStriPara1.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth0PublStatBool(locaArraListStriPara1);

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamodudataprocwindarrajbutt154.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamodudataprocwindarrajbutt154.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        globProtStatArraListStriModuDataRecePara0.add(null);

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add(null);

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add(null);

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add(null);

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add(null);

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add(null);

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add(null);

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add(null);

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add(null);

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add(null);

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add(null);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllm");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("aaaaaa");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffg");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("aaaaaaaaaabbbbbbbbbbccccccccccd");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("aa");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("aaaaaaaaaabbbbbbbbbbccccccccccd");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllm");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllm");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllm");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("aaaaaaaaaab");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("aaaaaa");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globProtStatArraListStriModuDataRecePara0.add("TestNewAppoName0");

        globProtStatArraListStriModuDataRecePara0.add("+0123456789");

        globProtStatArraListStriModuDataRecePara0.add("Testemai@test.test");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamodudataprocwindarrajbutt154.meth2PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamodudataprocwindarrajbutt154.meth2PrivStatBool' method happy path test.")

    public void test3PublVoid() throws Exception {

        globProtStatArraListStriModuDataRecePara0.add("localhost ");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306 ");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0 ");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0 ");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add(" ");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyO ");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-2 ");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:0 ");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth2PrivStatBool();

        assertFalse(globBoolStat0);

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globProtStatArraListStriModuDataRecePara0.add("TestNewAppoName0");

        globProtStatArraListStriModuDataRecePara0.add("+0123456789");

        globProtStatArraListStriModuDataRecePara0.add("Testemai@test.test");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamodudataprocwindarrajbutt154.meth3PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamodudataprocwindarrajbutt154.meth3PrivStatBool' method happy path test.")

    public void test4PublVoid() throws Exception {

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamodudataprocwindarrajbutt154.meth4PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamodudataprocwindarrajbutt154.meth4PrivStatBool' method happy path test.")

    public void test5PublVoid() throws Exception {

        globProtStatArraListStriModuDataRecePara0.clear();

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamodudataprocwindarrajbutt154.meth5PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamodudataprocwindarrajbutt154.meth5PrivStatBool' method happy path test.")

    public void test6PublVoid() throws Exception {

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamodudataprocwindarrajbutt154.meth6PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamodudataprocwindarrajbutt154.meth6PrivStatBool' method happy path test.")

    public void test7PublVoid() throws Exception {

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globProtStatArraListStriModuDataRecePara0.add("TestNewAppoName0");

        globProtStatArraListStriModuDataRecePara0.add("+0123456789");

        globProtStatArraListStriModuDataRecePara0.add("Testemai@test.test");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamodudataprocwindarrajbutt154.meth7PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamodudataprocwindarrajbutt154.meth7PrivStatBool' method happy path test.")

    public void test8PublVoid() throws Exception {

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globProtStatArraListStriModuDataRecePara0.add("TestNewAppoName0");

        globProtStatArraListStriModuDataRecePara0.add("+0123456789");

        globProtStatArraListStriModuDataRecePara0.add("Testemai@test.test");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamodudataprocwindarrajbutt154.meth8PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamodudataprocwindarrajbutt154.meth8PrivStatBool' method happy path test.")

    public void test9PublVoid() throws Exception {

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globProtStatArraListStriModuDataRecePara0.add("TestNewAppoName0");

        globProtStatArraListStriModuDataRecePara0.add("+0123456789");

        globProtStatArraListStriModuDataRecePara0.add("Testemai@test.test");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth8PrivStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamodudataprocwindarrajbutt154.meth9PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamodudataprocwindarrajbutt154.meth9PrivStatBool' method happy path test.")

    public void test10PublVoid() throws Exception {

        globProtStatArraListStriModuDataRecePara0.add("localhost");

        globProtStatArraListStriModuDataRecePara0.add("3306");

        globProtStatArraListStriModuDataRecePara0.add("testdataname0");

        globProtStatArraListStriModuDataRecePara0.add("task0testuser0");

        globProtStatArraListStriModuDataRecePara0.add("0");

        globProtStatArraListStriModuDataRecePara0.add("NzI3ZmIzNzRiNDhlNzMwNTA0OTUyOD");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompName0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleCompAddr0");

        globProtStatArraListStriModuDataRecePara0.add("TestSeleServName0");

        globProtStatArraListStriModuDataRecePara0.add("2023-01-27");

        globProtStatArraListStriModuDataRecePara0.add("09:00");

        globProtStatArraListStriModuDataRecePara0.add("TestNewAppoName0");

        globProtStatArraListStriModuDataRecePara0.add("+0123456789");

        globProtStatArraListStriModuDataRecePara0.add("Testemai@test.test");

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth2PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth3PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth4PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth5PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth6PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth7PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth8PrivStatBool();

        assertTrue(globBoolStat0);

        globBoolStat0=filejavamodudataprocwindarrajbutt154.meth9PrivStatBool();

        assertTrue(globBoolStat0);}}
