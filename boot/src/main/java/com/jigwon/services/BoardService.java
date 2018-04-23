package com.jigwon.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jigwon.models.Board;
import com.jigwon.repositories.BoardRepository;

@Service
public class BoardService {
	
	@Autowired
	BoardRepository boardRepository;
	
	public Board patchBoard(Long id) {
		Optional<Board> board = boardRepository.findById(id);
		if(board.isPresent()) {
			Board fixBoard = board.get();
			fixBoard.setTitle("(patch) " + board.get().getTitle());
			fixBoard.setContent("(patch) " + board.get().getContent());
			return boardRepository.save(fixBoard);
		}
		return null;
	}
	
	public List<Board> getFindAll() {
		return boardRepository.findAll();
	}
	
	public List<Board> getFindTitle(String title) {
		return boardRepository.findByTitle(title);
	}
	
	public List<Board> getFindContent(String content) {
		return boardRepository.findByContent(content);
	}
	
	public List<Board> getFindWriterContaining(String writer) {
		return boardRepository.findByWriterContaining(writer);
	}
}
