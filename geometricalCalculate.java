
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class geometricalCalculate extends JFrame{
	
	public geometricalCalculate(){
		
		
		circle circle = new circle();
		
		add(circle.circleTitle());
		add(circle.circleRadiusInput());
		add(circle.circleAreaCalculate());
		add(circle.circlePerimeterCalculate());
		
		circle.jbtCalculateCircle.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			
				circle.radiusDouble = Double.parseDouble(circle.radius.getText());
				
				circle.circlePerimeterDouble = 2*circle.radiusDouble*Math.PI;
				circle.circleAreaDouble = Math.PI*Math.pow(circle.radiusDouble,2);
				
				circle.circleArea.setText(String.format("%.2f" , circle.circleAreaDouble));
				circle.circlePerimeter.setText(String.format("%.2f" , circle.circlePerimeterDouble));
			}	
		});
		
		circle.jbtCleanCircle.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			
				circle.radius.setText("");
				circle.circleArea.setText("");
				circle.circlePerimeter.setText("");
			}
			
		});
		
		sector sector = new sector();
		
		add(sector.sectorTitle());
		add(sector.sectorRadiusInput());
		add(sector.sectorAngleInput());
		add(sector.sectorAreaCalculate());
		add(sector.sectorPerimeterCalculate());
		
		sector.jbtCalculateSector.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			
				sector.sectorRadiusDouble = Double.parseDouble(sector.sectorRadius.getText());
				sector.sectorAngleDouble = Double.parseDouble(sector.sectorAngle.getText());
				
				sector.sectorPerimeterDouble = (2*sector.sectorRadiusDouble*Math.PI*(sector.sectorAngleDouble/360)) + (2*sector.sectorRadiusDouble);
				sector.sectorAreaDouble = Math.PI*Math.pow(sector.sectorRadiusDouble,2)*(sector.sectorAngleDouble/360);
				
				sector.sectorArea.setText(String.format("%.2f" , sector.sectorAreaDouble));
				sector.sectorPerimeter.setText(String.format("%.2f" , sector.sectorPerimeterDouble));
			}	
		});
		
		sector.jbtCleanSector.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			
				sector.sectorRadius.setText("");
				sector.sectorArea.setText("");
				sector.sectorPerimeter.setText("");
				sector.sectorAngle.setText("");
			}
			
		});
		
		square square = new square();
		
		add(square.squareTitle());
		add(square.squareLengthInput());
		add(square.squareAreaCalculate());
		add(square.squarePerimeterCalculate());
		
		
		square.jbtCalculateSquare.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			
				square.squareLengthDouble = Double.parseDouble(square.squareLength.getText());
	
				square.squarePerimeterDouble = 4*square.squareLengthDouble;
				square.squareAreaDouble = Math.pow(square.squareLengthDouble,2);
				
				square.squareArea.setText(String.format("%.2f" , square.squareAreaDouble));
				square.squarePerimeter.setText(String.format("%.2f" , square.squarePerimeterDouble));
			}	
		});
		
		square.jbtCleanSquare.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			
				square.squareLength.setText("");
				square.squareArea.setText("");
				square.squarePerimeter.setText("");
			}
			
		});
	}
	
	public static void main(String[] args){
		geometricalCalculate frame = new geometricalCalculate();
		frame.setTitle("U10316033_GeoCalculate");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,600);
		frame.setVisible(true);
		frame.setLayout(new GridLayout(13,1));	
	}

}

class circle{

	//create values of circle
	JButton jbtCalculateCircle = new JButton("Calculate");
	JButton jbtCleanCircle = new JButton("Clean");
	JTextField radius = new JTextField(5);
	JTextField circleArea = new JTextField(5);
	JTextField circlePerimeter = new JTextField(5);
	
	double radiusDouble;
	double circleAreaDouble;
	double circlePerimeterDouble;
	//input and calculate the circle
	JPanel circleTitle(){
		JPanel circleTitle = new JPanel();
		circleTitle.setLayout(new FlowLayout(FlowLayout.LEFT));
		circleTitle.setSize(100,50);
		circleTitle.add(new JLabel("Circle:"));
		
		return circleTitle;
	}
	
	JPanel circleRadiusInput(){
		JPanel circleRadiusInput = new JPanel();
		circleRadiusInput.setLayout(new FlowLayout(FlowLayout.LEFT));
		circleRadiusInput.setSize(300,50);
		circleRadiusInput.add(new JLabel("Radius"));
		circleRadiusInput.add(radius);
		circleRadiusInput.add(jbtCalculateCircle);
		circleRadiusInput.add(jbtCleanCircle);
		
		return circleRadiusInput;
	}
	
	JPanel circleAreaCalculate(){
		JPanel circleAreaCalculate = new JPanel();
		circleAreaCalculate.setLayout(new FlowLayout(FlowLayout.LEFT));
		circleAreaCalculate.setSize(200,50);
		circleAreaCalculate.add(new JLabel("The area is: "));
		circleAreaCalculate.add(circleArea);
		
		return circleAreaCalculate;
	}
	
