package com.stackroute.datamunger;

import java.util.Scanner;

import com.stackroute.datamunger.query.parser.QueryParser;

public class DataMunger {

	public static void main(String[] args) {

		
		//read the query from the user
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		//create an object of QueryParser class
		QueryParser qp = new QueryParser();
		
		/*
		 * call parseQuery() method of the class by passing the query string which will
		 * return object of QueryParameter
		 */
		qp.parseQuery(str);
		

	}

	

}
