/*
	
	Day 6: JavaScript Dates

	Task

	Given a date string, dateString , in the format MM/DD/YYYY, find and return the day name for that date. Each day name must be one of the following strings: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, or Saturday. For example, the day name for the date 12/07/2016 is Wednesday.



*/

function getDayName(dateString) {
    const weekday = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"];
    
    let arr=dateString.split('/');
    
    let str;
    str=arr[2]+"-"+arr[0]+"-"+arr[1];
    const date=new Date(str);
    let dayName=weekday[date.getDay()];
    // Write your code here
    
    return dayName;
}