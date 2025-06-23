package validator.utils;

import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

import static java.util.List.*;

public class PasswordValidator {

    private static final List<Predicate<String>> RULES = List.of(
            Pattern.compile(".*[A-Z].*").asPredicate(), //Создает регулярное выражение, которое ищет:
            // .* — любые символы (0 или более раз)
            // [A-Z] — хотя бы одну заглавную букву (A-Z)
            // .* — любые символы после
            Pattern.compile(".*[a-z].*").asPredicate(), //[a-z] — минимум одна строчная буква
            Pattern.compile(".*\\d.*").asPredicate(), //\\d — экранированный символ для цифр (аналог [0-9]), .* — обрамляет цифру любыми символами
            Pattern.compile(".*[!?@#].*").asPredicate() //[!?@#] — минимум один из символов: !, ?, @, #
    );

    public boolean isStrong(String password){
        return password != null //Проверяет, что переменная password не равна null. Если пароль не задан (равен null), дальнейшие проверки не выполняются, и функция сразу вернет false.
                && password.length()>=8 //Проверяет, что длина пароля больше 8 символов. Если пароль короче 9 символов, функция вернет false
                && RULES.stream().allMatch(rule-> rule.test(password)); //Здесь предполагается, что RULES — это коллекция (например, список) предикатов (условий), каждое из которых проверяет определенное правило для пароля (например, наличие заглавной буквы, цифры и т.д.).
        //RULES.stream() создает поток из этих правил.
        //.allMatch(rule -> rule.test(password)) проверяет, что все правила выполняются для данного пароля.
        //Если хотя бы одно правило не выполняется, результат будет false.
        //Если все правила выполняются — true.
    }
}
