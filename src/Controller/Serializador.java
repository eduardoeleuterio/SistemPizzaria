package Controller;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Serializador {

    public static void gravar(String nome_arquivo, Object objeto) throws IOException, ClassNotFoundException {
        List<Object> objetosAntigos = new ArrayList<>();

        File arquivoExistente = new File(nome_arquivo);
        if (arquivoExistente.exists()) {
            objetosAntigos = ler(nome_arquivo);
        }

        objetosAntigos.add(objeto);

        FileOutputStream arquivo = new FileOutputStream(nome_arquivo);
        ObjectOutputStream gravador = new ObjectOutputStream(arquivo);
        gravador.writeObject(objetosAntigos);
        gravador.close();
        arquivo.close();
    }

    @SuppressWarnings("unchecked")
    public static List<Object> ler(String nome_arquivo) throws IOException, ClassNotFoundException {
        FileInputStream arquivo = new FileInputStream(nome_arquivo);
        ObjectInputStream restaurador = new ObjectInputStream(arquivo);
        List<Object> objetos = (List<Object>) restaurador.readObject();
        restaurador.close();
        arquivo.close();
        return objetos;
    }

}