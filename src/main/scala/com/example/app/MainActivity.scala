package com.example.app

import android.app.Activity
import android.os.Bundle

class MainActivity extends Activity {
  override def onCreate(b: Bundle): Unit = {
    super.onCreate(b)
    setContentView(R.layout.hello);
  }

  def foo = "foo"
}
