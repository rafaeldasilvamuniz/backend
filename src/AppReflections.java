
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Rafael da Silva Muniz
 */
public class Tabela {

    public static void main(String args[]) {

       try {
        //Class clazz = Produto.class;
        System.out.println("**** Tabelas ****");

        Produto prod = new Produto();

            Field[] fields = prod.getClass().getDeclaredFields();
            for (Field field : fields) {
                //Class<?> type = field.getType();
                String nome = field.getName();
                String endereco = field.getEndereco();

                //System.out.println(type);
                System.out.println(nome);
                System.out.println(endereco);
            }

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
