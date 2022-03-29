package chap15.book.exercise.p07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardList() {
		List<Board> list = new ArrayList();
		
		Board b1 = new Board("제목1", "내용1");
		list.add(b1);
		
		Board b2 = new Board("제목2", "내용2");
		list.add(b2);
		
		Board b3 = new Board("제목3", "내용3");
		list.add(b3);
		
		return list;
	}

}
