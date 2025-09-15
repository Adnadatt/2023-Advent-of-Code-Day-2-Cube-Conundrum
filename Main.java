import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    File file = new File("input.txt");
    Scanner scan = null;
    try {
      scan = new Scanner(file);
    } catch(FileNotFoundException e){}

    //Part 1
    int redTotal = 12;
    int greenTotal = 13;
    int blueTotal = 14;
    int totalID = 0;
    
    while(scan.hasNextLine()){
      String[] line = scan.nextLine().split(" ");
      boolean works = true;
      for(int i = 3; i<line.length; i+=2){
        
        if(line[i].substring(0,line[i].length()-1).equals("red")){
          if(Integer.parseInt(line[i-1]) > redTotal){
            works = false;
            continue;
          }
        }else if(line[i].substring(0,line[i].length()-1).equals("green")){
          if(Integer.parseInt(line[i-1]) > greenTotal){
            works = false;
            continue;
          }
        }else if(line[i].substring(0,line[i].length()-1).equals("blue")){
          if(Integer.parseInt(line[i-1]) > blueTotal){
            works = false;
            continue;
          }
        }
      }
      if(works){
        totalID += Integer.parseInt(line[1].substring(0,line[1].length()-1));
      }
    }
    System.out.println(totalID);

    int totalPower = 0;
    while(scan.hasNextLine()){
      String[] line = scan.nextLine().split(" ");
      for(int i = 3; i<line.length; i+=2){
        
      }
    }
  }
}
