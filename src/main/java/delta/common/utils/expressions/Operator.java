package delta.common.utils.expressions;

import delta.common.utils.types.Type;

/**
 * Interface of an operator.
 * @author DAM
 */
public interface Operator
{
  /**
   * Get the result type.
   * @return the result type.
   */
  public Type getResultType();

  /**
   * Get the number of arguments.
   * @return the number of arguments.
   */
  public int getNumberOfArguments();

  /**
   * Get the type of an argument.
   * @param argIndex Argument index, starting at 0.
   * @return the type of the designated argument.
   */
  public Type getArgumentType(int argIndex);
}
