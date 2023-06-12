SUMMARY = "Classes for University of Manchester Dept of Computer Science"
DESCRIPTION = "The bundle provides thesis and project report document classes \
from the University of Manchester's Department of Computer \
Science."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn23861"

RPM_NAME = "texlive-muthesis-2023.201.svn23861-54.1.noarch.rpm"
RPM_HASH = "e4223786a28f9774c495449c2c023eadfcea743bd90ec3f17043eedbb2583872b828a9540806d586c2335ce98274d613f22383b33ac55d982a6ba1d07b21d78e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(muthesis.cls) \
tex(third-rep.cls) \
texlive-muthesis"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(graphicx.sty) \
tex(report.cls) \
tex(setspace.sty) \
tex(verbatim.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
