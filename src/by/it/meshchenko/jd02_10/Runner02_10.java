package by.it.meshchenko.jd02_10;

public class Runner02_10 {
    public static void main(String[] args) {
        // А.
        //  Выполните экспорт (маршаллизацию) произвольного тестового POJO-класса в
        // формат JSON с применением библиотеки GSON.
        //  Выполните импорт (демаршаллизацию)произвольного тестового класса из формата
        // JSON в POJO с применением библиотеки GSON.
        // B.
        //  Выполните трансляцию из формата XML (JAXB через класс POJO) в формат JSON
        // с применением библиотеки GSON.
        //  Выполните обратное преобразование.
        //  Добейтесь идентичности исходного и полученного XML-файлов.
        //  (используйте свой XML-файл из предыдущих заданий).
        // C.
        //  Разработайте набор классов преобразователей форматов по произвольному
        // POJO-классу.
        //  Имя абстрактного конвертера AbstractConverter<T>.
        //  Фабрика ConverterFactory создает релизацию конвертера в зависимости от
        // enum Direction{XML_TO_JSON, JSON_TO_XML}, причем одновременно в конструктор
        // конвертора передается текст или файл для обработки.
        //  Конвертер также может вернуть текст или создать файл с результатами
        // конвертации.
        //  Клиент (Runner -main) должен принимать на вход имя файла(json или xml) и
        // создавать его новую версию(xml или json) в том же расположении, что и
        // исходный файл.
        //  Для всех заданий: набор классов POJO можно получить через JAXB

        final String root="src/by/it/meshchenko/";
        final String XML_PATH = "jd02_10/ShoppingCenters.xml";

        System.out.println("A.");
        //TaskA.run();

        System.out.println("B.");
        //TaskB.run(root, XML_PATH);

        System.out.println("C.");
        TaskC.run(root);

    }
}