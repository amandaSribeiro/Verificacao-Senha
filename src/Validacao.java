
import javax.swing.JOptionPane;

public class Validacao {

	public static void main(String[] args) {
		
		//CONVERTENDO A SENHA RECEBIDA EM STRING PARA INT
		int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha:"));
		
		//DEFININDO CONDIÇÕES
			if (senha == (1234)) {
				JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO!");
			} else
				JOptionPane.showMessageDialog(null, "ACESSO NEGADO!");
	}

}
