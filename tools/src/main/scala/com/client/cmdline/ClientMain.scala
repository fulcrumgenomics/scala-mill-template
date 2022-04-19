package com.client.cmdline

import com.fulcrumgenomics.cmdline.FgBioMain

/**
  * Main program that loads everything up and runs the appropriate sub-command
  */
object ClientMain {
  /** The main method */
  def main(args: Array[String]): Unit = new ClientMain().makeItSoAndExit(args)
}

class ClientMain extends FgBioMain {

   /** The name of the toolkit, used in printing usage and status lines. */
  override def name: String = "client-tools"

  /** The packages we wish to include in our command line **/
  override protected def packageList: List[String] =
    List[String]("com.client")
}
