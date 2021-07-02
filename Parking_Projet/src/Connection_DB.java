import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connection_DB {
   
	private Connection cnx ;
	
	public Connection_DB (){
		  try {
              try {
              	Class.forName("com.mysql.cj.jdbc.Driver");
              }catch(ClassNotFoundException e) {
              	e.printStackTrace();
              }
              //Database connection
					 this.cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/javacars","root","");
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	public Connection getCnx() {
		return this.cnx;
	}
	public void SetCar(String Name,long Time,int place) {
		String rq="insert into cars (car,waitTime,place) values (?,?,?)";
		PreparedStatement rs;
		try {
			rs = (PreparedStatement) this.cnx.prepareStatement(rq);
			rs.setString(1,Name);
			rs.setLong(2,Time);
			rs.setInt(3,place);
			rs.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
