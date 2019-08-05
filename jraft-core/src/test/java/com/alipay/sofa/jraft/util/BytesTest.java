package com.alipay.sofa.jraft.util;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class BytesTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: Bytes */
//  // Test written by Diffblue Cover.
//  @PrepareForTest(
//      fullyQualifiedNames = {"com.alipay.sofa.jraft.util.BytesUtil$ByteArrayComparator"},
//      value = BytesUtil.class)
//  @Test
//  public void
//  compareToInputNotNullOutputZero() throws Exception, InvocationTargetException {
//
//    // Arrange
//    final Bytes objectUnderTest = (Bytes)Reflector.getInstance("com.alipay.sofa.jraft.util.Bytes");
//    Reflector.setField(objectUnderTest, "hashCode", 0);
//    Reflector.setField(objectUnderTest, "bytes", null);
//    final Bytes that = (Bytes)Reflector.getInstance("com.alipay.sofa.jraft.util.Bytes");
//    Reflector.setField(that, "hashCode", 0);
//    Reflector.setField(that, "bytes", null);
//    final BytesUtil.LexicographicByteArrayComparator lexicographicByteArrayComparator =
//        PowerMockito.mock(BytesUtil.LexicographicByteArrayComparator.class);
//    final Method compareMethod = DTUMemberMatcher.method(BytesUtil.ByteArrayComparator.class,
//                                                         "compare", Object.class, Object.class);
//    PowerMockito.doReturn(0)
//        .when(lexicographicByteArrayComparator, compareMethod)
//        .withArguments(or(isA(Object.class), isNull(Object.class)),
//                       or(isA(Object.class), isNull(Object.class)));
//    PowerMockito.whenNew(BytesUtil.LexicographicByteArrayComparator.class)
//        .withParameterTypes(BytesUtil$1.class)
//        .withArguments(or(isA(BytesUtil$1.class), isNull(BytesUtil$1.class)))
//        .thenReturn(lexicographicByteArrayComparator);
//
//    // Act
//    final int actual = objectUnderTest.compareTo(that);
//
//    // Assert result
//    Assert.assertEquals(0, actual);
//  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInput0OutputVoid() {
    Assert.assertNull((new Bytes(new byte[0])).get());


  }

  @Test
  public void constructorInput0OutputVoid31234213525() {
    // Arrange
    final byte[] bytes = {};
    // Act, creating object to test constructor
    final Bytes objectUnderTest = new Bytes(bytes);
    // Assert side effects
    Assert.assertArrayEquals(objectUnderTest.get(), new byte[0]);
  }


  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNullOutputFalse() {
    Assert.assertNotEquals(new Bytes(new byte[0]), null);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getOutput0() {
    Assert.assertArrayEquals(new byte[]{}, new Bytes(new byte[0]).get());
  }

//  // Test written by Diffblue Cover.
//  @PrepareForTest({Bytes.class, Arrays.class})
//  @Test
//  public void hashCodeOutputZero() throws Exception, InvocationTargetException {
//
//    // Setup mocks
//    PowerMockito.mockStatic(Arrays.class);
//
//    // Arrange
//    final Bytes objectUnderTest = (Bytes)Reflector.getInstance("com.alipay.sofa.jraft.util.Bytes");
//    Reflector.setField(objectUnderTest, "hashCode", 0);
//    final byte[] myByteArray = {};
//    Reflector.setField(objectUnderTest, "bytes", myByteArray);
//    PowerMockito.when(Arrays.hashCode(or(isA(byte[].class), isNull(byte[].class)))).thenReturn(0);
//
//    // Act
//    final int actual = objectUnderTest.hashCode();
//
//    // Assert result
//    Assert.assertEquals(0, actual);
//  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull() {
    Assert.assertEquals("", (new Bytes(new byte[0])).toString());
  }

  // Test written by Diffblue Cover.

  @Test
  public void toStringOutputNotNull2() {

    // Arrange
    final byte[] myByteArray = {(byte)32};
    final Bytes objectUnderTest = new Bytes(myByteArray);

    // Act
    final String actual = objectUnderTest.toString();

    // Assert result
    Assert.assertEquals(" ", actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void toStringOutputNotNull3() {

    // Arrange
    final byte[] myByteArray = {(byte)127};
    final Bytes objectUnderTest = new Bytes(myByteArray);

    // Act
    final String actual = objectUnderTest.toString();

    // Assert result
    Assert.assertEquals("\\x7F", actual);
  }

//  // Test written by Diffblue Cover.
//  @Test
//  public void wrapInputNullOutputNotNull() {
//
//    // Arrange
//    final byte[] bytes = null;
//
//    // Act
//    final Bytes actual = Bytes.wrap(bytes);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(0, Reflector.getInstanceField(actual, "hashCode"));
//    Assert.assertNull(Reflector.getInstanceField(actual, "bytes"));
//  }
}
