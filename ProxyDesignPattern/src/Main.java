public class Main {
    public static void main(String[] args) {

        try{
            EmployeeDao empTableObj = new EmployeeDaoProxy();
            empTableObj.create("USER",new EmployeeDo());
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}