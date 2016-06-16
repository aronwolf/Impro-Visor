/**
 * This Java Class is part of the Impro-Visor Application
 *
 * Copyright (C) 2016 Robert Keller and Harvey Mudd College
 *
 * Impro-Visor is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * Impro-Visor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * merchantability or fitness for a particular purpose.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Impro-Visor; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package imp.gui;

/**
 *
 * @author keller
 */
public class QuantizationDialog extends javax.swing.JDialog
  {
  Notate notate;
    /**
     * Creates new form QuantizationDialog
     */
    public QuantizationDialog(Notate notate, boolean modal)
    {
        super(notate, modal);
        this.notate = notate;
        initComponents();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        noteNoneBox = new javax.swing.JCheckBox();
        tripletNoneBox = new javax.swing.JCheckBox();
        note04box = new javax.swing.JCheckBox();
        triplet04box = new javax.swing.JCheckBox();
        note08box = new javax.swing.JCheckBox();
        triplet08box = new javax.swing.JCheckBox();
        note16box = new javax.swing.JCheckBox();
        triplet16box = new javax.swing.JCheckBox();
        note32box = new javax.swing.JCheckBox();
        triplet32box = new javax.swing.JCheckBox();
        eighthNoteSwingBox = new javax.swing.JCheckBox();
        quantizeButton = new javax.swing.JButton();
        noAbsorbBox = new javax.swing.JCheckBox();
        absorbQuarterRestBox = new javax.swing.JCheckBox();
        absorbEighthRestBox = new javax.swing.JCheckBox();
        absorbSixteenthRestBox = new javax.swing.JCheckBox();
        absorbThirtySecondRestBox = new javax.swing.JCheckBox();
        noteQuantumTextField = new javax.swing.JTextField();
        tripletQuantumTextField = new javax.swing.JTextField();

        setTitle("Quantize Chorus");
        setBounds(new java.awt.Rectangle(650, 25, 0, 0));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        noteNoneBox.setText("None");
        noteNoneBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                noteNoneBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(noteNoneBox, gridBagConstraints);

        tripletNoneBox.setText("No Triplet");
        tripletNoneBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tripletNoneBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(tripletNoneBox, gridBagConstraints);

        note04box.setSelected(true);
        note04box.setText("Quarter-Note");
        note04box.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                note04boxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(note04box, gridBagConstraints);

        triplet04box.setSelected(true);
        triplet04box.setText("Quarter-Note Triplet");
        triplet04box.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                triplet04boxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(triplet04box, gridBagConstraints);

        note08box.setSelected(true);
        note08box.setText("Eighth-Note");
        note08box.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                note08boxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(note08box, gridBagConstraints);

        triplet08box.setSelected(true);
        triplet08box.setText("Eighth-Note Triplet");
        triplet08box.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                triplet08boxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(triplet08box, gridBagConstraints);

        note16box.setText("Sixteenth-Note");
        note16box.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                note16boxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(note16box, gridBagConstraints);

        triplet16box.setText("Sixteenth-Note Triplet");
        triplet16box.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                triplet16boxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(triplet16box, gridBagConstraints);

        note32box.setText("Thirty-Second-Note");
        note32box.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                note32boxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(note32box, gridBagConstraints);

        triplet32box.setText("Thirty-Second Triplet");
        triplet32box.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                triplet32boxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(triplet32box, gridBagConstraints);

        eighthNoteSwingBox.setText("Swing Eighth-Notes");
        eighthNoteSwingBox.setToolTipText("");
        eighthNoteSwingBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                eighthNoteSwingBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        getContentPane().add(eighthNoteSwingBox, gridBagConstraints);

        quantizeButton.setText("Quantize");
        quantizeButton.setContentAreaFilled(false);
        quantizeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                quantizeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        getContentPane().add(quantizeButton, gridBagConstraints);

        noAbsorbBox.setText("No Rest Absorption");
        noAbsorbBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                noAbsorbBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(noAbsorbBox, gridBagConstraints);

        absorbQuarterRestBox.setText("Absorb Quarter Rests");
        absorbQuarterRestBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                absorbQuarterRestBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(absorbQuarterRestBox, gridBagConstraints);

        absorbEighthRestBox.setLabel("Absorb Eighth Rests");
        absorbEighthRestBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                absorbEighthRestBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(absorbEighthRestBox, gridBagConstraints);

        absorbSixteenthRestBox.setLabel("Absorb Sixteenth Rests");
        absorbSixteenthRestBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                absorbSixteenthRestBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(absorbSixteenthRestBox, gridBagConstraints);

        absorbThirtySecondRestBox.setSelected(true);
        absorbThirtySecondRestBox.setLabel("Absorb Thirty-Second Rests");
        absorbThirtySecondRestBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                absorbThirtySecondRestBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(absorbThirtySecondRestBox, gridBagConstraints);

        noteQuantumTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        noteQuantumTextField.setText("60");
        noteQuantumTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Quantum in Slots", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 11))); // NOI18N
        noteQuantumTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                noteQuantumTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        getContentPane().add(noteQuantumTextField, gridBagConstraints);

        tripletQuantumTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tripletQuantumTextField.setText("40");
        tripletQuantumTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Second Quantum in Slots", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 11))); // NOI18N
        tripletQuantumTextField.setFocusTraversalKeysEnabled(false);
        tripletQuantumTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tripletQuantumTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        getContentPane().add(tripletQuantumTextField, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static final int 
            MAXIMUM_QUANTUM = 480,
            QUARTER_NOTE_QUANTUM = 120,
            QUARTER_NOTE_TRIPLET_QUANTUM = 80,
            EIGHTH_NOTE_QUANTUM = 60,
            EIGHTH_NOTE_TRIPLET_QUANTUM = 40,
            SIXTEENTH_NOTE_QUANTUM = 30,
            SIXTEENTH_NOTE_TRIPLET_QUANTUM = 20,
            THIRTYSECOND_NOTE_QUANTUM = 15,
            THIRTYSECOND_NOTE_TRIPLET_QUANTUM = 10,
            MINIMUM_QUANTUM = 1;
    
    public static final int
            NOTE_INDEX = 0,
            TRIPLET_INDEX = 1;
    
    private final int quantum[] = {EIGHTH_NOTE_QUANTUM, EIGHTH_NOTE_TRIPLET_QUANTUM};
    private int restAbsorption = THIRTYSECOND_NOTE_QUANTUM;
    
    public int[] getQuanta()
    {
    int result[] = {
            Notate.intFromTextField(noteQuantumTextField, 
                                    MINIMUM_QUANTUM, 
                                    MAXIMUM_QUANTUM, 
                                    MINIMUM_QUANTUM),
            Notate.intFromTextField(tripletQuantumTextField, 
                                    MINIMUM_QUANTUM, 
                                    MAXIMUM_QUANTUM, 
                                    MINIMUM_QUANTUM)
                    };
    return result;
    }
    
    public int getRestAbsorption()
    {
        return restAbsorption;
    }
    
    private void setNoteQuantizationBoxesOn(int level)
    {
        noteNoneBox.setSelected(false);
        switch( level )
          {
            case THIRTYSECOND_NOTE_QUANTUM:
                note32box.setSelected(true);
                note16box.setSelected(true);
                note08box.setSelected(true);
                note04box.setSelected(true);
                break;
           case SIXTEENTH_NOTE_QUANTUM:
                note32box.setSelected(false);
                note16box.setSelected(true);
                note08box.setSelected(true);
                note04box.setSelected(true);
                break;
            case EIGHTH_NOTE_QUANTUM:
                note32box.setSelected(false);
                note16box.setSelected(false);
                note08box.setSelected(true);
                note04box.setSelected(true);
                break;
            case QUARTER_NOTE_QUANTUM:
                note32box.setSelected(false);
                note16box.setSelected(false);
                note08box.setSelected(false);
                note04box.setSelected(true);                          
                break;
          }
        if( tripletNoneBox.isSelected() )
          {
            setQuantization(TRIPLET_INDEX, level);
          }
    }
 
 private void setTripletQuantizationBoxesOn(int level)
    {
       tripletNoneBox.setSelected(false);
       switch( level )
          {
            case THIRTYSECOND_NOTE_TRIPLET_QUANTUM:
                triplet32box.setSelected(true);
                triplet16box.setSelected(true);
                triplet08box.setSelected(true);
                triplet04box.setSelected(true);
                break;
           case SIXTEENTH_NOTE_TRIPLET_QUANTUM:
                triplet32box.setSelected(false);
                triplet16box.setSelected(true);
                triplet08box.setSelected(true);
                triplet04box.setSelected(true);
                break;
            case EIGHTH_NOTE_TRIPLET_QUANTUM:
                triplet32box.setSelected(false);
                triplet16box.setSelected(false);
                triplet08box.setSelected(true);
                triplet04box.setSelected(true);
                break;
            case QUARTER_NOTE_TRIPLET_QUANTUM:
                triplet32box.setSelected(false);
                triplet16box.setSelected(false);
                triplet08box.setSelected(false);
                triplet04box.setSelected(true);
                break;
          }
        if( noteNoneBox.isSelected() )
          {
            setQuantization(NOTE_INDEX, level);
          }
    }
        
    private void setNoteQuantizationBoxesOff(int level)
    {
         // Note that most cases intentionally fall through to the next.
       switch( level )
          {
            case THIRTYSECOND_NOTE_QUANTUM:
                note32box.setSelected(false);
                note16box.setSelected(true);
                note08box.setSelected(true);
                note04box.setSelected(true);
                if( tripletNoneBox.isSelected() )
                  {
                  setQuantization(TRIPLET_INDEX, SIXTEENTH_NOTE_QUANTUM);
                  }
                break;
           case SIXTEENTH_NOTE_QUANTUM:
                note32box.setSelected(false);
                note16box.setSelected(false);
                note08box.setSelected(true);
                note04box.setSelected(true);
                if( tripletNoneBox.isSelected() )
                  {
                  setQuantization(TRIPLET_INDEX, EIGHTH_NOTE_QUANTUM);
                  }
                break;
            case EIGHTH_NOTE_QUANTUM:
                note32box.setSelected(false);
                note16box.setSelected(false);
                note08box.setSelected(false);
                note04box.setSelected(true);
                if( tripletNoneBox.isSelected() )
                  {
                  setQuantization(TRIPLET_INDEX, QUARTER_NOTE_QUANTUM);
                  }
                break;
            case QUARTER_NOTE_QUANTUM:
                note32box.setSelected(false);
                note16box.setSelected(false);
                note08box.setSelected(false);
                note04box.setSelected(false);                  
                noteNoneBox.setSelected(true);
                if( tripletNoneBox.isSelected() )
                  {
                  unsetQuantization(TRIPLET_INDEX);
                  }
                break;
          }
    }
 
private void setTripletQuantizationBoxesOff(int level)
    {
         // Note that most cases intentionally fall through to the next.
       switch( level )
           {
            case THIRTYSECOND_NOTE_TRIPLET_QUANTUM:
                triplet32box.setSelected(false);
                triplet16box.setSelected(true);
                triplet08box.setSelected(true);
                triplet04box.setSelected(true);
                if( noteNoneBox.isSelected() )
                  {
                  setQuantization(NOTE_INDEX, SIXTEENTH_NOTE_TRIPLET_QUANTUM);
                  }
                 break;
           case SIXTEENTH_NOTE_TRIPLET_QUANTUM:
                triplet32box.setSelected(false);
                triplet16box.setSelected(false);
                triplet08box.setSelected(true);
                triplet04box.setSelected(true);
                if( noteNoneBox.isSelected() )
                  {
                  setQuantization(NOTE_INDEX, EIGHTH_NOTE_TRIPLET_QUANTUM);
                  }
                 break;
            case EIGHTH_NOTE_TRIPLET_QUANTUM:
                triplet32box.setSelected(false);
                triplet16box.setSelected(false);
                triplet08box.setSelected(false);
                triplet04box.setSelected(true);
            if( noteNoneBox.isSelected() )
                  {
                  setQuantization(NOTE_INDEX, QUARTER_NOTE_TRIPLET_QUANTUM);
                  }
                break;
            case QUARTER_NOTE_TRIPLET_QUANTUM:
                triplet32box.setSelected(false);
                triplet16box.setSelected(false);
                triplet08box.setSelected(false);
                triplet04box.setSelected(false);                  
                tripletNoneBox.setSelected(true);
                if( noteNoneBox.isSelected() )
                  {
                  unsetQuantization(NOTE_INDEX);
                  }
                break;
          }
    }
        
private void setAbsorbRestBoxesOn(int level)
    {
        // Note that most cases intentionally fall through to the next.
        switch( level )
          {
            case QUARTER_NOTE_QUANTUM:
                absorbQuarterRestBox.setSelected(true);
            case EIGHTH_NOTE_QUANTUM:
                absorbEighthRestBox.setSelected(true);
             case SIXTEENTH_NOTE_QUANTUM:
                absorbSixteenthRestBox.setSelected(true);
            case THIRTYSECOND_NOTE_QUANTUM:
                absorbThirtySecondRestBox.setSelected(true);

                noAbsorbBox.setSelected(false);                
          }
    }

private void setAbsorbRestBoxesOff()
    {
                noAbsorbBox.setSelected(true);
                absorbThirtySecondRestBox.setSelected(false);
                absorbSixteenthRestBox.setSelected(false);
                absorbEighthRestBox.setSelected(false);
                absorbQuarterRestBox.setSelected(false);  
                
                restAbsorption = MINIMUM_QUANTUM;
    }

private void setQuantization(int index, int value)
{
    //System.out.println("setQuantization(" + index + ", " + value + ")");
    javax.swing.JTextField field[] = {noteQuantumTextField, tripletQuantumTextField};
    
    quantum[index] = value;
    field[index].setText("" + value);
}

private void unsetQuantization(int index)
{
    //System.out.println("sunetQuantization(" + index + ")");
    javax.swing.JTextField field[] = {noteQuantumTextField, tripletQuantumTextField};
    
    switch( index )
      {
        case NOTE_INDEX: quantum[NOTE_INDEX] = quantum[TRIPLET_INDEX];
        break;
        
        case TRIPLET_INDEX: quantum[TRIPLET_INDEX] = quantum[NOTE_INDEX];
        break;
      }
    field[index].setText("1");
}
        
    private void noteNoneBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_noteNoneBoxActionPerformed
    {//GEN-HEADEREND:event_noteNoneBoxActionPerformed
    if( noteNoneBox.isSelected() )
      {
        unsetQuantization(NOTE_INDEX);
        if( tripletNoneBox.isSelected() )
          {
            unsetQuantization(TRIPLET_INDEX);
          }
        else
          {
            setQuantization(NOTE_INDEX, quantum[TRIPLET_INDEX]);
          }
        note32box.setSelected(false);
        note16box.setSelected(false);
        note08box.setSelected(false);
        note04box.setSelected(false);
      }
    }//GEN-LAST:event_noteNoneBoxActionPerformed

    private void tripletNoneBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tripletNoneBoxActionPerformed
    {//GEN-HEADEREND:event_tripletNoneBoxActionPerformed
    if( tripletNoneBox.isSelected() )
      {
        unsetQuantization(TRIPLET_INDEX);
        if( noteNoneBox.isSelected() )
          {
            unsetQuantization(NOTE_INDEX);
          }
        else
          {
            setQuantization(TRIPLET_INDEX, quantum[NOTE_INDEX]);
          }
        triplet32box.setSelected(false);
        triplet16box.setSelected(false);
        triplet08box.setSelected(false);
        triplet04box.setSelected(false);
      }
    }//GEN-LAST:event_tripletNoneBoxActionPerformed

    private void note04boxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_note04boxActionPerformed
    {//GEN-HEADEREND:event_note04boxActionPerformed
        if( note04box.isSelected() )
          {
            setQuantization(NOTE_INDEX, QUARTER_NOTE_QUANTUM);
            setNoteQuantizationBoxesOn(QUARTER_NOTE_QUANTUM);
          }
        else
          {
             setNoteQuantizationBoxesOff(QUARTER_NOTE_QUANTUM);
             unsetQuantization(NOTE_INDEX);
          }
    }//GEN-LAST:event_note04boxActionPerformed

    private void triplet04boxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_triplet04boxActionPerformed
    {//GEN-HEADEREND:event_triplet04boxActionPerformed
        if( triplet04box.isSelected() )
          {
            setQuantization(TRIPLET_INDEX, QUARTER_NOTE_TRIPLET_QUANTUM); 
            setTripletQuantizationBoxesOn(QUARTER_NOTE_TRIPLET_QUANTUM);
          }
        else
          {
            setTripletQuantizationBoxesOff(QUARTER_NOTE_TRIPLET_QUANTUM);
            unsetQuantization(TRIPLET_INDEX);
         }
    }//GEN-LAST:event_triplet04boxActionPerformed

    private void note08boxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_note08boxActionPerformed
    {//GEN-HEADEREND:event_note08boxActionPerformed
        if( note08box.isSelected() )
          {
            setQuantization(NOTE_INDEX, EIGHTH_NOTE_QUANTUM);
            setNoteQuantizationBoxesOn(EIGHTH_NOTE_QUANTUM);
         }
        else
          {
             setNoteQuantizationBoxesOff(EIGHTH_NOTE_QUANTUM);
             setQuantization(NOTE_INDEX, QUARTER_NOTE_QUANTUM);
           }
    }//GEN-LAST:event_note08boxActionPerformed

    private void triplet08boxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_triplet08boxActionPerformed
    {//GEN-HEADEREND:event_triplet08boxActionPerformed
       if( triplet08box.isSelected() )
          {
            setQuantization(TRIPLET_INDEX, EIGHTH_NOTE_TRIPLET_QUANTUM);
            setTripletQuantizationBoxesOn(EIGHTH_NOTE_TRIPLET_QUANTUM);
         }
        else
          {
            setTripletQuantizationBoxesOff(EIGHTH_NOTE_TRIPLET_QUANTUM);
            setQuantization(TRIPLET_INDEX, QUARTER_NOTE_TRIPLET_QUANTUM);
          }
    }//GEN-LAST:event_triplet08boxActionPerformed

    private void note16boxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_note16boxActionPerformed
    {//GEN-HEADEREND:event_note16boxActionPerformed
        if( note16box.isSelected() )
          {
            setQuantization(NOTE_INDEX, SIXTEENTH_NOTE_QUANTUM);
            setNoteQuantizationBoxesOn(SIXTEENTH_NOTE_QUANTUM);
          }
        else
          {
            setNoteQuantizationBoxesOff(SIXTEENTH_NOTE_QUANTUM);
            setQuantization(NOTE_INDEX, EIGHTH_NOTE_QUANTUM);
          }
    }//GEN-LAST:event_note16boxActionPerformed

    private void triplet16boxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_triplet16boxActionPerformed
    {//GEN-HEADEREND:event_triplet16boxActionPerformed
        if( triplet16box.isSelected() )
          {            
            setQuantization(TRIPLET_INDEX, SIXTEENTH_NOTE_TRIPLET_QUANTUM);
            setTripletQuantizationBoxesOn(SIXTEENTH_NOTE_TRIPLET_QUANTUM);
         }
        else
          {
            setTripletQuantizationBoxesOff(SIXTEENTH_NOTE_TRIPLET_QUANTUM);
            setQuantization(TRIPLET_INDEX, EIGHTH_NOTE_TRIPLET_QUANTUM);
          }
    }//GEN-LAST:event_triplet16boxActionPerformed

    private void note32boxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_note32boxActionPerformed
    {//GEN-HEADEREND:event_note32boxActionPerformed
         if( note32box.isSelected() )
          {
            setQuantization(NOTE_INDEX, THIRTYSECOND_NOTE_QUANTUM);
            setNoteQuantizationBoxesOn(THIRTYSECOND_NOTE_QUANTUM);
          }
          else
          {
            setNoteQuantizationBoxesOff(THIRTYSECOND_NOTE_QUANTUM);
            setQuantization(NOTE_INDEX, SIXTEENTH_NOTE_QUANTUM);
          }
    }//GEN-LAST:event_note32boxActionPerformed

    private void triplet32boxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_triplet32boxActionPerformed
    {//GEN-HEADEREND:event_triplet32boxActionPerformed
         if( triplet32box.isSelected() )
           {
            setQuantization(TRIPLET_INDEX, THIRTYSECOND_NOTE_TRIPLET_QUANTUM);
            setTripletQuantizationBoxesOn(quantum[TRIPLET_INDEX]);
           }
         else
          {
            setTripletQuantizationBoxesOff(quantum[TRIPLET_INDEX]);
            setQuantization(TRIPLET_INDEX, SIXTEENTH_NOTE_TRIPLET_QUANTUM);
          }
    }//GEN-LAST:event_triplet32boxActionPerformed

    private void eighthNoteSwingBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_eighthNoteSwingBoxActionPerformed
    {//GEN-HEADEREND:event_eighthNoteSwingBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eighthNoteSwingBoxActionPerformed

    private void quantizeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_quantizeButtonActionPerformed
    {//GEN-HEADEREND:event_quantizeButtonActionPerformed
        notate.newQuantize(eighthNoteSwingBox.isSelected());
    }//GEN-LAST:event_quantizeButtonActionPerformed

    private void noAbsorbBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_noAbsorbBoxActionPerformed
    {//GEN-HEADEREND:event_noAbsorbBoxActionPerformed
            absorbThirtySecondRestBox.setSelected(false);
            absorbSixteenthRestBox.setSelected(false);
            absorbEighthRestBox.setSelected(false);
            absorbQuarterRestBox.setSelected(false);
            restAbsorption = MINIMUM_QUANTUM;
    }//GEN-LAST:event_noAbsorbBoxActionPerformed

    private void absorbQuarterRestBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_absorbQuarterRestBoxActionPerformed
    {//GEN-HEADEREND:event_absorbQuarterRestBoxActionPerformed
    if( absorbQuarterRestBox.isSelected() )
          {
            restAbsorption = QUARTER_NOTE_QUANTUM;
            setAbsorbRestBoxesOn(restAbsorption);
          }
         else
         {
            setAbsorbRestBoxesOff();
          }
    }//GEN-LAST:event_absorbQuarterRestBoxActionPerformed

    private void absorbEighthRestBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_absorbEighthRestBoxActionPerformed
    {//GEN-HEADEREND:event_absorbEighthRestBoxActionPerformed
    if( absorbEighthRestBox.isSelected() )
          {
            restAbsorption = EIGHTH_NOTE_QUANTUM;
            setAbsorbRestBoxesOn(restAbsorption);
          }
         else
         {
            setAbsorbRestBoxesOff();
         }
    }//GEN-LAST:event_absorbEighthRestBoxActionPerformed

    private void absorbSixteenthRestBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_absorbSixteenthRestBoxActionPerformed
    {//GEN-HEADEREND:event_absorbSixteenthRestBoxActionPerformed
    if( absorbSixteenthRestBox.isSelected() )
          {
            restAbsorption = SIXTEENTH_NOTE_QUANTUM;
            setAbsorbRestBoxesOn(restAbsorption);
          }
         else
         {
            setAbsorbRestBoxesOff();
         }
    }//GEN-LAST:event_absorbSixteenthRestBoxActionPerformed

    private void absorbThirtySecondRestBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_absorbThirtySecondRestBoxActionPerformed
    {//GEN-HEADEREND:event_absorbThirtySecondRestBoxActionPerformed
    if( absorbThirtySecondRestBox.isSelected() )
          {
            restAbsorption = THIRTYSECOND_NOTE_QUANTUM;
            setAbsorbRestBoxesOn(restAbsorption);
          }
         else
         {
           setAbsorbRestBoxesOff();           
         }
    }//GEN-LAST:event_absorbThirtySecondRestBoxActionPerformed

    private void noteQuantumTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_noteQuantumTextFieldActionPerformed
    {//GEN-HEADEREND:event_noteQuantumTextFieldActionPerformed
    setQuantization(NOTE_INDEX, Notate.intFromTextField(noteQuantumTextField, MINIMUM_QUANTUM, MAXIMUM_QUANTUM, MINIMUM_QUANTUM));
    }//GEN-LAST:event_noteQuantumTextFieldActionPerformed

    private void tripletQuantumTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tripletQuantumTextFieldActionPerformed
    {//GEN-HEADEREND:event_tripletQuantumTextFieldActionPerformed
    setQuantization(TRIPLET_INDEX, Notate.intFromTextField(tripletQuantumTextField, MINIMUM_QUANTUM, MAXIMUM_QUANTUM, MINIMUM_QUANTUM));
    }//GEN-LAST:event_tripletQuantumTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox absorbEighthRestBox;
    private javax.swing.JCheckBox absorbQuarterRestBox;
    private javax.swing.JCheckBox absorbSixteenthRestBox;
    private javax.swing.JCheckBox absorbThirtySecondRestBox;
    private javax.swing.JCheckBox eighthNoteSwingBox;
    private javax.swing.JCheckBox noAbsorbBox;
    private javax.swing.JCheckBox note04box;
    private javax.swing.JCheckBox note08box;
    private javax.swing.JCheckBox note16box;
    private javax.swing.JCheckBox note32box;
    private javax.swing.JCheckBox noteNoneBox;
    private javax.swing.JTextField noteQuantumTextField;
    private javax.swing.JButton quantizeButton;
    private javax.swing.JCheckBox triplet04box;
    private javax.swing.JCheckBox triplet08box;
    private javax.swing.JCheckBox triplet16box;
    private javax.swing.JCheckBox triplet32box;
    private javax.swing.JCheckBox tripletNoneBox;
    private javax.swing.JTextField tripletQuantumTextField;
    // End of variables declaration//GEN-END:variables
  }
