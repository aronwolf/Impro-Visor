/**
 * This Java Class is part of the Impro-Visor Application.
 *
 * Copyright (C) 2015-2016 Robert Keller and Harvey Mudd College.
 *
 * Impro-Visor is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * Impro-Visor is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of merchantability or fitness
 * for a particular purpose. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Impro-Visor; if not, write to the Free Software Foundation, Inc., 51 Franklin
 * St, Fifth Floor, Boston, MA 02110-1301 USA
 */

package imp.trading;

import imp.gui.LickgenFrame;
import imp.gui.Notate;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JRadioButton;

/**
 *
 * @author Mikayla Konst
 */
public class PassiveTradingWindow extends javax.swing.JFrame {

    private final Notate notate;
    private final LickgenFrame lickgenFrame;
    
    /**
     * The numeric values of the bars to be traded.
     */
    private static final int tradingQuantum[] = {1, 2, 4, 8, 12, 16};
    
    /**
     * Creates new form PassiveTradingWindow
     */
    public PassiveTradingWindow(Notate notate) {
        this.notate = notate;
        lickgenFrame = notate.getLickgenFrame();
        initComponents();
        four.setSelected(true);
    }
    
    public boolean getImprovisorTradeFirst(){
        return improvisorFirst.isSelected();
    }
    
