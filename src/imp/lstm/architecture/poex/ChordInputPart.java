/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imp.lstm.architecture.poex;

import mikera.vectorz.AVector;
import imp.lstm.utilities.NNUtilities;

/**
 *
 * @author cssummer16
 */
public class ChordInputPart extends RelativeInputPart {

    @Override
    public AVector generate(int relativePosition, int chordRoot, AVector chordTypeData) {
        int distance = chordRoot - relativePosition;
        return NNUtilities.roll(chordTypeData, distance);
    }
    
}
