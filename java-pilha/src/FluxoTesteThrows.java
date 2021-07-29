
public class FluxoTesteThrows {
	
	public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        }
        catch (Exception /*ArithmeticException | NullPointerException | ExceptionTeste*/ ex) {
        	System.out.println(ex.getMessage());
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws ExceptionTeste{
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }
    
    

    private static void metodo2() throws ExceptionTeste {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            throw new ExceptionTeste("Deu bosta");
        }
        System.out.println("Fim do metodo2");
    }
}
