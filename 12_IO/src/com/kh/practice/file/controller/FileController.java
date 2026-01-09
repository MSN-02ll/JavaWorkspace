package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {

	private FileDAO fd = new FileDAO();
	
	//DAO에 매개변수를 전달하고, DAO로부터 전달받은 값을 다시 반환
	public boolean checkName(String file) {
	
		return fd.checkName(file);
	}
	
	// 전달받은 매개변수를 변경하고 DAO에 전달
	public void fileSave(String file, StringBuilder sb){
		fd.fileSave(file, sb.toString());
		
	}
	
	// DAO에 매개변수를 전달하고, DAO로부터 전달받은 값을 다시 반환
	public StringBuilder fileOpen(String file) {

		return;
	}
	
	// 전달받은 매개변수를 변경하고 DAO에 전달
	public void fileEdit(String file, StringBuilder sb) {
		
	}
	
}
