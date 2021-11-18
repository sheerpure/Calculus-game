package application;
	
import java.util.ArrayList;
import java.util.List;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
public class Main extends Application {
	List<ImageView> ivList = new ArrayList<>();
	List<Image> iV = new ArrayList<>();
	public Stage stage;
	public int timecount,timer;
	public Timeline gameLoop;
	public double FPS=1;
	Label timershow;
	Media media_BGM = new Media(getClass().getResource("BGM.mp3").toString()); 
	MediaPlayer BGM = new MediaPlayer(media_BGM);
	Media media_BGM2 = new Media(getClass().getResource("BGM2.mp3").toString()); 
	MediaPlayer BGM2 = new MediaPlayer(media_BGM2);
	Media media_BGM3 = new Media(getClass().getResource("BGM3.mp3").toString()); 
	MediaPlayer BGM3 = new MediaPlayer(media_BGM3);
	Media media_BGM4 = new Media(getClass().getResource("BGM4.mp3").toString()); 
	MediaPlayer BGM4 = new MediaPlayer(media_BGM4);
	GridPane gp;
	Image img_role1 = new Image(Main.class.getResourceAsStream("1.gif"));
	Image img_role2 = new Image(Main.class.getResourceAsStream("2.gif"));
	Image img_role3 = new Image(Main.class.getResourceAsStream("3.gif"));
	Image img_role4 = new Image(Main.class.getResourceAsStream("4.gif"));
	Image img_role5 = new Image(Main.class.getResourceAsStream("5.gif"));
	Image img_role6 = new Image(Main.class.getResourceAsStream("6.gif"));
	Image img_role7 = new Image(Main.class.getResourceAsStream("7.gif"));
	Image img_role8 = new Image(Main.class.getResourceAsStream("8.gif"));
	Image img_Role1 = new Image(Main.class.getResourceAsStream("1.3.gif"));
	Image img_Role2 = new Image(Main.class.getResourceAsStream("2.3.gif"));
	Image img_Role3 = new Image(Main.class.getResourceAsStream("3.3.gif"));
	Image img_Role4 = new Image(Main.class.getResourceAsStream("4.3.gif"));
	Image img_Role5 = new Image(Main.class.getResourceAsStream("5.3.gif"));
	Image img_Role6 = new Image(Main.class.getResourceAsStream("6.3.gif"));
	Image img_Role7 = new Image(Main.class.getResourceAsStream("7.3.gif"));
	Image img_Role8 = new Image(Main.class.getResourceAsStream("8.3.gif"));
	Image img_CH11 = new Image(Main.class.getResourceAsStream("CH1-1.png"));
	Image img_CH12 = new Image(Main.class.getResourceAsStream("CH1-2.png"));
	Image img_CH13 = new Image(Main.class.getResourceAsStream("CH1-3.png"));
	Image img_CH14 = new Image(Main.class.getResourceAsStream("CH1-4.png"));
	Image img_CH15 = new Image(Main.class.getResourceAsStream("CH1-5.png"));
	Image img_CH16 = new Image(Main.class.getResourceAsStream("CH1-6.png"));
	Image img_CH17 = new Image(Main.class.getResourceAsStream("CH1-7.png"));
	Image img_CH18 = new Image(Main.class.getResourceAsStream("CH1-8.png"));
	Image img_CH19 = new Image(Main.class.getResourceAsStream("CH1-9.png"));
	Image img_CH110 = new Image(Main.class.getResourceAsStream("CH1-10.png"));
	Image img_CH21 = new Image(Main.class.getResourceAsStream("CH2-1.png"));
	Image img_CH22 = new Image(Main.class.getResourceAsStream("CH2-2.png"));
	Image img_CH23 = new Image(Main.class.getResourceAsStream("CH2-3.png"));
	Image img_CH24 = new Image(Main.class.getResourceAsStream("CH2-4.png"));
	Image img_CH25 = new Image(Main.class.getResourceAsStream("CH2-5.png"));
	Image img_CH26 = new Image(Main.class.getResourceAsStream("CH2-6.png"));
	Image img_CH27 = new Image(Main.class.getResourceAsStream("CH2-7.png"));
	Image img_CH28 = new Image(Main.class.getResourceAsStream("CH2-8.png"));
	Image img_CH29 = new Image(Main.class.getResourceAsStream("CH2-9.png"));
	Image img_CH210 = new Image(Main.class.getResourceAsStream("CH2-10.png"));
	Image img_CH31 = new Image(Main.class.getResourceAsStream("CH3-1.png"));
	Image img_CH32 = new Image(Main.class.getResourceAsStream("CH3-2.png"));
	Image img_CH33 = new Image(Main.class.getResourceAsStream("CH3-3.png"));
	Image img_CH34 = new Image(Main.class.getResourceAsStream("CH3-4.png"));
	Image img_CH35 = new Image(Main.class.getResourceAsStream("CH3-5.png"));
	Image img_CH36 = new Image(Main.class.getResourceAsStream("CH3-6.png"));
	Image img_CH37 = new Image(Main.class.getResourceAsStream("CH3-7.png"));
	Image img_CH38 = new Image(Main.class.getResourceAsStream("CH3-8.png"));
	Image img_CH39 = new Image(Main.class.getResourceAsStream("CH3-9.png"));
	Image img_CH310 = new Image(Main.class.getResourceAsStream("CH3-10.png"));
	Image img_CH41 = new Image(Main.class.getResourceAsStream("CH4-1.png"));
	Image img_CH42 = new Image(Main.class.getResourceAsStream("CH4-2.png"));
	Image img_CH43 = new Image(Main.class.getResourceAsStream("CH4-3.png"));
	Image img_CH44 = new Image(Main.class.getResourceAsStream("CH4-4.png"));
	Image img_CH45 = new Image(Main.class.getResourceAsStream("CH4-5.png"));
	Image img_CH46 = new Image(Main.class.getResourceAsStream("CH4-6.png"));
	Image img_CH47 = new Image(Main.class.getResourceAsStream("CH4-7.png"));
	Image img_CH48 = new Image(Main.class.getResourceAsStream("CH4-8.png"));
	Image img_CH49 = new Image(Main.class.getResourceAsStream("CH4-9.png"));
	Image img_CH410 = new Image(Main.class.getResourceAsStream("CH4-10.png"));
	Image img_CH101 = new Image(Main.class.getResourceAsStream("CH10-1.png"));
	Image img_CH102 = new Image(Main.class.getResourceAsStream("CH10-2.png"));
	Image img_CH103 = new Image(Main.class.getResourceAsStream("CH10-3.png"));
	Image img_CH104 = new Image(Main.class.getResourceAsStream("CH10-4.png"));
	Image img_CH105 = new Image(Main.class.getResourceAsStream("CH10-5.png"));
	Image img_CH106 = new Image(Main.class.getResourceAsStream("CH10-6.png"));
	Image img_CH107 = new Image(Main.class.getResourceAsStream("CH10-7.png"));
	Image img_CH108 = new Image(Main.class.getResourceAsStream("CH10-8.png"));
	Image img_CH109 = new Image(Main.class.getResourceAsStream("CH10-9.png"));
	Image img_CH1010 = new Image(Main.class.getResourceAsStream("CH10-10.png"));
	ImageView role1 = new ImageView(img_role1);
	ImageView role2 = new ImageView(img_role2);
	ImageView role3 = new ImageView(img_role3);
	ImageView role4 = new ImageView(img_role4);
	ImageView role5 = new ImageView(img_role5);
	ImageView role6 = new ImageView(img_role6);
	ImageView role7 = new ImageView(img_role7);
	ImageView role8 = new ImageView(img_role8);
	ImageView CH11 = new ImageView(img_CH11);
	ImageView CH12 = new ImageView(img_CH12);
	ImageView CH13 = new ImageView(img_CH13);
	ImageView CH14 = new ImageView(img_CH14);
	ImageView CH15 = new ImageView(img_CH15);
	ImageView CH16 = new ImageView(img_CH16);
	ImageView CH17 = new ImageView(img_CH17);
	ImageView CH18 = new ImageView(img_CH18);
	ImageView CH19 = new ImageView(img_CH19);
	ImageView CH110 = new ImageView(img_CH110);
	ImageView CH21 = new ImageView(img_CH21);
	ImageView CH22 = new ImageView(img_CH22);
	ImageView CH23 = new ImageView(img_CH23);
	ImageView CH24 = new ImageView(img_CH24);
	ImageView CH25 = new ImageView(img_CH25);
	ImageView CH26 = new ImageView(img_CH26);
	ImageView CH27 = new ImageView(img_CH27);
	ImageView CH28 = new ImageView(img_CH28);
	ImageView CH29 = new ImageView(img_CH29);
	ImageView CH210 = new ImageView(img_CH210);
	ImageView CH31 = new ImageView(img_CH31);
	ImageView CH32 = new ImageView(img_CH32);
	ImageView CH33 = new ImageView(img_CH33);
	ImageView CH34 = new ImageView(img_CH34);
	ImageView CH35 = new ImageView(img_CH35);
	ImageView CH36 = new ImageView(img_CH36);
	ImageView CH37 = new ImageView(img_CH37);
	ImageView CH38 = new ImageView(img_CH38);
	ImageView CH39 = new ImageView(img_CH39);
	ImageView CH310 = new ImageView(img_CH310);
	ImageView CH41 = new ImageView(img_CH41);
	ImageView CH42 = new ImageView(img_CH42);
	ImageView CH43 = new ImageView(img_CH43);
	ImageView CH44 = new ImageView(img_CH44);
	ImageView CH45 = new ImageView(img_CH45);
	ImageView CH46 = new ImageView(img_CH46);
	ImageView CH47 = new ImageView(img_CH47);
	ImageView CH48 = new ImageView(img_CH48);
	ImageView CH49 = new ImageView(img_CH49);
	ImageView CH410 = new ImageView(img_CH410);
	ImageView CH101 = new ImageView(img_CH101);
	ImageView CH102 = new ImageView(img_CH102);
	ImageView CH103 = new ImageView(img_CH103);
	ImageView CH104 = new ImageView(img_CH104);
	ImageView CH105 = new ImageView(img_CH105);
	ImageView CH106 = new ImageView(img_CH106);
	ImageView CH107 = new ImageView(img_CH107);
	ImageView CH108 = new ImageView(img_CH108);
	ImageView CH109 = new ImageView(img_CH109);
	ImageView CH1010 = new ImageView(img_CH1010);
	int select,cd,i,j=0;
	double playerposX = 20;
	double playerposY = 20;
	private Scene Menu,Gameinterface,Role,Chapter,Waitframe,Questionframe,Gameover,Finish;
	private Button CalculusGame,Exit,SelectRole,Return,Return1,Ch1,Ch2,Ch3,Ch4,Ch5,Ch6,Ch7,Ch8,Ch9,Ch10,Next,EndChat,Return3,Correct,False,Menu1,Menu3;
	private ImageView Left1,Left2,Left3,Left4,Left5,Left6,Left7,Left8;
	private MenuButton Select;
	public void start(Stage primaryStage) {
		stage = primaryStage;
		stage.setTitle("Calculus Ability");
		try {
			BGM = new MediaPlayer(media_BGM);
			BGM2 = new MediaPlayer(media_BGM2);
			BGM3 = new MediaPlayer(media_BGM3);
			BGM4 = new MediaPlayer(media_BGM4);
	        BGM.play();
			Menu = new Scene(FXMLLoader.load(getClass().getResource("Menu.fxml")));
			Gameinterface = new Scene(FXMLLoader.load(getClass().getResource("Gameinterface.fxml")));
			Role = new Scene(FXMLLoader.load(getClass().getResource("Role.fxml")));
			Chapter = new Scene(FXMLLoader.load(getClass().getResource("Chapter.fxml")));
			Waitframe = new Scene(FXMLLoader.load(getClass().getResource("Waitframe.fxml")));
			Questionframe = new Scene(FXMLLoader.load(getClass().getResource("Questionframe.fxml")));
			Gameover = new Scene(FXMLLoader.load(getClass().getResource("Gameover.fxml")));
			Finish = new Scene(FXMLLoader.load(getClass().getResource("Finish.fxml")));
			CalculusGame = (Button) Menu.lookup("#CalculusGame");
			Exit = (Button) Menu.lookup("#Exit");
			SelectRole = (Button) Gameinterface.lookup("#SelectRole");
			Return = (Button) Gameinterface.lookup("#Return");
			Return1 = (Button) Role.lookup("#Return1");
			Ch1 = (Button) Chapter.lookup("#Ch1");
			Ch2 = (Button) Chapter.lookup("#Ch2");
			Ch3 = (Button) Chapter.lookup("#Ch3");
			Ch4 = (Button) Chapter.lookup("#Ch4");
			Ch5 = (Button) Chapter.lookup("#Ch5");
			Ch6 = (Button) Chapter.lookup("#Ch6");
			Ch7 = (Button) Chapter.lookup("#Ch7");
			Ch8 = (Button) Chapter.lookup("#Ch8");
			Ch9 = (Button) Chapter.lookup("#Ch9");
			Ch10 = (Button) Chapter.lookup("#Ch10");
			Next = (Button) Waitframe.lookup("#Next");
			EndChat = (Button) Waitframe.lookup("#EndChat");
			Return3 = (Button) Chapter.lookup("#Return3");
			Correct = (Button) Questionframe.lookup("#True");
			False = (Button) Questionframe.lookup("#False");
			Menu1 = (Button) Gameover.lookup("#Menu1");
			Menu3 = (Button) Finish.lookup("#Menu3");
			Select = (MenuButton) Role.lookup("#Select");
			Left1 = (ImageView) Questionframe.lookup("#Left1");
			Left2 = (ImageView) Questionframe.lookup("#Left2");
			Left3 = (ImageView) Questionframe.lookup("#Left3");
			Left4 = (ImageView) Questionframe.lookup("#Left4");
			Left5 = (ImageView) Questionframe.lookup("#Left5");
			Left6 = (ImageView) Questionframe.lookup("#Left6");
			Left7 = (ImageView) Questionframe.lookup("#Left7");
			Left8 = (ImageView) Questionframe.lookup("#Left8");
			CH11 = (ImageView) Questionframe.lookup("#CH11");
			CH12 = (ImageView) Questionframe.lookup("#CH12");
			CH13 = (ImageView) Questionframe.lookup("#CH13");
			CH14 = (ImageView) Questionframe.lookup("#CH14");
			CH15 = (ImageView) Questionframe.lookup("#CH15");
			CH16 = (ImageView) Questionframe.lookup("#CH16");
			CH17 = (ImageView) Questionframe.lookup("#CH17");
			CH18 = (ImageView) Questionframe.lookup("#CH18");
			CH19 = (ImageView) Questionframe.lookup("#CH19");
			CH110 = (ImageView) Questionframe.lookup("#CH110");
			CH21 = (ImageView) Questionframe.lookup("#CH21");
			CH22 = (ImageView) Questionframe.lookup("#CH22");
			CH23 = (ImageView) Questionframe.lookup("#CH23");
			CH24 = (ImageView) Questionframe.lookup("#CH24");
			CH25 = (ImageView) Questionframe.lookup("#CH25");
			CH26 = (ImageView) Questionframe.lookup("#CH26");
			CH27 = (ImageView) Questionframe.lookup("#CH27");
			CH28 = (ImageView) Questionframe.lookup("#CH28");
			CH29 = (ImageView) Questionframe.lookup("#CH29");
			CH210 = (ImageView) Questionframe.lookup("#CH210");
			CH31 = (ImageView) Questionframe.lookup("#CH31");
			CH32 = (ImageView) Questionframe.lookup("#CH32");
			CH33 = (ImageView) Questionframe.lookup("#CH33");
			CH34 = (ImageView) Questionframe.lookup("#CH34");
			CH35 = (ImageView) Questionframe.lookup("#CH35");
			CH36 = (ImageView) Questionframe.lookup("#CH36");
			CH37 = (ImageView) Questionframe.lookup("#CH37");
			CH38 = (ImageView) Questionframe.lookup("#CH38");
			CH39 = (ImageView) Questionframe.lookup("#CH39");
			CH310 = (ImageView) Questionframe.lookup("#CH310");
			CH41 = (ImageView) Questionframe.lookup("#CH41");
			CH42 = (ImageView) Questionframe.lookup("#CH42");
			CH43 = (ImageView) Questionframe.lookup("#CH43");
			CH44 = (ImageView) Questionframe.lookup("#CH44");
			CH45 = (ImageView) Questionframe.lookup("#CH45");
			CH46 = (ImageView) Questionframe.lookup("#CH46");
			CH47 = (ImageView) Questionframe.lookup("#CH47");
			CH48 = (ImageView) Questionframe.lookup("#CH48");
			CH49 = (ImageView) Questionframe.lookup("#CH49");
			CH410 = (ImageView) Questionframe.lookup("#CH410");
			CH101 = (ImageView) Questionframe.lookup("#CH101");
			CH102 = (ImageView) Questionframe.lookup("#CH102");
			CH103 = (ImageView) Questionframe.lookup("#CH103");
			CH104 = (ImageView) Questionframe.lookup("#CH104");
			CH105 = (ImageView) Questionframe.lookup("#CH105");
			CH106 = (ImageView) Questionframe.lookup("#CH106");
			CH107 = (ImageView) Questionframe.lookup("#CH107");
			CH108 = (ImageView) Questionframe.lookup("#CH108");
			CH109 = (ImageView) Questionframe.lookup("#CH109");
			CH1010 = (ImageView) Questionframe.lookup("#CH1010");
			MenuItem Select1 = new MenuItem("1");
			MenuItem Select2 = new MenuItem("2");
			MenuItem Select3 = new MenuItem("3");
			MenuItem Select4 = new MenuItem("4");
			MenuItem Select5 = new MenuItem("5");
			MenuItem Select6 = new MenuItem("6");
			MenuItem Select7 = new MenuItem("7");
			MenuItem Select8 = new MenuItem("8");
			timershow = (Label) Waitframe.lookup("#timer");
			timershow.setText("10");
			Select.getItems().addAll(Select1, Select2,Select3,Select4,Select5,Select6,Select7,Select8);
			stage.setScene(Menu);
			CalculusGame.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					stage.setScene(Gameinterface);
				};
			});
			Exit.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					Platform.exit();
				};
			});
			SelectRole.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					stage.setScene(Role);
				};
			});
			Return1.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					stage.setScene(Gameinterface);
				};
			});
			Return3.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					stage.setScene(Role);
				};
			});
			Return.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					stage.setScene(Menu);
				};
			});
			
			Ch1.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					i=1;
					stage.setScene(Waitframe);
					initialize();
					gameplay();
				};
			});
			Ch2.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					i=2;
					stage.setScene(Waitframe);
					initialize();
					gameplay();
				};
			});
			Ch3.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					i=3;
					stage.setScene(Waitframe);
					initialize();
					gameplay();
				};
			});
			Ch4.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					i=4;
					stage.setScene(Waitframe);
					initialize();
					gameplay();
				};
			});
			Ch5.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					stage.setScene(Waitframe);
					initialize();
					gameplay();
				};
			});
			Ch6.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					stage.setScene(Waitframe);
					initialize();
					gameplay();
				};
			});
			Ch7.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					stage.setScene(Waitframe);
					initialize();
					gameplay();
				};
			});
			Ch8.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					stage.setScene(Waitframe);
					initialize();
					gameplay();
				};
			});
			Ch9.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					stage.setScene(Waitframe);
					initialize();
					gameplay();
				};
			});
			Ch10.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					i=10;
					stage.setScene(Waitframe);
					initialize();
					gameplay();
				};
			});
			EndChat.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					stage.setScene(Menu);
				};
			});
			Menu1.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					stage.setScene(Menu);
					BGM.play(); 
				};
			});
			Menu3.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					stage.setScene(Menu);
					BGM4.pause();
					BGM.play(); 
				};
			});
		    Next.setOnMouseClicked(new EventHandler<Event>() {
				public void handle(Event event) {
					j=1;
					CH11.setVisible(false);
					CH12.setVisible(false);
					CH13.setVisible(false);
					CH14.setVisible(false);
					CH15.setVisible(false);
					CH16.setVisible(false);
					CH17.setVisible(false);
					CH18.setVisible(false);
					CH19.setVisible(false);
					CH110.setVisible(false);
					CH21.setVisible(false);
					CH22.setVisible(false);
					CH23.setVisible(false);
					CH24.setVisible(false);
					CH25.setVisible(false);
					CH26.setVisible(false);
					CH27.setVisible(false);
					CH28.setVisible(false);
					CH29.setVisible(false);
					CH210.setVisible(false);
					CH31.setVisible(false);
					CH32.setVisible(false);
					CH33.setVisible(false);
					CH34.setVisible(false);
					CH35.setVisible(false);
					CH36.setVisible(false);
					CH37.setVisible(false);
					CH38.setVisible(false);
					CH39.setVisible(false);
					CH310.setVisible(false);
					CH41.setVisible(false);
					CH42.setVisible(false);
					CH43.setVisible(false);
					CH44.setVisible(false);
					CH45.setVisible(false);
					CH46.setVisible(false);
					CH47.setVisible(false);
					CH48.setVisible(false);
					CH49.setVisible(false);
					CH410.setVisible(false);
					CH101.setVisible(false);
					CH102.setVisible(false);
					CH103.setVisible(false);
					CH104.setVisible(false);
					CH105.setVisible(false);
					CH106.setVisible(false);
					CH107.setVisible(false);
					CH108.setVisible(false);
					CH109.setVisible(false);
					CH1010.setVisible(false);
					if(j==1) {
						switch(i)
					{
						case 1:
							CH11.setVisible(true);
							Correct.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									CH11.setVisible(false);
									CH12.setVisible(true);
									False.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											stage.setScene(Gameover);
											BGM2.stop();
											BGM3.play(); 
										};
									});
									Correct.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											CH12.setVisible(false);
											CH13.setVisible(true);
											False.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													stage.setScene(Gameover);
													BGM2.stop();
													BGM3.play(); 
												};
											});
											Correct.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													CH13.setVisible(false);
													CH14.setVisible(true);
													Correct.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															stage.setScene(Gameover);
															BGM2.stop();
															BGM3.play(); 
														};
													});
													False.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															CH14.setVisible(false);
															CH15.setVisible(true);
															Correct.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	stage.setScene(Gameover);
																	BGM2.stop();
																	BGM3.play(); 
																};
															});
															False.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	CH15.setVisible(false);
																	CH16.setVisible(true);
																	Correct.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			stage.setScene(Gameover);
																			BGM2.stop();
																			BGM3.play(); 
																		};
																	});
																	False.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			CH16.setVisible(false);
																			CH17.setVisible(true);
																			Correct.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					stage.setScene(Gameover);
																					BGM2.stop();
																					BGM3.play(); 
																				};
																			});
																			False.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					CH17.setVisible(false);
																					CH18.setVisible(true);
																					Correct.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							stage.setScene(Gameover);
																							BGM2.stop();
																							BGM3.play(); 
																						};
																					});
																					False.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							CH18.setVisible(false);
																							CH19.setVisible(true);
																							Correct.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									stage.setScene(Gameover);
																									BGM2.stop();
																									BGM3.play(); 
																								};
																							});
																							False.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									CH19.setVisible(false);
																									CH110.setVisible(true);
																									False.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											stage.setScene(Gameover);
																											BGM2.stop();
																											BGM3.play(); 
																										};
																									});
																									Correct.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											CH110.setVisible(false);
																											stage.setScene(Finish);
																											BGM2.stop();
																											BGM4.play();
																										};
																									});
																								};
																							});
																						};
																					});
																				};
																			});
																		};
																	});
																};
															});
														};
													});
												};
											});
										};
									});
								};
							});
							False.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									stage.setScene(Gameover);
									BGM2.stop();
									BGM3.play(); 
								};
							});
							break;
						case 2:
							CH21.setVisible(true);
							False.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									CH21.setVisible(false);
									CH22.setVisible(true);
									False.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											stage.setScene(Gameover);
											BGM2.stop();
											BGM3.play(); 
										};
									});
									Correct.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											CH22.setVisible(false);
											CH23.setVisible(true);
											False.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													stage.setScene(Gameover);
													BGM2.stop();
													BGM3.play(); 
												};
											});
											Correct.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													CH23.setVisible(false);
													CH24.setVisible(true);
													Correct.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															stage.setScene(Gameover);
															BGM2.stop();
															BGM3.play(); 
														};
													});
													False.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															CH24.setVisible(false);
															CH25.setVisible(true);
															Correct.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	stage.setScene(Gameover);
																	BGM2.stop();
																	BGM3.play(); 
																};
															});
															False.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	CH25.setVisible(false);
																	CH26.setVisible(true);
																	Correct.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			stage.setScene(Gameover);
																			BGM2.stop();
																			BGM3.play(); 
																		};
																	});
																	False.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			CH26.setVisible(false);
																			CH27.setVisible(true);
																			Correct.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					stage.setScene(Gameover);
																					BGM2.stop();
																					BGM3.play(); 
																				};
																			});
																			False.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					CH27.setVisible(false);
																					CH28.setVisible(true);
																					Correct.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							stage.setScene(Gameover);
																							BGM2.stop();
																							BGM3.play(); 
																						};
																					});
																					False.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							CH28.setVisible(false);
																							CH29.setVisible(true);
																							False.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									stage.setScene(Gameover);
																									BGM2.stop();
																									BGM3.play(); 
																								};
																							});
																							Correct.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									CH29.setVisible(false);
																									CH210.setVisible(true);
																									Correct.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											stage.setScene(Gameover);
																											BGM2.stop();
																											BGM3.play(); 
																										};
																									});
																									False.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											CH110.setVisible(false);
																											stage.setScene(Finish);
																											BGM2.stop();
																											BGM4.play();
																										};
																									});
																								};
																							});
																						};
																					});
																				};
																			});
																		};
																	});
																};
															});
														};
													});
												};
											});
										};
									});
								};
							});
							Correct.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									stage.setScene(Gameover);
									BGM2.stop();
									BGM3.play(); 
								};
							});
							break;
						case 3:
							CH31.setVisible(true);
							False.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									CH31.setVisible(false);
									CH32.setVisible(true);
									False.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											stage.setScene(Gameover);
											BGM2.stop();
											BGM3.play(); 
										};
									});
									Correct.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											CH32.setVisible(false);
											CH33.setVisible(true);
											Correct.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													stage.setScene(Gameover);
													BGM2.stop();
													BGM3.play(); 
												};
											});
											False.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													CH33.setVisible(false);
													CH34.setVisible(true);
													Correct.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															stage.setScene(Gameover);
															BGM2.stop();
															BGM3.play(); 
														};
													});
													False.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															CH34.setVisible(false);
															CH35.setVisible(true);
															False.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	stage.setScene(Gameover);
																	BGM2.stop();
																	BGM3.play(); 
																};
															});
															Correct.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	CH35.setVisible(false);
																	CH36.setVisible(true);
																	False.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			stage.setScene(Gameover);
																			BGM2.stop();
																			BGM3.play(); 
																		};
																	});
																	Correct.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			CH36.setVisible(false);
																			CH37.setVisible(true);
																			False.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					stage.setScene(Gameover);
																					BGM2.stop();
																					BGM3.play(); 
																				};
																			});
																			Correct.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					CH37.setVisible(false);
																					CH38.setVisible(true);
																					False.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							stage.setScene(Gameover);
																							BGM2.stop();
																							BGM3.play(); 
																						};
																					});
																					Correct.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							CH38.setVisible(false);
																							CH39.setVisible(true);
																							Correct.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									stage.setScene(Gameover);
																									BGM2.stop();
																									BGM3.play(); 
																								};
																							});
																							False.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									CH39.setVisible(false);
																									CH310.setVisible(true);
																									False.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											stage.setScene(Gameover);
																											BGM2.stop();
																											BGM3.play(); 
																										};
																									});
																									Correct.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											CH310.setVisible(false);
																											stage.setScene(Finish);
																											BGM2.stop();
																											BGM4.play();
																										};
																									});
																								};
																							});
																						};
																					});
																				};
																			});
																		};
																	});
																};
															});
														};
													});
												};
											});
										};
									});
								};
							});
							Correct.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									stage.setScene(Gameover);
									BGM2.stop();
									BGM3.play(); 
								};
							});
							break;
						case 4:
							CH41.setVisible(true);
							Correct.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									CH41.setVisible(false);
									CH42.setVisible(true);
									Correct.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											stage.setScene(Gameover);
											BGM2.stop();
											BGM3.play(); 
										};
									});
									False.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											CH42.setVisible(false);
											CH43.setVisible(true);
											Correct.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													stage.setScene(Gameover);
													BGM2.stop();
													BGM3.play(); 
												};
											});
											False.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													CH43.setVisible(false);
													CH44.setVisible(true);
													False.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															stage.setScene(Gameover);
															BGM2.stop();
															BGM3.play(); 
														};
													});
													Correct.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															CH44.setVisible(false);
															CH45.setVisible(true);
															Correct.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	stage.setScene(Gameover);
																	BGM2.stop();
																	BGM3.play(); 
																};
															});
															False.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	CH45.setVisible(false);
																	CH46.setVisible(true);
																	False.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			stage.setScene(Gameover);
																			BGM2.stop();
																			BGM3.play(); 
																		};
																	});
																	Correct.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			CH46.setVisible(false);
																			CH47.setVisible(true);
																			Correct.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					stage.setScene(Gameover);
																					BGM2.stop();
																					BGM3.play(); 
																				};
																			});
																			False.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					CH47.setVisible(false);
																					CH48.setVisible(true);
																					False.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							stage.setScene(Gameover);
																							BGM2.stop();
																							BGM3.play(); 
																						};
																					});
																					Correct.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							CH48.setVisible(false);
																							CH49.setVisible(true);
																							False.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									stage.setScene(Gameover);
																									BGM2.stop();
																									BGM3.play(); 
																								};
																							});
																							Correct.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									CH49.setVisible(false);
																									CH410.setVisible(true);
																									False.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											stage.setScene(Gameover);
																											BGM2.stop();
																											BGM3.play(); 
																										};
																									});
																									Correct.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											CH410.setVisible(false);
																											stage.setScene(Finish);
																											BGM2.stop();
																											BGM4.play();
																										};
																									});
																								};
																							});
																						};
																					});
																				};
																			});
																		};
																	});
																};
															});
														};
													});
												};
											});
										};
									});
								};
							});
							False.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									stage.setScene(Gameover);
									BGM2.stop();
									BGM3.play(); 
								};
							});
							break;
						case 5:
							CH11.setVisible(true);
							Correct.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									CH11.setVisible(false);
									CH12.setVisible(true);
									False.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											stage.setScene(Gameover);
											BGM2.stop();
											BGM3.play(); 
										};
									});
									Correct.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											CH12.setVisible(false);
											CH13.setVisible(true);
											False.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													stage.setScene(Gameover);
													BGM2.stop();
													BGM3.play(); 
												};
											});
											Correct.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													CH13.setVisible(false);
													CH14.setVisible(true);
													Correct.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															stage.setScene(Gameover);
															BGM2.stop();
															BGM3.play(); 
														};
													});
													False.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															CH14.setVisible(false);
															CH15.setVisible(true);
															Correct.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	stage.setScene(Gameover);
																	BGM2.stop();
																	BGM3.play(); 
																};
															});
															False.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	CH15.setVisible(false);
																	CH16.setVisible(true);
																	Correct.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			stage.setScene(Gameover);
																			BGM2.stop();
																			BGM3.play(); 
																		};
																	});
																	False.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			CH16.setVisible(false);
																			CH17.setVisible(true);
																			Correct.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					stage.setScene(Gameover);
																					BGM2.stop();
																					BGM3.play(); 
																				};
																			});
																			False.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					CH17.setVisible(false);
																					CH18.setVisible(true);
																					Correct.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							stage.setScene(Gameover);
																							BGM2.stop();
																							BGM3.play(); 
																						};
																					});
																					False.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							CH18.setVisible(false);
																							CH19.setVisible(true);
																							Correct.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									stage.setScene(Gameover);
																									BGM2.stop();
																									BGM3.play(); 
																								};
																							});
																							False.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									CH19.setVisible(false);
																									CH110.setVisible(true);
																									False.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											stage.setScene(Gameover);
																											BGM2.stop();
																											BGM3.play(); 
																										};
																									});
																									Correct.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											CH110.setVisible(false);
																											stage.setScene(Finish);
																											BGM2.stop();
																											BGM4.play();
																										};
																									});
																								};
																							});
																						};
																					});
																				};
																			});
																		};
																	});
																};
															});
														};
													});
												};
											});
										};
									});
								};
							});
							False.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									stage.setScene(Gameover);
									BGM2.stop();
									BGM3.play(); 
								};
							});
							break;
						case 6:
							CH21.setVisible(true);
							False.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									CH21.setVisible(false);
									CH22.setVisible(true);
									False.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											stage.setScene(Gameover);
											BGM2.stop();
											BGM3.play(); 
										};
									});
									Correct.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											CH22.setVisible(false);
											CH23.setVisible(true);
											False.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													stage.setScene(Gameover);
													BGM2.stop();
													BGM3.play(); 
												};
											});
											Correct.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													CH23.setVisible(false);
													CH24.setVisible(true);
													Correct.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															stage.setScene(Gameover);
															BGM2.stop();
															BGM3.play(); 
														};
													});
													False.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															CH24.setVisible(false);
															CH25.setVisible(true);
															Correct.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	stage.setScene(Gameover);
																	BGM2.stop();
																	BGM3.play(); 
																};
															});
															False.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	CH25.setVisible(false);
																	CH26.setVisible(true);
																	Correct.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			stage.setScene(Gameover);
																			BGM2.stop();
																			BGM3.play(); 
																		};
																	});
																	False.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			CH26.setVisible(false);
																			CH27.setVisible(true);
																			Correct.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					stage.setScene(Gameover);
																					BGM2.stop();
																					BGM3.play(); 
																				};
																			});
																			False.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					CH27.setVisible(false);
																					CH28.setVisible(true);
																					Correct.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							stage.setScene(Gameover);
																							BGM2.stop();
																							BGM3.play(); 
																						};
																					});
																					False.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							CH28.setVisible(false);
																							CH29.setVisible(true);
																							False.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									stage.setScene(Gameover);
																									BGM2.stop();
																									BGM3.play(); 
																								};
																							});
																							Correct.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									CH29.setVisible(false);
																									CH210.setVisible(true);
																									Correct.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											stage.setScene(Gameover);
																											BGM2.stop();
																											BGM3.play(); 
																										};
																									});
																									False.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											CH110.setVisible(false);
																											stage.setScene(Finish);
																											BGM2.stop();
																											BGM4.play();
																										};
																									});
																								};
																							});
																						};
																					});
																				};
																			});
																		};
																	});
																};
															});
														};
													});
												};
											});
										};
									});
								};
							});
							Correct.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									stage.setScene(Gameover);
									BGM2.stop();
									BGM3.play(); 
								};
							});
							break;
						case 7:
							CH31.setVisible(true);
							False.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									CH31.setVisible(false);
									CH32.setVisible(true);
									False.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											stage.setScene(Gameover);
											BGM2.stop();
											BGM3.play(); 
										};
									});
									Correct.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											CH32.setVisible(false);
											CH33.setVisible(true);
											Correct.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													stage.setScene(Gameover);
													BGM2.stop();
													BGM3.play(); 
												};
											});
											False.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													CH33.setVisible(false);
													CH34.setVisible(true);
													Correct.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															stage.setScene(Gameover);
															BGM2.stop();
															BGM3.play(); 
														};
													});
													False.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															CH34.setVisible(false);
															CH35.setVisible(true);
															False.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	stage.setScene(Gameover);
																	BGM2.stop();
																	BGM3.play(); 
																};
															});
															Correct.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	CH35.setVisible(false);
																	CH36.setVisible(true);
																	False.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			stage.setScene(Gameover);
																			BGM2.stop();
																			BGM3.play(); 
																		};
																	});
																	Correct.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			CH36.setVisible(false);
																			CH37.setVisible(true);
																			False.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					stage.setScene(Gameover);
																					BGM2.stop();
																					BGM3.play(); 
																				};
																			});
																			Correct.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					CH37.setVisible(false);
																					CH38.setVisible(true);
																					False.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							stage.setScene(Gameover);
																							BGM2.stop();
																							BGM3.play(); 
																						};
																					});
																					Correct.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							CH38.setVisible(false);
																							CH39.setVisible(true);
																							Correct.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									stage.setScene(Gameover);
																									BGM2.stop();
																									BGM3.play(); 
																								};
																							});
																							False.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									CH39.setVisible(false);
																									CH310.setVisible(true);
																									False.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											stage.setScene(Gameover);
																											BGM2.stop();
																											BGM3.play(); 
																										};
																									});
																									Correct.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											CH310.setVisible(false);
																											stage.setScene(Finish);
																											BGM2.stop();
																											BGM4.play();
																										};
																									});
																								};
																							});
																						};
																					});
																				};
																			});
																		};
																	});
																};
															});
														};
													});
												};
											});
										};
									});
								};
							});
							Correct.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									stage.setScene(Gameover);
									BGM2.stop();
									BGM3.play(); 
								};
							});
							break;
						case 8:
							CH41.setVisible(true);
							Correct.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									CH41.setVisible(false);
									CH42.setVisible(true);
									Correct.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											stage.setScene(Gameover);
											BGM2.stop();
											BGM3.play(); 
										};
									});
									False.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											CH42.setVisible(false);
											CH43.setVisible(true);
											Correct.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													stage.setScene(Gameover);
													BGM2.stop();
													BGM3.play(); 
												};
											});
											False.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													CH43.setVisible(false);
													CH44.setVisible(true);
													False.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															stage.setScene(Gameover);
															BGM2.stop();
															BGM3.play(); 
														};
													});
													Correct.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															CH44.setVisible(false);
															CH45.setVisible(true);
															Correct.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	stage.setScene(Gameover);
																	BGM2.stop();
																	BGM3.play(); 
																};
															});
															False.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	CH45.setVisible(false);
																	CH46.setVisible(true);
																	False.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			stage.setScene(Gameover);
																			BGM2.stop();
																			BGM3.play(); 
																		};
																	});
																	Correct.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			CH46.setVisible(false);
																			CH47.setVisible(true);
																			Correct.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					stage.setScene(Gameover);
																					BGM2.stop();
																					BGM3.play(); 
																				};
																			});
																			False.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					CH47.setVisible(false);
																					CH48.setVisible(true);
																					False.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							stage.setScene(Gameover);
																							BGM2.stop();
																							BGM3.play(); 
																						};
																					});
																					Correct.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							CH48.setVisible(false);
																							CH49.setVisible(true);
																							False.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									stage.setScene(Gameover);
																									BGM2.stop();
																									BGM3.play(); 
																								};
																							});
																							Correct.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									CH49.setVisible(false);
																									CH410.setVisible(true);
																									False.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											stage.setScene(Gameover);
																											BGM2.stop();
																											BGM3.play(); 
																										};
																									});
																									Correct.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											CH410.setVisible(false);
																											stage.setScene(Finish);
																											BGM2.stop();
																											BGM4.play();
																										};
																									});
																								};
																							});
																						};
																					});
																				};
																			});
																		};
																	});
																};
															});
														};
													});
												};
											});
										};
									});
								};
							});
							False.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									stage.setScene(Gameover);
									BGM2.stop();
									BGM3.play(); 
								};
							});
							break;
						case 9:
							CH101.setVisible(true);
							False.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									CH101.setVisible(false);
									CH102.setVisible(true);
									Correct.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											stage.setScene(Gameover);
											BGM2.stop();
											BGM3.play(); 
										};
									});
									False.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											CH102.setVisible(false);
											CH103.setVisible(true);
											False.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													stage.setScene(Gameover);
													BGM2.stop();
													BGM3.play(); 
												};
											});
											Correct.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													CH103.setVisible(false);
													CH104.setVisible(true);
													Correct.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															stage.setScene(Gameover);
															BGM2.stop();
															BGM3.play(); 
														};
													});
													False.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															CH104.setVisible(false);
															CH105.setVisible(true);
															Correct.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	stage.setScene(Gameover);
																	BGM2.stop();
																	BGM3.play(); 
																};
															});
															False.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	CH105.setVisible(false);
																	CH106.setVisible(true);
																	False.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			stage.setScene(Gameover);
																			BGM2.stop();
																			BGM3.play(); 
																		};
																	});
																	Correct.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			CH106.setVisible(false);
																			CH107.setVisible(true);
																			False.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					stage.setScene(Gameover);
																					BGM2.stop();
																					BGM3.play(); 
																				};
																			});
																			Correct.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					CH107.setVisible(false);
																					CH108.setVisible(true);
																					Correct.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							stage.setScene(Gameover);
																							BGM2.stop();
																							BGM3.play(); 
																						};
																					});
																					False.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							CH108.setVisible(false);
																							CH109.setVisible(true);
																							Correct.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									stage.setScene(Gameover);
																									BGM2.stop();
																									BGM3.play(); 
																								};
																							});
																							False.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									CH109.setVisible(false);
																									CH1010.setVisible(true);
																									False.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											stage.setScene(Gameover);
																											BGM2.stop();
																											BGM3.play(); 
																										};
																									});
																									Correct.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											CH1010.setVisible(false);
																											stage.setScene(Finish);
																											BGM2.stop();
																										};
																									});
																								};
																							});
																						};
																					});
																				};
																			});
																		};
																	});
																};
															});
														};
													});
												};
											});
										};
									});
								};
							});
							Correct.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									stage.setScene(Gameover);
									BGM2.stop();
									BGM3.play(); 
								};
							});
							break;
						case 10:
							CH101.setVisible(true);
							False.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									CH101.setVisible(false);
									CH102.setVisible(true);
									Correct.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											stage.setScene(Gameover);
											BGM2.stop();
											BGM3.play(); 
										};
									});
									False.setOnMouseClicked(new EventHandler<Event>() {
										public void handle(Event event) {
											CH102.setVisible(false);
											CH103.setVisible(true);
											False.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													stage.setScene(Gameover);
													BGM2.stop();
													BGM3.play(); 
												};
											});
											Correct.setOnMouseClicked(new EventHandler<Event>() {
												public void handle(Event event) {
													CH103.setVisible(false);
													CH104.setVisible(true);
													Correct.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															stage.setScene(Gameover);
															BGM2.stop();
															BGM3.play(); 
														};
													});
													False.setOnMouseClicked(new EventHandler<Event>() {
														public void handle(Event event) {
															CH104.setVisible(false);
															CH105.setVisible(true);
															Correct.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	stage.setScene(Gameover);
																	BGM2.stop();
																	BGM3.play(); 
																};
															});
															False.setOnMouseClicked(new EventHandler<Event>() {
																public void handle(Event event) {
																	CH105.setVisible(false);
																	CH106.setVisible(true);
																	False.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			stage.setScene(Gameover);
																			BGM2.stop();
																			BGM3.play(); 
																		};
																	});
																	Correct.setOnMouseClicked(new EventHandler<Event>() {
																		public void handle(Event event) {
																			CH106.setVisible(false);
																			CH107.setVisible(true);
																			False.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					stage.setScene(Gameover);
																					BGM2.stop();
																					BGM3.play(); 
																				};
																			});
																			Correct.setOnMouseClicked(new EventHandler<Event>() {
																				public void handle(Event event) {
																					CH107.setVisible(false);
																					CH108.setVisible(true);
																					Correct.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							stage.setScene(Gameover);
																							BGM2.stop();
																							BGM3.play(); 
																						};
																					});
																					False.setOnMouseClicked(new EventHandler<Event>() {
																						public void handle(Event event) {
																							CH108.setVisible(false);
																							CH109.setVisible(true);
																							Correct.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									stage.setScene(Gameover);
																									BGM2.stop();
																									BGM3.play(); 
																								};
																							});
																							False.setOnMouseClicked(new EventHandler<Event>() {
																								public void handle(Event event) {
																									CH109.setVisible(false);
																									CH1010.setVisible(true);
																									False.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											stage.setScene(Gameover);
																											BGM2.stop();
																											BGM3.play(); 
																										};
																									});
																									Correct.setOnMouseClicked(new EventHandler<Event>() {
																										public void handle(Event event) {
																											CH1010.setVisible(false);
																											stage.setScene(Finish);
																											BGM2.stop();
																										};
																									});
																								};
																							});
																						};
																					});
																				};
																			});
																		};
																	});
																};
															});
														};
													});
												};
											});
										};
									});
								};
							});
							Correct.setOnMouseClicked(new EventHandler<Event>() {
								public void handle(Event event) {
									stage.setScene(Gameover);
									BGM2.stop();
									BGM3.play(); 
								};
							});
							break;
					}
					}
					gameLoop.pause();
					BGM.stop();
					BGM2.play(); 
					Left1.setVisible(false);
					Left2.setVisible(false);
					Left3.setVisible(false);
					Left4.setVisible(false);
					Left5.setVisible(false);
					Left6.setVisible(false);
					Left7.setVisible(false);
					Left8.setVisible(false);
					switch(select) {
				      case 1:
				    	  Left1.setVisible(true);
				          break;
				      case 2:
				    	  Left2.setVisible(true);
				          break;
				      case 3:
				    	  Left3.setVisible(true); 
				          break;
				      case 4:
				    	  Left4.setVisible(true);
				          break;
				      case 5:
				    	  Left5.setVisible(true);
				          break;
				      case 6:
				    	  Left6.setVisible(true); 
				          break;
				      case 7:
				    	  Left7.setVisible(true);
				          break;
				      case 8:
				    	  Left8.setVisible(true);
				          break;
				   }
					stage.setScene(Questionframe);	  
				};
			});
		
			Select1.setOnAction(new EventHandler<ActionEvent>() {
			    @Override
	           public void handle(ActionEvent event) {
			    	stage.setScene(Chapter);
			    	select=1;
			    }
			});
			Select2.setOnAction(new EventHandler<ActionEvent>() {
			    @Override
			    public void handle(ActionEvent event) {
			        stage.setScene(Chapter);
			        select=2;
			    }
			});
			Select3.setOnAction(new EventHandler<ActionEvent>() {
			    @Override
			    public void handle(ActionEvent event) {
			        stage.setScene(Chapter);
			        select=3;
			    }
			});
			Select4.setOnAction(new EventHandler<ActionEvent>() {
			    @Override
			    public void handle(ActionEvent event) {
			        stage.setScene(Chapter);
			        select=4;
			    }
			});
			Select5.setOnAction(new EventHandler<ActionEvent>() {
			    @Override
			    public void handle(ActionEvent event) {
			        stage.setScene(Chapter);
			        select=5;
			    }
			});
			Select6.setOnAction(new EventHandler<ActionEvent>() {
			    @Override
			    public void handle(ActionEvent event) {
			        stage.setScene(Chapter);
			        select=6;
			    }
			});
			Select7.setOnAction(new EventHandler<ActionEvent>() {
			    @Override
			    public void handle(ActionEvent event) {
			        stage.setScene(Chapter);
			        select=7;
			    }
			});
			Select8.setOnAction(new EventHandler<ActionEvent>() {
			    @Override
			    public void handle(ActionEvent event) {
			        stage.setScene(Chapter);
			        select=8;
			    }
			});
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.show();
			gp = (GridPane) Role.lookup("#gp");
			ivList.add(role1);
			ivList.add(role2);
			ivList.add(role3);
			ivList.add(role4);
			ivList.add(role5);
			ivList.add(role6);
			ivList.add(role7);
			ivList.add(role8);			     
					for(int i=0 ; i<4 ;i++) {
				    for(int j=0 ; j<2 ; j++) {
				    ivList.get((i+1)+4*j-1).setFitWidth(400);
				    ivList.get((i+1)+4*j-1).setFitHeight(440);
				    GridPane.setHalignment(ivList.get((i+1)+4*j-1), HPos.CENTER);
				    gp.add(ivList.get((i+1)+4*j-1),i,j);      
				         						}
				      }
							} 
					catch(Exception e) {
							e.printStackTrace();
										}
							}
public void gameplay() {
	gameLoop = new Timeline(new KeyFrame(Duration.millis(1000 / FPS), new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent event) {
			timer--;
			timershow.setText(Integer.toString(timer));
				if(timer == 0) {
					stage.setScene(Menu);
			}
		}
	}));
	gameLoop.setCycleCount(Timeline.INDEFINITE);
	gameLoop.play();
}
public void initialize() {
	timer = 10;
	timecount=0;
}	
public  static void main(String[] args) {
	launch(args);
 }
}