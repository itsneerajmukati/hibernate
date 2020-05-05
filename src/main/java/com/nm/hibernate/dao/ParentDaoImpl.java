package com.nm.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nm.hibernate.model.Parent;

@Repository
public class ParentDaoImpl implements ParentDao {
	
	@Autowired
	EntityManager entityManager;

	@Override
	public List<Parent> test() {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Parent> cq = cb.createQuery(Parent.class);
		Root<Parent> root = cq.from(Parent.class);
		cq.orderBy(cb.asc(root.get("id")));
		TypedQuery<Parent> q = entityManager.createQuery(cq);
		return q.getResultList();
	}
	
}
