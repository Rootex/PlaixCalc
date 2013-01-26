/*
 * This Application is written by Sotaya, product of Plaix Inc. 
 *
 * For more information about the application and 
 * the lincensing, check the README file in the main 
 * repo.
 *
 *
 *
 * @author PlaixHax0r
 */
public class PlaixCalc extends javax.swing.JFrame {

    /**
     * Creates new form PlaixCalc
     */
    public PlaixCalc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code"> 
    //GUI components are initialized when the initComponents is called
    private void initComponents() {

        One1 = new javax.swing.JButton();
        TextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        One = new javax.swing.JButton();
        Two = new javax.swing.JButton();
        Three = new javax.swing.JButton();
        Four = new javax.swing.JButton();
        Five = new javax.swing.JButton();
        Six = new javax.swing.JButton();
        Seven = new javax.swing.JButton();
        Eight = new javax.swing.JButton();
        Nine = new javax.swing.JButton();
        Zero = new javax.swing.JButton();
        Addition = new javax.swing.JButton();
        Subtraction = new javax.swing.JButton();
        Multiplication = new javax.swing.JButton();
        Division = new javax.swing.JButton();
        Equals = new javax.swing.JButton();
        C = new javax.swing.JButton();
        Period = new javax.swing.JButton();
        BackSpace = new javax.swing.JButton();

        One1.setText("1");
        One1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                One1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        TextField.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); 
        TextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        One.setText("1");
        One.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneActionPerformed(evt);
            }
        });

        Two.setText("2");
        Two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoActionPerformed(evt);
            }
        });

        Three.setText("3");
        Three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeActionPerformed(evt);
            }
        });

        Four.setText("4");
        Four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourActionPerformed(evt);
            }
        });

        Five.setText("5");
        Five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveActionPerformed(evt);
            }
        });

        Six.setText("6");
        Six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SixActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(Four, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(One, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(Two, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(Three, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(Five, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(Six, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, One, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, Two, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Three, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Four, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Five, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Six, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );

        Seven.setText("7");
        Seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenActionPerformed(evt);
            }
        });

        Eight.setText("8");
        Eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EightActionPerformed(evt);
            }
        });

        Nine.setText("9");
        Nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NineActionPerformed(evt);
            }
        });

        Zero.setText("0");
        Zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroActionPerformed(evt);
            }
        });

        Addition.setText("+");
        Addition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdditionActionPerformed(evt);
            }
        });

        Subtraction.setText("-");
        Subtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubtractionActionPerformed(evt);
            }
        });

        Multiplication.setText("x");
        Multiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicationActionPerformed(evt);
            }
        });

        Division.setText("/");
        Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionActionPerformed(evt);
            }
        });

        Equals.setText("=");
        Equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsActionPerformed(evt);
            }
        });

        C.setBackground(new java.awt.Color(51, 102, 255));
        C.setText("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        Period.setText(".");
        Period.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeriodActionPerformed(evt);
            }
        });

        BackSpace.setText("CE");
        BackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackSpaceActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(TextField))
                    .add(layout.createSequentialGroup()
                        .add(12, 12, 12)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(layout.createSequentialGroup()
                                            .add(Seven, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(Eight, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(Nine, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                            .add(Zero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(C, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(Equals, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                    .add(Period, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(12, 12, 12)
                                        .add(Division, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(Subtraction, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(Multiplication, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(Addition, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                            .add(layout.createSequentialGroup()
                                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(BackSpace, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(BackSpace, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(Addition, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(2, 2, 2)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(Seven, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(Eight, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(Nine, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(Subtraction, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Zero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(C, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Equals, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Multiplication, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Period, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Division, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }                       
    //Begining of the button event method. All buttons actions are implemented from here
    boolean equalPress=false;
    private void NineActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // Handling code
        if(equalPress==true) {
            TextField.setText("9");
            equalPress=false;
        }
        else {
            TextField.setText(TextField.getText()+"9");
        }
    }                                    

    private void OneActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // Handling code 
        if(equalPress==true) {
            TextField.setText("1");
            equalPress=false;
        }
        else {
            TextField.setText(TextField.getText()+"1");
        }
    }                                   

    private void TwoActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // Handling code
        if(equalPress==true) {
            TextField.setText("2");
            equalPress=false;
        }
        else {
            TextField.setText(TextField.getText()+"2");
        }
    }                                   

    private void ThreeActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // Handling Code
        if(equalPress==true) {
            TextField.setText("3");
            equalPress=false;
        }
        else {
            TextField.setText(TextField.getText()+"3");
        }
    }                                     

    private void FourActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // Hanglig code
        if(equalPress==true) {
            TextField.setText("4");
            equalPress=false;
        }
        else {
            TextField.setText(TextField.getText()+"4");
        }
    }                                    

    private void FiveActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // Handling code
        if(equalPress==true) {
            TextField.setText("5");
            equalPress=false;
        }
        else {
            TextField.setText(TextField.getText()+"5");
        }
    }                                    

    private void SixActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // Handling code
        if(equalPress==true) {
            TextField.setText("6");
            equalPress=false;
        }
        else {
            TextField.setText(TextField.getText()+"6");
        }
    }                                   

    private void SevenActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // Handling code
        if(equalPress==true) {
            TextField.setText("7");
            equalPress=false;
        }
        else {
            TextField.setText(TextField.getText()+"7");
        }
    }                                     

    private void EightActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // Handling code
        if(equalPress==true) {
            TextField.setText("8");
            equalPress=false;
        }
        else {
            TextField.setText(TextField.getText()+"8");
        }
    }                                     

    private void ZeroActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // Handling code
        if(equalPress==true) {
            TextField.setText("0");
            equalPress=false;
        }
        else {
            TextField.setText(TextField.getText()+"0");
        }
    }                                    

    private void EqualsActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // Handling code
        try{
          String text = TextField.getText();
          String firstNum, secondNum;
          long num1, num2;
          float num3, num4;
          if(text.contains("+")){
              firstNum = text.substring(0, text.indexOf("+"));
              secondNum = text.substring(text.indexOf("+")+1, text.length());
            
              num1 = (long)(Double.parseDouble(firstNum));
              num2 = (long)(Double.parseDouble(secondNum));
            
              TextField.setText(Long.toString(num1+num2));
          }else if(text.contains("-")){
              firstNum = text.substring(0,text.indexOf("-"));
              secondNum = text.substring(text.indexOf("-")+1, text.length());
              num1 = (long)(Double.parseDouble(firstNum));
              num2 = (long)(Double.parseDouble(secondNum));
              TextField.setText(Long.toString(num1-num2));
          }else if(text.contains("x")){
              firstNum = text.substring(0,text.indexOf("x"));
              secondNum = text.substring(text.indexOf("x")+1, text.length());
              num1 = (long)(Double.parseDouble(firstNum));
              num2 = (long)(Double.parseDouble(secondNum));
              TextField.setText(Long.toString(num1*num2));    
          }else if(text.contains("/")){
              firstNum = text.substring(0,text.indexOf("/"));
              secondNum = text.substring(text.indexOf("/")+1, text.length());
              num3 = (float)(Double.parseDouble(firstNum));
              num4 = (float)(Double.parseDouble(secondNum));
              TextField.setText(Float.toString(num3/num4));
          }else{}
          equalPress=true;
        
        }catch(ArithmeticException x){
            TextField.setText("Undefined");
        }catch(NumberFormatException x){
            TextField.setText("Incompatable");
        }
     }                                      

    private void AdditionActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Handling code
        TextField.setText(TextField.getText()+"+");
    }                                        

    private void SubtractionActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // Handling code
        TextField.setText(TextField.getText()+"-");
    }                                           

    private void MultiplicationActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // Handling code
        TextField.setText(TextField.getText()+"x");
    }                                              

    private void DivisionActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Handling code
        TextField.setText(TextField.getText()+"/");
    }                                                                  

    private void CActionPerformed(java.awt.event.ActionEvent evt) {                                  
        // Handling code
        TextField.setText("");
    }                                 

    private void PeriodActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // Handling code
        if(equalPress==true) {
            TextField.setText(".");
            equalPress=false;
        }
        else {
            TextField.setText(TextField.getText()+".");
        }
    }                                      

    private void BackSpaceActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // Handling code
        TextField.setText (TextField.getText ().substring (0, TextField.getText ().length () - 1));
    }                                         

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlaixCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaixCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaixCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaixCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaixCalc().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton Addition;
    private javax.swing.JButton BackSpace;
    private javax.swing.JButton C;
    private javax.swing.JButton Division;
    private javax.swing.JButton Eight;
    private javax.swing.JButton Equals;
    private javax.swing.JButton Five;
    private javax.swing.JButton Four;
    private javax.swing.JButton Multiplication;
    private javax.swing.JButton Nine;
    private javax.swing.JButton One;
    private javax.swing.JButton One1;
    private javax.swing.JButton Period;
    private javax.swing.JButton Seven;
    private javax.swing.JButton Six;
    private javax.swing.JButton Subtraction;
    private javax.swing.JTextField TextField;
    private javax.swing.JButton Three;
    private javax.swing.JButton Two;
    private javax.swing.JButton Zero;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
