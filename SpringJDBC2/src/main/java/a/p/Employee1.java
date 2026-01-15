package a.p;

import org.springframework.jdbc.core.JdbcTemplate;

public class Employee1 implements EmployeeDeo{

	
	
	private JdbcTemplate jtemple;
	
	
	
	@Override
	public String toString() {
		return "Employee1 [jtemple=" + jtemple + "]";
	}



	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee1(JdbcTemplate jtemple) {
		super();
		this.jtemple = jtemple;
	}



	public JdbcTemplate getJtemple() {
		return jtemple;
	}



	public void setJtemple(JdbcTemplate jtemple) {
		this.jtemple = jtemple;
	}



	public int intsert(Employee employee) {
		// TODO Auto-generated method stub
		
		String q="insert into EMPY(id,name,city) values(?,?,?)";
		
		int result= this.jtemple.update(q,employee.getId(),employee.getName(),employee.getCity());
		
		return result;
	}



	@Override
	public int edit(Employee employee) {
		// TODO Auto-generated method stub
		
		String q="update EMPY set name=?, city=? where id=?";
		int result = this.jtemple.update(q,employee.getName(),employee.getCity(),employee.getId());
		
		return result;
	}



	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		
		String q="delete from EMPY where id=?";
		int result = this.jtemple.update(q,id);
		return result;
	}

}
