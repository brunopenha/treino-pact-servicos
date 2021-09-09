package br.nom.penha.bruno.treino.pact.taskbackend.pact.provider;

import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junitsupport.Provider;
import au.com.dius.pact.provider.junitsupport.State;
import au.com.dius.pact.provider.junitsupport.loader.PactFolder;
import au.com.dius.pact.provider.junitsupport.target.Target;
import au.com.dius.pact.provider.junitsupport.target.TestTarget;
import br.nom.penha.bruno.treino.pact.taskbackend.TaskBackendApplication;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;

@RunWith(PactRunner.class)
@Provider("Tarefas")
@PactFolder("pact_json")
public class ProvedorTarefasTest {

    @TestTarget
    public final Target alvo = new HttpTarget("localhost",8000);

    @BeforeClass
    public static void inicializacao(){
        // Inicializo o Springboot
        SpringApplication.run(TaskBackendApplication.class);
    }

    @State("Existe uma tarefa com o id = 1")
    public void povoarTarefa1NoProvedor(){
        //
        // Executaria um script SQL para inserir essa tarefa
        // Acessaria a API REST para inserir...

    }

}
