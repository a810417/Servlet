package com.lcpan.m05;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitTrainingCenters implements ServletContextListener {

	public InitTrainingCenters() {

	}

	public void contextDestroyed(ServletContextEvent sce) {

	}

	public void contextInitialized(ServletContextEvent sce) {

		ServletContext context = sce.getServletContext();
		List<TrainingCenter> list = new ArrayList<>();
		String file = context.getInitParameter("centerFile");
		try {
			InputStream is = context.getResourceAsStream(file);
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			String rec;
			while ((rec = reader.readLine()) != null) {
				String[] fields = rec.split(",");
				String name = fields[0];
				String address = fields[1];
				String tel = fields[2];
				list.add(new TrainingCenter(name, address, tel));
			}
			context.setAttribute("centers", list);
			reader.close();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
