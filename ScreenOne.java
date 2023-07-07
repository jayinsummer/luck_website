package termprojectfinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScreenOne extends JFrame {

    public ScreenOne() {
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("First Screen");
        //프레임 배경색 지정
        Color b = new Color(250, 237, 125);
        getContentPane().setBackground(b);
        
        // 패널 생성
        JPanel backgroundpanel = new JPanel();
        ImageIcon tileIcon= new ImageIcon("images/background1.jpg");
        JLabel tileLabel=new JLabel(tileIcon);
        tileLabel.setBounds(0,0,getWidth(),tileIcon.getIconHeight());
        
        backgroundpanel.add(tileLabel);
        
        ImageIcon tileIcon2=new ImageIcon("images/background1.jpg");
        JLabel tileLabel2=new JLabel(tileIcon2);
        tileLabel2.setBounds(0,547,getWidth(),tileIcon.getIconHeight());
        
        backgroundpanel.add(tileLabel2);

        // 전체 패널 배경색, 텍스트 두 개 색상 지정
        Color p = new Color(250, 237, 125);
        Color t1 = new Color(121, 87, 29);
        Color t2 = new Color(65, 43, 5);
        backgroundpanel.setBackground(p);

        // 절대 위치
        backgroundpanel.setLayout(null);

        JLabel label1 = new JLabel("재미로 보는", SwingConstants.CENTER);
        Font font1 = new Font("휴먼옛체", Font.BOLD, 25);
        label1.setFont(font1);
        label1.setForeground(t1);
        backgroundpanel.add(label1);
        label1.setBounds(80, 10, 600, 70);

        // 제목 타이틀 패널 요소 만들기
        JLabel label2 = new JLabel("띠별 운세", SwingConstants.CENTER);
        Font font2 = new Font("휴먼옛체", Font.PLAIN, 60);
        label2.setFont(font2);
        label2.setForeground(t2);
        backgroundpanel.add(label2); // 부제목 패널에 라벨 붙이기
        label2.setBounds(130, 70, 500, 70);
        
        //버튼 클릭 안내 문구 삽입
        JLabel label3 = new JLabel("복주머니를 클릭하세요!");
        Font font3 = new Font("휴먼엑스포", Font.PLAIN, 20);
        label3.setFont(font3);
        label3.setForeground(t2);
        backgroundpanel.add(label3);
        label3.setBounds(530, 250, 400, 70);
        
        JLabel label4 = new JLabel("create by team_21");
        Font font4 = new Font("휴먼엑스포", Font.PLAIN,13);
        label4.setFont(font4);
        label4.setForeground(t2);
        backgroundpanel.add(label4);
        label4.setBounds(40,480, 400, 70);
        
        // 복주머니 생성
        ImageIcon img = new ImageIcon("images/luck.png");
        
        Image luck = img.getImage();
        Image changeluck = luck.getScaledInstance(450,450,Image.SCALE_SMOOTH);
        ImageIcon changeimg = new ImageIcon(changeluck);
        JButton startbtn1 = new JButton(changeimg);
        startbtn1.setBorderPainted(false); //버튼의 테두리 없애기
        startbtn1.setContentAreaFilled(false); //버튼의 배경을 투명으로 바꾸기
        startbtn1.setFocusPainted(false); //클릭 시 표시되는 테두리도 없애기
        startbtn1.setBounds(130,100,500,500);
        
        //복주머니 라벨에 이벤트 등록
        startbtn1.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		dispose(); //프로그램을 종료시키는 것이 아닌, 현재의 프레임만 종료시키는 역할
        		new ScreenTwo(); //복주머니를 누르면 새롭게 열릴 두번째 창.(이름은 내가 임의로 정했어!)
        	}
        });
        backgroundpanel.add(startbtn1);

        add(backgroundpanel); // 프레임에 배경색 패널 붙이기

        setVisible(true);
    }
    public static void main(String[] args) {
		ScreenOne first = new ScreenOne();
	}

}


