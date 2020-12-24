package Step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;


public class Steps {

    WebDriver driver;
    //1
    @Given("^that I'm on the home page$")
    public void open_the_Chrome_and_launch_mainpage() throws Throwable
    {
        driver = new SafariDriver();
        driver.get("https://www.epam.com");
    }

    @When("^I click on \"About\"$")
    public void go_to_the_page5_1() throws Throwable
    {
        Actions action1 = new Actions(driver);
        WebElement element1=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/nav/ul/li[5]/span[1]/a"));
        action1.moveToElement(element1).build().perform();
        Thread.sleep(2000);
    }

    @When("^I click on \"FAQ\"$")
    public void go_to_the_page5_2() throws Throwable
    {
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/nav/ul/li[5]/div/ul[3]/li/ul/li[7]/a")).click();
    }

    @Then("^I go to the FAQ page$")
    public void	go_faq() throws Throwable
    {
        Thread.sleep(3000);
        driver.quit();
    }
    //2
    @When("^I press the search button$")
    public void go_to_the_page6_1() throws Throwable
    {
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[3]/div/button")).click();
    }

    @When("^I'm looking for \"Cucumber\"$")
    public void go_to_the_page6_2() throws Throwable
    {
        driver.findElement(By.name("q")).sendKeys("cucumber");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[3]/div/div/form/button")).click();
    }

    @Then("^I see a list of dishes that have the word \"cucumber\"$")
    public void	found_cucumber() throws Throwable
    {
        Thread.sleep(3000);
        driver.quit();
    }
    //3
    @Given("^I changed site's language to russian$")
    public void change_language() throws Throwable
    {
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[2]/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[2]/div/nav/ul/li[9]/a")).click();
        Thread.sleep(3000);
    }

    @When("^I'm looking for \"Èäåÿ\"$")
    public void go_to_the_page7() throws Throwable
    {
        driver.findElement(By.name("q")).sendKeys("èäåÿ");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[3]/div/div/form/button")).click();
    }

    @Then("^I see a list of articles that have the word \"Èäåÿ\"$")
    public void	found_ideas() throws Throwable
    {
        Thread.sleep(3000);
        driver.quit();
    }
    //4
    @Given("^that I'm on the\"How we do it\"page$")
    public void open_the_Chrome_and_launch_howwedoit() throws Throwable
    {
        driver = new SafariDriver();
        driver.get("https://www.epam.com/how-we-do-it");
    }

    @When("^I click on Best practices plate$")
    public void go_to_the_page1() throws Throwable
    {
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[6]/section/div/div/div/ul/li[2]/a/div[2]")).click();
    }

    @Then("^I should see the page$")
    public void	open_article() throws Throwable
    {
        Thread.sleep(3000);
        driver.quit();
    }
    //5
    @Given("^that I'm on the  \"How we do it\"page$")
    public void open_the_Chrome_and_launch_howwedoit() throws Throwable
    {
        driver = new SafariDriver();
        driver.get("https://www.epam.com/how-we-do-it");
    }

    @When("^I click on the words \"our own IP\"$")
    public void go_to_the_page2() throws Throwable
    {
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/section/div/div/div/div/div/div/div[2]/div/p/span/span/u/a")).click();
    }

    @Then("^I go to the SolutionHub page$")
    public void	open_solutionhub() throws Throwable
    {
        Thread.sleep(3000);
        driver.quit();
    }
    //6
    @Given("^that I am on the page \"Our work\"$")
    public void open_the_Chrome_and_launch_ourwork() throws Throwable
    {
        driver = new SafariDriver();
        driver.get("https://www.epam.com/our-work");
    }

    @When("^I click on \"Healthcare\"$")
    public void go_to_the_page3_1() throws Throwable
    {
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/section/div/div/div/ul/li[8]/a")).click();
    }

    @When("^I click on \"Learn more\"$")
    public void go_to_the_page3_2() throws Throwable
    {
        Actions action = new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[4]/section/div/div[2]/ul/li[2]/div[1]"));
        action.moveToElement(element).click().build().perform();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[4]/section/div/div[2]/ul/li[2]/div[2]/div/a")).click();
    }

    @Then("^I go to the solution page for this client$")
    public void	open_solution_customer() throws Throwable
    {
        Thread.sleep(3000);
        driver.quit();
    }
    // 7
    @Given("I am on the page Our work")
    public void i_am_on_the_page1(String string) throws Throwable {
        driver = new SafariDriver();
        driver.get("https://www.epam.com/our-work");
    }

    @When("I click on words Healthcare")
    public void i_click8_on_words(String string) throws Throwable{
        driver.get(driver.findElement(By.className("featured-content-grid__view-more")).getAttribute("href"));
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wrapper")));
    }

    @When("I go to the page SolutionHub")
    public void i_go3_to_the_page_solution_hub() throws Throwable {
        Assert.assertEquals(driver.getCurrentUrl(), "https://solutionshub.epam.com");
        driver.get(driver.findElement(By.className("font-size-17")).getAttribute("href"));
    }

    @Then("I am on page more")
    public void i_on_more(String string) throws Throwable {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.epam.com/our-work/brochures/increasing-brand-value-through-wellness-ecosystems");
        driver.close();
    }
    //8

    @Given("^I am on the Service page$")																			//1
    public void openSafari_page() throws Throwable {
        driver = new SafariDriver();
        driver.get("https://www.epam.com/services");
    }

    @When("I click on EPAM")
    public void i_click_on5_EPAM() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div/div/header/div/a/img")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wrapper")));
    }

    @Then("I go to the main page")
    public void i_go1_to_the_main_page() throws Throwable{
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.epam.com/");
        driver.quit();
    }

}
