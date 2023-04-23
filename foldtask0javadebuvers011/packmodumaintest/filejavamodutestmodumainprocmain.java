package packmodumaintest;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import packmodumaincode.filejavamodumainprocmain;

/*
Description :


    This is the class for the 'Module Main Process Main' process related test method.

    This class is part of the 'Test' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamodutestmodumainprocmain {

/*
Description :


    The 'filejavamodumainprocmain.main' method happy path test.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    @Test

    @DisplayName("The 'filejavamodumainprocmain.main' method happy path test.")

    public void test1PublVoid() throws Exception {

        String[] locaStriArraPara0=null;

        filejavamodumainprocmain.main(locaStriArraPara0);

        String[] locaStriArraPara1={""};

        filejavamodumainprocmain.main(locaStriArraPara1);

        locaStriArraPara1[0]=" ";

        filejavamodumainprocmain.main(locaStriArraPara1);

        locaStriArraPara1[0]="Task0";

        filejavamodumainprocmain.main(locaStriArraPara1);

        String[] locaStriArraPara2={null,null};

        filejavamodumainprocmain.main(locaStriArraPara2);

        locaStriArraPara2[0]="";

        locaStriArraPara2[1]="";

        filejavamodumainprocmain.main(locaStriArraPara2);

        locaStriArraPara2[0]="";

        locaStriArraPara2[1]="-Help";

        filejavamodumainprocmain.main(locaStriArraPara2);

        locaStriArraPara2[0]="Task0";

        locaStriArraPara2[1]="-Help";

        filejavamodumainprocmain.main(locaStriArraPara2);}}
