package com.alura.jdbc.controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoController {

	public void modificar(String nombre, String descripcion, Integer id) {
		// TODO
	}

	public void eliminar(Integer id) {
		// TODO
	}

	public List<?> listar() throws SQLException {
		// TODO
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC",
				"root",
				"29072003");

		Statement statement = con.createStatement();

		boolean execute = statement.execute("select id, nombre, descripcion, cantidad from producto");

		ResultSet resultSet = statement.getResultSet();

		con.close();
		return new ArrayList<>();
	}

    public void guardar(Object producto) {
		// TODO
	}

}
