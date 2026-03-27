
<p>
<a href="https://fulcrumgenomics.com">
<picture>
  <source media="(prefers-color-scheme: dark)" srcset=".github/logos/fulcrumgenomics-dark.svg">
  <source media="(prefers-color-scheme: light)" srcset=".github/logos/fulcrumgenomics-light.svg">
  <img alt="Fulcrum Genomics" src=".github/logos/fulcrumgenomics-light.svg" height="100">
</picture>
</a>
</p>

[Visit us at Fulcrum Genomics](https://www.fulcrumgenomics.com) to learn more about how we can power your Bioinformatics with scala-mill-template and beyond.

<a href="mailto:contact@fulcrumgenomics.com?subject=[GitHub inquiry]"><img src="https://img.shields.io/badge/Email_us-%2338b44a.svg?&style=for-the-badge&logo=gmail&logoColor=white"/></a>
<a href="https://www.fulcrumgenomics.com"><img src="https://img.shields.io/badge/Visit_Us-%2326a8e0.svg?&style=for-the-badge&logo=wordpress&logoColor=white"/></a>

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

