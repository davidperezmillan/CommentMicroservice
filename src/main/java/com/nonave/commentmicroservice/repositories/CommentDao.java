package com.nonave.commentmicroservice.repositories;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.nonave.commentmicroservice.entities.Comment;


@Repository
public class CommentDao {
	
    private static List<Comment> list = new ArrayList<Comment>();
    
    static
    {
        list.add(new Comment());
        list.add(new Comment());
        list.add(new Comment());
    }
	
	public List<Comment> findAll(){
		return list;
	}

	public Optional<Comment> findById(long id) {
		for (Comment comment : list) {
			if (comment.getId() == id)
				return Optional.of(comment);
		}
		return Optional.empty();
	}

	public void save(Comment comment) {
		list.add(comment);
	}

	public boolean delete(long id) {
		boolean okko = Boolean.FALSE;
		for (Comment comment : list) {
			if (comment.getId() == id) {
				list.remove(comment);
				okko = true;
			}
		}
		return okko;
	}
	
}
