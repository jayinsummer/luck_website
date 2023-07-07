package termprojectfinal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class ScreenThree extends JFrame{
	public static String name;
	public static String year;
	public static int year2;
	
	public String username;	//ScreenFour에 보낼 값 선언
	public int useryear;
	
	public ScreenThree(String name,String year) {

		this.name=name;//전달받은 name값을 저장합니다.
		this.year=year;
		int year2 = Integer.parseInt(year);

		username = this.name; // ScreenFour에 보낼 값 정의
		useryear = year2; 

		
		//프레임 설정
		setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Third Screen");
        
        JPanel back = new JPanel();
        Color b = new Color(145, 196, 222);
        back.setBackground(b);
        back.setLayout(null); //절대위치
        add(back);
        
        ImageIcon tileIcon_3= new ImageIcon("images/background1.jpg");
        JLabel tileLabel_3=new JLabel(tileIcon_3);
        tileLabel_3.setBounds(0,0,getWidth(),tileIcon_3.getIconHeight());
        back.add(tileLabel_3);
        
        
        ImageIcon tileIcon_4=new ImageIcon("images/background1.jpg");
        JLabel tileLabel_4=new JLabel(tileIcon_4);
        tileLabel_4.setBounds(0,547,getWidth(),tileIcon_4.getIconHeight());
        back.add(tileLabel_4);
        
        
        //띠 구분해서 이미지 및 글 삽입하기
        if (year2%12==0) { //원숭이띠
        	
        	//원숭이 이미지
        	ImageIcon monkeyimg = new ImageIcon("images/monkey.png");
            
            Image monkey = monkeyimg.getImage();
            Image changemonkey = monkey.getScaledInstance(200,200,Image.SCALE_SMOOTH);
            ImageIcon monkeyimg2 = new ImageIcon(changemonkey);
            JLabel monkeylb = new JLabel(monkeyimg2);
            monkeylb.setBounds(130,-100, 500,500);
            back.add(monkeylb);
            
            //글1 삽입
            JLabel textmon = new JLabel(this.name+"님의 띠는 원숭이띠입니다.");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            textmon.setFont(font);
            textmon.setBounds(220,180,400,350);
            back.add(textmon);
        }
        
        else if (year2%12==1) {//닭띠
        	
        	//닭 이미지
        	ImageIcon chickenimg = new ImageIcon("images/chicken.png");
            
            Image chicken = chickenimg.getImage();
            Image changechicken = chicken.getScaledInstance(200,200,Image.SCALE_SMOOTH);
            ImageIcon chickenimg2 = new ImageIcon(changechicken);
            JLabel chickenlb = new JLabel(chickenimg2);
            chickenlb.setBounds(130,-100, 500,500);
            back.add(chickenlb);
            
            //글1 삽입
            JLabel textch = new JLabel(this.name+"님의 띠는 닭띠입니다.");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            textch.setFont(font);
            textch.setBounds(220,180, 350,350);
            back.add(textch);
        }
        else if (year2%12==2) {//개띠
        	
        	//개 이미지
        	ImageIcon dogimg = new ImageIcon("images/dog.jpg");
            
            Image dog = dogimg.getImage();
            Image changedog = dog.getScaledInstance(200,200,Image.SCALE_SMOOTH);
            ImageIcon dogimg2 = new ImageIcon(changedog);
            JLabel doglb = new JLabel(dogimg2);
            doglb.setBounds(130,-100, 500,500);
            back.add(doglb);
            
            //글1 삽입
            JLabel textdog = new JLabel(this.name+"님의 띠는 개띠입니다.");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            textdog.setFont(font);
            textdog.setBounds(220,180, 350,350);
            back.add(textdog);
        }
        else if (year2%12==3) {//돼지띠
        	
        	//돼지 이미지
        	ImageIcon pigimg = new ImageIcon("images/pig.png");
            
            Image pig = pigimg.getImage();
            Image changepig = pig.getScaledInstance(200,200,Image.SCALE_SMOOTH);
            ImageIcon pigimg2 = new ImageIcon(changepig);
            JLabel piglb = new JLabel(pigimg2);
            piglb.setBounds(130,-100, 500,500);
            back.add(piglb);
            
            //글1 삽입
            JLabel textp = new JLabel(this.name+"님의 띠는 돼지띠입니다.");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            textp.setFont(font);
            textp.setBounds(220,180, 350,350);
            back.add(textp);
        }
        else if (year2%12==4) {//쥐띠
        	
        	//쥐 이미지
        	ImageIcon mouseimg = new ImageIcon("images/mouse.png");
            
            Image mouse = mouseimg.getImage();
            Image changemouse = mouse.getScaledInstance(200,200,Image.SCALE_SMOOTH);
            ImageIcon mouseimg2 = new ImageIcon(changemouse);
            JLabel mouselb = new JLabel(mouseimg2);
            mouselb.setBounds(130,-100, 500,500);
            back.add(mouselb);
            
            //글1 삽입
            JLabel textm = new JLabel(this.name+"님의 띠는 쥐띠입니다.");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            textm.setFont(font);
            textm.setBounds(220,180, 350,350);
            back.add(textm);
        }
        else if (year2%12==5) {//소띠
        	
        	//소 이미지
        	ImageIcon cowimg = new ImageIcon("images/cow.png");
            
            Image cow = cowimg.getImage();
            Image changecow = cow.getScaledInstance(200,200,Image.SCALE_SMOOTH);
            ImageIcon cowimg2 = new ImageIcon(changecow);
            JLabel cowlb = new JLabel(cowimg2);
            cowlb.setBounds(130,-100, 500,500);
            back.add(cowlb);
            
            //글1 삽입
            JLabel textcow = new JLabel(this.name+"님의 띠는 소띠입니다.");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            textcow.setFont(font);
            textcow.setBounds(220,180, 350,350);
            back.add(textcow);
        }
        else if (year2%12==6) {//호랑이띠
        	
        	//호랑이 이미지
        	ImageIcon tigerimg = new ImageIcon("images/tiger.png");
            
            Image tiger = tigerimg.getImage();
            Image changetiger = tiger.getScaledInstance(200,200,Image.SCALE_SMOOTH);
            ImageIcon tigerimg2 = new ImageIcon(changetiger);
            JLabel tigerlb = new JLabel(tigerimg2);
            tigerlb.setBounds(130,-100, 500,500);
            back.add(tigerlb);
            
            //글1 삽입
            JLabel textt = new JLabel(this.name+"님의 띠는 호랑이띠입니다.");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            textt.setFont(font);
            textt.setBounds(220,180, 350,350);
            back.add(textt);
        }
        else if (year2%12==7) {//토끼띠
        	
        	//토끼 이미지
        	ImageIcon rabbitimg = new ImageIcon("images/rabbit.png");
            
            Image rabbit = rabbitimg.getImage();
            Image changerabbit = rabbit.getScaledInstance(200,200,Image.SCALE_SMOOTH);
            ImageIcon rabbitimg2 = new ImageIcon(changerabbit);
            JLabel rabbitlb = new JLabel(rabbitimg2);
            rabbitlb.setBounds(130,-100, 500,500);
            back.add(rabbitlb);
            
            //글1 삽입
            JLabel textr = new JLabel(this.name+"님의 띠는 토끼띠입니다.");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            textr.setFont(font);
            textr.setBounds(220,180, 350,350);
            back.add(textr);
        }
        else if (year2%12==8) {//용띠
        	
        	//용 이미지
        	ImageIcon dragonimg = new ImageIcon("images/dragon.png");
            
            Image dragon = dragonimg.getImage();
            Image changedragon = dragon.getScaledInstance(200,200,Image.SCALE_SMOOTH);
            ImageIcon dragonimg2 = new ImageIcon(changedragon);
            JLabel dragonlb = new JLabel(dragonimg2);
            dragonlb.setBounds(130,-100, 500,500);
            back.add(dragonlb);
            
            //글1 삽입
            JLabel textdr = new JLabel(this.name+"님의 띠는 용띠입니다.");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            textdr.setFont(font);
            textdr.setBounds(220,180, 350,350);
            back.add(textdr);
        }
        else if (year2%12==9) {//뱀띠
        	
        	//뱀 이미지
        	ImageIcon snakeimg = new ImageIcon("images/snake.png");
            
            Image snake = snakeimg.getImage();
            Image changesnake = snake.getScaledInstance(200,200,Image.SCALE_SMOOTH);
            ImageIcon snakeimg2 = new ImageIcon(changesnake);
            JLabel snakelb = new JLabel(snakeimg2);
            snakelb.setBounds(130,-100, 500,500);
            back.add(snakelb);
            
            //글1 삽입
            JLabel texts = new JLabel(this.name+"님의 띠는 뱀띠입니다.");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            texts.setFont(font);
            texts.setBounds(220,180, 350,350);
            back.add(texts);
        }
        else if (year2%12==10) {//말띠
        	
        	//말 이미지
        	ImageIcon horseimg = new ImageIcon("images/horse.png");
            
            Image horse = horseimg.getImage();
            Image changehorse = horse.getScaledInstance(200,200,Image.SCALE_SMOOTH);
            ImageIcon horseimg2 = new ImageIcon(changehorse);
            JLabel horselb = new JLabel(horseimg2);
            horselb.setBounds(130,-100, 500,500);
            back.add(horselb);
            
            //글1 삽입
            JLabel texth = new JLabel(this.name+"님의 띠는 말띠입니다.");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            texth.setFont(font);
            texth.setBounds(220,180, 350,350);
            back.add(texth);
        }
        else { //양띠
        	//양 이미지
        	ImageIcon sheepimg = new ImageIcon("images/sheep.png");
            
            Image sheep = sheepimg.getImage();
            Image changesheep = sheep.getScaledInstance(200,200,Image.SCALE_SMOOTH);
            ImageIcon sheepimg2 = new ImageIcon(changesheep);
            JLabel sheeplb = new JLabel(sheepimg2);
            sheeplb.setBounds(130,-100, 500,500);
            back.add(sheeplb);
            
            //글1 삽입
            JLabel textsh = new JLabel(this.name+"님의 띠는 양띠입니다.");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            textsh.setFont(font);
            textsh.setBounds(220,180, 350,350);
            back.add(textsh);
        }
        
        //글2 삽입
        JLabel text2 = new JLabel(this.name+"님의 띠별 운세 보러 가기!");
        Font font = new Font("휴먼옛체", Font.PLAIN, 25);
        text2.setFont(font);
        text2.setBounds(200,200, 400,400);
        back.add(text2);
        
        //버튼 삽입
        JButton btn = new JButton("Go!");
        Font font1 = new Font("Franklin Gothic", Font.PLAIN, 20);
        btn.setFont(font1);
        btn.setFocusPainted(false);
        btn.setBounds(330,450, 100,40);
        btn.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		dispose(); //프로그램을 종료시키는 것이 아닌, 현재의 프레임만 종료시키는 역할
        		new ScreenThread(username, useryear); //복주머니를 누르면 새롭게 열릴 두번째 창.(이름은 내가 임의로 정했어!)
        	}
        });
        back.add(btn);
        
        add(back);
        setVisible(true);
	}
	
	public static void main(String[] args) {
		ScreenThree third = new ScreenThree(name,year);
	}
}



