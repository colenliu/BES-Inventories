package UI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import javax.swing.text.html.HTMLEditorKit;

public class InventoryGUI extends JFrame
{
    private static InventoryGUI valid = new InventoryGUI();
    static
    {
        JFrame jFrame = new JFrame("Inventory Program");
        Container content = jFrame.getContentPane();
        final JEditorPane edPane = new JEditorPane();
        JScrollPane sPne = new JScrollPane(edPane);
        JPanel jPanel = new JPanel();
        String userInput = JOptionPane.showInputDialog(valid, "Enter desired inventory (BAKERY/ELECTRONICS/SPORTS)", "INVENTORY MANAGEMENT PROGRAM", JOptionPane.PLAIN_MESSAGE);
        String choice = userInput.toUpperCase();
        if (choice.equals("BAKERY")) {
            System.out.println("entering bakery");
            jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            jFrame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    Object[] options = {"Save and Quit",
                            "Don't Save and Quit",
                            "Cancel"};
                    int choose = JOptionPane.showOptionDialog(jFrame,
                            "Do you really want to exit the application ?",
                            "Confirm Close", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            options,
                            options[0]);
                    if (choose == 0) {
                        try {
                            save(edPane, "C:/Users/liuco/IdeaProjects/projectw1_team263/bakeryinventorylist.txt");
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                        e.getWindow().dispose();
                        System.out.println("save and quit");
                        System.exit(0);
                    } else if (choose == 1) {
                        System.out.println("don't save and quit");
                        e.getWindow().dispose();
                        System.exit(0);
                    }
                    else {
                        System.out.println("do nothing");
                    }
                }
            });

            content.add(sPne, BorderLayout.CENTER);
            edPane.setEditorKit(new HTMLEditorKit());

