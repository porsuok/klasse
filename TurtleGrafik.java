import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TurtleGrafik extends JFrame {

	private JPanel contentPane;
	private Turtle t;

	public TurtleGrafik() {
		super("Turtle-Grafik");
		createGUI();
	}

	private void createGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 905, 698);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAufg1 = new JButton("Aufg1");
		btnAufg1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg1();
			}
		});
		btnAufg1.setBounds(12, 12, 67, 25);
		contentPane.add(btnAufg1);
		
		JButton btnAufg2 = new JButton("Aufg2");
		btnAufg2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg2();
			}
		});
		btnAufg2.setBounds(91, 12, 67, 25);
		contentPane.add(btnAufg2);
		
		JButton btnAufg3 = new JButton("Aufg3");
		btnAufg3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg3();
			}
		});
		btnAufg3.setBounds(170, 12, 67, 25);
		contentPane.add(btnAufg3);
		
		JButton btnAufg4 = new JButton("Aufg4");
		btnAufg4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg4();
			}
		});
		btnAufg4.setBounds(249, 12, 67, 25);
		contentPane.add(btnAufg4);
		
		JButton btnAufg5 = new JButton("Aufg5");
		btnAufg5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg5();
			}
		});
		btnAufg5.setBounds(328, 12, 67, 25);
		contentPane.add(btnAufg5);
		
		JButton btnAufg6 = new JButton("Aufg6");
		btnAufg6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg6();
			}
		});
		btnAufg6.setBounds(407, 12, 67, 25);
		contentPane.add(btnAufg6);
		
		JButton btnAufg7 = new JButton("Aufg7");
		btnAufg7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg7();
			}
		});
		btnAufg7.setBounds(486, 12, 67, 25);
		contentPane.add(btnAufg7);
		
		JButton btnAufg8 = new JButton("Aufg8");
		btnAufg8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg8();
			}
		});
		btnAufg8.setBounds(565, 12, 67, 25);
		contentPane.add(btnAufg8);
		
		JButton btnAufg9 = new JButton("Aufg9");
		btnAufg9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg9();
			}
		});
		btnAufg9.setBounds(644, 12, 67, 25);
		contentPane.add(btnAufg9);
		
		JButton btnAufg10 = new JButton("Aufg10");
		btnAufg10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg10();
			}
		});
		btnAufg10.setBounds(723, 12, 74, 25);
		contentPane.add(btnAufg10);
		
		JButton btnAufg11 = new JButton("Aufg11");
		btnAufg11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg11();
			}
		});
		btnAufg11.setBounds(809, 12, 74, 25);
		contentPane.add(btnAufg11);
		
		t = new Turtle(350, 300);
		t.setBounds(12, 48, 769, 609);
		contentPane.add(t);
		
		JButton btnLoeschen = new JButton("löschen");
		btnLoeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.loeschen();
				t.neuStart(350, 300);
			}
		});
		btnLoeschen.setBounds(793, 49, 98, 609);
		contentPane.add(btnLoeschen);
	}
	
	private void aufg1() {
		// Aufgabe 1
		t.vor(100);
		t.drehen(120);
		t.vor(100);
		t.drehen(120);
		t.vor(100);
	}
	
	private void aufg2() {
		// Aufgabe 2
		int i = 0;
		while (i < 4) {
			t.vor(200);
			t.drehen(90);
			i++;
		}
		t.drehen(45); // 90+45 = 135
		t.vor(283);
		t.drehen(135);
		t.vor(200);
		t.drehen(135);
		t.vor(283);
	}
	}
	
	private void aufg3() {
		// Aufgabe 3
		int i = 0;
		while(i < 6) {
			t.vor(100);
			t.drehen(60);
			i++;
		}
	}
	
	private void aufg4() {
		// Aufgabe 4
		for(int i = 0; i < 8; i++) {
			t.vor(100);
			t.drehen(45);
		}
	}
	
	private void aufg5() {
		// Aufgabe 5
		int treppe = 0;
		
		while(treppe < 15) {
			t.vor(10);
			t.drehen(-90);
			t.vor(10);
			t.drehen(90);
			treppe++;
		}
		if(treppe == 15) {
			t.drehen(-90);
		}
		while(treppe > 0) {
			t.vor(10);
			t.drehen(-90);
			t.vor(10);
			t.drehen(90);
			treppe--;
		}	
	}
	
	private void aufg6() {
		// Aufgabe 6
		double laenge = 15;
		
		for (int i = 0; i < 64; i++;) {
		t.vor(laenge);
		t.drehen(90);
		laenge = laenge + laenge / 15;
		}
	}

	private void quadrat(double laenge) {
	    for (int i = 0; i < 4; i++) {
	        t.vor(laenge);
	        t.drehen(90);
	    }
	}
	
	private void aufg7() {
		// Aufgabe 7
		double laenge = 4;
		int i = 0;
		while(i < 22) {
			quadrat(laenge);
			laenge = laenge + laenge * 0.25;
			i++;
		}
	}

	private void sechseck() {
		for (int i = 0; i < 6; i++) {
		t.vor(100);
		t.drehen(60);
		}
	}
	
	private void aufg8() {
		// Aufgabe 8
		for (int i = 0; i < 18; i++) {
			sechseck();
			t.drehen(20);
		}
	}

	private void dreieck() {
		for(int i = 0; i < 3; i++) {
			t.vor(100);
			t.drehen(120);
		}
	}
	
	private void aufg9() {
		// Aufgabe 9
		for(int i = 0; i < 6; i++) {
			dreieck();
			t.drehen(60);
		}
	}
	
	private void aufg10() {
		// Aufgabe 10
		int i = 0;
		t.drehen(60);
		while(i < 4) {
			dreieck();
			t.drehen(90);
			i++;
		}
	}
	
	private void aufg11() {
		// Aufgabe 11
		int i = 0;
		while(i < 6) {
			dreieck();
			t.vor(100);
			t.drehen(-60);		
			i++;
		}
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TurtleGrafik frame = new TurtleGrafik();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
