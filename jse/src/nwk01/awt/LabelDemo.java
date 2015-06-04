package nwk01.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;

public class LabelDemo {
		public static void main(String[] args) {
			/*
	 		 * [1] 컴포넌트를 만든다. 조립할 객체를 생성한다.
	 		 */
	 		Frame frame = new Frame("공책");
	 		frame.setSize(500,500); // (너비,높이)
	 		Toolkit toolkit = Toolkit.getDefaultToolkit();
	 		Dimension dim = toolkit.getScreenSize();
	 		
	 		Panel panel = new Panel();
	 		panel.setBackground(Color.YELLOW);
	 		panel.setSize(100,100);
	 		panel.setLocation(50,50);
	 		
	 		Label labId = new Label(" ID ");
	 		labId.setBounds(50,50,30,10); // (50,50,위치좌표.. 30,10,너비높이)
	 		Label labPwd = new Label(" Password : ");
	 		labId.setBounds(50,65,100,10);
	 		/*
	 		 * [2] 만들어진 컴포넌트들을 조립한다.
	 		 */
            //frame.setLayout(new FlowLayout());
	 		// FlowLayout 은 (좌에서 우)로 정렬시킨다.
	 		frame.setLayout(null); // null이면 x,y 좌표로 정렬된다.
	 		frame.add(labId);
	 		frame.add(labPwd);
	 		
	 		
	 		/*
	 		 * [3] 컴포넌트를 화면에 띄우기
	 		 */
	 		frame.setLocation(dim.width/2-150,dim.height/2-100);
	 		frame.setVisible(true);
	 		
	 		
		}
}