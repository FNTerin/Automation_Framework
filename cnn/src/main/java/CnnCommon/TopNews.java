package CnnCommon;

/**
 * Created by zayan on 4/12/14.
 */
import base.Base;

import java.util.List;

public class TopNews extends Base {

    public void clickOnNews(String locator){
        List<String> news = getListOfString(locator);
        for(String st:news){
            System.out.println(st);
        }
    }
}

