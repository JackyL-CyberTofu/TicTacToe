package ca.tictactoe.ui;

import ca.tictactoe.game.GameBoard;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.awt.*;

/**
 *  Responsible for the UI of the game TicTacToe
 */

public class TicTacToe extends Application {

    int counter = 0;
    boolean gameEnd = false;

    Label resultLabel;

    GameBoard gameGrid = new GameBoard();

    Image oneImage = new Image("file:img/empty.jpg");
    Image twoImage = new Image("file:img/empty.jpg");
    Image threeImage = new Image("file:img/empty.jpg");
    Image fourImage = new Image("file:img/empty.jpg");
    Image fiveImage = new Image("file:img/empty.jpg");
    Image sixImage = new Image("file:img/empty.jpg");
    Image sevenImage = new Image("file:img/empty.jpg");
    Image eightImage = new Image("file:img/empty.jpg");
    Image nineImage = new Image("file:img/empty.jpg");
    Image tenImage = new Image("file:img/empty.jpg");
    Image elevenImage = new Image("file:img/empty.jpg");
    Image twelveImage = new Image("file:img/empty.jpg");
    Image thirteenImage = new Image("file:img/empty.jpg");
    Image fourteenImage = new Image("file:img/empty.jpg");
    Image fifteenImage = new Image("file:img/empty.jpg");
    Image sixteenImage = new Image("file:img/empty.jpg");


    //Create the ImageView objects.
    ImageView a = new ImageView(oneImage);
    ImageView b = new ImageView(twoImage);
    ImageView c = new ImageView(threeImage);
    ImageView d = new ImageView(fourImage);
    ImageView e = new ImageView(fiveImage);
    ImageView f = new ImageView(sixImage);
    ImageView g = new ImageView(sevenImage);
    ImageView h = new ImageView(eightImage);
    ImageView i = new ImageView(nineImage);
    ImageView j = new ImageView(tenImage);
    ImageView k = new ImageView(elevenImage);
    ImageView l = new ImageView(twelveImage);
    ImageView m = new ImageView(thirteenImage);
    ImageView n = new ImageView(fourteenImage);
    ImageView o = new ImageView(fifteenImage);
    ImageView p = new ImageView(sixteenImage);

    public static void main(String[] args) {
        // Launch the application.
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create Image objects.


        a.addEventHandler(MouseEvent.MOUSE_CLICKED, new ImageClickHandler1());
        b.addEventHandler(MouseEvent.MOUSE_CLICKED, new ImageClickHandler2());
        c.addEventHandler(MouseEvent.MOUSE_CLICKED, new ImageClickHandler3());
        d.addEventHandler(MouseEvent.MOUSE_CLICKED, new ImageClickHandler4());
        e.addEventHandler(MouseEvent.MOUSE_CLICKED, new ImageClickHandler5());
        f.addEventHandler(MouseEvent.MOUSE_CLICKED, new ImageClickHandler6());
        g.addEventHandler(MouseEvent.MOUSE_CLICKED, new ImageClickHandler7());
        h.addEventHandler(MouseEvent.MOUSE_CLICKED, new ImageClickHandler8());
        i.addEventHandler(MouseEvent.MOUSE_CLICKED, new ImageClickHandler9());
        j.addEventHandler(MouseEvent.MOUSE_CLICKED, new ImageClickHandler10());
        k.addEventHandler(MouseEvent.MOUSE_CLICKED, new ImageClickHandler11());
        l.addEventHandler(MouseEvent.MOUSE_CLICKED, new ImageClickHandler12());
        m.addEventHandler(MouseEvent.MOUSE_CLICKED, new ImageClickHandler13());
        n.addEventHandler(MouseEvent.MOUSE_CLICKED, new ImageClickHandler14());
        o.addEventHandler(MouseEvent.MOUSE_CLICKED, new ImageClickHandler15());
        p.addEventHandler(MouseEvent.MOUSE_CLICKED, new ImageClickHandler16());


        //two.addEventHandler(MouseEvent.MOUSE_ENTERED, new ImageClickHandler());

        Button button = new Button("New Game");
        button.setOnAction(new ButtonClickHandler());

        resultLabel = new Label();

        // Create a VBox layout container for the images.
        HBox vbox = new HBox(10, a, b, c, d);
        HBox vbox2 = new HBox(10, e, f, g, h);
        HBox vbox3 = new HBox(10, i, j, k, l);
        HBox vbox4 = new HBox(10, m, n, o, p);
        HBox vbox5 = new HBox(10, button, resultLabel);

        vbox.setAlignment(Pos.TOP_CENTER);
        vbox2.setAlignment(Pos.TOP_CENTER);
        vbox3.setAlignment(Pos.TOP_CENTER);
        vbox4.setAlignment(Pos.TOP_CENTER);
        vbox5.setAlignment(Pos.TOP_CENTER);

        VBox cbox = new VBox(10, vbox, vbox2, vbox3, vbox4, vbox5);

        // Create a Scene with the vbox
        Scene scene = new Scene(cbox);

        // Add the Scene to the Stage.
        primaryStage.setScene(scene);

        //Title
        primaryStage.setTitle("TicTacToe");
        // Show the window.
        primaryStage.show();
    }

