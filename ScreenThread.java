package termprojectfinal;

import java.awt.*;
import javax.swing.*;

public class ScreenThread extends JFrame{
	
	public static String username; //ScreenThree에서 전달 받은 값 선언
	public static int useryear;

	public String userName; //ScreenFour로 보낼 값 선언
	public int userYear;
	
	
	

	//스레드 설정
	class ldThread extends Thread{
		JLabel label;
		int x,y;
		
		public ldThread(String fname, int x, int y) {
			this.x= x;
			this.y =y;
			label = new JLabel();
			
			label.setIcon(new ImageIcon(fname));
			label.setBounds(x,y,500,500);
			add(label);
		}
		
		public void run() {
			for(int i=0; i<600; i+=3) {
				x=i;
				label.setBounds(x,y,500,500);
				repaint();
				try {
					Thread.sleep(10);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			dispose();
			new ScreenFour(userName, userYear); //제비가 끝까지 가면 다음 창이 자동으로 열리고 해당 창은 닫힘
		}
	}
	
	public ScreenThread(String username, int useryear) {

		userName = username; //ScrennFour로 보낼 값 정의
		userYear = useryear;
		

		setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Thread Screen");
        setLayout(null);
        
        //프레임 배경색 지정
        Color b = new Color(145, 196, 222);
        getContentPane().setBackground(b);
        
        
       
        //스레드 시작
        (new ldThread("images/bird.png",300,-80)).start();
        
        //텍스트 삽입
        JLabel txt = new JLabel("로딩 중..");
        Font font = new Font("휴먼모음T", Font.BOLD, 50);
        txt.setFont(font);
        txt.setBounds(270,300,200,200);
        
        add(txt);
        setVisible(true);
	}
	
	public static void main(String[] args) {
		ScreenThread thread = new ScreenThread(username, useryear);
	}
}

