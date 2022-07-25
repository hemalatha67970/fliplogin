package org.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test1 {
	
public static void main(String[] args) {
	
	
	int num=1634;
	int n=num;
	int dig=0;
	while (num>0) {
	dig++;
	num=num/10;
	}
	System.out.println(dig);
	
	num=n; int rev=0; int sum=0;
	while(num>0) {
		rev=num%10;
		sum=sum+(int)Math.pow(rev, dig);
		num=num/10;
	}
	if (n==sum) {
	System.out.println("armstrong");	
	} else {
System.out.println("not arms");
	}
	
	
	
}
}
