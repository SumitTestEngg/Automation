package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
features= "C:\\Users\\hp\\Desktop\\Sumit Gour\\Eclipse Workspace\\Cucumber\\Cucumber\\GuruLogin.feature",
//features= ".//Cucumber//GuruLogin.feature",
glue= {"Steps"},
plugin= {"pretty",
"html:reports/myreports.html",
"html:reports/myreports.json",
//"rerun:target/rerun.txt",
},
dryRun=false,
monochrome=true
//tags="@Sanity"
)
public class testrunner {

}
