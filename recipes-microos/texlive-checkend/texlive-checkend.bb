SUMMARY = "Extend 'improperly closed environment' messages"
DESCRIPTION = "When an environment is left open, LaTeX gives an error at the \
end of the document. However it only informs about the first of \
them, while the rest are shown with meaningless errors: (\\end \
occurred inside a group at level N) This package replaces these \
errors with more useful messages which show which environments \
(in reverse order) were not closed. There are no user macros: \
just use the package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn51475"

RPM_NAME = "texlive-checkend-2023.201.1.0svn51475-53.1.noarch.rpm"
RPM_HASH = "e2968285b8a90676213b9c21b6a161b3b9fcee3bea9215074b01ab103cce38724ae3b2042786aa01781df09758e41f810ebd8c7026574bae8f95e50ce04de47c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(checkend.sty) texlive-checkend"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
