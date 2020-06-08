package ejercicicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AccesoDatos {
	
	public static void insertarDepto(Connection con, int num, String nombre, String loc) {
		if(con == null) {
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		}
		try (PreparedStatement ps = con.prepareStatement("INSERT INTO DEPARTAMENTOS VALUES (?, ?, ?)")){
			ps.setInt(1, num);
			ps.setString(2, nombre);
			ps.setString(3, loc);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Departamento Insertado");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e, "EXCEPTION", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public static void insertarDepto(Connection con, Departamento dp) {
		if(con == null) {
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		}
		try (PreparedStatement ps = con.prepareStatement("INSERT INTO DEPARTAMENTOS VALUES (?, ?, ?)")){
			ps.setInt(1, dp.getCod());
			ps.setString(2, dp.getNombre());
			ps.setString(3, dp.getLoc());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Departamento Insertado");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e, "EXCEPTION", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public static ArrayList<Departamento> listarDepartamento(Connection con){
		if(con == null) {
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		}
		ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
		try (PreparedStatement ps = con.prepareStatement("SELECT * FROM DEPARTAMENTOS");
			 ResultSet rs = ps.executeQuery()){
			Departamento dp;
			while(rs.next()) {
				dp = new Departamento(rs.getInt(1), rs.getString(2), rs.getString(3));
				departamentos.add(dp);
			}
			JOptionPane.showMessageDialog(null, "Departamentos listados correctamente");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e, "EXCEPTION", JOptionPane.WARNING_MESSAGE);
		}
		return departamentos;
	}
	
	public static void borrarDepartamento(Connection con, int num) {
		if(con == null) {
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		}
		try (PreparedStatement ps = con.prepareStatement("DELETE FROM DEPARTAMENTOS WHERE DEPT_NO = ?")){
			ps.setInt(1, num);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Departamento eliminado correctamente");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e, "EXCEPTION", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public static void actualizarDepartamento(Connection con , int num, String loc) {
		if(con == null) {
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		}
		try (PreparedStatement ps = con.prepareStatement("UPDATE DEPARTAMENTOS SET LOC = ? WHERE DEPT_NO = ?")){
			ps.setString(1, loc);
			ps.setInt(2, num);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Departamento actualizado correctamente");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e, "EXCEPTION", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public static void actualizarDepartamento(Connection con , Departamento dp) {
		if(con == null) {
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		}
		try (PreparedStatement ps = con.prepareStatement("UPDATE DEPARTAMENTOS SET DNOMBRE = ?, LOC = ? WHERE DEPT_NO = ?")){
			ps.setString(1, dp.getNombre());
			ps.setString(2, dp.getLoc());
			ps.setInt(3, dp.getCod());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Departamento actualizado correctamente");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e, "EXCEPTION", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public static Departamento devolverDepartamento(Connection con, int num) {
		if(con == null) {
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		}
		Departamento dp = null;
		try (PreparedStatement ps = con.prepareStatement("SELECT * FROM DEPARTAMENTOS WHERE DEPT_NO = ?")){
			ps.setInt(1, num);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				dp = new Departamento(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e, "EXCEPTION", JOptionPane.WARNING_MESSAGE);
		}
		return dp;
	}
	
	public static void subirSalario(Connection con, double d, int num) {
		if(con == null) {
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		}
		try (PreparedStatement ps = con.prepareStatement("UPDATE EMPLEADOS SET SALARIO = (SALARIO + ?) WHERE DEPT_NO = ?")){
			ps.setDouble(1, d);
			ps.setInt(2, num);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Salario actualizado correctamente");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e, "EXCEPTION", JOptionPane.WARNING_MESSAGE);
		}
	}

}
