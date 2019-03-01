import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Perform Lambda on Array list
 */

public class LambdaExpression{


    private void performStreamMap() {
        List<WebElement> list = new ArrayList<WebElement>();
        WebElement element = list.stream().map(webelement -> webelement.findElement(By.id("customer_name"))).findFirst().orElse(null);
        String elementName = list.stream().map(text -> text.findElement(By.id("customer_name")).getAttribute("name")).findFirst().orElse(null);
    }

    private void performStreamMapFilter() {
        List<WebElement> list = new ArrayList<WebElement>();
        WebElement webele = list.stream().map(webelement -> webelement.findElement(By.id("customer_name"))).filter(element -> element.getText().equals("customer")).findFirst().orElse(null);
    }

    private void performStreamMapFilterComplex() {
        List<WebElement> elementList = new ArrayList<WebElement>();


        WebElement webele = elementList.stream().map(webElements -> webElements.findElements(By.tagName("td"))) // From the elementList, retrieve a list of elements with tag "td"
                .filter(element -> element.get(0).getText().equals("offset")) //Filter the 0 element from the td list and check whether its text is offset.
                .map(element -> element.get(1)).findFirst().orElse(null); // if text is equal to offset, from the td list, retrieve 1 element.

    }
}