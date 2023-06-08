SUMMARY = "A comprehensive Bangla LaTeX package"
DESCRIPTION = "This package provides all the necessary LaTeX frontends for the \
Bangla language and comes with some fonts of its own."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn65786"

RPM_NAME = "texlive-bangla-2023.201.2.1svn65786-53.1.noarch.rpm"
RPM_HASH = "68a7f90a4ac7543fc01ed237708021afbed78b21990421d864261e48ccae2caffa4a2f30d5c1da3c7d417ff9c3303ff1925951ab09dd4001ef767e43e6f1436d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bangla.sty) tex(banglamap.tex) texlive-bangla"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(CharisSIL.sty) tex(etoolbox.sty) tex(fontspec.sty) tex(polyglossia.sty) texlive texlive-bangla-fonts texlive-charissil texlive-doulossil texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
