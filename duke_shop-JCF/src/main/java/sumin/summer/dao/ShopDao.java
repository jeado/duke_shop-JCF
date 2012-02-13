package sumin.summer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import sumin.summer.model.Customer;
import sumin.summer.model.Member;
import sumin.summer.model.Product;
import fw.ConnectionMaker;


public class ShopDao  {
	private ConnectionMaker connectionMaker;
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	private Statement st;

	public ShopDao(ConnectionMaker cm) {
		connectionMaker = cm;
	}

	/**
	 *
	 * <p>
	 * 회원 가입 시 사용
	 * </p>
	 * @param m
	 * @return
	 */
	public int insertMember(Member m) {

		int result=-1;
		try {
			con = connectionMaker.makeConnection();

			pst=con.prepareStatement(
					"insert into edu_user values(?, ?, ?, ?, ?, sysdate,sysdate)");
			pst.setString(1, m.getUserId() );
			pst.setString(2, m.getPassword());
			pst.setString(3, m.getName());
			pst.setString(4, m.getDeptName());
			pst.setString(5, m.getEmail());

			result=pst.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		finally { closeConnection(); }
		return result;
	}

	/**
	 *
	 * <p>
	 *  로그인 시 사용
	 * </p>

	 * @param id
	 * @param passwd
	 * @return
	 * @throws ClassNotFoundException
	 */
	public Customer getCustomer(String id, String passwd) throws ClassNotFoundException {
		Customer cust=null;
		try {
			con=connectionMaker.makeConnection();
			pst=con.prepareStatement(
					"select * from edu_user where user_id=? and password=?");
			pst.setString(1,id);
			pst.setString(2, passwd);
			/**	3만들어진 Statement를 실행한다 **/
			rs=pst.executeQuery();
			/**4 조회의 경우 SQL 쿼리의 실행 결과를 ResultSet으로 받아서 정보를 저장할 오브젝트(여기서는 Customer 에 옮겨준다.**/
			while ( rs.next()) {
				//cust=new Customer(rs.getString(1),rs.getString(2),rs.getString(5));
			}
			/**6. JDBC API가 만들어내는 예외;exception 를 잡아서 직접 처리하거나, 메소드에 throws를 선언해서 예외가 발생하면 메소드 밖으로 던지게 한다.**/
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			/**5. 작업 중에 생성된 Connection, Statement, ResultSet 같은 리소스는 작업을 마친 후 반드시 닫아준다.
			 **/
			closeConnection();
		}
		return cust;
	}

	/**
	 *
	 * <p>
	 * 쇼핑몰 아이템 조회
	 * </p>
	 *
	 */
	public ArrayList<Product> getAllProduct(){
		ArrayList <Product> lists = new ArrayList <Product> ();

		try{
			con=connectionMaker.makeConnection();
			st=con.createStatement();
			rs = st.executeQuery("select * from product");
			while (rs.next()){
				lists.add(new Product(rs.getString(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getInt(5),rs.getInt(6)));
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		finally{
			closeConnection();
		}
		return lists;
	}

	private void closeConnection(){
		if (rs != null)try {rs.close();} catch (Exception e) {e.printStackTrace();}
		if (st != null)try {st.close();} catch (Exception e) {e.printStackTrace();}
		if (pst != null)try {pst.close();} catch (Exception e) {e.printStackTrace();}
		if (con != null)try {con.close();} catch (Exception e) {e.printStackTrace();}
	}

}
