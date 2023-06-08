SUMMARY = "Commands for Scrabble boards"
DESCRIPTION = "This package provides some commands (in English and in French) \
to work with a Scrabble Board : \\ScrabbleBoard and \
\\begin{EnvScrabble} and \\ScrabblePutWord for the English \
version, \\PlateauScrabble and \\begin{EnvScrabble} and \
\\ScrabblePlaceMot for the French version."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.3svn65507"

RPM_NAME = "texlive-scrabble-2023.201.0.0.1.3svn65507-53.1.noarch.rpm"
RPM_HASH = "6092841e259b24d4023fe29fba1b2ba0af894de2a44e221a9cd02e0c228c3e2a56b4f0dd8b30a97a3d3c1ff621a8ef636b4d1484b637cf8970ff7ecfd6bb825d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Scrabble.sty) texlive-scrabble"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(listofitems.sty) tex(pgf.sty) tex(pgffor.sty) tex(simplekv.sty) tex(tikz.sty) tex(xparse.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
