package net.davinci.step_defs;

import net.davinci.pages.DashboardPage;
import net.davinci.utilities.TestBase;
import org.testng.annotations.Test;

public class FilterDate_Test extends TestBase {
    DashboardPage dashboardPage = new DashboardPage();
    @Test
    public void filter(){
        dashboardPage.goToSurveys();
    }
}
