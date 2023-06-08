SUMMARY = "Package for typesetting song lyrics and chord books"
DESCRIPTION = "The package provides an all purpose songbook style. Three types \
of output may be created from a single input file: 'words and \
chords' books for the musicians to play from, 'words only' \
songbooks for the congregation to sing from, and overhead \
transparency masters for congregational use. The package will \
also print a table of contents, an index sorted by title and \
first line, and an index sorted by key, or by artist/composer. \
The package attempts to handle songs in multiple keys, as well \
as songs in multiple languages."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.4.5svn18136"

RPM_NAME = "texlive-songbook-2023.201.4.5svn18136-57.1.noarch.rpm"
RPM_HASH = "8ffedeac95b9da55d7cb77a94981429a6220d84ea43fb4d4d58d0212f4b8da4e2672f200c55d3d80a732b523fb920e9ca0acde6695147b3975fc371dbee5359e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(conditionals.sty) tex(songbook.sty) texlive-songbook"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(ifthen.sty) tex(multicol.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
