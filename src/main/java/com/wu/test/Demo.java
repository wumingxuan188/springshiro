package com.wu.test;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.wu.pojo.Users;
import org.junit.jupiter.api.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
public class Demo {

	public static void main(String[] args) throws Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		//F:\wuProject\springShiro\src\mbg.xml
		File configFile = new File("K:\\springShiro\\mbg.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
		callback, warnings);
		myBatisGenerator.generate(null);
		}
		@Test
	public  void test(){
			Users users = new Users();
			Users u = new Users();
			u.setNames("tom");
			users.setNames("tom");
			System.err.println(u.equals(users));
		}
}
