package com.jigwon.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.jigwon.models.Board;


public interface BoardRepository extends CrudRepository<Board, Long>{
	List<Board> findAll();
	
	List<Board> findByTitle(String title);
	
	List<Board> findByContent(String content);
	
	List<Board>	findByWriterContaining(String writer);
	
}
