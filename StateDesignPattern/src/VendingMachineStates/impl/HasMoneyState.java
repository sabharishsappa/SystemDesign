package VendingMachineStates;

import java.util.ArrayList;
import java.util.List;

public class HasMoneyState implements State{

    public HasMoneyState(VendingMachine vm){
        System.out.println("Currently Vending Machine is in HasMoney State");
    }

    @Override
    public void clickOnInsertCoin(VendingMachine vm) throws Exception {
        System.out.println("You clicked on insert coin");
    }

    @Override
    public void insertCoin(VendingMachine vm,Coin coin) throws Exception {
        System.out.println("Accepted the Coin");
        vm.addCoin(coin);

    }

    @Override
    public void clickOnStartProductSelection(VendingMachine vm) throws Exception {
        System.out.println("You clicked on start product selection");
        vm.setVendingMachineState(new SelectionState());

    }

    @Override
    public void chooseProduct(VendingMachine vm) throws Exception {
        throw new Exception("You need to click on start product selection button");

    }

    @Override
    public Item DispenseProduct(VendingMachine vm, int codeNumber) throws Exception {
        throw new Exception("");

    }

    @Override
    public int getChange(VendingMachine vm) throws Exception {
        throw new Exception("");

    }



    @Override
    public List<Coin> refundFullMoney(VendingMachine vm) {
        throw new Exception("");

    }


    @Override
    public void updateInventory(VendingMachine vm, Item item, int codeNumber) throws Exception {
        throw new Exception("");

    }
}
