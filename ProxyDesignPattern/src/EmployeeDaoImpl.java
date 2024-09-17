public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public EmployeeDo get(String client, int employeeID) throws Exception {

        System.out.println("Fetching Data from the Database");
        return new EmployeeDo();
    }

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {

        System.out.println("created new row in the Employee Table");

    }

    @Override
    public void delete(String client, int employeeID) throws Exception {

        System.out.println("Deleting row with the employee ID: " + employeeID);

    }
}
