package com.bw.niefx.util;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class StreamUtilTest {


	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		String path ="C:\\Users\\X\\Desktop\\a.txt";
		String string = StreamUtil.readTextFile(new FileInputStream(path));
		System.out.println(string);
	}

	@Test
	public void testReadTextFileFile() {
		String path ="C:\\Users\\X\\Desktop\\a.txt";
		String str = StreamUtil.readTextFile(new File(path));
		System.out.println(str);
	}

}
