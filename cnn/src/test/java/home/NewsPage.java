package home;

import CnnCommon.CnnUtility;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: rrt
 * Date: 4/6/14
 * Time: 10:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class NewsPage extends CnnUtility {

    @Test
    public void newsPage(){
        goToPolitics();
        typeByCss("input#hdr-search-box", randomText());
        //clickOnNews("#cnn_mtt1rgtarea .cnn_bulletbin");
    }
}
