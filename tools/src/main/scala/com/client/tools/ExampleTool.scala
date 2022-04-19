package com.client.tools


import com.fulcrumgenomics.sopt.clp
import com.client.cmdline.{ClpGroups, ClientTool}

@clp(group=ClpGroups.All, description=
  """
    |Trivial example tool to make sure build system is working.
  """)
class ExampleTool() extends ClientTool {

  override def execute(): Unit = {
    System.err.println("Hello World!")
  }
}