    //EventHandler for Every Click
    class ImageClickHandler1 implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            System.out.println("Source: " + e.getSource());
            if (!gameEnd && counter % 2 == 1 && gameGrid.cloneGrid[1][1] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/x.jpg"));
                gameGrid.cloneGrid[1][1] = 1;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("X Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/x.jpg"));
            } else if (!gameEnd && counter % 2 == 0 && gameGrid.cloneGrid[1][1] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/o.jpg"));
                gameGrid.cloneGrid[1][1] = 2;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("0 Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/o.jpg"));
            }
        }
    }

    class ImageClickHandler2 implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            System.out.println("Source: " + e.getSource());
            if (!gameEnd && counter % 2 == 1 && gameGrid.cloneGrid[1][2] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/x.jpg"));
                gameGrid.cloneGrid[1][2] = 1;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("X Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/x.jpg"));
            } else if (!gameEnd && counter % 2 == 0 && gameGrid.cloneGrid[1][2] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/o.jpg"));
                gameGrid.cloneGrid[1][2] = 2;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("0 Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/o.jpg"));
            }
        }
    }

    class ImageClickHandler3 implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            System.out.println("Source: " + e.getSource());
            if (!gameEnd && counter % 2 == 1 && gameGrid.cloneGrid[1][3] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/x.jpg"));
                gameGrid.cloneGrid[1][3] = 1;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("X Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/x.jpg"));
            } else if (!gameEnd && counter % 2 == 0 && gameGrid.cloneGrid[1][3] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/o.jpg"));
                gameGrid.cloneGrid[1][3] = 2;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("0 Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/o.jpg"));
            }
        }
    }

    class ImageClickHandler4 implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            System.out.println("Source: " + e.getSource());
            if (!gameEnd && counter % 2 == 1 && gameGrid.cloneGrid[1][4] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/x.jpg"));
                gameGrid.cloneGrid[1][4] = 1;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("X Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/x.jpg"));
            } else if (!gameEnd && counter % 2 == 0 && gameGrid.cloneGrid[1][4] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/o.jpg"));
                gameGrid.cloneGrid[1][4] = 2;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("0 Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/o.jpg"));
            }
        }
    }

    class ImageClickHandler5 implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            System.out.println("Source: " + e.getSource());
            if (!gameEnd && counter % 2 == 1 && gameGrid.cloneGrid[2][1] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/x.jpg"));
                gameGrid.cloneGrid[2][1] = 1;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("X Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/x.jpg"));
            } else if (!gameEnd && counter % 2 == 0 && gameGrid.cloneGrid[2][1] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/o.jpg"));
                gameGrid.cloneGrid[2][1] = 2;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("0 Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/o.jpg"));
            }
        }
    }

    class ImageClickHandler6 implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            System.out.println("Source: " + e.getSource());
            if (!gameEnd && counter % 2 == 1 && gameGrid.cloneGrid[2][2] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/x.jpg"));
                gameGrid.cloneGrid[2][2] = 1;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("X Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/x.jpg"));
            } else if (!gameEnd && counter % 2 == 0 && gameGrid.cloneGrid[2][2] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/o.jpg"));
                gameGrid.cloneGrid[2][2] = 2;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("0 Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/o.jpg"));
            }
        }
    }

    class ImageClickHandler7 implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            System.out.println("Source: " + e.getSource());
            if (!gameEnd && counter % 2 == 1 && gameGrid.cloneGrid[2][3] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/x.jpg"));
                gameGrid.cloneGrid[2][3] = 1;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("X Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/x.jpg"));
            } else if (!gameEnd && counter % 2 == 0 && gameGrid.cloneGrid[2][3] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/o.jpg"));
                gameGrid.cloneGrid[2][3] = 2;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("0 Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/o.jpg"));
            }
        }
    }

    class ImageClickHandler8 implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            System.out.println("Source: " + e.getSource());
            if (!gameEnd && counter % 2 == 1 && gameGrid.cloneGrid[2][4] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/x.jpg"));
                gameGrid.cloneGrid[2][4] = 1;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("X Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/x.jpg"));
            } else if (!gameEnd && counter % 2 == 0 && gameGrid.cloneGrid[2][4] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/o.jpg"));
                gameGrid.cloneGrid[2][4] = 2;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("0 Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/o.jpg"));
            }
        }
    }

    class ImageClickHandler9 implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            System.out.println("Source: " + e.getSource());
            if (!gameEnd && counter % 2 == 1 && gameGrid.cloneGrid[3][1] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/x.jpg"));
                gameGrid.cloneGrid[3][1] = 1;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("X Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/x.jpg"));
            } else if (!gameEnd && counter % 2 == 0 && gameGrid.cloneGrid[3][1] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/o.jpg"));
                gameGrid.cloneGrid[3][1] = 2;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("0 Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/o.jpg"));
            }
        }
    }

    class ImageClickHandler10 implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            System.out.println("Source: " + e.getSource());
            if (!gameEnd && counter % 2 == 1 && gameGrid.cloneGrid[3][2] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/x.jpg"));
                gameGrid.cloneGrid[3][2] = 1;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("X Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/x.jpg"));
            } else if (!gameEnd && counter % 2 == 0 && gameGrid.cloneGrid[3][2] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/o.jpg"));
                gameGrid.cloneGrid[3][2] = 2;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("0 Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/o.jpg"));
            }
        }
    }

    class ImageClickHandler11 implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            System.out.println("Source: " + e.getSource());
            if (!gameEnd && counter % 2 == 1 && gameGrid.cloneGrid[3][3] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/x.jpg"));
                gameGrid.cloneGrid[3][3] = 1;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("X Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/x.jpg"));
            } else if (!gameEnd && counter % 2 == 0 && gameGrid.cloneGrid[3][3] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/o.jpg"));
                gameGrid.cloneGrid[3][3] = 2;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("0 Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/o.jpg"));
            }
        }
    }

    class ImageClickHandler12 implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            System.out.println("Source: " + e.getSource());
            if (!gameEnd && counter % 2 == 1 && gameGrid.cloneGrid[3][4] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/x.jpg"));
                gameGrid.cloneGrid[3][4] = 1;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("X Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/x.jpg"));
            } else if (!gameEnd && counter % 2 == 0 && gameGrid.cloneGrid[3][4] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/o.jpg"));
                gameGrid.cloneGrid[3][4] = 2;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("0 Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/o.jpg"));
            }
        }
    }

    class ImageClickHandler13 implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            System.out.println("Source: " + e.getSource());
            if (!gameEnd && counter % 2 == 1 && gameGrid.cloneGrid[4][1] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/x.jpg"));
                gameGrid.cloneGrid[4][1] = 1;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("X Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/x.jpg"));
            } else if (!gameEnd && counter % 2 == 0 && gameGrid.cloneGrid[4][1] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/o.jpg"));
                gameGrid.cloneGrid[4][1] = 2;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("0 Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/o.jpg"));
            }
        }
    }

    class ImageClickHandler14 implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            System.out.println("Source: " + e.getSource());
            if (!gameEnd && counter % 2 == 1 && gameGrid.cloneGrid[4][2] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/x.jpg"));
                gameGrid.cloneGrid[4][2] = 1;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("X Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/x.jpg"));
            } else if (!gameEnd && counter % 2 == 0 && gameGrid.cloneGrid[4][2] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/o.jpg"));
                gameGrid.cloneGrid[4][2] = 2;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("0 Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/o.jpg"));
            }
        }
    }

    class ImageClickHandler15 implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            System.out.println("Source: " + e.getSource());
            if (!gameEnd && counter % 2 == 1 && gameGrid.cloneGrid[4][3] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/x.jpg"));
                gameGrid.cloneGrid[4][3] = 1;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("X Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/x.jpg"));
            } else if (!gameEnd && counter % 2 == 0 && gameGrid.cloneGrid[4][3] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/o.jpg"));
                gameGrid.cloneGrid[4][3] = 2;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("0 Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/o.jpg"));
            }
        }
    }

    class ImageClickHandler16 implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            System.out.println("Source: " + e.getSource());
            if (!gameEnd && counter % 2 == 1 && gameGrid.cloneGrid[4][4] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/x.jpg"));
                gameGrid.cloneGrid[4][4] = 1;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("X Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/x.jpg"));
            } else if (!gameEnd && counter % 2 == 0 && gameGrid.cloneGrid[4][4] == 0) {
                ((ImageView) e.getSource()).setImage(new Image("file:img/o.jpg"));
                gameGrid.cloneGrid[4][4] = 2;
                counter++;
                if (gameGrid.checkVictory()) {
                    gameEnd = true;
                    resultLabel.setText("0 Won");
                }
                if (!gameEnd && counter == 16) {
                    resultLabel.setText("Tie! Start a new game.");
                }
                //one.setImage(new Image("file:img/o.jpg"));
            }
        }
    }

    //NEW GAME BUTTON
    class ButtonClickHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            a.setImage(new Image("file:img/empty.jpg"));
            b.setImage(new Image("file:img/empty.jpg"));
            c.setImage(new Image("file:img/empty.jpg"));
            d.setImage(new Image("file:img/empty.jpg"));
            e.setImage(new Image("file:img/empty.jpg"));
            f.setImage(new Image("file:img/empty.jpg"));
            g.setImage(new Image("file:img/empty.jpg"));
            h.setImage(new Image("file:img/empty.jpg"));
            i.setImage(new Image("file:img/empty.jpg"));
            j.setImage(new Image("file:img/empty.jpg"));
            k.setImage(new Image("file:img/empty.jpg"));
            l.setImage(new Image("file:img/empty.jpg"));
            m.setImage(new Image("file:img/empty.jpg"));
            n.setImage(new Image("file:img/empty.jpg"));
            o.setImage(new Image("file:img/empty.jpg"));
            p.setImage(new Image("file:img/empty.jpg"));
            gameGrid.newGrid();
            gameEnd = false;
            resultLabel.setText("Game Restarted");

        }
    }
}
