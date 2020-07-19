package one;

import java.io.File;


public class testfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		factory myFactory = new factory();
		String workpath= new String("D://FileRec");		//需要整理的目录文件夹
		
		//获取目录文件夹下内容
		File file1 = new File(workpath);
		if(file1.isDirectory()){
			
			System.out.println("已在FileRec");
			String s[] = file1.list();
			System.out.println("文件：");
			for (String str : s) {//遍历文件名，进行相关处理
				
				//检查：如果是文件夹则跳过
				File f2 = new File(workpath+"/"+str);
				if(f2.isDirectory()) continue;
				
				//调用类，处理文件
				System.out.println(str);
				myFactory.fac(str);
			}
			
		}else {
			System.out.println("没进去");
		}
		
		
	}
}
