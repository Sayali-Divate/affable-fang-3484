package mgnrega.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mgnrega.bean.Employee;
import mgnrega.utility.Database;

public class EmployeeDaoImp implements EmployeeDao {

	@Override
	public String registerEmployee(Employee employee) {
		
		String msg = "Registration unsuccessfull..";
		
		try(Connection con = Database.Connection()){
			
			PreparedStatement ps = con.prepareStatement("insert into registration values(?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setInt(1, employee.getAdharNo());
			ps.setString(2, employee.getName());
			ps.setInt(3, employee.getAge());
			ps.setInt(4, employee.getLandHoldings());
			ps.setInt(5, employee.getBankAccount());
			ps.setString(6, employee.getBankName());
			ps.setString(7, employee.getBranchName());
			ps.setString(8, employee.getIndividualAsset());
			ps.setInt(9, employee.getPostNo());
			ps.setString(10, employee.getPostName());
			ps.setString(11, employee.getState());
			
			int n = ps.executeUpdate();
			
			if(n>0) msg = "Registration done successfully..";
			
		} catch (SQLException e) {
			
			msg = e.getMessage();
		}		
		
		return msg;
	}

}
