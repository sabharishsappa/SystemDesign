package VendingMachineStates;

import State;
import VendingMachine;
import Item;
import Coin;
import java.util.*;

import java.util.List;

public class IdleState implements State {

    public IdleState(VendingMachine vm){
        System.out.println("Currently Vending Machine is in Idle State");
        vm.setCoinsList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoin(VendingMachine vm) throws Exception {
        vm.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine vm, Coin coin) throws Exception {
        throw new Exception("You cannot insert coin in Idle State");

    }

    @Override
    public void clickOnStartProductSelection(VendingMachine vm) throws Exception {
        throw new Exception("First you need click on Insert Coin Button");

    }

    @Override
    public void chooseProduct(VendingMachine vm) throws Exception {
        throw new Exception("You cannot choose the product in idle state");

    }

    @Override
    public Item DispenseProduct(VendingMachine vm, int codeNumber) throws Exception {
        throw new Exception("You cannot Dispense product in Idle State");

    }

    @Override
    public int getChange(VendingMachine vm) throws Exception {
        throw new Exception("First you need to click on Insert coin and insert some coins");

    }



    @Override
    public List<Coin> refundFullMoney(VendingMachine vm) {
        throw new Exception("First you need to click on insert coin button and insert some coins");

    }


    @Override
    public void updateInventory(VendingMachine vm, Item item, int codeNumber) throws Exception {
        throw new Exception("");

    }




}
