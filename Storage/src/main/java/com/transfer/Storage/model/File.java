package com.transfer.Storage.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class File {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="file_name")
	private String name;
	
	@Column(name="file_format")
	private String format;
	
	@Column(name="file_size")
	private long size;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Storage storage;
}
