package src.com.baufest.testcases.test;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;
import resources.DataManager.DataResources;
import src.com.baufest.core.Random.GetRandom;
import src.com.baufest.functions.login.FuncLogin;
import src.com.baufest.functions.paginaPrincipal.FuncPaginaPrincipal;
import src.com.baufest.functions.servicio.FuncCrearServicio;
import src.com.baufest.main.MainClass;
import src.com.baufest.core.Exceptions.ActionExceptions;

import java.util.Random;

public class test1 extends MainClass{

    @Test
    public void Test1() throws Exception {


        System.out.println(Thread.currentThread());

        actionsReport.startTest("Login", "Login en la app", "Login", "Miguel Dalessio", "Login");
        actionsReport.infoTest("PASO 1");
        actionsReport.infoTest("PASO 2");
        actionsReport.infoTest("PASO 3");
        actionsReport.infoTest("PASO 4");
        actionsReport.infoTest("PASO 5");
        actionsReport.infoTest("PASO 6");
        actionsReport.infoTest("PASO 7");
        actionsReport.failWithScreenShot("Paso 8 Fail");


    }
}
