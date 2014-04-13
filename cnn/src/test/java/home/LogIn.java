package home;

import base.Base;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: rrt
 * Date: 4/6/14
 * Time: 11:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class LogIn extends Base {

    @Test
    public void test() throws InterruptedException {
        Set<String> listOfWindow = driver.getWindowHandles();
        Iterator it = listOfWindow.iterator();
        String homeWindow = driver.getWindowHandle();
        clickByXpath(".//*[@id='hdr-auth']/ul/li[2]/a");
        listOfWindow = driver.getWindowHandles();
        it = listOfWindow.iterator();
        String popUpWindow1 = (String) it.next();
        driver.switchTo().window(popUpWindow1);
        clickByCss(".cnnOvrlyBtn.cnnBtnLogIn");
        listOfWindow = driver.getWindowHandles();
        it = listOfWindow.iterator();
        String popUpWindow2 = (String) it.next();
        driver.switchTo().window(popUpWindow2);
        typeByCss("input#cnnOverlayEmail1l","motiurhmn@gmail.com");
        typeByCss("input#cnnOverlayPwd","rahman2012");
        clickByCss(".cnnOvrlyBtn.cnnBtnLogIn");
        driver.switchTo().window(homeWindow);
        sleep(4);
    }

}
