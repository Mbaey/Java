package com.demo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.entity.Stu;
import com.entity.Student;

public class demo {

	public static void main(String[] args) throws IOException {

		Student student = new Student(true, "Li", 182, (float) 98.8);
		String path = "D:/LI/=.=/1.txt";
		File file = new File(path);
		file.createNewFile();
		
		Student res = null;
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(student);
			oos.flush();
			oos.close();

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			
			res = (Student) ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(res);

	}

}
