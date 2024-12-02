import java.lang.annotation.Annotation;

public class LeitorDeTabela {
    public static void main(String[] args) {
        Class<?> clazz = Usuario.class;

        if (clazz.isAnnotationPresent(Tabela.class)) {

            Tabela tabela = clazz.getAnnotation(Tabela.class);

            System.out.println("Nome da tabela: " + tabela.nome());
        } else {
            System.out.println("A classe " + clazz.getSimpleName() + " não possui a annotation @Tabela.");
        }
    }
}
