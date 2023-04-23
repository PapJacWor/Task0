package packmoduwindtest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmoduwindcode.filejavamoduwindclaswindarraabcdefghijklmnbase;

import packmoduwindcode.filejavamoduwindprocwindarracdefghijkbutt134mana;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement cdefghijk Button 134 Manager' process related test methods.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmoduwindprocwindarracdefghijkbutt134mana extends filejavamoduwindclaswindarraabcdefghijklmnbase {

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

        System.out.println("Variable initialiser method run for filejavamodutestmoduwindprocwindarracdefghijkbutt134mana.");

        if (globBoolStat0==true) {

            globBoolStat0=false;}

        if (globProtStatArraListStriModuWindCallPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindCallPara0.clear();}

        if (globProtStatArraListStriModuWindRetuPara0.isEmpty()==false) {

            globProtStatArraListStriModuWindRetuPara0.clear();}}

/*
Description :


    The 'filejavamoduwindprocwindarracdefghijkbutt134mana.meth0PublStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarracdefghijkbutt134mana.meth0PublStatBool' method happy path test.")

    public void test1PublVoid() throws Exception {

        globProtStatArraListStriModuWindCallPara0.add("TestPlacHold");

        globBoolStat0=filejavamoduwindprocwindarracdefghijkbutt134mana.meth0PublStatBool();

        assertTrue(globBoolStat0);

        globProtStatJTexFielPosi111.setText("TestCompName0");

        globBoolStat0=filejavamoduwindprocwindarracdefghijkbutt134mana.meth0PublStatBool();

        assertTrue(globBoolStat0);

        globProtStatJTexFielPosi121.setText("TestCompAddr0");

        globBoolStat0=filejavamoduwindprocwindarracdefghijkbutt134mana.meth0PublStatBool();

        assertTrue(globBoolStat0);}

/*
Description :


    The 'filejavamoduwindprocwindarracdefghijkbutt134mana.meth1PrivStatBool' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamoduwindprocwindarracdefghijkbutt134mana.meth1PrivStatBool' method happy path test.")

    public void test2PublVoid() throws Exception {

        globBoolStat0=filejavamoduwindprocwindarracdefghijkbutt134mana.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globProtStatJTexFielPosi111.setText("TestCompName0");

        globBoolStat0=filejavamoduwindprocwindarracdefghijkbutt134mana.meth1PrivStatBool();

        assertTrue(globBoolStat0);

        globProtStatJTexFielPosi121.setText("TestCompAddr0");

        globBoolStat0=filejavamoduwindprocwindarracdefghijkbutt134mana.meth1PrivStatBool();

        assertTrue(globBoolStat0);}}
