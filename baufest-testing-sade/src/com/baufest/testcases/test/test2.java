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

public class test2 extends MainClass{

    @Test
    public void Test1() throws Exception {

        actionsReport.startTest("edit perfil", "edit", "Login", "Miguel Dalessio", "edit");
        actionsReport.infoTest("PASO 1");
        actionsReport.infoTest("PASO 2");
        actionsReport.infoTest("PASO 3");
        actionsReport.infoTest("PASO 4");
        actionsReport.infoTest("PASO 5");
        actionsReport.infoTest("PASO 6");
        actionsReport.infoTest("PASO 7");
        actionsReport.passWithScreenShot("Paso con foto foto");

    }
}