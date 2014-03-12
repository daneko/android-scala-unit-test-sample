package com.example.app

import org.specs2._

class SimpleLogicSpec extends Specification {
  def is = s2"""

addOneは引数に与えた数値に対して1追加した値を返す ${SimpleLogic.addOne(1) === 2}

                                                        """

}

