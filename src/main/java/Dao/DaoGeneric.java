package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.projetojsf.HibernateUtil;

public class DaoGeneric<E> {
	
	private EntityManager entityManager = HibernateUtil.getEntityManager();
	
	public void salvar(E entidade) {
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(entidade);
		entityTransaction.commit();
	}
	
	public E atualizar(E entidade) {
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		E entidadeNova = entityManager.merge(entidade);
		entityTransaction.commit();
		
		return entidadeNova;
	}
	
	@SuppressWarnings("unchecked")
	public E buscaPorID(E entidade) {
		
		Object id = HibernateUtil.getPrimaryKey(entidade);
		return (E) entityManager.find(entidade.getClass(), id);
	}
	
	@SuppressWarnings("unchecked")
	public E buscaPorIDPorClass(Long id, Class<E> entidade) {
		return (E) entityManager.find(entidade.getClass(), id);
	}
	
	public void deletarPorId(E entidade) {
		
		Object id = HibernateUtil.getPrimaryKey(entidade);
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		entityManager.createNativeQuery("delete from " + entidade.getClass().getSimpleName().toLowerCase()
				+ " where id =" + id).executeUpdate();
		
		entityTransaction.commit();		
	}
	
	@SuppressWarnings("unchecked")
	public List<E> buscarTodos(Class<E> entidade) {
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		List<E> lista = entityManager.createQuery("from " + entidade.getName()).getResultList();
		
		entityTransaction.commit();	
		
		return lista;
	}
	
//	@SuppressWarnings("unchecked")
//	public List<E> bsucarPorTodos(E entidade) {
//		return (E) entityManager.
//	}

}
