package termprojectfinal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Random;

public class ScreenFour extends JFrame {

	private JPanel backgroundPanel;

	private JLabel colorLabel;
	private JLabel colorNameLabel;
	private JLabel animalLabel;

    private JLabel totalLuckLabel;
    private JLabel loveLabel;
    private JLabel moneyLabel;
    private JLabel healthLabel;

	public static String userName;
	public static int userYear;
	private String userNameS;
	private int userYearS;
	

    private String[] totalLuckMessages = {
            "오늘은 행운의 날이니 기대해도 좋아요! 우주의 힘이 당신을 지지하고 있습니다.\n 자신감을 가지고 노력하면 큰 성과를 얻게 될 거예요.\n 어려움을 만나더라도 긍정적인 마인드를 유지하고 극복해 나갈 수 있습니다.\n 자신을 믿고 앞으로 나아가세요!",
            "당신의 노력과 인내심이 결실을 맺을 것입니다.\n 지금까지의 수고가 어떻게 보상받을지 기대가 되는 시기입니다.\n 하지만 성공은 한 번에 오지 않는다는 것을 명심하세요.\n 꾸준한 노력과 자기 발전을 위한 노력이 필요합니다.\n 장기적인 목표를 설정하고 그에 맞춰 행동하세요.",
            "지금은 어려운 시기지만, 그 어려움을 극복할 힘을 가지고 있습니다.\n 어려운 상황에서도 긍정적으로 생각하고 자신을 격려해야 합니다.\n 어려움을 극복하면 성장할 수 있는 기회가 찾아올 것입니다.\n 마음가짐과 태도가 성공의 열쇠입니다.\n 포기하지 말고 앞으로 나아가세요!",
			"운명은 항상 변하기 마련이니, 나쁜 일이 있어도 긍정적으로 변화를 받아들이세요.\n 오늘의 어려운 상황이 내일의 기회가 될 수 있습니다.\n 새로운 가능성과 긍정적인 변화를 위해 자신의 강점을 살려보세요.\n 도전에 맞서고 노력하면 좋은 결과를 얻을 수 있을 것입니다.",
			"긍정적인 에너지와 자신감으로 오늘을 시작하세요.\n 어려움에 직면하더라도 자신을 믿고 힘을 내어 극복해낼 수 있습니다.\n 자신의 잠재력과 역량을 최대한 발휘하여 성공을 이루세요.\n 힘든 시기를 견뎌내면서도 긍정적인 마인드를 유지하는 것이 중요합니다.",
			"자신의 잠재력을 믿으세요.\n 당신은 훌륭한 능력을 갖추고 있으며, 주변에서 인정받을 만한 일을 해내기 위해 준비되어 있습니다.\n 뜻밖의 기회와 성공이 찾아올 것입니다.\n 자신의 장점과 역량을 잘 활용하며 자신을 믿고 도전하세요.\n 놀라운 결과를 얻을 수 있을 것입니다.",
			"오늘은 힘들고 지칠 수 있지만, 내일은 더 나은 날이 오기를 기대하세요.\n 인내와 근성을 갖고 어려운 시기를 극복할 수 있습니다.\n 노력은 결코 헛되지 않으며, 언젠가 그 노력의 열매를 맺게 될 것입니다.\n 자신을 격려하고 지금의 어려움을 이겨내세요."			
    };

