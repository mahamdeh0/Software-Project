package fall2023project;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Admin {
	
	boolean logState;
	String password;
	private int type;
	private String name;
	protected static final List<Admin> AA = new ArrayList<Admin>() ;
	final Logger logger = Logger.getLogger(Admin.class.getName());
	
	
	public static List<Admin> getAa() {
		return AA;
	}

	public Admin() {
		logState=false;
		password="123456";
	}
	
	public Admin(String name,String password, int type) {
		super();
		this.password = password;
		this.type = type;
		this.name = name;
	}
	public static void list_W ( List<Worker> list,String name) {
		for(int i=0;i<list.size();i++)
		{   if(list.get(i).getName().equalsIgnoreCase(name)) {
			if(list.get(i).available)
				list.get(i).available=false;
			break;
		}   
		}
	}
	public void setType(int type) {
		this.type = type;
	}
		public int getType() {
		return type;
		}
	
		public void LogState(boolean t) {
			
			logState=t;		
		}
		public boolean getLogState() {
			
			return logState;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

	



	

}
