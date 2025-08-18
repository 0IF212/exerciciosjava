import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.annotation.ElementType;

public class exercicio33 {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        MinhaClasseDeTeste classe = new MinhaClasseDeTeste();
        ExecutorDeTestes executor = new ExecutorDeTestes();
        executor.executarTestes(classe);
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface Teste {
    }

    public static class ExecutorDeTestes {
        public static void executarTestes(Object obj) throws IllegalAccessException, InvocationTargetException {
            Method[] metodos = obj.getClass().getDeclaredMethods();

            for (Method method : metodos) {
                if(method.isAnnotationPresent(Teste.class)) {
                    method.invoke(obj);
                }
            }
        }
    }

    public static class MinhaClasseDeTeste {
        @Teste
        public void testeSoma() {
            System.out.println("Executando testeSoma: SUCESSO");
        }

        public void metodoComum() {
            System.out.println("Este não é um teste.");
        }

        @Teste
        public void testeLogin() {
            System.out.println("Executando testeLogin: SUCESSO");
        }
    }

}
