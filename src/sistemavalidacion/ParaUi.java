package sistemavalidacion;

import java.awt.EventQueue;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JTextField;


public class ParaUi extends Vista {
	Controller controller=new Controller();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaUi frame = new ParaUi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ParaUi() {
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Respuesta validarCliente = controller.validarCliente(((JTextField)e.getSource()).getText());
				if(!validarCliente.resultad){
					System.out.println(validarCliente.comentario);
				}
			}

			
		});
	}
}
