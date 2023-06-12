SUMMARY = "IMTEK thesis class"
DESCRIPTION = "The class permits typesetting of diploma, bachelor's and \
master's theses for the Institute of Microsystem Technology \
(IMTEK) at the University of Freiburg (Germany). The class is \
based on the KOMA-Script class scrbook. Included in the \
documentation is a large collection of useful tips for \
typesetting theses and a list of recommended packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn17667"

RPM_NAME = "texlive-imtekda-2023.201.1.7svn17667-52.1.noarch.rpm"
RPM_HASH = "430afec77799af4c29ded9833a6eda2394504dacc14a7a4c7fda59147818297e2e99bdccf14544a96c8ff27d4993d51737ab12767fed9d123cabbd10ebb54a35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(IMTEKda.cls) \
texlive-imtekda"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(graphicx.sty) \
tex(scrbook.cls) \
tex(textpos.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
