package Utility;

import java.lang.reflect.Field;

import Entity.Customer;

interface IRepostory<T> {
	
	T addEntity(T entity);
	
//	T editEntity(Object id, T entity);
//	
//	boolean deleteEntity(Object id);
//	
//	boolean checkIfValExists(Predicate<T> pre);
//	
//	T getEntity(String column, Object val);
//	
//	List<T> getEntities();
//	
//	List<T> getFilteredEntities(Predicate<T> pre);
}

// class fRepository<T> implements IRepostory<T> {

//	@Override
//	public T addEntity(T entity) {
//		String tableName = entity.getClass().getSimpleName();
//		Field[] fields = entity.getClass().getDeclaredFields();
//		
//		String query = "INSERT INTO " + tableName + " () VALUES(" + fields[0].get(obj);
//		
//		return null;
//	}

//	@Override
//	public T editEntity(Object id, T entity) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean deleteEntity(Object id) {
//		// TODO Auto-generated method stub
//		return false;
//	}
		
//}