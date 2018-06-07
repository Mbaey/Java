package com.withyou.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.withyou.bean.Mgr;

public interface MgrDao {
	public boolean insertMgr(Mgr mgr) throws SQLException;
	public boolean deleteMgr(Mgr mgr) throws SQLException;
	public boolean updateMgrById(Mgr mgr, int id) throws SQLException;
}
