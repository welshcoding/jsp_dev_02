package com.sxtmovie.app.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sxtmovie.mybatis.SqlMapConfig;

public class SXTMovieDAO {
	
	SqlSessionFactory factory = SqlMapConfig.getFactory();
	SqlSession sqlsession;
	
	public SXTMovieDAO() {
		sqlsession = factory.openSession(true);
	}
 
}

