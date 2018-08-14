package com.hxs.entity;

public class Computer {
	USBInterface1 usbInterface1;
	USBInterface3 usbInterface3;
	USBInterface2 usbInterface2;
	
	
	public void print(){
		System.out.println("print");
	}

	
	public USBInterface1 getUsbInterface1() {
		return usbInterface1;
	}
	public void setUsbInterface1(USBInterface1 usbInterface1) {
		this.usbInterface1 = usbInterface1;
	}
	public USBInterface3 getUsbInterface3() {
		return usbInterface3;
	}
	public void setUsbInterface3(USBInterface3 usbInterface3) {
		this.usbInterface3 = usbInterface3;
	}
	public USBInterface2 getUsbInterface2() {
		return usbInterface2;
	}
	public void setUsbInterface2(USBInterface2 usbInterface2) {
		this.usbInterface2 = usbInterface2;
	}
	
	
	
	
	

}
