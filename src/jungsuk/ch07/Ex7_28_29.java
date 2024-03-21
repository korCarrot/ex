package jungsuk.ch07;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex7_28_29 {

	public static void main(String[] args)
	{
	Frame f = new Frame();
	f.addWindowListener(new EventHandler());
	}

}

class EventHandler extends WindowAdapter{
	
public void windowClosing(WindowEvent e) {
e.getWindow().setVisible(false);
e.getWindow().dispose();
System.exit(0);
}

}

//29번 지역 변수 값이 변하지 않기 위해