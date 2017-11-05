package pe.edu.tecsup.hibernate;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pe.edu.tecsup.hibernate.dao.CursoDAO;
import pe.edu.tecsup.hibernate.model.Curso;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CursoDAOTest {

    @Autowired
    CursoDAO cursoDAO;
    
@Test
    public void verifyList() {

        List<Curso> cursos = cursoDAO.list();
        for (Curso curso : cursos) {
             System.out.println(curso.getId());
              System.out.println(curso.getCodigo());
            System.out.println(curso.getNombre());
            System.out.println(curso.getFechaInicio());
            System.out.println(curso.getPrograma());
        }
        Assert.assertTrue(cursos.size() > 0);
    }
   
     @Test
    public void verifyFind() {
        Curso curso = cursoDAO.get(21l);
        System.out.println(curso.getNombre());
        Assert.assertTrue(curso.getId() == 21l);
    }
/*
    @Test
    public void verifySave() {

        Curso curso = new Curso();
        curso.setCodigo("1020");
        curso.setNombre("Curso Nuevo");

        cursoDAO.save(curso);
        Assert.assertTrue(curso.getId() != null);
    }
@Test
    public void verifyUpdate() {

        // cambiar el código para validar
        Curso curso = new Curso();
        curso.setId(51l);
        curso.setCodigo("001");
        curso.setNombre("Curso Modificado");

        cursoDAO.update(curso);
        Assert.assertTrue(cursoDAO.get(51l).getCodigo().equals("001"));
    }
    
   /*
@Test
    public void verifyDelete() {

        Curso curso = new Curso();
        curso.setId(80l);
        cursoDAO.delete(curso);

        Assert.assertTrue(cursoDAO.get(80l) == null);
    }
*/
}

