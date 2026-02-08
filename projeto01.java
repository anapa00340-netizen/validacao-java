import java.util.Scanner;
public class projeto01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        String nome, email, cpf; // o cpf tem q ser String por causa do metodo length
      
        boolean entrada;
        boolean emailValido;
        boolean cpfValido;
        String nomePessoa[] = new String[100];
        String emailPessoa[] = new String[100];
        String cpfPessoa[] = new String[100];
        int contPessoa = 0;

        // 1. Validação do Nome (Apenas letras e espaços, min 3 caracteres)
        for (contPessoa = 0; contPessoa <= 99; contPessoa++) {
        do {
            System.out.print("Digite seu nome: ou 'FIM' para finalizar! ");
            nomePessoa[contPessoa] = scanner.nextLine();
            if (nomePessoa[contPessoa].equalsIgnoreCase("FIM")) {
				break;
            }
            if (nomePessoa[contPessoa].matches("[a-zA-Z ]*")) { // serve para verificar se o texto inteiro digitado pelo usuário segue exatamente um padrão definido por você
                System.out.println("Nome válido! ");
                entrada = true;
            } else {
            	System.out.println("Nome inválido, use apenas letras! c");
            	entrada = false;
            }
        } while (entrada == false);
        if (nomePessoa[contPessoa].equalsIgnoreCase("FIM")) {
			break;
        }

        // 2. Validação do Email (Regex padrão)
        
        	
        	
        	do {
        		System.out.print("Digite seu e-mail:  ");
        		emailPessoa[contPessoa] = scanner.nextLine();
        		
        		
        		//  método contains() verifica se um pedaço de texto existe em qualquer lugar da String
        		// O método startsWith() verifica se a String inicia exatamente com os caracteres que eu defini 
        		// andsWith verifica se termina com o caracter que eu defini
        		
        		if (emailPessoa[contPessoa].contains("@") && emailPessoa[contPessoa].contains(".com") 
        				&& !emailPessoa[contPessoa].startsWith("@") && !emailPessoa[contPessoa].startsWith(".com")
        				&& !emailPessoa[contPessoa].endsWith("@") && !emailPessoa[contPessoa].endsWith(".com")) {
        			System.out.println("Formato de e-mail válido!");
        			emailValido = true;
        		} else {
        			System.out.println("Formato de email inválido! Digite novamente!");
        			emailValido = false;
        		}
        	} while (!emailValido);
        	do {
        		System.out.println("Digite os números do seu CPF: ");
        		cpfPessoa[contPessoa] = scanner.nextLine();
        		
        		// Usamos o && para as duas condições serem verdadeiras ao mesmo tempo
        		if (cpfPessoa[contPessoa].matches("[0-9]+") && cpfPessoa[contPessoa].length() == 11) {
        			System.out.println("CPF válido e com a quantidade correta!");
        			cpfValido = true;
        		} else {
        			System.out.println("CPF inválido! Certifique-se de usar apenas 11 números.");
        			cpfValido = false;
        		}
        	} while (!cpfValido);
        	 if (nomePessoa[contPessoa].equalsIgnoreCase("FIM")) {
 				break;
             }
        	
        }
        System.out.println("*******************RELATÓRIO*********************");
        System.out.println("Nome:                                 Email:                              CPF: " );                
        for (int i = 0; i < contPessoa; i++) {
			System.out.println(nomePessoa[i] + "             " + emailPessoa[i] +  "             " + cpfPessoa[i]);
		

	}
        
        
	}

}
