package com.screens.babilo.service;

import java.sql.SQLDataException;
import java.sql.SQLException;

public interface StoreProcedureCustomRepository {
	
	public void executeStoredProcedure(String storedProcedureName) throws SQLDataException;
	
	public void executeStoredProcedure(String storedProcedureName, String...paramName) throws SQLException;

}
