package com.nttdata;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;


class Policytest {

	@Test
	void test() {
		int check=Policy.Insert();
		assertEquals(check, 1);
	}
	@Test
	void testFetch() 
	{
		Collection<Object> col=new ArrayList<Object>();
		assertEquals(0,col.size());
	}
	@Test
	void testDelete() throws ClassNotFoundException
	{
		int check=Policy.Delete();
		assertEquals(check, 1);
	}
	@Test
	void testUpdate() throws ClassNotFoundException
	{
		int check=Policy.Update();
		assertEquals(check, 1);
	}
}