            //load button and functionality
            Action Load = new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    try {
                        load(edPane, "C:/Users/liuco/IdeaProjects/projectw1_team263/bakeryinventorylist.txt");
                        JOptionPane.showMessageDialog(jFrame, "NOW LOADING BAKERY INVENTORY");
                    } catch (Exception e1) {
                        System.out.println("Cannot load file!");
                    }
                }
            };
            Load.putValue(Action.NAME, "Load");
            JButton loadButton = new JButton(Load);
            jPanel.add(loadButton);

            //save button and functionality
            Action absActionSave = new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    try {
                        save(edPane, "C:/Users/liuco/IdeaProjects/projectw1_team263/bakeryinventorylist.txt");
                        JOptionPane.showMessageDialog(jFrame, "FILE HAS BEEN SAVED");
                    } catch (Exception e1) {
                        System.out.println("Cannot save file!");
                    }
                }
            };
            absActionSave.putValue(Action.NAME, "Save");
            JButton jButton = new JButton(absActionSave);
            jPanel.add(jButton);

            // clear button and functionality
            Action absActionClear = new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    edPane.setText("");
                }
            };
            absActionClear.putValue(Action.NAME, "Clear");
            JButton clearButton = new JButton(absActionClear);
            jPanel.add(clearButton);
            // window appearance
            content.add(jPanel, BorderLayout.SOUTH);
            jFrame.setSize(900, 600);
            jFrame.setVisible(true);
        } else if (choice.equals("ELECTRONICS")) {
            System.out.println("entering electronics");
            jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            jFrame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    Object[] options = {"Save and Quit",
                            "Don't Save and Quit",
                            "Cancel"};
                    int choose = JOptionPane.showOptionDialog(jFrame,
                            "Do you really want to exit the application ?",
                            "Confirm Close", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            options,
                            options[0]);
                    if (choose == 0) {
                        try {
                            save(edPane, "C:/Users/liuco/IdeaProjects/projectw1_team263/electronicsinventorylist.txt");
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                        e.getWindow().dispose();
                        System.out.println("save and quit");
                        System.exit(0);
                    } else if (choose == 1) {
                        System.out.println("don't save and quit");
                        e.getWindow().dispose();
                        System.exit(0);
                    }
                    else {
                        System.out.println("do nothing");
                    }
                }
            });
            content.add(sPne, BorderLayout.CENTER);
            edPane.setEditorKit(new HTMLEditorKit());

            //load button and functionality
            Action Load = new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    try {
                        load(edPane, "C:/Users/liuco/IdeaProjects/projectw1_team263/electronicsinventorylist.txt");
                        JOptionPane.showMessageDialog(jFrame, "NOW LOADING ELECTRONICS INVENTORY");
                    } catch (Exception e1) {
                        System.out.println("Cannot load file!");
                    }
                }
            };
            Load.putValue(Action.NAME, "Load");
            JButton loadButton = new JButton(Load);
            jPanel.add(loadButton);

            //save button and functionality
            Action absActionSave = new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    try {
                        save(edPane, "C:/Users/liuco/IdeaProjects/projectw1_team263/electronicsinventorylist.txt");
                        JOptionPane.showMessageDialog(jFrame, "FILE HAS BEEN SAVED");
                    } catch (Exception e1) {
                        System.out.println("Cannot save file!");
                    }
                }
            };
            absActionSave.putValue(Action.NAME, "Save");
            JButton jButton = new JButton(absActionSave);
            jPanel.add(jButton);

            // clear button and functionality
            Action absActionClear = new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    edPane.setText("");
                }
            };
            absActionClear.putValue(Action.NAME, "Clear");
            JButton clearButton = new JButton(absActionClear);
            jPanel.add(clearButton);
            // window appearance
            content.add(jPanel, BorderLayout.SOUTH);
            jFrame.setSize(900, 600);
            jFrame.setVisible(true);
        }
        else if (choice.equals("SPORTS")) {
            System.out.println("entering sports");
            jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            jFrame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    Object[] options = {"Save and Quit",
                            "Don't Save and Quit",
                            "Cancel"};
                    int choose = JOptionPane.showOptionDialog(jFrame,
                            "Do you really want to exit the application ?",
                            "Confirm Close", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            options,
                            options[0]);
                    if (choose == 0) {
                        try {
                            save(edPane, "C:/Users/liuco/IdeaProjects/projectw1_team263/sportinventorylist.txt");
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                        e.getWindow().dispose();
                        System.out.println("save and quit");
                        System.exit(0);
                    } else if (choose == 1) {
                        System.out.println("don't save and quit");
                        e.getWindow().dispose();
                        System.exit(0);
                    }
                    else {
                        System.out.println("do nothing");
                    }
                }
            });
            content.add(sPne, BorderLayout.CENTER);
            edPane.setEditorKit(new HTMLEditorKit());

            //load button and functionality
            Action Load = new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    try {
                        load(edPane, "C:/Users/liuco/IdeaProjects/projectw1_team263/sportinventorylist.txt");
                        JOptionPane.showMessageDialog(jFrame, "NOW LOADING SPORTS INVENTORY");
                    } catch (Exception e1) {
                        System.out.println("Cannot load file!");
                    }
                }
            };
            Load.putValue(Action.NAME, "Load");
            JButton loadButton = new JButton(Load);
            jPanel.add(loadButton);

            //save button and functionality
            Action absActionSave = new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    try {
                        save(edPane, "C:/Users/liuco/IdeaProjects/projectw1_team263/sportinventorylist.txt");
                        JOptionPane.showMessageDialog(jFrame, "FILE HAS BEEN SAVED");
                    } catch (Exception e1) {
                        System.out.println("Cannot save file!");
                    }
                }
            };
            absActionSave.putValue(Action.NAME, "Save");
            JButton jButton = new JButton(absActionSave);
            jPanel.add(jButton);

            // clear button and functionality
            Action absActionClear = new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    edPane.setText("");
                }
            };
            absActionClear.putValue(Action.NAME, "Clear");
            JButton clearButton = new JButton(absActionClear);
            jPanel.add(clearButton);
            // window appearance
            content.add(jPanel, BorderLayout.SOUTH);
            jFrame.setSize(900, 600);
            jFrame.setVisible(true);
        }
        else if ((choice == null) || ((choice != null) && !(choice.equals("password"))))
            System.exit(0);
    }

    private static void save(JTextComponent text, String inputFile) throws Exception {
        FileWriter writer = null;
        writer = new FileWriter(inputFile);
        text.write(writer);
        writer.close();
    }

    private static void load(JTextComponent text, String inputFile) throws Exception {
        FileReader inputReader = null;
        inputReader = new FileReader(inputFile);
        text.read(inputReader, inputFile);
        inputReader.close();
    }


    public static void main(String[] args) {
        new InventoryGUI();
    }
}




