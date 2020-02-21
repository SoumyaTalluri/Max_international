package com.max_international.framework.pagefactory;

import com.jcabi.aspects.Loggable;
import com.max_international.automation.framework.TestSession;

/**
 *
 * @author Nimit Jain
 */
@Loggable
public class MobileWebViewPage extends Page {

    public MobileWebViewPage(TestSession session, String pageYamlFile) throws Exception {
        super(session, pageYamlFile);
    }

    @Override
    public Boolean isDisplayed() throws Exception {
        try {
            element(pageUI.expectedElements().get(0).name);
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException(this.getClass().getName() + "does not have any expected elements defined in page spec");
        }
        return super.isDisplayed();
    }
}
