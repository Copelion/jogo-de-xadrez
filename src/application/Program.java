package application;

import java.util.*;
import boardgame.Board;
import boardgame.Position;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Locale locale = new Locale("UTF-8");

        ChessMatch chessMatch = new ChessMatch();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {


                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }
            catch(ChessException e){
                    System.out.println(e.getMessage());
                    sc.nextLine();
                }
            catch(InputMismatchException e){
                    System.out.println(e.getMessage());
                    sc.nextLine();
                }


            }
        }

    }