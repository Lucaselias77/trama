package visao.renderer;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fabio
 */
public class RendererCelula extends DefaultTableCellRenderer {
    public RendererCelula() {
        super();
    }

    @Override
    public Component getTableCellRendererComponent( JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column ) {

        JLabel label = ( JLabel ) super.getTableCellRendererComponent( table, value, isSelected, hasFocus, row, column );


        label.setHorizontalAlignment( JLabel.CENTER );
        label.setBackground( javax.swing.UIManager.getDefaults().getColor( "Button.highlight" ) );
        label.setOpaque( true );

        if ( value.equals( "0" ) ) {
            label.setText( "" );
        } else if ( value.equals( "1" ) ) {
            label.setText( "X" );
        } else if ( value.equals( "2" ) ) {
            label.setText( "X" );
            label.setBackground( javax.swing.UIManager.getDefaults().getColor( "CheckBox.shadow" ) );
        }
        return label;
    }
}
