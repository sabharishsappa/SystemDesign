package VendingMachineStates;

import State;

import java.util.ArrayList;
import java.util.List;

public class SelectionState implements State{

    public SelectionState(VendingMachine vm){
        System.out.println("Currently Vending Machine is in Selection State");
        vm.setCoinsList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoin(VendingMachine vm) throws Exception {
        vm.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine vm) throws Exception {
        throw new Exception("");

    }

    @Override
    public void clickOnStartProductSelection(VendingMachine vm) throws Exception {
        throw new Exception("");

    }

    @Override
    public void chooseProduct(VendingMachine vm) throws Exception {
        throw new Exception("");

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
