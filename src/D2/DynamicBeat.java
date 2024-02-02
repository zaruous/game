package D2;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame {

    private Image screenImage;
    private Graphics screenGraphic;
    private Image introBackground;
    public DynamicBeat(){
        setTitle("Dynamic beat");
        setSize(Main1.SCREEN_WIDTH, Main1.SCREEN_HEIGHT);
        setResizable(false);//한번 만들어진 게임창은 사용자가 인위적으로 못바꿈
        setLocationRelativeTo(null);//실행했을때 컴퓨터 중앙에 게임이 뜸
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//게임창종료했을시 프로그램종료
        setVisible(true);//눈에 보이게 출력
        File file = new File("src/");

        introBackground = new ImageIcon(Main1.class.getResource("../introBackground.jpg")).getImage();
    }
    public void paint(Graphics g){//화면크기만큼 생성해서 그려줌
        screenImage = createImage(Main1.SCREEN_WIDTH,Main1.SCREEN_HEIGHT);
        screenGraphic=screenImage.getGraphics();
        screenDraw(screenGraphic);
        g.drawImage(screenImage,0,0,null);
    }
    public void screenDraw(Graphics g){
        g.drawImage(introBackground,0,0,null);
        this.repaint();//paint는 화면을 그려줌 매순간마다 반복되며 그려줌
    }
}
