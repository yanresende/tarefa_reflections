import java.lang.annotation.Annotation;

public class ProcessadorDeTabela {
    public static void processarTabela(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tabela.nome());
        } else {
            System.out.println("A classe " + clazz.getSimpleName() + " não possui a annotation @Tabela.");
        }
    }

    public static void main(String[] args) {
        processarTabela(MinhaClasse.class);
    }
}
