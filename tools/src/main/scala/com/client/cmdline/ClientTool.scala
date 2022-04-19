package com.client.cmdline

import com.fulcrumgenomics.cmdline.FgBioTool
import com.fulcrumgenomics.commons.util.LazyLogging

/** All tools should extend this. */
trait ClientTool extends FgBioTool with LazyLogging
