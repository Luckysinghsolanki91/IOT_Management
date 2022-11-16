package com.iotprojectmanagmentforuniversity;

import java.awt.Desktop;
import java.net.URI;
  
public class Openquizpage {
	
	Openquizpage(){
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URI uri=new URI("file:///C:/Users/Hp/Desktop/Vscode2file/vscodefileH/Quiz.html");
		uri.normalize();
		Desktop.getDesktop().browse(uri);
		new Openquizpage();
	}
	

}
