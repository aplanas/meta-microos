SUMMARY = "Horizontal flipping of pages with pdfLaTeX"
DESCRIPTION = "The package allows the production of a document with pages \
'mirrored'. This is sometimes required by publishers who want \
camera-ready documents to be printed on transparent film (to be \
viewed from the 'wrong' side). The package only works with \
pdfLaTeX or LuaLaTeX in PDF output mode. Package everypage is \
required on LaTeX releases before Fall 2020."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn56782"

RPM_NAME = "texlive-flippdf-2023.201.2.0bsvn56782-52.1.noarch.rpm"
RPM_HASH = "28416b78818aa7cb7ed782f77c8b66e08f4e33d409fce8cd58a9a17f18dba7d7fbd6322c09579234665b2e8087df1bcb7966fc7871096f270d255325e18a5058"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(flippdf-1x.sty) tex(flippdf.sty) texlive-flippdf"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(everypage.sty) tex(iftex.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
