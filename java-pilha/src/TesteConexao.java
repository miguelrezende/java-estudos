
public class TesteConexao {

	public static void main(String[] args) {
		
		
		try(Conexao con = new Conexao()){
			con.leDados();
		} catch (IllegalStateException e ) {
			System.out.println("Deu erro");
		}
		
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException e) {
//			System.out.println("Problema na conexão");
//		} finally {
//			con.fecha();
//		}

	}

}
