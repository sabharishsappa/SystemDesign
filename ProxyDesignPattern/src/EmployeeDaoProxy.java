public class EmployeeDaoProxy implements EmployeeDao {

    EmployeeDao employeeDaoOj;

    public EmployeeDaoProxy() {
        employeeDaoOj = new EmployeeDaoImpl();
    }

    @Override
    public EmployeeDo get(String client, int employeeID) throws Exception {
        if(client.equals("ADMIN")||client.equals("USER"))
            return employeeDaoOj.get(client, employeeID);

        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeID) throws Exception {

        if(client.equals("ADMIN"))
        {
            employeeDaoOj.delete(client, employeeID);
            return ;
        }

        throw new Exception("Access Denied");

    }

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        if(client.equals("ADMIN"))
        {
            employeeDaoOj.create(client,obj);
            return;
        }

        throw new Exception("Access Denied");


    }
}
