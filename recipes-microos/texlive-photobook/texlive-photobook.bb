SUMMARY = "A document class for typesetting photo books"
DESCRIPTION = "The photobook LaTeX document class extends the book class \
defining a set of parameters, meta-macros, macros and \
environments with reasonable defaults to help typeset, build \
and print books mainly based on visual/image content."
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.1.10svn66551"

RPM_NAME = "texlive-photobook-2023.201.0.0.1.10svn66551-51.1.noarch.rpm"
RPM_HASH = "3230b6a793d12f2bbc949324effa6e5195b9bb10c0b1ca99dca8a31630f99e674c07e32d73b598e98a0cd22acc4a0d3531fbf876fc22e61d212969f5d81aab78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(photobook.cls) texlive-photobook"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(adjustbox.sty) tex(atbegshi.sty) tex(book.cls) tex(calc.sty) tex(colorspace.sty) tex(environ.sty) tex(eso-pic.sty) tex(etoolbox.sty) tex(fancyhdr.sty) tex(fancyvrb.sty) tex(graphicx.sty) tex(hyperref.sty) tex(iftex.sty) tex(ifthen.sty) tex(kvoptions.sty) tex(listofitems.sty) tex(numprint.sty) tex(pagecolor.sty) tex(pdfpages.sty) tex(pgffor.sty) tex(rotating.sty) tex(textpos.sty) tex(tikz.sty) tex(trimclip.sty) tex(xargs.sty) tex(xcolor.sty) tex(xint.sty) tex(xinttools.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
