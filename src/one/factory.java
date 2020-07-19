package one;

public class factory {
   
	public void fac(String filename) {
		filedocx docx=new filedocx();
		filepptx pptx=new filepptx();
		filexlsx xlsx=new filexlsx();
		fileother th=new fileother();
		
		//划分字符串，获取扩展名（“.”是转义字符，所以写法是"\\."）
        String[] s = filename.split("\\.");
        String hz = new String(s[s.length-1]);
           // System.out.println(s[s.length-1]);
        
        
        //对应扩展名的处理方法
        if(hz.equals("pptx")){
        	pptx.domove(filename);
        }else if (hz.equals("docx")) {
			docx.domove(filename);
		}else if (hz.equals("xlsx")) {
			xlsx.domove(filename);
		}else {
        	th.domove(filename);
      	  //System.out.println("暂时未能处理此类文件");
        }

	}
}
