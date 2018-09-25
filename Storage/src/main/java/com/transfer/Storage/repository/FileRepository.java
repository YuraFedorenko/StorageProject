package com.transfer.Storage.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.transfer.Storage.model.File;
import com.transfer.Storage.model.Storage;

@Repository
public class FileRepository {
	
	@PersistenceContext
	private EntityManager em;

	public void put(Storage storage, File file) {
		file.setStorage(storage);
		em.persist(file);
	}

}
