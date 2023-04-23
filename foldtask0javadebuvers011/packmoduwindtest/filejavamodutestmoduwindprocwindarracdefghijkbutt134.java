package packmoduwindtest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmoduwindcode.filejavamoduwindclaswindarraabcdefghijklmnbase;

import packmoduwindcode.filejavamoduwindprocwindarracdefghijkbutt134;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement cdefghijk Button 134' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmoduwindprocwindarracdefghijkbutt134 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

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

        System.out.println("Variable initialiser method run for filejavamodutestmoduwindprocwindarracdefghijkbutt134.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}}

/*
Description :


    The 'filejavamoduwindprocwindarracdefghijkbutt134.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarracdefghijkbutt134.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindRetuPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindRetuPara0.clear();}

        globProtStatArraListStriModuWindRetuPara0.add("1");

        globProtStatArraListStriModuWindRetuPara0.add("TestCompAddr0");

        globProtStatArraListStriModuWindRetuPara0.add("08:00-17:00");

        globProtStatArraListStriModuWindRetuPara0.add("TestCompName0");

        globProtStatArraListStriModuWindRetuPara0.add("Active");

        globBoolStat0=filejavamoduwindprocwindarracdefghijkbutt134.meth0PublStatBool();

        assertTrue(globBoolStat0);

        globProtStatArraListStriModuWindRetuPara0.clear();}

/*
Description :


    The 'filejavamoduwindprocwindarracdefghijkbutt134.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarracdefghijkbutt134.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        if (globProtStatArraListStriModuWindRetuPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindRetuPara0.clear();}

        globProtStatArraListStriModuWindRetuPara0.add("1");

        globProtStatArraListStriModuWindRetuPara0.add("TestCompAddr0");

        globProtStatArraListStriModuWindRetuPara0.add("08:00-17:00");

        globProtStatArraListStriModuWindRetuPara0.add("TestCompName0");

        globProtStatArraListStriModuWindRetuPara0.add("Active");

        globBoolStat0=filejavamoduwindprocwindarracdefghijkbutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globProtStatArraListStriModuWindRetuPara0.clear();

        globBoolStat0=filejavamoduwindprocwindarracdefghijkbutt134.meth1PrivStatBool();

        assertTrue(globBoolStat0);}}
