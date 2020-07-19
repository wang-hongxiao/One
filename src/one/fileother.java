package one;

import java.io.File;

public class fileother implements fileImpl {
	@Override
	public void domove(String filename) {
		// TODO Auto-generated method stub
		
		/*对新扩展名的处理
		 * 1.先找到扩展名
		 * 2.根据规则创建或查找存放目录
		 * 3.转移文件
		 * 
		 * */
	    String[] s = filename.split("\\.");
        String hz = new String(s[s.length-1]);
        
	File starfile = new File("D://FileRec/"+filename);
	
	//动态创建未知类型的文件夹
	File endDirection = new File("D://FileRec//"+hz); 
		
		if(!endDirection.exists()){
			endDirection.mkdirs();
		}
		
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

