package delta.common.utils.types;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test class for the types system.
 * @author DAM
 */
@DisplayName("Types test")
class TestTypes
{
  /**
   * Test the types classes registry.
   */
  @Test
  void testTypeClassesRegistry()
  {
    TypeClassesRegistry registry=TypeClassesRegistry.getInstance();
    assertNotNull(registry);
  }

  /**
   * Test the generic type class retrieval.
   */
  @Test
  void testGetTypeClassByName()
  {
    TypeClassesRegistry registry=TypeClassesRegistry.getInstance();
    TypeClass intType=registry.getTypeClassByName(IntegerType.TYPE_NAME);
    assertNotNull(intType);
  }

  /**
   * Test the generic type retrieval.
   */
  @Test
  void testGetTypeByName()
  {
    TypesRegistry registry=TypesRegistry.getInstance();
    Type positiveIntType=registry.getType(BuiltInTypes.POSITIVE_INTEGER);
    assertNotNull(positiveIntType);
    Type intType=registry.getType(BuiltInTypes.INTEGER);
    assertNotNull(intType);
  }

  /**
   * Test the integer type.
   */
  @Test
  void testIntegerType()
  {
    IntegerType intType=new IntegerType(-4,100);
    Object cinquante=intType.parseFromString("50");
    assertNotNull(cinquante);
    assertTrue(cinquante instanceof Integer);
    Integer integer=(Integer)cinquante;
    assertEquals(50,integer.intValue());

    Object notAnInt=intType.parseFromString("50a");
    assertNull(notAnInt);
  }
}
