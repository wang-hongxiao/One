package one;

import java.io.File;


public class filepptx implements fileImpl {

	@Override
	public void domove(String filename) {
		// TODO Auto-generated method stub
		
		//文件开始的路径
		File starfile = new File("D://FileRec/"+filename);
		
		//目的目录路径，若不存在则创建
		File endDirection = new File("D://FileRec//pptx");
		if(!endDirection.exists()){
			endDirection.mkdirs();
		}
		
		//目的文件路径=目的目录路径+源文件名称
		File endfile = new File(endDirection+File.separator+starfile.getName());
		
		try {
			if(starfile.renameTo(endfile)){
				System.out.println("转移成功");
			}
			else{
				System.out.println("转移失败,或许是重名");
			}
		} catch (Exception e) {
			System.out.println("文件移动出现异常");
		}
		
	}


}