    public int getTradingQuantum(){
      Enumeration<AbstractButton> bars = numberOfBarsGroup.getElements();
      for(int i = 0; i < numberOfBarsGroup.getButtonCount(); i++){
          JRadioButton button = (JRadioButton) bars.nextElement();
          if(button.isSelected()){
              return tradingQuantum[i] * notate.getSlotsPerMeasure();
              //return ((Integer)wordToNumber.get(button.getText()))*score.getSlotsPerMeasure();
          }
      }
      
      return notate.getSlotsPerMeasure(); // default, should not get used
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        whoPlaysFirstGroup = new javax.swing.ButtonGroup();
        numberOfBarsGroup = new javax.swing.ButtonGroup();
        whoGoesFirstPanel = new javax.swing.JPanel();
        improvisorFirst = new javax.swing.JRadioButton();
        userFirst = new javax.swing.JRadioButton();
        switchToActiveTradingButton = new javax.swing.JButton();
        tradeLengthPanel = new javax.swing.JPanel();
        one = new javax.swing.JRadioButton();
        two = new javax.swing.JRadioButton();
        four = new javax.swing.JRadioButton();
        eight = new javax.swing.JRadioButton();
        twelve = new javax.swing.JRadioButton();
        sixteen = new javax.swing.JRadioButton();
        playbackControls = new javax.swing.JPanel();
        countToggle = new javax.swing.JCheckBox();
        startTradingButton = new javax.swing.JButton();
        generationGapSpinner = new javax.swing.JSpinner();
        mainTradeMenuBar = new javax.swing.JMenuBar();
        tradePlayMenu = new javax.swing.JMenu();
        tradePlayMenuItem = new javax.swing.JMenuItem();
        tradeStopMenuItem = new javax.swing.JMenuItem();

        setTitle("Impro-Visor Passive Trading");
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(25, 25, 400, 200));
        setMaximumSize(new java.awt.Dimension(400, 200));
        setMinimumSize(new java.awt.Dimension(400, 200));
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                passiveTradingClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt)
            {
                passiveTradingClosed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        whoGoesFirstPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        whoGoesFirstPanel.setToolTipText("Determines whether Impro-Visor or the user plays first.");
        whoGoesFirstPanel.setMinimumSize(new java.awt.Dimension(400, 75));
        whoGoesFirstPanel.setPreferredSize(new java.awt.Dimension(400, 75));
        whoGoesFirstPanel.setLayout(new java.awt.GridBagLayout());

        whoPlaysFirstGroup.add(improvisorFirst);
        improvisorFirst.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        improvisorFirst.setSelected(true);
        improvisorFirst.setText("Impro-Visor First");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        whoGoesFirstPanel.add(improvisorFirst, gridBagConstraints);

        whoPlaysFirstGroup.add(userFirst);
        userFirst.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        userFirst.setText("User First");
        userFirst.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                userFirstActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        whoGoesFirstPanel.add(userFirst, gridBagConstraints);

        switchToActiveTradingButton.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        switchToActiveTradingButton.setText("Stop and Switch to Active Trading");
        switchToActiveTradingButton.setToolTipText("Opens the Active Trading Menu");
        switchToActiveTradingButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                switchToActiveTradingHandler(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 0, 0);
        whoGoesFirstPanel.add(switchToActiveTradingButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.3;
        getContentPane().add(whoGoesFirstPanel, gridBagConstraints);

        tradeLengthPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Trade Length (in bars)"));
        tradeLengthPanel.setToolTipText("Controls the length of one player's melody.");
        tradeLengthPanel.setMinimumSize(new java.awt.Dimension(400, 75));
        tradeLengthPanel.setName(""); // NOI18N
        tradeLengthPanel.setPreferredSize(new java.awt.Dimension(400, 75));
        tradeLengthPanel.setLayout(new java.awt.GridBagLayout());

        numberOfBarsGroup.add(one);
        one.setSelected(true);
        one.setText("one");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        tradeLengthPanel.add(one, gridBagConstraints);

        numberOfBarsGroup.add(two);
        two.setText("two");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        tradeLengthPanel.add(two, gridBagConstraints);

        numberOfBarsGroup.add(four);
        four.setText("four");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        tradeLengthPanel.add(four, gridBagConstraints);

        numberOfBarsGroup.add(eight);
        eight.setText("eight");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        tradeLengthPanel.add(eight, gridBagConstraints);

        numberOfBarsGroup.add(twelve);
        twelve.setText("twelve");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        tradeLengthPanel.add(twelve, gridBagConstraints);

        numberOfBarsGroup.add(sixteen);
        sixteen.setText("sixteen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        tradeLengthPanel.add(sixteen, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.3;
        getContentPane().add(tradeLengthPanel, gridBagConstraints);

        playbackControls.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        playbackControls.setMinimumSize(new java.awt.Dimension(261, 50));
        playbackControls.setPreferredSize(new java.awt.Dimension(261, 50));
        playbackControls.setLayout(new java.awt.GridBagLayout());

        countToggle.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        countToggle.setText("Count");
        countToggle.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                countToggleActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        playbackControls.add(countToggle, gridBagConstraints);

        startTradingButton.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        startTradingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imp/gui/graphics/toolbar/play.gif"))); // NOI18N
        startTradingButton.setToolTipText("Start/Stop trading. You may also use the I and K keys for this.");
        startTradingButton.setLabel("Start Trading");
        startTradingButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                startTradingButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        playbackControls.add(startTradingButton, gridBagConstraints);

        generationGapSpinner.setModel(new javax.swing.SpinnerNumberModel(4.0d, -20.0d, 20.0d, 0.01d));
        generationGapSpinner.setToolTipText("Specifies the lead time, in beats, for generating next chorus before the end of the current chorus, if Recur is toggled on.");
        generationGapSpinner.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lead", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10))); // NOI18N
        generationGapSpinner.setInheritsPopupMenu(true);
        generationGapSpinner.setMaximumSize(new java.awt.Dimension(70, 45));
        generationGapSpinner.setMinimumSize(new java.awt.Dimension(70, 45));
        generationGapSpinner.setPreferredSize(new java.awt.Dimension(70, 45));
        generationGapSpinner.setValue(0.5);
        generationGapSpinner.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                generationGapSpinnergenerationLeadSpinnerChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 19, 0, 0);
        playbackControls.add(generationGapSpinner, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.4;
        getContentPane().add(playbackControls, gridBagConstraints);

        mainTradeMenuBar.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N

        tradePlayMenu.setText("Play");

        tradePlayMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, 0));
        tradePlayMenuItem.setText("Trade");
        tradePlayMenuItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tradePlayMenuItemActionPerformed(evt);
            }
        });
        tradePlayMenu.add(tradePlayMenuItem);

        tradeStopMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, 0));
        tradeStopMenuItem.setText("Stop");
        tradeStopMenuItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tradeStopMenuItemActionPerformed(evt);
            }
        });
        tradePlayMenu.add(tradeStopMenuItem);

        mainTradeMenuBar.add(tradePlayMenu);

        setJMenuBar(mainTradeMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFirstActionPerformed

    private void countToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countToggleActionPerformed
        notate.toggleCountIn();
    }//GEN-LAST:event_countToggleActionPerformed

    boolean trading = false;
    
    private void startTradingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTradingButtonActionPerformed
         toggleTrading();
    }//GEN-LAST:event_startTradingButtonActionPerformed

