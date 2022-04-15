package br.com.impacta.dal;

import java.util.Collection;

import br.com.impacta.classes.Funcionario;
import br.com.impacta.enumeracoes.Sexo;

public class FuncionariosDao extends Dao<Funcionario, String> {

	@Override
	public void incluir(Funcionario item) throws Exception{
		
		try {
			
			abrirConexao();
			
			String sql = "INSERT INTO TBFUNCIONARIOS(DOCUMENTO, NOME, IDADE," + 
					"SEXO, CARGO, SALARIO) VALUES (?,?,?,?,?,?)";
			
			stmt = cn.prepareStatement(sql);
			stmt.setString(1,item.getDocumento().getNumero());
			stmt.setString(2,item.getNome());
			stmt.setInt(3, item.getIdade());
			stmt.setString(4, item.getSexo() == Sexo.MASCULINO? "M": "F");
			stmt.setString(5, item.getCargo());
			stmt.setDouble(6, item.getSalario());
			
			stmt.executeUpdate();
			
			
		} catch (Exception e) {
			
			throw e;
			
		}finally {
			
			fecharConexao();
			
			
	}
}

	@Override
	public void buscar(String id) throws Exception {
		
		
	}

	@Override
	public Collection<Funcionario> listar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
