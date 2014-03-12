package com.example.app

import junit.framework.Assert._
import junit.framework.TestCase

class SimpleLogicTest extends TestCase {

  def testAddOne(): Unit = {
    assertEquals(2, SimpleLogic.addOne(1))
  }
}
