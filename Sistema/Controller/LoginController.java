package Sistema.Controller;

import java.io.IOException;
import java.util.List;

import Sistema.Model.*;

public class LoginController {
    public int login = 0;

    public int  validaLogin(String login, String senha) {
            try {
                List<Gerente> gerentes = (List<Gerente>) Serializador.ler("Sistema/DataBase/gerentes.dat");
                for (Gerente gerente : gerentes) {
                    if (gerente.getLogin().equals(login) && gerente.getSenha().equals(senha)) {
                        return 3;
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                List<Atendente> atendentes = (List<Atendente>) Serializador.ler("Sistema/DataBase/atendentes.dat");
                for (Atendente atendente : atendentes) {
                    if (atendente.getLogin().equals(login) && atendente.getSenha().equals(senha)) {
                        return 2;
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                List<Entregador> entregadores = (List<Entregador>) Serializador.ler("Sistema/DataBase/entregadores.dat");
                for (Entregador entregador : entregadores) {
                    if (entregador.getLogin().equals(login) && entregador.getSenha().equals(senha)) {
                        return 1;
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            return 0;
    }

}