private void toggleTrading()
{
//notate.toggleImproviseButton(); To use this, notate would 
// have to change the buttons here to keep in sync
notate.remoteToggleImprovise();
if( trading )
  {
    tradingStopped();
    trading = false;
  }
else
  {
    tradingStarted();
    trading = true;
  }    
}

    private void generationGapSpinnergenerationLeadSpinnerChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_generationGapSpinnergenerationLeadSpinnerChanged
      System.out.println("lickgenFrame = " + lickgenFrame);
        lickgenFrame.setGap(Double.parseDouble(generationGapSpinner.getValue().toString()));
    }//GEN-LAST:event_generationGapSpinnergenerationLeadSpinnerChanged

    private void tradePlayMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tradePlayMenuItemActionPerformed
        toggleTrading();
    }//GEN-LAST:event_tradePlayMenuItemActionPerformed

    private void tradeStopMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tradeStopMenuItemActionPerformed
        toggleTrading();
    }//GEN-LAST:event_tradeStopMenuItemActionPerformed

    private void passiveTradingClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_passiveTradingClosed
        notate.setNotToTrade();
    }//GEN-LAST:event_passiveTradingClosed

    private void passiveTradingClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_passiveTradingClosing
         notate.setNotToTrade();
    }//GEN-LAST:event_passiveTradingClosing

    private void switchToActiveTradingHandler(java.awt.event.ActionEvent evt)//GEN-FIRST:event_switchToActiveTradingHandler
    {//GEN-HEADEREND:event_switchToActiveTradingHandler
        tradingStopped();
        trading = false;
        setVisible(false);
        notate.openActiveTradingWindow();
    }//GEN-LAST:event_switchToActiveTradingHandler
    
      public void tradingStarted() {
        startTradingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imp/gui/graphics/toolbar/stop.gif")));
        startTradingButton.setText("Stop Trading");
    }

    public void tradingStopped() {
        startTradingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imp/gui/graphics/toolbar/play.gif")));
        startTradingButton.setText("Start Trading");
    }
    
 public void setGenerationGap(double value)
  {
    generationGapSpinner.setValue(0.01 * (int) (100 * value));
  }

public double getGenerationGap()
  {
    return (Double) generationGapSpinner.getValue();
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox countToggle;
    private javax.swing.JRadioButton eight;
    private javax.swing.JRadioButton four;
    private javax.swing.JSpinner generationGapSpinner;
    private javax.swing.JRadioButton improvisorFirst;
    private javax.swing.JMenuBar mainTradeMenuBar;
    private javax.swing.ButtonGroup numberOfBarsGroup;
    private javax.swing.JRadioButton one;
    private javax.swing.JPanel playbackControls;
    private javax.swing.JRadioButton sixteen;
    private javax.swing.JButton startTradingButton;
    private javax.swing.JButton switchToActiveTradingButton;
    private javax.swing.JPanel tradeLengthPanel;
    private javax.swing.JMenu tradePlayMenu;
    private javax.swing.JMenuItem tradePlayMenuItem;
    private javax.swing.JMenuItem tradeStopMenuItem;
    private javax.swing.JRadioButton twelve;
    private javax.swing.JRadioButton two;
    private javax.swing.JRadioButton userFirst;
    private javax.swing.JPanel whoGoesFirstPanel;
    private javax.swing.ButtonGroup whoPlaysFirstGroup;
    // End of variables declaration//GEN-END:variables
}
