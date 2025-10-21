package tasks.StringBuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilderUndo text = new StringBuilderUndo();

        text.append("Hello");
        System.out.println("1. Добавляем: '" + text + "'");

        text.append(" world");
        System.out.println("2. Добавляем ещё: '" + text + "'");

        text.insert(5, " JAVA");
        System.out.println("3. Вставляем слово не в тему: '" + text + "'");

        text.delete(4, 10);
        System.out.println("4. Удаляем часть текста: '" + text + "'");

        text.undo();
        System.out.println("5. Восстановили после удаления: '" + text + "'");

    }
}
