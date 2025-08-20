package com.portfolio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="viewer_table")
public class Viewer {
	
	@Id
	@Column(name="viewer_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="viewerName")
	private String name;
	@Column(name="viewer_email", unique = true)
	private String email;
	
	private String subject;
	
	private String message;

}
