SUMMARY = "Improve the typesetting of mathematical matrices with PGF"
DESCRIPTION = "This package is based on the package array. It creates PGF/TikZ \
nodes under the cells of the array and uses these nodes to \
provide functionalities to construct tabulars, arrays and \
matrices. Among the features : continuous dotted lines for the \
mathematical matrices; exterior rows and columns (so-called \
border matrices); control of the width of the columns; tools to \
color rows and columns with a good PDF result; blocks of cells; \
etc. The package requires and loads l3keys2e, xparse, array, \
amsmath, pgfcore, and the module shapes of PGF."
LICENSE = "LPPL-1.0"

PV = "2023.201.6.16svn66461"

RPM_NAME = "texlive-nicematrix-2023.201.6.16svn66461-54.1.noarch.rpm"
RPM_HASH = "db03794da2c0f4dc4c7ac27a9107f2067264443ee64bedf21685904d2170d2e10fd111081d39e91a6307ca0b1697224c6f576f83cbdcaa31c870b5c61fed6901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nicematrix.sty) texlive-nicematrix"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(array.sty) tex(footnote.sty) tex(footnotehyper.sty) tex(l3keys2e.sty) tex(pgfcore.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
