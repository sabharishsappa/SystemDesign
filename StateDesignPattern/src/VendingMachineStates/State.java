import java.util.List;

public interface State {

    public void clickOnInsertCoin(VendingMachine vm) throws Exception;
    public void insertCoin(VendingMachine vm, Coin coin) throws Exception;
    public void clickOnStartProductSelection(VendingMachine vm) throws Exception;
    public void chooseProduct(VendingMachine vm) throws Exception;
    public Item DispenseProduct(VendingMachine vm, int codeNumber) throws Exception;
    public int getChange(VendingMachine vm) throws Exception;
    public List<Coin> refundFullMoney(VendingMachine vm) ;
    public void updateInventory(VendingMachine vm,Item item, int codeNumber) throws Exception;


}
