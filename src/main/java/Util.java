public class Util {

    public static boolean inDataIsTrue(String in){

        //        проверка на корректность введенных данных
        if (!in.equals("колбаса") && !in.equals("собака")){
            System.out.println("Введенные данные не корректные!");
            System.out.println("Введите собака или колбаса.");
            return false;
        }
        return true;
    }

}
