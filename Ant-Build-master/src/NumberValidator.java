
public class NumberValidator implements Validator<Number> {

    @Override
    public boolean isValid(Number number) {
        if (number.toString().length() >= 3) return true;
        return false;
    }
}
