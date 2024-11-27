package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelBotonesAgregar extends JPanel implements ActionListener
{
    /**
     * El comando utilizado para el botón que sirve para crear un nuevo restaurante
     */
    private static final String CREAR = "Crear restaurante";

    /**
     * El comando utilizado para el botón que sirve para cerrar la ventana sin crear un restaurante
     */
    private static final String CERRAR = "Cerrar";

    private JButton butNuevo;
    private JButton butCerrar;

    /**
     * La ventana principal de la aplicación
     */
    private VentanaAgregarRestaurante ventanaPrincipal;

    public PanelBotonesAgregar( VentanaAgregarRestaurante ventanaPrincipal )
    {
        this.ventanaPrincipal = ventanaPrincipal;

        setLayout( new FlowLayout( ) );

        // Agrega el botón para crear el restaurante
        // TODO completar
        butNuevo = new JButton(CREAR);
        butNuevo.setActionCommand(CREAR);
        butNuevo.addActionListener(this);
        add(butNuevo);

        // Agrga el boton para cerrar la ventana
        // TODO completar
        butCerrar = new JButton(CERRAR);
        butCerrar.setActionCommand(CERRAR);
        butCerrar.addActionListener(this);
        add(butCerrar);
    }

    @Override
    public void actionPerformed( ActionEvent e )
    {
        String comando = e.getActionCommand( );
        if( comando.equals( CREAR ) )
        {
            ventanaPrincipal.agregarRestaurante( );
        }
        else if( comando.equals( CERRAR ) )
        {
            ventanaPrincipal.cerrarVentana( );
        }
    }
}
