public class Main {
    public static void main(String[] args) {

        ConfigurationCaretaker careTakerObject = new ConfigurationCaretaker();

        ConfigurationOriginator originatorObject = new ConfigurationOriginator(5,10);
        ConfigurationMemento snapshot1 = originatorObject.createMemento();
        careTakerObject.addMemento(snapshot1);

        originatorObject.setHeight(7);
        originatorObject.setWidth(12);

        ConfigurationMemento snapshot2 = originatorObject.createMemento();
        careTakerObject.addMemento(snapshot2);

        originatorObject.setHeight(9);
        originatorObject.setWidth(14);

        ConfigurationMemento restoredStateMementoObject = careTakerObject.undo();
        originatorObject.restoreMemento(restoredStateMementoObject);

        System.out.println("height: "+originatorObject.height+ " width: "+originatorObject.width);
    }
}