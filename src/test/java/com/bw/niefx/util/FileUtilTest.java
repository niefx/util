package com.bw.niefx.util;

import static org.junit.Assert.*;

import java.io.File;
import java.util.List;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTempDirectory() {
		
		File t1 = FileUtil.getTempDirectory();
		String string = t1.toString();
		System.out.println(string);
		
	}

	@Test
	public void testGetUserDirectory() {
		File userDirectory = FileUtil.getUserDirectory();
		String string = userDirectory.toString();
		System.out.println(string);
	}

	@Test
	public void testReadTextFileList() {
		String path ="C:\\Users\\X\\Desktop\\a.txt";
		List<String> list = FileUtil.readTextFileList(new File(path));
		for (String string : list) {
			System.out.println(string);
		}
	}

}
