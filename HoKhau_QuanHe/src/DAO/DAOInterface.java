package DAO;

import java.util.ArrayList;

public interface DAOInterface<T> {
	public int insert(T t);
	public int update(T t);
	public int delete(T t);
	public ArrayList<T> selectALL();
	public T selectByusername(T t);
	public ArrayList<T> selectByCondition(String condition);
	public boolean checkExit(T t);
	
}
