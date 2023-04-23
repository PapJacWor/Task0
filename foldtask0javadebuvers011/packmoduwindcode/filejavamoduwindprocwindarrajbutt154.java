package packmoduwindcode;

import packmoduloggcode.filejavamoduloggproclogg;

/*
Description :


    This is the class for the 'Module Window Process Window Arrangement j Button 154' process related methods.

    This class is part of the 'Window' module.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

public class filejavamoduwindprocwindarrajbutt154 extends filejavamoduwindclaswindarraabcdefghijklmnbase {

/*
Description :


    The 'Module Window Process Window Arrangement j Button 154' process manager method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth0PublStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarrajbutt154.meth0PublStatBool' started.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarrajbutt154.meth0PublStatBool started.");

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(0,"MWPWAjB154 0/5");

            boolean locaBoolStat0=false;

            locaBoolStat0=filejavamoduwindprocwindarrajbutt154.meth1PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(20,"MWPWAjB154 1/5");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Fields' contains at least one field value that is not correct.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Fields' contains at least one field value that is not correct.");

                System.out.println("\n'False End Case' : The given 'Fields' contains at least one field value that is not correct.");

                System.out.println("The 'Module Window Process Window Arrangement j Button 154' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamoduwindprocwindarrajbutt154.meth2PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(40,"MWPWAjB154 2/5");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Selected Appointment Date' field value is not valid.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Selected Appointment Date' field value is not valid.");

                System.out.println("\n'False End Case' : The given 'Selected Appointment Date' field value is not valid.");

                System.out.println("The 'Module Window Process Window Arrangement j Button 154' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamoduwindprocwindarrajbutt154.meth3PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(60,"MWPWAjB154 3/5");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Selected Appointment Hour' field value is not valid because it is not given in the correct format.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Selected Appointment Hour' field value is not valid because it is not given in the correct format.");

                System.out.println("\n'False End Case' : The given 'Selected Appointment Hour' field value is not valid because it is not given in the correct format.");

                System.out.println("The 'Module Window Process Window Arrangement j Button 154' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth0PublStatBool' finished.");

                return false;}

            locaBoolStat0=filejavamoduwindprocwindarrajbutt154.meth4PrivStatBool();

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(80,"MWPWAjB154 4/5");

            if (locaBoolStat0==false) {

                filejavamoduwindprocwindarraabcdefghijklmnmess.meth0PublStatBool("ERROR","The given 'Fields' values cannot be added to the 'Call Parameter'.");

                filejavamoduloggproclogg.meth0PublStatBool("ERROR","The given 'Fields' values cannot be added to the 'Call Parameter'.");

                System.out.println("\n'False End Case' : The given 'Fields' values cannot be added to the 'Call Parameter'.");

                System.out.println("The 'Module Window Process Window Arrangement j Button 154' process manager method.");

                System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth0PublStatBool' finished.");

                return false;}

            filejavamoduwindprocwindarraabcdefghijklmnprogbar004.meth0PublStatBool(100,"MWPWAjB154 5/5");

            System.out.println("'True End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement j Button 154' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth0PublStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarrajbutt154.meth0PublStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The 'Module Window Process Window Arrangement j Button 154' process manager method.");

            System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth0PublStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Fields' content length checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth1PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarrajbutt154.meth1PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Selected Company Name' value in the beginning of the method : '"+globProtStatJTexFielPosi111.getText()+"'.");

            System.out.println("The given 'Selected Company Address' value in the beginning of the method : '"+globProtStatJTexFielPosi121.getText()+"'.");

            System.out.println("The given 'Selected Service Name' value in the beginning of the method : '"+globProtStatJTexFielPosi113.getText()+"'.");

            System.out.println("The given 'Selected Appointment Date' value in the beginning of the method : '"+globProtStatJTexFielPosi123.getText()+"'.");

            System.out.println("The given 'Selected Appointment Hour' value in the beginning of the method : '"+globProtStatJTexFielPosi133.getText()+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarrajbutt154.meth1PrivStatBool started.");

            if ((globProtStatJTexFielPosi111.getText()==null)||(globProtStatJTexFielPosi113.getText()==null)||(globProtStatJTexFielPosi121.getText()==null)||(globProtStatJTexFielPosi123.getText()==null)||(globProtStatJTexFielPosi133.getText()==null)) {

                System.out.println("'False End Case' : At least one of the given 'Fields' content is null.");

                System.out.println("The given 'Fields' content length checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatJTexFielPosi111.getText().length()<1)||(globProtStatJTexFielPosi113.getText().length()<1)||(globProtStatJTexFielPosi121.getText().length()<1)||(globProtStatJTexFielPosi123.getText().length()<1)||(globProtStatJTexFielPosi133.getText().length()<1)) {

                System.out.println("'False End Case' : At least one of the given 'Fields' content has less length than the minimum.");

                System.out.println("The given 'Fields' content length checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth1PrivStatBool' finished.");

                return false;}

            if ((globProtStatJTexFielPosi111.getText().length()>120)||(globProtStatJTexFielPosi113.getText().length()>120)||(globProtStatJTexFielPosi121.getText().length()>120)||(globProtStatJTexFielPosi123.getText().length()!=10)||(globProtStatJTexFielPosi133.getText().length()!=5)) {

                System.out.println("'False End Case' : At least one of the given 'Fields' content has more length than the maximum.");

                System.out.println("The given 'Fields' content length checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth1PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Fields' content length checker method.");

            System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth1PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarrajbutt154.meth1PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Fields' content length checker method.");

            System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth1PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Selected Appointment Date' field value validity checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth2PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarrajbutt154.meth2PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Selected Appointment Date' value in the beginning of the method : '"+globProtStatJTexFielPosi123.getText()+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarrajbutt154.meth2PrivStatBool started.");

            boolean locaBoolStat1=false;

            if (globProtStatJTexFielPosi123.getText().contains("-")==false) {

                System.out.println("'False End Case' : The given 'Selected Appointment Date' : '"+globProtStatJTexFielPosi123.getText()+"' value does not contain the '-' character.");

                System.out.println("The given 'Selected Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth2PrivStatBool' finished.");

                return false;}

            char[] locaCharArraDate=globProtStatJTexFielPosi123.getText().toCharArray();

            for (int locaIntForCyclCoun=0;locaIntForCyclCoun<locaCharArraDate.length;locaIntForCyclCoun++) {

                if ((Character.isDigit(locaCharArraDate[locaIntForCyclCoun])==false)&&locaCharArraDate[locaIntForCyclCoun]!='-') {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'Selected Appointment Date' : '"+globProtStatJTexFielPosi123.getText()+"' value contains at least one character that is not a digit type character neither the '-' character.");

                System.out.println("The given 'Selected Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth2PrivStatBool' finished.");

                return false;}

            String[] locaStriArraSpli0=globProtStatJTexFielPosi123.getText().split("-");

            int locaIntYear0=Integer.parseInt(locaStriArraSpli0[0]);

            if ((locaIntYear0<2023)||(locaIntYear0>2100)) {

                System.out.println("'False End Case' : The given 'Selected Appointment Date' : '"+globProtStatJTexFielPosi123.getText()+"' year value is less than 2023 or bigger than 2100.");

                System.out.println("The given 'Selected Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth2PrivStatBool' finished.");

                return false;}

            int locaIntMont0=Integer.parseInt(locaStriArraSpli0[1]);

            if ((locaIntMont0<1)||(locaIntMont0>12)) {

                System.out.println("'False End Case' : The given 'Selected Appointment Date' : '"+globProtStatJTexFielPosi123.getText()+"' month value is less than 1 or bigger than 12.");

                System.out.println("The given 'Selected Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth2PrivStatBool' finished.");

                return false;}

            int locaIntDay0=Integer.parseInt(locaStriArraSpli0[2]);

            if ((locaIntMont0==2)&&((locaIntDay0<1)||(locaIntDay0>29))) {

                System.out.println("'False End Case' : The given 'Selected Appointment Date' : '"+globProtStatJTexFielPosi123.getText()+"' month value is 2 and the day value is less than 1 or bigger than 29.");

                System.out.println("The given 'Selected Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth2PrivStatBool' finished.");

                return false;}

            if (((locaIntMont0==1)||(locaIntMont0==3)||(locaIntMont0==5)||(locaIntMont0==7)||(locaIntMont0==8)||(locaIntMont0==10)||(locaIntMont0==12))&&(locaIntDay0<1)||(locaIntDay0>31)) {

                System.out.println("'False End Case' : The given 'Selected Appointment Date' : '"+globProtStatJTexFielPosi123.getText()+"' day value is less than 1 or bigger than 31.");

                System.out.println("The given 'Selected Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth2PrivStatBool' finished.");

                return false;}

            if (((locaIntMont0==4)||(locaIntMont0==6)||(locaIntMont0==9)||(locaIntMont0==11))&&((locaIntDay0<1)||(locaIntDay0>30))) {

                System.out.println("'False End Case' : The given 'Selected Appointment Date' : '"+globProtStatJTexFielPosi123.getText()+"' day value is less than 1 or bigger than 30.");

                System.out.println("The given 'Selected Appointment Date' field value validity checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth2PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Selected Appointment Date' field value validity checker method.");

            System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth2PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarrajbutt154.meth2PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Selected Appointment Date' field value validity checker method.");

            System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth2PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Selected Appointment Hour' field value validity checker method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth3PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarrajbutt154.meth3PrivStatBool' started.\nParameter :");

            System.out.println("The given 'Selected Appointment Hour' value in the beginning of the method : '"+globProtStatJTexFielPosi133.getText()+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarrajbutt154.meth3PrivStatBool started.");

            boolean locaBoolStat1=false;

            if (globProtStatJTexFielPosi133.getText().contains(":")==false) {

                System.out.println("'False End Case' : The given 'Selected Appointment Hour' : '"+globProtStatJTexFielPosi133.getText()+"' value does not contain the ':' character.");

                System.out.println("The given 'Selected Appointment Hour' field value validity checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth3PrivStatBool' finished.");

                return false;}

            char[] locaCharArraDate=globProtStatJTexFielPosi133.getText().toCharArray();

            for (int locaIntForCyclCoun=0;locaIntForCyclCoun<locaCharArraDate.length;locaIntForCyclCoun++) {

                if ((Character.isDigit(locaCharArraDate[locaIntForCyclCoun])==false)&&locaCharArraDate[locaIntForCyclCoun]!=':') {

                    locaBoolStat1=false;

                    break;}

                else if (locaBoolStat1==false) {

                    locaBoolStat1=true;}}

            if (locaBoolStat1==false) {

                System.out.println("'False End Case' : The given 'Selected Appointment Date' : '"+globProtStatJTexFielPosi133.getText()+"' value contains at least one character that is not a digit type character neither the ':' character.");

                System.out.println("The given 'Selected Appointment Hour' field value validity checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth3PrivStatBool' finished.");

                return false;}

            String[] locaStriArraSpli0=globProtStatJTexFielPosi133.getText().split(":");

            int locaIntStartHour0=Integer.parseInt(locaStriArraSpli0[0]);

            int locaIntStartMinu0=Integer.parseInt(locaStriArraSpli0[1]);

            if ((locaIntStartHour0<0)||(locaIntStartHour0>23)) {

                System.out.println("'False End Case' : The given 'Selected Appointment Hour' : '"+globProtStatJTexFielPosi133.getText()+"' starting hour value is less than 0 or bigger than 23.");

                System.out.println("The given 'Selected Appointment Hour' field value validity checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth3PrivStatBool' finished.");

                return false;}

            if ((locaIntStartMinu0<0)||(locaIntStartMinu0>59)) {

                System.out.println("'False End Case' : The given 'Selected Appointment Hour' : '"+globProtStatJTexFielPosi133.getText()+"' starting minute value is less than 0 or bigger than 59.");

                System.out.println("The given 'Selected Appointment Hour' field value validity checker method.");

                System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth3PrivStatBool' finished.");

                return false;}

            System.out.println("'True End Case'.");

            System.out.println("The given 'Selected Appointment Hour' field value validity checker method.");

            System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth3PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarrajbutt154.meth3PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Selected Appointment Hour' field value validity checker method.");

            System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth3PrivStatBool' finished.");

            return false;}}

/*
Description :


    The given 'Appointment' data adder to the 'Call Parameter' method.


    Version :


        0.1.1. :


            2023-01-27 :


                No change to previous version.
*/

    public static boolean meth4PrivStatBool() throws Exception {

        try {

            System.out.println("\nThe 'filejavamoduwindprocwindarrajbutt154.meth4PrivStatBool' started.\nParameters :");

            System.out.println("The given 'Selected Company Name' value in the beginning of the method : '"+globProtStatJTexFielPosi111.getText()+"'.");

            System.out.println("The given 'Selected Company Address' value in the beginning of the method : '"+globProtStatJTexFielPosi121.getText()+"'.");

            System.out.println("The given 'Selected Service Name' value in the beginning of the method : '"+globProtStatJTexFielPosi113.getText()+"'.");

            System.out.println("The given 'Selected Appointment Date' value in the beginning of the method : '"+globProtStatJTexFielPosi123.getText()+"'.");

            System.out.println("The given 'Selected Appointment Hour' value in the beginning of the method : '"+globProtStatJTexFielPosi133.getText()+"'.");

            filejavamoduloggproclogg.meth0PublStatBool("INFO","The filejavamoduwindprocwindarrajbutt154.meth4PrivStatBool started.");

            globProtStatArraListStriModuWindCallPara0.add(globProtStatJTexFielPosi111.getText());

            globProtStatArraListStriModuWindCallPara0.add(globProtStatJTexFielPosi121.getText());

            globProtStatArraListStriModuWindCallPara0.add(globProtStatJTexFielPosi113.getText());

            globProtStatArraListStriModuWindCallPara0.add(globProtStatJTexFielPosi123.getText());

            globProtStatArraListStriModuWindCallPara0.add(globProtStatJTexFielPosi133.getText());

            System.out.println("'True End Case'.");

            System.out.println("The given 'Appointment' data adder to the 'Call Parameter' method.");

            System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth4PrivStatBool' finished.");

            return true;}

        catch (Exception locaExceCatcExce0) {

            filejavamoduloggproclogg.meth0PublStatBool("ERROR","EXCEPTION in filejavamoduwindprocwindarrajbutt154.meth4PrivStatBool.");

            filejavamoduloggproclogg.meth0PublStatBool("ERROR",locaExceCatcExce0.getMessage());

            System.out.println("'Exception End Case'.");

            System.out.println("The given 'Appointment' data adder to the 'Call Parameter' method.");

            System.out.println("The 'filejavamoduwindprocwindarrajbutt154.meth4PrivStatBool' finished.");

            return false;}}}
