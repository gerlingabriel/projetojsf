package br.com.projetojsf;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import Dao.DaoGeneric;
import model.Pessoa;
import model.Telefone;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void criarPessoa()
    {
        DaoGeneric<Pessoa> dao = new DaoGeneric<Pessoa>();
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Gabriel");
        pessoa.setEmail("teste@teste.com.br");
        pessoa.setSenha("123");
        
        Telefone telefone = new Telefone();
        telefone.setDdd((short)027);
        telefone.setNumero("9898-32147");
        telefone.setTipo("Residencial");
        
//        pessoa.setTelefones(List.of(telefone));
        
        dao.salvar(pessoa);
        
        System.out.println(pessoa);
    }
    
    @Test
    public void testeBuscarPorId()
    {
        DaoGeneric<Pessoa> dao = new DaoGeneric<Pessoa>();
        
        Pessoa pessoa = new Pessoa();
        pessoa.setId(4L);
        
        pessoa = dao.buscaPorID(pessoa);
        
        System.out.println(pessoa);
    }
    
    @Test
    public void testeDeletarPorId()
    {
        DaoGeneric<Pessoa> dao = new DaoGeneric<Pessoa>();
        
        Pessoa pessoa = new Pessoa();
        pessoa.setId(3L);
        
        pessoa = dao.buscaPorID(pessoa);
        
        dao.deletarPorId(pessoa);
    }
    
    @Test
    public void testeBuscarTodos()
    {
        DaoGeneric<Pessoa> dao = new DaoGeneric<Pessoa>();
        
        List<Pessoa> pessoas = dao.buscarTodos(Pessoa.class);
        
        pessoas.forEach(System.out::print);
    }
     
    
}
