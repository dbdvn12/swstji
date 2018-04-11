package com.jigwon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jigwon.models.Board;
import com.jigwon.repositories.BoardRepository;

@RestController
public class BoardController {
	
	@Autowired
	BoardRepository boardrepository;
	
	@GetMapping("/")
	List<Board> getListBoardByTitle() {
		return boardrepository.findByTitle("제목..177");
	}
}
