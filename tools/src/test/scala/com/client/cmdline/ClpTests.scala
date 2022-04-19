package com.client.cmdline

import com.client.UnitSpec
import com.fulcrumgenomics.commons.util.CaptureSystemStreams

/** Some basic test for the CLP classes. */
class ClpTests extends UnitSpec with CaptureSystemStreams {

  "ClientTool" should "should print hello world" in {
    val (output, _, _) = captureItAll { () =>
      new ClientMain().makeItSo("ExampleTool".split(' ')) shouldBe 0
    }
    output shouldBe "Hello World!\n"
  }
}
