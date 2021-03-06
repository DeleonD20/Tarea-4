package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class dbInsert extends Conexion {
	public boolean registrar(usuariosdb usr) {
		PreparedStatement ps = null;
		Connection con = getConexion();
		String sql = "INSERT INTO users(Usuario, Password, Nombre, Apellido, Email) VALUES(?,?,?,?,?)";
		
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, usr.getUsuario());
			ps.setString(2, usr.getPassword());
			ps.setString(3, usr.getNombre());
			ps.setString(4, usr.getApellido());
			ps.setString(5, usr.getCorreo());
			ps.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return false;
		}
		
	}

	public boolean editar(usuariosdb usr) {
		PreparedStatement ps2 = null;
		Connection con = getConexion();
		String sql2 = "UPDATE users SET Usuario='"+usr.getUsuario()+"',Password='"+usr.getPassword()+"',Nombre='"+usr.getNombre()+"',Apellido='"+usr.getApellido()+"',Email='"+usr.getCorreo()+"'WHERE ID="+usr.getID();
		
		try {
			ps2 = (PreparedStatement) con.prepareStatement(sql2);	
			ps2.setString(1, usr.getID());
			ps2.setString(2, usr.getUsuario());
			ps2.setString(3, usr.getPassword());
			ps2.setString(4, usr.getNombre());
			ps2.setString(5, usr.getApellido());
			ps2.setString(6, usr.getCorreo());
			ps2.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return false;
		}
		
	}
}