    public ScreenFour(String userName, int userYear) {
		userNameS = userName;
		userYearS = userYear;
		
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Fourth Screen");
		
		// 프레임 배경색 지정
        Color b = new Color(250, 237, 125);
        getContentPane().setBackground(b);
		
	
		// 사용자 띠 이미지와 띠별 문구 출력
		userAnimal(userYearS);
		
		// 오늘의 추천 색 (1) - 추천 색 JPanel로 색 사각형으로 보여주기
		Random random = new Random();
		Color randomColor = getRandomColor(random);

		JPanel colorPanel = new JPanel();
		colorPanel.setBackground(randomColor);
		colorPanel.setSize(50,50);
		colorPanel.setBounds(230,100,50,50);
		backgroundPanel.add(colorPanel);

		// 오늘의 추천 색 (2) - 추천 색 멘트 JPanel로 보이게 하기
		JLabel colorLabel = new JLabel("오늘의 추천 색");
		JLabel colorNameLabel = new JLabel(""+randomColor);
		colorLabel.setBounds(300, 100, 100, 30);
		backgroundPanel.add(colorLabel);
		backgroundPanel.add(colorNameLabel);

		// 다른 띠 궁합 (1)
		friendAnimal(random);

		// 다른 띠 궁합 (2) - 다른 띠 궁합 JPanel로 보이게 하기
		JLabel friendLabel = new JLabel("오늘의 최고의 궁합인 띠");
		friendLabel.setBounds(550, 100, 200, 30);
		backgroundPanel.add(friendLabel);

		// 복주머니 이미지 JLabel
        ImageIcon luckBagIcon = new ImageIcon("images/luckbag.png");
        JLabel luckBagLabel = new JLabel(luckBagIcon);
        luckBagLabel.setBounds(30, 200, 200, 200);
        backgroundPanel.add(luckBagLabel);

        totalLuckLabel = new JLabel();
        totalLuckLabel.setBounds(230, 230, 500, 150);
        totalLuckLabel.setFont(totalLuckLabel.getFont().deriveFont(14f));
        backgroundPanel.add(totalLuckLabel);

        ImageIcon cloverIcon = new ImageIcon("images/clover.png");
        JLabel cloverLabel = new JLabel(cloverIcon);
        cloverLabel.setBounds(50, 420, 100, 100);
        backgroundPanel.add(cloverLabel);

        loveLabel = new JLabel();
        loveLabel.setBounds(160, 460, 100, 30);
        backgroundPanel.add(loveLabel);

        ImageIcon piggyBankIcon = new ImageIcon("images/piggy_bank.jpg");
        JLabel piggyBankLabel = new JLabel(piggyBankIcon);
        piggyBankLabel.setBounds(260, 420, 100, 100);
        backgroundPanel.add(piggyBankLabel);

        moneyLabel = new JLabel();
        moneyLabel.setBounds(370, 460, 100, 30);
        backgroundPanel.add(moneyLabel);

        ImageIcon gymIcon = new ImageIcon("images/gym.jpg");
        JLabel gymLabel = new JLabel(gymIcon);
        gymLabel.setBounds(470, 420, 100, 100);
        backgroundPanel.add(gymLabel);

        healthLabel = new JLabel();
        healthLabel.setBounds(580, 460, 100, 30);
        backgroundPanel.add(healthLabel);


        int index = random.nextInt(totalLuckMessages.length);
		String message = "<html>" + totalLuckMessages[index] + "</html>";
		totalLuckLabel.setText(message);

        int lovePercentage = random.nextInt(101);
        loveLabel.setText("연애: " + lovePercentage + "%");
        loveLabel.setFont(loveLabel.getFont().deriveFont(16f));

        int moneyPercentage = random.nextInt(101);
        moneyLabel.setText("금전: " + moneyPercentage + "%");
        moneyLabel.setFont(moneyLabel.getFont().deriveFont(16f));

        int healthPercentage = random.nextInt(101);
        healthLabel.setText("건강: " + healthPercentage + "%");
        healthLabel.setFont(healthLabel.getFont().deriveFont(16f));

        //버튼 삽입
        JButton btn = new JButton("다시하기");
        Font font1 = new Font("Franklin Gothic", Font.PLAIN, 15);
        btn.setFont(font1);
        btn.setFocusPainted(false);
        btn.setBounds(680, 450, 100,40);
        btn.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              dispose(); //프로그램을 종료시키는 것이 아닌, 현재의 프레임만 종료시키는 역할
              new ScreenOne(); //복주머니를 누르면 새롭게 열릴 두번째 창
           }
        });
        backgroundPanel.add(btn);

      //add(backgroundPanel();
      add(backgroundPanel);
        setVisible(true);

    }
    
      private Color getRandomColor(Random random) {
		  	String[] colors = {"빨강", "파랑", "녹색", "노랑", "주황", "보라", "분홍", "회색", "검정", "흰색"};

            String randomColorName = colors[random.nextInt(colors.length)];

            if (randomColorName.equals("빨강")) {
                return Color.RED;
            } else if (randomColorName.equals("파랑")) {
                return Color.BLUE;
            } else if (randomColorName.equals("녹색")) {
                return Color.GREEN;
            } else if (randomColorName.equals("노랑")) {
                return Color.YELLOW;
            } else if (randomColorName.equals("주황")) {
                return Color.ORANGE;
            } else if (randomColorName.equals("보라")) {
                return Color.MAGENTA;
            } else if (randomColorName.equals("분홍")) {
                return Color.PINK;
            } else if (randomColorName.equals("회색")) {
                return Color.GRAY;
            } else if (randomColorName.equals("검정")) {
                return Color.BLACK;
            } else if (randomColorName.equals("흰색")) {
                return Color.WHITE;
            }

            return Color.BLACK; // 기본값으로 검정색 반환
       }

	public void userAnimal(int userYearS) {
		// 패널 초기화
        backgroundPanel = new JPanel();
        backgroundPanel.setLayout(null);
		backgroundPanel.setBackground(new Color(250, 237, 125));
		ImageIcon tileIcon5= new ImageIcon("images/background1.jpg");
	    JLabel tileLabel5=new JLabel(tileIcon5);
	    tileLabel5.setBounds(0,0,getWidth(),tileIcon5.getIconHeight());
	        
	    backgroundPanel.add(tileLabel5);
	        
	        
	    ImageIcon tileIcon6= new ImageIcon("images/background1.jpg");
	    JLabel tileLabel6=new JLabel(tileIcon6);
	    tileLabel6.setBounds(0,547,getWidth(),tileIcon5.getIconHeight());
	        
	    backgroundPanel.add(tileLabel6);
	    
	    
	    
	    ImageIcon tileIcon7= new ImageIcon("images/line.jpg");
	    JLabel tileLabel7=new JLabel(tileIcon7);
	    tileLabel7.setBounds(0,200,320,5);
	        
	    backgroundPanel.add(tileLabel7);
	    
	    ImageIcon tileIcon8= new ImageIcon("images/line.jpg");
	    JLabel tileLabel8=new JLabel(tileIcon8);
	    tileLabel8.setBounds(250,200,320,5);
	        
	    backgroundPanel.add(tileLabel8);
	    
	    ImageIcon tileIcon9= new ImageIcon("images/line.jpg");
	    JLabel tileLabel9=new JLabel(tileIcon9);
	    tileLabel9.setBounds(450,200,320,5);
	        
	    backgroundPanel.add(tileLabel9);
	    
	    
	    
	    ImageIcon tileIcon10= new ImageIcon("images/line.jpg");
	    JLabel tileLabel10=new JLabel(tileIcon10);
	    tileLabel10.setBounds(0,390,320,5);
	        
	    backgroundPanel.add(tileLabel10);
	    
	    ImageIcon tileIcon11= new ImageIcon("images/line.jpg");
	    JLabel tileLabel11=new JLabel(tileIcon11);
	    tileLabel11.setBounds(250,390,320,5);
	        
	    backgroundPanel.add(tileLabel11);
	    
	    ImageIcon tileIcon12= new ImageIcon("images/line.jpg");
	    JLabel tileLabel12=new JLabel(tileIcon12);
	    tileLabel12.setBounds(450,390,320,5);
	        
	    backgroundPanel.add(tileLabel12);
	    
	    ImageIcon tileIcon13= new ImageIcon("images/line2.jpg");
	    JLabel tileLabel13=new JLabel(tileIcon13);
	    tileLabel13.setBounds(20,200,5,195);
	        
	    backgroundPanel.add(tileLabel13);
	    
	    ImageIcon tileIcon14= new ImageIcon("images/line2.jpg");
	    JLabel tileLabel14=new JLabel(tileIcon14);
	    tileLabel14.setBounds(745,200,5,195);
	        
	    backgroundPanel.add(tileLabel14);
	    
	    
	    
	    
	    
	    
	    
	    
	    

	    if (userYearS % 12 == 0) { // 원숭이띠
	        // 원숭이 이미지
	        ImageIcon monkeyimg = new ImageIcon("images/monkey.png");
	        Image monkey = monkeyimg.getImage();
	        Image changemonkey = monkey.getScaledInstance(130,130, Image.SCALE_SMOOTH);
		    ImageIcon monkeyimg2 = new ImageIcon(changemonkey);
	        JLabel monkeylb = new JLabel(monkeyimg2);
	        monkeylb.setBounds(40, 40, 150, 150);
	        backgroundPanel.add(monkeylb);
	
	        // 글1 삽입
	        JLabel textmon = new JLabel("<"+userNameS + "님의 띠는 원숭이띠입니다.>");
	        Font font = new Font("휴먼옛체", Font.PLAIN, 25);
	        textmon.setFont(font);
	        textmon.setBounds(230, 30, 500, 30);
	        backgroundPanel.add(textmon);
	    } else if (userYearS % 12 == 1) {// 닭띠
	        // 닭 이미지
	        ImageIcon chickenimg = new ImageIcon("images/chicken.png");
	        Image chicken = chickenimg.getImage();
	        Image changechicken = chicken.getScaledInstance(130,130, Image.SCALE_SMOOTH);
	        ImageIcon chickenimg2 = new ImageIcon(changechicken);
	        JLabel chickenlb = new JLabel(chickenimg2);
	        chickenlb.setBounds(40, 40, 150, 150);
	        backgroundPanel.add(chickenlb);

	        // 글1 삽입
	        JLabel textch = new JLabel("<"+userNameS + "님의 띠는 닭띠입니다.>");
	        Font font = new Font("휴먼옛체", Font.PLAIN, 25);
	        textch.setFont(font);
	        textch.setBounds(230, 30, 500, 30);
	        backgroundPanel.add(textch);
	    } else if (userYearS % 12 == 2) {// 개띠
	        // 개 이미지
	        ImageIcon dogimg = new ImageIcon("images/dog.jpg");
	        Image dog = dogimg.getImage();
	        Image changedog = dog.getScaledInstance(130,130, Image.SCALE_SMOOTH);
	        ImageIcon dogimg2 = new ImageIcon(changedog);
	        JLabel doglb = new JLabel(dogimg2);
		    doglb.setBounds(40, 40, 150, 150);
	        backgroundPanel.add(doglb);

	        // 글1 삽입
	        JLabel textdog = new JLabel("<"+userNameS + "님의 띠는 개띠입니다.>");
	        Font font = new Font("휴먼옛체", Font.PLAIN, 25);
	        textdog.setFont(font);
	        textdog.setBounds(230, 30, 500, 30);
	        backgroundPanel.add(textdog);
	    } else if (userYearS % 12 == 3) {//돼지띠
        	
        	//돼지 이미지
        	ImageIcon pigimg = new ImageIcon("images/pig.png");
            
            Image pig = pigimg.getImage();
            Image changepig = pig.getScaledInstance(130,130,Image.SCALE_SMOOTH);
            ImageIcon pigimg2 = new ImageIcon(changepig);
            JLabel piglb = new JLabel(pigimg2);
            piglb.setBounds(40, 40, 150, 150);
            backgroundPanel.add(piglb);
            
            //글1 삽입
            JLabel textp = new JLabel("<"+userNameS+"님의 띠는 돼지띠입니다.>");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            textp.setFont(font);
            textp.setBounds(230, 30, 500, 30);
            backgroundPanel.add(textp);
        } else if (userYearS % 12 == 4) {//쥐띠
        	
        	//쥐 이미지
        	ImageIcon mouseimg = new ImageIcon("images/mouse.png");
            
            Image mouse = mouseimg.getImage();
            Image changemouse = mouse.getScaledInstance(130,130,Image.SCALE_SMOOTH);
            ImageIcon mouseimg2 = new ImageIcon(changemouse);
            JLabel mouselb = new JLabel(mouseimg2);
            mouselb.setBounds(40, 40, 150, 150);
            backgroundPanel.add(mouselb);
            
            //글1 삽입
            JLabel textm = new JLabel("<"+userNameS+"님의 띠는 쥐띠입니다.>");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            textm.setFont(font);
            textm.setBounds(230, 30, 500, 30);
            backgroundPanel.add(textm);
        } else if (userYearS % 12 == 5) {//소띠
        	
        	//소 이미지
        	ImageIcon cowimg = new ImageIcon("images/cow.png");
            
            Image cow = cowimg.getImage();
            Image changecow = cow.getScaledInstance(130,130,Image.SCALE_SMOOTH);
            ImageIcon cowimg2 = new ImageIcon(changecow);
            JLabel cowlb = new JLabel(cowimg2);
            cowlb.setBounds(40, 40, 150, 150);
            backgroundPanel.add(cowlb);
            
            //글1 삽입
            JLabel textcow = new JLabel("<"+userNameS+"님의 띠는 소띠입니다.>");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            textcow.setFont(font);
            textcow.setBounds(230, 30, 500, 30);
            backgroundPanel.add(textcow);
        } else if (userYearS % 12 == 6) {//호랑이띠
        	
        	//호랑이 이미지
        	ImageIcon tigerimg = new ImageIcon("images/tiger.png");
            
            Image tiger = tigerimg.getImage();
            Image changetiger = tiger.getScaledInstance(130,130,Image.SCALE_SMOOTH);
            ImageIcon tigerimg2 = new ImageIcon(changetiger);
            JLabel tigerlb = new JLabel(tigerimg2);
            tigerlb.setBounds(40, 40, 150, 150);
            backgroundPanel.add(tigerlb);
            
            //글1 삽입
            JLabel textt = new JLabel("<"+userNameS+"님의 띠는 호랑이띠입니다.>");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            textt.setFont(font);
            textt.setBounds(230, 30, 500, 30);
            backgroundPanel.add(textt);
        } else if (userYearS % 12 == 7) {//토끼띠
        	
        	//토끼 이미지
        	ImageIcon rabbitimg = new ImageIcon("images/rabbit.png");
            
            Image rabbit = rabbitimg.getImage();
            Image changerabbit = rabbit.getScaledInstance(130,130,Image.SCALE_SMOOTH);
            ImageIcon rabbitimg2 = new ImageIcon(changerabbit);
            JLabel rabbitlb = new JLabel(rabbitimg2);
            rabbitlb.setBounds(40, 40, 150, 150);
            backgroundPanel.add(rabbitlb);
            
            //글1 삽입
            JLabel textr = new JLabel("<"+userNameS+"님의 띠는 토끼띠입니다.>");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            textr.setFont(font);
            textr.setBounds(230, 30, 500, 30);
            backgroundPanel.add(textr);
        } else if (userYearS % 12 == 8) {//용띠
        	
        	//용 이미지
        	ImageIcon dragonimg = new ImageIcon("images/dragon.png");
            
            Image dragon = dragonimg.getImage();
            Image changedragon = dragon.getScaledInstance(130,130,Image.SCALE_SMOOTH);
            ImageIcon dragonimg2 = new ImageIcon(changedragon);
            JLabel dragonlb = new JLabel(dragonimg2);
            dragonlb.setBounds(40, 40, 150, 150);
            backgroundPanel.add(dragonlb);
            
            //글1 삽입
            JLabel textdr = new JLabel("<"+userNameS+"님의 띠는 용띠입니다.>");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            textdr.setFont(font);
            textdr.setBounds(230, 30, 500, 30);
            backgroundPanel.add(textdr);
        } else if (userYearS % 12 == 9) {//뱀띠
        	
        	//뱀 이미지
        	ImageIcon snakeimg = new ImageIcon("images/snake.png");
            
            Image snake = snakeimg.getImage();
            Image changesnake = snake.getScaledInstance(130,130,Image.SCALE_SMOOTH);
            ImageIcon snakeimg2 = new ImageIcon(changesnake);
            JLabel snakelb = new JLabel(snakeimg2);
            snakelb.setBounds(40, 40, 150, 150);
            backgroundPanel.add(snakelb);
            
            //글1 삽입
            JLabel texts = new JLabel("<"+userNameS+"님의 띠는 뱀띠입니다.>");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            texts.setFont(font);
            texts.setBounds(230, 30, 500, 30);
            backgroundPanel.add(texts);
        } else if (userYearS % 12 == 10) {//말띠
        	
        	//말 이미지
        	ImageIcon horseimg = new ImageIcon("images/horse.png");
            
            Image horse = horseimg.getImage();
            Image changehorse = horse.getScaledInstance(130,130,Image.SCALE_SMOOTH);
            ImageIcon horseimg2 = new ImageIcon(changehorse);
            JLabel horselb = new JLabel(horseimg2);
            horselb.setBounds(40, 40, 150, 150);
            backgroundPanel.add(horselb);
            
            //글1 삽입
            JLabel texth = new JLabel("<"+userNameS+"님의 띠는 말띠입니다.>");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            texth.setFont(font);
            texth.setBounds(230, 30, 500, 30);
            backgroundPanel.add(texth);
        } else { //양띠
        	//양 이미지
        	ImageIcon sheepimg = new ImageIcon("images/sheep.png");
            
            Image sheep = sheepimg.getImage();
            Image changesheep = sheep.getScaledInstance(130,130,Image.SCALE_SMOOTH);
            ImageIcon sheepimg2 = new ImageIcon(changesheep);
            JLabel sheeplb = new JLabel(sheepimg2);
            sheeplb.setBounds(40, 40, 150, 150); /// 여기 숫자!
            backgroundPanel.add(sheeplb);
            
            //글1 삽입
            JLabel textsh = new JLabel("<"+userNameS+"님의 띠는 양띠입니다.>");
            Font font = new Font("휴먼옛체", Font.PLAIN, 25);
            textsh.setFont(font);
            textsh.setBounds(230, 30, 500, 30);  //여기도 숫자 !!
            backgroundPanel.add(textsh);
        }
	}

	private void friendAnimal(Random random) {
		String[] otherAnimals = {"원숭이", "닭", "개", "돼지" ,"쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"};

		String randomAnimal = otherAnimals[random.nextInt(otherAnimals.length)];
		String image;

		if (randomAnimal.equals("원숭이")) {
			image = "images/monkey.png";
		} else if (randomAnimal.equals("닭"))	{
			image = "images/chicken.png";
		} else if (randomAnimal.equals("개"))	{
			image = "images/dog.png";
		} else if (randomAnimal.equals("돼지"))	{
			image = "images/pig.png";
		} else if (randomAnimal.equals("쥐"))	{
			image = "images/mouse.png";
		} else if (randomAnimal.equals("소"))	{
			image = "images/cow.png";
		} else if (randomAnimal.equals("호랑이"))	{
			image = "images/tiger.png";
		} else if (randomAnimal.equals("토끼"))	{
			image = "images/rabbit.png";
		} else if (randomAnimal.equals("용"))	{
			image = "images/dragon.png";
		} else if (randomAnimal.equals("뱀"))	{
			image = "images/snake.png";
		} else if (randomAnimal.equals("말"))	{
			image = "images/horse.png";
		} else {
			image = "images/sheep.png";
		}

		ImageIcon img = new ImageIcon(image);
            
            Image animal = img.getImage();
            Image changeanimal = animal.getScaledInstance(70,70,Image.SCALE_SMOOTH);
            ImageIcon img2 = new ImageIcon(changeanimal);
            JLabel animallb = new JLabel(img2);
            animallb.setBounds(470, 100, 70, 70); /// 여기 숫자!
            backgroundPanel.add(animallb);

	}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ScreenFour(userName, userYear));
    }
}
