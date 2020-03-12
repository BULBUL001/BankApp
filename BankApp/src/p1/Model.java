package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Model {
	private String name;
	private String cusid;
	private String accntnum;
	private String balance;
	private String email;
	private String pwd;
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet res;
	private int row;
	private String tamt;
	private String taccntnum;
	
	public String getTamt() {
		return tamt;
	}
	public void setTamt(String tamt) {
		this.tamt = tamt;
	}
	public String getTaccntnum() {
		return taccntnum;
	}
	public void setTaccntnum(String taccntnum) {
		this.taccntnum = taccntnum;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCusid(String cusid) {
		this.cusid = cusid;
	}
	public void setAccntnum(String accntnum) {
		this.accntnum = accntnum;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public String getCusid() {
		return cusid;
	}
	public String getAccntnum() {
		return accntnum;
	}
	public String getBalance() {
		return balance;
	}
	public String getEmail() {
		return email;
	}
	public String getPwd() {
		return pwd;
	}
	public Model()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver is loaded");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","human145");
			System.out.println("Connected");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public boolean logIn()
	{
		try {
			pstmt=con.prepareStatement("SELECT * FROM BANKAPP WHERE CUSID=? AND PWD=?");
			pstmt.setString(1, cusid);
			pstmt.setString(2, pwd);
			res = pstmt.executeQuery();
			if(res.next()==true)
			{
				accntnum = res.getString("ACCNTNUM");
				return true;
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return false;
	}
	public boolean checkBalance()
	{
		try {
			pstmt = con.prepareStatement("SELECT * FROM BANKAPP WHERE ACCNTNUM = ?");
			pstmt.setString(1, accntnum);
			res = pstmt.executeQuery();
			if(res.next()==true)
			{
				balance = res.getString("BALANCE");
				return true;
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return false;
	}
	public boolean changePwd()
	{
		try {
			pstmt = con.prepareStatement("UPDATE BANKAPP SET PWD=? WHERE ACCNTNUM=?");
			pstmt.setString(1, pwd);
			pstmt.setString(2, accntnum);
			row = pstmt.executeUpdate();
			if(row == 0)
			{
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();		
		}
		return true;
	}
	public boolean transferAmt()
	{
		try {
			pstmt= con.prepareStatement("UPDATE BANKAPP SET BALANCE = BALANCE - ? WHERE ACCNTNUM=?");
			pstmt.setString(1, tamt);
			pstmt.setString(2, accntnum);
		
			int row = pstmt.executeUpdate();
			pstmt = con.prepareStatement("INSERT INTO BANKSTATEMENT VALUES(?,?,?)");
			pstmt.setString(1, taccntnum);
			pstmt.setString(2, accntnum);
			pstmt.setString(3, tamt);
			pstmt.executeUpdate();
			if(row==0)
			{
				return false;
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return true;
	}
	public ArrayList getStatement()
	{
		ArrayList al = new ArrayList();
		try {
			pstmt = con.prepareStatement("SELECT * FROM BANKSTATEMENT WHERE ACCNTNUM = ?");
			pstmt.setString(1, accntnum);
			res = pstmt.executeQuery();
			while(res.next()==true)
			{
				String temp = res.getString("TAMT");
				al.add(temp);
			}
		} catch (Exception e3) {
			e3.printStackTrace();
		}
		return al;
	}
}
