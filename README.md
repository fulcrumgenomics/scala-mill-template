[![unit tests](https://github.com/fulcrumgenomics/scala-mill-skeleton/actions/workflows/unittests.yaml/badge.svg)](https://github.com/fulcrumgenomics/scala-mill-skeleton/actions/workflows/unittests.yaml)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/fulcrumgenomics/fgbio/blob/main/LICENSE)
[![Language](https://img.shields.io/badge/language-scala-brightgreen.svg)](http://www.scala-lang.org/)


A skeleton repository a Scala-based [fgbio][fgbio-link]-like command-line toolkit.

## Why this repo?

This the starting point for [Fulcrum Genomics][fulcrum-genomics-link] projects that contain Scala-based 
[fgbio][fgbio-link]-like tools.
Using this infrastructure, you can add quickly add your own tools to a stand-alone toolkit:

- add your own tools to `tools/src/main/scala/com/client/tools` (see `ExampleTool.scala` contained therein)

## Building & Testing

This repo uses [mill](https://com-lihaoyi.github.io/mill/mill/Intro_to_Mill.html) as it's build system.

To run unit tests:

```console
./mill _.test
```

To build an executable JAR at `./jars/<FIXME>-tools.jar`:

```console
./mill _.deployLocal
```

To set up this project for IntelliJ, run:

```console
mill mill.scalalib.GenIdea/idea
```


[fgbio-link]: https://github.com/fulcrumgenomics/fgbio
[fulcrum-genomics-link]: https://www.fulcrumgenomics.com

