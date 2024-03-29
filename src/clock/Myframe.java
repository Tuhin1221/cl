package clock;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;//parsing date 
import javax.swing.JFrame;//create frame
import javax.swing.JLabel;
import java.util.Calendar;
@SuppressWarnings("serial")
public class Myframe extends JFrame{

	Calendar calender;
	SimpleDateFormat timeFormat;
	
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	
	Myframe(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Clock ");
		this.setLayout(new FlowLayout());
		this.setSize(350, 250);
		this.setResizable(false);
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("E");
		dateFormat = new SimpleDateFormat("  MMMM,dd/yyyy");
		
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));//this be syntax 
		timeLabel.setForeground(Color.CYAN);//new Color(0x00FF00));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Ink Free",Font.PLAIN,35));
		
		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Ink Free",Font.PLAIN,25));
		
		
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		this.setVisible(true);
		
		setTime();//method
	}
	public void setTime() {
		while(true) {
		time=timeFormat.format(Calendar.getInstance().getTime());//Calendar.getInstance() is to get the current time zone
		timeLabel.setText(time);                                 //
		
		
		
		day=dayFormat.format(Calendar.getInstance().getTime());
		dayLabel.setText(day);
		
		date=dateFormat.format(Calendar.getInstance().getTime());
		dateLabel.setText(date);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	

}
