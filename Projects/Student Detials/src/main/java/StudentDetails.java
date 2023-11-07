import java.sql.*;

public class StudentDetails {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("JDBC Driver loaded successfully.");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_project", "root", "root");
        System.out.println("Extablished Connection successfully.");

        Statement st = con.createStatement();
// 1> DataBase Creation
        // st.execute("create database JDBC_Project");
        // System.out.println("Database Created successfully.");

// 2> Table Creation
        // st.execute("create table student(sid int primary key,sname varchar(20), age int)");
        // System.out.println("Table Created successfully.");

// 2> Table Data or Values Inserted
        // st.execute("insert into student values(1,'nutan',20)");
        // System.out.println("Student data Inserted successfully.");

// 2> Table Data or Values Inserted
        //st.addBatch("insert into student values(2,'Durga',19)");
        //st.addBatch("insert into student values(3,'Nandkumar',23)");
        //st.addBatch("insert into student values(4,'Vishal',25)");
        //st.addBatch("insert into student values(5,'Rani',22)");
        //st.executeBatch();
        //System.out.println("Student data Inserted successfully.");

// 3> Display Data In the Table
        ResultSet rs = st.executeQuery("select * from student");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }

// 3> Update Data In the Table
        //st.execute("update student set sname='Vikas',age=45 where sid=3");
        //System.out.println("Data Updating Successfully.");


// 4> Delete Data In the Table
        //st.execute("delete from student where sid=4");
        //System.out.println("Data Deleting Successfully.");

    }
}
