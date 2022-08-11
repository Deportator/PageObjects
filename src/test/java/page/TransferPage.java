package page;

import com.codeborne.selenide.SelenideElement;
import lombok.Value;

import static com.codeborne.selenide.Selenide.$;

@Value
public class TransferPage {

    private SelenideElement amountField = $("[data-test-id='amount'] input");
    private SelenideElement fromField = $("[data-test-id='from'] input");
    private SelenideElement transferButton = $("[data-test-id=action-transfer]");

    public void moneyTransfer(int amount, String card) {
        amountField.setValue(String.valueOf(amount));
        fromField.setValue(card);
        transferButton.click();
    }
}