package com.TestNG_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Obj_Manager {

	public static WebDriver driver;

	private Home_Page hp;
	private Sign_Page sp;
	private Shop_Page ssp;
	private Dress_Page dp;
	private Frame_Page fp;
	private Check_Page cp;
	private Check_Page_1 cp1;
	private Check_Page_2 cp2;
	private Pay_Page pp;
	private Confirm con;

	public Pay_Page getPp() {
		pp = new Pay_Page(driver);
		return pp;
	}

	public Confirm getCon() {
		con = new Confirm(driver);
		return con;
	}

	public Check_Page_2 getCp2() {
		cp2 = new Check_Page_2(driver);
		return cp2;
	}

	public Check_Page_1 getCp1() {
		cp1 = new Check_Page_1(driver);
		return cp1;
	}

	public Home_Page getHp() {
		hp = new Home_Page(driver);
		return hp;
	}

	public Sign_Page getSp() {
		sp = new Sign_Page(driver);
		return sp;
	}

	public Shop_Page getSsp() {
		ssp = new Shop_Page(driver);
		return ssp;
	}

	public Check_Page getCp() {
		cp = new Check_Page(driver);
		return cp;
	}

	public Frame_Page getFp() {
		fp = new Frame_Page(driver);
		return fp;
	}

	public Dress_Page getDp() {
		dp = new Dress_Page(driver);
		return dp;
	}

	public Page_Obj_Manager(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

}
