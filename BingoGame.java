package AwtSwing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;




public class BingoGame {
	static JPanel paneLNorth;// top View
	static JPanel paneLCenter;//game 화면
	static JLabel labeLMessage;
	static JButton[] buttons = new JButton[16];
	static String[] images = {
			"fruit01.png", "fruit02.png", "fruit03.png", "fruit04.png",
	        "fruit05.png", "fruit06.png", "fruit07.png", "fruit08.png",
			"fruit01.png", "fruit02.png", "fruit03.png", "fruit04.png",
	        "fruit05.png", "fruit06.png", "fruit07.png", "fruit08.png",
	};
	
	static int openCount = 0;//오픈카드 카운트
	static int buttonIndexSave1 = 0;//처음 오픈카드 인덱스0~15
	static int buttonIndexSave2 = 0;//
	static Timer timer;
	static int tryCount = 0;
	static int successCount = 0;
	
	static class MyFrame extends JFrame implements ActionListener{
		public MyFrame(String title) {
			super(title);
			this.setLayout(new BorderLayout());
			this.setSize(400,500);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			initUI(this);
			mixCard();
			
			this.pack(); //Pack Empty Space.
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(openCount == 2) {
				return;
			}
			
			JButton btn =(JButton)e.getSource();
			int index = getButtonIndex( btn );
			btn.setIcon(changeImage(images[index]));
			
			openCount++;
			if(openCount ==1) {
				buttonIndexSave1=index;
			}
			else if (openCount ==2) {
				buttonIndexSave2 = index;
				tryCount++;
				labeLMessage.setText("Find Same Fruit!" + "Try " + tryCount);
				
				boolean isBingo = checkCard(buttonIndexSave1, buttonIndexSave2);
				if( isBingo==true) {
					openCount = 0;
					successCount++;
					if(successCount == 8) {
						labeLMessage.setText("Game Over" + "Try" +tryCount);
					}
					
				}else {
					backToQuestion();
				}
			}
		}
		
		public void backToQuestion(){
			timer = new Timer(1000, new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Timer");
					
					openCount = 0;
					buttons[buttonIndexSave1].setIcon( changeImage("question.png"));
					buttons[buttonIndexSave2].setIcon( changeImage("question.png"));
					timer.stop();
				}
				
			});
			timer.start();
		}
		
		
		public boolean checkCard(int index1, int index2) {
			if(index1== index2) {
				return false;
			}
			if(images[index1].equals(images[index2])) {
				return true;
			}else {
				return false;
			}
		}
		
		public int getButtonIndex(JButton btn) {
			int index = 0;
			for(int i=0; i<16; i++) {
				if(buttons[i] == btn) {
					index = i;
				}
			}
			return index;
		}
	}
	static void mixCard() {
		Random rand = new Random();
		for(int i=0; i<100; i++) {
			int random = rand.nextInt(15) + 1;
			
			String temp = images[0];
			images[0] = images [random];
			images[random] = temp;
		}
	}
	
	static void initUI(MyFrame myFrame) {
		paneLNorth = new JPanel();
		paneLNorth.setPreferredSize(new Dimension(400, 100));
		paneLNorth.setBackground(Color.BLUE);
		labeLMessage = new JLabel("Find Same Fruit!" + "Try 0");
		labeLMessage.setPreferredSize(new Dimension(400, 100));
		labeLMessage.setForeground(Color.WHITE);
		labeLMessage.setFont(new Font("Monazo", Font.BOLD, 20));
		labeLMessage.setHorizontalAlignment(JLabel.CENTER);
		paneLNorth.add(labeLMessage);
		myFrame.add("North", paneLNorth);
		
		
		paneLCenter = new JPanel();
		paneLCenter.setLayout(new GridLayout(4,4));
		paneLCenter.setPreferredSize(new Dimension(400,400));
		for(int i=0; i<16; i++) {
			buttons[i] = new JButton();
			buttons[i].setPreferredSize(new Dimension(100,100));
			buttons[i].setIcon( changeImage("question.png"));
			buttons[i].addActionListener(myFrame);
			paneLCenter.add(buttons[i]);
		}
		myFrame.add("Center", paneLCenter);
	}
	
	static ImageIcon changeImage(String filename) {
		ImageIcon icon = new ImageIcon("./img/" + filename);
		Image originImage = icon.getImage();
		Image changedImage = originImage.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		ImageIcon icon_newIcon = new ImageIcon(changedImage);
		return icon_newIcon;
	}
	
	public static void main(String[] args) {
		new MyFrame("Bingo Game");

	}

}
