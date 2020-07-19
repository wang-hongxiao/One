package one;

import java.io.File;

public class filedocx implements fileImpl {

	@Override
	public void domove(String filename) {
		// TODO Auto-generated method stub

		File starfile = new File("D://FileRec/" + filename);

		File endDirection = new File("D://FileRec//docx");
		if (!endDirection.exists()) {
			endDirection.mkdirs();
		}

		File endfile = new File(endDirection + File.separator + starfile.getName());

		try {
			if (starfile.renameTo(endfile)) {
				System.out.println("转移成功");
			} else {
				System.out.println("转移失败,或许是重名");
			}
		} catch (Exception e) {
			System.out.println("文件移动出现异常");
		}
	}

}
