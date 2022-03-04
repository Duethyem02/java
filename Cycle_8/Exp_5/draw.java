import java.awt.*;
import javax.swing.*;
class draw extends Frame{
        int a;
        draw(){
         a=1;
        }
        public void paint(Graphics g){
        	if(a==1){
        		g.drawRect(20,30,40,50);
        		g.drawOval(20,30,40,50);
        	}
        	
        }
	public static void main (String args[]){
		draw d=new draw();
		JFrame f=new JFrame();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	f.add(d);
        	f.setSize(300, 300);
        	f.setVisible(true);
	}
}
