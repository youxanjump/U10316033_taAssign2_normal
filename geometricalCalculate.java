# U10316033_taAssign2_normal
geometricalCalculate

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class geometricalCalculate extends JFrame{
	//create values of circle
	JButton jbtCalculateCircle = new JButton("Calculate");
	JButton jbtCleanCircle = new JButton("Clean");
	JTextField radius = new JTextField(5);
	JTextField circleArea = new JTextField(5);
	JTextField circlePerimeter = new JTextField(5);
	
	double radiusDouble;
	double circleAreaDouble;
	double circlePerimeterDouble;
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
	//create values of square
	JButton jbtCalculateSquare = new JButton("Calculate");
	JButton jbtCleanSquare = new JButton("Clean");
	JTextField squareLength = new JTextField(5);
	JTextField squareArea = new JTextField(5);
	JTextField squarePerimeter = new JTextField(5);
	
	double squareLengthDouble;
	double squareAreaDouble;
	double squarePerimeterDouble;
	
	public geometricalCalculate(){
		//input and calculate the circle
		JPanel circleTitle = new JPanel();
		circleTitle.setLayout(new FlowLayout(FlowLayout.LEFT));
		circleTitle.setSize(100,50);
		circleTitle.add(new JLabel("Circle:"));
		
		JPanel circleRadiusInput = new JPanel();
		circleRadiusInput.setLayout(new FlowLayout(FlowLayout.LEFT));
		circleRadiusInput.setSize(300,50);
		circleRadiusInput.add(new JLabel("Radius"));
		circleRadiusInput.add(radius);
		circleRadiusInput.add(jbtCalculateCircle);
		circleRadiusInput.add(jbtCleanCircle);
		
		JPanel circleAreaCalculate = new JPanel();
		circleAreaCalculate.setLayout(new FlowLayout(FlowLayout.LEFT));
		circleAreaCalculate.setSize(200,50);
		circleAreaCalculate.add(new JLabel("The area is: "));
		circleAreaCalculate.add(circleArea);
		
		JPanel circlePerimeterCalculate = new JPanel();
		circlePerimeterCalculate.setLayout(new FlowLayout(FlowLayout.LEFT));
		circlePerimeterCalculate.setSize(200,50);
		circlePerimeterCalculate.add(new JLabel("The perimeter is: "));
		circlePerimeterCalculate.add(circlePerimeter);
		
		add(circleTitle);
		add(circleRadiusInput);
		add(circleAreaCalculate);
		add(circlePerimeterCalculate);
		
		jbtCalculateCircle.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			
				radiusDouble = Double.parseDouble(radius.getText());
				
				circlePerimeterDouble = 2*radiusDouble*Math.PI;
				circleAreaDouble = Math.PI*Math.pow(radiusDouble,2);
				
				circleArea.setText(String.format("%.2f" , circleAreaDouble));
				circlePerimeter.setText(String.format("%.2f" , circlePerimeterDouble));
			}	
		});
		
		jbtCleanCircle.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			
				radius.setText("");
				circleArea.setText("");
				circlePerimeter.setText("");
			}
			
		});
		
		//input and calculate the sector
		JPanel sectorTitle = new JPanel();
		sectorTitle.setLayout(new FlowLayout(FlowLayout.LEFT));
		sectorTitle.setSize(100,50);
		sectorTitle.add(new JLabel("Sector:"));
		
		JPanel sectorRadiusInput = new JPanel();
		sectorRadiusInput.setLayout(new FlowLayout(FlowLayout.LEFT));
		sectorRadiusInput.setSize(200,50);
		sectorRadiusInput.add(new JLabel("Radius"));
		sectorRadiusInput.add(sectorRadius);
		
		JPanel sectorAngleInput = new JPanel();
		sectorAngleInput.setLayout(new FlowLayout(FlowLayout.LEFT));
		sectorAngleInput.setSize(300,50);
		sectorAngleInput.add(new JLabel("Angle"));
		sectorAngleInput.add(sectorAngle);
		sectorAngleInput.add(jbtCalculateSector);
		sectorAngleInput.add(jbtCleanSector);
		
		JPanel sectorAreaCalculate = new JPanel();
		sectorAreaCalculate.setLayout(new FlowLayout(FlowLayout.LEFT));
		sectorAreaCalculate.setSize(200,50);
		sectorAreaCalculate.add(new JLabel("The area is: "));
		sectorAreaCalculate.add(sectorArea);
		
		JPanel sectorPerimeterCalculate = new JPanel();
		sectorPerimeterCalculate.setLayout(new FlowLayout(FlowLayout.LEFT));
		sectorPerimeterCalculate.setSize(200,50);
		sectorPerimeterCalculate.add(new JLabel("The perimeter is: "));
		sectorPerimeterCalculate.add(sectorPerimeter);
		
		add(sectorTitle);
		add(sectorRadiusInput);
		add(sectorAngleInput);
		add(sectorAreaCalculate);
		add(sectorPerimeterCalculate);
		
		
		
		jbtCalculateSector.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			
				sectorRadiusDouble = Double.parseDouble(sectorRadius.getText());
				sectorAngleDouble = Double.parseDouble(sectorAngle.getText());
				
				sectorPerimeterDouble = (2*sectorRadiusDouble*Math.PI*(sectorAngleDouble/360)) + (2*sectorRadiusDouble);
				sectorAreaDouble = Math.PI*Math.pow(sectorRadiusDouble,2)*(sectorAngleDouble/360);
				
				sectorArea.setText(String.format("%.2f" , sectorAreaDouble));
				sectorPerimeter.setText(String.format("%.2f" , sectorPerimeterDouble));
			}	
		});
		
		jbtCleanSector.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			
				sectorRadius.setText("");
				sectorArea.setText("");
				sectorPerimeter.setText("");
				sectorAngle.setText("");
			}
			
		});
		//input and calculate the square
		JPanel squareTitle = new JPanel();
		squareTitle.setLayout(new FlowLayout(FlowLayout.LEFT));
		squareTitle.setSize(100,50);
		squareTitle.add(new JLabel("Square:"));
		
		JPanel squareLengthInput = new JPanel();
		squareLengthInput.setLayout(new FlowLayout(FlowLayout.LEFT));
		squareLengthInput.setSize(300,50);
		squareLengthInput.add(new JLabel("Length"));
		squareLengthInput.add(squareLength);
		squareLengthInput.add(jbtCalculateSquare);
		squareLengthInput.add(jbtCleanSquare);
		
		JPanel squareAreaCalculate = new JPanel();
		squareAreaCalculate.setLayout(new FlowLayout(FlowLayout.LEFT));
		squareAreaCalculate.setSize(200,50);
		squareAreaCalculate.add(new JLabel("The area is: "));
		squareAreaCalculate.add(squareArea);
		
		JPanel squarePerimeterCalculate = new JPanel();
		squarePerimeterCalculate.setLayout(new FlowLayout(FlowLayout.LEFT));
		squarePerimeterCalculate.setSize(200,50);
		squarePerimeterCalculate.add(new JLabel("The perimeter is: "));
		squarePerimeterCalculate.add(squarePerimeter);
		
		add(squareTitle);
		add(squareLengthInput);
		add(squareAreaCalculate);
		add(squarePerimeterCalculate);
		
		
		jbtCalculateSquare.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			
				squareLengthDouble = Double.parseDouble(squareLength.getText());
	
				squarePerimeterDouble = 4*squareLengthDouble;
				squareAreaDouble = Math.pow(squareLengthDouble,2);
				
				squareArea.setText(String.format("%.2f" , squareAreaDouble));
				squarePerimeter.setText(String.format("%.2f" , squarePerimeterDouble));
			}	
		});
		
		jbtCleanSquare.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			
				squareLength.setText("");
				squareArea.setText("");
				squarePerimeter.setText("");
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
