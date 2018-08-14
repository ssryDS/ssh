package com.hxs.entity;

public class Printer implements USBInterface1,USBInterface3,USBInterface2{

	private InkBox inkBox;	// 墨盒
	private Paper paper;	// 打印机
	
	
	//打印
	public void printp(){
		System.out.println("在"+paper.showPaper()+"上打印："+inkBox.showInkBox());
	}

	public InkBox getInkBox() {
		return inkBox;
	}

	public void setInkBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}

	public Paper getPaper() {
		return paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	public String device() {
		// TODO Auto-generated method stub
		return "普通打印机";
	}

}
