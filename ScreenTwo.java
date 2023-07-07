package termprojectfinal;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

public class ScreenTwo extends JFrame implements ActionListener {
    public JPanel panel;
    public JTextField nameField;
    public JTextField yearField;
    public JButton submitButton;
    public JRadioButton femaleRadioButton;
    public JRadioButton maleRadioButton;
    public String name;
    public String year;
    
   
    public ScreenTwo() {
        JPanel backgroundpanel2 = new JPanel();
        backgroundpanel2.setLayout(null); // 레이아웃 매니저를 null로 설정
        setSize(800, 600); // 프레임의 크기 설정
        // 프레임의 배경색 설정
        Color backgroundColor = new Color(250, 237, 125);
        backgroundpanel2.setBackground(backgroundColor);
        add( backgroundpanel2);
        
        ImageIcon tileIcon3= new ImageIcon("images/background1.jpg");
        JLabel tileLabel3=new JLabel(tileIcon3);
        tileLabel3.setBounds(0,0,getWidth(),tileIcon3.getIconHeight());
        backgroundpanel2.add(tileLabel3);
        
        
        ImageIcon tileIcon4=new ImageIcon("images/background1.jpg");
        JLabel tileLabel4=new JLabel(tileIcon4);
        tileLabel4.setBounds(0,547,getWidth(),tileIcon4.getIconHeight());
        backgroundpanel2.add(tileLabel4);
        
       
       
        
        JLabel firstLabel= new JLabel("<정보를 입력하세요>");
        firstLabel.setBounds(250,40,350,50); // 위치와 크기를 지정
        Font fontfirst = new Font("휴먼옛체", Font.PLAIN,30);
        firstLabel.setFont(fontfirst);
        backgroundpanel2.add(firstLabel);

        JLabel nameLabel = new JLabel("1.이름을 입력하세요.");
        nameLabel.setBounds(50,100,300,20); // 위치와 크기를 지정
        Font fontsecond = new Font("휴먼옛체", Font.PLAIN,15);
        nameLabel.setFont(fontsecond);
        backgroundpanel2.add(nameLabel);

        nameField = new JTextField(20);
        nameField.setBounds(50,130,200,30); // 위치와 크기를 지정
        backgroundpanel2.add(nameField);
        
        JLabel genderLabel = new JLabel("2.성별을 선택하세요.");
        genderLabel.setBounds(50,270,300,20); // 위치와 크기를 지정
        Font fontthird = new Font("휴먼옛체", Font.PLAIN,15);
        genderLabel.setFont(fontthird);
        backgroundpanel2.add(genderLabel);
        
        JRadioButton femaleRadioButton = new JRadioButton("여성");
        femaleRadioButton.setBounds(50,310,50,30); // 위치와 크기를 지정
        femaleRadioButton.setContentAreaFilled(false);
        backgroundpanel2.add(femaleRadioButton);

        JRadioButton maleRadioButton = new JRadioButton("남성");
        maleRadioButton.setBounds(110,310,50,30); // 위치와 크기를 지정
        maleRadioButton.setContentAreaFilled(false);
        backgroundpanel2.add(maleRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(femaleRadioButton);
        buttonGroup.add(maleRadioButton);
        
        JLabel birthLabel= new JLabel("3.출생년도를 입력하세요.");
        birthLabel.setBounds(450,100,300,20); // 위치와 크기를 지정
        Font fontforth = new Font("휴먼옛체", Font.PLAIN,15);
        birthLabel.setFont(fontforth);
        backgroundpanel2.add(birthLabel);
        
        yearField = new JTextField(20);
        yearField.setBounds(450,130,200,30); // 위치와 크기를 지정
        backgroundpanel2.add(yearField);
        
        JLabel yearLabel= new JLabel("네 자리 숫자로 입력해주세요.");
        yearLabel.setBounds(450,180,300,20); // 위치와 크기를 지정z
        Font fontwarning = new Font("휴먼옛체", Font.PLAIN,15);
        yearLabel.setFont(fontwarning);
        yearLabel.setForeground(Color.BLUE);
        backgroundpanel2.add(yearLabel);
        
        
        JButton submitButton = new JButton("정보 확인");
        submitButton.addActionListener(this);
        submitButton.setBounds(45,400,150,30); // 위치와 크기를 지정
        backgroundpanel2.add(submitButton);
        
        JLabel nextPageLabel= new JLabel("~복주머니를 클릭하세요~");
        nextPageLabel.setBounds(475,500,300,20); // 위치와 크기를 지정
        Font fontclick = new Font("휴먼옛체", Font.PLAIN,17);
        nextPageLabel.setFont(fontclick);
        nextPageLabel.setForeground(Color.BLUE);
        backgroundpanel2.add(nextPageLabel);
        
        
        ImageIcon img = new ImageIcon("images/luck.png");
        Image luck = img.getImage();
        Image changeluck = luck.getScaledInstance(250,250,Image.SCALE_SMOOTH);
        ImageIcon changeimg = new ImageIcon(changeluck);
        JButton startbtn2 = new JButton(changeimg);
        startbtn2.setBorderPainted(false); // 버튼의 테두리 없애기
        startbtn2.setContentAreaFilled(false); // 버튼의 배경을 투명으로 바꾸기
        startbtn2.setFocusPainted(false); // 클릭 시 표시되는 테두리도 없애기
        startbtn2.setBounds(450,250,250,250);
        backgroundpanel2.add(startbtn2);

        
        //복주머니 라벨에 이벤트 등록
        startbtn2.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		
        		name = nameField.getText(); // 사용자로부터 입력받은 이름
        		year=yearField.getText();
        		dispose(); //프로그램을 종료시키는 것이 아닌, 현재의 프레임만 종료시키는 역할
        		new ScreenThree(name,year); 
        		
        		
        	}
        });


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Second Screen");
        setVisible(true);
    

        submitButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            name = nameField.getText();
            year=yearField.getText();
            String selectedGender = "";
            if (femaleRadioButton.isSelected()) {
                selectedGender = "여성";
            } else if (maleRadioButton.isSelected()) {
                selectedGender = "남성";
            }
            
            JOptionPane.showMessageDialog(ScreenTwo.this,"이름: " + name + "\n성별: " + selectedGender+"\n출생년도:"+year,"정보를 확인하세요",JOptionPane.INFORMATION_MESSAGE);
            // 운세 프로그램의 로직을 추가
        }
    });
    }
    



    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ScreenTwo();
                
                
            }
        });
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}



	



	
}
