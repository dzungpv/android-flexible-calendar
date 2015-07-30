package com.azurechen.fcalendar.data;

import android.view.View;

public class Day {
	
	private int mYear;
	private int mMonth;
	private int mDay;

	private View mView;
	
	public Day(int year, int month, int day){
		this.mYear = year;
		this.mMonth = month;
		this.mDay = day;
	}
	
	public int getMonth(){
		return mMonth;
	}
	
	public int getYear(){
		return mYear;
	}
	
	public int getDay(){
		return mDay;
	}

	public void setView(View view) {
		mView = view;
	}

	public View getView() {
		return mView;
	}

}
