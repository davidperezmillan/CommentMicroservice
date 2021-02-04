package com.nonave.commentmicroservice.entities;

import java.util.Date;


import lombok.Data;

@Data
public class Comment {

	private long id;
	private String author;
	private String comment;
	private Date fecha;
	private boolean status;


}
