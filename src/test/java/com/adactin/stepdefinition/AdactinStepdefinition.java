package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.AdactinRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinStepdefinition {
	
	public static WebDriver driver=AdactinRunner.driver;
	
	@Given("^user Lanuch The Url In Adactin Application$")
	public void user_Lanuch_The_Url_In_Adactin_Application() throws Throwable {
		driver.get("http://adactinhotelapp.com/");
	    
	}

	@When("^user Enter The Username  In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Pavithraarumugam");
	   
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Pavi@123");
	   
	}

	@Then("^user Click The Login Button And It Navigate To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	   
	}

	@When("^user Choose The Location In The Location Dropdown Field$")
	public void user_Choose_The_Location_In_The_Location_Dropdown_Field() throws Throwable {
		WebElement findElement = driver.findElement(By.xpath("//select[@id='location']"));
		   Select s = new Select(findElement);
		
		   s.selectByValue("London");
	   
	}

	@When("^user Select The Hotels In The  Dropdown Field$")
	public void user_Select_The_Hotels_In_The_Dropdown_Field() throws Throwable {
	   WebElement findElement2 = driver.findElement(By.xpath("//select[@name='hotels']"));
	   Select t = new Select(findElement2);
	   boolean multiple = t.isMultiple();
	   System.out.println(multiple);
	   t.selectByValue("Hotel Sunshine");
	    
	}

	@When("^user Select The Roomtype In The Select Roomtype Dropdown Field$")
	public void user_Select_The_Roomtype_In_The_Select_Roomtype_Dropdown_Field() throws Throwable {
		WebElement findElement3 = driver.findElement(By.xpath("//select[@id='room_type']"));
		   Select b = new Select(findElement3);
		   b.selectByVisibleText("Standard");
	    
	}

	@When("^user Choose The Number Of Room In The Dropdown Field$")
	public void user_Choose_The_Number_Of_Room_In_The_Dropdown_Field() throws Throwable {
		WebElement findElement4 = driver.findElement(By.xpath("//select[@name='room_nos']"));
		   Select c = new Select(findElement4);
		   c.selectByVisibleText("1 - One");
	    
	}

	@When("^user Enter Check In Date In The Dates Field$")
	public void user_Enter_Check_In_Date_In_The_Dates_Field() throws Throwable {
		WebElement findElement5 = driver.findElement(By.xpath("//input[@id='datepick_in']"));
	    findElement5.click();
	    findElement5.clear();
	    findElement5.sendKeys("15/10/2023");
	    
	}

	@When("^user Enter Check Out Date In The Date Field$")
	public void user_Enter_Check_Out_Date_In_The_Date_Field() throws Throwable {
		WebElement findElement6 = driver.findElement(By.id("datepick_out"));
	    findElement6.click();
	    findElement6.clear();
	    findElement6.sendKeys("17/10/2023");
	   
	}

	@When("^user  Select The Adults Per Room In The Dropdown Field$")
	public void user_Select_The_Adults_Per_Room_In_The_Dropdown_Field() throws Throwable {
		WebElement findElement7 = driver.findElement(By.xpath("//select[@id='adult_room']"));
	    
	    Select e = new Select(findElement7);
	    e.selectByIndex(1);
	    
	}

	@When("^user Choose The Children Per Room In The Dropdown Field$")
	public void user_Choose_The_Children_Per_Room_In_The_Dropdown_Field() throws Throwable {
		WebElement findElement8 = driver.findElement(By.xpath("//select[@id='child_room']"));
	    Select f = new Select(findElement8);
	    f.selectByIndex(0);
	    
	}

	@Then("^user Click The Search Button And It Navigate To Next Page$")
	public void user_Click_The_Search_Button_And_It_Navigate_To_Next_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	}

	@When("^user Choose The Select Hotel In The Below The Ratio Button$")
	public void user_Choose_The_Select_Hotel_In_The_Below_The_Ratio_Button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
	    
	}

	@Then("^user Click The Continue Button And It Navigate To Next Page$")
	public void user_Click_The_Continue_Button_And_It_Navigate_To_Next_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@When("^user Enter The First Name In The First Name Field$")
	public void user_Enter_The_First_Name_In_The_First_Name_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("PAVITHR");
	    
	}

	@When("^user Enter The Last Name In The Last Name Field$")
	public void user_Enter_The_Last_Name_In_The_Last_Name_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(" ARUMUGAM");
	    
	}

	@When("^user Enter The Billing Address In The Address Field$")
	public void user_Enter_The_Billing_Address_In_The_Address_Field() throws Throwable {
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Anna nagar,Chennai-600040");
	    
	}

	@When("^user Enter The Credit Card No In The Credit Card Field$")
	public void user_Enter_The_Credit_Card_No_In_The_Credit_Card_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567812345678");
	   
	}

	@When("^user Choose The Credit Card Type In The Below   The Dropdown Field$")
	public void user_Choose_The_Credit_Card_Type_In_The_Below_The_Dropdown_Field() throws Throwable {
		WebElement findElement9 = driver.findElement(By.xpath("//select[@id='cc_type']"));
	    Select g = new Select(findElement9);
	    g.selectByIndex(2);
	    
	}

	@When("^user Choose The Month And Year In The Below The Dropdown Field$")
	public void user_Choose_The_Month_And_Year_In_The_Below_The_Dropdown_Field() throws Throwable {
		WebElement findElement10 = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		   Select h = new Select(findElement10);
		   boolean multiple2 = h.isMultiple();
		   System.out.println(multiple2);
		   h.selectByValue("10");
		   WebElement findElement11 = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		   Select k = new Select(findElement11);
		   k.selectByIndex(13);
	    
	}

	@When("^user Enter The CVV Number In The Cvv Number Field$")
	public void user_Enter_The_CVV_Number_In_The_Cvv_Number_Field() throws Throwable {
		WebElement findElement12 = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		   findElement12.sendKeys("699");
	    
	}

	@Then("^Click The Book Now Button And It Navigate To Next Page$")
	public void click_The_Book_Now_Button_And_It_Navigate_To_Next_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@type='button']")).click();
	   
	}}

