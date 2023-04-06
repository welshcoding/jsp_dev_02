package com.sxtmovie.app.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sxtmovie.mybatis.SqlMapConfig;

public class SXTMovieDAO {
	
	SqlSessionFactory factory = SqlMapConfig.getFactory();
	SqlSession sqlsession;
	
	public SXTMovieDAO() {
		sqlsession = factory.openSession(true);
	}
	
	public boolean LoginAction(String userId, String userPw) {
		
		boolean result = false;
		
		Map<String, String> data = new HashMap<>();
		data.put("userId", userId);
		data.put("userPw", userPw);
		
		int cnt = sqlsession.selectOne("SXTMovie.LoginAction",data); 
		if(cnt==1) {result = true;}
		
		return result;
	}
	
	public List<TicketBean> TicketSelect(String userId){
		return sqlsession.selectList("SXTMovie.TicketSelect", userId); 
	}
 
	public List<ReviewBean> ReviewSelect(String userId){
		return sqlsession.selectList("SXTMovie.ReviewSelect", userId); 
	}
	
	public int DblCheck(String userId) {
		return sqlsession.selectOne("SXTMovie.DblCheck",userId); 
	}
}

