package step1.domain;

import java.math.BigDecimal;

/**
 * Operation을 실제로 구현한 사칙연산 구현체
 */
public class OperationImpl {
    public static final Operation ADDITION = Number::add;

    public static final Operation SUBTRACTION = Number::subtract;

    public static final Operation MULTIPLICATION = Number::multiply;

    public static final Operation DIVISION = Number::divide;
}
