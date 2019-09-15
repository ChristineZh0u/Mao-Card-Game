import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;

public class Mao {
    public static void main (String[] args) {

        //welcome message and rules
        JOptionPane.showMessageDialog(null, "Welcome to the Game of Mao!", "Mao", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Base Rules: \n *On your turn, you can play one card. \n *The card you play must match either the" +
                " suit, or the number, of the card on the top of the pile. \n *If you don't have a card that you can play, " +
                "you can draw a card from the pile. \n *If the card you draw is a card that you can play, you may play it. \n *The game ends when either you, or the" +
                " computer, get rid of all the cards in your hand. \n *Besides these base rules, any rules can be added, but you won't know" +
                " what they are! ", "Mao", JOptionPane.PLAIN_MESSAGE);

        //difficulty selection
        Object[] difficultyOptions = { "Easy", "Medium", "Hard" };
        int difficulty = JOptionPane.showOptionDialog(null, "Choose a difficulty. \n Easy:          3 Rules Added \n Medium:    5 Rules Added" +
                        " \n Hard:          7 Rules Added", "Mao",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                difficultyOptions, null);
        //Easy: 0
        //Medium: 1
        //Hard: 2

        //rule selection
        Boolean[] ruleOptions = new Boolean[9];     //nine different rules
        Arrays.fill(ruleOptions, false);
        //0: happyBirthday
        //1: play2Again
        //2: blank
        //3: blank
        //4: blank
        //5: blank
        //6: blank
        //7: blank
        //8: blank
        Random random = new Random();
        int ruleRandom = -1;

        if (difficulty == 0) {
            //Easy: 3 Rules
            for (int i = 0; i < 3; i++) {
                ruleRandom = random.nextInt(9);
                if (!ruleOptions[ruleRandom]) {
                    ruleOptions[ruleRandom] = true;
                } else if (ruleOptions[ruleRandom]) {
                    i -= 1;
                }
            }
        }

        if (difficulty == 1) {
            //Medium: 5 Rules
            for (int i = 0; i < 5; i++) {
                ruleRandom = random.nextInt(9);
                if (!ruleOptions[ruleRandom]) {
                    ruleOptions[ruleRandom] = true;
                } else if (ruleOptions[ruleRandom]) {
                    i -= 1;
                }
            }
        }

        if (difficulty == 2) {
            //Hard: 7 Rules
            for (int i = 0; i < 7; i++) {
                ruleRandom = random.nextInt(9);
                if (!ruleOptions[ruleRandom]) {
                    ruleOptions[ruleRandom] = true;
                } else if (ruleOptions[ruleRandom]) {
                    i -= 1;
                }
            }
        }

        //cards are dealt
        Card[] cardArray = {
                new Card("H", "A"), //0
                new Card("H", "2"), //1
                new Card("H", "3"), //2
                new Card("H", "4"), //3
                new Card("H", "5"), //4
                new Card("H", "6"), //5
                new Card("H", "7"), //6
                new Card("H", "8"), //7
                new Card("H", "9"), //8
                new Card("H", "10"), //9
                new Card("H", "J"), //10
                new Card("H", "Q"), //11
                new Card("H", "K"), //12
                new Card("D", "A"), //13
                new Card("D", "2"), //14
                new Card("D", "3"), //15
                new Card("D", "4"), //16
                new Card("D", "5"), //17
                new Card("D", "6"), //18
                new Card("D", "7"), //19
                new Card("D", "8"), //20
                new Card("D", "9"), //21
                new Card("D", "10"), //22
                new Card("D", "J"), //23
                new Card("D", "Q"), //24
                new Card("D", "K"), //25
                new Card("C", "A"), //26
                new Card("C", "2"), //27
                new Card("C", "3"), //28
                new Card("C", "4"), //29
                new Card("C", "5"), //30
                new Card("C", "6"), //31
                new Card("C", "7"), //32
                new Card("C", "8"), //33
                new Card("C", "9"), //34
                new Card("C", "10"), //35
                new Card("C", "J"), //36
                new Card("C", "Q"), //37
                new Card("C", "K"), //38
                new Card("S", "A"), //39
                new Card("S", "2"), //40
                new Card("S", "3"), //41
                new Card("S", "4"), //42
                new Card("S", "5"), //43
                new Card("S", "6"), //44
                new Card("S", "7"), //45
                new Card("S", "8"), //46
                new Card("S", "9"), //47
                new Card("S", "10"), //48
                new Card("S", "J"), //49
                new Card("S", "Q"), //50
                new Card("S", "K"), //51
        };
        Card[] playerHand = {
                new Card("0", "0"), //0
                new Card("0", "0"), //1
                new Card("0", "0"), //2
                new Card("0", "0"), //3
                new Card("0", "0"), //4
                new Card("0", "0"), //5
                new Card("0", "0"), //6
                new Card("0", "0"), //7
                new Card("0", "0"), //8
                new Card("0", "0"), //9
                new Card("0", "0"), //10
                new Card("0", "0"), //11
                new Card("0", "0"), //12
                new Card("0", "0"), //13
                new Card("0", "0"), //14
                new Card("0", "0"), //15
                new Card("0", "0"), //16
                new Card("0", "0"), //17
                new Card("0", "0"), //18
                new Card("0", "0"), //19
                new Card("0", "0"), //20
                new Card("0", "0"), //21
                new Card("0", "0"), //22
                new Card("0", "0"), //23
                new Card("0", "0"), //24
                new Card("0", "0"), //25
                new Card("0", "0"), //26
                new Card("0", "0"), //27
                new Card("0", "0"), //28
                new Card("0", "0"), //29
                new Card("0", "0"), //30
                new Card("0", "0"), //31
                new Card("0", "0"), //32
                new Card("0", "0"), //33
                new Card("0", "0"), //34
                new Card("0", "0"), //35
                new Card("0", "0"), //36
                new Card("0", "0"), //37
                new Card("0", "0"), //38
                new Card("0", "0"), //39
                new Card("0", "0"), //40
                new Card("0", "0"), //41
                new Card("0", "0"), //42
                new Card("0", "0"), //43
                new Card("0", "0"), //44
                new Card("0", "0"), //45
                new Card("0", "0"), //46
                new Card("0", "0"), //47
                new Card("0", "0"), //48
                new Card("0", "0"), //49
                new Card("0", "0"), //50
                new Card("0", "0"), //51
        };
        Card[] computerHand = {
                new Card("0", "0"), //0
                new Card("0", "0"), //1
                new Card("0", "0"), //2
                new Card("0", "0"), //3
                new Card("0", "0"), //4
                new Card("0", "0"), //5
                new Card("0", "0"), //6
                new Card("0", "0"), //7
                new Card("0", "0"), //8
                new Card("0", "0"), //9
                new Card("0", "0"), //10
                new Card("0", "0"), //11
                new Card("0", "0"), //12
                new Card("0", "0"), //13
                new Card("0", "0"), //14
                new Card("0", "0"), //15
                new Card("0", "0"), //16
                new Card("0", "0"), //17
                new Card("0", "0"), //18
                new Card("0", "0"), //19
                new Card("0", "0"), //20
                new Card("0", "0"), //21
                new Card("0", "0"), //22
                new Card("0", "0"), //23
                new Card("0", "0"), //24
                new Card("0", "0"), //25
                new Card("0", "0"), //26
                new Card("0", "0"), //27
                new Card("0", "0"), //28
                new Card("0", "0"), //29
                new Card("0", "0"), //30
                new Card("0", "0"), //31
                new Card("0", "0"), //32
                new Card("0", "0"), //33
                new Card("0", "0"), //34
                new Card("0", "0"), //35
                new Card("0", "0"), //36
                new Card("0", "0"), //37
                new Card("0", "0"), //38
                new Card("0", "0"), //39
                new Card("0", "0"), //40
                new Card("0", "0"), //41
                new Card("0", "0"), //42
                new Card("0", "0"), //43
                new Card("0", "0"), //44
                new Card("0", "0"), //45
                new Card("0", "0"), //46
                new Card("0", "0"), //47
                new Card("0", "0"), //48
                new Card("0", "0"), //49
                new Card("0", "0"), //50
                new Card("0", "0"), //51
        };
        int handRandom = 0;
        int playerHandSize = 0;
        int computerHandSize = 0;

        //player hand is dealt
        for(int i = 0; i < 7; i++) {
            handRandom = random.nextInt(52);
            if(cardArray[handRandom].getSuit().equals("0")) {
                i -= 1;
            } else {
                playerHand[i].setSuit(cardArray[handRandom].getSuit());
                playerHand[i].setNumber(cardArray[handRandom].getNumber());
                cardArray[handRandom].setSuit("0");
                cardArray[handRandom].setNumber("0");
            }
        }
        playerHandSize = 7;

        //computer hand is dealt
        for(int x = 0; x < 7; x++) {
            handRandom = random.nextInt(52);
            if(cardArray[handRandom].getSuit().equals("0")) {
                x -= 1;
            } else {
                computerHand[x].setSuit(cardArray[handRandom].getSuit());
                computerHand[x].setNumber(cardArray[handRandom].getNumber());
                cardArray[handRandom].setSuit("0");
                cardArray[handRandom].setNumber("0");
            }
        }
        computerHandSize = 7;

        //starting card selected
        Card showingCard = new Card("0", "0");
        for (int z = 0; z < 1; z++) {
            handRandom = random.nextInt(52);
            if(cardArray[handRandom].getSuit().equals("0")) {
                z -= 1;
            } else {
                showingCard.setSuit(cardArray[handRandom].getSuit());
                showingCard.setNumber(cardArray[handRandom].getNumber());
                cardArray[handRandom].setSuit("0");
                cardArray[handRandom].setNumber("0");
            }
        }
        JOptionPane.showMessageDialog(null, "The starting card is " + showingCard.getSuit() + showingCard.getNumber() + ".", "Mao", JOptionPane.PLAIN_MESSAGE);

        //TESTING
       /*
       System.out.println(computerHand[0].getSuit() + computerHand[0].getNumber());
       System.out.println(computerHand[1].getSuit() + computerHand[1].getNumber());
       System.out.println(computerHand[2].getSuit() + computerHand[2].getNumber());
       System.out.println(computerHand[3].getSuit() + computerHand[3].getNumber());
       System.out.println(computerHand[4].getSuit() + computerHand[4].getNumber());
       System.out.println(computerHand[5].getSuit() + computerHand[5].getNumber());
       System.out.println(computerHand[6].getSuit() + computerHand[6].getNumber());
       System.out.println("==============================");
        */

        //game loop
        boolean isComputersTurn = true;
        boolean isPlayersTurn = true;
        if (playerHandSize > 0 && computerHandSize > 0) {

            //computer's turn
            do {
                boolean computerDecision = false;
                //basicRule
                for (int w = 0; w < 52; w++) {
                    String showingSuit = showingCard.getSuit();
                    String playingSuit = computerHand[w].getSuit();
                    String showingNumber = showingCard.getNumber();
                    String playingNumber = computerHand[w].getNumber();
                    if (playingSuit.equals(showingSuit) || playingNumber.equals(showingNumber)) {
                        computerDecision = true;
                    } else {
                        computerDecision = false;
                    }
                    if (computerDecision) {
                        showingCard.setSuit(computerHand[w].getSuit());
                        showingCard.setNumber(computerHand[w].getNumber());
                        computerHand[w].setSuit("0");
                        computerHand[w].setNumber("0");
                        computerHandSize -= 1;
                        w = 52;
                        JOptionPane.showMessageDialog(null, "The computer played " + showingCard.getSuit() + showingCard.getNumber() + ".", "Mao", JOptionPane.PLAIN_MESSAGE);
                        isComputersTurn = false;
                    }
                }
                //computer must draw
                if (!computerDecision && isComputersTurn) {
                    JOptionPane.showMessageDialog(null, "The computer drew a card.", "Mao", JOptionPane.PLAIN_MESSAGE);
                    for (int q = 0; q < 1; q++) {
                        handRandom = random.nextInt(52);
                        if (cardArray[handRandom].getSuit().equals("0")) {
                            q -= 1;
                        } else {
                            for (int f = 0; f < 52; f++) {
                                if (computerHand[f].getSuit().equals("0")) {
                                    computerHand[f].setSuit(cardArray[handRandom].getSuit());
                                    computerHand[f].setNumber(cardArray[handRandom].getNumber());
                                    cardArray[handRandom].setSuit("0");
                                    cardArray[handRandom].setNumber("0");
                                    computerHandSize += 1;
                                    isComputersTurn = false;
                                    f = 52;
                                }
                            }
                        }
                    }
                }

                //TESTING
               /*
               System.out.println(computerHand[0].getSuit() + computerHand[0].getNumber());
               System.out.println(computerHand[1].getSuit() + computerHand[1].getNumber());
               System.out.println(computerHand[2].getSuit() + computerHand[2].getNumber());
               System.out.println(computerHand[3].getSuit() + computerHand[3].getNumber());
               System.out.println(computerHand[4].getSuit() + computerHand[4].getNumber());
               System.out.println(computerHand[5].getSuit() + computerHand[5].getNumber());
               System.out.println(computerHand[6].getSuit() + computerHand[6].getNumber());
               System.out.println(computerHand[7].getSuit() + computerHand[7].getNumber());
               System.out.println(computerHand[8].getSuit() + computerHand[8].getNumber());
               System.out.println(computerHand[9].getSuit() + computerHand[9].getNumber());
               System.out.println(computerHand[10].getSuit() + computerHand[10].getNumber());
               System.out.println("==============================");
                */

            } while (isComputersTurn);

            //player's turn
            boolean drawn = false;
            String playingCardString = "";
            Card playingCard = new Card("0", "0");
            do {
                //player's hand is printed and card is chosen
                String playerHandString = "";
                for (int j = 0; j < 52; j++) {
                    if (!playerHand[j].getSuit().equals("0")) {
                        playerHandString = playerHandString + playerHand[j].getString() + ", ";
                    }
                }
                playerHandString = playerHandString.substring(0, playerHandString.length() - 2);
                //play or draw option
                Object[] drawPlayOptions = {"Play", "Draw"};
                int drawPlayChoice = JOptionPane.showOptionDialog(null, "The last card played was " + showingCard.getString() + ". \nYour hand is: \n" +
                                playerHandString + "\nWhat would you like to play a card or draw?", "Mao", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                        drawPlayOptions, null);
                //0: Play
                //1: Draw
                if (drawPlayChoice == 0) {
                    playingCardString = JOptionPane.showInputDialog(null, "The last card played was " + showingCard.getString() + ". \nYour hand is: \n" +
                            playerHandString + "\nWhat card would you like to play?", "Mao", JOptionPane.PLAIN_MESSAGE);
                    playingCardString = playingCardString.toUpperCase();
                    playingCard.setSuit(playingCardString.substring(0, 1));
                    playingCard.setNumber(playingCardString.substring(1, playingCardString.length()));
                    isPlayersTurn = false;
                } else if (drawPlayChoice == 1) {
                    int tempIndex = -1;
                    for (int h = 0; h < 1; h++) {
                        handRandom = random.nextInt(52);
                        if (cardArray[handRandom].getSuit().equals("0")) {
                            h -= 1;
                        } else if (!drawn) {
                            for (int f = 0; f < 52; f++) {
                                if (playerHand[f].getSuit().equals("0")) {
                                    playerHand[f].setSuit(cardArray[handRandom].getSuit());
                                    playerHand[f].setNumber(cardArray[handRandom].getNumber());
                                    cardArray[handRandom].setSuit("0");
                                    cardArray[handRandom].setNumber("0");
                                    playerHandSize += 1;
                                    tempIndex =f;
                                    f = 52;
                                    drawn = true;
                                    JOptionPane.showMessageDialog(null, "You drew " + playerHand[tempIndex].getString() + ".", "Mao", JOptionPane.PLAIN_MESSAGE);
                                    tempIndex = -1;
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "You have already drawn.", "Mao", JOptionPane.PLAIN_MESSAGE);
                            isPlayersTurn = false;
                        }
                    }
                    isPlayersTurn = true;
                }

                //testing input for validity
                boolean isValid = false;
                if (playingCardString.length() < 2 || playingCardString.length() > 3) {
                    isValid = false;
                } else if (playerHandString.length() == 3 && !playerHandString.substring(1, 3).equals("10")) {
                    isValid = false;
                } else {
                    isValid = true;
                }

                int j = 0;
                do {
                    for (j = 0; j < 52; j++) {
                        if (playingCard.getSuit().equals(playerHand[j].getSuit())) {
                            isValid = true;
                            if (playingCard.getNumber().equals(playerHand[j].getNumber())) {
                                isValid = true;
                                playerHandSize -= 1;
                                isPlayersTurn = false;
                                playerHand[j].setSuit("0");
                                playerHand[j].setNumber("0");
                                j = 52;
                            }
                        } else {
                            isValid = false;
                        }
                    }
                } while (!isValid && j < 52);

                if (!isValid) {
                    JOptionPane.showMessageDialog(null, "That is not a valid input.", "Mao", JOptionPane.PLAIN_MESSAGE);
                    isPlayersTurn = true;
                }

            } while (isPlayersTurn);

        }

    }
}