	JPanel circlePerimeterCalculate(){
		JPanel circlePerimeterCalculate = new JPanel();
		circlePerimeterCalculate.setLayout(new FlowLayout(FlowLayout.LEFT));
		circlePerimeterCalculate.setSize(200,50);
		circlePerimeterCalculate.add(new JLabel("The perimeter is: "));
		circlePerimeterCalculate.add(circlePerimeter);
		
		return circlePerimeterCalculate;
	}	

}

class sector{

	//create values of sector
	JButton jbtCalculateSector = new JButton("Calculate");
	JButton jbtCleanSector = new JButton("Clean");
	JTextField sectorRadius = new JTextField(5);
	JTextField sectorAngle = new JTextField(5);
	JTextField sectorArea = new JTextField(5);
	JTextField sectorPerimeter = new JTextField(5);
	
	double sectorRadiusDouble;
	double sectorAngleDouble;
	double sectorAreaDouble;
	double sectorPerimeterDouble;
	
	//input and calculate the sector
	JPanel sectorTitle(){
		JPanel sectorTitle = new JPanel();
		sectorTitle.setLayout(new FlowLayout(FlowLayout.LEFT));
		sectorTitle.setSize(100,50);
		sectorTitle.add(new JLabel("Sector:"));
		
		return sectorTitle;
	}
	
	JPanel sectorRadiusInput(){
		JPanel sectorRadiusInput = new JPanel();
		sectorRadiusInput.setLayout(new FlowLayout(FlowLayout.LEFT));
		sectorRadiusInput.setSize(200,50);
		sectorRadiusInput.add(new JLabel("Radius"));
		sectorRadiusInput.add(sectorRadius);
		
		return sectorRadiusInput;
	}
	
	JPanel sectorAngleInput(){
		JPanel sectorAngleInput = new JPanel();
		sectorAngleInput.setLayout(new FlowLayout(FlowLayout.LEFT));
		sectorAngleInput.setSize(300,50);
		sectorAngleInput.add(new JLabel("Angle"));
		sectorAngleInput.add(sectorAngle);
		sectorAngleInput.add(jbtCalculateSector);
		sectorAngleInput.add(jbtCleanSector);
		
		return sectorAngleInput;
	}
	
	JPanel sectorAreaCalculate(){
		JPanel sectorAreaCalculate = new JPanel();
		sectorAreaCalculate.setLayout(new FlowLayout(FlowLayout.LEFT));
		sectorAreaCalculate.setSize(200,50);
		sectorAreaCalculate.add(new JLabel("The area is: "));
		sectorAreaCalculate.add(sectorArea);
		
		return sectorAreaCalculate;
	}
	
	JPanel sectorPerimeterCalculate(){
		JPanel sectorPerimeterCalculate = new JPanel();
		sectorPerimeterCalculate.setLayout(new FlowLayout(FlowLayout.LEFT));
		sectorPerimeterCalculate.setSize(200,50);
		sectorPerimeterCalculate.add(new JLabel("The perimeter is: "));
		sectorPerimeterCalculate.add(sectorPerimeter);
		
		return sectorPerimeterCalculate;
	}
}

class square{

	//create values of square
	JButton jbtCalculateSquare = new JButton("Calculate");
	JButton jbtCleanSquare = new JButton("Clean");
	JTextField squareLength = new JTextField(5);
	JTextField squareArea = new JTextField(5);
	JTextField squarePerimeter = new JTextField(5);
	
	double squareLengthDouble;
	double squareAreaDouble;
	double squarePerimeterDouble;
	
	//input and calculate the square
	JPanel squareTitle(){
		JPanel squareTitle = new JPanel();
		squareTitle.setLayout(new FlowLayout(FlowLayout.LEFT));
		squareTitle.setSize(100,50);
		squareTitle.add(new JLabel("Square:"));
		
		return squareTitle;
	}
	
	JPanel squareLengthInput(){
		JPanel squareLengthInput = new JPanel();
		squareLengthInput.setLayout(new FlowLayout(FlowLayout.LEFT));
		squareLengthInput.setSize(300,50);
		squareLengthInput.add(new JLabel("Length"));
		squareLengthInput.add(squareLength);
		squareLengthInput.add(jbtCalculateSquare);
		squareLengthInput.add(jbtCleanSquare);
		
		return squareLengthInput;
	}
	
	JPanel squareAreaCalculate(){
		JPanel squareAreaCalculate = new JPanel();
		squareAreaCalculate.setLayout(new FlowLayout(FlowLayout.LEFT));
		squareAreaCalculate.setSize(200,50);
		squareAreaCalculate.add(new JLabel("The area is: "));
		squareAreaCalculate.add(squareArea);
		
		return squareAreaCalculate;
	}
	
	JPanel squarePerimeterCalculate(){
		JPanel squarePerimeterCalculate = new JPanel();
		squarePerimeterCalculate.setLayout(new FlowLayout(FlowLayout.LEFT));
		squarePerimeterCalculate.setSize(200,50);
		squarePerimeterCalculate.add(new JLabel("The perimeter is: "));
		squarePerimeterCalculate.add(squarePerimeter);
		
		return squarePerimeterCalculate;
	}
	
	
}
