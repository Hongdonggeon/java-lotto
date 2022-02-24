package utils;

public class InputValidator {

    private static final String INPUT_IS_NULL = "입력 값은 널 값일 수 없습니다.";
    private static final String INPUT_IS_EMPTY = "입력 값은 비어있을 수 없습니다.";

<<<<<<< HEAD
    public static void validateNull(String purchaseAmount) {
        if (purchaseAmount == null) {
=======
    public void validateNull(String purchaseAmount){
        if(purchaseAmount == null){
>>>>>>> 1f14e05 (feat: Money 객체 생성)
            throw new NullPointerException(INPUT_IS_NULL);
        }
    }

<<<<<<< HEAD
    public static void validateEmpty(String purchaseAmount) {
=======
    public void validateEmpty(String purchaseAmount) {
>>>>>>> 1f14e05 (feat: Money 객체 생성)
        if (purchaseAmount.isEmpty()) {
            throw new IllegalArgumentException(INPUT_IS_EMPTY);
        }
    }

}