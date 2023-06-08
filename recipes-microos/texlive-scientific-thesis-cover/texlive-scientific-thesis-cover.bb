SUMMARY = "Provides cover page and affirmation at the end of a thesis"
DESCRIPTION = "Institutions require a cover page and an affirmation at the end \
of a thesis. This package provides both."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.0.2svn47923"

RPM_NAME = "texlive-scientific-thesis-cover-2023.201.4.0.2svn47923-53.1.noarch.rpm"
RPM_HASH = "351340b8e2f599361d0046dc6fc6bbbba3ab610d555c584b8e686a39cee6b430234ae29b4786839f53588767f673223a085b8ad3a9d10c16f618854326b3cb10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(scientific-thesis-cover.sty) texlive-scientific-thesis-cover"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifthen.sty) tex(kvoptions.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
