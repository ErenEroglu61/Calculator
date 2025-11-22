import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Double> list = new ArrayList<>();
    JFrame frame = new JFrame("Calculator");
    JPanel panel = new JPanel(new GridLayout(8,1));
    JButton sumBtn = new JButton("Sum");
    JButton subBtn = new JButton("Subtract");
    JButton mulBtn = new JButton("Multiply");
    JButton divideBtn = new JButton("Divide");
    JButton scanBtn = new JButton("Enter number");
    JButton showListBtn = new JButton("Show list");
    JButton emptyListBtn = new JButton("Empty List");
    JButton exitBtn = new JButton("Exit");

    panel.add(scanBtn);
    panel.add(showListBtn);
    panel.add(sumBtn);
    panel.add(subBtn);
    panel.add(mulBtn);
    panel.add(divideBtn);
    panel.add(emptyListBtn);
    panel.add(exitBtn);

    frame.add(panel);
    frame.setVisible(true);
    frame.setSize(600,600);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    scanBtn.addActionListener(e -> {
      String input = JOptionPane.showInputDialog(
        frame,
        "Enter a number:",
        "Number please!",
        JOptionPane.QUESTION_MESSAGE
      );

      if (input != null) {
        try {
          double num = Double.parseDouble(input);
          list.add(num);
          JOptionPane.showMessageDialog(frame, "Number added: " + num);
        } catch (NumberFormatException ex) {
          JOptionPane.showMessageDialog(frame, "Invalid number!", "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    });
    showListBtn.addActionListener(e -> {
      if(list.isEmpty()) {
        JOptionPane.showMessageDialog(frame, "List is empty.", "Info", JOptionPane.INFORMATION_MESSAGE);
        return;
      }

      StringBuilder sb = new StringBuilder("Numbers:\n");
      for(double n : list) {
        sb.append(n).append("\n");
      }
      JOptionPane.showMessageDialog(frame,sb.toString(),"List",JOptionPane.INFORMATION_MESSAGE);
    });
    sumBtn.addActionListener(e -> {
      if(list.isEmpty()) {
        JOptionPane.showMessageDialog(frame,"There is no number in list", "ERROR",JOptionPane.ERROR_MESSAGE);
        return;
      }

      double sum = 0;
      for (double num: list) {
        sum += num;
      }
      JOptionPane.showMessageDialog(frame,"Sum=" + sum);
    });
    subBtn.addActionListener(e -> {
      if(list.isEmpty()) {
        JOptionPane.showMessageDialog(frame,"List is empty", "ERROR", JOptionPane.ERROR_MESSAGE);
        return;
      }

      double result = list.getFirst();
      for (int i = 1; i < list.size(); i++) {
        result -= list.get(i);
      }
      JOptionPane.showMessageDialog(frame, "Result = " + result);
    });
    mulBtn.addActionListener(e -> {
      if(list.isEmpty()){
        JOptionPane.showMessageDialog(frame,"List is empty", "ERROR", JOptionPane.ERROR_MESSAGE);
        return;
      }
      double result = list.getFirst(); //local variable for mulBtn.addActionListener()
      for (int i = 1; i<list.size();i++) {
        result *= list.get(i);
      }
      JOptionPane.showMessageDialog(frame,"Result= "+ result);

    });
    divideBtn.addActionListener(e -> {
      if(list.isEmpty()){
        JOptionPane.showMessageDialog(frame,"List is empty", "ERROR", JOptionPane.ERROR_MESSAGE);
        return;
      }

      double result = list.getFirst(); //local variable for divideBtn.addActionListener()
      for (int i = 1; i<list.size();i++) {
        if (list.get(i) == 0) {
          JOptionPane.showMessageDialog(frame,"Division by zero is not allowed!","Error",JOptionPane.ERROR_MESSAGE);
          return;
        }
        result /= list.get(i);
      }
      JOptionPane.showMessageDialog(frame,"Result= "+ result);
    });
    emptyListBtn.addActionListener(e -> {
      if(list.isEmpty()) {
        JOptionPane.showMessageDialog(frame,"It's already empty", "ERROR",JOptionPane.ERROR_MESSAGE);
        return;
      }
      int confirm = JOptionPane.showConfirmDialog(
        frame,
        "Are you sure do you want delete all values?",
        "Delete list",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE
      );
      if(confirm == JOptionPane.YES_OPTION) {
        list.clear();
        JOptionPane.showMessageDialog(frame,"List cleared successfully! ","Success! ", JOptionPane.INFORMATION_MESSAGE);
      }
    });
    exitBtn.addActionListener(e -> {
      int confirm = JOptionPane.showConfirmDialog(
        frame,
        "Are you sure you want to exit? ",
        "exit",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE
      );
      if(confirm == JOptionPane.YES_OPTION) {
        System.exit(0);
      }
    });
  }
}